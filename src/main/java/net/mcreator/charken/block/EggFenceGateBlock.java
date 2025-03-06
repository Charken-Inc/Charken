
package net.mcreator.charken.block;

import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.FenceGateBlock;

public class EggFenceGateBlock extends FenceGateBlock {
	public EggFenceGateBlock() {
		super(WoodType.OAK, BlockBehaviour.Properties.of().sound(SoundType.WOOD).strength(1.05f, 3f).forceSolidOn());
	}
}
