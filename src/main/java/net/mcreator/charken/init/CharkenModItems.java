/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.charken.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.SpawnEggItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.DoubleHighBlockItem;
import net.minecraft.world.item.BlockItem;

import net.mcreator.charken.item.YolkliqItem;
import net.mcreator.charken.item.YolkItem;
import net.mcreator.charken.item.YolkInfusedNetheriteArmorItem;
import net.mcreator.charken.item.YolkInfusedIronArmorItem;
import net.mcreator.charken.item.YolkInfusedGoldArmorItem;
import net.mcreator.charken.item.YolkInfusedDiamondArmorItem;
import net.mcreator.charken.item.TurtkenSwordItem;
import net.mcreator.charken.item.TurtkenShellItem;
import net.mcreator.charken.item.TurtkenShellChunkItem;
import net.mcreator.charken.item.RawcharkenLegItem;
import net.mcreator.charken.item.RawChickenLegItem;
import net.mcreator.charken.item.MovieSwordItem;
import net.mcreator.charken.item.LassoItem;
import net.mcreator.charken.item.IWantToKnowWhereMyWoodIsItem;
import net.mcreator.charken.item.FlingshotItem;
import net.mcreator.charken.item.EggbrickItem;
import net.mcreator.charken.item.CompressedSeaGrassItem;
import net.mcreator.charken.item.ChickenLegItem;
import net.mcreator.charken.item.CharkenlegItem;
import net.mcreator.charken.item.CharkenSprayItem;
import net.mcreator.charken.item.CharkenDiskItem;
import net.mcreator.charken.item.BladeItem;
import net.mcreator.charken.CharkenMod;

import java.util.function.Function;

public class CharkenModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(CharkenMod.MODID);
	public static final DeferredItem<Item> CHARKEN_SPAWN_EGG = register("charken_spawn_egg", properties -> new SpawnEggItem(CharkenModEntities.CHARKEN.get(), properties));
	public static final DeferredItem<Item> YOLKTRIEN_SPAWN_EGG = register("yolktrien_spawn_egg", properties -> new SpawnEggItem(CharkenModEntities.YOLKTRIEN.get(), properties));
	public static final DeferredItem<Item> LASSO = register("lasso", LassoItem::new);
	public static final DeferredItem<Item> CHARKENLEG = register("charkenleg", CharkenlegItem::new);
	public static final DeferredItem<Item> RAWCHARKEN_LEG = register("rawcharken_leg", RawcharkenLegItem::new);
	public static final DeferredItem<Item> EGGSTONE = block(CharkenModBlocks.EGGSTONE);
	public static final DeferredItem<Item> EGGSTONEBRICKS = block(CharkenModBlocks.EGGSTONEBRICKS);
	public static final DeferredItem<Item> EGGGRASS = block(CharkenModBlocks.EGGGRASS);
	public static final DeferredItem<Item> EGGDIRT = block(CharkenModBlocks.EGGDIRT);
	public static final DeferredItem<Item> YOLK_BLOCK = block(CharkenModBlocks.YOLK_BLOCK);
	public static final DeferredItem<Item> YOLK = register("yolk", YolkItem::new);
	public static final DeferredItem<Item> FLINGSHOT = register("flingshot", FlingshotItem::new);
	public static final DeferredItem<Item> YOLKLIQ_BUCKET = register("yolkliq_bucket", YolkliqItem::new);
	public static final DeferredItem<Item> WARLM_SPAWN_EGG = register("warlm_spawn_egg", properties -> new SpawnEggItem(CharkenModEntities.WARLM.get(), properties));
	public static final DeferredItem<Item> EGGBRICKS = block(CharkenModBlocks.EGGBRICKS);
	public static final DeferredItem<Item> EGGBRICK = register("eggbrick", EggbrickItem::new);
	public static final DeferredItem<Item> EGG_LOG = block(CharkenModBlocks.EGG_LOG);
	public static final DeferredItem<Item> EGG_PLANKS = block(CharkenModBlocks.EGG_PLANKS);
	public static final DeferredItem<Item> EGG_LEAVES = block(CharkenModBlocks.EGG_LEAVES);
	public static final DeferredItem<Item> EGG_STONE_BRICK_STAIRS = block(CharkenModBlocks.EGG_STONE_BRICK_STAIRS);
	public static final DeferredItem<Item> EGG_STONE_BRICK_WALL = block(CharkenModBlocks.EGG_STONE_BRICK_WALL);
	public static final DeferredItem<Item> EGG_SAPLING = block(CharkenModBlocks.EGG_SAPLING);
	public static final DeferredItem<Item> EGG_LEAVE = block(CharkenModBlocks.EGG_LEAVE);
	public static final DeferredItem<Item> CHARKEN_DISK = register("charken_disk", CharkenDiskItem::new);
	public static final DeferredItem<Item> I_WANT_TO_KNOW_WHERE_MY_WOOD_IS = register("i_want_to_know_where_my_wood_is", IWantToKnowWhereMyWoodIsItem::new);
	public static final DeferredItem<Item> EGG_STONE_BRICK_SLAB = block(CharkenModBlocks.EGG_STONE_BRICK_SLAB);
	public static final DeferredItem<Item> EGG_STAIRS = block(CharkenModBlocks.EGG_STAIRS);
	public static final DeferredItem<Item> EGG_FENCE = block(CharkenModBlocks.EGG_FENCE);
	public static final DeferredItem<Item> EGG_FENCE_GATE = block(CharkenModBlocks.EGG_FENCE_GATE);
	public static final DeferredItem<Item> EGG_BUTTON = block(CharkenModBlocks.EGG_BUTTON);
	public static final DeferredItem<Item> EGG_PRESSURE_PLATE = block(CharkenModBlocks.EGG_PRESSURE_PLATE);
	public static final DeferredItem<Item> EGG_DOOR = doubleBlock(CharkenModBlocks.EGG_DOOR);
	public static final DeferredItem<Item> EGG_TRAPDOOR = block(CharkenModBlocks.EGG_TRAPDOOR);
	public static final DeferredItem<Item> EGG_SLAB = block(CharkenModBlocks.EGG_SLAB);
	public static final DeferredItem<Item> MOVIE_SWORD = register("movie_sword", MovieSwordItem::new);
	public static final DeferredItem<Item> BLADE = register("blade", BladeItem::new);
	public static final DeferredItem<Item> CHARKLEY_SPAWN_EGG = register("charkley_spawn_egg", properties -> new SpawnEggItem(CharkenModEntities.CHARKLEY.get(), properties));
	public static final DeferredItem<Item> CHARKEN_EGG = block(CharkenModBlocks.CHARKEN_EGG);
	public static final DeferredItem<Item> CHICKEN_LEG = register("chicken_leg", ChickenLegItem::new);
	public static final DeferredItem<Item> RAW_CHICKEN_LEG = register("raw_chicken_leg", RawChickenLegItem::new);
	public static final DeferredItem<Item> CHARKEN_SIGN = block(CharkenModBlocks.CHARKEN_SIGN);
	public static final DeferredItem<Item> CHARKEN_SPRAY = register("charken_spray", CharkenSprayItem::new);
	public static final DeferredItem<Item> SCAM_TRAY = block(CharkenModBlocks.SCAM_TRAY);
	public static final DeferredItem<Item> GOATIN_SPAWN_EGG = register("goatin_spawn_egg", properties -> new SpawnEggItem(CharkenModEntities.GOATIN.get(), properties));
	public static final DeferredItem<Item> POSTER = block(CharkenModBlocks.POSTER);
	public static final DeferredItem<Item> TURTKEN_SPAWN_EGG = register("turtken_spawn_egg", properties -> new SpawnEggItem(CharkenModEntities.TURTKEN.get(), properties));
	public static final DeferredItem<Item> TURTKEN_SHELL = register("turtken_shell", TurtkenShellItem::new);
	public static final DeferredItem<Item> TURTKEN_SHELL_CHUNK = register("turtken_shell_chunk", TurtkenShellChunkItem::new);
	public static final DeferredItem<Item> COMPRESSED_SEAGRASS = register("compressed_seagrass", CompressedSeaGrassItem::new);
	public static final DeferredItem<Item> COMPRESSED_SEAGRASS_BLOCK = block(CharkenModBlocks.COMPRESSED_SEAGRASS_BLOCK);
	public static final DeferredItem<Item> TURTKEN_SWORD = register("turtken_sword", TurtkenSwordItem::new);
	public static final DeferredItem<Item> YOLK_ORE = block(CharkenModBlocks.YOLK_ORE);
	public static final DeferredItem<Item> YOLK_INFUSED_IRON_ARMOR_HELMET = register("yolk_infused_iron_armor_helmet", YolkInfusedIronArmorItem.Helmet::new);
	public static final DeferredItem<Item> YOLK_INFUSED_IRON_ARMOR_CHESTPLATE = register("yolk_infused_iron_armor_chestplate", YolkInfusedIronArmorItem.Chestplate::new);
	public static final DeferredItem<Item> YOLK_INFUSED_IRON_ARMOR_LEGGINGS = register("yolk_infused_iron_armor_leggings", YolkInfusedIronArmorItem.Leggings::new);
	public static final DeferredItem<Item> YOLK_INFUSED_IRON_ARMOR_BOOTS = register("yolk_infused_iron_armor_boots", YolkInfusedIronArmorItem.Boots::new);
	public static final DeferredItem<Item> YOLK_INFUSED_GOLD_ARMOR_HELMET = register("yolk_infused_gold_armor_helmet", YolkInfusedGoldArmorItem.Helmet::new);
	public static final DeferredItem<Item> YOLK_INFUSED_GOLD_ARMOR_CHESTPLATE = register("yolk_infused_gold_armor_chestplate", YolkInfusedGoldArmorItem.Chestplate::new);
	public static final DeferredItem<Item> YOLK_INFUSED_GOLD_ARMOR_LEGGINGS = register("yolk_infused_gold_armor_leggings", YolkInfusedGoldArmorItem.Leggings::new);
	public static final DeferredItem<Item> YOLK_INFUSED_GOLD_ARMOR_BOOTS = register("yolk_infused_gold_armor_boots", YolkInfusedGoldArmorItem.Boots::new);
	public static final DeferredItem<Item> YOLK_INFUSED_DIAMOND_ARMOR_HELMET = register("yolk_infused_diamond_armor_helmet", YolkInfusedDiamondArmorItem.Helmet::new);
	public static final DeferredItem<Item> YOLK_INFUSED_DIAMOND_ARMOR_CHESTPLATE = register("yolk_infused_diamond_armor_chestplate", YolkInfusedDiamondArmorItem.Chestplate::new);
	public static final DeferredItem<Item> YOLK_INFUSED_DIAMOND_ARMOR_LEGGINGS = register("yolk_infused_diamond_armor_leggings", YolkInfusedDiamondArmorItem.Leggings::new);
	public static final DeferredItem<Item> YOLK_INFUSED_DIAMOND_ARMOR_BOOTS = register("yolk_infused_diamond_armor_boots", YolkInfusedDiamondArmorItem.Boots::new);
	public static final DeferredItem<Item> YOLK_INFUSED_NETHERITE_ARMOR_HELMET = register("yolk_infused_netherite_armor_helmet", YolkInfusedNetheriteArmorItem.Helmet::new);
	public static final DeferredItem<Item> YOLK_INFUSED_NETHERITE_ARMOR_CHESTPLATE = register("yolk_infused_netherite_armor_chestplate", YolkInfusedNetheriteArmorItem.Chestplate::new);
	public static final DeferredItem<Item> YOLK_INFUSED_NETHERITE_ARMOR_LEGGINGS = register("yolk_infused_netherite_armor_leggings", YolkInfusedNetheriteArmorItem.Leggings::new);
	public static final DeferredItem<Item> YOLK_INFUSED_NETHERITE_ARMOR_BOOTS = register("yolk_infused_netherite_armor_boots", YolkInfusedNetheriteArmorItem.Boots::new);

	// Start of user code block custom items
	// End of user code block custom items
	private static <I extends Item> DeferredItem<I> register(String name, Function<Item.Properties, ? extends I> supplier) {
		return REGISTRY.registerItem(name, supplier, new Item.Properties());
	}

	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block) {
		return block(block, new Item.Properties());
	}

	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block, Item.Properties properties) {
		return REGISTRY.registerItem(block.getId().getPath(), prop -> new BlockItem(block.get(), prop), properties);
	}

	private static DeferredItem<Item> doubleBlock(DeferredHolder<Block, Block> block) {
		return doubleBlock(block, new Item.Properties());
	}

	private static DeferredItem<Item> doubleBlock(DeferredHolder<Block, Block> block, Item.Properties properties) {
		return REGISTRY.registerItem(block.getId().getPath(), prop -> new DoubleHighBlockItem(block.get(), prop), properties);
	}
}