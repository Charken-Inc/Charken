
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.charken.init;

import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.mcreator.charken.client.renderer.YolktrienRenderer;
import net.mcreator.charken.client.renderer.YolkproRenderer;
import net.mcreator.charken.client.renderer.WarlmRenderer;
import net.mcreator.charken.client.renderer.CharkenRenderer;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class CharkenModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(CharkenModEntities.CHARKEN.get(), CharkenRenderer::new);
		event.registerEntityRenderer(CharkenModEntities.YOLKTRIEN.get(), YolktrienRenderer::new);
		event.registerEntityRenderer(CharkenModEntities.YOLKPRO.get(), YolkproRenderer::new);
		event.registerEntityRenderer(CharkenModEntities.WARLM.get(), WarlmRenderer::new);
	}
}
