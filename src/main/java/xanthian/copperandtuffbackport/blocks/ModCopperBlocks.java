package xanthian.copperandtuffbackport.blocks;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.DoorBlock;
import net.minecraft.world.level.block.TrapDoorBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import xanthian.copperandtuffbackport.Initialise;
import xanthian.copperandtuffbackport.blocks.custom.*;
import xanthian.copperandtuffbackport.util.ModBlockSetTypes;
import xanthian.copperandtuffbackport.util.ModItems;
import xanthian.copperandtuffbackport.util.ModOxidizable;
import xanthian.copperandtuffbackport.util.ModSounds;

import java.util.function.Supplier;
import java.util.function.ToIntFunction;

import static net.minecraft.data.BlockFamilies.EXPOSED_COPPER;


public class ModCopperBlocks {

    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, Initialise.MOD_ID);

    public static final RegistryObject<Block> CHISELED_COPPER = register("chiseled_copper",
            () -> new OxidizableFullBlock(ModOxidizable.CopperOxidizableLevel.UNAFFECTED, BlockBehaviour.Properties.copy(Blocks.COPPER_BLOCK)));
    public static final RegistryObject<Block> WAXED_CHISELED_COPPER = register("waxed_chiseled_copper",
            () -> new Block(BlockBehaviour.Properties.copy(CHISELED_COPPER.get())));
    public static final RegistryObject<Block> EXPOSED_CHISELED_COPPER = register("exposed_chiseled_copper",
            () -> new OxidizableFullBlock(ModOxidizable.CopperOxidizableLevel.EXPOSED, BlockBehaviour.Properties.copy(Blocks.EXPOSED_COPPER)));
    public static final RegistryObject<Block> WAXED_EXPOSED_CHISELED_COPPER = register("waxed_exposed_chiseled_copper",
            () -> new Block(BlockBehaviour.Properties.copy(EXPOSED_CHISELED_COPPER.get())));
    public static final RegistryObject<Block> OXIDIZED_CHISELED_COPPER = register("oxidized_chiseled_copper",
            () -> new OxidizableFullBlock(ModOxidizable.CopperOxidizableLevel.OXIDIZED, BlockBehaviour.Properties.copy(Blocks.OXIDIZED_COPPER)));
    public static final RegistryObject<Block> WAXED_OXIDIZED_CHISELED_COPPER = register("waxed_oxidized_chiseled_copper",
            () -> new Block(BlockBehaviour.Properties.copy(OXIDIZED_CHISELED_COPPER.get())));
    public static final RegistryObject<Block> WEATHERED_CHISELED_COPPER = register("weathered_chiseled_copper",
            () -> new OxidizableFullBlock(ModOxidizable.CopperOxidizableLevel.WEATHERED, BlockBehaviour.Properties.copy(Blocks.WEATHERED_COPPER)));
    public static final RegistryObject<Block> WAXED_WEATHERED_CHISELED_COPPER = register("waxed_weathered_chiseled_copper",
            () -> new Block(BlockBehaviour.Properties.copy(WEATHERED_CHISELED_COPPER.get())));

    public static final RegistryObject<Block> COPPER_DOOR = register("copper_door",
            () -> new OxidizableDoorBlock(ModBlockSetTypes.COPPER, ModOxidizable.CopperOxidizableLevel.UNAFFECTED, BlockBehaviour.Properties.of().mapColor(Blocks.COPPER_BLOCK.defaultMapColor()).strength(3.0F, 6.0F).noOcclusion().requiresCorrectToolForDrops().pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> WAXED_COPPER_DOOR = register("waxed_copper_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(COPPER_DOOR.get()), ModBlockSetTypes.COPPER));
    public static final RegistryObject<Block> EXPOSED_COPPER_DOOR = register("exposed_copper_door",
            () -> new OxidizableDoorBlock(ModBlockSetTypes.COPPER, ModOxidizable.CopperOxidizableLevel.EXPOSED, BlockBehaviour.Properties.copy(COPPER_DOOR.get()).mapColor(EXPOSED_COPPER.getBaseBlock().defaultMapColor())));
    public static final RegistryObject<Block> WAXED_EXPOSED_COPPER_DOOR = register("waxed_exposed_copper_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(EXPOSED_COPPER_DOOR.get()), ModBlockSetTypes.COPPER));
    public static final RegistryObject<Block> OXIDIZED_COPPER_DOOR = register("oxidized_copper_door",
            () -> new OxidizableDoorBlock(ModBlockSetTypes.COPPER, ModOxidizable.CopperOxidizableLevel.OXIDIZED, BlockBehaviour.Properties.copy(COPPER_DOOR.get()).mapColor(Blocks.OXIDIZED_COPPER.defaultMapColor())));
    public static final RegistryObject<Block> WAXED_OXIDIZED_COPPER_DOOR = register("waxed_oxidized_copper_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(OXIDIZED_COPPER_DOOR.get()), ModBlockSetTypes.COPPER));
    public static final RegistryObject<Block> WEATHERED_COPPER_DOOR = register("weathered_copper_door",
            () -> new OxidizableDoorBlock(ModBlockSetTypes.COPPER, ModOxidizable.CopperOxidizableLevel.WEATHERED, BlockBehaviour.Properties.copy(COPPER_DOOR.get()).mapColor(Blocks.WEATHERED_COPPER.defaultMapColor())));
    public static final RegistryObject<Block> WAXED_WEATHERED_COPPER_DOOR = register("waxed_weathered_copper_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(WEATHERED_COPPER_DOOR.get()), ModBlockSetTypes.COPPER));

    public static final RegistryObject<Block> COPPER_TRAPDOOR = register("copper_trapdoor",
            () -> new OxidizableTrapdoorBlock(ModBlockSetTypes.COPPER, ModOxidizable.CopperOxidizableLevel.UNAFFECTED, BlockBehaviour.Properties.of().mapColor(Blocks.COPPER_BLOCK.defaultMapColor()).strength(3.0F, 6.0F).requiresCorrectToolForDrops().noOcclusion().isValidSpawn(Blocks::never)));
    public static final RegistryObject<Block> WAXED_COPPER_TRAPDOOR = register("waxed_copper_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(COPPER_TRAPDOOR.get()), ModBlockSetTypes.COPPER));
    public static final RegistryObject<Block> EXPOSED_COPPER_TRAPDOOR = register("exposed_copper_trapdoor",
            () -> new OxidizableTrapdoorBlock(ModBlockSetTypes.COPPER, ModOxidizable.CopperOxidizableLevel.EXPOSED, BlockBehaviour.Properties.copy(COPPER_TRAPDOOR.get()).mapColor(Blocks.EXPOSED_COPPER.defaultMapColor())));
    public static final RegistryObject<Block> WAXED_EXPOSED_COPPER_TRAPDOOR = register("waxed_exposed_copper_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(EXPOSED_COPPER_TRAPDOOR.get()), ModBlockSetTypes.COPPER));
    public static final RegistryObject<Block> OXIDIZED_COPPER_TRAPDOOR = register("oxidized_copper_trapdoor",
            () -> new OxidizableTrapdoorBlock(ModBlockSetTypes.COPPER, ModOxidizable.CopperOxidizableLevel.OXIDIZED, BlockBehaviour.Properties.copy(COPPER_TRAPDOOR.get()).mapColor(Blocks.OXIDIZED_COPPER.defaultMapColor())));
    public static final RegistryObject<Block> WAXED_OXIDIZED_COPPER_TRAPDOOR = register("waxed_oxidized_copper_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(OXIDIZED_COPPER_TRAPDOOR.get()), ModBlockSetTypes.COPPER));
    public static final RegistryObject<Block> WEATHERED_COPPER_TRAPDOOR = register("weathered_copper_trapdoor",
            () -> new OxidizableTrapdoorBlock(ModBlockSetTypes.COPPER, ModOxidizable.CopperOxidizableLevel.WEATHERED, BlockBehaviour.Properties.copy(COPPER_TRAPDOOR.get()).mapColor(Blocks.WEATHERED_COPPER.defaultMapColor())));
    public static final RegistryObject<Block> WAXED_WEATHERED_COPPER_TRAPDOOR = register("waxed_weathered_copper_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(WEATHERED_COPPER_TRAPDOOR.get()), ModBlockSetTypes.COPPER));

    public static final RegistryObject<Block> COPPER_GRATE = register("copper_grate",
            () -> new OxidizableGrateBlock(ModOxidizable.CopperOxidizableLevel.UNAFFECTED, BlockBehaviour.Properties.of().strength(3.0F, 6.0F).sound(ModSounds.COPPER_GRATE).mapColor(MapColor.COLOR_ORANGE).noOcclusion().requiresCorrectToolForDrops().isValidSpawn(Blocks::never).isRedstoneConductor(Blocks::never).isSuffocating(Blocks::never).isViewBlocking(Blocks::never)));
    public static final RegistryObject<Block> WAXED_COPPER_GRATE = register("waxed_copper_grate",
            () -> new GrateBlock(BlockBehaviour.Properties.copy(COPPER_GRATE.get())));
    public static final RegistryObject<Block> EXPOSED_COPPER_GRATE = register("exposed_copper_grate",
            () -> new OxidizableGrateBlock(ModOxidizable.CopperOxidizableLevel.EXPOSED, BlockBehaviour.Properties.copy(COPPER_GRATE.get()).mapColor(MapColor.TERRACOTTA_LIGHT_GRAY)));
    public static final RegistryObject<Block> WAXED_EXPOSED_COPPER_GRATE = register("waxed_exposed_copper_grate",
            () -> new GrateBlock(BlockBehaviour.Properties.copy(EXPOSED_COPPER_GRATE.get())));
    public static final RegistryObject<Block> WEATHERED_COPPER_GRATE = register("weathered_copper_grate",
            () -> new OxidizableGrateBlock(ModOxidizable.CopperOxidizableLevel.WEATHERED, BlockBehaviour.Properties.copy(COPPER_GRATE.get()).mapColor(MapColor.WARPED_STEM)));
    public static final RegistryObject<Block> WAXED_WEATHERED_COPPER_GRATE = register("waxed_weathered_copper_grate",
            () -> new GrateBlock(BlockBehaviour.Properties.copy(WEATHERED_COPPER_GRATE.get())));
    public static final RegistryObject<Block> OXIDIZED_COPPER_GRATE = register("oxidized_copper_grate",
            () -> new OxidizableGrateBlock(ModOxidizable.CopperOxidizableLevel.OXIDIZED, BlockBehaviour.Properties.copy(COPPER_GRATE.get()).mapColor(MapColor.WARPED_NYLIUM)));
    public static final RegistryObject<Block> WAXED_OXIDIZED_COPPER_GRATE = register("waxed_oxidized_copper_grate",
            () -> new GrateBlock(BlockBehaviour.Properties.copy(OXIDIZED_COPPER_GRATE.get())));

    public static final RegistryObject<Block> COPPER_BULB = register("copper_bulb",
            () -> new OxidizableBulbBlock(ModOxidizable.CopperOxidizableLevel.UNAFFECTED, BlockBehaviour.Properties.of().mapColor(Blocks.COPPER_BLOCK.defaultMapColor()).strength(3.0F, 6.0F).sound(ModSounds.COPPER_BULB).requiresCorrectToolForDrops().isRedstoneConductor(Blocks::never).lightLevel(litBlockEmission(15))));
    public static final RegistryObject<Block> WAXED_COPPER_BULB = register("waxed_copper_bulb",
            () -> new BulbBlock(BlockBehaviour.Properties.copy(COPPER_BULB.get())));
    public static final RegistryObject<Block> EXPOSED_COPPER_BULB = register("exposed_copper_bulb",
            () -> new OxidizableBulbBlock(ModOxidizable.CopperOxidizableLevel.EXPOSED, BlockBehaviour.Properties.copy(COPPER_BULB.get()).mapColor(MapColor.TERRACOTTA_LIGHT_GRAY).lightLevel(litBlockEmission(12))));
    public static final RegistryObject<Block> WAXED_EXPOSED_COPPER_BULB = register("waxed_exposed_copper_bulb",
            () -> new BulbBlock(BlockBehaviour.Properties.copy(EXPOSED_COPPER_BULB.get())));
    public static final RegistryObject<Block> WEATHERED_COPPER_BULB = register("weathered_copper_bulb",
            () -> new OxidizableBulbBlock(ModOxidizable.CopperOxidizableLevel.WEATHERED, BlockBehaviour.Properties.copy(COPPER_BULB.get()).mapColor(MapColor.WARPED_STEM).lightLevel(litBlockEmission(8))));
    public static final RegistryObject<Block> WAXED_WEATHERED_COPPER_BULB = register("waxed_weathered_copper_bulb",
            () -> new BulbBlock(BlockBehaviour.Properties.copy(WEATHERED_COPPER_BULB.get())));
    public static final RegistryObject<Block> OXIDIZED_COPPER_BULB = register("oxidized_copper_bulb",
            () -> new OxidizableBulbBlock(ModOxidizable.CopperOxidizableLevel.OXIDIZED, BlockBehaviour.Properties.copy(COPPER_BULB.get()).mapColor(MapColor.WARPED_NYLIUM).lightLevel(litBlockEmission(4))));
    public static final RegistryObject<Block> WAXED_OXIDIZED_COPPER_BULB = register("waxed_oxidized_copper_bulb",
            () -> new BulbBlock(BlockBehaviour.Properties.copy(OXIDIZED_COPPER_BULB.get())));

    private static ToIntFunction<BlockState> litBlockEmission(int pLightValue) {
        return (state) -> state.getValue(BlockStateProperties.LIT) ? pLightValue : 0;
    }

    private static <T extends Block> RegistryObject<T> register(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<BlockItem> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }
}