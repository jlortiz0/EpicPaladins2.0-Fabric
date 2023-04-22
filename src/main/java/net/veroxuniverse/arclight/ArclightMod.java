package net.veroxuniverse.arclight;

import com.mojang.logging.LogUtils;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.veroxuniverse.arclight.block.entities.ModBlockEntities;
import net.veroxuniverse.arclight.entity.EntityTypes;
import net.veroxuniverse.arclight.entity.client.AngelRenderer;
import net.veroxuniverse.arclight.init.BlocksInit;
import net.veroxuniverse.arclight.init.ItemsInit;
import net.veroxuniverse.arclight.recipe.ModRecipes;
import net.veroxuniverse.arclight.screen.ArmorForgeScreen;
import net.veroxuniverse.arclight.screen.ModMenuTypes;
import net.veroxuniverse.arclight.world.feature.ModConfiguredFeatures;
import net.veroxuniverse.arclight.world.feature.ModPlacedFeatures;
import org.slf4j.Logger;
import software.bernie.geckolib3.GeckoLib;


public class ArclightMod {
    public static final  String MODID = "arclight";
    private static final Logger LOGGER = LogUtils.getLogger();

    public ArclightMod() {

        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        GeckoLib.initialize();

        ModConfiguredFeatures.register(modEventBus);
        ModPlacedFeatures.register(modEventBus);

        ModBlockEntities.register(modEventBus);

        ModMenuTypes.register(modEventBus);
        ModRecipes.register(modEventBus);

        ItemsInit.register(modEventBus);
        BlocksInit.register(modEventBus);

        EntityTypes.register(modEventBus);

    }

    @Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event){

            MenuScreens.register(ModMenuTypes.ARMOR_FORGE_MENU.get(), ArmorForgeScreen::new);
            EntityRenderers.register(EntityTypes.ANGEL.get(), AngelRenderer::new);
        }
    }

}
