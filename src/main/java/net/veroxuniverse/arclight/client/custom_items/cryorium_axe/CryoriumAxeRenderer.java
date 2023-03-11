package net.veroxuniverse.arclight.client.custom_items.cryorium_axe;

import net.veroxuniverse.arclight.item.CryoriumAxeItem;
import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

public class CryoriumAxeRenderer extends GeoItemRenderer<CryoriumAxeItem> {

    public CryoriumAxeRenderer() {
        super(new CryoriumAxeModel());
    }
}
