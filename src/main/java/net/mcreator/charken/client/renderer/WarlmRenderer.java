
package net.mcreator.charken.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.charken.entity.WarlmEntity;
import net.mcreator.charken.client.model.ModelWarlm_normal;

public class WarlmRenderer extends MobRenderer<WarlmEntity, ModelWarlm_normal<WarlmEntity>> {
	public WarlmRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelWarlm_normal<WarlmEntity>(context.bakeLayer(ModelWarlm_normal.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(WarlmEntity entity) {
		return ResourceLocation.parse("charken:textures/entities/warlm_normal.png");
	}
}
