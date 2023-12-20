package xanthian.copperandtuffbackport.blocks;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import xanthian.copperandtuffbackport.Initialise;
import xanthian.copperandtuffbackport.blocks.custom.*;
import xanthian.copperandtuffbackport.util.ModSounds;

import static net.minecraft.block.Blocks.*;

public class ModCopperBlocks {

    public static final Block CHISELED_COPPER = new OxidizableBlock(Oxidizable.OxidizationLevel.UNAFFECTED, FabricBlockSettings.copy(COPPER_BLOCK));
    public static final Block EXPOSED_CHISELED_COPPER = new OxidizableBlock(Oxidizable.OxidizationLevel.EXPOSED, FabricBlockSettings.copy(EXPOSED_COPPER));
    public static final Block OXIDIZED_CHISELED_COPPER = new OxidizableBlock(Oxidizable.OxidizationLevel.OXIDIZED, FabricBlockSettings.copy(OXIDIZED_COPPER));
    public static final Block WEATHERED_CHISELED_COPPER = new OxidizableBlock(Oxidizable.OxidizationLevel.WEATHERED, FabricBlockSettings.copy(WEATHERED_COPPER));
    public static final Block WAXED_CHISELED_COPPER = new Block(FabricBlockSettings.copy(CHISELED_COPPER));
    public static final Block WAXED_EXPOSED_CHISELED_COPPER = new Block(FabricBlockSettings.copy(EXPOSED_CHISELED_COPPER));
    public static final Block WAXED_OXIDIZED_CHISELED_COPPER = new Block(FabricBlockSettings.copy(OXIDIZED_CHISELED_COPPER));
    public static final Block WAXED_WEATHERED_CHISELED_COPPER = new Block(FabricBlockSettings.copy(WEATHERED_CHISELED_COPPER));

    public static final Block COPPER_DOOR = new OxidizableDoorBlock(Oxidizable.OxidizationLevel.UNAFFECTED, FabricBlockSettings.of(Material.METAL).mapColor(COPPER_BLOCK.getDefaultMapColor()).strength(3.0F, 6.0F).nonOpaque().requiresTool().sounds(BlockSoundGroup.COPPER));
    public static final Block WAXED_COPPER_DOOR = new ModDoorBlock(FabricBlockSettings.copy(COPPER_DOOR).sounds(BlockSoundGroup.COPPER));
    public static final Block EXPOSED_COPPER_DOOR = new OxidizableDoorBlock(Oxidizable.OxidizationLevel.EXPOSED, FabricBlockSettings.copy(COPPER_DOOR).mapColor(EXPOSED_COPPER.getDefaultMapColor()).sounds(BlockSoundGroup.COPPER));
    public static final Block WAXED_EXPOSED_COPPER_DOOR = new ModDoorBlock(FabricBlockSettings.copy(EXPOSED_COPPER_DOOR).sounds(BlockSoundGroup.COPPER));
    public static final Block OXIDIZED_COPPER_DOOR = new OxidizableDoorBlock(Oxidizable.OxidizationLevel.OXIDIZED, FabricBlockSettings.copy(COPPER_DOOR).mapColor(OXIDIZED_COPPER.getDefaultMapColor()).sounds(BlockSoundGroup.COPPER));
    public static final Block WAXED_OXIDIZED_COPPER_DOOR = new ModDoorBlock(FabricBlockSettings.copy(OXIDIZED_COPPER_DOOR).sounds(BlockSoundGroup.COPPER));
    public static final Block WEATHERED_COPPER_DOOR = new OxidizableDoorBlock(Oxidizable.OxidizationLevel.WEATHERED, FabricBlockSettings.copy(COPPER_DOOR).mapColor(WEATHERED_COPPER.getDefaultMapColor()).sounds(BlockSoundGroup.COPPER));
    public static final Block WAXED_WEATHERED_COPPER_DOOR = new ModDoorBlock(FabricBlockSettings.copy(WEATHERED_COPPER_DOOR).sounds(BlockSoundGroup.COPPER));

    public static final Block COPPER_TRAPDOOR = new OxidizableTrapdoorBlock(Oxidizable.OxidizationLevel.UNAFFECTED, FabricBlockSettings.of(Material.METAL).mapColor(COPPER_BLOCK.getDefaultMapColor()).strength(3.0F, 6.0F).requiresTool().nonOpaque().allowsSpawning(Blocks::never).sounds(BlockSoundGroup.COPPER));
    public static final Block WAXED_COPPER_TRAPDOOR = new ModTrapdoorBlock(FabricBlockSettings.copy(COPPER_TRAPDOOR).sounds(BlockSoundGroup.COPPER));
    public static final Block EXPOSED_COPPER_TRAPDOOR = new OxidizableTrapdoorBlock(Oxidizable.OxidizationLevel.EXPOSED, FabricBlockSettings.copy(COPPER_TRAPDOOR).mapColor(EXPOSED_COPPER.getDefaultMapColor()).sounds(BlockSoundGroup.COPPER));
    public static final Block WAXED_EXPOSED_COPPER_TRAPDOOR = new ModTrapdoorBlock(FabricBlockSettings.copy(EXPOSED_COPPER_TRAPDOOR).sounds(BlockSoundGroup.COPPER));
    public static final Block OXIDIZED_COPPER_TRAPDOOR = new OxidizableTrapdoorBlock(Oxidizable.OxidizationLevel.OXIDIZED, FabricBlockSettings.copy(COPPER_TRAPDOOR).mapColor(OXIDIZED_COPPER.getDefaultMapColor()).sounds(BlockSoundGroup.COPPER));
    public static final Block WAXED_OXIDIZED_COPPER_TRAPDOOR = new ModTrapdoorBlock(FabricBlockSettings.copy(OXIDIZED_COPPER_TRAPDOOR).sounds(BlockSoundGroup.COPPER));
    public static final Block WEATHERED_COPPER_TRAPDOOR = new OxidizableTrapdoorBlock(Oxidizable.OxidizationLevel.WEATHERED, FabricBlockSettings.copy(COPPER_TRAPDOOR).mapColor(WEATHERED_COPPER.getDefaultMapColor()).sounds(BlockSoundGroup.COPPER));
    public static final Block WAXED_WEATHERED_COPPER_TRAPDOOR = new ModTrapdoorBlock(FabricBlockSettings.copy(WEATHERED_COPPER_TRAPDOOR).sounds(BlockSoundGroup.COPPER));

    public static final Block COPPER_GRATE = new OxidizableGrateBlock(Oxidizable.OxidizationLevel.UNAFFECTED, FabricBlockSettings.of(Material.METAL).strength(3.0F, 6.0F).sounds(ModSounds.COPPER_GRATE).mapColor(MapColor.ORANGE).nonOpaque().requiresTool().allowsSpawning(Blocks::never).solidBlock(Blocks::never).suffocates(Blocks::never).blockVision(Blocks::never));
    public static final Block WAXED_COPPER_GRATE = new GrateBlock(FabricBlockSettings.copy(COPPER_GRATE));
    public static final Block EXPOSED_COPPER_GRATE = new OxidizableGrateBlock(Oxidizable.OxidizationLevel.EXPOSED, FabricBlockSettings.copy(COPPER_GRATE).mapColor(MapColor.TERRACOTTA_LIGHT_GRAY));
    public static final Block WAXED_EXPOSED_COPPER_GRATE = new GrateBlock(FabricBlockSettings.copy(EXPOSED_COPPER_GRATE));
    public static final Block WEATHERED_COPPER_GRATE = new OxidizableGrateBlock(Oxidizable.OxidizationLevel.WEATHERED, FabricBlockSettings.copy(COPPER_GRATE).mapColor(MapColor.DARK_AQUA));
    public static final Block WAXED_WEATHERED_COPPER_GRATE = new GrateBlock(FabricBlockSettings.copy(WEATHERED_COPPER_GRATE));
    public static final Block OXIDIZED_COPPER_GRATE = new OxidizableGrateBlock(Oxidizable.OxidizationLevel.OXIDIZED, FabricBlockSettings.copy(COPPER_GRATE).mapColor(MapColor.TEAL));
    public static final Block WAXED_OXIDIZED_COPPER_GRATE = new GrateBlock(FabricBlockSettings.copy(OXIDIZED_COPPER_GRATE));

    public static final Block COPPER_BULB = new OxidizableBulbBlock(Oxidizable.OxidizationLevel.UNAFFECTED, FabricBlockSettings.of(Material.METAL).mapColor(COPPER_BLOCK.getDefaultMapColor()).strength(3.0F, 6.0F).sounds(ModSounds.COPPER_BULB).requiresTool().solidBlock(Blocks::never).luminance(createLightLevelFromLitBlockState(15)));
    public static final Block WAXED_COPPER_BULB = new BulbBlock(FabricBlockSettings.copy(COPPER_BULB));
    public static final Block EXPOSED_COPPER_BULB = new OxidizableBulbBlock(Oxidizable.OxidizationLevel.EXPOSED, FabricBlockSettings.copy(COPPER_BULB).mapColor(MapColor.TERRACOTTA_LIGHT_GRAY).luminance(createLightLevelFromLitBlockState(12)));
    public static final Block WAXED_EXPOSED_COPPER_BULB = new BulbBlock(FabricBlockSettings.copy(EXPOSED_COPPER_BULB));
    public static final Block WEATHERED_COPPER_BULB = new OxidizableBulbBlock(Oxidizable.OxidizationLevel.WEATHERED, FabricBlockSettings.copy(COPPER_BULB).mapColor(MapColor.DARK_AQUA).luminance(createLightLevelFromLitBlockState(8)));
    public static final Block WAXED_WEATHERED_COPPER_BULB = new BulbBlock(FabricBlockSettings.copy(WEATHERED_COPPER_BULB));
    public static final Block OXIDIZED_COPPER_BULB = new OxidizableBulbBlock(Oxidizable.OxidizationLevel.OXIDIZED, FabricBlockSettings.copy(COPPER_BULB).mapColor(MapColor.TEAL).luminance(createLightLevelFromLitBlockState(4)));
    public static final Block WAXED_OXIDIZED_COPPER_BULB = new BulbBlock(FabricBlockSettings.copy(OXIDIZED_COPPER_BULB));

    public static void registerBlocks() {

        register("chiseled_copper", CHISELED_COPPER);
        register("exposed_chiseled_copper", EXPOSED_CHISELED_COPPER);
        register("oxidized_chiseled_copper", OXIDIZED_CHISELED_COPPER);
        register("weathered_chiseled_copper", WEATHERED_CHISELED_COPPER);
        register("waxed_chiseled_copper", WAXED_CHISELED_COPPER);
        register("waxed_exposed_chiseled_copper", WAXED_EXPOSED_CHISELED_COPPER);
        register("waxed_oxidized_chiseled_copper", WAXED_OXIDIZED_CHISELED_COPPER);
        register("waxed_weathered_chiseled_copper", WAXED_WEATHERED_CHISELED_COPPER);

        register("copper_door", COPPER_DOOR);
        register("exposed_copper_door", EXPOSED_COPPER_DOOR);
        register("oxidized_copper_door", OXIDIZED_COPPER_DOOR);
        register("weathered_copper_door", WEATHERED_COPPER_DOOR);
        register("waxed_copper_door", WAXED_COPPER_DOOR);
        register("waxed_exposed_copper_door", WAXED_EXPOSED_COPPER_DOOR);
        register("waxed_oxidized_copper_door", WAXED_OXIDIZED_COPPER_DOOR);
        register("waxed_weathered_copper_door", WAXED_WEATHERED_COPPER_DOOR);

        register("copper_trapdoor", COPPER_TRAPDOOR);
        register("exposed_copper_trapdoor", EXPOSED_COPPER_TRAPDOOR);
        register("oxidized_copper_trapdoor", OXIDIZED_COPPER_TRAPDOOR);
        register("weathered_copper_trapdoor", WEATHERED_COPPER_TRAPDOOR);
        register("waxed_copper_trapdoor", WAXED_COPPER_TRAPDOOR);
        register("waxed_exposed_copper_trapdoor", WAXED_EXPOSED_COPPER_TRAPDOOR);
        register("waxed_oxidized_copper_trapdoor", WAXED_OXIDIZED_COPPER_TRAPDOOR);
        register("waxed_weathered_copper_trapdoor", WAXED_WEATHERED_COPPER_TRAPDOOR);

        register("copper_grate", COPPER_GRATE);
        register("exposed_copper_grate", EXPOSED_COPPER_GRATE);
        register("oxidized_copper_grate", OXIDIZED_COPPER_GRATE);
        register("weathered_copper_grate", WEATHERED_COPPER_GRATE);
        register("waxed_copper_grate", WAXED_COPPER_GRATE);
        register("waxed_exposed_copper_grate", WAXED_EXPOSED_COPPER_GRATE);
        register("waxed_oxidized_copper_grate", WAXED_OXIDIZED_COPPER_GRATE);
        register("waxed_weathered_copper_grate", WAXED_WEATHERED_COPPER_GRATE);

        register("copper_bulb", COPPER_BULB);
        register("exposed_copper_bulb", EXPOSED_COPPER_BULB);
        register("oxidized_copper_bulb", OXIDIZED_COPPER_BULB);
        register("weathered_copper_bulb", WEATHERED_COPPER_BULB);
        register("waxed_copper_bulb", WAXED_COPPER_BULB);
        register("waxed_exposed_copper_bulb", WAXED_EXPOSED_COPPER_BULB);
        register("waxed_oxidized_copper_bulb", WAXED_OXIDIZED_COPPER_BULB);
        register("waxed_weathered_copper_bulb", WAXED_WEATHERED_COPPER_BULB);

    }

    private static void register(String name, Block block) {
        Identifier identifier = new Identifier(Initialise.MOD_ID, name);
        Registry.register(Registry.BLOCK, identifier, block);
        Registry.register(Registry.ITEM, identifier, new BlockItem(block, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
    }
}