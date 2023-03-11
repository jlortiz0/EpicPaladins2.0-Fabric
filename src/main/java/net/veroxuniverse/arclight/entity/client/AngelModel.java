package net.veroxuniverse.arclight.entity.client;

import net.minecraft.resources.ResourceLocation;
import net.veroxuniverse.arclight.ArclightMod;
import net.veroxuniverse.arclight.entity.custom.AngelEntity;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.processor.IBone;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.model.provider.data.EntityModelData;

public class AngelModel extends AnimatedGeoModel<AngelEntity> {
    @Override
    public ResourceLocation getModelResource(AngelEntity object) {
        return new ResourceLocation(ArclightMod.MODID, "geo/angel.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(AngelEntity object) {
        return new ResourceLocation(ArclightMod.MODID, "textures/entity/angel/angel.png");
    }

    @Override
    public ResourceLocation getAnimationResource(AngelEntity animateable) {
        return new ResourceLocation(ArclightMod.MODID, "animations/angel.animation.json");
    }

    @SuppressWarnings({ "unchecked" })
    @Override
    public void setLivingAnimations(AngelEntity entity, Integer uniqueID, AnimationEvent customPredicate) {
        super.setLivingAnimations(entity, uniqueID, customPredicate);
        IBone head = this.getAnimationProcessor().getBone("head");

        EntityModelData extraData = (EntityModelData) customPredicate.getExtraDataOfType(EntityModelData.class).get(0);
        if (head != null) {
            head.setRotationX(extraData.headPitch * ((float) Math.PI / 180F));
            head.setRotationY(extraData.netHeadYaw * ((float) Math.PI / 180F));
        }
    }
}