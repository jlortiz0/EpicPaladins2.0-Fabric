package net.veroxuniverse.arclight.client.custom_armors.copper_knight;


import net.veroxuniverse.arclight.item.CopperArmorItem;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class CopperKnightArmorRenderer extends GeoArmorRenderer<CopperArmorItem> {
    public CopperKnightArmorRenderer() {
        super(new CopperKnightArmorModel());

        this.headBone = "armorHead";
        this.bodyBone = "armorBody";
        this.rightArmBone = "armorRightArm";
        this.leftArmBone = "armorLeftArm";
        this.rightLegBone = "armorRightLeg";
        this.leftLegBone = "armorLeftLeg";
        this.rightBootBone = "armorRightBoots";
        this.leftBootBone = "armorLeftBoots";

    }
}
