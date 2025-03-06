
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.charken.init;

import net.neoforged.neoforge.registries.NeoForgeRegistries;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.fluids.FluidType;

import net.mcreator.charken.fluid.types.YolkliqFluidType;
import net.mcreator.charken.CharkenMod;

public class CharkenModFluidTypes {
	public static final DeferredRegister<FluidType> REGISTRY = DeferredRegister.create(NeoForgeRegistries.FLUID_TYPES, CharkenMod.MODID);
	public static final DeferredHolder<FluidType, FluidType> YOLKLIQ_TYPE = REGISTRY.register("yolkliq", () -> new YolkliqFluidType());
}
