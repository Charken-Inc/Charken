package net.mcreator.charken.block;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;

public class EggstonebricksBlock extends Block {
	public EggstonebricksBlock(BlockBehaviour.Properties properties) {
		super(properties.strength(1.5f, 6f).requiresCorrectToolForDrops());
	}

	@Override
	public int getLightBlock(BlockState state) {
		return 15;
	}
}