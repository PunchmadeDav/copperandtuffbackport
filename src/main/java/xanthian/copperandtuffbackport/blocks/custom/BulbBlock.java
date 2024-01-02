package xanthian.copperandtuffbackport.blocks.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import org.jetbrains.annotations.NotNull;
import xanthian.copperandtuffbackport.util.ModSounds;

public class BulbBlock extends Block {
    public static final BooleanProperty POWERED = BlockStateProperties.POWERED;
    public static final BooleanProperty LIT = BlockStateProperties.LIT;

    public BulbBlock(BlockBehaviour.Properties settings) {
        super(settings);
        this.registerDefaultState(this.defaultBlockState().setValue(LIT, Boolean.valueOf(false)).setValue(POWERED, Boolean.valueOf(false)));
    }

    public void onPlace(BlockState state, @NotNull Level world, @NotNull BlockPos pos, BlockState oldState, boolean notify) {
        if (oldState.getBlock() != state.getBlock() && world instanceof ServerLevel serverWorld) {
            this.checkAndFlip(state, serverWorld, pos);
        }

    }

    public void neighborChanged(@NotNull BlockState state, @NotNull Level world, @NotNull BlockPos pos, @NotNull Block sourceBlock, @NotNull BlockPos sourcePos, boolean notify) {
        if (world instanceof ServerLevel serverWorld) {
            this.checkAndFlip(state, serverWorld, pos);
        }

    }

    public void checkAndFlip(BlockState state, ServerLevel world, BlockPos pos) {
        boolean bl = world.hasNeighborSignal(pos);
        if (bl != state.getValue(POWERED)) {
            BlockState blockState = state;
            if (!state.getValue(POWERED)) {
                blockState = state.cycle(LIT);
                world.playSound(null, pos, blockState.getValue(LIT) ? ModSounds.BLOCK_COPPER_BULB_TURN_ON.get() : ModSounds.BLOCK_COPPER_BULB_TURN_OFF.get(), SoundSource.BLOCKS);
            }
            world.setBlock(pos, blockState.setValue(POWERED, bl), 3);
        }
    }

    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(LIT, POWERED);
    }

    public boolean hasAnalogOutputSignal(@NotNull BlockState state) {
        return true;
    }

    public int getAnalogOutputSignal(@NotNull BlockState state, Level world, @NotNull BlockPos pos) {
        return world.getBlockState(pos).getValue(LIT) ? 15 : 0;
    }
}
