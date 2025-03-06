// Made with Blockbench 4.10.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelyolktrien<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "yolktrien"), "main");
	private final ModelPart bone;
	private final ModelPart rightarm;
	private final ModelPart leftarm;

	public Modelyolktrien(ModelPart root) {
		this.bone = root.getChild("bone");
		this.rightarm = root.getChild("rightarm");
		this.leftarm = root.getChild("leftarm");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bone = partdefinition.addOrReplaceChild("bone",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-4.0F, -2.0F, -4.0F, 8.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(10, 23)
						.addBox(4.0F, -1.0F, -4.0F, 1.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(0, 21)
						.addBox(-5.0F, -1.0F, -4.0F, 1.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(24, 0)
						.addBox(-5.0F, -1.0F, -6.0F, 10.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(20, 23)
						.addBox(-5.0F, -1.0F, 4.0F, 10.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 23.0F, 0.0F));

		PartDefinition rightarm = partdefinition.addOrReplaceChild("rightarm", CubeListBuilder.create().texOffs(14, 13)
				.addBox(-3.0F, -1.0F, -4.0F, 3.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-5.0F, 23.0F, 0.0F));

		PartDefinition leftarm = partdefinition.addOrReplaceChild("leftarm", CubeListBuilder.create().texOffs(0, 11)
				.addBox(0.0F, -1.0F, -4.0F, 3.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offset(5.0F, 23.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		bone.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		rightarm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leftarm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.rightarm.zRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.leftarm.zRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
	}
}