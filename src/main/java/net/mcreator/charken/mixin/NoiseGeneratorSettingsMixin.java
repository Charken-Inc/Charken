package net.mcreator.charken.mixin;

import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.Mixin;

import net.minecraft.world.level.levelgen.SurfaceRules;
import net.minecraft.world.level.levelgen.NoiseGeneratorSettings;
import net.minecraft.world.level.dimension.DimensionType;
import net.minecraft.core.Holder;

import net.mcreator.charken.init.CharkenModBiomes;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapmethod.WrapMethod;

@Mixin(NoiseGeneratorSettings.class)
public class NoiseGeneratorSettingsMixin implements CharkenModBiomes.CharkenModNoiseGeneratorSettings {
	@Unique
	private Holder<DimensionType> charken_dimensionTypeReference;

	@WrapMethod(method = "surfaceRule")
	public SurfaceRules.RuleSource surfaceRule(Operation<SurfaceRules.RuleSource> original) {
		SurfaceRules.RuleSource retval = original.call();
		if (this.charken_dimensionTypeReference != null) {
			retval = CharkenModBiomes.adaptSurfaceRule(retval, this.charken_dimensionTypeReference);
		}
		return retval;
	}

	@Override
	public void setcharkenDimensionTypeReference(Holder<DimensionType> dimensionType) {
		this.charken_dimensionTypeReference = dimensionType;
	}
}