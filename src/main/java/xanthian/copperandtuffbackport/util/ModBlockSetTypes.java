package xanthian.copperandtuffbackport.util;

import it.unimi.dsi.fastutil.objects.ObjectArraySet;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.properties.BlockSetType;

import java.util.Set;
import java.util.stream.Stream;

public record ModBlockSetTypes() {
    private static final Set<BlockSetType> VALUES = new ObjectArraySet<>();
    public static final BlockSetType COPPER = register(new BlockSetType(
            "copper",
            true,
            SoundType.COPPER,
            ModSounds.BLOCK_COPPER_DOOR_CLOSE.get(),
            ModSounds.BLOCK_COPPER_TRAPDOOR_CLOSE.get(),
            ModSounds.BLOCK_COPPER_DOOR_OPEN.get(),
            ModSounds.BLOCK_COPPER_TRAPDOOR_OPEN.get(),
            SoundEvents.METAL_PRESSURE_PLATE_CLICK_OFF,
            SoundEvents.METAL_PRESSURE_PLATE_CLICK_ON,
            SoundEvents.STONE_BUTTON_CLICK_OFF,
            SoundEvents.STONE_BUTTON_CLICK_ON
    ));

    public static BlockSetType register(BlockSetType pValue) {
        VALUES.add(pValue);
        return pValue;
    }

    public static Stream<BlockSetType> values() {
        return VALUES.stream();
    }
}
