
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.charken.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;

import net.minecraft.world.level.block.state.BlockBehaviour;
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

import java.util.function.Function;

public class CharkenModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(CharkenMod.MODID);
	public static final DeferredBlock<Block> EGGSTONE = register("eggstone", EggstoneBlock::new);
	public static final DeferredBlock<Block> EGGSTONEBRICKS = register("eggstonebricks", EggstonebricksBlock::new);
	public static final DeferredBlock<Block> EGGGRASS = register("egggrass", EgggrassBlock::new);
	public static final DeferredBlock<Block> EGGDIRT = register("eggdirt", EggdirtBlock::new);
	public static final DeferredBlock<Block> YOLKBLOCK = register("yolkblock", YolkblockBlock::new);
	public static final DeferredBlock<Block> YOLKLIQ = register("yolkliq", YolkliqBlock::new);
	public static final DeferredBlock<Block> EGGBRICKS = register("eggbricks", EggbricksBlock::new);
	public static final DeferredBlock<Block> EGG_LOG = register("egg_log", EggLogBlock::new);
	public static final DeferredBlock<Block> EGG_PLANKS = register("egg_planks", EggPlanksBlock::new);
	public static final DeferredBlock<Block> EGG_LEAVES = register("egg_leaves", EggLeavesBlock::new);
	public static final DeferredBlock<Block> EGG_STONE_BRICK_STAIRS = register("egg_stone_brick_stairs", EggStoneBrickStairsBlock::new);
	public static final DeferredBlock<Block> EGG_STONE_BRICK_WALL = register("egg_stone_brick_wall", EggStoneBrickWallBlock::new);
	public static final DeferredBlock<Block> EGG_SAPLING = register("egg_sapling", EggSaplingBlock::new);
	public static final DeferredBlock<Block> EGG_LEAVE = register("egg_leave", EggLeaveBlock::new);
	public static final DeferredBlock<Block> EGG_STONE_BRICK_SLAB = register("egg_stone_brick_slab", EggStoneBrickSlabBlock::new);
	public static final DeferredBlock<Block> EGG_STAIRS = register("egg_stairs", EggStairsBlock::new);
	public static final DeferredBlock<Block> EGG_FENCE = register("egg_fence", EggFenceBlock::new);
	public static final DeferredBlock<Block> EGG_FENCE_GATE = register("egg_fence_gate", EggFenceGateBlock::new);
	public static final DeferredBlock<Block> EGG_BUTTON = register("egg_button", EggButtonBlock::new);
	public static final DeferredBlock<Block> EGG_PRESSURE_PLATE = register("egg_pressure_plate", EggPressurePlateBlock::new);
	public static final DeferredBlock<Block> EGG_DOOR = register("egg_door", EggDoorBlock::new);
	public static final DeferredBlock<Block> EGG_TRAPDOOR = register("egg_trapdoor", EggTrapdoorBlock::new);
	public static final DeferredBlock<Block> EGG_SLAB = register("egg_slab", EggSlabBlock::new);

	// Start of user code block custom blocks
	// End of user code block custom blocks
	private static <B extends Block> DeferredBlock<B> register(String name, Function<BlockBehaviour.Properties, ? extends B> supplier) {
		return REGISTRY.registerBlock(name, supplier, BlockBehaviour.Properties.of());
	}
}
