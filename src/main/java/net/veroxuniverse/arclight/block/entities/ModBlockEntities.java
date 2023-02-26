package net.veroxuniverse.arclight.block.entities;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.veroxuniverse.arclight.ArclightMod;
import net.veroxuniverse.arclight.init.BlocksInit;

public class ModBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, ArclightMod.MODID);

    public static final RegistryObject<BlockEntityType<PedestalBlockEntity>> PEDESTAL_BLOCK_ENTITY =
            BLOCK_ENTITY_TYPES.register("pedestal_block_entity", () ->
                    BlockEntityType.Builder.of(PedestalBlockEntity::new,
                            BlocksInit.PEDESTAL_BLOCK.get()).build(null));

    public static final RegistryObject<BlockEntityType<ArmorForgeBlockEntity>> ARMOR_BLOCK_ENTIY =
            BLOCK_ENTITY_TYPES.register("armor_block_entity", () ->
                    BlockEntityType.Builder.of(ArmorForgeBlockEntity::new,
                            BlocksInit.ARMOR_FORGE.get()).build(null));

    public static void register(IEventBus eventBus) {
        BLOCK_ENTITY_TYPES.register(eventBus);
    }
}
