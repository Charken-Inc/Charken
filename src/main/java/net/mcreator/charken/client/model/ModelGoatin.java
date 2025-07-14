package net.mcreator.charken.client.model;

import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

// Made with Blockbench 4.12.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class ModelGoatin extends EntityModel<LivingEntityRenderState> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("charken", "model_goatin"), "main");
	public final ModelPart RightLeg;
	public final ModelPart LeftLeg;
	public final ModelPart Body;
	public final ModelPart LeftArm;
	public final ModelPart RightArm;
	public final ModelPart Head;

	public ModelGoatin(ModelPart root) {
		super(root);
		this.RightLeg = root.getChild("RightLeg");
		this.LeftLeg = root.getChild("LeftLeg");
		this.Body = root.getChild("Body");
		this.LeftArm = root.getChild("LeftArm");
		this.RightArm = root.getChild("RightArm");
		this.Head = root.getChild("Head");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg",
				CubeListBuilder.create().texOffs(78, 84).addBox(-7.0F, 18.0F, -2.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(86, 0).addBox(-7.0F, 8.0F, -5.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-7.0F, 2.0F, 1.0F));
		PartDefinition cube_r1 = RightLeg.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(32, 69).addBox(-2.0F, -9.0F, -2.0F, 4.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.0F, 18.0F, 0.0F, 0.3491F, 0.0F, 0.0F));
		PartDefinition cube_r2 = RightLeg.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 87).addBox(-3.0F, -9.0F, -2.0F, 3.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.0F, 18.0F, 3.0F, 0.3491F, 0.0F, 0.0F));
		PartDefinition cube_r3 = RightLeg.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(34, 56).addBox(-3.0F, -11.0F, -2.0F, 5.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.0F, 9.0F, 0.0F, -0.2382F, 0.1096F, 0.4232F));
		PartDefinition cube_r4 = RightLeg.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 63).addBox(-2.0F, -10.0F, -2.0F, 4.0F, 10.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.0F, 8.0F, -3.0F, -0.2382F, 0.1096F, 0.4232F));
		PartDefinition cube_r5 = RightLeg.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(14, 77).addBox(-2.0F, -2.0F, -4.0F, 3.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.0F, 22.0F, 0.0F, 0.0F, -0.48F, 0.0F));
		PartDefinition cube_r6 = RightLeg.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(76, 28).addBox(-2.0F, -2.0F, -4.0F, 3.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.0F, 22.0F, -1.0F, 0.0F, 0.2182F, 0.0F));
		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg",
				CubeListBuilder.create().texOffs(30, 89).addBox(4.0F, 18.0F, -2.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(86, 61).addBox(4.0F, 8.0F, -5.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(5.0F, 2.0F, 1.0F));
		PartDefinition cube_r7 = LeftLeg.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(16, 63).addBox(-2.0F, -10.0F, -2.0F, 4.0F, 10.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.0F, 8.0F, -3.0F, -0.228F, -0.1298F, -0.5087F));
		PartDefinition cube_r8 = LeftLeg.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(52, 56).addBox(-3.0F, -11.0F, -2.0F, 5.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(7.0F, 9.0F, 0.0F, -0.228F, -0.1298F, -0.5087F));
		PartDefinition cube_r9 = LeftLeg.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(88, 44).addBox(-3.0F, -9.0F, -2.0F, 3.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(9.0F, 18.0F, 3.0F, 0.3491F, 0.0F, 0.0F));
		PartDefinition cube_r10 = LeftLeg.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(48, 69).addBox(-2.0F, -9.0F, -2.0F, 4.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.0F, 18.0F, 0.0F, 0.3491F, 0.0F, 0.0F));
		PartDefinition cube_r11 = LeftLeg.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(78, 11).addBox(-2.0F, -2.0F, -4.0F, 3.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(7.0F, 22.0F, -1.0F, 0.0F, -0.48F, 0.0F));
		PartDefinition cube_r12 = LeftLeg.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(64, 77).addBox(-2.0F, -2.0F, -4.0F, 3.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.0F, 22.0F, -1.0F, 0.0F, 0.2182F, 0.0F));
		PartDefinition Body = partdefinition.addOrReplaceChild("Body",
				CubeListBuilder.create().texOffs(0, 18).addBox(-9.0F, 2.0F, -4.0F, 18.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(0, 30).addBox(-8.0F, -1.0F, -3.0F, 16.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(0, 40)
						.addBox(-7.0F, -4.0F, -4.0F, 14.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(0, 50).addBox(-5.0F, -10.0F, -5.0F, 10.0F, 6.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(50, 0)
						.addBox(-6.0F, -15.0F, -6.0F, 12.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(46, 30).addBox(-5.0F, -16.0F, -6.0F, 10.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(70, 56)
						.addBox(-3.0F, -17.0F, -6.0F, 6.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-6.0F, 5.0F, -6.0F, 12.0F, 5.0F, 13.0F, new CubeDeformation(0.0F)).texOffs(54, 20)
						.addBox(-4.0F, 5.0F, 7.0F, 8.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(70, 61).addBox(-1.0F, 6.0F, 21.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-1.0F, -3.0F, 2.0F));
		PartDefinition cube_r13 = Body.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(64, 69).addBox(-2.0F, -1.0F, 1.0F, 4.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 10.0F, 15.0F, 0.3491F, 0.0F, 0.0F));
		PartDefinition cube_r14 = Body.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(54, 11).addBox(-3.0F, -2.0F, 0.0F, 6.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 9.0F, 10.0F, -0.2618F, 0.0F, 0.0F));
		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm", CubeListBuilder.create().texOffs(80, 77).addBox(1.0F, -2.0F, -1.0F, 5.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(74, 36)
				.addBox(4.0F, -1.0F, -3.0F, 5.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(74, 44).addBox(7.0F, 2.0F, -5.0F, 4.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(4.0F, -15.0F, -2.0F));
		PartDefinition cube_r15 = LeftArm.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(30, 82).addBox(-2.0F, -2.0F, -4.0F, 3.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(10.0F, 11.0F, -4.0F, 0.8452F, -0.3326F, -0.3527F));
		PartDefinition cube_r16 = LeftArm.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(46, 82).addBox(-2.0F, -2.0F, -4.0F, 3.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(9.0F, 11.0F, -4.0F, 0.7974F, 0.1536F, 0.1555F));
		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm", CubeListBuilder.create().texOffs(0, 77).addBox(-10.0F, 2.0F, -5.0F, 4.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(14, 84)
				.addBox(-5.0F, -2.0F, -1.0F, 5.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(76, 20).addBox(-8.0F, -1.0F, -3.0F, 5.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(-7.0F, -15.0F, -2.0F));
		PartDefinition cube_r17 = RightArm.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(62, 84).addBox(-2.0F, -2.0F, -4.0F, 3.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-8.0F, 11.0F, -4.0F, 0.71F, 0.1666F, 0.1415F));
		PartDefinition cube_r18 = RightArm.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(84, 69).addBox(-2.0F, -2.0F, -4.0F, 3.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.0F, 11.0F, -3.0F, 0.7576F, -0.3615F, -0.3229F));
		PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(86, 6).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -20.0F, -2.0F));
		PartDefinition cube_r19 = Head.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(46, 89).addBox(-1.0F, -3.0F, -4.0F, 0.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 4.0F, -3.0F, 0.2618F, 0.0F, 0.0F));
		PartDefinition cube_r20 = Head.addOrReplaceChild("cube_r20",
				CubeListBuilder.create().texOffs(90, 35).addBox(-1.0F, -8.0F, -2.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(34, 50).addBox(-9.0F, -8.0F, -2.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0F, -1.0F, -1.0F, -0.0436F, 0.0F, 0.0F));
		PartDefinition cube_r21 = Head.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(54, 36).addBox(-2.0F, -6.0F, -1.0F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(46, 36)
				.addBox(-11.0F, -6.0F, -1.0F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(42, 40).addBox(-8.0F, -6.0F, -9.0F, 6.0F, 6.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0F, -1.0F, 0.0F, 0.5672F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	public void setupAnim(LivingEntityRenderState state) {
		float limbSwing = state.walkAnimationPos;
		float limbSwingAmount = state.walkAnimationSpeed;
		float ageInTicks = state.ageInTicks;
		float netHeadYaw = state.yRot;
		float headPitch = state.xRot;

		this.LeftLeg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.RightArm.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.Head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.Head.xRot = headPitch / (180F / (float) Math.PI);
		this.RightLeg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.LeftArm.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
	}
}