package net.mcreator.charken.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.charken.entity.GoatinEntity;
import net.mcreator.charken.client.model.ModelGoatin;

public class GoatinRenderer extends MobRenderer<GoatinEntity, LivingEntityRenderState, ModelGoatin> {
	private GoatinEntity entity = null;

	public GoatinRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelGoatin(context.bakeLayer(ModelGoatin.LAYER_LOCATION)), 1f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(GoatinEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("charken:textures/entities/goatguy.png");
	}
}