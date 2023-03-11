package net.veroxuniverse.arclight.client;

import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.veroxuniverse.arclight.ArclightMod;
import net.veroxuniverse.arclight.block.entities.ModBlockEntities;
import net.veroxuniverse.arclight.client.customarmors.AngelArmor.AngelArmorRenderer;
import net.veroxuniverse.arclight.client.customarmors.ArclightArmor.ArclightArmorRenderer;
import net.veroxuniverse.arclight.client.customarmors.CopperKnight.CopperKnightArmorRenderer;
import net.veroxuniverse.arclight.client.customarmors.CryoriumArmor.CryoriumArmorRenderer;
import net.veroxuniverse.arclight.client.customarmors.JadeArmor.JadeArmorRenderer;
import net.veroxuniverse.arclight.client.customarmors.MoonlightArmor.MoonlightArmorRenderer;
import net.veroxuniverse.arclight.client.customarmors.ScorpionArmor.ScorpionArmorRenderer;
import net.veroxuniverse.arclight.client.customarmors.SculkArmor.SculkArmorRenderer;
import net.veroxuniverse.arclight.client.customarmors.ShadowArmor.ShadowArmorRenderer;
import net.veroxuniverse.arclight.client.customarmors.SteelArmor.SteelKnightArmorRenderer;
import net.veroxuniverse.arclight.client.customblocks.PedestalBlock.PedestalBlockRenderer;
import net.veroxuniverse.arclight.client.customitems.PedestalBlockItem.PedestalBlockItemRenderer;
import net.veroxuniverse.arclight.entity.EntityTypes;
import net.veroxuniverse.arclight.entity.client.AngelRenderer;
import net.veroxuniverse.arclight.item.*;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;
import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

@Mod.EventBusSubscriber(modid = ArclightMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ArclightClientMod {

    @SubscribeEvent
    public static void registerRenderers(final EntityRenderersEvent.RegisterRenderers event) {
        event.registerBlockEntityRenderer(ModBlockEntities.PEDESTAL_BLOCK_ENTITY.get(), PedestalBlockRenderer::new);
    }

    @SubscribeEvent
    public static void registerArmorRenderers(final EntityRenderersEvent.AddLayers event) {
        GeoArmorRenderer.registerArmorRenderer(ArclightArmorItem.class, new ArclightArmorRenderer());
        GeoArmorRenderer.registerArmorRenderer(MoonlightArmorItem.class, new MoonlightArmorRenderer());
        GeoArmorRenderer.registerArmorRenderer(ScorpionArmorItem.class, new ScorpionArmorRenderer());
        GeoArmorRenderer.registerArmorRenderer(CopperArmorItem.class, new CopperKnightArmorRenderer());
        GeoArmorRenderer.registerArmorRenderer(CryoArmorItem.class, new CryoriumArmorRenderer());
        GeoArmorRenderer.registerArmorRenderer(JadeArmorItem.class, new JadeArmorRenderer());
        GeoArmorRenderer.registerArmorRenderer(SculkArmorItem.class, new SculkArmorRenderer());
        GeoArmorRenderer.registerArmorRenderer(ShadowArmorItem.class, new ShadowArmorRenderer());
        GeoArmorRenderer.registerArmorRenderer(SteelArmorItem.class, new SteelKnightArmorRenderer());
        GeoArmorRenderer.registerArmorRenderer(AngelWingItem.class, new AngelArmorRenderer());
    }
}

