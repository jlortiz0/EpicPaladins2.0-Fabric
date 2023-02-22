package net.veroxuniverse.arclight.init;

import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.veroxuniverse.arclight.ArclightMod;
import net.veroxuniverse.arclight.item.*;
import net.veroxuniverse.arclight.util.ArclightModCreativeTabs;

public class ItemsInit {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, ArclightMod.MODID);

    //3DItems

    public static final RegistryObject<Item> ANGEL_SWORD = ITEMS.register("angel_sword",
            () -> new AngelSwordItem(ItemMaterialsInit.ARCLIGHT, 7, -2.4f,
                    new Item.Properties().tab(ArclightModCreativeTabs.ARCLIGHT_TAB).rarity(Rarity.EPIC)));
    public static final RegistryObject<Item> MOONLIGHT_GLAIVE = ITEMS.register("moonlight_glaive",
            () -> new MoonlightGlaiveItem(ItemMaterialsInit.MOONLIGHT, 6, -3.0f,
                    new Item.Properties().tab(ArclightModCreativeTabs.ARCLIGHT_TAB).rarity(Rarity.EPIC)));


    //Resources

    public static final RegistryObject<Item> ARCLIGHT_GEM = ITEMS.register("arclight_gem",
            () -> new Item(new Item.Properties().tab(ArclightModCreativeTabs.RESOURCES_TAB)));
    public static final RegistryObject<Item> ARCLIGHT_INGOT = ITEMS.register("arclight_ingot",
            () -> new Item(new Item.Properties().tab(ArclightModCreativeTabs.RESOURCES_TAB)));
    public static final RegistryObject<Item> JADE_GEM = ITEMS.register("jade_gem",
            () -> new Item(new Item.Properties().tab(ArclightModCreativeTabs.RESOURCES_TAB)));
    public static final RegistryObject<Item> JADE_INGOT = ITEMS.register("jade_ingot",
            () -> new Item(new Item.Properties().tab(ArclightModCreativeTabs.RESOURCES_TAB)));
    public static final RegistryObject<Item> MOONLIGHT_CRYSTAL = ITEMS.register("moonlight_crystal",
            () -> new Item(new Item.Properties().tab(ArclightModCreativeTabs.RESOURCES_TAB)));
    public static final RegistryObject<Item> MOONLIGHT_INGOT = ITEMS.register("moonlight_ingot",
            () -> new Item(new Item.Properties().tab(ArclightModCreativeTabs.RESOURCES_TAB)));
    public static final RegistryObject<Item> MOONLIGHT_JELLYBALL = ITEMS.register("moonlight_jellyball",
            () -> new Item(new Item.Properties().tab(ArclightModCreativeTabs.RESOURCES_TAB)));
    public static final RegistryObject<Item> MOONLIGHT_CRYSTALIZED = ITEMS.register("moonlight_crystalized",
            () -> new Item(new Item.Properties().tab(ArclightModCreativeTabs.RESOURCES_TAB)));
    public static final RegistryObject<Item> BLOODSTONE_GEM = ITEMS.register("bloodstone_gem",
            () -> new Item(new Item.Properties().tab(ArclightModCreativeTabs.RESOURCES_TAB)));
    public static final RegistryObject<Item> BLOODSTONE_INGOT = ITEMS.register("bloodstone_ingot",
            () -> new Item(new Item.Properties().tab(ArclightModCreativeTabs.RESOURCES_TAB)));
    public static final RegistryObject<Item> CRYORIUM_GEM = ITEMS.register("cryorium_gem",
            () -> new Item(new Item.Properties().tab(ArclightModCreativeTabs.RESOURCES_TAB)));
    public static final RegistryObject<Item> CRYORIUM_INGOT = ITEMS.register("cryorium_ingot",
            () -> new Item(new Item.Properties().tab(ArclightModCreativeTabs.RESOURCES_TAB)));
    public static final RegistryObject<Item> HEART = ITEMS.register("heart",
            () -> new Item(new Item.Properties().tab(ArclightModCreativeTabs.RESOURCES_TAB)));
    public static final RegistryObject<Item> SCORPION_SCALE = ITEMS.register("scorpion_scale",
            () -> new Item(new Item.Properties().tab(ArclightModCreativeTabs.RESOURCES_TAB)));

    //Armor

    public static final RegistryObject<Item> ARCLIGHTS_HELMET = ITEMS.register("arclight_helmet",
            () -> new ArclightArmorItem(ArmorMaterialsInit.ARCLIGHT, EquipmentSlot.HEAD, new Item.Properties().tab(ArclightModCreativeTabs.ARCLIGHT_TAB)));
    public static final RegistryObject<Item> ARCLIGHTS_CHESTLATE = ITEMS.register("arclight_chestplate",
            () -> new ArclightArmorItem(ArmorMaterialsInit.ARCLIGHT, EquipmentSlot.CHEST, new Item.Properties().tab(ArclightModCreativeTabs.ARCLIGHT_TAB)));
    public static final RegistryObject<Item> ARCLIGHTS_LEGGINGS = ITEMS.register("arclight_leggings",
            () -> new ArclightArmorItem(ArmorMaterialsInit.ARCLIGHT, EquipmentSlot.LEGS, new Item.Properties().tab(ArclightModCreativeTabs.ARCLIGHT_TAB)));
    public static final RegistryObject<Item> ARCLIGHTS_BOOTS = ITEMS.register("arclight_boots",
            () -> new ArclightArmorItem(ArmorMaterialsInit.ARCLIGHT, EquipmentSlot.FEET, new Item.Properties().tab(ArclightModCreativeTabs.ARCLIGHT_TAB)));
    public static final RegistryObject<Item> MOONLIGHT_HELMET = ITEMS.register("moonlight_helmet",
            () -> new MoonlightArmorItem(ArmorMaterialsInit.MOONLIGHT, EquipmentSlot.HEAD, new Item.Properties().tab(ArclightModCreativeTabs.ARCLIGHT_TAB)));
    public static final RegistryObject<Item> MOONLIGHT_CHESTLATE = ITEMS.register("moonlight_chestplate",
            () -> new MoonlightArmorItem(ArmorMaterialsInit.MOONLIGHT, EquipmentSlot.CHEST, new Item.Properties().tab(ArclightModCreativeTabs.ARCLIGHT_TAB)));
    public static final RegistryObject<Item> MOONLIGHT_LEGGINGS = ITEMS.register("moonlight_leggings",
            () -> new MoonlightArmorItem(ArmorMaterialsInit.MOONLIGHT, EquipmentSlot.LEGS, new Item.Properties().tab(ArclightModCreativeTabs.ARCLIGHT_TAB)));
    public static final RegistryObject<Item> MOONLIGHT_BOOTS = ITEMS.register("moonlight_boots",
            () -> new MoonlightArmorItem(ArmorMaterialsInit.MOONLIGHT, EquipmentSlot.FEET, new Item.Properties().tab(ArclightModCreativeTabs.ARCLIGHT_TAB)));
    public static final RegistryObject<Item> SCORPION_HELMET = ITEMS.register("scorpion_helmet",
            () -> new ScorpionArmorItem(ArmorMaterialsInit.SCORPIONSCALE, EquipmentSlot.HEAD, new Item.Properties().tab(ArclightModCreativeTabs.ARCLIGHT_TAB)));
    public static final RegistryObject<Item> SCORPION_CHESTPLATE = ITEMS.register("scorpion_chestplate",
            () -> new ScorpionArmorItem(ArmorMaterialsInit.SCORPIONSCALE, EquipmentSlot.CHEST, new Item.Properties().tab(ArclightModCreativeTabs.ARCLIGHT_TAB)));
    public static final RegistryObject<Item> SCORPION_LEGGINGS = ITEMS.register("scorpion_leggings",
            () -> new ScorpionArmorItem(ArmorMaterialsInit.SCORPIONSCALE, EquipmentSlot.LEGS, new Item.Properties().tab(ArclightModCreativeTabs.ARCLIGHT_TAB)));
    public static final RegistryObject<Item> SCORPION_BOOTS = ITEMS.register("scorpion_boots",
            () -> new ScorpionArmorItem(ArmorMaterialsInit.SCORPIONSCALE, EquipmentSlot.FEET, new Item.Properties().tab(ArclightModCreativeTabs.ARCLIGHT_TAB)));
    public static final RegistryObject<Item> CRYO_HELMET = ITEMS.register("cryo_helmet",
            () -> new CryoArmorItem(ArmorMaterialsInit.CRYO, EquipmentSlot.HEAD, new Item.Properties().tab(ArclightModCreativeTabs.ARCLIGHT_TAB)));
    public static final RegistryObject<Item> CRYO_CHESTPLATE = ITEMS.register("cryo_chestplate",
            () -> new CryoArmorItem(ArmorMaterialsInit.CRYO, EquipmentSlot.CHEST, new Item.Properties().tab(ArclightModCreativeTabs.ARCLIGHT_TAB)));
    public static final RegistryObject<Item> CRYO_LEGGINGS = ITEMS.register("cryo_leggings",
            () -> new CryoArmorItem(ArmorMaterialsInit.CRYO, EquipmentSlot.LEGS, new Item.Properties().tab(ArclightModCreativeTabs.ARCLIGHT_TAB)));
    public static final RegistryObject<Item> CRYO_BOOTS = ITEMS.register("cryo_boots",
            () -> new CryoArmorItem(ArmorMaterialsInit.CRYO, EquipmentSlot.FEET, new Item.Properties().tab(ArclightModCreativeTabs.ARCLIGHT_TAB)));
    public static final RegistryObject<Item> COPPERKNIGHT_HELMET = ITEMS.register("copperknight_helmet",
            () -> new CopperArmorItem(ArmorMaterialsInit.COPPER, EquipmentSlot.HEAD, new Item.Properties().tab(ArclightModCreativeTabs.ARCLIGHT_TAB)));
    public static final RegistryObject<Item> COPPERKNIGHT_CHESTLATE = ITEMS.register("copperknight_chestplate",
            () -> new CopperArmorItem(ArmorMaterialsInit.COPPER, EquipmentSlot.CHEST, new Item.Properties().tab(ArclightModCreativeTabs.ARCLIGHT_TAB)));
    public static final RegistryObject<Item> COPPERKNIGHT_LEGGINGS = ITEMS.register("copperknight_leggings",
            () -> new CopperArmorItem(ArmorMaterialsInit.COPPER, EquipmentSlot.LEGS, new Item.Properties().tab(ArclightModCreativeTabs.ARCLIGHT_TAB)));
    public static final RegistryObject<Item> COPPERKNIGHT_BOOTS = ITEMS.register("copperknight_boots",
            () -> new CopperArmorItem(ArmorMaterialsInit.COPPER, EquipmentSlot.FEET, new Item.Properties().tab(ArclightModCreativeTabs.ARCLIGHT_TAB)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
