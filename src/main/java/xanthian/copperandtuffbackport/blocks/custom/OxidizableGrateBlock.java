package xanthian.copperandtuffbackport.blocks.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.NotNull;
import xanthian.copperandtuffbackport.util.ModOxidizable;

import java.util.Random;

public class OxidizableGrateBlock extends GrateBlock implements ModOxidizable {

    private final CopperOxidizableLevel oxidationLevel;

    public OxidizableGrateBlock(CopperOxidizableLevel oxidationLevel, BlockBehaviour.Properties settings) {
        super(settings);
        this.oxidationLevel = oxidationLevel;
    }

    public void randomTick(@NotNull BlockState state, @NotNull ServerLevel world, @NotNull BlockPos pos, @NotNull Random random) {
        this.onRandomTick(state, world, pos, random);
    }

    public boolean isRandomlyTicking(BlockState state) {
        return ModOxidizable.getNext(state.getBlock()).isPresent();
    }

    public @NotNull CopperOxidizableLevel getAge() {
        return this.oxidationLevel;
    }
}
