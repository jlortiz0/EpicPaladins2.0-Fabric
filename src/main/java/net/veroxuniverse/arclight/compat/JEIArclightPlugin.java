package net.veroxuniverse.arclight.compat;

import me.shedaniel.math.Rectangle;
import me.shedaniel.rei.api.client.plugins.REIClientPlugin;
import me.shedaniel.rei.api.client.registry.category.CategoryRegistry;
import me.shedaniel.rei.api.client.registry.display.DisplayRegistry;
import me.shedaniel.rei.api.client.registry.screen.ClickArea;
import me.shedaniel.rei.api.client.registry.screen.ScreenRegistry;
import me.shedaniel.rei.api.client.registry.screen.SimpleClickArea;
import me.shedaniel.rei.api.common.category.CategoryIdentifier;
import me.shedaniel.rei.api.common.plugins.REIPlugin;
import me.shedaniel.rei.api.common.util.EntryStacks;
import mezz.jei.api.IModPlugin;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.recipe.RecipeType;
import mezz.jei.api.registration.IGuiHandlerRegistration;
import mezz.jei.api.registration.IRecipeCatalystRegistration;
import mezz.jei.api.registration.IRecipeCategoryRegistration;
import mezz.jei.api.registration.IRecipeRegistration;
import net.minecraft.client.Minecraft;
import net.minecraft.recipe.RecipeManager;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Identifier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeManager;
import net.veroxuniverse.arclight.ArclightMod;
import net.veroxuniverse.arclight.init.BlocksInit;
import net.veroxuniverse.arclight.recipe.ArmorForgeRecipe;
import net.veroxuniverse.arclight.screen.ArmorForgeScreen;
import org.jetbrains.annotations.NotNull;

import java.util.List;
import java.util.Objects;

public class JEIArclightPlugin implements REIClientPlugin {

    public @NotNull Identifier getPluginUid() {
        return new Identifier(ArclightMod.MODID, "rei_plugin");
    }

    @Override
    public void registerCategories(CategoryRegistry registration) {
        registration.add(new ArmorForgeRecipeCategory());
        CategoryRegistry.getInstance().addWorkstations(CategoryIdentifier.of(ArclightMod.MODID, BlocksInit.ARMOR_FORGE.getTranslationKey()), EntryStacks.of(BlocksInit.ARMOR_FORGE));
    }

    @Override
    public void registerDisplays(DisplayRegistry registry) {
        registry.registerFiller(ArmorForgeRecipe.class, (recipe) -> recipe instanceof ArmorForgeRecipe, r -> new ArmorForgeRecipeDisplay(r));
    }

    @Override
    public void registerScreens(ScreenRegistry registry) {
        registry.registerClickArea(ArmorForgeScreen.class, new SimpleClickArea<ArmorForgeScreen>() {
            @Override
            public Rectangle provide(ArmorForgeScreen s) {
                return new Rectangle(105, 33, 10, 40);
            }
        });
    }
}
