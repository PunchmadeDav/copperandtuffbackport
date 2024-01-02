package xanthian.copperandtuffbackport.mixin;

import net.minecraft.core.BlockPos;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import xanthian.copperandtuffbackport.util.ModOxidizable;
import xanthian.copperandtuffbackport.util.ModWaxable;

import java.util.Optional;

@Mixin(AxeItem.class)
public abstract class AxeItemMixin {
    @ModifyVariable(
            method = "useOn",
            ordinal = 1,
            at = @At(
                    value = "STORE"
            )
    )
    private Optional<BlockState> copperandtuffbackport_modifyOxidizedBlock(
            Optional<BlockState> originalBlockState,
            UseOnContext context
    ) {
        if (originalBlockState.isPresent()) {
            return originalBlockState;
        }

        Level world = context.getLevel();
        BlockPos blockPos = context.getClickedPos();
        BlockState blockState = world.getBlockState(blockPos);

        return ModOxidizable.getPrevious(blockState);
    }

    @ModifyVariable(
            method = "useOn",
            ordinal = 2,
            at = @At(
                    value = "STORE"
            )
    )
    private Optional<BlockState> copperandtuffbackport_modifyWaxedBlock(
            Optional<BlockState> originalBlockState,
            UseOnContext context
    ) {
        if (originalBlockState.isPresent()) {
            return originalBlockState;
        }

        Level world = context.getLevel();
        BlockPos blockPos = context.getClickedPos();
        BlockState blockState = world.getBlockState(blockPos);

        return Optional.ofNullable(ModWaxable.SCRAPABLE.get().get(blockState.getBlock())).map((block) -> block.withPropertiesOf(blockState));
    }
}