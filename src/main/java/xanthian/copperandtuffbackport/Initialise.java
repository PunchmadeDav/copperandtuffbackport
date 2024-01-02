package xanthian.copperandtuffbackport;

import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Items;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import xanthian.copperandtuffbackport.blocks.ModCopperBlocks;
import xanthian.copperandtuffbackport.blocks.ModTuffBlocks;
import xanthian.copperandtuffbackport.util.ModItemGroup;
import xanthian.copperandtuffbackport.util.ModItems;
import xanthian.copperandtuffbackport.util.ModSounds;

@Mod(Initialise.MOD_ID)
@Mod.EventBusSubscriber
public class Initialise {
    public static final String MOD_ID = "copperandtuffbackport";

    public Initialise() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItemGroup.CREATIVE_MODE_TABS.register(modEventBus);

        ModTuffBlocks.BLOCKS.register(modEventBus);
        ModCopperBlocks.BLOCKS.register(modEventBus);

        ModItems.ITEMS.register(modEventBus);

        ModSounds.SOUND_EVENTS.register(modEventBus);

        MinecraftForge.EVENT_BUS.register(this);

        modEventBus.addListener(this::addCreative);
    }

    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        if (event.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {

            event.getEntries().putAfter(Items.COPPER_BLOCK.getDefaultInstance(), ModCopperBlocks.CHISELED_COPPER.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putBefore(Items.CUT_COPPER.getDefaultInstance(), ModCopperBlocks.COPPER_GRATE.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(Items.CUT_COPPER_SLAB.getDefaultInstance(), ModCopperBlocks.COPPER_DOOR.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(ModCopperBlocks.COPPER_DOOR.get().asItem().getDefaultInstance(), ModCopperBlocks.COPPER_TRAPDOOR.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putBefore(Items.EXPOSED_COPPER.getDefaultInstance(), ModCopperBlocks.COPPER_BULB.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

            event.getEntries().putAfter(Items.EXPOSED_COPPER.getDefaultInstance(), ModCopperBlocks.EXPOSED_CHISELED_COPPER.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putBefore(Items.EXPOSED_CUT_COPPER.getDefaultInstance(), ModCopperBlocks.EXPOSED_COPPER_GRATE.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(Items.EXPOSED_CUT_COPPER_SLAB.getDefaultInstance(), ModCopperBlocks.EXPOSED_COPPER_DOOR.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(ModCopperBlocks.EXPOSED_COPPER_DOOR.get().asItem().getDefaultInstance(), ModCopperBlocks.EXPOSED_COPPER_TRAPDOOR.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putBefore(Items.WEATHERED_COPPER.getDefaultInstance(), ModCopperBlocks.EXPOSED_COPPER_BULB.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

            event.getEntries().putAfter(Items.WEATHERED_COPPER.getDefaultInstance(), ModCopperBlocks.WEATHERED_CHISELED_COPPER.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putBefore(Items.WEATHERED_CUT_COPPER.getDefaultInstance(), ModCopperBlocks.WEATHERED_COPPER_GRATE.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(Items.WEATHERED_CUT_COPPER_SLAB.getDefaultInstance(), ModCopperBlocks.WEATHERED_COPPER_DOOR.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(ModCopperBlocks.WEATHERED_COPPER_DOOR.get().asItem().getDefaultInstance(), ModCopperBlocks.WEATHERED_COPPER_TRAPDOOR.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putBefore(Items.OXIDIZED_COPPER.getDefaultInstance(), ModCopperBlocks.WEATHERED_COPPER_BULB.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

            event.getEntries().putAfter(Items.OXIDIZED_COPPER.getDefaultInstance(), ModCopperBlocks.OXIDIZED_CHISELED_COPPER.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putBefore(Items.OXIDIZED_CUT_COPPER.getDefaultInstance(), ModCopperBlocks.OXIDIZED_COPPER_GRATE.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(Items.OXIDIZED_CUT_COPPER_SLAB.getDefaultInstance(), ModCopperBlocks.OXIDIZED_COPPER_DOOR.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(ModCopperBlocks.OXIDIZED_COPPER_DOOR.get().asItem().getDefaultInstance(), ModCopperBlocks.OXIDIZED_COPPER_TRAPDOOR.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putBefore(Items.WAXED_COPPER_BLOCK.getDefaultInstance(), ModCopperBlocks.OXIDIZED_COPPER_BULB.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

            event.getEntries().putAfter(Items.WAXED_COPPER_BLOCK.getDefaultInstance(), ModCopperBlocks.WAXED_CHISELED_COPPER.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putBefore(Items.WAXED_CUT_COPPER.getDefaultInstance(), ModCopperBlocks.WAXED_COPPER_GRATE.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(Items.WAXED_CUT_COPPER_SLAB.getDefaultInstance(), ModCopperBlocks.WAXED_COPPER_DOOR.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(ModCopperBlocks.WAXED_COPPER_DOOR.get().asItem().getDefaultInstance(), ModCopperBlocks.WAXED_COPPER_TRAPDOOR.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putBefore(Items.WAXED_EXPOSED_COPPER.getDefaultInstance(), ModCopperBlocks.WAXED_COPPER_BULB.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

            event.getEntries().putAfter(Items.WAXED_EXPOSED_COPPER.getDefaultInstance(), ModCopperBlocks.WAXED_EXPOSED_CHISELED_COPPER.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putBefore(Items.WAXED_EXPOSED_CUT_COPPER.getDefaultInstance(), ModCopperBlocks.WAXED_EXPOSED_COPPER_GRATE.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(Items.WAXED_EXPOSED_CUT_COPPER_SLAB.getDefaultInstance(), ModCopperBlocks.WAXED_EXPOSED_COPPER_DOOR.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(ModCopperBlocks.WAXED_EXPOSED_COPPER_DOOR.get().asItem().getDefaultInstance(), ModCopperBlocks.WAXED_EXPOSED_COPPER_TRAPDOOR.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putBefore(Items.WAXED_WEATHERED_COPPER.getDefaultInstance(), ModCopperBlocks.WAXED_EXPOSED_COPPER_BULB.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

            event.getEntries().putAfter(Items.WAXED_WEATHERED_COPPER.getDefaultInstance(), ModCopperBlocks.WAXED_WEATHERED_CHISELED_COPPER.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putBefore(Items.WAXED_WEATHERED_CUT_COPPER.getDefaultInstance(), ModCopperBlocks.WAXED_WEATHERED_COPPER_GRATE.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(Items.WAXED_WEATHERED_CUT_COPPER_SLAB.getDefaultInstance(), ModCopperBlocks.WAXED_WEATHERED_COPPER_DOOR.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(ModCopperBlocks.WAXED_WEATHERED_COPPER_DOOR.get().asItem().getDefaultInstance(), ModCopperBlocks.WAXED_WEATHERED_COPPER_TRAPDOOR.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putBefore(Items.WAXED_OXIDIZED_COPPER.getDefaultInstance(), ModCopperBlocks.WAXED_WEATHERED_COPPER_BULB.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

            event.getEntries().putAfter(Items.WAXED_OXIDIZED_COPPER.getDefaultInstance(), ModCopperBlocks.WAXED_OXIDIZED_CHISELED_COPPER.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putBefore(Items.WAXED_OXIDIZED_CUT_COPPER.getDefaultInstance(), ModCopperBlocks.WAXED_OXIDIZED_COPPER_GRATE.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(Items.WAXED_OXIDIZED_CUT_COPPER_SLAB.getDefaultInstance(), ModCopperBlocks.WAXED_OXIDIZED_COPPER_DOOR.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(ModCopperBlocks.WAXED_OXIDIZED_COPPER_DOOR.get().asItem().getDefaultInstance(), ModCopperBlocks.WAXED_OXIDIZED_COPPER_TRAPDOOR.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(ModCopperBlocks.WAXED_OXIDIZED_COPPER_TRAPDOOR.get().asItem().getDefaultInstance(), ModCopperBlocks.WAXED_OXIDIZED_COPPER_BULB.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

            event.getEntries().putAfter(Items.REINFORCED_DEEPSLATE.getDefaultInstance(), Items.TUFF.getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(Items.TUFF.getDefaultInstance(), ModTuffBlocks.TUFF_STAIRS.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(ModTuffBlocks.TUFF_STAIRS.get().asItem().getDefaultInstance(), ModTuffBlocks.TUFF_SLAB.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(ModTuffBlocks.TUFF_SLAB.get().asItem().getDefaultInstance(), ModTuffBlocks.TUFF_WALL.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(ModTuffBlocks.TUFF_WALL.get().asItem().getDefaultInstance(), ModTuffBlocks.CHISELED_TUFF.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(ModTuffBlocks.CHISELED_TUFF.get().asItem().getDefaultInstance(), ModTuffBlocks.POLISHED_TUFF.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(ModTuffBlocks.POLISHED_TUFF.get().asItem().getDefaultInstance(), ModTuffBlocks.POLISHED_TUFF_STAIRS.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(ModTuffBlocks.POLISHED_TUFF_STAIRS.get().asItem().getDefaultInstance(), ModTuffBlocks.POLISHED_TUFF_SLAB.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(ModTuffBlocks.POLISHED_TUFF_SLAB.get().asItem().getDefaultInstance(), ModTuffBlocks.POLISHED_TUFF_WALL.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(ModTuffBlocks.POLISHED_TUFF_WALL.get().asItem().getDefaultInstance(), ModTuffBlocks.TUFF_BRICKS.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(ModTuffBlocks.TUFF_BRICKS.get().asItem().getDefaultInstance(), ModTuffBlocks.TUFF_BRICK_STAIRS.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(ModTuffBlocks.TUFF_BRICK_STAIRS.get().asItem().getDefaultInstance(), ModTuffBlocks.TUFF_BRICK_SLAB.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(ModTuffBlocks.TUFF_BRICK_SLAB.get().asItem().getDefaultInstance(), ModTuffBlocks.TUFF_BRICK_WALL.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(ModTuffBlocks.TUFF_BRICK_WALL.get().asItem().getDefaultInstance(), ModTuffBlocks.CHISELED_TUFF_BRICKS.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

        }
        if (event.getTabKey() == CreativeModeTabs.REDSTONE_BLOCKS) {

            event.getEntries().putAfter(Items.TARGET.getDefaultInstance(), ModCopperBlocks.WAXED_COPPER_BULB.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(ModCopperBlocks.WAXED_COPPER_BULB.get().asItem().getDefaultInstance(), ModCopperBlocks.WAXED_EXPOSED_COPPER_BULB.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(ModCopperBlocks.WAXED_EXPOSED_COPPER_BULB.get().asItem().getDefaultInstance(), ModCopperBlocks.WAXED_WEATHERED_COPPER_BULB.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(ModCopperBlocks.WAXED_WEATHERED_COPPER_BULB.get().asItem().getDefaultInstance(), ModCopperBlocks.WAXED_OXIDIZED_COPPER_BULB.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        }
        if (event.getTabKey() == CreativeModeTabs.FUNCTIONAL_BLOCKS) {

            event.getEntries().putAfter(Items.REDSTONE_LAMP.getDefaultInstance(), ModCopperBlocks.WAXED_COPPER_BULB.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(ModCopperBlocks.WAXED_COPPER_BULB.get().asItem().getDefaultInstance(), ModCopperBlocks.WAXED_EXPOSED_COPPER_BULB.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(ModCopperBlocks.WAXED_EXPOSED_COPPER_BULB.get().asItem().getDefaultInstance(), ModCopperBlocks.WAXED_WEATHERED_COPPER_BULB.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(ModCopperBlocks.WAXED_WEATHERED_COPPER_BULB.get().asItem().getDefaultInstance(), ModCopperBlocks.WAXED_OXIDIZED_COPPER_BULB.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        }
    }

    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {

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
}