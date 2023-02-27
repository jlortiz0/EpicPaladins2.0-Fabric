package net.veroxuniverse.arclight.client.customarmors.SculkArmor;

import net.minecraft.resources.ResourceLocation;
import net.veroxuniverse.arclight.ArclightMod;
import net.veroxuniverse.arclight.item.MoonlightArmorItem;
import net.veroxuniverse.arclight.item.SculkArmorItem;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class SculkArmorModel extends AnimatedGeoModel<SculkArmorItem> {
    @Override
    public ResourceLocation  getModelResource(SculkArmorItem object) {
        return new ResourceLocation(ArclightMod.MODID, "geo/sculk_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(SculkArmorItem object) {
        return new ResourceLocation(ArclightMod.MODID, "textures/models/armor/sculk_armor_textures.png");
    }

    @Override
    public ResourceLocation getAnimationResource(SculkArmorItem animatable) {
        return null; //return new ResourceLocation(ArclightMod.MODID, "animations/armor_animation.json");
    }

}
