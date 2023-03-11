package net.veroxuniverse.arclight.client.custom_armors.jade_armor;

import net.minecraft.resources.ResourceLocation;
import net.veroxuniverse.arclight.ArclightMod;
import net.veroxuniverse.arclight.item.JadeArmorItem;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class JadeArmorModel extends AnimatedGeoModel<JadeArmorItem> {
    @Override
    public ResourceLocation  getModelResource(JadeArmorItem object) {
        return new ResourceLocation(ArclightMod.MODID, "geo/jade_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(JadeArmorItem object) {
        return new ResourceLocation(ArclightMod.MODID, "textures/models/armor/jade_armor_textures.png");
    }

    @Override
    public ResourceLocation getAnimationResource(JadeArmorItem animatable) {
        return null; //return new ResourceLocation(ArclightMod.MODID, "animations/armor_animation.json");
    }

}
