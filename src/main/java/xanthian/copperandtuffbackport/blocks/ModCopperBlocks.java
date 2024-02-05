package xanthian.copperandtuffbackport.blocks;

import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import xanthian.copperandtuffbackport.Initialise;
import xanthian.copperandtuffbackport.blocks.custom.*;
import xanthian.copperandtuffbackport.util.ModCreativeModeTab;
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
            () -> new OxidizableFullBlock(ModOxidizable.CopperOxidizableLevel.UNAFFECTED, BlockBehaviour.Properties.copy(Blocks.COPPER_BLOCK)), ModCreativeModeTab.COPPER_TAB);
    public static final RegistryObject<Block> WAXED_CHISELED_COPPER = register("waxed_chiseled_copper",
            () -> new Block(BlockBehaviour.Properties.copy(CHISELED_COPPER.get())), ModCreativeModeTab.COPPER_TAB);
    public static final RegistryObject<Block> EXPOSED_CHISELED_COPPER = register("exposed_chiseled_copper",
            () -> new OxidizableFullBlock(ModOxidizable.CopperOxidizableLevel.EXPOSED, BlockBehaviour.Properties.copy(Blocks.EXPOSED_COPPER)), ModCreativeModeTab.COPPER_TAB);
    public static final RegistryObject<Block> WAXED_EXPOSED_CHISELED_COPPER = register("waxed_exposed_chiseled_copper",
            () -> new Block(BlockBehaviour.Properties.copy(EXPOSED_CHISELED_COPPER.get())), ModCreativeModeTab.COPPER_TAB);
    public static final RegistryObject<Block> OXIDIZED_CHISELED_COPPER = register("oxidized_chiseled_copper",
            () -> new OxidizableFullBlock(ModOxidizable.CopperOxidizableLevel.OXIDIZED, BlockBehaviour.Properties.copy(Blocks.OXIDIZED_COPPER)), ModCreativeModeTab.COPPER_TAB);
    public static final RegistryObject<Block> WAXED_OXIDIZED_CHISELED_COPPER = register("waxed_oxidized_chiseled_copper",
            () -> new Block(BlockBehaviour.Properties.copy(OXIDIZED_CHISELED_COPPER.get())), ModCreativeModeTab.COPPER_TAB);
    public static final RegistryObject<Block> WEATHERED_CHISELED_COPPER = register("weathered_chiseled_copper",
            () -> new OxidizableFullBlock(ModOxidizable.CopperOxidizableLevel.WEATHERED, BlockBehaviour.Properties.copy(Blocks.WEATHERED_COPPER)), ModCreativeModeTab.COPPER_TAB);
    public static final RegistryObject<Block> WAXED_WEATHERED_CHISELED_COPPER = register("waxed_weathered_chiseled_copper",
            () -> new Block(BlockBehaviour.Properties.copy(WEATHERED_CHISELED_COPPER.get())), ModCreativeModeTab.COPPER_TAB);

    public static final RegistryObject<Block> COPPER_DOOR = register("copper_door",
            () -> new OxidizableDoorBlock(ModOxidizable.CopperOxidizableLevel.UNAFFECTED, BlockBehaviour.Properties.of(Material.METAL).color(Blocks.COPPER_BLOCK.defaultMaterialColor()).strength(3.0F, 6.0F).noOcclusion().requiresCorrectToolForDrops()), ModCreativeModeTab.COPPER_TAB);
    public static final RegistryObject<Block> WAXED_COPPER_DOOR = register("waxed_copper_door",
            () -> new CopperDoorBlock(BlockBehaviour.Properties.copy(COPPER_DOOR.get())), ModCreativeModeTab.COPPER_TAB);
    public static final RegistryObject<Block> EXPOSED_COPPER_DOOR = register("exposed_copper_door",
            () -> new OxidizableDoorBlock(ModOxidizable.CopperOxidizableLevel.EXPOSED, BlockBehaviour.Properties.copy(COPPER_DOOR.get()).color(EXPOSED_COPPER.getBaseBlock().defaultMaterialColor())), ModCreativeModeTab.COPPER_TAB);
    public static final RegistryObject<Block> WAXED_EXPOSED_COPPER_DOOR = register("waxed_exposed_copper_door",
            () -> new CopperDoorBlock(BlockBehaviour.Properties.copy(EXPOSED_COPPER_DOOR.get())), ModCreativeModeTab.COPPER_TAB);
    public static final RegistryObject<Block> OXIDIZED_COPPER_DOOR = register("oxidized_copper_door",
            () -> new OxidizableDoorBlock(ModOxidizable.CopperOxidizableLevel.OXIDIZED, BlockBehaviour.Properties.copy(COPPER_DOOR.get()).color(Blocks.OXIDIZED_COPPER.defaultMaterialColor())), ModCreativeModeTab.COPPER_TAB);
    public static final RegistryObject<Block> WAXED_OXIDIZED_COPPER_DOOR = register("waxed_oxidized_copper_door",
            () -> new CopperDoorBlock(BlockBehaviour.Properties.copy(OXIDIZED_COPPER_DOOR.get())), ModCreativeModeTab.COPPER_TAB);
    public static final RegistryObject<Block> WEATHERED_COPPER_DOOR = register("weathered_copper_door",
            () -> new OxidizableDoorBlock(ModOxidizable.CopperOxidizableLevel.WEATHERED, BlockBehaviour.Properties.copy(COPPER_DOOR.get()).color(Blocks.WEATHERED_COPPER.defaultMaterialColor())), ModCreativeModeTab.COPPER_TAB);
    public static final RegistryObject<Block> WAXED_WEATHERED_COPPER_DOOR = register("waxed_weathered_copper_door",
            () -> new CopperDoorBlock(BlockBehaviour.Properties.copy(WEATHERED_COPPER_DOOR.get())), ModCreativeModeTab.COPPER_TAB);

    public static final RegistryObject<Block> COPPER_TRAPDOOR = register("copper_trapdoor",
            () -> new OxidizableTrapdoorBlock(ModOxidizable.CopperOxidizableLevel.UNAFFECTED, BlockBehaviour.Properties.of(Material.METAL).color(Blocks.COPPER_BLOCK.defaultMaterialColor()).strength(3.0F, 6.0F).requiresCorrectToolForDrops().noOcclusion().isValidSpawn(ModCopperBlocks::never)), ModCreativeModeTab.COPPER_TAB);
    public static final RegistryObject<Block> WAXED_COPPER_TRAPDOOR = register("waxed_copper_trapdoor",
            () -> new CopperTrapdoorBlock(BlockBehaviour.Properties.copy(COPPER_TRAPDOOR.get()).isValidSpawn(ModCopperBlocks::never)), ModCreativeModeTab.COPPER_TAB);
    public static final RegistryObject<Block> EXPOSED_COPPER_TRAPDOOR = register("exposed_copper_trapdoor",
            () -> new OxidizableTrapdoorBlock(ModOxidizable.CopperOxidizableLevel.EXPOSED, BlockBehaviour.Properties.copy(COPPER_TRAPDOOR.get()).color(Blocks.EXPOSED_COPPER.defaultMaterialColor()).isValidSpawn(ModCopperBlocks::never)), ModCreativeModeTab.COPPER_TAB);
    public static final RegistryObject<Block> WAXED_EXPOSED_COPPER_TRAPDOOR = register("waxed_exposed_copper_trapdoor",
            () -> new CopperTrapdoorBlock(BlockBehaviour.Properties.copy(EXPOSED_COPPER_TRAPDOOR.get()).isValidSpawn(ModCopperBlocks::never)), ModCreativeModeTab.COPPER_TAB);
    public static final RegistryObject<Block> OXIDIZED_COPPER_TRAPDOOR = register("oxidized_copper_trapdoor",
            () -> new OxidizableTrapdoorBlock(ModOxidizable.CopperOxidizableLevel.OXIDIZED, BlockBehaviour.Properties.copy(COPPER_TRAPDOOR.get()).color(Blocks.OXIDIZED_COPPER.defaultMaterialColor()).isValidSpawn(ModCopperBlocks::never)), ModCreativeModeTab.COPPER_TAB);
    public static final RegistryObject<Block> WAXED_OXIDIZED_COPPER_TRAPDOOR = register("waxed_oxidized_copper_trapdoor",
            () -> new CopperTrapdoorBlock(BlockBehaviour.Properties.copy(OXIDIZED_COPPER_TRAPDOOR.get()).isValidSpawn(ModCopperBlocks::never)), ModCreativeModeTab.COPPER_TAB);
    public static final RegistryObject<Block> WEATHERED_COPPER_TRAPDOOR = register("weathered_copper_trapdoor",
            () -> new OxidizableTrapdoorBlock(ModOxidizable.CopperOxidizableLevel.WEATHERED, BlockBehaviour.Properties.copy(COPPER_TRAPDOOR.get()).color(Blocks.WEATHERED_COPPER.defaultMaterialColor()).isValidSpawn(ModCopperBlocks::never)), ModCreativeModeTab.COPPER_TAB);
    public static final RegistryObject<Block> WAXED_WEATHERED_COPPER_TRAPDOOR = register("waxed_weathered_copper_trapdoor",
            () -> new CopperTrapdoorBlock(BlockBehaviour.Properties.copy(WEATHERED_COPPER_TRAPDOOR.get()).isValidSpawn(ModCopperBlocks::never)), ModCreativeModeTab.COPPER_TAB);

    public static final RegistryObject<Block> COPPER_GRATE = register("copper_grate",
            () -> new OxidizableGrateBlock(ModOxidizable.CopperOxidizableLevel.UNAFFECTED, BlockBehaviour.Properties.of(Material.METAL).strength(3.0F, 6.0F).sound(ModSounds.COPPER_GRATE).color(MaterialColor.COLOR_ORANGE).noOcclusion().requiresCorrectToolForDrops().isValidSpawn(ModCopperBlocks::never).isRedstoneConductor(ModCopperBlocks::never).isSuffocating(ModCopperBlocks::never).isViewBlocking(ModCopperBlocks::never)), ModCreativeModeTab.COPPER_TAB);
    public static final RegistryObject<Block> WAXED_COPPER_GRATE = register("waxed_copper_grate",
            () -> new GrateBlock(BlockBehaviour.Properties.copy(COPPER_GRATE.get()).isValidSpawn(ModCopperBlocks::never).isRedstoneConductor(ModCopperBlocks::never).isSuffocating(ModCopperBlocks::never).isViewBlocking(ModCopperBlocks::never)), ModCreativeModeTab.COPPER_TAB);
    public static final RegistryObject<Block> EXPOSED_COPPER_GRATE = register("exposed_copper_grate",
            () -> new OxidizableGrateBlock(ModOxidizable.CopperOxidizableLevel.EXPOSED, BlockBehaviour.Properties.copy(COPPER_GRATE.get()).color(MaterialColor.TERRACOTTA_LIGHT_GRAY).isValidSpawn(ModCopperBlocks::never).isRedstoneConductor(ModCopperBlocks::never).isSuffocating(ModCopperBlocks::never).isViewBlocking(ModCopperBlocks::never)), ModCreativeModeTab.COPPER_TAB);
    public static final RegistryObject<Block> WAXED_EXPOSED_COPPER_GRATE = register("waxed_exposed_copper_grate",
            () -> new GrateBlock(BlockBehaviour.Properties.copy(EXPOSED_COPPER_GRATE.get()).isValidSpawn(ModCopperBlocks::never).isRedstoneConductor(ModCopperBlocks::never).isSuffocating(ModCopperBlocks::never).isViewBlocking(ModCopperBlocks::never)), ModCreativeModeTab.COPPER_TAB);
    public static final RegistryObject<Block> WEATHERED_COPPER_GRATE = register("weathered_copper_grate",
            () -> new OxidizableGrateBlock(ModOxidizable.CopperOxidizableLevel.WEATHERED, BlockBehaviour.Properties.copy(COPPER_GRATE.get()).color(MaterialColor.WARPED_STEM).isValidSpawn(ModCopperBlocks::never).isRedstoneConductor(ModCopperBlocks::never).isSuffocating(ModCopperBlocks::never).isViewBlocking(ModCopperBlocks::never)), ModCreativeModeTab.COPPER_TAB);
    public static final RegistryObject<Block> WAXED_WEATHERED_COPPER_GRATE = register("waxed_weathered_copper_grate",
            () -> new GrateBlock(BlockBehaviour.Properties.copy(WEATHERED_COPPER_GRATE.get()).isValidSpawn(ModCopperBlocks::never).isRedstoneConductor(ModCopperBlocks::never).isSuffocating(ModCopperBlocks::never).isViewBlocking(ModCopperBlocks::never)), ModCreativeModeTab.COPPER_TAB);
    public static final RegistryObject<Block> OXIDIZED_COPPER_GRATE = register("oxidized_copper_grate",
            () -> new OxidizableGrateBlock(ModOxidizable.CopperOxidizableLevel.OXIDIZED, BlockBehaviour.Properties.copy(COPPER_GRATE.get()).color(MaterialColor.WARPED_NYLIUM).isValidSpawn(ModCopperBlocks::never).isRedstoneConductor(ModCopperBlocks::never).isSuffocating(ModCopperBlocks::never).isViewBlocking(ModCopperBlocks::never)), ModCreativeModeTab.COPPER_TAB);
    public static final RegistryObject<Block> WAXED_OXIDIZED_COPPER_GRATE = register("waxed_oxidized_copper_grate",
            () -> new GrateBlock(BlockBehaviour.Properties.copy(OXIDIZED_COPPER_GRATE.get()).isValidSpawn(ModCopperBlocks::never).isRedstoneConductor(ModCopperBlocks::never).isSuffocating(ModCopperBlocks::never).isViewBlocking(ModCopperBlocks::never)), ModCreativeModeTab.COPPER_TAB);

    public static final RegistryObject<Block> COPPER_BULB = register("copper_bulb",
            () -> new OxidizableBulbBlock(ModOxidizable.CopperOxidizableLevel.UNAFFECTED, BlockBehaviour.Properties.of(Material.METAL).color(Blocks.COPPER_BLOCK.defaultMaterialColor()).strength(3.0F, 6.0F).sound(ModSounds.COPPER_BULB).requiresCorrectToolForDrops().isRedstoneConductor(ModCopperBlocks::never).lightLevel(litBlockEmission(15))), ModCreativeModeTab.COPPER_TAB);
    public static final RegistryObject<Block> WAXED_COPPER_BULB = register("waxed_copper_bulb",
            () -> new BulbBlock(BlockBehaviour.Properties.copy(COPPER_BULB.get()).isRedstoneConductor(ModCopperBlocks::never).lightLevel(litBlockEmission(15))), ModCreativeModeTab.COPPER_TAB);
    public static final RegistryObject<Block> EXPOSED_COPPER_BULB = register("exposed_copper_bulb",
            () -> new OxidizableBulbBlock(ModOxidizable.CopperOxidizableLevel.EXPOSED, BlockBehaviour.Properties.copy(COPPER_BULB.get()).color(MaterialColor.TERRACOTTA_LIGHT_GRAY).isRedstoneConductor(ModCopperBlocks::never).lightLevel(litBlockEmission(12))), ModCreativeModeTab.COPPER_TAB);
    public static final RegistryObject<Block> WAXED_EXPOSED_COPPER_BULB = register("waxed_exposed_copper_bulb",
            () -> new BulbBlock(BlockBehaviour.Properties.copy(EXPOSED_COPPER_BULB.get()).isRedstoneConductor(ModCopperBlocks::never).lightLevel(litBlockEmission(12))), ModCreativeModeTab.COPPER_TAB);
    public static final RegistryObject<Block> WEATHERED_COPPER_BULB = register("weathered_copper_bulb",
            () -> new OxidizableBulbBlock(ModOxidizable.CopperOxidizableLevel.WEATHERED, BlockBehaviour.Properties.copy(COPPER_BULB.get()).color(MaterialColor.WARPED_STEM).isRedstoneConductor(ModCopperBlocks::never).lightLevel(litBlockEmission(8))), ModCreativeModeTab.COPPER_TAB);
    public static final RegistryObject<Block> WAXED_WEATHERED_COPPER_BULB = register("waxed_weathered_copper_bulb",
            () -> new BulbBlock(BlockBehaviour.Properties.copy(WEATHERED_COPPER_BULB.get()).isRedstoneConductor(ModCopperBlocks::never).lightLevel(litBlockEmission(8))), ModCreativeModeTab.COPPER_TAB);
    public static final RegistryObject<Block> OXIDIZED_COPPER_BULB = register("oxidized_copper_bulb",
            () -> new OxidizableBulbBlock(ModOxidizable.CopperOxidizableLevel.OXIDIZED, BlockBehaviour.Properties.copy(COPPER_BULB.get()).color(MaterialColor.WARPED_NYLIUM).isRedstoneConductor(ModCopperBlocks::never).lightLevel(litBlockEmission(4))), ModCreativeModeTab.COPPER_TAB);
    public static final RegistryObject<Block> WAXED_OXIDIZED_COPPER_BULB = register("waxed_oxidized_copper_bulb",
            () -> new BulbBlock(BlockBehaviour.Properties.copy(OXIDIZED_COPPER_BULB.get()).isRedstoneConductor(ModCopperBlocks::never).lightLevel(litBlockEmission(4))), ModCreativeModeTab.COPPER_TAB);

    private static <T extends Block> RegistryObject<T> register(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block,
                                                                            CreativeModeTab tab) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(tab)));
    }

    private static boolean never(BlockState state, BlockGetter world, BlockPos pos) {
        return false;
    }

    private static boolean never(BlockState state, BlockGetter world, BlockPos pos, EntityType<?> type) {
        return false;
    }

    private static ToIntFunction<BlockState> litBlockEmission(int pLightValue) {
        return (state) -> state.getValue(BlockStateProperties.LIT) ? pLightValue : 0;
    }
}