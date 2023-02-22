package net.veroxuniverse.arclight.client.customarmors.ArclightArmor;

import net.minecraft.resources.ResourceLocation;
import net.veroxuniverse.arclight.ArclightMod;
import net.veroxuniverse.arclight.item.ArclightArmorItem;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class ArclightArmorModel extends AnimatedGeoModel<ArclightArmorItem> {
    @Override
    public ResourceLocation  getModelResource(ArclightArmorItem object) {
        return new ResourceLocation(ArclightMod.MODID, "geo/arclight_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(ArclightArmorItem object) {
        return new ResourceLocation(ArclightMod.MODID, "textures/models/armor/arclight_armor_textures.png");
    }

    @Override
    public ResourceLocation getAnimationResource(ArclightArmorItem animatable) {
        return null; //return new ResourceLocation(ArclightMod.MODID, "animations/armor_animation.json");
    }

}
