package net.veroxuniverse.arclight.recipe;

import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.veroxuniverse.arclight.ArclightMod;

public class ModRecipes {
    public static final DeferredRegister<RecipeSerializer<?>> RECIPE_SERIALIZERS =
            DeferredRegister.create(ForgeRegistries.RECIPE_SERIALIZERS, ArclightMod.MODID);

    public static final RegistryObject<RecipeSerializer<ArmorForgeRecipe>> ARMOR_FORGE_SERIALIZER =
            RECIPE_SERIALIZERS.register("armor_forging",() -> ArmorForgeRecipe.Serializer.INSTANCE);

    public static void register(IEventBus eventBus) {
        RECIPE_SERIALIZERS.register(eventBus);
        RECIPE_TYPES.register(eventBus);
    }

    public static final DeferredRegister<RecipeType<?>> RECIPE_TYPES = DeferredRegister.create(ForgeRegistries.RECIPE_TYPES, ArclightMod.MODID);

    public static final RegistryObject<RecipeType<ArmorForgeRecipe>> ARMOR_FORGE_TYPE =
            RECIPE_TYPES.register("armor_forging", () -> ArmorForgeRecipe.Type.INSTANCE);
}
