
package net.mcreator.charken.block;

import net.minecraft.world.level.pathfinder.PathType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.FenceBlock;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.entity.Mob;
import net.minecraft.core.BlockPos;

public class EggFenceBlock extends FenceBlock {
	public EggFenceBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.WOOD).strength(1.05f, 3f).forceSolidOn());
	}

	@Override
	public PathType getBlockPathType(BlockState state, BlockGetter world, BlockPos pos, Mob entity) {
		return PathType.FENCE;
	}
}
