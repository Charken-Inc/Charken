package net.mcreator.charken.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 4.10.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelcharnken<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("charken", "modelcharnken"), "main");
	public final ModelPart rightleg;
	public final ModelPart leftleg;
	public final ModelPart body;
	public final ModelPart head;

	public Modelcharnken(ModelPart root) {
		this.rightleg = root.getChild("rightleg");
		this.leftleg = root.getChild("leftleg");
		this.body = root.getChild("body");
		this.head = root.getChild("head");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition rightleg = partdefinition.addOrReplaceChild("rightleg",
				CubeListBuilder.create().texOffs(37, 43).addBox(-7.0F, 21.0F, -6.0F, 6.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(80, 20).addBox(-5.0F, 21.0F, -11.0F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(65, 69)
						.addBox(-5.0F, 21.0F, -1.0F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(28, 65).addBox(-6.0F, 12.0F, -5.0F, 4.0F, 9.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-10.0F, 1.0F, 4.0F));
		PartDefinition cube_r1 = rightleg.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(84, 33).addBox(-5.0F, -10.0F, -3.0F, 9.0F, 10.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.0F, 4.0F, -4.0F, -0.3491F, 0.0F, 0.0F));
		PartDefinition cube_r2 = rightleg.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 85).addBox(-4.0F, -9.0F, -3.0F, 8.0F, 9.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.0F, 13.0F, -4.0F, -0.3491F, 0.0F, 0.0F));
		PartDefinition cube_r3 = rightleg.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(56, 74).addBox(-1.0F, -2.0F, -6.0F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, 23.0F, -5.0F, 0.0F, -0.2182F, 0.0F));
		PartDefinition cube_r4 = rightleg.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(28, 87).addBox(-1.0F, -1.0F, -5.0F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.0F, 22.0F, -6.0F, 0.0F, 0.2618F, 0.0F));
		PartDefinition leftleg = partdefinition.addOrReplaceChild("leftleg",
				CubeListBuilder.create().texOffs(0, 15).addBox(2.0F, 22.0F, -5.0F, 6.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(66, 20).addBox(4.0F, 22.0F, -10.0F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(66, 7)
						.addBox(4.0F, 22.0F, 0.0F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 65).addBox(3.0F, 13.0F, -4.0F, 4.0F, 9.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(9.0F, 0.0F, 3.0F));
		PartDefinition cube_r5 = leftleg.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(74, 67).addBox(-5.0F, -10.0F, -3.0F, 9.0F, 10.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.0F, 5.0F, -3.0F, -0.3491F, 0.0F, 0.0F));
		PartDefinition cube_r6 = leftleg.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -9.0F, -3.0F, 8.0F, 9.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.0F, 14.0F, -3.0F, -0.3491F, 0.0F, 0.0F));
		PartDefinition cube_r7 = leftleg.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(66, 0).addBox(-1.0F, -2.0F, -6.0F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(7.0F, 24.0F, -4.0F, 0.0F, -0.2182F, 0.0F));
		PartDefinition cube_r8 = leftleg.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(56, 67).addBox(-1.0F, -1.0F, -5.0F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0F, 23.0F, -5.0F, 0.0F, 0.2618F, 0.0F));
		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(28, 67).addBox(-2.0F, -2.0F, 17.0F, 5.0F, 2.0F, 18.0F, new CubeDeformation(0.0F)).texOffs(42, 87)
				.addBox(10.0F, -2.0F, -9.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(20, 20).addBox(-11.0F, -2.0F, -9.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.0F, -1.0F, -1.0F));
		PartDefinition cube_r9 = body.addOrReplaceChild("cube_r9",
				CubeListBuilder.create().texOffs(0, 43).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(74, 67).addBox(20.0F, -2.0F, -1.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-10.0F, 4.0F, -9.0F, -0.5672F, 0.0F, 0.0F));
		PartDefinition cube_r10 = body.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(0, 65).addBox(-2.0F, -2.0F, 0.0F, 5.0F, 2.0F, 18.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.0F, 0.0F, 17.0F, 0.0F, 0.2618F, 0.0F));
		PartDefinition cube_r11 = body.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(66, 0).addBox(-3.0F, -2.0F, 0.0F, 5.0F, 2.0F, 18.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.0F, 0.0F, 17.0F, 0.0F, -0.3054F, 0.0F));
		PartDefinition cube_r12 = body.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(48, 43).addBox(-6.0F, -8.6089F, -11.9113F, 11.0F, 12.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, -3.0F, -11.0F, -0.6981F, 0.0F, 0.0F));
		PartDefinition cube_r13 = body.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(0, 0).addBox(-10.0F, -5.0F, -13.0F, 19.0F, 15.0F, 28.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, -3.0F, 2.0F, -0.3927F, 0.0F, 0.0F));
		PartDefinition head = partdefinition.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(0, 43).addBox(-7.0F, -5.6089F, -9.9113F, 13.0F, 11.0F, 11.0F, new CubeDeformation(0.0F)).texOffs(0, 22).addBox(-4.0F, 0.3911F, -12.9113F, 7.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -14.0F, -17.0F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int rgb) {
		rightleg.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		leftleg.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.head.xRot = headPitch / (180F / (float) Math.PI);
		this.rightleg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.leftleg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
	}
}
