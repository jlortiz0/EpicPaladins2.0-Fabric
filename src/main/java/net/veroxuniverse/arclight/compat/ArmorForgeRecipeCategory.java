package net.veroxuniverse.arclight.compat;

import mezz.jei.api.constants.VanillaTypes;
import mezz.jei.api.gui.builder.IRecipeLayoutBuilder;
import mezz.jei.api.gui.drawable.IDrawable;
import mezz.jei.api.helpers.IGuiHelper;
import mezz.jei.api.recipe.IFocusGroup;
import mezz.jei.api.recipe.RecipeIngredientRole;
import mezz.jei.api.recipe.RecipeType;
import mezz.jei.api.recipe.category.IRecipeCategory;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.veroxuniverse.arclight.ArclightMod;
import net.veroxuniverse.arclight.init.BlocksInit;
import net.veroxuniverse.arclight.recipe.ArmorForgeRecipe;
import org.jetbrains.annotations.NotNull;

public class ArmorForgeRecipeCategory implements IRecipeCategory<ArmorForgeRecipe> {
    public final static ResourceLocation UID = new ResourceLocation(ArclightMod.MODID, "armor_forging");
    public static final RecipeType<ArmorForgeRecipe> RECIPE_TYPE = RecipeType.create(ArclightMod.MODID, "armor_forging", ArmorForgeRecipe.class);

    public final static ResourceLocation TEXTURE =
            new ResourceLocation(ArclightMod.MODID, "textures/gui/armor_forge_gui.png");

    private final IDrawable background;
    private final IDrawable icon;

    public ArmorForgeRecipeCategory(IGuiHelper helper) {
        this.background = helper.createDrawable(TEXTURE, 0, 0, 176, 85);
        this.icon = helper.createDrawableIngredient(VanillaTypes.ITEM_STACK, new ItemStack(BlocksInit.ARMOR_FORGE.get()));
    }

    @Override
    public @NotNull RecipeType<ArmorForgeRecipe> getRecipeType() {
        return JEIArclightPlugin.INFUSION_TYPE;
    }

    @Override
    public @NotNull Component getTitle() {
        return Component.literal("Paladin Forge");
    }

    @Override
    public @NotNull IDrawable getBackground() {
        return this.background;
    }

    @Override
    public @NotNull IDrawable getIcon() {
        return this.icon;
    }

    @Override
    public void setRecipe(IRecipeLayoutBuilder builder, ArmorForgeRecipe recipe, @NotNull IFocusGroup focuses) {
        builder.addSlot(RecipeIngredientRole.INPUT, 86, 15).addIngredients(recipe.getIngredients().get(0));
        builder.addSlot(RecipeIngredientRole.INPUT, 48, 20).addIngredients(recipe.getIngredients().get(1));
        builder.addSlot(RecipeIngredientRole.INPUT, 48, 40).addIngredients(recipe.getIngredients().get(2));

        builder.addSlot(RecipeIngredientRole.OUTPUT, 86, 60).addItemStack(recipe.getResultItem());
    }
}
