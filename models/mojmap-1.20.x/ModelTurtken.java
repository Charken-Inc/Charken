// Made with Blockbench 4.10.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelTurtken<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "turtken"), "main");
	private final ModelPart Top_right_leg;
	private final ModelPart Top_left_leg;
	private final ModelPart Bot_left_leg;
	private final ModelPart Bot_right_leg;
	private final ModelPart Body;
	private final ModelPart Head;

	public ModelTurtken(ModelPart root) {
		this.Top_right_leg = root.getChild("Top_right_leg");
		this.Top_left_leg = root.getChild("Top_left_leg");
		this.Bot_left_leg = root.getChild("Bot_left_leg");
		this.Bot_right_leg = root.getChild("Bot_right_leg");
		this.Body = root.getChild("Body");
		this.Head = root.getChild("Head");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Top_right_leg = partdefinition.addOrReplaceChild("Top_right_leg",
				CubeListBuilder.create().texOffs(60, 91)
						.addBox(-4.0F, 19.0F, -10.0F, 8.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(98, 0)
						.addBox(-3.0F, 8.0F, -8.0F, 6.0F, 11.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-15.0F, 3.0F, -9.0F));

		PartDefinition cube_r1 = Top_right_leg.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(85, 96).addBox(-3.0F, -11.0F, -2.0F, 6.0F, 11.0F, 5.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 9.0F, -6.0F, -0.5236F, 0.0F, 0.0F));

		PartDefinition Top_left_leg = partdefinition.addOrReplaceChild("Top_left_leg",
				CubeListBuilder.create().texOffs(30, 91)
						.addBox(-4.0F, 19.0F, -10.0F, 8.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(22, 100)
						.addBox(-3.0F, 8.0F, -8.0F, 6.0F, 11.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offset(15.0F, 3.0F, -9.0F));

		PartDefinition cube_r2 = Top_left_leg.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(0, 100).addBox(-3.0F, -11.0F, -2.0F, 6.0F, 11.0F, 5.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 9.0F, -6.0F, -0.5236F, 0.0F, 0.0F));

		PartDefinition Bot_left_leg = partdefinition.addOrReplaceChild("Bot_left_leg",
				CubeListBuilder.create().texOffs(0, 91)
						.addBox(-4.0F, 11.0F, -4.0F, 8.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(0, 33)
						.addBox(-3.0F, 0.0F, -2.0F, 6.0F, 11.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offset(11.0F, 11.0F, 15.0F));

		PartDefinition Bot_right_leg = partdefinition.addOrReplaceChild("Bot_right_leg",
				CubeListBuilder.create().texOffs(82, 42)
						.addBox(-4.0F, 11.0F, -4.0F, 8.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-3.0F, 0.0F, -2.0F, 6.0F, 11.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-11.0F, 11.0F, 15.0F));

		PartDefinition Body = partdefinition.addOrReplaceChild("Body", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 6.0F));

		PartDefinition cube_r3 = Body.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(0, 16).addBox(-4.0F, -1.0F, -1.0F, 7.0F, 2.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 10.0F, 24.0F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r4 = Body.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(104, 51).addBox(-5.0F, -2.0F, -1.0F, 9.0F, 4.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 9.0F, 21.0F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r5 = Body.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(84, 69).addBox(-13.0F, -9.0F, -1.0F, 26.0F, 5.0F, 22.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 2.0F, -1.0F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r6 = Body.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(0, 33).addBox(-15.0F, -10.0F, -1.0F, 30.0F, 11.0F, 22.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 8.0F, -1.0F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r7 = Body.addOrReplaceChild("cube_r7",
				CubeListBuilder.create().texOffs(82, 33).addBox(-15.0F, -5.0F, 18.0F, 30.0F, 6.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -12.0F, -36.0F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r8 = Body.addOrReplaceChild("cube_r8",
				CubeListBuilder.create().texOffs(0, 66).addBox(-17.0F, -5.0F, 2.0F, 34.0F, 6.0F, 19.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -8.0F, -19.0F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r9 = Body.addOrReplaceChild("cube_r9",
				CubeListBuilder.create().texOffs(0, 0).addBox(-19.0F, -10.0F, -1.0F, 38.0F, 11.0F, 22.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 2.0F, -22.0F, -0.2618F, 0.0F, 0.0F));

		PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(44, 100)
				.addBox(-3.0F, -3.0F, -6.0F, 6.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-2.0F, -1.0F, -16.0F));

		return LayerDefinition.create(meshdefinition, 256, 256);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		Top_right_leg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Top_left_leg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Bot_left_leg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Bot_right_leg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.Head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.Head.xRot = headPitch / (180F / (float) Math.PI);
		this.Top_right_leg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.Bot_left_leg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.Top_left_leg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.Bot_right_leg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
	}
}