package net.veroxuniverse.arclight;

import net.fabricmc.api.ModInitializer;
import java.util.logging.Logger;
import software.bernie.geckolib3.GeckoLib;


public class ArclightMod implements ModInitializer {
    public static final String MODID = "arclight";
    private static final Logger LOGGER = Logger.getLogger(MODID);

    public void onInitialize() {
        GeckoLib.initialize();
    }
}
