package net.veroxuniverse.arclight.client.custom_armors.scorpion_armor;

import net.minecraft.util.Identifier;
import net.veroxuniverse.arclight.ArclightMod;
import net.veroxuniverse.arclight.item.ScorpionArmorItem;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class ScorpionArmorModel extends AnimatedGeoModel<ScorpionArmorItem> {
    @Override
    public Identifier  getModelLocation(ScorpionArmorItem object) {
        return new Identifier(ArclightMod.MODID, "geo/scorpion_armor.geo.json");
    }

    @Override
    public Identifier getTextureLocation(ScorpionArmorItem object) {
        return new Identifier(ArclightMod.MODID, "textures/models/armor/scorpion_armor_textures.png");
    }

    @Override
    public Identifier getAnimationFileLocation(ScorpionArmorItem animatable) {
        return null; //return new Identifier(ArclightMod.MODID, "animations/armor_animation.json");
    }

}
