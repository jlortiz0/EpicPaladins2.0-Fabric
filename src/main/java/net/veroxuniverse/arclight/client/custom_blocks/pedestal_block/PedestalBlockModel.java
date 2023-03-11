package net.veroxuniverse.arclight.client.custom_blocks.pedestal_block;

import net.minecraft.resources.ResourceLocation;
import net.veroxuniverse.arclight.ArclightMod;
import net.veroxuniverse.arclight.block.entities.PedestalBlockEntity;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class PedestalBlockModel extends AnimatedGeoModel<PedestalBlockEntity> {
    @Override
    public ResourceLocation getModelResource(PedestalBlockEntity object) {
        return new ResourceLocation(ArclightMod.MODID, "geo/pedestal_block.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(PedestalBlockEntity object) {
        return new ResourceLocation(ArclightMod.MODID, "textures/machines/pedestal_block.png");
    }

    @Override
    public ResourceLocation getAnimationResource(PedestalBlockEntity animatable) {
        return null; // new ResourceLocation(ArclightMod.MODID,"animations/...");
    }
}