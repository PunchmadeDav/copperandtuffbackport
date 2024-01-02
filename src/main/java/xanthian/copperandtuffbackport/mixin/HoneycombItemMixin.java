package xanthian.copperandtuffbackport.mixin;

import com.google.common.collect.BiMap;
import net.minecraft.world.item.HoneycombItem;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import xanthian.copperandtuffbackport.util.ModWaxable;

import java.util.Optional;

@Mixin(HoneycombItem.class)
@SuppressWarnings({"rawtypes"})
public abstract class HoneycombItemMixin {
    @Inject(
            method = "getWaxed",
            at = @At("RETURN"),
            cancellable = true
    )
    private static void copperandtuffbackport_getWaxedState(
            BlockState state,
            CallbackInfoReturnable<Optional<BlockState>> callbackInfo
    ) {
        var blockState = callbackInfo.getReturnValue();

        if (blockState.isEmpty()) {
            blockState = Optional.ofNullable((Block) ((BiMap) ModWaxable.WAXABLES.get()).get(state.getBlock())).map((block) -> block.withPropertiesOf(state));

            callbackInfo.setReturnValue(blockState);
        }
    }
}