package net.veroxuniverse.arclight.client.custom_armors.cryorium_armor;

import net.veroxuniverse.arclight.item.CryoArmorItem;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class CryoriumArmorRenderer extends GeoArmorRenderer<CryoArmorItem> {
    public CryoriumArmorRenderer() {
        super(new CryoriumArmorModel());

        this.headBone = "armorHead";
        this.bodyBone = "armorBody";
        this.rightArmBone = "armorLeftArm";
        this.leftArmBone = "armorRightArm";
        this.rightLegBone = "armorLeftLeg";
        this.leftLegBone = "armorRightLeg";
        this.rightBootBone = "armorLeftBoots";
        this.leftBootBone = "armorRightBoots";

    }
}
