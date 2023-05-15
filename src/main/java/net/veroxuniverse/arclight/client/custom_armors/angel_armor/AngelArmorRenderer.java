package net.veroxuniverse.arclight.client.custom_armors.angel_armor;

import net.minecraft.client.render.*;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.util.Identifier;
import net.veroxuniverse.arclight.client.custom_armors.ArmorBase;
import net.veroxuniverse.arclight.item.AngelWingItem;

import javax.annotation.Nullable;

public class AngelArmorRenderer extends ArmorBase<AngelWingItem> {
    public AngelArmorRenderer() {
        super(new AngelArmorModel());

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
    public RenderLayer getRenderType(AngelWingItem animatable, float partialTick, MatrixStack poseStack,
                                     @Nullable VertexConsumerProvider bufferSource, @Nullable VertexConsumer buffer, int packedLight,
                                     Identifier texture) {
        if (animatable.getSlotType() != EquipmentSlot.CHEST) {
            return super.getRenderType(animatable, partialTick, poseStack, bufferSource, buffer, packedLight, texture);
        }
        RenderLayer.MultiPhaseParameters multiPhaseParameters = RenderLayer.MultiPhaseParameters.builder()
                .shader(RenderLayer.ARMOR_CUTOUT_NO_CULL_SHADER)
                .texture(new RenderPhase.Texture(texture, false, false))
                .transparency(RenderLayer.TRANSLUCENT_TRANSPARENCY)
                .cull(getRenderColor(currentArmorItem, 0, poseStack, bufferSource, buffer, packedLight).getAlpha() > 90 ? RenderLayer.ENABLE_CULLING : RenderLayer.DISABLE_CULLING)
                .lightmap(RenderLayer.ENABLE_LIGHTMAP)
                .build(true);
        return RenderLayer.of("entity_translucent", VertexFormats.POSITION_COLOR_TEXTURE_OVERLAY_LIGHT_NORMAL, VertexFormat.DrawMode.QUADS, 256, true, true, multiPhaseParameters);
    }
}
