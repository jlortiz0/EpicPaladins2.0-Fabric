package net.veroxuniverse.arclight.client;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.veroxuniverse.arclight.ArclightMod;
import net.veroxuniverse.arclight.client.customarmors.ArclightArmor.ArclightArmorRenderer;
import net.veroxuniverse.arclight.client.customarmors.CopperKnight.CopperKnightArmorRenderer;
import net.veroxuniverse.arclight.client.customarmors.CryoriumArmor.CryoriumArmorRenderer;
import net.veroxuniverse.arclight.client.customarmors.MoonlightArmor.MoonlightArmorRenderer;
import net.veroxuniverse.arclight.client.customarmors.ScorpionArmor.ScorpionArmorRenderer;
import net.veroxuniverse.arclight.item.*;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

@Mod.EventBusSubscriber(modid = ArclightMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ArclightClientMod {

    @SubscribeEvent
    public static void registerArmorRenderers(final EntityRenderersEvent.AddLayers event) {
        GeoArmorRenderer.registerArmorRenderer(ArclightArmorItem.class, new ArclightArmorRenderer());
        GeoArmorRenderer.registerArmorRenderer(MoonlightArmorItem.class, new MoonlightArmorRenderer());
        GeoArmorRenderer.registerArmorRenderer(ScorpionArmorItem.class, new ScorpionArmorRenderer());
        GeoArmorRenderer.registerArmorRenderer(CopperArmorItem.class, new CopperKnightArmorRenderer());
        GeoArmorRenderer.registerArmorRenderer(CryoArmorItem.class, new CryoriumArmorRenderer());
    }
}

