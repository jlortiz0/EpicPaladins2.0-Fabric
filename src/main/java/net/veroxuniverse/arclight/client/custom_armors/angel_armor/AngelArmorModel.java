package net.veroxuniverse.arclight.client.custom_armors.angel_armor;

import net.minecraft.resources.ResourceLocation;
import net.veroxuniverse.arclight.ArclightMod;
import net.veroxuniverse.arclight.item.AngelWingItem;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class AngelArmorModel extends AnimatedGeoModel<AngelWingItem> {
    @Override
    public ResourceLocation  getModelResource(AngelWingItem object) {
        return new ResourceLocation(ArclightMod.MODID, "geo/angel_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(AngelWingItem object) {
        return new ResourceLocation(ArclightMod.MODID, "textures/models/armor/angel_armor_textures.png");
    }

    @Override
    public ResourceLocation getAnimationResource(AngelWingItem animatable) {
        return new ResourceLocation(ArclightMod.MODID, "animations/angel_armor_animation.json");
    }

}
