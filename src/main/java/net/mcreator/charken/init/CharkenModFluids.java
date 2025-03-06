
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.charken.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.ItemBlockRenderTypes;

import net.mcreator.charken.fluid.YolkliqFluid;
import net.mcreator.charken.CharkenMod;

public class CharkenModFluids {
	public static final DeferredRegister<Fluid> REGISTRY = DeferredRegister.create(BuiltInRegistries.FLUID, CharkenMod.MODID);
	public static final DeferredHolder<Fluid, FlowingFluid> YOLKLIQ = REGISTRY.register("yolkliq", () -> new YolkliqFluid.Source());
	public static final DeferredHolder<Fluid, FlowingFluid> FLOWING_YOLKLIQ = REGISTRY.register("flowing_yolkliq", () -> new YolkliqFluid.Flowing());

	@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class FluidsClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			ItemBlockRenderTypes.setRenderLayer(YOLKLIQ.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_YOLKLIQ.get(), RenderType.translucent());
		}
	}
}
