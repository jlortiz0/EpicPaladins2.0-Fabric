package net.veroxuniverse.arclight.client.custom_armors.moonlight_armor;

import net.veroxuniverse.arclight.item.MoonlightArmorItem;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class MoonlightArmorRenderer extends GeoArmorRenderer<MoonlightArmorItem> {
    public MoonlightArmorRenderer() {
        super(new MoonlightArmorModel());

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
