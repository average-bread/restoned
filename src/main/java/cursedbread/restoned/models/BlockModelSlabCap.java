package cursedbread.restoned.models;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.render.block.model.BlockModelSlab;
import net.minecraft.client.render.texture.stitcher.IconCoordinate;
import net.minecraft.client.render.texture.stitcher.TextureRegistry;
import net.minecraft.core.block.Block;
import net.minecraft.core.block.BlockLogicSlab;
import net.minecraft.core.util.helper.Axis;
import net.minecraft.core.util.helper.Side;
import net.minecraft.core.world.WorldSource;

@Environment(EnvType.CLIENT)
public class BlockModelSlabCap<T extends BlockLogicSlab> extends BlockModelSlab<T> {
	protected IconCoordinate slabSide;
	public BlockModelSlabCap(Block<T> block, String slabSide) {
		super(block);
		this.slabSide = TextureRegistry.getTexture(slabSide);
	}

	public IconCoordinate getBlockTexture(WorldSource blockAccess, int x, int y, int z, Side side) {
		return this.getBlockTextureFromSideAndMetadata(side, blockAccess.getBlockMetadata(x, y, z));
	}

	public IconCoordinate getBlockTextureFromSideAndMetadata(Side side, int data) {
		return data != 1 && side.getAxis() != Axis.Y ? this.slabSide : super.getBlockTextureFromSideAndMetadata(side, data);
	}
}
