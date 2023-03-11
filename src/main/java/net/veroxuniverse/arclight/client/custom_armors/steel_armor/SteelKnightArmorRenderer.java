package net.veroxuniverse.arclight.client.custom_armors.steel_armor;


import net.veroxuniverse.arclight.item.SteelArmorItem;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class SteelKnightArmorRenderer extends GeoArmorRenderer<SteelArmorItem> {
    public SteelKnightArmorRenderer() {
        super(new SteelKnightArmorModel());

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
