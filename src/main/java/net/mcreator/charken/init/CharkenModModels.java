
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.charken.init;

import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.mcreator.charken.client.model.Modelyolktrien;
import net.mcreator.charken.client.model.Modelyolkpro;
import net.mcreator.charken.client.model.Modelspray_Converted;
import net.mcreator.charken.client.model.Modelcharnken;
import net.mcreator.charken.client.model.Modelcharkley1;
import net.mcreator.charken.client.model.Modelcharkley;
import net.mcreator.charken.client.model.ModelWarlm_normal;
import net.mcreator.charken.client.model.ModelTurtken;
import net.mcreator.charken.client.model.ModelGoatin;
import net.mcreator.charken.client.model.ModelCustomModel;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class CharkenModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(ModelTurtken.LAYER_LOCATION, ModelTurtken::createBodyLayer);
		event.registerLayerDefinition(Modelcharnken.LAYER_LOCATION, Modelcharnken::createBodyLayer);
		event.registerLayerDefinition(Modelyolkpro.LAYER_LOCATION, Modelyolkpro::createBodyLayer);
		event.registerLayerDefinition(Modelcharkley1.LAYER_LOCATION, Modelcharkley1::createBodyLayer);
		event.registerLayerDefinition(ModelWarlm_normal.LAYER_LOCATION, ModelWarlm_normal::createBodyLayer);
		event.registerLayerDefinition(Modelyolktrien.LAYER_LOCATION, Modelyolktrien::createBodyLayer);
		event.registerLayerDefinition(ModelCustomModel.LAYER_LOCATION, ModelCustomModel::createBodyLayer);
		event.registerLayerDefinition(Modelcharkley.LAYER_LOCATION, Modelcharkley::createBodyLayer);
		event.registerLayerDefinition(Modelspray_Converted.LAYER_LOCATION, Modelspray_Converted::createBodyLayer);
		event.registerLayerDefinition(ModelGoatin.LAYER_LOCATION, ModelGoatin::createBodyLayer);
	}
}
