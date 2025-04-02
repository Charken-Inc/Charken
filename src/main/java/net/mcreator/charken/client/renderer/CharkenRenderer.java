
package net.mcreator.charken.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.charken.entity.CharkenEntity;
import net.mcreator.charken.client.model.Modelcharnken;

public class CharkenRenderer extends MobRenderer<CharkenEntity, LivingEntityRenderState, Modelcharnken> {
	private CharkenEntity entity = null;

	public CharkenRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcharnken(context.bakeLayer(Modelcharnken.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(CharkenEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("charken:textures/entities/charken.png");
	}
}
