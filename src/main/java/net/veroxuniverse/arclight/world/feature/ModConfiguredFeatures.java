package net.veroxuniverse.arclight.world.feature;

import com.google.common.base.Suppliers;
import net.minecraft.core.Registry;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockMatchTest;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.veroxuniverse.arclight.ArclightMod;
import net.veroxuniverse.arclight.init.BlocksInit;

import java.util.List;
import java.util.function.Supplier;

public class ModConfiguredFeatures {
    public static final DeferredRegister<ConfiguredFeature<?, ?>> CONFIGURED_FEATURES =
            DeferredRegister.create(Registry.CONFIGURED_FEATURE_REGISTRY, ArclightMod.MODID);

    //OVERWORLD

    public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_ARCLIGHT_ORES = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, BlocksInit.ARCLIGHT_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, BlocksInit.DEEPSLATE_ARCLIGHT_ORE.get().defaultBlockState())));

    public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_BLOODSTONE_ORES = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, BlocksInit.BLOODSTONE_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, BlocksInit.DEEPSLATE_BLOODSTONE_ORE.get().defaultBlockState())));

    public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_CRYORIUM_ORES = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, BlocksInit.CRYORIUM_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, BlocksInit.DEEPSLATE_CRYORIUM_ORE.get().defaultBlockState())));

    //END

    public static final Supplier<List<OreConfiguration.TargetBlockState>> END_JADE_ORES = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(new BlockMatchTest(Blocks.END_STONE), BlocksInit.JADE_ORE.get().defaultBlockState())));

    //NETHER

    public static final Supplier<List<OreConfiguration.TargetBlockState>> NETHER_MOONLIGHT_ORES = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(OreFeatures.NETHER_ORE_REPLACEABLES, BlocksInit.MOONLIGHT_ORE.get().defaultBlockState())));


    //SPECIFY ORES

    public static final RegistryObject<ConfiguredFeature<?, ?>> ARCLIGHT_ORE = CONFIGURED_FEATURES.register("arclight_ore",
            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OVERWORLD_ARCLIGHT_ORES.get(),9)));

    public static final RegistryObject<ConfiguredFeature<?, ?>> CRYORIUM_ORE = CONFIGURED_FEATURES.register("cryorium_ore",
            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OVERWORLD_CRYORIUM_ORES.get(),9)));

    public static final RegistryObject<ConfiguredFeature<?, ?>> BLOODSTONE_ORE = CONFIGURED_FEATURES.register("bloodstone_ore",
            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OVERWORLD_BLOODSTONE_ORES   .get(),9)));

    public static final RegistryObject<ConfiguredFeature<?, ?>> END_JADE_ORE = CONFIGURED_FEATURES.register("end_jade_ore",
            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(END_JADE_ORES.get(), 9)));

    public static final RegistryObject<ConfiguredFeature<?, ?>> NETHER_MOONLIGHT_ORE = CONFIGURED_FEATURES.register("nether_moonlight_ore",
            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(NETHER_MOONLIGHT_ORES.get(), 9)));

    public static void register(IEventBus eventBus) {
        CONFIGURED_FEATURES.register(eventBus);
    }

}