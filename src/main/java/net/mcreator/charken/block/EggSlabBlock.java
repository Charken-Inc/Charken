
package net.mcreator.charken.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.SlabBlock;

public class EggSlabBlock extends SlabBlock {
	public EggSlabBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.WOOD).strength(1.05f, 3f));
	}
}
