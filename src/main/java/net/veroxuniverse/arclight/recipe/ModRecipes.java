package net.veroxuniverse.arclight.recipe;

import net.minecraft.recipe.RecipeSerializer;
import net.minecraft.recipe.RecipeType;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.veroxuniverse.arclight.ArclightMod;

@SuppressWarnings("unused")
public class ModRecipes {

    public static final RecipeSerializer<ArmorForgeRecipe> ARMOR_FORGE_SERIALIZER =
            Registry.register(Registry.RECIPE_SERIALIZER, new Identifier(ArclightMod.MODID, "armor_forging"), ArmorForgeRecipe.Serializer.INSTANCE);

    public static final RecipeType<ArmorForgeRecipe> ARMOR_FORGE_TYPE =
            Registry.register(Registry.RECIPE_TYPE, new Identifier(ArclightMod.MODID, "armor_forging"), ArmorForgeRecipe.Type.INSTANCE);
}
