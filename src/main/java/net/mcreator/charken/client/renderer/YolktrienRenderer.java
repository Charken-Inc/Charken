
package net.mcreator.charken.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.charken.entity.YolktrienEntity;
import net.mcreator.charken.client.model.Modelyolktrien;

public class YolktrienRenderer extends MobRenderer<YolktrienEntity, Modelyolktrien<YolktrienEntity>> {
	public YolktrienRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelyolktrien<YolktrienEntity>(context.bakeLayer(Modelyolktrien.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(YolktrienEntity entity) {
		return ResourceLocation.parse("charken:textures/entities/yolktrien.png");
	}
}
