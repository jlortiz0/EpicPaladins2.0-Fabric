package net.veroxuniverse.arclight.client.customarmors.CopperKnight;

import net.minecraft.resources.ResourceLocation;
import net.veroxuniverse.arclight.ArclightMod;
import net.veroxuniverse.arclight.item.CopperArmorItem;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class CopperKnightArmorModel extends AnimatedGeoModel<CopperArmorItem> {
    @Override
    public ResourceLocation  getModelResource(CopperArmorItem object) {
        return new ResourceLocation(ArclightMod.MODID, "geo/copper_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(CopperArmorItem object) {
        return new ResourceLocation(ArclightMod.MODID, "textures/models/armor/copper_armor_textures.png");
    }

    @Override
    public ResourceLocation getAnimationResource(CopperArmorItem animatable) {
        return null; //return new ResourceLocation(ArclightMod.MODID, "animations/armor_animation.json");
    }

}
