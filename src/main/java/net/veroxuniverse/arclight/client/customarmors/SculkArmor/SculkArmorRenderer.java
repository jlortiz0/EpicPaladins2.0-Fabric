package net.veroxuniverse.arclight.client.customarmors.SculkArmor;

import net.veroxuniverse.arclight.item.SculkArmorItem;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class SculkArmorRenderer extends GeoArmorRenderer<SculkArmorItem> {
    public SculkArmorRenderer() {
        super(new SculkArmorModel());

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
