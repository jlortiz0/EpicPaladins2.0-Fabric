package net.veroxuniverse.arclight.init;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.veroxuniverse.arclight.ArclightMod;
import org.jetbrains.annotations.NotNull;

import java.util.function.Supplier;

public enum ArmorMaterialsInit implements ArmorMaterial {

    ARCLIGHT("arclight", 45, new int[]{6, 10, 13, 6}, 25,
            SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 4.0F, 0.3F,
            () -> Ingredient.ofItems(ItemsInit.ARCLIGHT_INGOT)),

    ANGEL("angel", -1, new int[]{7, 12, 15, 7}, 30,
            SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 7.0F, 0.5F,
            () -> Ingredient.ofItems(ItemsInit.ANGEL_FEATHER)),

    CRYO("cryo", 45, new int[]{6, 10, 13, 6}, 25,
            SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 4.0F, 0.3F,
            () -> Ingredient.ofItems(ItemsInit.CRYORIUM_INGOT)),

    MOONLIGHT("moonlight", 45, new int[]{6, 10, 13, 6}, 25,
            SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 4.0F, 0.3F,
            () -> Ingredient.ofItems(ItemsInit.MOONLIGHT_INGOT)),

    SHADOW("shadow", 45, new int[]{4, 7, 9, 3}, 25,
            SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 4.0F, 0.3F,
            () -> Ingredient.ofItems(ItemsInit.MOONLIGHT_INGOT)),

    JADE("jade", 45, new int[]{6, 10, 13, 6}, 25,
            SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 4.0F, 0.3F,
            () -> Ingredient.ofItems(ItemsInit.JADE_INGOT)),

    SCULK("sculk", 50, new int[]{6, 10, 13, 6}, 25,
            SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 5.0F, 0.3F,
            () -> Ingredient.ofItems(ItemsInit.SCULK_INGOT)),

    SCORPIONSCALE("scorpionscale", 50, new int[]{6, 10, 13, 6}, 25,
            SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 5.0F, 0.3F,
            () -> Ingredient.ofItems(ItemsInit.BLOODSTONE_INGOT)),

    COPPER("copper", 30, new int[]{3, 6, 8, 3}, 25,
            SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 2.0F, 0.2F,
            () -> Ingredient.ofItems(Items.COPPER_INGOT)),

    STEEL("steel", 30, new int[]{3, 6, 8, 3}, 25,
            SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 2.0F, 0.2F,
            () -> Ingredient.ofItems(Items.IRON_INGOT));

    private static final int[] HEALTH_PER_SLOT = new int[]{13, 15, 16, 11};
    private final String name;
    private final int durabilityMultiplier;
    private final int[] slotProtections;
    private final int enchantmentValue;
    private final SoundEvent sound;
    private final float toughness;
    private final float knockbackResistance;
    private final Supplier<Ingredient> repairIngredient;

    ArmorMaterialsInit(String name, int durabilityMultiplier, int[] slotProtections, int enchantmentValue,
                      SoundEvent sound, float toughness, float knockbackResistance, Supplier<Ingredient> repairIngredient) {
        this.name = name;
        this.durabilityMultiplier = durabilityMultiplier;
        this.slotProtections = slotProtections;
        this.enchantmentValue = enchantmentValue;
        this.sound = sound;
        this.toughness = toughness;
        this.knockbackResistance = knockbackResistance;
        this.repairIngredient = repairIngredient;
    }

    public int getDurability(EquipmentSlot pSlot) {
        return HEALTH_PER_SLOT[pSlot.getEntitySlotId()] * this.durabilityMultiplier;
    }

    public int getProtectionAmount(EquipmentSlot pSlot) {
        return this.slotProtections[pSlot.getEntitySlotId()];
    }

    public int getEnchantability() {
        return this.enchantmentValue;
    }

    public @NotNull SoundEvent getEquipSound() {
        return this.sound;
    }

    public @NotNull Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }

    public @NotNull String getName() {
        return ArclightMod.MODID + ":" + this.name;
    }

    public float getToughness() {
        return this.toughness;
    }

    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }
}