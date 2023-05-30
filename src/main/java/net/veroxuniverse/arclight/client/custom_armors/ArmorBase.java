package net.veroxuniverse.arclight.client.custom_armors;

import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.client.render.*;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.item.ArmorItem;
import net.minecraft.util.Identifier;
import nl.enjarai.showmeyourskin.config.ArmorConfig;
import nl.enjarai.showmeyourskin.config.ModConfig;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.core.util.Color;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

import javax.annotation.Nullable;

public class ArmorBase<T extends ArmorItem & IAnimatable> extends GeoArmorRenderer<T> {
    public ArmorBase(AnimatedGeoModel<T> modelProvider) {
        this(modelProvider, false);

        this.headBone = "armorHead";
        this.bodyBone = "armorBody";
        this.rightArmBone = "armorRightArm";
        this.leftArmBone = "armorLeftArm";
        this.rightLegBone = "armorRightLeg";
        this.leftLegBone = "armorLeftLeg";
        this.rightBootBone = "armorRightBoots";
        this.leftBootBone = "armorLeftBoots";

    }

    public ArmorBase(AnimatedGeoModel<T> modelProvider, boolean reversed) {
        super(modelProvider);

        this.headBone = "armorHead";
        this.bodyBone = "armorBody";
        this.rightArmBone = reversed ? "armorLeftArm" : "armorRightArm";
        this.leftArmBone = reversed ? "armorRightArm" : "armorLeftArm";
        this.rightLegBone = reversed ? "armorLeftLeg" : "armorRightLeg";
        this.leftLegBone = reversed ? "armorRightLeg" : "armorLeftLeg";
        this.rightBootBone = reversed ? "armorLeftBoots" : "armorRightBoots";
        this.leftBootBone = reversed ? "armorRightBoots" : "armorLeftBoots";

    }

    @Override
    public void render(MatrixStack stack, VertexConsumerProvider bufferIn, int packedLightIn) {
        if (getRenderColor(currentArmorItem, 0, stack, bufferIn, null, packedLightIn).getAlpha() < 5) {
            return;
        }
        super.render(stack, bufferIn, packedLightIn);
    }

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
        return RenderLayer.getArmorCutoutNoCull(texture);
    }
}
