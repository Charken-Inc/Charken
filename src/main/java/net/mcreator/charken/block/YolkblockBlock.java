package net.mcreator.charken.block;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;

public class YolkblockBlock extends Block {
	public YolkblockBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.SLIME_BLOCK).instabreak());
	}

	@Override
	public int getLightBlock(BlockState state) {
		return 15;
	}
}