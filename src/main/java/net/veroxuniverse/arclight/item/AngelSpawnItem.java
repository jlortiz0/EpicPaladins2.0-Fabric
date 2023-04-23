package net.veroxuniverse.arclight.item;

import net.minecraft.block.Block;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.text.LiteralText;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Formatting;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.veroxuniverse.arclight.entity.EntityTypes;
import net.veroxuniverse.arclight.entity.custom.AngelEntity;
import net.veroxuniverse.arclight.init.BlocksInit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class AngelSpawnItem extends Item {
    public AngelSpawnItem(Item.Settings pProperties) {
        super(pProperties);
    }

    @Override
    public @NotNull ActionResult useOnBlock(ItemUsageContext pContext) {
        Block blockBelow = null;
        if (!pContext.getWorld().isClient) {
            BlockPos positionClicked = pContext.getBlockPos();

            for (int i = 0; i <= positionClicked.getY() + 2; i++) {
                blockBelow = pContext.getWorld().getBlockState(positionClicked.down(i)).getBlock();

                if (isValuableBlock(blockBelow)) {
                    World level = pContext.getWorld();
                    AngelEntity spawnAngel = EntityTypes.ANGEL.create(level);
                    if (spawnAngel != null) {
                        spawnAngel.setPos(positionClicked.getX(), positionClicked.getY() + 15, positionClicked.getZ());
                        level.spawnEntity(spawnAngel);
                    }
                    break;
                }
            }
        }

        if (isValuableBlock(blockBelow) && pContext.getPlayer() != null) {
            pContext.getStack().damage(1, pContext.getPlayer(),
                    (player) -> player.sendToolBreakStatus(player.getActiveHand()));
        }

        return super.useOnBlock(pContext);
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        if(Screen.hasShiftDown()) {
            tooltip.add(new LiteralText("Right click on Deepslate Pedestal to summon the Boss!").formatted(Formatting.DARK_PURPLE));
        } else {
            tooltip.add(new LiteralText("Press SHIFT for more info").formatted(Formatting.DARK_GRAY));
        }

        super.appendTooltip(stack, world, tooltip, context);
    }

    private boolean isValuableBlock(Block block) {
        return block == BlocksInit.PEDESTAL_BLOCK;
    }
}