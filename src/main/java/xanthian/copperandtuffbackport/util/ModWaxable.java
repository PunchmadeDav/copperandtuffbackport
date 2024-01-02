package xanthian.copperandtuffbackport.util;

import com.google.common.base.Suppliers;
import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableBiMap;
import net.minecraft.world.level.block.Block;
import xanthian.copperandtuffbackport.blocks.ModCopperBlocks;

import java.util.function.Supplier;

@SuppressWarnings({"rawtypes", "unchecked"})
public class ModWaxable {
    public static final Supplier<BiMap<Block, Block>> WAXABLES = Suppliers.memoize(() -> (BiMap) ImmutableBiMap.builder()
            .put(ModCopperBlocks.COPPER_DOOR.get(), ModCopperBlocks.WAXED_COPPER_DOOR.get())
            .put(ModCopperBlocks.EXPOSED_COPPER_DOOR.get(), ModCopperBlocks.WAXED_EXPOSED_COPPER_DOOR.get())
            .put(ModCopperBlocks.WEATHERED_COPPER_DOOR.get(), ModCopperBlocks.WAXED_WEATHERED_COPPER_DOOR.get())
            .put(ModCopperBlocks.OXIDIZED_COPPER_DOOR.get(), ModCopperBlocks.WAXED_OXIDIZED_COPPER_DOOR.get())

            .put(ModCopperBlocks.COPPER_TRAPDOOR.get(), ModCopperBlocks.WAXED_COPPER_TRAPDOOR.get())
            .put(ModCopperBlocks.EXPOSED_COPPER_TRAPDOOR.get(), ModCopperBlocks.WAXED_EXPOSED_COPPER_TRAPDOOR.get())
            .put(ModCopperBlocks.WEATHERED_COPPER_TRAPDOOR.get(), ModCopperBlocks.WAXED_WEATHERED_COPPER_TRAPDOOR.get())
            .put(ModCopperBlocks.OXIDIZED_COPPER_TRAPDOOR.get(), ModCopperBlocks.WAXED_OXIDIZED_COPPER_TRAPDOOR.get())

            .put(ModCopperBlocks.COPPER_GRATE.get(), ModCopperBlocks.WAXED_COPPER_GRATE.get())
            .put(ModCopperBlocks.EXPOSED_COPPER_GRATE.get(), ModCopperBlocks.WAXED_EXPOSED_COPPER_GRATE.get())
            .put(ModCopperBlocks.WEATHERED_COPPER_GRATE.get(), ModCopperBlocks.WAXED_WEATHERED_COPPER_GRATE.get())
            .put(ModCopperBlocks.OXIDIZED_COPPER_GRATE.get(), ModCopperBlocks.WAXED_OXIDIZED_COPPER_GRATE.get())

            .put(ModCopperBlocks.COPPER_BULB.get(), ModCopperBlocks.WAXED_COPPER_BULB.get())
            .put(ModCopperBlocks.EXPOSED_COPPER_BULB.get(), ModCopperBlocks.WAXED_EXPOSED_COPPER_BULB.get())
            .put(ModCopperBlocks.WEATHERED_COPPER_BULB.get(), ModCopperBlocks.WAXED_WEATHERED_COPPER_BULB.get())
            .put(ModCopperBlocks.OXIDIZED_COPPER_BULB.get(), ModCopperBlocks.WAXED_OXIDIZED_COPPER_BULB.get())

            .put(ModCopperBlocks.CHISELED_COPPER.get(), ModCopperBlocks.WAXED_CHISELED_COPPER.get())
            .put(ModCopperBlocks.EXPOSED_CHISELED_COPPER.get(), ModCopperBlocks.WAXED_EXPOSED_CHISELED_COPPER.get())
            .put(ModCopperBlocks.WEATHERED_CHISELED_COPPER.get(), ModCopperBlocks.WAXED_WEATHERED_CHISELED_COPPER.get())
            .put(ModCopperBlocks.OXIDIZED_CHISELED_COPPER.get(), ModCopperBlocks.WAXED_OXIDIZED_CHISELED_COPPER.get())
            .build());

    public static final Supplier<BiMap<Block, Block>> SCRAPABLE = Suppliers.memoize(() -> (BiMap) ImmutableBiMap.builder()
            .put(ModCopperBlocks.WAXED_COPPER_DOOR.get(), ModCopperBlocks.COPPER_DOOR.get())
            .put(ModCopperBlocks.WAXED_EXPOSED_COPPER_DOOR.get(), ModCopperBlocks.EXPOSED_COPPER_DOOR.get())
            .put(ModCopperBlocks.WAXED_WEATHERED_COPPER_DOOR.get(), ModCopperBlocks.WEATHERED_COPPER_DOOR.get())
            .put(ModCopperBlocks.WAXED_OXIDIZED_COPPER_DOOR.get(), ModCopperBlocks.OXIDIZED_COPPER_DOOR.get())

            .put(ModCopperBlocks.WAXED_COPPER_TRAPDOOR.get(), ModCopperBlocks.COPPER_TRAPDOOR.get())
            .put(ModCopperBlocks.WAXED_EXPOSED_COPPER_TRAPDOOR.get(), ModCopperBlocks.EXPOSED_COPPER_TRAPDOOR.get())
            .put(ModCopperBlocks.WAXED_WEATHERED_COPPER_TRAPDOOR.get(), ModCopperBlocks.WEATHERED_COPPER_TRAPDOOR.get())
            .put(ModCopperBlocks.WAXED_OXIDIZED_COPPER_TRAPDOOR.get(), ModCopperBlocks.OXIDIZED_COPPER_TRAPDOOR.get())

            .put(ModCopperBlocks.WAXED_COPPER_GRATE.get(), ModCopperBlocks.COPPER_GRATE.get())
            .put(ModCopperBlocks.WAXED_EXPOSED_COPPER_GRATE.get(), ModCopperBlocks.EXPOSED_COPPER_GRATE.get())
            .put(ModCopperBlocks.WAXED_WEATHERED_COPPER_GRATE.get(), ModCopperBlocks.WEATHERED_COPPER_GRATE.get())
            .put(ModCopperBlocks.WAXED_OXIDIZED_COPPER_GRATE.get(), ModCopperBlocks.OXIDIZED_COPPER_GRATE.get())

            .put(ModCopperBlocks.WAXED_COPPER_BULB.get(), ModCopperBlocks.COPPER_BULB.get())
            .put(ModCopperBlocks.WAXED_EXPOSED_COPPER_BULB.get(), ModCopperBlocks.EXPOSED_COPPER_BULB.get())
            .put(ModCopperBlocks.WAXED_WEATHERED_COPPER_BULB.get(), ModCopperBlocks.WEATHERED_COPPER_BULB.get())
            .put(ModCopperBlocks.WAXED_OXIDIZED_COPPER_BULB.get(), ModCopperBlocks.OXIDIZED_COPPER_BULB.get())

            .put(ModCopperBlocks.WAXED_CHISELED_COPPER.get(), ModCopperBlocks.CHISELED_COPPER.get())
            .put(ModCopperBlocks.WAXED_EXPOSED_CHISELED_COPPER.get(), ModCopperBlocks.EXPOSED_CHISELED_COPPER.get())
            .put(ModCopperBlocks.WAXED_WEATHERED_CHISELED_COPPER.get(), ModCopperBlocks.WEATHERED_CHISELED_COPPER.get())
            .put(ModCopperBlocks.WAXED_OXIDIZED_CHISELED_COPPER.get(), ModCopperBlocks.OXIDIZED_CHISELED_COPPER.get())
            .build());
}
