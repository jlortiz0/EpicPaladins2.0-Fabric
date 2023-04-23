package net.veroxuniverse.arclight.block.entities;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.Inventories;
import net.minecraft.inventory.Inventory;
import net.minecraft.inventory.SimpleInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.screen.NamedScreenHandlerFactory;
import net.minecraft.screen.PropertyDelegate;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.text.LiteralText;
import net.minecraft.text.Text;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.veroxuniverse.arclight.recipe.ArmorForgeRecipe;
import net.veroxuniverse.arclight.recipe.ModRecipes;
import net.veroxuniverse.arclight.screen.ArmorForgeMenu;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class ArmorForgeBlockEntity extends BlockEntity implements NamedScreenHandlerFactory, Inventory {
    private final DefaultedList<ItemStack> itemHandler = DefaultedList.ofSize(4, ItemStack.EMPTY);

    private Optional<DefaultedList<ItemStack>> lazyItemHandler = Optional.empty();

    protected final PropertyDelegate data;
    private int progress = 0;
    private int maxProgress = 900;

    public ArmorForgeBlockEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.ARMOR_BLOCK_ENTIY, pos, state);
        this.data = new PropertyDelegate() {
            @Override
            public int get(int index) {
                return switch (index) {
                    case 0 -> ArmorForgeBlockEntity.this.progress;
                    case 1 -> ArmorForgeBlockEntity.this.maxProgress;
                    default -> 0;
                };
            }

            @Override
                public void set(int index, int value) {
                switch (index) {
                    case 0 -> ArmorForgeBlockEntity.this.progress = value;
                    case 1 -> ArmorForgeBlockEntity.this.maxProgress = value;
                }
            }

            @Override
            public int size() {
                return 2;
            }
        };
    }

    @Override
    public int size() { return itemHandler.size(); }

    @Override
    public boolean isEmpty() { return itemHandler.stream().allMatch(Predicate.isEqual(ItemStack.EMPTY)); }

    @Override
    public ItemStack getStack(int slot) { return itemHandler.size() >= slot || slot < 0 ? ItemStack.EMPTY : itemHandler.get(slot); }

    @Override
    public ItemStack removeStack(int slot, int count) {
        if (slot >= 0 && slot < itemHandler.size()) {
            if (count >= itemHandler.get(slot).getCount()) {
                itemHandler.set(slot, ItemStack.EMPTY);
                return ItemStack.EMPTY;
            }
            itemHandler.get(slot).decrement(count);
            return itemHandler.get(slot);
        }
        return ItemStack.EMPTY;
    }

    @Override
    public ItemStack removeStack(int slot) {
        if (slot >= 0 && slot < itemHandler.size())
            itemHandler.set(slot, ItemStack.EMPTY);
        return ItemStack.EMPTY;
    }

    @Override
    public void setStack(int slot, ItemStack stack) {
        if (slot >= 0 && slot < itemHandler.size())
            itemHandler.set(slot, stack);
    }

    @Override
    public boolean canPlayerUse(PlayerEntity player) {
        return true;
    }

    @Override
    public void clear() { itemHandler.replaceAll((s) -> ItemStack.EMPTY); }

    @Override
    public @NotNull Text getDisplayName() {
        return new LiteralText("Paladin Forge");
    }

    @Nullable
    @Override
    public ScreenHandler createMenu(int id, @NotNull PlayerInventory inventory, @NotNull PlayerEntity player) {
        return new ArmorForgeMenu(id, inventory, this, this.data);
    }

    @Override
    protected void writeNbt(NbtCompound nbt) {
        super.writeNbt(nbt);
        Inventories.writeNbt(nbt, this.itemHandler);
        nbt.putInt("armor_forge.progress", this.progress);
    }

    @Override
    public void readNbt(@NotNull NbtCompound nbt) {
        super.readNbt(nbt);
        Inventories.readNbt(nbt, this.itemHandler);
        this.progress = nbt.getInt("armor_forge.progress");
    }

    public void drops(){
        if (this.world == null) return;
        for (int i = 0; i < itemHandler.size(); i++) {
            Block.dropStack(this.world, this.pos, itemHandler.get(i));
        }
    }

    public static void tick(World level, BlockPos pos, BlockState state, ArmorForgeBlockEntity pEntity) {
        if (level.isClient) {
            return;
        }

        if (hasRecipe(pEntity)) {
            pEntity.progress++;
            markDirty(level, pos, state);

            if (pEntity.progress >= pEntity.maxProgress) {
                craftItem(pEntity);
            }
        } else {
            pEntity.resetProgress();
            markDirty(level,pos, state);
        }

    }

    private void resetProgress() {
        this.progress = 0;
    }

    private static void craftItem(ArmorForgeBlockEntity pEntity) {

        World level = pEntity.world;

        if (level != null) {
            Optional<ArmorForgeRecipe> recipe = level.getRecipeManager()
                    .getFirstMatch(ModRecipes.ARMOR_FORGE_TYPE, pEntity, level);

            if (hasRecipe(pEntity) && recipe.isPresent()) {
                pEntity.itemHandler.get(0).decrement(1);
                pEntity.itemHandler.get(1).decrement(1);
                pEntity.itemHandler.get(2).decrement(1);
                pEntity.itemHandler.set(3, new ItemStack(recipe.get().getOutput().getItem(),
                        pEntity.itemHandler.get(3).getCount() + 1));

                pEntity.resetProgress();
            }
        }
    }

    private static boolean hasRecipe(ArmorForgeBlockEntity pEntity) {
        World level = pEntity.world;

        if (level != null) {
            Optional<ArmorForgeRecipe> recipe = level.getRecipeManager()
                    .getFirstMatch(ModRecipes.ARMOR_FORGE_TYPE, pEntity, level);

            return recipe.isPresent() && canInsertAmountIntoOutputSlot(pEntity) &&
                    canInsertIntoOutputSlot(pEntity, recipe.get().getOutput());
        }
        return false;
    }

    private static boolean canInsertIntoOutputSlot(Inventory inventory, ItemStack stack) {
        return inventory.getStack(3).getItem() == stack.getItem() || inventory.getStack(3).isEmpty();
    }

    private static boolean canInsertAmountIntoOutputSlot(Inventory inventory) {
        return inventory.getStack(3).getMaxCount() > inventory.getStack(3).getCount();
    }

    public void getSlots(Consumer<Inventory> c) {
        SimpleInventory inv = new SimpleInventory(itemHandler.size());
        for (int i = 0; i < itemHandler.size(); i++) {
            inv.setStack(i, itemHandler.get(i));
        }
        c.accept(inv);
    }
}
