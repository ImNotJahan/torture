package imnotjahan.mod.torture;

// Made with Blockbench 4.0.5
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;

public class CrownModel extends BipedModel<LivingEntity>
{
	private final ModelRenderer bb_main;
	private final ModelRenderer cube_r1;

	public CrownModel()
	{
		super(1);
		texWidth = 16;
		texHeight = 16;

		bb_main = new ModelRenderer(this);
		bb_main.setPos(0.0F, 24.0F, 0.0F);
		bb_main.texOffs(0, 0).addBox(-2.0F, -34.0F, -2.0F, 4.0F, 2.0F, 4.0F, 0.0F, false);
		bb_main.texOffs(0, 0).addBox(-1.0F, -36.0F, 1.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		bb_main.texOffs(0, 0).addBox(-1.0F, -36.0F, -2.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setPos(0.0F, -24.0F, 0.0F);
		bb_main.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 1.5708F, 0.0F);
		cube_r1.texOffs(0, 0).addBox(-0.5F, -12.0F, 1.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		cube_r1.texOffs(0, 0).addBox(-0.5F, -12.0F, -2.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
	}

	@Override
	public void setupAnim(LivingEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		bb_main.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}