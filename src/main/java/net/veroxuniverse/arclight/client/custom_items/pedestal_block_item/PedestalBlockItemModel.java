package net.veroxuniverse.arclight.client.custom_items.pedestal_block_item;

import net.minecraft.resources.ResourceLocation;
import net.veroxuniverse.arclight.ArclightMod;
import net.veroxuniverse.arclight.item.PedestalBlockItem;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class PedestalBlockItemModel extends AnimatedGeoModel<PedestalBlockItem> {
    @Override
    public ResourceLocation getModelResource(PedestalBlockItem object) {
        return new ResourceLocation(ArclightMod.MODID, "geo/pedestal_block.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(PedestalBlockItem object) {
        return new ResourceLocation(ArclightMod.MODID, "textures/machines/pedestal_block.png");
    }

    @Override
    public ResourceLocation getAnimationResource(PedestalBlockItem animatable) {
        return null; //new ResourceLocation(ArclightMod.MODID, "animations/...");
    }

}