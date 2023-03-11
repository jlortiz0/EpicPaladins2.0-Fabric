package net.veroxuniverse.arclight.client;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.veroxuniverse.arclight.ArclightMod;
import net.veroxuniverse.arclight.block.entities.ModBlockEntities;
import net.veroxuniverse.arclight.client.custom_armors.angel_armor.AngelArmorRenderer;
import net.veroxuniverse.arclight.client.custom_armors.arclight_armor.ArclightArmorRenderer;
import net.veroxuniverse.arclight.client.custom_armors.copper_knight.CopperKnightArmorRenderer;
import net.veroxuniverse.arclight.client.custom_armors.cryorium_armor.CryoriumArmorRenderer;
import net.veroxuniverse.arclight.client.custom_armors.jade_armor.JadeArmorRenderer;
import net.veroxuniverse.arclight.client.custom_armors.moonlight_armor.MoonlightArmorRenderer;
import net.veroxuniverse.arclight.client.custom_armors.scorpion_armor.ScorpionArmorRenderer;
import net.veroxuniverse.arclight.client.custom_armors.sculk_armor.SculkArmorRenderer;
import net.veroxuniverse.arclight.client.custom_armors.shadow_armor.ShadowArmorRenderer;
import net.veroxuniverse.arclight.client.custom_armors.steel_armor.SteelKnightArmorRenderer;
import net.veroxuniverse.arclight.client.custom_blocks.pedestal_block.PedestalBlockRenderer;
import net.veroxuniverse.arclight.item.*;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

@Mod.EventBusSubscriber(modid = ArclightMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ArclightClientMod {

    @SubscribeEvent
    public static void registerRenderers(final EntityRenderersEvent.RegisterRenderers event) {
        event.registerBlockEntityRenderer(ModBlockEntities.PEDESTAL_BLOCK_ENTITY.get(), PedestalBlockRenderer::new);
    }

    @SubscribeEvent
    public static void registerArmorRenderers(final EntityRenderersEvent.AddLayers event) {
        GeoArmorRenderer.registerArmorRenderer(ArclightArmorItem.class, ArclightArmorRenderer::new);
        GeoArmorRenderer.registerArmorRenderer(MoonlightArmorItem.class, MoonlightArmorRenderer::new);
        GeoArmorRenderer.registerArmorRenderer(ScorpionArmorItem.class, ScorpionArmorRenderer::new);
        GeoArmorRenderer.registerArmorRenderer(CopperArmorItem.class, CopperKnightArmorRenderer::new);
        GeoArmorRenderer.registerArmorRenderer(CryoArmorItem.class, CryoriumArmorRenderer::new);
        GeoArmorRenderer.registerArmorRenderer(JadeArmorItem.class, JadeArmorRenderer::new);
        GeoArmorRenderer.registerArmorRenderer(SculkArmorItem.class, SculkArmorRenderer::new);
        GeoArmorRenderer.registerArmorRenderer(ShadowArmorItem.class, ShadowArmorRenderer::new);
        GeoArmorRenderer.registerArmorRenderer(SteelArmorItem.class, SteelKnightArmorRenderer::new);
        GeoArmorRenderer.registerArmorRenderer(AngelWingItem.class, AngelArmorRenderer::new);
    }
}

