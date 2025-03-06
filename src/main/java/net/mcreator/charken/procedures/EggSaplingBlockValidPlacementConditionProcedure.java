package net.mcreator.charken.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.charken.init.CharkenModBlocks;

public class EggSaplingBlockValidPlacementConditionProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == CharkenModBlocks.EGGGRASS.get() || (world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == CharkenModBlocks.EGGDIRT.get()
				|| (world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.GRASS_BLOCK || (world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.DIRT
				|| (world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.PODZOL) {
			return true;
		} else {
			return false;
		}
	}
}
