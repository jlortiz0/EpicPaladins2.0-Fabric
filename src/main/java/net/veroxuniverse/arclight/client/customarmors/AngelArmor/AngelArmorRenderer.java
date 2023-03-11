package net.veroxuniverse.arclight.client.customarmors.AngelArmor;

import net.veroxuniverse.arclight.client.customarmors.ArclightArmor.ArclightArmorModel;
import net.veroxuniverse.arclight.item.AngelWingItem;
import net.veroxuniverse.arclight.item.ArclightArmorItem;
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
