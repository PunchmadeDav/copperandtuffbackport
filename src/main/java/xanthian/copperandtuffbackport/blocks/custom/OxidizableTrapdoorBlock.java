package xanthian.copperandtuffbackport.blocks.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.TrapDoorBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.phys.BlockHitResult;
import org.jetbrains.annotations.NotNull;
import xanthian.copperandtuffbackport.util.ModOxidizable;

import java.util.Random;

public class OxidizableTrapdoorBlock extends TrapDoorBlock implements ModOxidizable {

    private final CopperOxidizableLevel oxidationLevel;


    public OxidizableTrapdoorBlock(CopperOxidizableLevel oxidationLevel, BlockBehaviour.Properties settings) {
        super(settings);
        this.oxidationLevel = oxidationLevel;
    }

    public @NotNull InteractionResult use(@NotNull BlockState pState, Level pLevel, @NotNull BlockPos pPos, @NotNull Player pPlayer, @NotNull InteractionHand pHand, @NotNull BlockHitResult pHit) {
        pState = pState.cycle(OPEN);
        pLevel.setBlock(pPos, pState, 2);
        if (pState.getValue(WATERLOGGED)) {
            pLevel.scheduleTick(pPos, Fluids.WATER, Fluids.WATER.getTickDelay(pLevel));
        }
        this.playSound(pPlayer, pLevel, pPos, pState.getValue(OPEN));
        return InteractionResult.sidedSuccess(pLevel.isClientSide);
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
