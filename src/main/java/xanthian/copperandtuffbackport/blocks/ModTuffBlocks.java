package xanthian.copperandtuffbackport.blocks;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import xanthian.copperandtuffbackport.Initialise;
import xanthian.copperandtuffbackport.util.ModItems;
import xanthian.copperandtuffbackport.util.ModSounds;

import java.util.function.Supplier;

public class ModTuffBlocks {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Initialise.MOD_ID);
    public static final RegistryObject<Block> TUFF_SLAB = register("tuff_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.TUFF)));
    public static final RegistryObject<Block> TUFF_STAIRS = register("tuff_stairs",
            () -> new StairBlock(Blocks.TUFF.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.TUFF)));
    public static final RegistryObject<Block> TUFF_WALL = register("tuff_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.TUFF).forceSolidOn()));
    public static final RegistryObject<Block> POLISHED_TUFF = register("polished_tuff",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.TUFF).sound(ModSounds.POLISHED_TUFF)));
    public static final RegistryObject<Block> POLISHED_TUFF_SLAB = register("polished_tuff_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(POLISHED_TUFF.get())));
    public static final RegistryObject<Block> POLISHED_TUFF_STAIRS = register("polished_tuff_stairs",
            () -> new StairBlock(POLISHED_TUFF.get().defaultBlockState(), BlockBehaviour.Properties.copy(POLISHED_TUFF.get())));
    public static final RegistryObject<Block> POLISHED_TUFF_WALL = register("polished_tuff_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(POLISHED_TUFF.get()).forceSolidOn()));
    public static final RegistryObject<Block> CHISELED_TUFF = register("chiseled_tuff",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.TUFF)));
    public static final RegistryObject<Block> TUFF_BRICKS = register("tuff_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.TUFF).sound(ModSounds.TUFF_BRICKS)));
    public static final RegistryObject<Block> TUFF_BRICK_SLAB = register("tuff_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(TUFF_BRICKS.get())));
    public static final RegistryObject<Block> TUFF_BRICK_STAIRS = register("tuff_brick_stairs",
            () -> new StairBlock(TUFF_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(TUFF_BRICKS.get())));
    public static final RegistryObject<Block> TUFF_BRICK_WALL = register("tuff_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(TUFF_BRICKS.get()).forceSolidOn()));
    public static final RegistryObject<Block> CHISELED_TUFF_BRICKS = register("chiseled_tuff_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(TUFF_BRICKS.get())));


    private static <T extends Block> RegistryObject<T> register(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<BlockItem> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

}
