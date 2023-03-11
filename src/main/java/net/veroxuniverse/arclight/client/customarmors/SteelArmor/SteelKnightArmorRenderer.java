package net.veroxuniverse.arclight.client.customarmors.SteelArmor;


import net.veroxuniverse.arclight.client.customarmors.CopperKnight.CopperKnightArmorModel;
import net.veroxuniverse.arclight.item.CopperArmorItem;
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
