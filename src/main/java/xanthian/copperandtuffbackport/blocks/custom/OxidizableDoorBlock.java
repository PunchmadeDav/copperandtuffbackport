package xanthian.copperandtuffbackport.blocks.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.DoorBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.DoubleBlockHalf;
import net.minecraft.world.level.gameevent.GameEvent;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.phys.BlockHitResult;
import org.jetbrains.annotations.NotNull;
import xanthian.copperandtuffbackport.util.ModOxidizable;

import java.util.Random;

public class OxidizableDoorBlock extends DoorBlock implements ModOxidizable {
    private final CopperOxidizableLevel oxidationLevel;

    public OxidizableDoorBlock(CopperOxidizableLevel oxidationLevel, BlockBehaviour.Properties settings) {
        super(settings);
        this.oxidationLevel = oxidationLevel;
    }

    public void randomTick(BlockState state, @NotNull ServerLevel world, @NotNull BlockPos pos, @NotNull Random random) {
        if (state.getValue(DoorBlock.HALF) == DoubleBlockHalf.LOWER) {
            this.onRandomTick(state, world, pos, random);
        }
    }

    public boolean isRandomlyTicking(BlockState state) {
        return ModOxidizable.getNext(state.getBlock()).isPresent();
    }

    @Override
    public @NotNull BlockState updateShape(BlockState pState, Direction pFacing, @NotNull BlockState pFacingState, @NotNull LevelAccessor pLevel, @NotNull BlockPos pCurrentPos, @NotNull BlockPos pFacingPos) {
        DoubleBlockHalf doubleblockhalf = pState.getValue(HALF);
        if (pFacing.getAxis() == Direction.Axis.Y && doubleblockhalf == DoubleBlockHalf.LOWER == (pFacing == Direction.UP)) {
            return pFacingState.getBlock() instanceof OxidizableDoorBlock && pFacingState.getValue(HALF) != doubleblockhalf ? pFacingState.setValue(HALF, doubleblockhalf) : Blocks.AIR.defaultBlockState();
        } else {
            return doubleblockhalf == DoubleBlockHalf.LOWER && pFacing == Direction.DOWN && !pState.canSurvive(pLevel, pCurrentPos) ? Blocks.AIR.defaultBlockState() : super.updateShape(pState, pFacing, pFacingState, pLevel, pCurrentPos, pFacingPos);
        }
    }

    public @NotNull InteractionResult use(@NotNull BlockState pState, @NotNull Level pLevel, @NotNull BlockPos pPos, @NotNull Player pPlayer, @NotNull InteractionHand pHand, BlockHitResult pHit) {
        pState = pState.cycle(OPEN);
        pLevel.setBlock(pPos, pState, 10);
        pLevel.levelEvent(pPlayer, pState.getValue(OPEN) ? this.getOpenSound() : this.getCloseSound(), pPos, 0);
        pLevel.gameEvent(pPlayer, this.isOpen(pState) ? GameEvent.BLOCK_OPEN : GameEvent.BLOCK_CLOSE, pPos);
        return InteractionResult.sidedSuccess(pLevel.isClientSide);
    }

    private int getCloseSound() {
        return this.material == Material.METAL ? 1011 : 1012;
    }

    private int getOpenSound() {
        return this.material == Material.METAL ? 1005 : 1006;
    }

    public @NotNull CopperOxidizableLevel getAge() {
        return this.oxidationLevel;
    }
}
