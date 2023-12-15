package xanthian.copperandtuffbackport;

import net.fabricmc.api.ModInitializer;
import xanthian.copperandtuffbackport.blocks.ModCopperBlocks;
import xanthian.copperandtuffbackport.blocks.ModTuffBlocks;
import xanthian.copperandtuffbackport.util.ModItemGroup;
import xanthian.copperandtuffbackport.util.ModRegistries;
import xanthian.copperandtuffbackport.util.ModSounds;

public class Initialise implements ModInitializer {

    public static final String MOD_ID = "copperandtuffbackport";

    @Override
    public void onInitialize() {

        ModCopperBlocks.registerBlocks();
        ModTuffBlocks.registerBlocks();

        ModItemGroup.addToBuildingBlocks();
        ModItemGroup.addToRedstoneBlocks();
        ModItemGroup.addToFunctionalBlocks();
        ModSounds.registerSounds();
        ModRegistries.registerOxidizableBlocks();

    }
}
