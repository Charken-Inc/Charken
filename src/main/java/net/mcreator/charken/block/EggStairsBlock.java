
package net.mcreator.charken.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Blocks;

public class EggStairsBlock extends StairBlock {
	public EggStairsBlock() {
		super(Blocks.AIR.defaultBlockState(), BlockBehaviour.Properties.of().sound(SoundType.WOOD).strength(1.05f, 3f));
	}

	@Override
	public float getExplosionResistance() {
		return 3f;
	}
}
