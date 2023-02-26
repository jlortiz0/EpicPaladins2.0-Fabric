package net.veroxuniverse.arclight.client.customitems.PedestalBlockItem;

import net.veroxuniverse.arclight.item.PedestalBlockItem;
import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

public class PedestalBlockItemRenderer extends GeoItemRenderer<PedestalBlockItem> {
    public PedestalBlockItemRenderer() {
        super(new PedestalBlockItemModel());
    }

}