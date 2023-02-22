package net.veroxuniverse.arclight.client.customarmors.ScorpionArmor;

import net.minecraft.resources.ResourceLocation;
import net.veroxuniverse.arclight.ArclightMod;
import net.veroxuniverse.arclight.item.ArclightArmorItem;
import net.veroxuniverse.arclight.item.ScorpionArmorItem;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class ScorpionArmorModel extends AnimatedGeoModel<ScorpionArmorItem> {
    @Override
    public ResourceLocation  getModelResource(ScorpionArmorItem object) {
        return new ResourceLocation(ArclightMod.MODID, "geo/scorpion_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(ScorpionArmorItem object) {
        return new ResourceLocation(ArclightMod.MODID, "textures/models/armor/scorpion_armor_textures.png");
    }

    @Override
    public ResourceLocation getAnimationResource(ScorpionArmorItem animatable) {
        return null; //return new ResourceLocation(ArclightMod.MODID, "animations/armor_animation.json");
    }

}
