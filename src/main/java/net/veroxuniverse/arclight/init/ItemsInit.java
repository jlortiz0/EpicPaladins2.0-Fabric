package net.veroxuniverse.arclight.init;

import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
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

    //Cores

    public static final RegistryObject<Item> ARCLIGHT_CORE = ITEMS.register("arclight_core",
            () -> new Item(new Item.Properties().tab(ArclightModCreativeTabs.RESOURCES_TAB).rarity(Rarity.RARE)));
    public static final RegistryObject<Item> MOONLIGHT_CORE = ITEMS.register("moonlight_core",
            () -> new Item(new Item.Properties().tab(ArclightModCreativeTabs.RESOURCES_TAB).rarity(Rarity.RARE)));
    public static final RegistryObject<Item> SCORPION_CORE = ITEMS.register("scorpion_core",
            () -> new Item(new Item.Properties().tab(ArclightModCreativeTabs.RESOURCES_TAB).rarity(Rarity.RARE)));
    public static final RegistryObject<Item> CRYORIUM_CORE = ITEMS.register("cryorium_core",
            () -> new Item(new Item.Properties().tab(ArclightModCreativeTabs.RESOURCES_TAB).rarity(Rarity.RARE)));
    public static final RegistryObject<Item> JADE_CORE = ITEMS.register("jade_core",
            () -> new Item(new Item.Properties().tab(ArclightModCreativeTabs.RESOURCES_TAB).rarity(Rarity.RARE)));
    public static final RegistryObject<Item> SCULK_CORE = ITEMS.register("sculk_core",
            () -> new Item(new Item.Properties().tab(ArclightModCreativeTabs.RESOURCES_TAB).rarity(Rarity.RARE)));


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
   /*

   public static final RegistryObject<Item> MOONLIGHT_JELLYBALL = ITEMS.register("moonlight_jellyball",
            () -> new Item(new Item.Properties().tab(ArclightModCreativeTabs.RESOURCES_TAB)));
    public static final RegistryObject<Item> MOONLIGHT_CRYSTALIZED = ITEMS.register("moonlight_crystalized",
            () -> new Item(new Item.Properties().tab(ArclightModCreativeTabs.RESOURCES_TAB)));

    */
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
    public static final RegistryObject<Item> SCULK_INGOT = ITEMS.register("sculk_ingot",
            () -> new Item(new Item.Properties().tab(ArclightModCreativeTabs.RESOURCES_TAB)));
    public static final RegistryObject<Item> SCORPION_SCALE = ITEMS.register("scorpion_scale",
            () -> new Item(new Item.Properties().tab(ArclightModCreativeTabs.RESOURCES_TAB)));
    public static final RegistryObject<Item> ANGEL_FEATHER = ITEMS.register("angel_feather",
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

    //Tools

    public static final RegistryObject<Item> ARCLIGHT_SWORD = ITEMS.register("arclight_sword",
            () -> new SwordItem(ItemMaterialsInit.ARCLIGHT,2,-2.4f, new Item.Properties().tab(ArclightModCreativeTabs.ARCLIGHT_TAB)));
    public static final RegistryObject<Item> ARCLIGHT_PICKAXE = ITEMS.register("arclight_pickaxe",
            () -> new PickaxeItem(ItemMaterialsInit.ARCLIGHT,0,-2.8f, new Item.Properties().tab(ArclightModCreativeTabs.ARCLIGHT_TAB)));
    public static final RegistryObject<Item> ARCLIGHT_AXE = ITEMS.register("arclight_axe",
            () -> new AxeItem(ItemMaterialsInit.ARCLIGHT,4,-3f, new Item.Properties().tab(ArclightModCreativeTabs.ARCLIGHT_TAB)));
    public static final RegistryObject<Item> ARCLIGHT_SHOVEL = ITEMS.register("arclight_shovel",
            () -> new ShovelItem(ItemMaterialsInit.ARCLIGHT,0,-3f, new Item.Properties().tab(ArclightModCreativeTabs.ARCLIGHT_TAB)));
    public static final RegistryObject<Item> ARCLIGHT_HOE = ITEMS.register("arclight_hoe",
            () -> new HoeItem(ItemMaterialsInit.ARCLIGHT,-4,0f, new Item.Properties().tab(ArclightModCreativeTabs.ARCLIGHT_TAB)));

    public static final RegistryObject<Item> JADE_SWORD = ITEMS.register("jade_sword",
            () -> new SwordItem(ItemMaterialsInit.JADE,3,-2.4f, new Item.Properties().tab(ArclightModCreativeTabs.ARCLIGHT_TAB)));
    public static final RegistryObject<Item> JADE_PICKAXE = ITEMS.register("jade_pickaxe",
            () -> new PickaxeItem(ItemMaterialsInit.JADE,1,-2.8f, new Item.Properties().tab(ArclightModCreativeTabs.ARCLIGHT_TAB)));
    public static final RegistryObject<Item> JADE_AXE = ITEMS.register("jade_axe",
            () -> new AxeItem(ItemMaterialsInit.JADE,5,-3f, new Item.Properties().tab(ArclightModCreativeTabs.ARCLIGHT_TAB)));
    public static final RegistryObject<Item> JADE_SHOVEL = ITEMS.register("jade_shovel",
            () -> new ShovelItem(ItemMaterialsInit.JADE,1,-3f, new Item.Properties().tab(ArclightModCreativeTabs.ARCLIGHT_TAB)));
    public static final RegistryObject<Item> JADE_HOE = ITEMS.register("jade_hoe",
            () -> new HoeItem(ItemMaterialsInit.JADE,-4,0f, new Item.Properties().tab(ArclightModCreativeTabs.ARCLIGHT_TAB)));

    public static final RegistryObject<Item> MOONLIGHT_SWORD = ITEMS.register("moonlight_sword",
            () -> new SwordItem(ItemMaterialsInit.MOONLIGHT,3,-2.4f, new Item.Properties().tab(ArclightModCreativeTabs.ARCLIGHT_TAB)));
    public static final RegistryObject<Item> MOONLIGHT_PICKAXE = ITEMS.register("moonlight_pickaxe",
            () -> new PickaxeItem(ItemMaterialsInit.MOONLIGHT,1,-2.8f, new Item.Properties().tab(ArclightModCreativeTabs.ARCLIGHT_TAB)));
    public static final RegistryObject<Item> MOONLIGHT_AXE = ITEMS.register("moonlight_axe",
            () -> new AxeItem(ItemMaterialsInit.MOONLIGHT,5,-3f, new Item.Properties().tab(ArclightModCreativeTabs.ARCLIGHT_TAB)));
    public static final RegistryObject<Item> MOONLIGHT_SHOVEL = ITEMS.register("moonlight_shovel",
            () -> new ShovelItem(ItemMaterialsInit.MOONLIGHT,1,-2.8f, new Item.Properties().tab(ArclightModCreativeTabs.ARCLIGHT_TAB)));
    public static final RegistryObject<Item> MOONLIGHT_HOE = ITEMS.register("moonlight_hoe",
            () -> new HoeItem(ItemMaterialsInit.MOONLIGHT,-3,0f, new Item.Properties().tab(ArclightModCreativeTabs.ARCLIGHT_TAB)));

    public static final RegistryObject<Item> BLOODSTONE_SWORD = ITEMS.register("bloodstone_sword",
            () -> new SwordItem(ItemMaterialsInit.BLOODSTONE,2,-2.4f, new Item.Properties().tab(ArclightModCreativeTabs.ARCLIGHT_TAB)));
    public static final RegistryObject<Item> BLOODSTONE_PICKAXE = ITEMS.register("bloodstone_pickaxe",
            () -> new PickaxeItem(ItemMaterialsInit.BLOODSTONE,0,-2.8f, new Item.Properties().tab(ArclightModCreativeTabs.ARCLIGHT_TAB)));
    public static final RegistryObject<Item> BLOODSTONE_AXE = ITEMS.register("bloodstone_axe",
            () -> new AxeItem(ItemMaterialsInit.BLOODSTONE,1,-3f, new Item.Properties().tab(ArclightModCreativeTabs.ARCLIGHT_TAB)));
    public static final RegistryObject<Item> BLOODSTONE_SHOVEL = ITEMS.register("bloodstone_shovel",
            () -> new ShovelItem(ItemMaterialsInit.BLOODSTONE,0,-3f, new Item.Properties().tab(ArclightModCreativeTabs.ARCLIGHT_TAB)));
    public static final RegistryObject<Item> BLOODSTONE_HOE = ITEMS.register("bloodstone_hoe",
            () -> new HoeItem(ItemMaterialsInit.BLOODSTONE,-4,0f, new Item.Properties().tab(ArclightModCreativeTabs.ARCLIGHT_TAB)));

    //Blocks

    public static final RegistryObject<Item> PEDESTAL_BLOCK_ITEM = ITEMS.register("pedestal_block",
            () -> new PedestalBlockItem(BlocksInit.PEDESTAL_BLOCK.get(),
                    new Item.Properties().tab(ArclightModCreativeTabs.BUILDING_TAB)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
