
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.charken.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.common.DeferredSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.DoubleHighBlockItem;
import net.minecraft.world.item.BlockItem;

import net.mcreator.charken.item.YolkliqItem;
import net.mcreator.charken.item.YolkItem;
import net.mcreator.charken.item.RawcharkenLegItem;
import net.mcreator.charken.item.LassoItem;
import net.mcreator.charken.item.IWantToKnowWhereMyWoodIsItem;
import net.mcreator.charken.item.FlingshotItem;
import net.mcreator.charken.item.EggbrickItem;
import net.mcreator.charken.item.CharkenlegItem;
import net.mcreator.charken.item.CharkenDiskItem;
import net.mcreator.charken.CharkenMod;

public class CharkenModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(CharkenMod.MODID);
	public static final DeferredItem<Item> CHARKEN_SPAWN_EGG = REGISTRY.register("charken_spawn_egg", () -> new DeferredSpawnEggItem(CharkenModEntities.CHARKEN, -3355444, -6750208, new Item.Properties()));
	public static final DeferredItem<Item> YOLKTRIEN_SPAWN_EGG = REGISTRY.register("yolktrien_spawn_egg", () -> new DeferredSpawnEggItem(CharkenModEntities.YOLKTRIEN, -1, -13261, new Item.Properties()));
	public static final DeferredItem<Item> LASSO = REGISTRY.register("lasso", LassoItem::new);
	public static final DeferredItem<Item> CHARKENLEG = REGISTRY.register("charkenleg", CharkenlegItem::new);
	public static final DeferredItem<Item> RAWCHARKEN_LEG = REGISTRY.register("rawcharken_leg", RawcharkenLegItem::new);
	public static final DeferredItem<Item> EGGSTONE = block(CharkenModBlocks.EGGSTONE);
	public static final DeferredItem<Item> EGGSTONEBRICKS = block(CharkenModBlocks.EGGSTONEBRICKS);
	public static final DeferredItem<Item> EGGGRASS = block(CharkenModBlocks.EGGGRASS);
	public static final DeferredItem<Item> EGGDIRT = block(CharkenModBlocks.EGGDIRT);
	public static final DeferredItem<Item> YOLKBLOCK = block(CharkenModBlocks.YOLKBLOCK);
	public static final DeferredItem<Item> YOLK = REGISTRY.register("yolk", YolkItem::new);
	public static final DeferredItem<Item> FLINGSHOT = REGISTRY.register("flingshot", FlingshotItem::new);
	public static final DeferredItem<Item> YOLKLIQ_BUCKET = REGISTRY.register("yolkliq_bucket", YolkliqItem::new);
	public static final DeferredItem<Item> WARLM_SPAWN_EGG = REGISTRY.register("warlm_spawn_egg", () -> new DeferredSpawnEggItem(CharkenModEntities.WARLM, -13057, -52, new Item.Properties()));
	public static final DeferredItem<Item> EGGBRICKS = block(CharkenModBlocks.EGGBRICKS);
	public static final DeferredItem<Item> EGGBRICK = REGISTRY.register("eggbrick", EggbrickItem::new);
	public static final DeferredItem<Item> EGG_LOG = block(CharkenModBlocks.EGG_LOG);
	public static final DeferredItem<Item> EGG_PLANKS = block(CharkenModBlocks.EGG_PLANKS);
	public static final DeferredItem<Item> EGG_LEAVES = block(CharkenModBlocks.EGG_LEAVES);
	public static final DeferredItem<Item> EGG_STONE_BRICK_STAIRS = block(CharkenModBlocks.EGG_STONE_BRICK_STAIRS);
	public static final DeferredItem<Item> EGG_STONE_BRICK_WALL = block(CharkenModBlocks.EGG_STONE_BRICK_WALL);
	public static final DeferredItem<Item> EGG_SAPLING = block(CharkenModBlocks.EGG_SAPLING);
	public static final DeferredItem<Item> EGG_LEAVE = block(CharkenModBlocks.EGG_LEAVE);
	public static final DeferredItem<Item> CHARKEN_DISK = REGISTRY.register("charken_disk", CharkenDiskItem::new);
	public static final DeferredItem<Item> I_WANT_TO_KNOW_WHERE_MY_WOOD_IS = REGISTRY.register("i_want_to_know_where_my_wood_is", IWantToKnowWhereMyWoodIsItem::new);
	public static final DeferredItem<Item> EGG_STONE_BRICK_SLAB = block(CharkenModBlocks.EGG_STONE_BRICK_SLAB);
	public static final DeferredItem<Item> EGG_STAIRS = block(CharkenModBlocks.EGG_STAIRS);
	public static final DeferredItem<Item> EGG_FENCE = block(CharkenModBlocks.EGG_FENCE);
	public static final DeferredItem<Item> EGG_FENCE_GATE = block(CharkenModBlocks.EGG_FENCE_GATE);
	public static final DeferredItem<Item> EGG_BUTTON = block(CharkenModBlocks.EGG_BUTTON);
	public static final DeferredItem<Item> EGG_PRESSURE_PLATE = block(CharkenModBlocks.EGG_PRESSURE_PLATE);
	public static final DeferredItem<Item> EGG_DOOR = doubleBlock(CharkenModBlocks.EGG_DOOR);
	public static final DeferredItem<Item> EGG_TRAPDOOR = block(CharkenModBlocks.EGG_TRAPDOOR);
	public static final DeferredItem<Item> EGG_SLAB = block(CharkenModBlocks.EGG_SLAB);

	// Start of user code block custom items
	// End of user code block custom items
	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}

	private static DeferredItem<Item> doubleBlock(DeferredHolder<Block, Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new DoubleHighBlockItem(block.get(), new Item.Properties()));
	}
}
