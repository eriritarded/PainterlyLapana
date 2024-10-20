// Made with Blockbench 4.10.1
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


public class glowrootgolemnew<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "glowrootgolemnew"), "main");
	private final ModelPart bb_main;

	public glowrootgolemnew(ModelPart root) {
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main", CubeListBuilder.create().texOffs(81, 8).addBox(-10.0F, -22.0F, -15.0F, 20.0F, 15.0F, 28.0F, new CubeDeformation(0.0F))
		.texOffs(161, 55).addBox(4.0F, -7.0F, -14.0F, 5.0F, 7.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(161, 55).addBox(-9.0F, -7.0F, -14.0F, 5.0F, 7.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(161, 55).addBox(4.0F, -7.0F, 7.0F, 5.0F, 7.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(161, 55).addBox(-9.0F, -7.0F, 7.0F, 5.0F, 7.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(29, 164).addBox(-6.0F, -27.0F, -25.0F, 12.0F, 8.0F, 12.0F, new CubeDeformation(0.0F))
		.texOffs(14, 62).addBox(-5.0F, -19.0F, -23.0F, 10.0F, 2.0F, 9.0F, new CubeDeformation(0.0F))
		.texOffs(124, 176).addBox(-3.0F, -14.0F, 13.0F, 6.0F, 9.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(43, 143).addBox(6.0F, -25.0F, -23.0F, 5.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = bb_main.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(42, 144).addBox(-5.4F, -4.55F, -0.5F, 7.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-15.0F, -23.0F, -19.0F, 3.1416F, 0.0F, -2.6616F));

		PartDefinition cube_r2 = bb_main.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(43, 143).addBox(-4.0F, -4.0F, -1.0F, 5.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-9.0F, -21.0F, -19.0F, -3.1416F, 0.0F, 3.1416F));

		PartDefinition cube_r3 = bb_main.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(42, 144).addBox(-5.4F, -4.55F, -0.5F, 7.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(16.0F, -23.0F, -22.0F, 0.0F, 0.0F, -0.48F));

		return LayerDefinition.create(meshdefinition, 192, 192);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}