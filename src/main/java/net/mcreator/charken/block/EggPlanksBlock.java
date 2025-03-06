
package net.mcreator.charken.block;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.core.BlockPos;

public class EggPlanksBlock extends Block {
	public EggPlanksBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.WOOD).strength(1.05f, 3f));
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}
}
