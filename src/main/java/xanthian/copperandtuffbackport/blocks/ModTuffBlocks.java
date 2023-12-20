package xanthian.copperandtuffbackport.blocks;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.WallBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import xanthian.copperandtuffbackport.Initialise;
import xanthian.copperandtuffbackport.blocks.custom.ModStairsBlock;
import xanthian.copperandtuffbackport.util.ModSounds;

import static net.minecraft.block.Blocks.TUFF;

public class ModTuffBlocks {

    public static final Block TUFF_SLAB = new SlabBlock(FabricBlockSettings.copy(TUFF));
    public static final Block TUFF_STAIRS = new ModStairsBlock(TUFF.getDefaultState(), FabricBlockSettings.copy(TUFF));
    public static final Block TUFF_WALL = new WallBlock(FabricBlockSettings.copy(TUFF));

    public static final Block POLISHED_TUFF = new Block(FabricBlockSettings.copy(TUFF).sounds(ModSounds.POLISHED_TUFF));
    public static final Block POLISHED_TUFF_SLAB = new SlabBlock(FabricBlockSettings.copy(POLISHED_TUFF));
    public static final Block POLISHED_TUFF_STAIRS = new ModStairsBlock(POLISHED_TUFF.getDefaultState(), FabricBlockSettings.copy(POLISHED_TUFF));
    public static final Block POLISHED_TUFF_WALL = new WallBlock(FabricBlockSettings.copy(POLISHED_TUFF));

    public static final Block CHISELED_TUFF = new Block(FabricBlockSettings.copy(TUFF));

    public static final Block TUFF_BRICKS = new Block(FabricBlockSettings.copy(TUFF).sounds(ModSounds.TUFF_BRICKS));
    public static final Block TUFF_BRICK_SLAB = new SlabBlock(FabricBlockSettings.copy(TUFF_BRICKS));
    public static final Block TUFF_BRICK_STAIRS = new ModStairsBlock(TUFF_BRICKS.getDefaultState(), FabricBlockSettings.copy(TUFF_BRICKS));
    public static final Block TUFF_BRICK_WALL = new WallBlock(FabricBlockSettings.copy(TUFF_BRICKS));
    public static final Block CHISELED_TUFF_BRICKS = new Block(FabricBlockSettings.copy(TUFF_BRICKS));

    public static void registerBlocks() {
        register("tuff_slab", TUFF_SLAB);
        register("tuff_stairs", TUFF_STAIRS);
        register("tuff_wall", TUFF_WALL);
        register("polished_tuff", POLISHED_TUFF);
        register("polished_tuff_slab", POLISHED_TUFF_SLAB);
        register("polished_tuff_stairs", POLISHED_TUFF_STAIRS);
        register("polished_tuff_wall", POLISHED_TUFF_WALL);
        register("chiseled_tuff", CHISELED_TUFF);
        register("tuff_bricks", TUFF_BRICKS);
        register("tuff_brick_slab", TUFF_BRICK_SLAB);
        register("tuff_brick_stairs", TUFF_BRICK_STAIRS);
        register("tuff_brick_wall", TUFF_BRICK_WALL);
        register("chiseled_tuff_bricks", CHISELED_TUFF_BRICKS);
    }

    private static void register(String name, Block block) {
        Identifier identifier = new Identifier(Initialise.MOD_ID, name);
        Registry.register(Registry.BLOCK, identifier, block);
        Registry.register(Registry.ITEM, identifier, new BlockItem(block, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
    }
}