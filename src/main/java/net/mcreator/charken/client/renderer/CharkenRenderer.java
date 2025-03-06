
package net.mcreator.charken.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.charken.entity.CharkenEntity;
import net.mcreator.charken.client.model.Modelcharnken;

public class CharkenRenderer extends MobRenderer<CharkenEntity, Modelcharnken<CharkenEntity>> {
	public CharkenRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcharnken<CharkenEntity>(context.bakeLayer(Modelcharnken.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(CharkenEntity entity) {
		return ResourceLocation.parse("charken:textures/entities/charken.png");
	}
}
