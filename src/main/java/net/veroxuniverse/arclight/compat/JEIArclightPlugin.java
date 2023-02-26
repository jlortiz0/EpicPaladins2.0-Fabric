package net.veroxuniverse.arclight.compat;

import mezz.jei.api.IModPlugin;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.recipe.RecipeType;
import mezz.jei.api.registration.IRecipeCategoryRegistration;
import mezz.jei.api.registration.IRecipeRegistration;
import net.minecraft.client.Minecraft;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.crafting.RecipeManager;
import net.veroxuniverse.arclight.ArclightMod;
import net.veroxuniverse.arclight.recipe.ArmorForgeRecipe;

import java.util.List;
import java.util.Objects;

@JeiPlugin
public class JEIArclightPlugin implements IModPlugin {
    public static RecipeType<ArmorForgeRecipe> INFUSION_TYPE =
            new RecipeType<>(ArmorForgeRecipeCategory.UID, ArmorForgeRecipe.class);

    @Override
    public ResourceLocation getPluginUid() {
        return new ResourceLocation(ArclightMod.MODID, "jei_plugin");
    }

    @Override
    public void registerCategories(IRecipeCategoryRegistration registration) {
        registration.addRecipeCategories(new
                ArmorForgeRecipeCategory(registration.getJeiHelpers().getGuiHelper()));
    }

    @Override
    public void registerRecipes(IRecipeRegistration registration) {
        RecipeManager rm = Objects.requireNonNull(Minecraft.getInstance().level).getRecipeManager();

        List<ArmorForgeRecipe> recipesInfusing = rm.getAllRecipesFor(ArmorForgeRecipe.Type.INSTANCE);
        registration.addRecipes(INFUSION_TYPE, recipesInfusing);
    }
}
