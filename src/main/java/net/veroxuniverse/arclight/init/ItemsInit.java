package net.veroxuniverse.arclight.init;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.veroxuniverse.arclight.ArclightMod;
import net.veroxuniverse.arclight.item.AngelSwordItem;
import net.veroxuniverse.arclight.util.ArclightModCreativeTabs;

public class ItemsInit {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, ArclightMod.MODID);

    public static final RegistryObject<Item> ANGEL_SWORD = ITEMS.register("angel_sword",
            () -> new AngelSwordItem(ItemMaterialsInit.ARCLIGHT, 7, -2.4f,
                    new Item.Properties().tab(ArclightModCreativeTabs.ARCLIGHT_TAB).rarity(Rarity.EPIC)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
