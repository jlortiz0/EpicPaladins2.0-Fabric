package net.veroxuniverse.arclight.client.customitems.CryoriumAxe;

import net.veroxuniverse.arclight.client.customitems.AngelSword.AngelSwordModel;
import net.veroxuniverse.arclight.item.AngelSwordItem;
import net.veroxuniverse.arclight.item.CryoriumAxeItem;
import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

public class CryoriumAxeRenderer extends GeoItemRenderer<CryoriumAxeItem> {

    public CryoriumAxeRenderer() {
        super(new CryoriumAxeModel());
    }
}
