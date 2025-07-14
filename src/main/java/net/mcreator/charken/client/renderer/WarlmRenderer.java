package net.mcreator.charken.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.charken.entity.WarlmEntity;
import net.mcreator.charken.client.model.ModelWarlm_normal;

public class WarlmRenderer extends MobRenderer<WarlmEntity, LivingEntityRenderState, ModelWarlm_normal> {
	private WarlmEntity entity = null;

	public WarlmRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelWarlm_normal(context.bakeLayer(ModelWarlm_normal.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(WarlmEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("charken:textures/entities/warlm_normal.png");
	}
}