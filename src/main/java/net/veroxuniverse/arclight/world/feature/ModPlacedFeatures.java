package net.veroxuniverse.arclight.world.feature;

import net.minecraft.core.Registry;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.placement.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.veroxuniverse.arclight.ArclightMod;

import java.util.List;

public class ModPlacedFeatures {
    public static final DeferredRegister<PlacedFeature> PLACED_FEATURES =
            DeferredRegister.create(Registry.PLACED_FEATURE_REGISTRY, ArclightMod.MODID);


    //OVERWORLD

    public static final RegistryObject<PlacedFeature> ARCLIGHT_ORE_PLACED = PLACED_FEATURES.register("arclight_ore_placed",
            () -> new PlacedFeature(ModConfiguredFeatures.ARCLIGHT_ORE.getHolder().get(),
                    commonOrePlacement(1, // VeinsPerChunk
                            HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(0), VerticalAnchor.aboveBottom(94)))));

    public static final RegistryObject<PlacedFeature> BLOODSTONE_ORE_PLACED = PLACED_FEATURES.register("bloodstone_ore_placed",
            () -> new PlacedFeature(ModConfiguredFeatures.BLOODSTONE_ORE.getHolder().get(),
                    commonOrePlacement(1, // VeinsPerChunk
                            HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(0), VerticalAnchor.aboveBottom(94)))));

    public static final RegistryObject<PlacedFeature> CRYORIUM_ORE_PLACED = PLACED_FEATURES.register("cryorium_ore_placed",
            () -> new PlacedFeature(ModConfiguredFeatures.CRYORIUM_ORE.getHolder().get(),
                    commonOrePlacement(1, // VeinsPerChunk
                            HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(0), VerticalAnchor.aboveBottom(94)))));

    //END

    public static final RegistryObject<PlacedFeature> END_JADE_ORE_PLACED = PLACED_FEATURES.register("end_jade_ore_placed",
            () -> new PlacedFeature(ModConfiguredFeatures.END_JADE_ORE.getHolder().get(), commonOrePlacement(2, // VeinsPerChunk
                    HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(10), VerticalAnchor.aboveBottom(140)))));

    //NETHER

    public static final RegistryObject<PlacedFeature> NETHER_MOONLIGHT_ORE_PLACED = PLACED_FEATURES.register("nether_moonlight_ore_placed",
            () -> new PlacedFeature(ModConfiguredFeatures.NETHER_MOONLIGHT_ORE.getHolder().get(), commonOrePlacement(2, // VeinsPerChunk
                    HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(30), VerticalAnchor.aboveBottom(80)))));





    public static List<PlacementModifier> orePlacement(PlacementModifier p_195347_, PlacementModifier p_195348_) {
        return List.of(p_195347_, InSquarePlacement.spread(), p_195348_, BiomeFilter.biome());
    }

    public static List<PlacementModifier> commonOrePlacement(int p_195344_, PlacementModifier p_195345_) {
        return orePlacement(CountPlacement.of(p_195344_), p_195345_);
    }

    public static List<PlacementModifier> rareOrePlacement(int p_195350_, PlacementModifier p_195351_) {
        return orePlacement(RarityFilter.onAverageOnceEvery(p_195350_), p_195351_);
    }

    public static void register(IEventBus eventBus) {
        PLACED_FEATURES.register(eventBus);
    }
}
