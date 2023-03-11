package net.veroxuniverse.arclight.client.custom_items.cryorium_axe;

import net.minecraft.resources.ResourceLocation;
import net.veroxuniverse.arclight.ArclightMod;
import net.veroxuniverse.arclight.item.CryoriumAxeItem;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class CryoriumAxeModel extends AnimatedGeoModel<CryoriumAxeItem> {

    @Override
    public ResourceLocation getModelResource(CryoriumAxeItem object) {
        return new ResourceLocation(ArclightMod.MODID, "geo/cryorium_battle_axe.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(CryoriumAxeItem object) {
        return new ResourceLocation(ArclightMod.MODID, "textures/item/cryorium_battle_axe.png");
    }

    @Override
    public ResourceLocation getAnimationResource(CryoriumAxeItem animatable) {
        return null; // new ResourceLocation(ArclightMod.MODID, "animations/item_animation.json");
    }
}
