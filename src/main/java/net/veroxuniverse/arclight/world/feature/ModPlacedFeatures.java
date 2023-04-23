package net.veroxuniverse.arclight.world.feature;

import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.placementmodifier.*;
import net.veroxuniverse.arclight.ArclightMod;

import java.util.List;

@SuppressWarnings("unused")
public class ModPlacedFeatures {

    //OVERWORLD

    public static final PlacedFeature ARCLIGHT_ORE_PLACED = Registry.register(BuiltinRegistries.PLACED_FEATURE, new Identifier(ArclightMod.MODID, "arclight_ore_placed"),
            new PlacedFeature(RegistryEntry.of(ModConfiguredFeatures.ARCLIGHT_ORE),
                    commonOrePlacement(1, // VeinsPerChunk
                            HeightRangePlacementModifier.trapezoid(YOffset.BOTTOM, YOffset.aboveBottom(94)))));

    public static final PlacedFeature BLOODSTONE_ORE_PLACED = Registry.register(BuiltinRegistries.PLACED_FEATURE, new Identifier(ArclightMod.MODID, "bloodstone_ore_placed"),
            new PlacedFeature(RegistryEntry.of(ModConfiguredFeatures.BLOODSTONE_ORE),
                    commonOrePlacement(1, // VeinsPerChunk
                            HeightRangePlacementModifier.trapezoid(YOffset.BOTTOM, YOffset.aboveBottom(94)))));

    public static final PlacedFeature CRYORIUM_ORE_PLACED = Registry.register(BuiltinRegistries.PLACED_FEATURE, new Identifier(ArclightMod.MODID, "cryorium_ore_placed"),
            new PlacedFeature(RegistryEntry.of(ModConfiguredFeatures.CRYORIUM_ORE),
                    commonOrePlacement(1, // VeinsPerChunk
                            HeightRangePlacementModifier.trapezoid(YOffset.BOTTOM, YOffset.aboveBottom(94)))));

    //END

    public static final PlacedFeature END_JADE_ORE_PLACED = Registry.register(BuiltinRegistries.PLACED_FEATURE, new Identifier(ArclightMod.MODID, "end_jade_ore_placed"),
            new PlacedFeature(RegistryEntry.of(ModConfiguredFeatures.END_JADE_ORE), commonOrePlacement(2, // VeinsPerChunk
                    HeightRangePlacementModifier.uniform(YOffset.aboveBottom(10), YOffset.aboveBottom(140)))));

    //NETHER

    public static final PlacedFeature NETHER_MOONLIGHT_ORE_PLACED = Registry.register(BuiltinRegistries.PLACED_FEATURE, new Identifier(ArclightMod.MODID, "nether_moonlight_ore_placed"),
            new PlacedFeature(RegistryEntry.of(ModConfiguredFeatures.NETHER_MOONLIGHT_ORE), commonOrePlacement(2, // VeinsPerChunk
                    HeightRangePlacementModifier.uniform(YOffset.aboveBottom(30), YOffset.aboveBottom(80)))));





    public static List<PlacementModifier> orePlacement(PlacementModifier veins, PlacementModifier height) {
        return List.of(veins, SquarePlacementModifier.of(), height, BiomePlacementModifier.of());
    }

    public static List<PlacementModifier> commonOrePlacement(int veins, PlacementModifier height) {
        return orePlacement(CountPlacementModifier.of(veins), height);
    }

    public static List<PlacementModifier> rareOrePlacement(int chance, PlacementModifier height) {
        return orePlacement(RarityFilterPlacementModifier.of(chance), height);
    }
}
