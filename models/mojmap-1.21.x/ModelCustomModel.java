// Made with Blockbench 4.11.1
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelCustomModel<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "custommodel"), "main");
	private final ModelPart frontr;
	private final ModelPart frontl;
	private final ModelPart backr;
	private final ModelPart backl;
	private final ModelPart body;
	private final ModelPart heaad;

	public ModelCustomModel(ModelPart root) {
		this.frontr = root.getChild("frontr");
		this.frontl = root.getChild("frontl");
		this.backr = root.getChild("backr");
		this.backl = root.getChild("backl");
		this.body = root.getChild("body");
		this.heaad = root.getChild("heaad");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition frontr = partdefinition.addOrReplaceChild("frontr", CubeListBuilder.create().texOffs(16, 14)
				.addBox(-9.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(4.0F, 22.0F, -3.0F));

		PartDefinition frontl = partdefinition.addOrReplaceChild("frontl", CubeListBuilder.create().texOffs(16, 18)
				.addBox(7.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-4.0F, 22.0F, -3.0F));

		PartDefinition backr = partdefinition.addOrReplaceChild("backr", CubeListBuilder.create().texOffs(8, 19).addBox(
				-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-4.0F, 22.0F, 4.0F));

		PartDefinition backl = partdefinition.addOrReplaceChild("backl", CubeListBuilder.create().texOffs(0, 19).addBox(
				-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(4.0F, 22.0F, 4.0F));

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 0)
				.addBox(-1.0F, -1.0F, -6.0F, 2.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 21.0F, -1.0F));

		PartDefinition heaad = partdefinition.addOrReplaceChild("heaad",
				CubeListBuilder.create().texOffs(16, 22)
						.addBox(-1.0F, -1.0F, -2.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 23)
						.addBox(-1.0F, -4.0F, -2.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(8, 23)
						.addBox(-1.0F, -5.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(14, 23)
						.addBox(0.0F, -5.0F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 14)
						.addBox(-2.0F, -2.0F, -3.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 21.0F, -7.0F));

		return LayerDefinition.create(meshdefinition, 32, 32);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		frontr.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		frontl.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		backr.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		backl.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		heaad.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.frontr.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.backl.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.backr.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.frontl.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
		this.heaad.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.heaad.xRot = headPitch / (180F / (float) Math.PI);
	}
}