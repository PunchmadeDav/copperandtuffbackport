package xanthian.copperandtuffbackport.blocks.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.DoorBlock;
import net.minecraft.block.Oxidizable;
import net.minecraft.block.enums.DoubleBlockHalf;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundCategory;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.event.GameEvent;
import xanthian.copperandtuffbackport.util.ModSounds;

import java.util.Random;

public class OxidizableDoorBlock extends DoorBlock implements Oxidizable {
    private final OxidationLevel oxidationLevel;

    public OxidizableDoorBlock(Oxidizable.OxidationLevel oxidationLevel, Settings settings) {
        super(settings);
        this.oxidationLevel = oxidationLevel;
    }

    public void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        if (state.get(DoorBlock.HALF) == DoubleBlockHalf.LOWER) {
            this.tickDegradation(state, world, pos, random);
        }
    }

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        state = state.cycle(OPEN);
        world.setBlockState(pos, state, Block.NOTIFY_LISTENERS | Block.REDRAW_ON_MAIN_THREAD);
        world.playSound(null, pos, state.get(OPEN) ? ModSounds.BLOCK_COPPER_DOOR_OPEN : ModSounds.BLOCK_COPPER_DOOR_CLOSE, SoundCategory.BLOCKS, 1F, 1F);
        //world.syncWorldEvent(player, state.get(OPEN) ? this.getOpenSoundEventId() : this.getCloseSoundEventId(), pos, 0);
        world.emitGameEvent(player, this.isOpen(state) ? GameEvent.BLOCK_OPEN : GameEvent.BLOCK_CLOSE, pos);
        return ActionResult.success(world.isClient);
    }

    public OxidationLevel getDegradationLevel() {
        return this.oxidationLevel;
    }
}
