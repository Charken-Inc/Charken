
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.charken.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;

import net.minecraft.world.level.block.Block;

import net.mcreator.charken.block.YolkliqBlock;
import net.mcreator.charken.block.YolkblockBlock;
import net.mcreator.charken.block.EggstonebricksBlock;
import net.mcreator.charken.block.EggstoneBlock;
import net.mcreator.charken.block.EgggrassBlock;
import net.mcreator.charken.block.EggdirtBlock;
import net.mcreator.charken.block.EggbricksBlock;
import net.mcreator.charken.block.EggTrapdoorBlock;
import net.mcreator.charken.block.EggStoneBrickWallBlock;
import net.mcreator.charken.block.EggStoneBrickStairsBlock;
import net.mcreator.charken.block.EggStoneBrickSlabBlock;
import net.mcreator.charken.block.EggStairsBlock;
import net.mcreator.charken.block.EggSlabBlock;
import net.mcreator.charken.block.EggSaplingBlock;
import net.mcreator.charken.block.EggPressurePlateBlock;
import net.mcreator.charken.block.EggPlanksBlock;
import net.mcreator.charken.block.EggLogBlock;
import net.mcreator.charken.block.EggLeavesBlock;
import net.mcreator.charken.block.EggLeaveBlock;
import net.mcreator.charken.block.EggFenceGateBlock;
import net.mcreator.charken.block.EggFenceBlock;
import net.mcreator.charken.block.EggDoorBlock;
import net.mcreator.charken.block.EggButtonBlock;
import net.mcreator.charken.CharkenMod;

public class CharkenModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(CharkenMod.MODID);
	public static final DeferredBlock<Block> EGGSTONE = REGISTRY.register("eggstone", EggstoneBlock::new);
	public static final DeferredBlock<Block> EGGSTONEBRICKS = REGISTRY.register("eggstonebricks", EggstonebricksBlock::new);
	public static final DeferredBlock<Block> EGGGRASS = REGISTRY.register("egggrass", EgggrassBlock::new);
	public static final DeferredBlock<Block> EGGDIRT = REGISTRY.register("eggdirt", EggdirtBlock::new);
	public static final DeferredBlock<Block> YOLKBLOCK = REGISTRY.register("yolkblock", YolkblockBlock::new);
	public static final DeferredBlock<Block> YOLKLIQ = REGISTRY.register("yolkliq", YolkliqBlock::new);
	public static final DeferredBlock<Block> EGGBRICKS = REGISTRY.register("eggbricks", EggbricksBlock::new);
	public static final DeferredBlock<Block> EGG_LOG = REGISTRY.register("egg_log", EggLogBlock::new);
	public static final DeferredBlock<Block> EGG_PLANKS = REGISTRY.register("egg_planks", EggPlanksBlock::new);
	public static final DeferredBlock<Block> EGG_LEAVES = REGISTRY.register("egg_leaves", EggLeavesBlock::new);
	public static final DeferredBlock<Block> EGG_STONE_BRICK_STAIRS = REGISTRY.register("egg_stone_brick_stairs", EggStoneBrickStairsBlock::new);
	public static final DeferredBlock<Block> EGG_STONE_BRICK_WALL = REGISTRY.register("egg_stone_brick_wall", EggStoneBrickWallBlock::new);
	public static final DeferredBlock<Block> EGG_SAPLING = REGISTRY.register("egg_sapling", EggSaplingBlock::new);
	public static final DeferredBlock<Block> EGG_LEAVE = REGISTRY.register("egg_leave", EggLeaveBlock::new);
	public static final DeferredBlock<Block> EGG_STONE_BRICK_SLAB = REGISTRY.register("egg_stone_brick_slab", EggStoneBrickSlabBlock::new);
	public static final DeferredBlock<Block> EGG_STAIRS = REGISTRY.register("egg_stairs", EggStairsBlock::new);
	public static final DeferredBlock<Block> EGG_FENCE = REGISTRY.register("egg_fence", EggFenceBlock::new);
	public static final DeferredBlock<Block> EGG_FENCE_GATE = REGISTRY.register("egg_fence_gate", EggFenceGateBlock::new);
	public static final DeferredBlock<Block> EGG_BUTTON = REGISTRY.register("egg_button", EggButtonBlock::new);
	public static final DeferredBlock<Block> EGG_PRESSURE_PLATE = REGISTRY.register("egg_pressure_plate", EggPressurePlateBlock::new);
	public static final DeferredBlock<Block> EGG_DOOR = REGISTRY.register("egg_door", EggDoorBlock::new);
	public static final DeferredBlock<Block> EGG_TRAPDOOR = REGISTRY.register("egg_trapdoor", EggTrapdoorBlock::new);
	public static final DeferredBlock<Block> EGG_SLAB = REGISTRY.register("egg_slab", EggSlabBlock::new);
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
