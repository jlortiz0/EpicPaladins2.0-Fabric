package net.veroxuniverse.arclight.client.customarmors.CryoriumArmor;

import net.minecraft.resources.ResourceLocation;
import net.veroxuniverse.arclight.ArclightMod;
import net.veroxuniverse.arclight.item.CryoArmorItem;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class CryoriumArmorModel extends AnimatedGeoModel<CryoArmorItem> {
    @Override
    public ResourceLocation  getModelResource(CryoArmorItem object) {
        return new ResourceLocation(ArclightMod.MODID, "geo/cryorium_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(CryoArmorItem object) {
        return new ResourceLocation(ArclightMod.MODID, "textures/models/armor/cryorium_armor_textures.png");
    }

    @Override
    public ResourceLocation getAnimationResource(CryoArmorItem animatable) {
        return null; //return new ResourceLocation(ArclightMod.MODID, "animations/armor_animation.json");
    }

}
