
package net.mcreator.charken.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.charken.entity.TurtkenEntity;
import net.mcreator.charken.client.model.ModelTurtken;

public class TurtkenRenderer extends MobRenderer<TurtkenEntity, LivingEntityRenderState, ModelTurtken> {
	private TurtkenEntity entity = null;

	public TurtkenRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelTurtken(context.bakeLayer(ModelTurtken.LAYER_LOCATION)), 2.3f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(TurtkenEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("charken:textures/entities/regularturt.png");
	}
}
