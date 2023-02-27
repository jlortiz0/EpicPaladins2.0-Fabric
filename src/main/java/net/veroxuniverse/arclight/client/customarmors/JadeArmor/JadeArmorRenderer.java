package net.veroxuniverse.arclight.client.customarmors.JadeArmor;
import net.veroxuniverse.arclight.item.JadeArmorItem;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class JadeArmorRenderer extends GeoArmorRenderer<JadeArmorItem> {
    public JadeArmorRenderer() {
        super(new JadeArmorModel());

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
