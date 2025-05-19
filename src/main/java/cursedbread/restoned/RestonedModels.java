package cursedbread.restoned;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.render.EntityRenderDispatcher;
import net.minecraft.client.render.TileEntityRenderDispatcher;
import net.minecraft.client.render.block.color.BlockColorDispatcher;
import net.minecraft.client.render.block.model.BlockModelDispatcher;
import net.minecraft.client.render.block.model.BlockModelSlab;
import net.minecraft.client.render.block.model.BlockModelStairs;
import net.minecraft.client.render.block.model.BlockModelStandard;
import net.minecraft.client.render.item.model.ItemModelDispatcher;
import net.minecraft.core.util.helper.Side;
import turniplabs.halplibe.helper.ModelHelper;
import turniplabs.halplibe.util.ModelEntrypoint;

@Environment(EnvType.CLIENT)
public class RestonedModels  implements ModelEntrypoint {
	@Override
	public void initBlockModels(BlockModelDispatcher dispatcher) {
		ModelHelper.setBlockModel(RestonedBlocks.COBBLE_MARBLE,
			() -> new BlockModelStandard<>(RestonedBlocks.COBBLE_MARBLE)
				.setTex(0,"restoned:block/cobbled_marble", Side.sides)
			);

		ModelHelper.setBlockModel(RestonedBlocks.SLAB_COBBLE_MARBLE,
			() -> new BlockModelSlab<>(RestonedBlocks.SLAB_COBBLE_MARBLE)
				.setTex(0,"restoned:block/cobbled_marble", Side.sides)
		);

		ModelHelper.setBlockModel(RestonedBlocks.STAIRS_COBBLE_MARBLE,
			() -> new BlockModelStairs<>(RestonedBlocks.STAIRS_COBBLE_MARBLE)
				.setTex(0,"restoned:block/cobbled_marble", Side.sides)
		);

		ModelHelper.setBlockModel(RestonedBlocks.COBBLE_SLATE,
			() -> new BlockModelStandard<>(RestonedBlocks.COBBLE_SLATE)
				.setTex(0,"restoned:block/cobbled_slate_side", Side.sides)
				.setTex(0,"restoned:block/cobbled_slate_top", Side.TOP)
				.setTex(0,"restoned:block/cobbled_slate_top", Side.BOTTOM)
		);

		ModelHelper.setBlockModel(RestonedBlocks.SLAB_COBBLE_SLATE,
			() -> new BlockModelSlab<>(RestonedBlocks.SLAB_COBBLE_SLATE)
				.setTex(0,"restoned:block/cobbled_slate_side", Side.sides)
				.setTex(0,"restoned:block/cobbled_slate_top", Side.TOP)
				.setTex(0,"restoned:block/cobbled_slate_top", Side.BOTTOM)
		);

		ModelHelper.setBlockModel(RestonedBlocks.STAIRS_COBBLE_SLATE,
			() -> new BlockModelStairs<>(RestonedBlocks.STAIRS_COBBLE_SLATE)
				.setTex(0,"restoned:block/cobbled_slate_side", Side.sides)
				.setTex(0,"restoned:block/cobbled_slate_top", Side.TOP)
				.setTex(0,"restoned:block/cobbled_slate_top", Side.BOTTOM)
		);
	}

	@Override
	public void initItemModels(ItemModelDispatcher dispatcher) {

	}

	@Override
	public void initEntityModels(EntityRenderDispatcher dispatcher) {

	}

	@Override
	public void initTileEntityModels(TileEntityRenderDispatcher dispatcher) {

	}

	@Override
	public void initBlockColors(BlockColorDispatcher dispatcher) {

	}
}
