package net.veroxuniverse.arclight.client.customarmors.ShadowArmor;

import net.veroxuniverse.arclight.client.customarmors.MoonlightArmor.MoonlightArmorModel;
import net.veroxuniverse.arclight.item.MoonlightArmorItem;
import net.veroxuniverse.arclight.item.ShadowArmorItem;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class ShadowArmorRenderer extends GeoArmorRenderer<ShadowArmorItem> {
    public ShadowArmorRenderer() {
        super(new ShadowArmorModel());

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
