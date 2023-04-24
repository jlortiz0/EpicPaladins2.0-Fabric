package net.veroxuniverse.arclight.compat;

import com.mojang.blaze3d.systems.RenderSystem;
import me.shedaniel.math.Point;
import me.shedaniel.math.Rectangle;
import me.shedaniel.rei.api.client.gui.DisplayRenderer;
import me.shedaniel.rei.api.client.gui.SimpleDisplayRenderer;
import me.shedaniel.rei.api.client.gui.widgets.Widget;
import me.shedaniel.rei.api.client.gui.widgets.Widgets;
import me.shedaniel.rei.api.client.registry.display.DisplayCategory;
import me.shedaniel.rei.api.common.category.CategoryIdentifier;
import me.shedaniel.rei.api.common.entry.EntryStack;
import me.shedaniel.rei.api.common.entry.type.VanillaEntryTypes;
import net.minecraft.item.ItemStack;
import net.minecraft.recipe.RecipeType;
import net.minecraft.text.LiteralText;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.veroxuniverse.arclight.ArclightMod;
import net.veroxuniverse.arclight.init.BlocksInit;
import net.veroxuniverse.arclight.recipe.ArmorForgeRecipe;
import net.veroxuniverse.arclight.recipe.ModRecipes;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArmorForgeRecipeCategory implements DisplayCategory<ArmorForgeRecipeDisplay> {
    public final static CategoryIdentifier<ArmorForgeRecipeDisplay> UID = CategoryIdentifier.of(ArclightMod.MODID, "armor_forging");
    public static final RecipeType<ArmorForgeRecipe> RECIPE_TYPE = ArclightMod.ARMOR_FORGE_TYPE;

    public final static Identifier TEXTURE =
            new Identifier(ArclightMod.MODID, "textures/gui/armor_forge_gui.png");

    // private final IDrawable background;
    private final EntryStack icon;

    public ArmorForgeRecipeCategory() {
        // this.background = helper.createDrawable(TEXTURE, 0, 0, 176, 85);
        this.icon = EntryStack.of(VanillaEntryTypes.ITEM, new ItemStack(BlocksInit.ARMOR_FORGE));
    }

    @Override
    public @NotNull Text getTitle() {
        return new LiteralText("Paladin Forge");
    }

    @Override
    public @NotNull EntryStack getIcon() {
        return this.icon;
    }

    @Override
    public @NotNull CategoryIdentifier<ArmorForgeRecipeDisplay> getCategoryIdentifier() { return UID; }

    @Override
    public DisplayRenderer getDisplayRenderer(ArmorForgeRecipeDisplay recipe) {
        return SimpleDisplayRenderer.from(Collections.singletonList(recipe.getInputEntries().get(0)), recipe.getOutputEntries());
    }

    @Override
    public List<Widget> setupDisplay(ArmorForgeRecipeDisplay recipe, Rectangle bounds) {
        List<Widget> widgets = new ArrayList<>();
        widgets.add(Widgets.createRecipeBase(new Rectangle(bounds.x, bounds.y, 176, 85)));
        // widgets.add(Widgets.createTexturedWidget(TEXTURE, bounds.x + 36, bounds.y + 4, 36, 4, 88, 78));
        widgets.add(Widgets.createDrawableWidget(((helper, matrices, mouseX, mouseY, delta) -> {
            RenderSystem.setShaderTexture(0, TEXTURE);
            helper.drawTexture(matrices, bounds.x + 36, bounds.y + 4, 36, 4, 88, 78);
        })));
        widgets.add(Widgets.createSlot(new Point(bounds.x + 86, bounds.y + 15)).entries(recipe.getInputEntries().get(0)).markInput());
        widgets.add(Widgets.createSlot(new Point(bounds.x + 48, bounds.y + 20)).entries(recipe.getInputEntries().get(1)).markInput());
        widgets.add(Widgets.createSlot(new Point(bounds.x + 48, bounds.y + 40)).entries(recipe.getInputEntries().get(2)).markInput());
        widgets.add(Widgets.createSlot(new Point(bounds.x + 86, bounds.y + 60)).entries(recipe.getOutputEntries().get(0)).markOutput());
        return widgets;
    }
}
