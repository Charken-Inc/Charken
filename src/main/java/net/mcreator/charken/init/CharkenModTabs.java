
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.charken.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.charken.CharkenMod;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class CharkenModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CharkenMod.MODID);
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> CHERNKAIN = REGISTRY.register("chernkain",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.charken.chernkain")).icon(() -> new ItemStack(CharkenModItems.LASSO.get())).displayItems((parameters, tabData) -> {
				tabData.accept(CharkenModItems.CHARKEN_SPAWN_EGG.get());
				tabData.accept(CharkenModItems.YOLKTRIEN_SPAWN_EGG.get());
				tabData.accept(CharkenModItems.LASSO.get());
				tabData.accept(CharkenModItems.CHARKENLEG.get());
				tabData.accept(CharkenModItems.RAWCHARKEN_LEG.get());
				tabData.accept(CharkenModBlocks.EGGSTONE.get().asItem());
				tabData.accept(CharkenModBlocks.EGGSTONEBRICKS.get().asItem());
				tabData.accept(CharkenModBlocks.EGGGRASS.get().asItem());
				tabData.accept(CharkenModBlocks.EGGDIRT.get().asItem());
				tabData.accept(CharkenModBlocks.YOLKBLOCK.get().asItem());
				tabData.accept(CharkenModItems.YOLK.get());
				tabData.accept(CharkenModItems.FLINGSHOT.get());
				tabData.accept(CharkenModItems.YOLKLIQ_BUCKET.get());
				tabData.accept(CharkenModItems.WARLM_SPAWN_EGG.get());
				tabData.accept(CharkenModBlocks.EGGBRICKS.get().asItem());
				tabData.accept(CharkenModItems.EGGBRICK.get());
				tabData.accept(CharkenModBlocks.EGG_LOG.get().asItem());
				tabData.accept(CharkenModBlocks.EGG_PLANKS.get().asItem());
				tabData.accept(CharkenModBlocks.EGG_LEAVES.get().asItem());
				tabData.accept(CharkenModBlocks.EGG_STONE_BRICK_STAIRS.get().asItem());
				tabData.accept(CharkenModBlocks.EGG_STONE_BRICK_WALL.get().asItem());
				tabData.accept(CharkenModBlocks.EGG_SAPLING.get().asItem());
				tabData.accept(CharkenModItems.CHARKEN_DISK.get());
				tabData.accept(CharkenModBlocks.EGG_STONE_BRICK_SLAB.get().asItem());
				tabData.accept(CharkenModBlocks.EGG_STAIRS.get().asItem());
				tabData.accept(CharkenModBlocks.EGG_FENCE.get().asItem());
				tabData.accept(CharkenModBlocks.EGG_FENCE_GATE.get().asItem());
				tabData.accept(CharkenModBlocks.EGG_BUTTON.get().asItem());
				tabData.accept(CharkenModBlocks.EGG_PRESSURE_PLATE.get().asItem());
				tabData.accept(CharkenModBlocks.EGG_DOOR.get().asItem());
				tabData.accept(CharkenModBlocks.EGG_TRAPDOOR.get().asItem());
				tabData.accept(CharkenModBlocks.EGG_SLAB.get().asItem());
				tabData.accept(CharkenModItems.MOVIE_SWORD.get());
				tabData.accept(CharkenModItems.BLADE.get());
				tabData.accept(CharkenModItems.CHARKLEY_SPAWN_EGG.get());
				tabData.accept(CharkenModBlocks.CHARKEN_EGG.get().asItem());
				tabData.accept(CharkenModItems.CHICKEN_LEG.get());
				tabData.accept(CharkenModItems.RAW_CHICKEN_LEG.get());
				tabData.accept(CharkenModBlocks.CHARKEN_SIGN.get().asItem());
				tabData.accept(CharkenModItems.CHARKEN_SPRAY.get());
				tabData.accept(CharkenModBlocks.SCAM_TRAY.get().asItem());
				tabData.accept(CharkenModItems.GOATIN_SPAWN_EGG.get());
				tabData.accept(CharkenModBlocks.POSTER.get().asItem());
			}).build());
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> TURTKAIN = REGISTRY.register("turtkain",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.charken.turtkain")).icon(() -> new ItemStack(CharkenModItems.TURTKEN_SHELL.get())).displayItems((parameters, tabData) -> {
				tabData.accept(CharkenModItems.TURTKEN_SPAWN_EGG.get());
				tabData.accept(CharkenModItems.TURTKEN_SHELL.get());
				tabData.accept(CharkenModItems.TURTKEN_SHELL_CHUNK.get());
				tabData.accept(CharkenModItems.COMPRESSED_SEAGRASS.get());
				tabData.accept(CharkenModBlocks.COMPRESSED_SEAGRASS_BLOCK.get().asItem());
				tabData.accept(CharkenModItems.TURTKEN_SWORD.get());
			}).withTabsBefore(CHERNKAIN.getId()).build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS) {
			tabData.accept(CharkenModBlocks.EGGDIRT.get().asItem());
		} else if (tabData.getTabKey() == CreativeModeTabs.COMBAT) {
			tabData.accept(CharkenModItems.FLINGSHOT.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.SPAWN_EGGS) {
			tabData.accept(CharkenModItems.WARLM_SPAWN_EGG.get());
			tabData.accept(CharkenModItems.GOATIN_SPAWN_EGG.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.FOOD_AND_DRINKS) {
			tabData.accept(CharkenModItems.CHICKEN_LEG.get());
			tabData.accept(CharkenModItems.RAW_CHICKEN_LEG.get());
		}
	}
}
