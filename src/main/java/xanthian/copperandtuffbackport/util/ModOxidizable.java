package xanthian.copperandtuffbackport.util;

import com.google.common.base.Suppliers;
import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableBiMap;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.ChangeOverTimeBlock;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.NotNull;
import xanthian.copperandtuffbackport.blocks.ModCopperBlocks;

import java.util.Optional;
import java.util.function.Supplier;

public interface ModOxidizable extends ChangeOverTimeBlock<ModOxidizable.CopperOxidizableLevel> {

    Supplier<BiMap<Block, Block>> NEXT_BY_BLOCK = Suppliers.memoize(() -> ImmutableBiMap.<Block, Block>builder()

            .put(ModCopperBlocks.COPPER_DOOR.get(), ModCopperBlocks.EXPOSED_COPPER_DOOR.get())
            .put(ModCopperBlocks.EXPOSED_COPPER_DOOR.get(), ModCopperBlocks.WEATHERED_COPPER_DOOR.get())
            .put(ModCopperBlocks.WEATHERED_COPPER_DOOR.get(), ModCopperBlocks.OXIDIZED_COPPER_DOOR.get())

            .put(ModCopperBlocks.COPPER_TRAPDOOR.get(), ModCopperBlocks.EXPOSED_COPPER_TRAPDOOR.get())
            .put(ModCopperBlocks.EXPOSED_COPPER_TRAPDOOR.get(), ModCopperBlocks.WEATHERED_COPPER_TRAPDOOR.get())
            .put(ModCopperBlocks.WEATHERED_COPPER_TRAPDOOR.get(), ModCopperBlocks.OXIDIZED_COPPER_TRAPDOOR.get())

            .put(ModCopperBlocks.COPPER_GRATE.get(), ModCopperBlocks.EXPOSED_COPPER_GRATE.get())
            .put(ModCopperBlocks.EXPOSED_COPPER_GRATE.get(), ModCopperBlocks.WEATHERED_COPPER_GRATE.get())
            .put(ModCopperBlocks.WEATHERED_COPPER_GRATE.get(), ModCopperBlocks.OXIDIZED_COPPER_GRATE.get())

            .put(ModCopperBlocks.COPPER_BULB.get(), ModCopperBlocks.EXPOSED_COPPER_BULB.get())
            .put(ModCopperBlocks.EXPOSED_COPPER_BULB.get(), ModCopperBlocks.WEATHERED_COPPER_BULB.get())
            .put(ModCopperBlocks.WEATHERED_COPPER_BULB.get(), ModCopperBlocks.OXIDIZED_COPPER_BULB.get())

            .put(ModCopperBlocks.CHISELED_COPPER.get(), ModCopperBlocks.EXPOSED_CHISELED_COPPER.get())
            .put(ModCopperBlocks.EXPOSED_CHISELED_COPPER.get(), ModCopperBlocks.WEATHERED_CHISELED_COPPER.get())
            .put(ModCopperBlocks.WEATHERED_CHISELED_COPPER.get(), ModCopperBlocks.OXIDIZED_CHISELED_COPPER.get())
            .build());
    java.util.function.Supplier<BiMap<Block, Block>> PREVIOUS_BY_BLOCK = Suppliers.memoize(() -> NEXT_BY_BLOCK.get().inverse());

    static Optional<Block> getPrevious(Block pBlock) {
        return Optional.ofNullable(PREVIOUS_BY_BLOCK.get().get(pBlock));
    }

    static Block getFirst(Block pBlock) {
        Block block = pBlock;

        for (Block block1 = PREVIOUS_BY_BLOCK.get().get(pBlock); block1 != null; block1 = PREVIOUS_BY_BLOCK.get().get(block1)) {
            block = block1;
        }

        return block;
    }

    static Optional<BlockState> getPrevious(BlockState pState) {
        return getPrevious(pState.getBlock()).map((block) -> block.withPropertiesOf(pState));
    }

    static Optional<Block> getNext(Block pBlock) {
        return Optional.ofNullable(NEXT_BY_BLOCK.get().get(pBlock));
    }

    static BlockState getFirst(BlockState pState) {
        return getFirst(pState.getBlock()).withPropertiesOf(pState);
    }

    default @NotNull Optional<BlockState> getNext(BlockState pState) {
        return getNext(pState.getBlock()).map((block) -> block.withPropertiesOf(pState));
    }

    default float getChanceModifier() {
        return this.getAge() == CopperOxidizableLevel.UNAFFECTED ? 0.75F : 1.0F;
    }

    enum CopperOxidizableLevel {
        UNAFFECTED,
        EXPOSED,
        WEATHERED,
        OXIDIZED;

        CopperOxidizableLevel() {
        }
    }
}
