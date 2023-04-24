package net.veroxuniverse.arclight;

import net.fabricmc.api.ModInitializer;
import java.util.logging.Logger;

import net.minecraft.recipe.RecipeSerializer;
import net.minecraft.recipe.RecipeType;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.veroxuniverse.arclight.recipe.ArmorForgeRecipe;
import software.bernie.geckolib3.GeckoLib;


public class ArclightMod implements ModInitializer {
    public static final String MODID = "arclight";
    private static final Logger LOGGER = Logger.getLogger(MODID);
    public static final RecipeType<ArmorForgeRecipe> ARMOR_FORGE_TYPE =
            Registry.register(Registry.RECIPE_TYPE, new Identifier(ArclightMod.MODID, "armor_forging"), ArmorForgeRecipe.Type.INSTANCE);

    public static final RecipeSerializer<ArmorForgeRecipe> ARMOR_FORGE_SERIALIZER =
            Registry.register(Registry.RECIPE_SERIALIZER, new Identifier(ArclightMod.MODID, "armor_forging"), ArmorForgeRecipe.Serializer.INSTANCE);

    public void onInitialize() {
        GeckoLib.initialize();
    }
}
