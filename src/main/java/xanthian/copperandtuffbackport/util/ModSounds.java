package xanthian.copperandtuffbackport.util;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.common.util.ForgeSoundType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import xanthian.copperandtuffbackport.Initialise;

public class ModSounds {

    public static final DeferredRegister<SoundEvent> SOUND_EVENTS =
            DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, Initialise.MOD_ID);

    public static final RegistryObject<SoundEvent> BLOCK_TUFF_BRICKS_BREAK = registerSoundEvents("block.tuff_bricks.break");
    public static final RegistryObject<SoundEvent> BLOCK_TUFF_BRICKS_FALL = registerSoundEvents("block.tuff_bricks.fall");
    public static final RegistryObject<SoundEvent> BLOCK_TUFF_BRICKS_HIT = registerSoundEvents("block.tuff_bricks.hit");
    public static final RegistryObject<SoundEvent> BLOCK_TUFF_BRICKS_PLACE = registerSoundEvents("block.tuff_bricks.place");
    public static final RegistryObject<SoundEvent> BLOCK_TUFF_BRICKS_STEP = registerSoundEvents("block.tuff_bricks.step");
    public static final ForgeSoundType TUFF_BRICKS = new ForgeSoundType(1.0F, 1.0F,
            ModSounds.BLOCK_TUFF_BRICKS_BREAK, ModSounds.BLOCK_TUFF_BRICKS_STEP, ModSounds.BLOCK_TUFF_BRICKS_PLACE,
            ModSounds.BLOCK_TUFF_BRICKS_HIT, ModSounds.BLOCK_TUFF_BRICKS_FALL);
    public static final RegistryObject<SoundEvent> BLOCK_POLISHED_TUFF_BREAK = registerSoundEvents("block.polished_tuff.break");
    public static final RegistryObject<SoundEvent> BLOCK_POLISHED_TUFF_FALL = registerSoundEvents("block.polished_tuff.fall");
    public static final RegistryObject<SoundEvent> BLOCK_POLISHED_TUFF_HIT = registerSoundEvents("block.polished_tuff.hit");
    public static final RegistryObject<SoundEvent> BLOCK_POLISHED_TUFF_PLACE = registerSoundEvents("block.polished_tuff.place");
    public static final RegistryObject<SoundEvent> BLOCK_POLISHED_TUFF_STEP = registerSoundEvents("block.polished_tuff.step");
    public static final ForgeSoundType POLISHED_TUFF = new ForgeSoundType(1.0F, 1.0F,
            ModSounds.BLOCK_POLISHED_TUFF_BREAK, ModSounds.BLOCK_POLISHED_TUFF_STEP, ModSounds.BLOCK_POLISHED_TUFF_PLACE,
            ModSounds.BLOCK_POLISHED_TUFF_HIT, ModSounds.BLOCK_POLISHED_TUFF_FALL);
    public static final RegistryObject<SoundEvent> BLOCK_COPPER_BULB_BREAK = registerSoundEvents("block.copper_bulb.break");
    public static final RegistryObject<SoundEvent> BLOCK_COPPER_BULB_STEP = registerSoundEvents("block.copper_bulb.step");
    public static final RegistryObject<SoundEvent> BLOCK_COPPER_BULB_PLACE = registerSoundEvents("block.copper_bulb.place");
    public static final RegistryObject<SoundEvent> BLOCK_COPPER_BULB_HIT = registerSoundEvents("block.copper_bulb.hit");
    public static final RegistryObject<SoundEvent> BLOCK_COPPER_BULB_FALL = registerSoundEvents("block.copper_bulb.fall");
    public static final ForgeSoundType COPPER_BULB = new ForgeSoundType(1.0F, 1.0F,
            ModSounds.BLOCK_COPPER_BULB_BREAK, ModSounds.BLOCK_COPPER_BULB_STEP, ModSounds.BLOCK_COPPER_BULB_PLACE,
            ModSounds.BLOCK_COPPER_BULB_HIT, ModSounds.BLOCK_COPPER_BULB_FALL);
    public static final RegistryObject<SoundEvent> BLOCK_COPPER_BULB_TURN_ON = registerSoundEvents("block.copper_bulb.turn_on");
    public static final RegistryObject<SoundEvent> BLOCK_COPPER_BULB_TURN_OFF = registerSoundEvents("block.copper_bulb.turn_off");
    public static final RegistryObject<SoundEvent> BLOCK_COPPER_DOOR_CLOSE = registerSoundEvents("block.copper_door.close");
    public static final RegistryObject<SoundEvent> BLOCK_COPPER_DOOR_OPEN = registerSoundEvents("block.copper_door.open");
    public static final RegistryObject<SoundEvent> BLOCK_COPPER_GRATE_BREAK = registerSoundEvents("block.copper_grate.break");
    public static final RegistryObject<SoundEvent> BLOCK_COPPER_GRATE_STEP = registerSoundEvents("block.copper_grate.step");
    public static final RegistryObject<SoundEvent> BLOCK_COPPER_GRATE_PLACE = registerSoundEvents("block.copper_grate.place");
    public static final RegistryObject<SoundEvent> BLOCK_COPPER_GRATE_HIT = registerSoundEvents("block.copper_grate.hit");
    public static final RegistryObject<SoundEvent> BLOCK_COPPER_GRATE_FALL = registerSoundEvents("block.copper_grate.fall");
    public static final ForgeSoundType COPPER_GRATE = new ForgeSoundType(1.0F, 1.0F,
            ModSounds.BLOCK_COPPER_GRATE_BREAK, ModSounds.BLOCK_COPPER_GRATE_STEP, ModSounds.BLOCK_COPPER_GRATE_PLACE,
            ModSounds.BLOCK_COPPER_GRATE_HIT, ModSounds.BLOCK_COPPER_GRATE_FALL);
    public static final RegistryObject<SoundEvent> BLOCK_COPPER_TRAPDOOR_CLOSE = registerSoundEvents("block.copper_trapdoor.close");
    public static final RegistryObject<SoundEvent> BLOCK_COPPER_TRAPDOOR_OPEN = registerSoundEvents("block.copper_trapdoor.open");

    private static RegistryObject<SoundEvent> registerSoundEvents(String name) {
        ResourceLocation id = new ResourceLocation(Initialise.MOD_ID, name);
        return SOUND_EVENTS.register(name, () -> new SoundEvent(id));
    }

    public static void register(IEventBus eventBus) {
        SOUND_EVENTS.register(eventBus);
    }
}