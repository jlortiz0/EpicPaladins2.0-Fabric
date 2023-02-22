package net.veroxuniverse.arclight.client.customitems.MoonlightGlaive;

import net.veroxuniverse.arclight.item.MoonlightGlaiveItem;
import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

public class MoonlightGlaiveRenderer extends GeoItemRenderer<MoonlightGlaiveItem> {

    public MoonlightGlaiveRenderer() {
        super(new MoonlightGlaiveModel());
    }
}
