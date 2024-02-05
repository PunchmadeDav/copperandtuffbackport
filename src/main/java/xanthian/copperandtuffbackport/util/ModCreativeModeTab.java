package xanthian.copperandtuffbackport.util;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import org.jetbrains.annotations.NotNull;
import xanthian.copperandtuffbackport.blocks.ModCopperBlocks;

public class ModCreativeModeTab {
    public static final CreativeModeTab COPPER_TAB = new CreativeModeTab("copperandtuffbackport") {
        @Override
        public @NotNull ItemStack makeIcon() {
            return new ItemStack(ModCopperBlocks.COPPER_BULB.get());
        }
    };

}