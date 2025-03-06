
package net.mcreator.charken.fluid;

import net.neoforged.neoforge.fluids.BaseFlowingFluid;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.particles.ParticleOptions;

import net.mcreator.charken.init.CharkenModItems;
import net.mcreator.charken.init.CharkenModFluids;
import net.mcreator.charken.init.CharkenModFluidTypes;
import net.mcreator.charken.init.CharkenModBlocks;

public abstract class YolkliqFluid extends BaseFlowingFluid {
	public static final BaseFlowingFluid.Properties PROPERTIES = new BaseFlowingFluid.Properties(() -> CharkenModFluidTypes.YOLKLIQ_TYPE.get(), () -> CharkenModFluids.YOLKLIQ.get(), () -> CharkenModFluids.FLOWING_YOLKLIQ.get())
			.explosionResistance(100f).bucket(() -> CharkenModItems.YOLKLIQ_BUCKET.get()).block(() -> (LiquidBlock) CharkenModBlocks.YOLKLIQ.get());

	private YolkliqFluid() {
		super(PROPERTIES);
	}

	@Override
	public ParticleOptions getDripParticle() {
		return ParticleTypes.FALLING_WATER;
	}

	public static class Source extends YolkliqFluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends YolkliqFluid {
		protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
			super.createFluidStateDefinition(builder);
			builder.add(LEVEL);
		}

		public int getAmount(FluidState state) {
			return state.getValue(LEVEL);
		}

		public boolean isSource(FluidState state) {
			return false;
		}
	}
}
