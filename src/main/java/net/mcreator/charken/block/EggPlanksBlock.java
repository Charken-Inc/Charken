package net.mcreator.charken.block;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;

public class EggPlanksBlock extends Block {
	public EggPlanksBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.WOOD).strength(1.05f, 3f));
	}

	@Override
	public int getLightBlock(BlockState state) {
		return 15;
	}
}