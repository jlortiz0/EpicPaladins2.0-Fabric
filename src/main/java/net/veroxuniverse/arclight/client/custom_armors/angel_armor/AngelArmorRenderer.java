package net.veroxuniverse.arclight.client.custom_armors.angel_armor;

import net.veroxuniverse.arclight.item.AngelWingItem;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class AngelArmorRenderer extends GeoArmorRenderer<AngelWingItem> {
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
}
