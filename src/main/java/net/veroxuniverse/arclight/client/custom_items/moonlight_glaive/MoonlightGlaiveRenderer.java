package net.veroxuniverse.arclight.client.custom_items.moonlight_glaive;

import net.veroxuniverse.arclight.item.MoonlightGlaiveItem;
import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

public class MoonlightGlaiveRenderer extends GeoItemRenderer<MoonlightGlaiveItem> {

    public MoonlightGlaiveRenderer() {
        super(new MoonlightGlaiveModel());
    }
}
