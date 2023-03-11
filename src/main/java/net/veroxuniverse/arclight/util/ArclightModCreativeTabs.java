package net.veroxuniverse.arclight.util;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.veroxuniverse.arclight.init.BlocksInit;
import net.veroxuniverse.arclight.init.ItemsInit;
import org.jetbrains.annotations.NotNull;

public class ArclightModCreativeTabs {

    public static final CreativeModeTab RESOURCES_TAB = new CreativeModeTab("arclight_resources") {
        @Override
        public @NotNull ItemStack makeIcon() {
            return new ItemStack(ItemsInit.ARCLIGHT_GEM.get());
        }
    };

    public static final CreativeModeTab BUILDING_TAB = new CreativeModeTab("arclight_building") {
        @Override
        public @NotNull ItemStack makeIcon() {
            return new ItemStack(BlocksInit.ARCLIGHT_BLOCK.get());
        }
    };

    public static final CreativeModeTab ARCLIGHT_TAB = new CreativeModeTab("arclight_group") {
        @Override
        public @NotNull ItemStack makeIcon() {
            return new ItemStack(ItemsInit.ANGEL_SWORD.get());
        }
    };
}

