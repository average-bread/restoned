package cursedbread.restoned.models;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.render.block.model.BlockModelVeryRotatable;
import net.minecraft.client.render.texture.stitcher.IconCoordinate;
import net.minecraft.client.render.texture.stitcher.TextureRegistry;
import net.minecraft.core.block.Block;
import net.minecraft.core.block.BlockLogic;
import net.minecraft.core.util.helper.Side;

@Environment(EnvType.CLIENT)
public class BlockModelCustomActivator<T extends BlockLogic> extends BlockModelVeryRotatable<T> {
	protected String top_texture;
	protected String bottom_texture;
	protected String side_texture;
	protected String front_texture;

	public BlockModelCustomActivator(Block<T> block, String top, String bottom, String side, String front, String top_over, String bottom_over, String side_over, String front_over) {
		super(block);

		this.top_texture = top;
		this.bottom_texture = bottom;
		this.side_texture = side;
		this.front_texture = front;

		this.poweredTextures = new IconCoordinate[]{
			TextureRegistry.getTexture(bottom_texture),
			TextureRegistry.getTexture(top_texture),
			TextureRegistry.getTexture(side_texture),
			TextureRegistry.getTexture(front_texture),
			TextureRegistry.getTexture(side_texture),
			TextureRegistry.getTexture(side_texture)};

		this.overbrightTextures
			.set(bottom_over, new Side[]{Side.BOTTOM})
			.set(top_over, new Side[]{Side.TOP})
			.set(front_over, new Side[]{Side.SOUTH})
			.set(side_over, new Side[]{Side.WEST, Side.EAST, Side.NORTH});
	}

	public final IconCoordinate[] poweredTextures;

	public boolean hasOverbright() {
		return true;
	}

	public IconCoordinate getBlockTextureFromSideAndMetadata(Side side, int data) {
		return (data & 8) != 0 ? this.poweredTextures[this.getRotatedSide(side, data).getId()] : super.getBlockTextureFromSideAndMetadata(side, data);
	}

	public IconCoordinate getBlockOverbrightTextureFromSideAndMeta(Side side, int data) {
		boolean isPowered = (data & 8) != 0;
		return !isPowered ? null : super.getBlockOverbrightTextureFromSideAndMeta(side, data);
	}
}
