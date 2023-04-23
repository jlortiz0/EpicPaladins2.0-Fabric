package net.veroxuniverse.arclight.entity.client;

import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import net.veroxuniverse.arclight.ArclightMod;
import net.veroxuniverse.arclight.entity.custom.AngelEntity;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class AngelRenderer extends GeoEntityRenderer<AngelEntity> {
    public AngelRenderer(EntityRendererFactory.Context renderManager) {
        super(renderManager, new AngelModel());
        this.shadowRadius = 0.3f;
    }

    public Identifier getTextureResource() {
        return new Identifier(ArclightMod.MODID, "textures/entity/angel/angel.png");
    }

    @Override
    public RenderLayer getRenderType(AngelEntity animatable, float partialTicks, MatrixStack stack,
                                     VertexConsumerProvider renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn,
                                     Identifier textureLocation) {
        stack.scale(0.8F, 0.8F, 0.8F);
        return super.getRenderType(animatable, partialTicks, stack, renderTypeBuffer, vertexBuilder, packedLightIn, textureLocation);
    }
}