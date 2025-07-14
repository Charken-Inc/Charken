package net.mcreator.charken.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.charken.entity.TurtkenTamedEntity;
import net.mcreator.charken.client.model.ModelTurtken;

import com.mojang.blaze3d.vertex.PoseStack;

public class TurtkenTamedRenderer extends MobRenderer<TurtkenTamedEntity, LivingEntityRenderState, ModelTurtken> {
	private TurtkenTamedEntity entity = null;

	public TurtkenTamedRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelTurtken(context.bakeLayer(ModelTurtken.LAYER_LOCATION)), 2.3f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(TurtkenTamedEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("charken:textures/entities/regularturt.png");
	}

	@Override
	protected void scale(LivingEntityRenderState state, PoseStack poseStack) {
		poseStack.scale(entity.getAgeScale(), entity.getAgeScale(), entity.getAgeScale());
	}
}