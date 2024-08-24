package xanthian.copperandtuffbackport;

import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import xanthian.copperandtuffbackport.blocks.ModCopperBlocks;
import xanthian.copperandtuffbackport.blocks.ModTuffBlocks;
import xanthian.copperandtuffbackport.util.ModItems;
import xanthian.copperandtuffbackport.util.ModSounds;

@Mod(Initialise.MOD_ID)
@Mod.EventBusSubscriber
public class Initialise {
    public static final String MOD_ID = "copperandtuffbackport";

    public Initialise() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModTuffBlocks.BLOCKS.register(modEventBus);
        ModCopperBlocks.BLOCKS.register(modEventBus);

        ModItems.ITEMS.register(modEventBus);

        ModSounds.SOUND_EVENTS.register(modEventBus);

        modEventBus.addListener(this::clientSetup);

        MinecraftForge.EVENT_BUS.register(this);


    }

    private void clientSetup(final FMLClientSetupEvent event) {

            ItemBlockRenderTypes.setRenderLayer(ModCopperBlocks.COPPER_DOOR.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModCopperBlocks.COPPER_GRATE.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModCopperBlocks.COPPER_TRAPDOOR.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModCopperBlocks.EXPOSED_COPPER_DOOR.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModCopperBlocks.EXPOSED_COPPER_GRATE.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModCopperBlocks.EXPOSED_COPPER_TRAPDOOR.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModCopperBlocks.OXIDIZED_COPPER_DOOR.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModCopperBlocks.OXIDIZED_COPPER_GRATE.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModCopperBlocks.OXIDIZED_COPPER_TRAPDOOR.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModCopperBlocks.WEATHERED_COPPER_DOOR.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModCopperBlocks.WEATHERED_COPPER_GRATE.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModCopperBlocks.WEATHERED_COPPER_TRAPDOOR.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModCopperBlocks.WAXED_COPPER_DOOR.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModCopperBlocks.WAXED_COPPER_GRATE.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModCopperBlocks.WAXED_COPPER_TRAPDOOR.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModCopperBlocks.WAXED_EXPOSED_COPPER_DOOR.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModCopperBlocks.WAXED_EXPOSED_COPPER_GRATE.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModCopperBlocks.WAXED_EXPOSED_COPPER_TRAPDOOR.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModCopperBlocks.WAXED_OXIDIZED_COPPER_DOOR.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModCopperBlocks.WAXED_OXIDIZED_COPPER_GRATE.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModCopperBlocks.WAXED_OXIDIZED_COPPER_TRAPDOOR.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModCopperBlocks.WAXED_WEATHERED_COPPER_DOOR.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModCopperBlocks.WAXED_WEATHERED_COPPER_GRATE.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModCopperBlocks.WAXED_WEATHERED_COPPER_TRAPDOOR.get(), RenderType.translucent());

    }
}