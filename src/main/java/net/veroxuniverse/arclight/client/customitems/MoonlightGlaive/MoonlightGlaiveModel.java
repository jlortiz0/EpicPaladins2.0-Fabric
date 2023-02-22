package net.veroxuniverse.arclight.client.customitems.MoonlightGlaive;

import net.minecraft.resources.ResourceLocation;
import net.veroxuniverse.arclight.ArclightMod;
import net.veroxuniverse.arclight.item.MoonlightGlaiveItem;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class MoonlightGlaiveModel extends AnimatedGeoModel<MoonlightGlaiveItem> {
    @Override
    public ResourceLocation getModelResource(MoonlightGlaiveItem object) {
        return new ResourceLocation(ArclightMod.MODID, "geo/moonlight_glaive.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(MoonlightGlaiveItem object) {
        return new ResourceLocation(ArclightMod.MODID, "textures/item/moonlight_glaive.png");
    }

    @Override
    public ResourceLocation getAnimationResource(MoonlightGlaiveItem animatable) {
        return null; // new ResourceLocation(ArclightMod.MODID, "animations/item_animation.json");
    }
}

