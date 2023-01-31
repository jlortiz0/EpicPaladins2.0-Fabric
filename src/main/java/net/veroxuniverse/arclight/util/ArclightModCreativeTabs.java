package net.veroxuniverse.arclight.util;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;

public class ArclightModCreativeTabs {

    public static final CreativeModeTab RESOURCES_TAB = new CreativeModeTab("arclight_resources") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(Items.IRON_INGOT);
        }
    };

    public static final CreativeModeTab BUILDING_TAB = new CreativeModeTab("arclight_building") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(Items.IRON_INGOT);
        }
    };

    public static final CreativeModeTab MOB_TAB = new CreativeModeTab("arclight_mobs") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(Items.IRON_INGOT);
        }
    };

    public static final CreativeModeTab ARCLIGHT_TAB = new CreativeModeTab("arclight_group") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(Items.IRON_INGOT);
        }
    };
}

