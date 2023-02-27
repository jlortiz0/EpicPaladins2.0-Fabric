package net.veroxuniverse.arclight.init;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.LazyLoadedValue;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.veroxuniverse.arclight.ArclightMod;

import java.util.function.Supplier;

public enum ArmorMaterialsInit implements ArmorMaterial {

    ARCLIGHT("arclight", 45, new int[]{6, 10, 13, 6}, 25,
            SoundEvents.ARMOR_EQUIP_NETHERITE, 4.0F, 0.3F,
            () -> {return Ingredient.of(ItemsInit.ARCLIGHT_INGOT.get());
            }),

    ANGEL("angel", -1, new int[]{9, 15, 20, 9}, 30,
            SoundEvents.ARMOR_EQUIP_NETHERITE, 7.0F, 0.5F,
            () -> {return Ingredient.of(ItemsInit.ARCLIGHT_INGOT.get());
            }),

    CRYO("cryo", 45, new int[]{6, 10, 13, 6}, 25,
            SoundEvents.ARMOR_EQUIP_NETHERITE, 4.0F, 0.3F,
            () -> {return Ingredient.of(ItemsInit.CRYORIUM_INGOT.get());
            }),

    MOONLIGHT("moonlight", 45, new int[]{6, 10, 13, 6}, 25,
            SoundEvents.ARMOR_EQUIP_NETHERITE, 4.0F, 0.3F,
            () -> {return Ingredient.of(ItemsInit.MOONLIGHT_INGOT.get());
            }),

    JADE("jade", 45, new int[]{6, 10, 13, 6}, 25,
            SoundEvents.ARMOR_EQUIP_NETHERITE, 4.0F, 0.3F,
            () -> {return Ingredient.of(ItemsInit.JADE_INGOT.get());
            }),

    SCULK("sculk", 50, new int[]{6, 10, 13, 6}, 25,
            SoundEvents.ARMOR_EQUIP_NETHERITE, 5.0F, 0.3F,
            () -> {return Ingredient.of(ItemsInit.SCULK_INGOT.get());
            }),

    SCORPIONSCALE("scorpionscale", 50, new int[]{6, 10, 13, 6}, 25,
            SoundEvents.ARMOR_EQUIP_NETHERITE, 5.0F, 0.3F,
            () -> {return Ingredient.of(ItemsInit.BLOODSTONE_INGOT.get());
            }),

    COPPER("copper", 30, new int[]{3, 6, 8, 3}, 25,
            SoundEvents.ARMOR_EQUIP_NETHERITE, 2.0F, 0.2F,
            () -> {return Ingredient.of(Items.COPPER_INGOT);
            });

    private static final int[] HEALTH_PER_SLOT = new int[]{13, 15, 16, 11};
    private final String name;
    private final int durabilityMultiplier;
    private final int[] slotProtections;
    private final int enchantmentValue;
    private final SoundEvent sound;
    private final float toughness;
    private final float knockbackResistance;
    private final LazyLoadedValue<Ingredient> repairIngredient;

    ArmorMaterialsInit(String p_40474_, int p_40475_, int[] p_40476_, int p_40477_,
                      SoundEvent p_40478_, float p_40479_, float p_40480_, Supplier<Ingredient> p_40481_) {
        this.name = p_40474_;
        this.durabilityMultiplier = p_40475_;
        this.slotProtections = p_40476_;
        this.enchantmentValue = p_40477_;
        this.sound = p_40478_;
        this.toughness = p_40479_;
        this.knockbackResistance = p_40480_;
        this.repairIngredient = new LazyLoadedValue<>(p_40481_);
    }

    public int getDurabilityForSlot(EquipmentSlot pSlot) {
        return HEALTH_PER_SLOT[pSlot.getIndex()] * this.durabilityMultiplier;
    }

    public int getDefenseForSlot(EquipmentSlot pSlot) {
        return this.slotProtections[pSlot.getIndex()];
    }

    public int getEnchantmentValue() {
        return this.enchantmentValue;
    }

    public SoundEvent getEquipSound() {
        return this.sound;
    }

    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }

    public String getName() {
        return ArclightMod.MODID + ":" + this.name;
    }

    public float getToughness() {
        return this.toughness;
    }

    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }
}