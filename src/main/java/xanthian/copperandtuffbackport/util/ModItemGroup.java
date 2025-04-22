package xanthian.copperandtuffbackport.util;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroups;
import xanthian.copperandtuffbackport.blocks.ModCopperBlocks;
import xanthian.copperandtuffbackport.blocks.ModTuffBlocks;

public class ModItemGroup {

    public static void addToBuildingBlocks() {

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {

            content.addAfter(Blocks.COPPER_BLOCK, ModCopperBlocks.CHISELED_COPPER);
            content.addBefore(Blocks.CUT_COPPER, ModCopperBlocks.COPPER_GRATE);
            content.addAfter(Blocks.CUT_COPPER_SLAB, ModCopperBlocks.COPPER_DOOR);
            content.addAfter(ModCopperBlocks.COPPER_DOOR, ModCopperBlocks.COPPER_TRAPDOOR);
            content.addBefore(Blocks.EXPOSED_COPPER, ModCopperBlocks.COPPER_BULB);

            content.addAfter(Blocks.EXPOSED_COPPER, ModCopperBlocks.EXPOSED_CHISELED_COPPER);
            content.addBefore(Blocks.EXPOSED_CUT_COPPER, ModCopperBlocks.EXPOSED_COPPER_GRATE);
            content.addAfter(Blocks.EXPOSED_CUT_COPPER_SLAB, ModCopperBlocks.EXPOSED_COPPER_DOOR);
            content.addAfter(ModCopperBlocks.EXPOSED_COPPER_DOOR, ModCopperBlocks.EXPOSED_COPPER_TRAPDOOR);
            content.addBefore(Blocks.WEATHERED_COPPER, ModCopperBlocks.EXPOSED_COPPER_BULB);

            content.addAfter(Blocks.WEATHERED_COPPER, ModCopperBlocks.WEATHERED_CHISELED_COPPER);
            content.addBefore(Blocks.WEATHERED_CUT_COPPER, ModCopperBlocks.WEATHERED_COPPER_GRATE);
            content.addAfter(Blocks.WEATHERED_CUT_COPPER_SLAB, ModCopperBlocks.WEATHERED_COPPER_DOOR);
            content.addAfter(ModCopperBlocks.WEATHERED_COPPER_DOOR, ModCopperBlocks.WEATHERED_COPPER_TRAPDOOR);
            content.addBefore(Blocks.OXIDIZED_COPPER, ModCopperBlocks.WEATHERED_COPPER_BULB);

            content.addAfter(Blocks.OXIDIZED_COPPER, ModCopperBlocks.OXIDIZED_CHISELED_COPPER);
            content.addBefore(Blocks.OXIDIZED_CUT_COPPER, ModCopperBlocks.OXIDIZED_COPPER_GRATE);
            content.addAfter(Blocks.OXIDIZED_CUT_COPPER_SLAB, ModCopperBlocks.OXIDIZED_COPPER_DOOR);
            content.addAfter(ModCopperBlocks.OXIDIZED_COPPER_DOOR, ModCopperBlocks.OXIDIZED_COPPER_TRAPDOOR);
            content.addBefore(Blocks.WAXED_COPPER_BLOCK, ModCopperBlocks.OXIDIZED_COPPER_BULB);

            content.addAfter(Blocks.WAXED_COPPER_BLOCK, ModCopperBlocks.WAXED_CHISELED_COPPER);
            content.addBefore(Blocks.WAXED_CUT_COPPER, ModCopperBlocks.WAXED_COPPER_GRATE);
            content.addAfter(Blocks.WAXED_CUT_COPPER_SLAB, ModCopperBlocks.WAXED_COPPER_DOOR);
            content.addAfter(ModCopperBlocks.WAXED_COPPER_DOOR, ModCopperBlocks.WAXED_COPPER_TRAPDOOR);
            content.addBefore(Blocks.WAXED_EXPOSED_COPPER, ModCopperBlocks.WAXED_COPPER_BULB);

            content.addAfter(Blocks.WAXED_EXPOSED_COPPER, ModCopperBlocks.WAXED_EXPOSED_CHISELED_COPPER);
            content.addBefore(Blocks.WAXED_EXPOSED_CUT_COPPER, ModCopperBlocks.WAXED_EXPOSED_COPPER_GRATE);
            content.addAfter(Blocks.WAXED_EXPOSED_CUT_COPPER_SLAB, ModCopperBlocks.WAXED_EXPOSED_COPPER_DOOR);
            content.addAfter(ModCopperBlocks.WAXED_EXPOSED_COPPER_DOOR, ModCopperBlocks.WAXED_EXPOSED_COPPER_TRAPDOOR);
            content.addBefore(Blocks.WAXED_WEATHERED_COPPER, ModCopperBlocks.WAXED_EXPOSED_COPPER_BULB);

            content.addAfter(Blocks.WAXED_WEATHERED_COPPER, ModCopperBlocks.WAXED_WEATHERED_CHISELED_COPPER);
            content.addBefore(Blocks.WAXED_WEATHERED_CUT_COPPER, ModCopperBlocks.WAXED_WEATHERED_COPPER_GRATE);
            content.addAfter(Blocks.WAXED_WEATHERED_CUT_COPPER_SLAB, ModCopperBlocks.WAXED_WEATHERED_COPPER_DOOR);
            content.addAfter(ModCopperBlocks.WAXED_WEATHERED_COPPER_DOOR, ModCopperBlocks.WAXED_WEATHERED_COPPER_TRAPDOOR);
            content.addBefore(Blocks.WAXED_OXIDIZED_COPPER, ModCopperBlocks.WAXED_WEATHERED_COPPER_BULB);

            content.addAfter(Blocks.WAXED_OXIDIZED_COPPER, ModCopperBlocks.WAXED_OXIDIZED_CHISELED_COPPER);
            content.addBefore(Blocks.WAXED_OXIDIZED_CUT_COPPER, ModCopperBlocks.WAXED_OXIDIZED_COPPER_GRATE);
            content.addAfter(Blocks.WAXED_OXIDIZED_CUT_COPPER_SLAB, ModCopperBlocks.WAXED_OXIDIZED_COPPER_DOOR);
            content.addAfter(ModCopperBlocks.WAXED_OXIDIZED_COPPER_DOOR, ModCopperBlocks.WAXED_OXIDIZED_COPPER_TRAPDOOR);
            content.addAfter(ModCopperBlocks.WAXED_OXIDIZED_COPPER_TRAPDOOR, ModCopperBlocks.WAXED_OXIDIZED_COPPER_BULB);
        });
    }

    public static void addToRedstoneBlocks() {

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.REDSTONE).register(content -> {
            content.addAfter(Blocks.TARGET, ModCopperBlocks.WAXED_COPPER_BULB);
            content.addAfter(ModCopperBlocks.WAXED_COPPER_BULB, ModCopperBlocks.WAXED_EXPOSED_COPPER_BULB);
            content.addAfter(ModCopperBlocks.WAXED_EXPOSED_COPPER_BULB, ModCopperBlocks.WAXED_WEATHERED_COPPER_BULB);
            content.addAfter(ModCopperBlocks.WAXED_WEATHERED_COPPER_BULB, ModCopperBlocks.WAXED_OXIDIZED_COPPER_BULB);
        });
    }

    public static void addToFunctionalBlocks() {

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register(content -> {
            content.addAfter(Blocks.REDSTONE_LAMP, ModCopperBlocks.WAXED_COPPER_BULB);
            content.addAfter(ModCopperBlocks.WAXED_COPPER_BULB, ModCopperBlocks.WAXED_EXPOSED_COPPER_BULB);
            content.addAfter(ModCopperBlocks.WAXED_EXPOSED_COPPER_BULB, ModCopperBlocks.WAXED_WEATHERED_COPPER_BULB);
            content.addAfter(ModCopperBlocks.WAXED_WEATHERED_COPPER_BULB, ModCopperBlocks.WAXED_OXIDIZED_COPPER_BULB);
        });
    }

}
