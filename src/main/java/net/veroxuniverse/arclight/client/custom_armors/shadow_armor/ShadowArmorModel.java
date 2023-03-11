package net.veroxuniverse.arclight.client.custom_armors.shadow_armor;

import net.minecraft.resources.ResourceLocation;
import net.veroxuniverse.arclight.ArclightMod;
import net.veroxuniverse.arclight.item.ShadowArmorItem;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class ShadowArmorModel extends AnimatedGeoModel<ShadowArmorItem> {
    @Override
    public ResourceLocation  getModelResource(ShadowArmorItem object) {
        return new ResourceLocation(ArclightMod.MODID, "geo/shadow_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(ShadowArmorItem object) {
        return new ResourceLocation(ArclightMod.MODID, "textures/models/armor/shadow_armor_textures.png");
    }

    @Override
    public ResourceLocation getAnimationResource(ShadowArmorItem animatable) {
        return null; //return new ResourceLocation(ArclightMod.MODID, "animations/armor_animation.json");
    }

}
