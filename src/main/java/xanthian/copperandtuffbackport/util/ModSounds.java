package xanthian.copperandtuffbackport.util;

import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import xanthian.copperandtuffbackport.Initialise;

public class ModSounds {

    public static final SoundEvent BLOCK_COPPER_BULB_BREAK = register("block.copper_bulb.break");
    public static final SoundEvent BLOCK_COPPER_BULB_STEP = register("block.copper_bulb.step");
    public static final SoundEvent BLOCK_COPPER_BULB_PLACE = register("block.copper_bulb.place");
    public static final SoundEvent BLOCK_COPPER_BULB_HIT = register("block.copper_bulb.hit");
    public static final SoundEvent BLOCK_COPPER_BULB_FALL = register("block.copper_bulb.fall");
    public static final SoundEvent BLOCK_COPPER_BULB_TURN_ON = register("block.copper_bulb.turn_on");
    public static final SoundEvent BLOCK_COPPER_BULB_TURN_OFF = register("block.copper_bulb.turn_off");

    public static final SoundEvent BLOCK_COPPER_DOOR_CLOSE = register("block.copper_door.close");
    public static final SoundEvent BLOCK_COPPER_DOOR_OPEN = register("block.copper_door.open");

    public static final SoundEvent BLOCK_COPPER_GRATE_BREAK = register("block.copper_grate.break");
    public static final SoundEvent BLOCK_COPPER_GRATE_STEP = register("block.copper_grate.step");
    public static final SoundEvent BLOCK_COPPER_GRATE_PLACE = register("block.copper_grate.place");
    public static final SoundEvent BLOCK_COPPER_GRATE_HIT = register("block.copper_grate.hit");
    public static final SoundEvent BLOCK_COPPER_GRATE_FALL = register("block.copper_grate.fall");

    public static final SoundEvent BLOCK_COPPER_TRAPDOOR_CLOSE = register("block.copper_trapdoor.close");
    public static final SoundEvent BLOCK_COPPER_TRAPDOOR_OPEN = register("block.copper_trapdoor.open");

    public static final BlockSoundGroup COPPER_BULB = new BlockSoundGroup(1.0F, 1.0F,
            ModSounds.BLOCK_COPPER_BULB_BREAK, ModSounds.BLOCK_COPPER_BULB_STEP, ModSounds.BLOCK_COPPER_BULB_PLACE,
            ModSounds.BLOCK_COPPER_BULB_HIT, ModSounds.BLOCK_COPPER_BULB_FALL);

    public static final BlockSoundGroup COPPER_GRATE = new BlockSoundGroup(1.0F, 1.0F,
            ModSounds.BLOCK_COPPER_GRATE_BREAK, ModSounds.BLOCK_COPPER_GRATE_STEP, ModSounds.BLOCK_COPPER_GRATE_PLACE,
            ModSounds.BLOCK_COPPER_GRATE_HIT, ModSounds.BLOCK_COPPER_GRATE_FALL);

    private static SoundEvent register(String name) {
        Identifier id = new Identifier(Initialise.MOD_ID, name);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }

    public static void registerSounds() {
    }
}
