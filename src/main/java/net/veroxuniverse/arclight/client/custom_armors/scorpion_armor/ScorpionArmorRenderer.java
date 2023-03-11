package net.veroxuniverse.arclight.client.custom_armors.scorpion_armor;

import net.veroxuniverse.arclight.item.ScorpionArmorItem;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class ScorpionArmorRenderer extends GeoArmorRenderer<ScorpionArmorItem> {
    public ScorpionArmorRenderer() {
        super(new ScorpionArmorModel());

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
