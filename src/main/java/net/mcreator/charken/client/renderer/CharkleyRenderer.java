package net.mcreator.charken.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.charken.entity.CharkleyEntity;
import net.mcreator.charken.client.model.Modelcharkley1;

public class CharkleyRenderer extends MobRenderer<CharkleyEntity, LivingEntityRenderState, Modelcharkley1> {
	private CharkleyEntity entity = null;

	public CharkleyRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcharkley1(context.bakeLayer(Modelcharkley1.LAYER_LOCATION)), 1f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(CharkleyEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("charken:textures/entities/charken.png");
	}
}