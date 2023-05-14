package net.veroxuniverse.arclight.client.custom_armors;

import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.client.render.*;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.item.ArmorItem;
import net.minecraft.util.Identifier;
import net.veroxuniverse.arclight.client.custom_armors.angel_armor.AngelArmorModel;
import net.veroxuniverse.arclight.item.AngelWingItem;
import nl.enjarai.showmeyourskin.config.ArmorConfig;
import nl.enjarai.showmeyourskin.config.ModConfig;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.core.util.Color;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

import javax.annotation.Nullable;

public class ArmorBase<T extends ArmorItem & IAnimatable> extends GeoArmorRenderer<T> {
    public ArmorBase(AnimatedGeoModel<T> modelProvider) {
        super(modelProvider);

        this.headBone = "armorHead";
        this.bodyBone = "armorBody";
        this.rightArmBone = "armorLeftArm";
        this.leftArmBone = "armorRightArm";
        this.rightLegBone = "armorLeftLeg";
        this.leftLegBone = "armorRightLeg";
        this.rightBootBone = "armorLeftBoots";
        this.leftBootBone = "armorRightBoots";

    }

    @Override
    public void render(MatrixStack stack, VertexConsumerProvider bufferIn, int packedLightIn) {
        if (getRenderColor(currentArmorItem, 0, stack, bufferIn, null, packedLightIn).getAlpha() == 0) {
            return;
        }
        super.render(stack, bufferIn, packedLightIn);
    }

//    @Override
//    public void render(float partialTicks, MatrixStack stack, VertexConsumer bufferIn, int packedLightIn) {
//        if (getRenderColor(currentArmorItem, partialTicks, stack, null, bufferIn, packedLightIn).getAlpha() == 0) {
//            return;
//        }
//        super.render(partialTicks, stack, bufferIn, packedLightIn);
//    }

    @Override
    public Color getRenderColor(T animatable, float partialTick, MatrixStack poseStack,
                                @Nullable VertexConsumerProvider bufferSource, @Nullable VertexConsumer buffer, int packedLight) {
        if (FabricLoader.getInstance().isModLoaded("showmeyourskin")) {
            ArmorConfig conf = ModConfig.INSTANCE.getApplicable(entityLiving.getUuid());
            return Color.ofRGBA(1f, 1f, 1f, conf.getTransparency(this.armorSlot) / 100f);
        }
        return Color.WHITE;
    }

    @Override
    public RenderLayer getRenderType(T animatable, float partialTick, MatrixStack poseStack,
                                     @Nullable VertexConsumerProvider bufferSource, @Nullable VertexConsumer buffer, int packedLight,
                                     Identifier texture) {
        RenderLayer.MultiPhaseParameters multiPhaseParameters = RenderLayer.MultiPhaseParameters.builder()
                .shader(RenderLayer.ENTITY_TRANSLUCENT_SHADER)
                .texture(new RenderPhase.Texture(texture, false, false))
                .transparency(RenderLayer.TRANSLUCENT_TRANSPARENCY)
                // .writeMaskState(RenderLayer.COLOR_MASK)
                .cull(RenderLayer.DISABLE_CULLING)
                .lightmap(RenderLayer.ENABLE_LIGHTMAP)
                .target(RenderPhase.OUTLINE_TARGET)
                .build(true);
        return RenderLayer.of("entity_translucent", VertexFormats.POSITION_COLOR_TEXTURE_OVERLAY_LIGHT_NORMAL, VertexFormat.DrawMode.QUADS, 256, true, true, multiPhaseParameters);
    }
}
