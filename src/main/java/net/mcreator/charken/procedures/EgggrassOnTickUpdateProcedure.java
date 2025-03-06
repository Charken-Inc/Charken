package net.mcreator.charken.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.core.BlockPos;

import net.mcreator.charken.init.CharkenModBlocks;

public class EgggrassOnTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (Mth.nextDouble(RandomSource.create(), 0, 100) <= 25) {
			if (world.getBlockState(BlockPos.containing(x, y + 1, z)).canOcclude()) {
				world.setBlock(BlockPos.containing(x, y, z), CharkenModBlocks.EGGDIRT.get().defaultBlockState(), 3);
			}
		}
		if (Mth.nextDouble(RandomSource.create(), 0, 100) <= 5) {
			if (world.isEmptyBlock(BlockPos.containing(x, y + 1, z)) && (world.getBlockState(BlockPos.containing(x + 1, y, z))).getBlock() == CharkenModBlocks.EGGDIRT.get()) {
				world.setBlock(BlockPos.containing(x + 1, y, z), CharkenModBlocks.EGGGRASS.get().defaultBlockState(), 3);
			}
			if (world.isEmptyBlock(BlockPos.containing(x, y + 1, z)) && (world.getBlockState(BlockPos.containing(x - 1, y, z))).getBlock() == CharkenModBlocks.EGGDIRT.get()) {
				world.setBlock(BlockPos.containing(x - 1, y, z), CharkenModBlocks.EGGGRASS.get().defaultBlockState(), 3);
			}
			if (world.isEmptyBlock(BlockPos.containing(x, y + 1, z)) && (world.getBlockState(BlockPos.containing(x, y, z - 1))).getBlock() == CharkenModBlocks.EGGDIRT.get()) {
				world.setBlock(BlockPos.containing(x, y, z - 1), CharkenModBlocks.EGGGRASS.get().defaultBlockState(), 3);
			}
			if (world.isEmptyBlock(BlockPos.containing(x, y + 1, z)) && (world.getBlockState(BlockPos.containing(x, y, z + 1))).getBlock() == CharkenModBlocks.EGGDIRT.get()) {
				world.setBlock(BlockPos.containing(x, y, z + 1), CharkenModBlocks.EGGGRASS.get().defaultBlockState(), 3);
			}
			if (world.isEmptyBlock(BlockPos.containing(x, y + 1, z)) && (world.getBlockState(BlockPos.containing(x + 1, y + 1, z))).getBlock() == CharkenModBlocks.EGGDIRT.get()) {
				world.setBlock(BlockPos.containing(x + 1, y + 1, z), CharkenModBlocks.EGGGRASS.get().defaultBlockState(), 3);
			}
			if (world.isEmptyBlock(BlockPos.containing(x, y + 1, z)) && (world.getBlockState(BlockPos.containing(x - 1, y + 1, z))).getBlock() == CharkenModBlocks.EGGDIRT.get()) {
				world.setBlock(BlockPos.containing(x - 1, y, z), CharkenModBlocks.EGGGRASS.get().defaultBlockState(), 3);
			}
			if (world.isEmptyBlock(BlockPos.containing(x, y + 1, z)) && (world.getBlockState(BlockPos.containing(x + 1, y - 1, z))).getBlock() == CharkenModBlocks.EGGDIRT.get()) {
				world.setBlock(BlockPos.containing(x + 1, y - 1, z), CharkenModBlocks.EGGGRASS.get().defaultBlockState(), 3);
			}
			if (world.isEmptyBlock(BlockPos.containing(x, y + 1, z)) && (world.getBlockState(BlockPos.containing(x - 1, y - 1, z))).getBlock() == CharkenModBlocks.EGGDIRT.get()) {
				world.setBlock(BlockPos.containing(x - 1, y - 1, z), CharkenModBlocks.EGGGRASS.get().defaultBlockState(), 3);
			}
			if (world.isEmptyBlock(BlockPos.containing(x, y + 1, z)) && (world.getBlockState(BlockPos.containing(x, y + 1, z + 1))).getBlock() == CharkenModBlocks.EGGDIRT.get()) {
				world.setBlock(BlockPos.containing(x, y + 1, z + 1), CharkenModBlocks.EGGGRASS.get().defaultBlockState(), 3);
			}
			if (world.isEmptyBlock(BlockPos.containing(x, y + 1, z)) && (world.getBlockState(BlockPos.containing(x, y + 1, z - 1))).getBlock() == CharkenModBlocks.EGGDIRT.get()) {
				world.setBlock(BlockPos.containing(x, y + 1, z - 1), CharkenModBlocks.EGGGRASS.get().defaultBlockState(), 3);
			}
			if (world.isEmptyBlock(BlockPos.containing(x, y + 1, z)) && (world.getBlockState(BlockPos.containing(x, y - 1, z + 1))).getBlock() == CharkenModBlocks.EGGDIRT.get()) {
				world.setBlock(BlockPos.containing(x, y - 1, z + 1), CharkenModBlocks.EGGGRASS.get().defaultBlockState(), 3);
			}
			if (world.isEmptyBlock(BlockPos.containing(x, y + 1, z)) && (world.getBlockState(BlockPos.containing(x, y - 1, z - 1))).getBlock() == CharkenModBlocks.EGGDIRT.get()) {
				world.setBlock(BlockPos.containing(x, y - 1, z - 1), CharkenModBlocks.EGGGRASS.get().defaultBlockState(), 3);
			}
		}
	}
}
