package cursedbread.restoned.models;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.render.LightmapHelper;
import net.minecraft.client.render.block.model.BlockModel;
import net.minecraft.client.render.block.model.BlockModelDispatcher;
import net.minecraft.client.render.block.model.BlockModelStandard;
import net.minecraft.client.render.tessellator.Tessellator;
import net.minecraft.client.render.texture.stitcher.IconCoordinate;
import net.minecraft.core.block.Block;
import net.minecraft.core.block.BlockLogic;
import net.minecraft.core.block.Blocks;
import net.minecraft.core.util.helper.Side;
import net.minecraft.core.util.phys.AABB;
import net.minecraft.core.util.phys.Vec3;

@Environment(EnvType.CLIENT)
public class BlockModelCustomLever<T extends BlockLogic> extends BlockModelStandard<T> {
	protected Block leverBase;
	public BlockModelCustomLever(Block<T> block, Block leverBase) {
		super(block);
		this.leverBase = leverBase;
	}

	public boolean render(Tessellator tessellator, int x, int y, int z) {
		int l = renderBlocks.blockAccess.getBlockMetadata(x, y, z);
		int i1 = l & 15;
		boolean flag = (l & 16) > 0;
		boolean flag1 = renderBlocks.overrideBlockTexture != null;
		if (!flag1) {
			renderBlocks.overrideBlockTexture = ((BlockModel) BlockModelDispatcher.getInstance().getDispatch(leverBase)).getBlockTextureFromSideAndMetadata(Side.BOTTOM, l);
		}

		float f = 0.25F;
		float f1 = 0.1875F;
		float f2 = 0.1875F;
		AABB bounds = this.block.getBounds();
		switch (i1) {
			case 1:
				bounds.set(0.0, (double)(0.5F - f), (double)(0.5F - f1), (double)f2, (double)(0.5F + f), (double)(0.5F + f1));
				break;
			case 2:
				bounds.set((double)(1.0F - f2), (double)(0.5F - f), (double)(0.5F - f1), 1.0, (double)(0.5F + f), (double)(0.5F + f1));
				break;
			case 3:
				bounds.set((double)(0.5F - f1), (double)(0.5F - f), 0.0, (double)(0.5F + f1), (double)(0.5F + f), (double)f2);
				break;
			case 4:
				bounds.set((double)(0.5F - f1), (double)(0.5F - f), (double)(1.0F - f2), (double)(0.5F + f1), (double)(0.5F + f), 1.0);
				break;
			case 5:
				bounds.set((double)(0.5F - f1), 0.0, (double)(0.5F - f), (double)(0.5F + f1), (double)f2, (double)(0.5F + f));
				break;
			case 6:
				bounds.set((double)(0.5F - f), 0.0, (double)(0.5F - f1), (double)(0.5F + f), (double)f2, (double)(0.5F + f1));
				break;
			case 7:
				bounds.set((double)(0.5F - f1), (double)(1.0F - f2), (double)(0.5F - f), (double)(0.5F + f1), 1.0, (double)(0.5F + f));
				break;
			case 8:
				bounds.set((double)(0.5F - f), (double)(1.0F - f2), (double)(0.5F - f1), (double)(0.5F + f), 1.0, (double)(0.5F + f1));
		}

		this.renderStandardBlock(tessellator, bounds, x, y, z);
		if (!flag1) {
			renderBlocks.overrideBlockTexture = null;
		}

		float brightness = 1.0F;
		if (LightmapHelper.isLightmapEnabled()) {
			tessellator.setLightmapCoord(this.block.getLightmapCoord(renderBlocks.blockAccess, x, y, z));
		} else if (this.block.emission > 0) {
			brightness = 1.0F;
		} else {
			brightness = this.getBlockBrightness(renderBlocks.blockAccess, x, y, z);
		}

		tessellator.setColorOpaque_F(brightness, brightness, brightness);
		IconCoordinate texture = this.getBlockTextureFromSideAndMetadata(Side.BOTTOM, l);
		if (renderBlocks.overrideBlockTexture != null) {
			texture = renderBlocks.overrideBlockTexture;
		}

		double f4 = texture.getIconUMin();
		double f5 = texture.getIconUMax();
		double f6 = texture.getIconVMin();
		double f7 = texture.getIconVMax();
		Vec3[] avec3 = new Vec3[8];
		float f8 = 0.0625F;
		float f9 = 0.0625F;
		float f10 = 0.625F;
		avec3[0] = Vec3.getTempVec3((double)(-f8), 0.0, (double)(-f9));
		avec3[1] = Vec3.getTempVec3((double)f8, 0.0, (double)(-f9));
		avec3[2] = Vec3.getTempVec3((double)f8, 0.0, (double)f9);
		avec3[3] = Vec3.getTempVec3((double)(-f8), 0.0, (double)f9);
		avec3[4] = Vec3.getTempVec3((double)(-f8), (double)f10, (double)(-f9));
		avec3[5] = Vec3.getTempVec3((double)f8, (double)f10, (double)(-f9));
		avec3[6] = Vec3.getTempVec3((double)f8, (double)f10, (double)f9);
		avec3[7] = Vec3.getTempVec3((double)(-f8), (double)f10, (double)f9);

		for(int i2 = 0; i2 < 8; ++i2) {
			if (flag) {
				avec3[i2].z -= 0.0625;
				avec3[i2].rotateAroundX(0.6981317F);
			} else {
				avec3[i2].z += 0.0625;
				avec3[i2].rotateAroundX(-0.6981317F);
			}

			if (i1 == 6 || i1 == 8) {
				avec3[i2].rotateAroundY(1.5707964F);
			}

			if (i1 < 5) {
				avec3[i2].y -= 0.375;
				avec3[i2].rotateAroundX(1.5707964F);
				if (i1 == 4) {
					avec3[i2].rotateAroundY(0.0F);
				}

				if (i1 == 3) {
					avec3[i2].rotateAroundY(3.1415927F);
				}

				if (i1 == 2) {
					avec3[i2].rotateAroundY(1.5707964F);
				}

				if (i1 == 1) {
					avec3[i2].rotateAroundY(-1.5707964F);
				}

				avec3[i2].x += (double)x + 0.5;
				avec3[i2].y += (double)((float)y + 0.5F);
				avec3[i2].z += (double)z + 0.5;
			} else if (i1 != 5 && i1 != 6) {
				avec3[i2].rotateAroundX(3.1415927F);
				avec3[i2].x += (double)x + 0.5;
				avec3[i2].y += (double)((float)(y + 1) - 0.125F);
				avec3[i2].z += (double)z + 0.5;
			} else {
				avec3[i2].x += (double)x + 0.5;
				avec3[i2].y += (double)((float)y + 0.125F);
				avec3[i2].z += (double)z + 0.5;
			}
		}

		for(int j2 = 0; j2 < 6; ++j2) {
			if (j2 == 0) {
				f4 = texture.getSubIconU(0.4375);
				f5 = texture.getSubIconU(0.5625);
				f6 = texture.getSubIconV(0.375);
				f7 = texture.getSubIconV(0.5);
			} else if (j2 == 2) {
				f4 = texture.getSubIconU(0.4375);
				f5 = texture.getSubIconU(0.5625);
				f6 = texture.getSubIconV(0.375);
				f7 = texture.getIconVMax();
			}

			Vec3 vec31;
			Vec3 vec32;
			Vec3 vec3d3;
			Vec3 vec3;
			if (j2 == 0) {
				vec3 = avec3[0];
				vec31 = avec3[1];
				vec32 = avec3[2];
				vec3d3 = avec3[3];
			} else if (j2 == 1) {
				vec3 = avec3[7];
				vec31 = avec3[6];
				vec32 = avec3[5];
				vec3d3 = avec3[4];
			} else if (j2 == 2) {
				vec3 = avec3[1];
				vec31 = avec3[0];
				vec32 = avec3[4];
				vec3d3 = avec3[5];
			} else if (j2 == 3) {
				vec3 = avec3[2];
				vec31 = avec3[1];
				vec32 = avec3[5];
				vec3d3 = avec3[6];
			} else if (j2 == 4) {
				vec3 = avec3[3];
				vec31 = avec3[2];
				vec32 = avec3[6];
				vec3d3 = avec3[7];
			} else {
				vec3 = avec3[0];
				vec31 = avec3[3];
				vec32 = avec3[7];
				vec3d3 = avec3[4];
			}

			tessellator.addVertexWithUV(vec3.x, vec3.y, vec3.z, f4, f7);
			tessellator.addVertexWithUV(vec31.x, vec31.y, vec31.z, f5, f7);
			tessellator.addVertexWithUV(vec32.x, vec32.y, vec32.z, f5, f6);
			tessellator.addVertexWithUV(vec3d3.x, vec3d3.y, vec3d3.z, f4, f6);
		}

		return true;
	}

	public boolean shouldItemRender3d() {
		return false;
	}

	public float getItemRenderScale() {
		return 0.5F;
	}
}
