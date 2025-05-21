package cursedbread.restoned;

import cursedbread.restoned.models.BlockModelSlabCap;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.render.EntityRenderDispatcher;
import net.minecraft.client.render.TileEntityRenderDispatcher;
import net.minecraft.client.render.block.color.BlockColorDispatcher;
import net.minecraft.client.render.block.model.*;
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
				.setTex(0,"restoned:block/cobbled/cobbled_marble", Side.sides)
			);

		ModelHelper.setBlockModel(RestonedBlocks.SLAB_COBBLE_MARBLE,
			() -> new BlockModelSlab<>(RestonedBlocks.SLAB_COBBLE_MARBLE)
				.setTex(0,"restoned:block/cobbled/cobbled_marble", Side.sides)
		);

		ModelHelper.setBlockModel(RestonedBlocks.STAIRS_COBBLE_MARBLE,
			() -> new BlockModelStairs<>(RestonedBlocks.STAIRS_COBBLE_MARBLE)
				.setTex(0,"restoned:block/cobbled/cobbled_marble", Side.sides)
		);

		ModelHelper.setBlockModel(RestonedBlocks.COBBLE_SLATE,
			() -> new BlockModelStandard<>(RestonedBlocks.COBBLE_SLATE)
				.setTex(0,"restoned:block/cobbled/cobbled_slate_side", Side.sides)
				.setTex(0,"restoned:block/cobbled/cobbled_slate_top", Side.TOP)
				.setTex(0,"restoned:block/cobbled/cobbled_slate_top", Side.BOTTOM)
		);

		ModelHelper.setBlockModel(RestonedBlocks.SLAB_COBBLE_SLATE,
			() -> new BlockModelSlab<>(RestonedBlocks.SLAB_COBBLE_SLATE)
				.setTex(0,"restoned:block/cobbled/cobbled_slate_side", Side.sides)
				.setTex(0,"restoned:block/cobbled/cobbled_slate_top", Side.TOP)
				.setTex(0,"restoned:block/cobbled/cobbled_slate_top", Side.BOTTOM)
		);

		ModelHelper.setBlockModel(RestonedBlocks.STAIRS_COBBLE_SLATE,
			() -> new BlockModelStairs<>(RestonedBlocks.STAIRS_COBBLE_SLATE)
				.setTex(0,"restoned:block/cobbled/cobbled_slate_side", Side.sides)
				.setTex(0,"restoned:block/cobbled/cobbled_slate_top", Side.TOP)
				.setTex(0,"restoned:block/cobbled/cobbled_slate_top", Side.BOTTOM)
		);

		ModelHelper.setBlockModel(RestonedBlocks.COBBLE_BASALT_MOSSY,
			() -> new BlockModelStandard<>(RestonedBlocks.COBBLE_BASALT_MOSSY)
				.setTex(0,"restoned:block/mossy/cobbled_basalt_mossy", Side.sides)
		);
		ModelHelper.setBlockModel(RestonedBlocks.COBBLE_LIMESTONE_MOSSY,
			() -> new BlockModelStandard<>(RestonedBlocks.COBBLE_LIMESTONE_MOSSY)
				.setTex(0,"restoned:block/mossy/cobbled_limestone_mossy", Side.sides)
		);
		ModelHelper.setBlockModel(RestonedBlocks.COBBLE_GRANITE_MOSSY,
			() -> new BlockModelStandard<>(RestonedBlocks.COBBLE_GRANITE_MOSSY)
				.setTex(0,"restoned:block/mossy/cobbled_granite_mossy", Side.sides)
		);
		ModelHelper.setBlockModel(RestonedBlocks.COBBLE_MARBLE_MOSSY,
			() -> new BlockModelStandard<>(RestonedBlocks.COBBLE_MARBLE_MOSSY)
				.setTex(0,"restoned:block/mossy/cobbled_marble_mossy", Side.sides)
		);
		ModelHelper.setBlockModel(RestonedBlocks.COBBLE_SLATE_MOSSY,
			() -> new BlockModelStandard<>(RestonedBlocks.COBBLE_SLATE_MOSSY)
				.setTex(0,"restoned:block/mossy/cobbled_slate_side_mossy", Side.sides)
				.setTex(0,"restoned:block/mossy/cobbled_slate_top_mossy", Side.TOP)
				.setTex(0,"restoned:block/mossy/cobbled_slate_top_mossy", Side.BOTTOM)
		);
		ModelHelper.setBlockModel(RestonedBlocks.COBBLE_PERMAFROST_MOSSY,
			() -> new BlockModelStandard<>(RestonedBlocks.COBBLE_PERMAFROST_MOSSY)
				.setTex(0,"restoned:block/mossy/cobbled_permafrost_mossy", Side.sides)
		);

		ModelHelper.setBlockModel(RestonedBlocks.PILLAR_STONE,
			() -> new BlockModelAxisAligned<>(RestonedBlocks.PILLAR_STONE)
				.setTex(0,"restoned:block/pillar/stone_side", Side.sides)
				.setTex(0,"restoned:block/pillar/stone_top", Side.TOP)
				.setTex(0,"restoned:block/pillar/stone_top", Side.BOTTOM)
		);
		ModelHelper.setBlockModel(RestonedBlocks.PILLAR_BASALT,
			() -> new BlockModelAxisAligned<>(RestonedBlocks.PILLAR_BASALT)
				.setTex(0,"restoned:block/pillar/basalt_side", Side.sides)
				.setTex(0,"restoned:block/pillar/basalt_top", Side.TOP)
				.setTex(0,"restoned:block/pillar/basalt_top", Side.BOTTOM)
		);
		ModelHelper.setBlockModel(RestonedBlocks.PILLAR_LIMESTONE,
			() -> new BlockModelAxisAligned<>(RestonedBlocks.PILLAR_LIMESTONE)
				.setTex(0,"restoned:block/pillar/limestone_side", Side.sides)
				.setTex(0,"restoned:block/pillar/limestone_top", Side.TOP)
				.setTex(0,"restoned:block/pillar/limestone_top", Side.BOTTOM)
		);
		ModelHelper.setBlockModel(RestonedBlocks.PILLAR_GRANITE,
			() -> new BlockModelAxisAligned<>(RestonedBlocks.PILLAR_GRANITE)
				.setTex(0,"restoned:block/pillar/granite_side", Side.sides)
				.setTex(0,"restoned:block/pillar/granite_top", Side.TOP)
				.setTex(0,"restoned:block/pillar/granite_top", Side.BOTTOM)
		);
		ModelHelper.setBlockModel(RestonedBlocks.PILLAR_SLATE,
			() -> new BlockModelAxisAligned<>(RestonedBlocks.PILLAR_SLATE)
				.setTex(0,"restoned:block/pillar/slate_side", Side.sides)
				.setTex(0,"restoned:block/pillar/slate_top", Side.TOP)
				.setTex(0,"restoned:block/pillar/slate_top", Side.BOTTOM)
		);
		ModelHelper.setBlockModel(RestonedBlocks.PILLAR_PERMAFROST,
			() -> new BlockModelAxisAligned<>(RestonedBlocks.PILLAR_PERMAFROST)
				.setTex(0,"restoned:block/pillar/permafrost_side", Side.sides)
				.setTex(0,"restoned:block/pillar/permafrost_top", Side.TOP)
				.setTex(0,"restoned:block/pillar/permafrost_top", Side.BOTTOM)
		);
		ModelHelper.setBlockModel(RestonedBlocks.PILLAR_NETHERRACK,
			() -> new BlockModelAxisAligned<>(RestonedBlocks.PILLAR_NETHERRACK)
				.setTex(0,"restoned:block/pillar/netherrack_side", Side.sides)
				.setTex(0,"restoned:block/pillar/netherrack_top", Side.TOP)
				.setTex(0,"restoned:block/pillar/netherrack_top", Side.BOTTOM)
		);

		ModelHelper.setBlockModel(RestonedBlocks.MARBLE_POLISHED,
			() -> new BlockModelStandard<>(RestonedBlocks.MARBLE_POLISHED)
				.setTex(0, "restoned:block/polished_and_carved/polished_marble_side", Side.sides)
				.setTex(0, "restoned:block/polished_and_carved/polished_marble_top", Side.TOP)
				.setTex(0, "restoned:block/polished_and_carved/polished_marble_top", Side.BOTTOM));

		ModelHelper.setBlockModel(RestonedBlocks.MARBLE_CARVED,
			() -> new BlockModelStandard<>(RestonedBlocks.MARBLE_CARVED)
				.setTex(0, "restoned:block/polished_and_carved/carved_marble", Side.sides)
				.setTex(0, "restoned:block/polished_and_carved/polished_marble_top", Side.TOP)
				.setTex(0, "restoned:block/polished_and_carved/polished_marble_top", Side.BOTTOM));
		ModelHelper.setBlockModel(RestonedBlocks.SLATE_CARVED,
			() -> new BlockModelStandard<>(RestonedBlocks.SLATE_CARVED)
				.setTex(0, "restoned:block/polished_and_carved/carved_slate", Side.sides)
				.setTex(0, "minecraft:block/polished_slate_top", Side.TOP)
				.setTex(0, "minecraft:block/polished_slate_top", Side.BOTTOM));

		ModelHelper.setBlockModel(RestonedBlocks.SLAB_MARBLE_POLISHED,
			() -> new BlockModelSlab<>(RestonedBlocks.SLAB_MARBLE_POLISHED));
		ModelHelper.setBlockModel(RestonedBlocks.SLAB_SLATE_POLISHED,
			() -> new BlockModelSlab<>(RestonedBlocks.SLAB_SLATE_POLISHED));

		ModelHelper.setBlockModel(RestonedBlocks.STAIRS_BRICK_MARBLE,
			() -> new BlockModelStairs<>(RestonedBlocks.STAIRS_BRICK_MARBLE)
		);

		ModelHelper.setBlockModel(RestonedBlocks.CAPSTONE_STONE,
			() -> new BlockModelStandard<>(RestonedBlocks.CAPSTONE_STONE)
				.setTex(0,"restoned:block/capstone/stone_side", Side.sides)
				.setTex(0,"restoned:block/capstone/stone_top", Side.TOP)
				.setTex(0,"restoned:block/capstone/stone_top", Side.BOTTOM)
		);
		ModelHelper.setBlockModel(RestonedBlocks.CAPSTONE_BASALT,
			() -> new BlockModelStandard<>(RestonedBlocks.CAPSTONE_BASALT)
				.setTex(0,"restoned:block/capstone/basalt_side", Side.sides)
				.setTex(0,"restoned:block/capstone/basalt_top", Side.TOP)
				.setTex(0,"restoned:block/capstone/basalt_top", Side.BOTTOM)
		);
		ModelHelper.setBlockModel(RestonedBlocks.CAPSTONE_LIMESTONE,
			() -> new BlockModelStandard<>(RestonedBlocks.CAPSTONE_LIMESTONE)
				.setTex(0,"restoned:block/capstone/limestone_side", Side.sides)
				.setTex(0,"restoned:block/capstone/limestone_top", Side.TOP)
				.setTex(0,"restoned:block/capstone/limestone_top", Side.BOTTOM)
		);
		ModelHelper.setBlockModel(RestonedBlocks.CAPSTONE_GRANITE,
			() -> new BlockModelStandard<>(RestonedBlocks.CAPSTONE_GRANITE)
				.setTex(0,"restoned:block/capstone/granite_side", Side.sides)
				.setTex(0,"restoned:block/capstone/granite_top", Side.TOP)
				.setTex(0,"restoned:block/capstone/granite_top", Side.BOTTOM)
		);
		ModelHelper.setBlockModel(RestonedBlocks.CAPSTONE_SLATE,
			() -> new BlockModelStandard<>(RestonedBlocks.CAPSTONE_SLATE)
				.setTex(0,"restoned:block/capstone/slate_side", Side.sides)
				.setTex(0,"restoned:block/capstone/slate_top", Side.TOP)
				.setTex(0,"restoned:block/capstone/slate_top", Side.BOTTOM)
		);
		ModelHelper.setBlockModel(RestonedBlocks.CAPSTONE_PERMAFROST,
			() -> new BlockModelStandard<>(RestonedBlocks.CAPSTONE_PERMAFROST)
				.setTex(0,"restoned:block/capstone/permafrost_side", Side.sides)
				.setTex(0,"restoned:block/capstone/permafrost_top", Side.TOP)
				.setTex(0,"restoned:block/capstone/permafrost_top", Side.BOTTOM)
		);
		ModelHelper.setBlockModel(RestonedBlocks.CAPSTONE_NETHERRACK,
			() -> new BlockModelStandard<>(RestonedBlocks.CAPSTONE_NETHERRACK)
				.setTex(0,"restoned:block/capstone/netherrack_side", Side.sides)
				.setTex(0,"restoned:block/capstone/netherrack_top", Side.TOP)
				.setTex(0,"restoned:block/capstone/netherrack_top", Side.BOTTOM)
		);

		ModelHelper.setBlockModel(RestonedBlocks.SLAB_CAPSTONE_STONE,
			() -> new BlockModelSlabCap<>(RestonedBlocks.SLAB_CAPSTONE_STONE, "restoned:block/capstone/stone_side"));
		ModelHelper.setBlockModel(RestonedBlocks.SLAB_CAPSTONE_BASALT,
			() -> new BlockModelSlabCap<>(RestonedBlocks.SLAB_CAPSTONE_BASALT, "restoned:block/capstone/basalt_side"));
		ModelHelper.setBlockModel(RestonedBlocks.SLAB_CAPSTONE_LIMESTONE,
			() -> new BlockModelSlabCap<>(RestonedBlocks.SLAB_CAPSTONE_LIMESTONE, "restoned:block/capstone/limestone_side"));
		ModelHelper.setBlockModel(RestonedBlocks.SLAB_CAPSTONE_GRANITE,
			() -> new BlockModelSlabCap<>(RestonedBlocks.SLAB_CAPSTONE_GRANITE, "restoned:block/capstone/granite_side"));
		ModelHelper.setBlockModel(RestonedBlocks.SLAB_CAPSTONE_SLATE,
			() -> new BlockModelSlabCap<>(RestonedBlocks.SLAB_CAPSTONE_SLATE, "restoned:block/capstone/slate_side"));
		ModelHelper.setBlockModel(RestonedBlocks.SLAB_CAPSTONE_PERMAFROST,
			() -> new BlockModelSlabCap<>(RestonedBlocks.SLAB_CAPSTONE_PERMAFROST, "restoned:block/capstone/permafrost_side"));
		ModelHelper.setBlockModel(RestonedBlocks.SLAB_CAPSTONE_NETHERRACK,
			() -> new BlockModelSlabCap<>(RestonedBlocks.SLAB_CAPSTONE_NETHERRACK, "restoned:block/capstone/netherrack_side"));
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
