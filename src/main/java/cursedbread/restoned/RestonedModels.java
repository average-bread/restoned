package cursedbread.restoned;

import cursedbread.restoned.models.BlockModelCustomActivator;
import cursedbread.restoned.models.BlockModelCustomLever;
import cursedbread.restoned.models.BlockModelSlabCap;
import cursedbread.restoned.tileentities.TileEntityCustomSensor;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.render.EntityRenderDispatcher;
import net.minecraft.client.render.TileEntityRenderDispatcher;
import net.minecraft.client.render.block.color.BlockColorDispatcher;
import net.minecraft.client.render.block.model.*;
import net.minecraft.client.render.item.model.ItemModelDispatcher;
import net.minecraft.client.render.item.model.ItemModelStandard;
import net.minecraft.client.render.texture.stitcher.TextureRegistry;
import net.minecraft.core.block.Blocks;
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

		ModelHelper.setBlockModel(RestonedBlocks.BUTTON_BASALT,
			() -> new BlockModelStandard<>(RestonedBlocks.BUTTON_BASALT)
				.setTex(0, "minecraft:block/basalt", Side.sides)
				.withCustomItemBounds(0.3125, 0.375, 0.375, 0.6875, 0.625, 0.625)
		);
		ModelHelper.setBlockModel(RestonedBlocks.BUTTON_LIMESTONE,
			() -> new BlockModelStandard<>(RestonedBlocks.BUTTON_LIMESTONE)
				.setTex(0, "minecraft:block/limestone", Side.sides)
				.withCustomItemBounds(0.3125, 0.375, 0.375, 0.6875, 0.625, 0.625)
		);
		ModelHelper.setBlockModel(RestonedBlocks.BUTTON_GRANITE,
			() -> new BlockModelStandard<>(RestonedBlocks.BUTTON_GRANITE)
				.setTex(0, "minecraft:block/granite", Side.sides)
				.withCustomItemBounds(0.3125, 0.375, 0.375, 0.6875, 0.625, 0.625)
		);
		ModelHelper.setBlockModel(RestonedBlocks.BUTTON_MARBLE,
			() -> new BlockModelStandard<>(RestonedBlocks.BUTTON_MARBLE)
				.setTex(0, "minecraft:block/marble", Side.sides)
				.withCustomItemBounds(0.3125, 0.375, 0.375, 0.6875, 0.625, 0.625)
		);
		ModelHelper.setBlockModel(RestonedBlocks.BUTTON_SLATE,
			() -> new BlockModelStandard<>(RestonedBlocks.BUTTON_SLATE)
				.setTex(0, "minecraft:block/slate_side", Side.sides)
				.setTex(0, "minecraft:block/slate_top", Side.TOP)
				.setTex(0, "minecraft:block/slate_top", Side.BOTTOM)
				.withCustomItemBounds(0.3125, 0.375, 0.375, 0.6875, 0.625, 0.625)
		);
		ModelHelper.setBlockModel(RestonedBlocks.BUTTON_PERMAFROST,
			() -> new BlockModelStandard<>(RestonedBlocks.BUTTON_PERMAFROST)
				.setTex(0, "minecraft:block/permafrost", Side.sides)
				.withCustomItemBounds(0.3125, 0.375, 0.375, 0.6875, 0.625, 0.625)
		);
		ModelHelper.setBlockModel(RestonedBlocks.BUTTON_NETHERRACK,
			() -> new BlockModelStandard<>(RestonedBlocks.BUTTON_NETHERRACK)
				.setTex(0, "minecraft:block/netherrack", Side.sides)
				.withCustomItemBounds(0.3125, 0.375, 0.375, 0.6875, 0.625, 0.625)
		);

		ModelHelper.setBlockModel(RestonedBlocks.LEVER_COBBLE_BASALT,
			() -> new BlockModelCustomLever<>(RestonedBlocks.LEVER_COBBLE_BASALT, Blocks.COBBLE_BASALT)
				.setTex(0, "restoned:block/levers/lever_cobbled_basalt", Side.sides)
		);
		ModelHelper.setBlockModel(RestonedBlocks.LEVER_COBBLE_LIMESTONE,
			() -> new BlockModelCustomLever<>(RestonedBlocks.LEVER_COBBLE_LIMESTONE, Blocks.COBBLE_LIMESTONE)
				.setTex(0, "restoned:block/levers/lever_cobbled_limestone", Side.sides)
		);
		ModelHelper.setBlockModel(RestonedBlocks.LEVER_COBBLE_GRANITE,
			() -> new BlockModelCustomLever<>(RestonedBlocks.LEVER_COBBLE_GRANITE, Blocks.COBBLE_GRANITE)
				.setTex(0, "restoned:block/levers/lever_cobbled_granite", Side.sides)
		);
		ModelHelper.setBlockModel(RestonedBlocks.LEVER_COBBLE_MARBLE,
			() -> new BlockModelCustomLever<>(RestonedBlocks.LEVER_COBBLE_MARBLE, RestonedBlocks.COBBLE_MARBLE)
				.setTex(0, "restoned:block/levers/lever_cobbled_marble", Side.sides)
		);
		ModelHelper.setBlockModel(RestonedBlocks.LEVER_COBBLE_SLATE,
			() -> new BlockModelCustomLever<>(RestonedBlocks.LEVER_COBBLE_SLATE, RestonedBlocks.COBBLE_SLATE)
				.setTex(0, "restoned:block/levers/lever_cobbled_basalt", Side.sides)
		);
		ModelHelper.setBlockModel(RestonedBlocks.LEVER_COBBLE_PERMAFROST,
			() -> new BlockModelCustomLever<>(RestonedBlocks.LEVER_COBBLE_PERMAFROST, Blocks.COBBLE_PERMAFROST)
				.setTex(0, "restoned:block/levers/lever_cobbled_permafrost", Side.sides)
		);
		ModelHelper.setBlockModel(RestonedBlocks.LEVER_COBBLE_NETHERRACK,
			() -> new BlockModelCustomLever<>(RestonedBlocks.LEVER_COBBLE_NETHERRACK, Blocks.COBBLE_NETHERRACK)
				.setTex(0, "restoned:block/levers/lever_cobbled_netherrack", Side.sides)
		);

		ModelHelper.setBlockModel(RestonedBlocks.PRESSURE_PLATE_BASALT,
			() -> new BlockModelStandard<>(RestonedBlocks.PRESSURE_PLATE_BASALT)
				.setTex(0, "minecraft:block/basalt", Side.sides)
				.withCustomItemBounds(0.0, 0.375, 0.0, 1.0, 0.625, 1.0)
		);
		ModelHelper.setBlockModel(RestonedBlocks.PRESSURE_PLATE_LIMESTONE,
			() -> new BlockModelStandard<>(RestonedBlocks.PRESSURE_PLATE_LIMESTONE)
				.setTex(0, "minecraft:block/limestone", Side.sides)
				.withCustomItemBounds(0.0, 0.375, 0.0, 1.0, 0.625, 1.0)
		);
		ModelHelper.setBlockModel(RestonedBlocks.PRESSURE_PLATE_GRANITE,
			() -> new BlockModelStandard<>(RestonedBlocks.PRESSURE_PLATE_GRANITE)
				.setTex(0, "minecraft:block/granite", Side.sides)
				.withCustomItemBounds(0.0, 0.375, 0.0, 1.0, 0.625, 1.0)
		);
		ModelHelper.setBlockModel(RestonedBlocks.PRESSURE_PLATE_MARBLE,
			() -> new BlockModelStandard<>(RestonedBlocks.PRESSURE_PLATE_MARBLE)
				.setTex(0, "minecraft:block/marble", Side.sides)
				.withCustomItemBounds(0.0, 0.375, 0.0, 1.0, 0.625, 1.0)
		);
		ModelHelper.setBlockModel(RestonedBlocks.PRESSURE_PLATE_SLATE,
			() -> new BlockModelStandard<>(RestonedBlocks.PRESSURE_PLATE_SLATE)
				.setTex(0, "minecraft:block/slate_side", Side.sides)
				.setTex(0, "minecraft:block/slate_top", Side.TOP)
				.setTex(0, "minecraft:block/slate_top", Side.BOTTOM)
				.withCustomItemBounds(0.0, 0.375, 0.0, 1.0, 0.625, 1.0)
		);
		ModelHelper.setBlockModel(RestonedBlocks.PRESSURE_PLATE_PERMAFROST,
			() -> new BlockModelStandard<>(RestonedBlocks.PRESSURE_PLATE_PERMAFROST)
				.setTex(0, "minecraft:block/permafrost", Side.sides)
				.withCustomItemBounds(0.0, 0.375, 0.0, 1.0, 0.625, 1.0)
		);
		ModelHelper.setBlockModel(RestonedBlocks.PRESSURE_PLATE_NETHERRACK,
			() -> new BlockModelStandard<>(RestonedBlocks.PRESSURE_PLATE_NETHERRACK)
				.setTex(0, "minecraft:block/netherrack", Side.sides)
				.withCustomItemBounds(0.0, 0.375, 0.0, 1.0, 0.625, 1.0)
		);

		ModelHelper.setBlockModel(RestonedBlocks.PRESSURE_PLATE_COBBLE_BASALT,
			() -> new BlockModelStandard<>(RestonedBlocks.PRESSURE_PLATE_COBBLE_BASALT)
				.setTex(0, "minecraft:block/cobbled_basalt", Side.sides)
				.withCustomItemBounds(0.0, 0.375, 0.0, 1.0, 0.625, 1.0)
		);
		ModelHelper.setBlockModel(RestonedBlocks.PRESSURE_PLATE_COBBLE_LIMESTONE,
			() -> new BlockModelStandard<>(RestonedBlocks.PRESSURE_PLATE_COBBLE_LIMESTONE)
				.setTex(0, "minecraft:block/cobbled_limestone", Side.sides)
				.withCustomItemBounds(0.0, 0.375, 0.0, 1.0, 0.625, 1.0)
		);
		ModelHelper.setBlockModel(RestonedBlocks.PRESSURE_PLATE_COBBLE_GRANITE,
			() -> new BlockModelStandard<>(RestonedBlocks.PRESSURE_PLATE_COBBLE_GRANITE)
				.setTex(0, "minecraft:block/cobbled_granite", Side.sides)
				.withCustomItemBounds(0.0, 0.375, 0.0, 1.0, 0.625, 1.0)
		);
		ModelHelper.setBlockModel(RestonedBlocks.PRESSURE_PLATE_COBBLE_MARBLE,
			() -> new BlockModelStandard<>(RestonedBlocks.PRESSURE_PLATE_COBBLE_MARBLE)
				.setTex(0, "restoned:block/cobbled/cobbled_marble", Side.sides)
				.withCustomItemBounds(0.0, 0.375, 0.0, 1.0, 0.625, 1.0)
		);
		ModelHelper.setBlockModel(RestonedBlocks.PRESSURE_PLATE_COBBLE_SLATE,
			() -> new BlockModelStandard<>(RestonedBlocks.PRESSURE_PLATE_COBBLE_SLATE)
				.setTex(0, "restoned:block/cobbled/cobbled_slate_side", Side.sides)
				.setTex(0, "restoned:block/cobbled/cobbled_slate_top", Side.TOP)
				.setTex(0, "restoned:block/cobbled/cobbled_slate_top", Side.BOTTOM)
				.withCustomItemBounds(0.0, 0.375, 0.0, 1.0, 0.625, 1.0)
		);
		ModelHelper.setBlockModel(RestonedBlocks.PRESSURE_PLATE_COBBLE_PERMAFROST,
			() -> new BlockModelStandard<>(RestonedBlocks.PRESSURE_PLATE_COBBLE_PERMAFROST)
				.setTex(0, "minecraft:block/cobbled_permafrost", Side.sides)
				.withCustomItemBounds(0.0, 0.375, 0.0, 1.0, 0.625, 1.0)
		);
		ModelHelper.setBlockModel(RestonedBlocks.PRESSURE_PLATE_COBBLE_NETHERRACK,
			() -> new BlockModelStandard<>(RestonedBlocks.PRESSURE_PLATE_COBBLE_NETHERRACK)
				.setTex(0, "minecraft:block/cobbled_netherrack", Side.sides)
				.withCustomItemBounds(0.0, 0.375, 0.0, 1.0, 0.625, 1.0)
		);

		ModelHelper.setBlockModel(RestonedBlocks.BASALT_MOTION_SENSOR_IDLE,
			() -> new BlockModelVeryRotatable<>(RestonedBlocks.BASALT_MOTION_SENSOR_IDLE)
				.setTex(0, "restoned:block/motion_sensors/basalt/side", Side.sides)
				.setTex(0, "restoned:block/motion_sensors/basalt/idle_front", Side.SOUTH)
		);
		ModelHelper.setBlockModel(RestonedBlocks.BASALT_MOTION_SENSOR_ACTIVE,
			() -> new BlockModelVeryRotatable<>(RestonedBlocks.BASALT_MOTION_SENSOR_ACTIVE)
				.setTex(0, "restoned:block/motion_sensors/basalt/side", Side.sides)
				.setTex(0, "restoned:block/motion_sensors/basalt/active_front", Side.SOUTH)
				.setTex(1, "restoned:block/motion_sensors/basalt/active_front_overlay", Side.SOUTH)
		);
		ModelHelper.setBlockModel(RestonedBlocks.LIMESTONE_MOTION_SENSOR_IDLE,
			() -> new BlockModelVeryRotatable<>(RestonedBlocks.LIMESTONE_MOTION_SENSOR_IDLE)
				.setTex(0, "restoned:block/motion_sensors/limestone/side", Side.sides)
				.setTex(0, "restoned:block/motion_sensors/limestone/idle_front", Side.SOUTH)
		);
		ModelHelper.setBlockModel(RestonedBlocks.LIMESTONE_MOTION_SENSOR_ACTIVE,
			() -> new BlockModelVeryRotatable<>(RestonedBlocks.LIMESTONE_MOTION_SENSOR_ACTIVE)
				.setTex(0, "restoned:block/motion_sensors/limestone/side", Side.sides)
				.setTex(0, "restoned:block/motion_sensors/limestone/active_front", Side.SOUTH)
				.setTex(1, "restoned:block/motion_sensors/limestone/active_front_overlay", Side.SOUTH)
		);
		ModelHelper.setBlockModel(RestonedBlocks.GRANITE_MOTION_SENSOR_IDLE,
			() -> new BlockModelVeryRotatable<>(RestonedBlocks.GRANITE_MOTION_SENSOR_IDLE)
				.setTex(0, "restoned:block/motion_sensors/granite/side", Side.sides)
				.setTex(0, "restoned:block/motion_sensors/granite/idle_front", Side.SOUTH)
		);
		ModelHelper.setBlockModel(RestonedBlocks.GRANITE_MOTION_SENSOR_ACTIVE,
			() -> new BlockModelVeryRotatable<>(RestonedBlocks.GRANITE_MOTION_SENSOR_ACTIVE)
				.setTex(0, "restoned:block/motion_sensors/granite/side", Side.sides)
				.setTex(0, "restoned:block/motion_sensors/granite/active_front", Side.SOUTH)
				.setTex(1, "restoned:block/motion_sensors/granite/active_front_overlay", Side.SOUTH)
		);
		ModelHelper.setBlockModel(RestonedBlocks.MARBLE_MOTION_SENSOR_IDLE,
			() -> new BlockModelVeryRotatable<>(RestonedBlocks.MARBLE_MOTION_SENSOR_IDLE)
				.setTex(0, "restoned:block/motion_sensors/marble/side", Side.sides)
				.setTex(0, "restoned:block/motion_sensors/marble/idle_front", Side.SOUTH)
		);
		ModelHelper.setBlockModel(RestonedBlocks.MARBLE_MOTION_SENSOR_ACTIVE,
			() -> new BlockModelVeryRotatable<>(RestonedBlocks.MARBLE_MOTION_SENSOR_ACTIVE)
				.setTex(0, "restoned:block/motion_sensors/marble/side", Side.sides)
				.setTex(0, "restoned:block/motion_sensors/marble/active_front", Side.SOUTH)
				.setTex(1, "restoned:block/motion_sensors/marble/active_front_overlay", Side.SOUTH)
		);
		ModelHelper.setBlockModel(RestonedBlocks.SLATE_MOTION_SENSOR_IDLE,
			() -> new BlockModelVeryRotatable<>(RestonedBlocks.SLATE_MOTION_SENSOR_IDLE)
				.setTex(0, "restoned:block/motion_sensors/slate/side", Side.sides)
				.setTex(0, "restoned:block/motion_sensors/slate/idle_front", Side.SOUTH)
		);
		ModelHelper.setBlockModel(RestonedBlocks.SLATE_MOTION_SENSOR_ACTIVE,
			() -> new BlockModelVeryRotatable<>(RestonedBlocks.SLATE_MOTION_SENSOR_ACTIVE)
				.setTex(0, "restoned:block/motion_sensors/slate/side", Side.sides)
				.setTex(0, "restoned:block/motion_sensors/slate/active_front", Side.SOUTH)
				.setTex(1, "restoned:block/motion_sensors/slate/active_front_overlay", Side.SOUTH)
		);
		ModelHelper.setBlockModel(RestonedBlocks.PERMAFROST_MOTION_SENSOR_IDLE,
			() -> new BlockModelVeryRotatable<>(RestonedBlocks.PERMAFROST_MOTION_SENSOR_IDLE)
				.setTex(0, "restoned:block/motion_sensors/permafrost/side", Side.sides)
				.setTex(0, "restoned:block/motion_sensors/permafrost/idle_front", Side.SOUTH)
		);
		ModelHelper.setBlockModel(RestonedBlocks.PERMAFROST_MOTION_SENSOR_ACTIVE,
			() -> new BlockModelVeryRotatable<>(RestonedBlocks.PERMAFROST_MOTION_SENSOR_ACTIVE)
				.setTex(0, "restoned:block/motion_sensors/permafrost/side", Side.sides)
				.setTex(0, "restoned:block/motion_sensors/permafrost/active_front", Side.SOUTH)
				.setTex(1, "restoned:block/motion_sensors/permafrost/active_front_overlay", Side.SOUTH)
		);
		ModelHelper.setBlockModel(RestonedBlocks.NETHERRACK_MOTION_SENSOR_IDLE,
			() -> new BlockModelVeryRotatable<>(RestonedBlocks.NETHERRACK_MOTION_SENSOR_IDLE)
				.setTex(0, "restoned:block/motion_sensors/netherrack/side", Side.sides)
				.setTex(0, "restoned:block/motion_sensors/netherrack/idle_front", Side.SOUTH)
		);
		ModelHelper.setBlockModel(RestonedBlocks.NETHERRACK_MOTION_SENSOR_ACTIVE,
			() -> new BlockModelVeryRotatable<>(RestonedBlocks.NETHERRACK_MOTION_SENSOR_ACTIVE)
				.setTex(0, "restoned:block/motion_sensors/netherrack/side", Side.sides)
				.setTex(0, "restoned:block/motion_sensors/netherrack/active_front", Side.SOUTH)
				.setTex(1, "restoned:block/motion_sensors/netherrack/active_front_overlay", Side.SOUTH)
		);

		ModelHelper.setBlockModel(RestonedBlocks.BASALT_PISTON_BASE,
			() -> new BlockModelPiston<>(RestonedBlocks.BASALT_PISTON_BASE, TextureRegistry.getTexture("minecraft:block/piston/face"))
				.setPistonTextures("restoned:block/pistons/basalt/side", "restoned:block/pistons/basalt/top", "restoned:block/pistons/basalt/bottom")
				.setTex(0, "minecraft:block/piston/face", Side.sides)
				.withCustomItemBounds(0.0, 0.0, 0.0, 1.0, 1.0, 1.0)
		);
		ModelHelper.setBlockModel(RestonedBlocks.LIMESTONE_PISTON_BASE,
			() -> new BlockModelPiston<>(RestonedBlocks.LIMESTONE_PISTON_BASE, TextureRegistry.getTexture("minecraft:block/piston/face"))
				.setPistonTextures("restoned:block/pistons/limestone/side", "restoned:block/pistons/limestone/top", "restoned:block/pistons/limestone/bottom")
				.setTex(0, "minecraft:block/piston/face", Side.sides)
				.withCustomItemBounds(0.0, 0.0, 0.0, 1.0, 1.0, 1.0)
		);
		ModelHelper.setBlockModel(RestonedBlocks.GRANITE_PISTON_BASE,
			() -> new BlockModelPiston<>(RestonedBlocks.GRANITE_PISTON_BASE, TextureRegistry.getTexture("minecraft:block/piston/face"))
				.setPistonTextures("restoned:block/pistons/granite/side", "restoned:block/pistons/granite/top", "restoned:block/pistons/granite/bottom")
				.setTex(0, "minecraft:block/piston/face", Side.sides)
				.withCustomItemBounds(0.0, 0.0, 0.0, 1.0, 1.0, 1.0)
		);
		ModelHelper.setBlockModel(RestonedBlocks.MARBLE_PISTON_BASE,
			() -> new BlockModelPiston<>(RestonedBlocks.MARBLE_PISTON_BASE, TextureRegistry.getTexture("minecraft:block/piston/face"))
				.setPistonTextures("restoned:block/pistons/marble/side", "restoned:block/pistons/marble/top", "restoned:block/pistons/marble/bottom")
				.setTex(0, "minecraft:block/piston/face", Side.sides)
				.withCustomItemBounds(0.0, 0.0, 0.0, 1.0, 1.0, 1.0)
		);
		ModelHelper.setBlockModel(RestonedBlocks.SLATE_PISTON_BASE,
			() -> new BlockModelPiston<>(RestonedBlocks.SLATE_PISTON_BASE, TextureRegistry.getTexture("minecraft:block/piston/face"))
				.setPistonTextures("restoned:block/pistons/slate/side", "restoned:block/pistons/slate/top", "restoned:block/pistons/slate/bottom")
				.setTex(0, "minecraft:block/piston/face", Side.sides)
				.withCustomItemBounds(0.0, 0.0, 0.0, 1.0, 1.0, 1.0)
		);
		ModelHelper.setBlockModel(RestonedBlocks.PERMAFROST_PISTON_BASE,
			() -> new BlockModelPiston<>(RestonedBlocks.PERMAFROST_PISTON_BASE, TextureRegistry.getTexture("minecraft:block/piston/face"))
				.setPistonTextures("restoned:block/pistons/permafrost/side", "restoned:block/pistons/permafrost/top", "restoned:block/pistons/permafrost/bottom")
				.setTex(0, "minecraft:block/piston/face", Side.sides)
				.withCustomItemBounds(0.0, 0.0, 0.0, 1.0, 1.0, 1.0)
		);
		ModelHelper.setBlockModel(RestonedBlocks.NETHERRACK_PISTON_BASE,
			() -> new BlockModelPiston<>(RestonedBlocks.NETHERRACK_PISTON_BASE, TextureRegistry.getTexture("minecraft:block/piston/face"))
				.setPistonTextures("restoned:block/pistons/netherrack/side", "restoned:block/pistons/netherrack/top", "restoned:block/pistons/netherrack/bottom")
				.setTex(0, "minecraft:block/piston/face", Side.sides)
				.withCustomItemBounds(0.0, 0.0, 0.0, 1.0, 1.0, 1.0)
		);

		ModelHelper.setBlockModel(RestonedBlocks.BASALT_PISTON_BASE_STICKY,
			() -> new BlockModelPiston<>(RestonedBlocks.BASALT_PISTON_BASE_STICKY, TextureRegistry.getTexture("minecraft:block/piston_sticky/face"))
				.setPistonTextures("restoned:block/pistons/basalt/side", "restoned:block/pistons/basalt/top", "restoned:block/pistons/basalt/bottom")
				.setTex(0, "minecraft:block/piston_sticky/face", Side.sides)
				.withCustomItemBounds(0.0, 0.0, 0.0, 1.0, 1.0, 1.0)
		);
		ModelHelper.setBlockModel(RestonedBlocks.LIMESTONE_PISTON_BASE_STICKY,
			() -> new BlockModelPiston<>(RestonedBlocks.LIMESTONE_PISTON_BASE_STICKY, TextureRegistry.getTexture("minecraft:block/piston_sticky/face"))
				.setPistonTextures("restoned:block/pistons/limestone/side", "restoned:block/pistons/limestone/top", "restoned:block/pistons/limestone/bottom")
				.setTex(0, "minecraft:block/piston_sticky/face", Side.sides)
				.withCustomItemBounds(0.0, 0.0, 0.0, 1.0, 1.0, 1.0)
		);
		ModelHelper.setBlockModel(RestonedBlocks.GRANITE_PISTON_BASE_STICKY,
			() -> new BlockModelPiston<>(RestonedBlocks.GRANITE_PISTON_BASE_STICKY, TextureRegistry.getTexture("minecraft:block/piston_sticky/face"))
				.setPistonTextures("restoned:block/pistons/granite/side", "restoned:block/pistons/granite/top", "restoned:block/pistons/granite/bottom")
				.setTex(0, "minecraft:block/piston_sticky/face", Side.sides)
				.withCustomItemBounds(0.0, 0.0, 0.0, 1.0, 1.0, 1.0)
		);
		ModelHelper.setBlockModel(RestonedBlocks.MARBLE_PISTON_BASE_STICKY,
			() -> new BlockModelPiston<>(RestonedBlocks.MARBLE_PISTON_BASE_STICKY, TextureRegistry.getTexture("minecraft:block/piston_sticky/face"))
				.setPistonTextures("restoned:block/pistons/marble/side", "restoned:block/pistons/marble/top", "restoned:block/pistons/marble/bottom")
				.setTex(0, "minecraft:block/piston_sticky/face", Side.sides)
				.withCustomItemBounds(0.0, 0.0, 0.0, 1.0, 1.0, 1.0)
		);
		ModelHelper.setBlockModel(RestonedBlocks.SLATE_PISTON_BASE_STICKY,
			() -> new BlockModelPiston<>(RestonedBlocks.SLATE_PISTON_BASE_STICKY, TextureRegistry.getTexture("minecraft:block/piston_sticky/face"))
				.setPistonTextures("restoned:block/pistons/slate/side", "restoned:block/pistons/slate/top", "restoned:block/pistons/slate/bottom")
				.setTex(0, "minecraft:block/piston_sticky/face", Side.sides)
				.withCustomItemBounds(0.0, 0.0, 0.0, 1.0, 1.0, 1.0)
		);
		ModelHelper.setBlockModel(RestonedBlocks.PERMAFROST_PISTON_BASE_STICKY,
			() -> new BlockModelPiston<>(RestonedBlocks.PERMAFROST_PISTON_BASE_STICKY, TextureRegistry.getTexture("minecraft:block/piston_sticky/face"))
				.setPistonTextures("restoned:block/pistons/permafrost/side", "restoned:block/pistons/permafrost/top", "restoned:block/pistons/permafrost/bottom")
				.setTex(0, "minecraft:block/piston_sticky/face", Side.sides)
				.withCustomItemBounds(0.0, 0.0, 0.0, 1.0, 1.0, 1.0)
		);
		ModelHelper.setBlockModel(RestonedBlocks.NETHERRACK_PISTON_BASE_STICKY,
			() -> new BlockModelPiston<>(RestonedBlocks.NETHERRACK_PISTON_BASE_STICKY, TextureRegistry.getTexture("minecraft:block/piston_sticky/face"))
				.setPistonTextures("restoned:block/pistons/netherrack/side", "restoned:block/pistons/netherrack/top", "restoned:block/pistons/netherrack/bottom")
				.setTex(0, "minecraft:block/piston_sticky/face", Side.sides)
				.withCustomItemBounds(0.0, 0.0, 0.0, 1.0, 1.0, 1.0)
		);

		ModelHelper.setBlockModel(RestonedBlocks.BASALT_PISTON_BASE_STEEL,
			() -> new BlockModelPiston<>(RestonedBlocks.BASALT_PISTON_BASE_STEEL, TextureRegistry.getTexture("minecraft:block/piston_steel/face"))
				.setPistonTextures("restoned:block/pistons_steel/basalt/side", "restoned:block/pistons_steel/basalt/top", "restoned:block/pistons_steel/basalt/bottom")
				.setTex(0, "minecraft:block/piston_steel/face", Side.sides)
				.withCustomItemBounds(0.0, 0.0, 0.0, 1.0, 1.0, 1.0)
		);
		ModelHelper.setBlockModel(RestonedBlocks.LIMESTONE_PISTON_BASE_STEEL,
			() -> new BlockModelPiston<>(RestonedBlocks.LIMESTONE_PISTON_BASE_STEEL, TextureRegistry.getTexture("minecraft:block/piston_steel/face"))
				.setPistonTextures("restoned:block/pistons_steel/limestone/side", "restoned:block/pistons_steel/limestone/top", "restoned:block/pistons_steel/limestone/bottom")
				.setTex(0, "minecraft:block/piston_steel/face", Side.sides)
				.withCustomItemBounds(0.0, 0.0, 0.0, 1.0, 1.0, 1.0)
		);
		ModelHelper.setBlockModel(RestonedBlocks.GRANITE_PISTON_BASE_STEEL,
			() -> new BlockModelPiston<>(RestonedBlocks.GRANITE_PISTON_BASE_STEEL, TextureRegistry.getTexture("minecraft:block/piston_steel/face"))
				.setPistonTextures("restoned:block/pistons_steel/granite/side", "restoned:block/pistons_steel/granite/top", "restoned:block/pistons_steel/granite/bottom")
				.setTex(0, "minecraft:block/piston_steel/face", Side.sides)
				.withCustomItemBounds(0.0, 0.0, 0.0, 1.0, 1.0, 1.0)
		);
		ModelHelper.setBlockModel(RestonedBlocks.MARBLE_PISTON_BASE_STEEL,
			() -> new BlockModelPiston<>(RestonedBlocks.MARBLE_PISTON_BASE_STEEL, TextureRegistry.getTexture("minecraft:block/piston_steel/face"))
				.setPistonTextures("restoned:block/pistons_steel/marble/side", "restoned:block/pistons_steel/marble/top", "restoned:block/pistons_steel/marble/bottom")
				.setTex(0, "minecraft:block/piston_steel/face", Side.sides)
				.withCustomItemBounds(0.0, 0.0, 0.0, 1.0, 1.0, 1.0)
		);
		ModelHelper.setBlockModel(RestonedBlocks.SLATE_PISTON_BASE_STEEL,
			() -> new BlockModelPiston<>(RestonedBlocks.SLATE_PISTON_BASE_STEEL, TextureRegistry.getTexture("minecraft:block/piston_steel/face"))
				.setPistonTextures("restoned:block/pistons_steel/slate/side", "restoned:block/pistons_steel/slate/top", "restoned:block/pistons_steel/slate/bottom")
				.setTex(0, "minecraft:block/piston_steel/face", Side.sides)
				.withCustomItemBounds(0.0, 0.0, 0.0, 1.0, 1.0, 1.0)
		);
		ModelHelper.setBlockModel(RestonedBlocks.PERMAFROST_PISTON_BASE_STEEL,
			() -> new BlockModelPiston<>(RestonedBlocks.PERMAFROST_PISTON_BASE_STEEL, TextureRegistry.getTexture("minecraft:block/piston_steel/face"))
				.setPistonTextures("restoned:block/pistons_steel/permafrost/side", "restoned:block/pistons_steel/permafrost/top", "restoned:block/pistons_steel/permafrost/bottom")
				.setTex(0, "minecraft:block/piston_steel/face", Side.sides)
				.withCustomItemBounds(0.0, 0.0, 0.0, 1.0, 1.0, 1.0)
		);
		ModelHelper.setBlockModel(RestonedBlocks.NETHERRACK_PISTON_BASE_STEEL,
			() -> new BlockModelPiston<>(RestonedBlocks.NETHERRACK_PISTON_BASE_STEEL, TextureRegistry.getTexture("minecraft:block/piston_steel/face"))
				.setPistonTextures("restoned:block/pistons_steel/netherrack/side", "restoned:block/pistons_steel/netherrack/top", "restoned:block/pistons_steel/netherrack/bottom")
				.setTex(0, "minecraft:block/piston_steel/face", Side.sides)
				.withCustomItemBounds(0.0, 0.0, 0.0, 1.0, 1.0, 1.0)
		);

		ModelHelper.setBlockModel(RestonedBlocks.BASALT_SPIKES,
			() -> new BlockModelSpikes<>(RestonedBlocks.BASALT_SPIKES)
				.setTex(0, "restoned:block/spikes/basalt/side", Side.sides)
				.setTex(0, "restoned:block/spikes/basalt/top", Side.TOP)
				.setTex(0, "restoned:block/spikes/basalt/bottom", Side.BOTTOM)
		);
		ModelHelper.setBlockModel(RestonedBlocks.LIMESTONE_SPIKES,
			() -> new BlockModelSpikes<>(RestonedBlocks.LIMESTONE_SPIKES)
				.setTex(0, "restoned:block/spikes/limestone/side", Side.sides)
				.setTex(0, "restoned:block/spikes/limestone/top", Side.TOP)
				.setTex(0, "restoned:block/spikes/limestone/bottom", Side.BOTTOM)
		);
		ModelHelper.setBlockModel(RestonedBlocks.GRANITE_SPIKES,
			() -> new BlockModelSpikes<>(RestonedBlocks.GRANITE_SPIKES)
				.setTex(0, "restoned:block/spikes/granite/side", Side.sides)
				.setTex(0, "restoned:block/spikes/granite/top", Side.TOP)
				.setTex(0, "restoned:block/spikes/granite/bottom", Side.BOTTOM)
		);
		ModelHelper.setBlockModel(RestonedBlocks.MARBLE_SPIKES,
			() -> new BlockModelSpikes<>(RestonedBlocks.MARBLE_SPIKES)
				.setTex(0, "restoned:block/spikes/marble/side", Side.sides)
				.setTex(0, "restoned:block/spikes/marble/top", Side.TOP)
				.setTex(0, "restoned:block/spikes/marble/bottom", Side.BOTTOM)
		);
		ModelHelper.setBlockModel(RestonedBlocks.SLATE_SPIKES,
			() -> new BlockModelSpikes<>(RestonedBlocks.SLATE_SPIKES)
				.setTex(0, "restoned:block/spikes/slate/side", Side.sides)
				.setTex(0, "restoned:block/spikes/slate/top", Side.TOP)
				.setTex(0, "restoned:block/spikes/slate/bottom", Side.BOTTOM)
		);
		ModelHelper.setBlockModel(RestonedBlocks.PERMAFROST_SPIKES,
			() -> new BlockModelSpikes<>(RestonedBlocks.PERMAFROST_SPIKES)
				.setTex(0, "restoned:block/spikes/permafrost/side", Side.sides)
				.setTex(0, "restoned:block/spikes/permafrost/top", Side.TOP)
				.setTex(0, "restoned:block/spikes/permafrost/bottom", Side.BOTTOM)
		);
		ModelHelper.setBlockModel(RestonedBlocks.NETHERRACK_SPIKES,
			() -> new BlockModelSpikes<>(RestonedBlocks.NETHERRACK_SPIKES)
				.setTex(0, "restoned:block/spikes/netherrack/side", Side.sides)
				.setTex(0, "restoned:block/spikes/netherrack/top", Side.TOP)
				.setTex(0, "restoned:block/spikes/netherrack/bottom", Side.BOTTOM)
		);

		ModelHelper.setBlockModel(RestonedBlocks.DISPENSER_COBBLE_BASALT,
			() -> new BlockModelVeryRotatable<>(RestonedBlocks.DISPENSER_COBBLE_BASALT)
				.setTex(0, "restoned:block/dispensers/basalt/side", Side.sides)
				.setTex(0, "restoned:block/dispensers/basalt/top", Side.TOP)
				.setTex(0, "restoned:block/dispensers/basalt/bottom", Side.BOTTOM)
				.setTex(0, "restoned:block/dispensers/basalt/front", Side.SOUTH)
		);
		ModelHelper.setBlockModel(RestonedBlocks.DISPENSER_COBBLE_LIMESTONE,
			() -> new BlockModelVeryRotatable<>(RestonedBlocks.DISPENSER_COBBLE_LIMESTONE)
				.setTex(0, "restoned:block/dispensers/limestone/side", Side.sides)
				.setTex(0, "restoned:block/dispensers/limestone/top", Side.TOP)
				.setTex(0, "restoned:block/dispensers/limestone/bottom", Side.BOTTOM)
				.setTex(0, "restoned:block/dispensers/limestone/front", Side.SOUTH)
		);
		ModelHelper.setBlockModel(RestonedBlocks.DISPENSER_COBBLE_GRANITE,
			() -> new BlockModelVeryRotatable<>(RestonedBlocks.DISPENSER_COBBLE_GRANITE)
				.setTex(0, "restoned:block/dispensers/granite/side", Side.sides)
				.setTex(0, "restoned:block/dispensers/granite/top", Side.TOP)
				.setTex(0, "restoned:block/dispensers/granite/bottom", Side.BOTTOM)
				.setTex(0, "restoned:block/dispensers/granite/front", Side.SOUTH)
		);
		ModelHelper.setBlockModel(RestonedBlocks.DISPENSER_COBBLE_MARBLE,
			() -> new BlockModelVeryRotatable<>(RestonedBlocks.DISPENSER_COBBLE_MARBLE)
				.setTex(0, "restoned:block/dispensers/marble/side", Side.sides)
				.setTex(0, "restoned:block/dispensers/marble/top", Side.TOP)
				.setTex(0, "restoned:block/dispensers/marble/bottom", Side.BOTTOM)
				.setTex(0, "restoned:block/dispensers/marble/front", Side.SOUTH)
		);
		ModelHelper.setBlockModel(RestonedBlocks.DISPENSER_COBBLE_SLATE,
			() -> new BlockModelVeryRotatable<>(RestonedBlocks.DISPENSER_COBBLE_SLATE)
				.setTex(0, "restoned:block/dispensers/slate/side", Side.sides)
				.setTex(0, "restoned:block/dispensers/slate/top", Side.TOP)
				.setTex(0, "restoned:block/dispensers/slate/bottom", Side.BOTTOM)
				.setTex(0, "restoned:block/dispensers/slate/front", Side.SOUTH)
		);
		ModelHelper.setBlockModel(RestonedBlocks.DISPENSER_COBBLE_PERMAFROST,
			() -> new BlockModelVeryRotatable<>(RestonedBlocks.DISPENSER_COBBLE_PERMAFROST)
				.setTex(0, "restoned:block/dispensers/permafrost/side", Side.sides)
				.setTex(0, "restoned:block/dispensers/permafrost/top", Side.TOP)
				.setTex(0, "restoned:block/dispensers/permafrost/bottom", Side.BOTTOM)
				.setTex(0, "restoned:block/dispensers/permafrost/front", Side.SOUTH)
		);
		ModelHelper.setBlockModel(RestonedBlocks.DISPENSER_COBBLE_NETHERRACK,
			() -> new BlockModelVeryRotatable<>(RestonedBlocks.DISPENSER_COBBLE_NETHERRACK)
				.setTex(0, "restoned:block/dispensers/netherrack/side", Side.sides)
				.setTex(0, "restoned:block/dispensers/netherrack/top", Side.TOP)
				.setTex(0, "restoned:block/dispensers/netherrack/bottom", Side.BOTTOM)
				.setTex(0, "restoned:block/dispensers/netherrack/front", Side.SOUTH)
		);

		ModelHelper.setBlockModel(RestonedBlocks.REPEATER_IDLE_BASALT,
			() -> new BlockModelRepeater(RestonedBlocks.REPEATER_IDLE_BASALT)
				.setTex(0, "minecraft:block/polished_basalt_top", Side.sides)
				.setTex(0, "restoned:block/repeaters/basalt/idle_top", Side.TOP)
				.setTex(0, "restoned:block/repeaters/basalt/idle_top", Side.BOTTOM)
		);
		ModelHelper.setBlockModel(RestonedBlocks.REPEATER_ACTIVE_BASALT,
			() -> new BlockModelRepeater(RestonedBlocks.REPEATER_ACTIVE_BASALT)
				.setTex(0, "minecraft:block/polished_basalt_top", Side.sides)
				.setTex(0, "restoned:block/repeaters/basalt/active_top", Side.TOP)
				.setTex(0, "restoned:block/repeaters/basalt/active_top", Side.BOTTOM)
				.setAllTextures(1, "minecraft:block/repeater/active_overlay")
		);
		ModelHelper.setBlockModel(RestonedBlocks.REPEATER_IDLE_LIMESTONE,
			() -> new BlockModelRepeater(RestonedBlocks.REPEATER_IDLE_LIMESTONE)
				.setTex(0, "minecraft:block/polished_limestone_top", Side.sides)
				.setTex(0, "restoned:block/repeaters/limestone/idle_top", Side.TOP)
				.setTex(0, "restoned:block/repeaters/limestone/idle_top", Side.BOTTOM)
		);
		ModelHelper.setBlockModel(RestonedBlocks.REPEATER_ACTIVE_LIMESTONE,
			() -> new BlockModelRepeater(RestonedBlocks.REPEATER_ACTIVE_LIMESTONE)
				.setTex(0, "minecraft:block/polished_limestone_top", Side.sides)
				.setTex(0, "restoned:block/repeaters/limestone/active_top", Side.TOP)
				.setTex(0, "restoned:block/repeaters/limestone/active_top", Side.BOTTOM)
				.setAllTextures(1, "minecraft:block/repeater/active_overlay")
		);
		ModelHelper.setBlockModel(RestonedBlocks.REPEATER_IDLE_GRANITE,
			() -> new BlockModelRepeater(RestonedBlocks.REPEATER_IDLE_GRANITE)
				.setTex(0, "minecraft:block/polished_granite_top", Side.sides)
				.setTex(0, "restoned:block/repeaters/granite/idle_top", Side.TOP)
				.setTex(0, "restoned:block/repeaters/granite/idle_top", Side.BOTTOM)
		);
		ModelHelper.setBlockModel(RestonedBlocks.REPEATER_ACTIVE_GRANITE,
			() -> new BlockModelRepeater(RestonedBlocks.REPEATER_ACTIVE_GRANITE)
				.setTex(0, "minecraft:block/polished_granite_top", Side.sides)
				.setTex(0, "restoned:block/repeaters/granite/active_top", Side.TOP)
				.setTex(0, "restoned:block/repeaters/granite/active_top", Side.BOTTOM)
				.setAllTextures(1, "minecraft:block/repeater/active_overlay")
		);
		ModelHelper.setBlockModel(RestonedBlocks.REPEATER_IDLE_MARBLE,
			() -> new BlockModelRepeater(RestonedBlocks.REPEATER_IDLE_MARBLE)
				.setTex(0, "restoned:block/polished_and_carved/polished_marble_top", Side.sides)
				.setTex(0, "restoned:block/repeaters/marble/idle_top", Side.TOP)
				.setTex(0, "restoned:block/repeaters/marble/idle_top", Side.BOTTOM)
		);
		ModelHelper.setBlockModel(RestonedBlocks.REPEATER_ACTIVE_MARBLE,
			() -> new BlockModelRepeater(RestonedBlocks.REPEATER_ACTIVE_MARBLE)
				.setTex(0, "restoned:block/polished_and_carved//polished_marble_top", Side.sides)
				.setTex(0, "restoned:block/repeaters/marble/active_top", Side.TOP)
				.setTex(0, "restoned:block/repeaters/marble/active_top", Side.BOTTOM)
				.setAllTextures(1, "minecraft:block/repeater/active_overlay")
		);
		ModelHelper.setBlockModel(RestonedBlocks.REPEATER_IDLE_SLATE,
			() -> new BlockModelRepeater(RestonedBlocks.REPEATER_IDLE_SLATE)
				.setTex(0, "minecraft:block/polished_slate_top", Side.sides)
				.setTex(0, "restoned:block/repeaters/slate/idle_top", Side.TOP)
				.setTex(0, "restoned:block/repeaters/slate/idle_top", Side.BOTTOM)
		);
		ModelHelper.setBlockModel(RestonedBlocks.REPEATER_ACTIVE_SLATE,
			() -> new BlockModelRepeater(RestonedBlocks.REPEATER_ACTIVE_SLATE)
				.setTex(0, "minecraft:block/polished_slate_top", Side.sides)
				.setTex(0, "restoned:block/repeaters/slate/active_top", Side.TOP)
				.setTex(0, "restoned:block/repeaters/slate/active_top", Side.BOTTOM)
				.setAllTextures(1, "minecraft:block/repeater/active_overlay")
		);
		ModelHelper.setBlockModel(RestonedBlocks.REPEATER_IDLE_PERMAFROST,
			() -> new BlockModelRepeater(RestonedBlocks.REPEATER_IDLE_PERMAFROST)
				.setTex(0, "minecraft:block/polished_permafrost_top", Side.sides)
				.setTex(0, "restoned:block/repeaters/permafrost/idle_top", Side.TOP)
				.setTex(0, "restoned:block/repeaters/permafrost/idle_top", Side.BOTTOM)
		);
		ModelHelper.setBlockModel(RestonedBlocks.REPEATER_ACTIVE_PERMAFROST,
			() -> new BlockModelRepeater(RestonedBlocks.REPEATER_ACTIVE_PERMAFROST)
				.setTex(0, "minecraft:block/polished_permafrost_top", Side.sides)
				.setTex(0, "restoned:block/repeaters/permafrost/active_top", Side.TOP)
				.setTex(0, "restoned:block/repeaters/permafrost/active_top", Side.BOTTOM)
				.setAllTextures(1, "minecraft:block/repeater/active_overlay")
		);
		ModelHelper.setBlockModel(RestonedBlocks.REPEATER_IDLE_NETHERRACK,
			() -> new BlockModelRepeater(RestonedBlocks.REPEATER_IDLE_NETHERRACK)
				.setTex(0, "minecraft:block/polished_netherrack_top", Side.sides)
				.setTex(0, "restoned:block/repeaters/netherrack/idle_top", Side.TOP)
				.setTex(0, "restoned:block/repeaters/netherrack/idle_top", Side.BOTTOM)
		);
		ModelHelper.setBlockModel(RestonedBlocks.REPEATER_ACTIVE_NETHERRACK,
			() -> new BlockModelRepeater(RestonedBlocks.REPEATER_ACTIVE_NETHERRACK)
				.setTex(0, "minecraft:block/polished_netherrack_top", Side.sides)
				.setTex(0, "restoned:block/repeaters/netherrack/active_top", Side.TOP)
				.setTex(0, "restoned:block/repeaters/netherrack/active_top", Side.BOTTOM)
				.setAllTextures(1, "minecraft:block/repeater/active_overlay")
		);

		ModelHelper.setBlockModel(RestonedBlocks.ACTIVATOR_COBBLE_STONE,
			() -> new BlockModelCustomActivator<>(RestonedBlocks.ACTIVATOR_COBBLE_STONE,
				"restoned:block/activators/stone/top_active",
				"restoned:block/activators/stone/bottom_active",
				"restoned:block/activators/stone/side_active",
				"restoned:block/activators/stone/front_active",
				"restoned:block/activators/stone/top_active_overlay",
				"restoned:block/activators/stone/bottom_active_overlay",
				"restoned:block/activators/stone/side_active_overlay",
				"restoned:block/activators/stone/front_active_overlay")
				.setTex(0, "restoned:block/activators/stone/side", Side.sides)
				.setTex(0, "restoned:block/activators/stone/top", Side.TOP)
				.setTex(0, "restoned:block/activators/stone/bottom", Side.BOTTOM)
				.setTex(0, "restoned:block/activators/stone/front", Side.SOUTH)
		);
		ModelHelper.setBlockModel(RestonedBlocks.ACTIVATOR_COBBLE_BASALT,
			() -> new BlockModelCustomActivator<>(RestonedBlocks.ACTIVATOR_COBBLE_BASALT,
				"restoned:block/activators/basalt/top_active",
				"restoned:block/activators/basalt/bottom_active",
				"restoned:block/activators/basalt/side_active",
				"restoned:block/activators/basalt/front_active",
				"restoned:block/activators/basalt/top_active_overlay",
				"restoned:block/activators/basalt/bottom_active_overlay",
				"restoned:block/activators/basalt/side_active_overlay",
				"restoned:block/activators/basalt/front_active_overlay")
				.setTex(0, "restoned:block/activators/basalt/side", Side.sides)
				.setTex(0, "restoned:block/activators/basalt/top", Side.TOP)
				.setTex(0, "restoned:block/activators/basalt/bottom", Side.BOTTOM)
				.setTex(0, "restoned:block/activators/basalt/front", Side.SOUTH)
		);
		ModelHelper.setBlockModel(RestonedBlocks.ACTIVATOR_COBBLE_LIMESTONE,
			() -> new BlockModelCustomActivator<>(RestonedBlocks.ACTIVATOR_COBBLE_LIMESTONE,
				"restoned:block/activators/limestone/top_active",
				"restoned:block/activators/limestone/bottom_active",
				"restoned:block/activators/limestone/side_active",
				"restoned:block/activators/limestone/front_active",
				"restoned:block/activators/limestone/top_active_overlay",
				"restoned:block/activators/limestone/bottom_active_overlay",
				"restoned:block/activators/limestone/side_active_overlay",
				"restoned:block/activators/limestone/front_active_overlay")
				.setTex(0, "restoned:block/activators/limestone/side", Side.sides)
				.setTex(0, "restoned:block/activators/limestone/top", Side.TOP)
				.setTex(0, "restoned:block/activators/limestone/bottom", Side.BOTTOM)
				.setTex(0, "restoned:block/activators/limestone/front", Side.SOUTH)
		);
		ModelHelper.setBlockModel(RestonedBlocks.ACTIVATOR_COBBLE_GRANITE,
			() -> new BlockModelCustomActivator<>(RestonedBlocks.ACTIVATOR_COBBLE_GRANITE,
				"restoned:block/activators/granite/top_active",
				"restoned:block/activators/granite/bottom_active",
				"restoned:block/activators/granite/side_active",
				"restoned:block/activators/granite/front_active",
				"restoned:block/activators/granite/top_active_overlay",
				"restoned:block/activators/granite/bottom_active_overlay",
				"restoned:block/activators/granite/side_active_overlay",
				"restoned:block/activators/granite/front_active_overlay")
				.setTex(0, "restoned:block/activators/granite/side", Side.sides)
				.setTex(0, "restoned:block/activators/granite/top", Side.TOP)
				.setTex(0, "restoned:block/activators/granite/bottom", Side.BOTTOM)
				.setTex(0, "restoned:block/activators/granite/front", Side.SOUTH)
		);
		ModelHelper.setBlockModel(RestonedBlocks.ACTIVATOR_COBBLE_MARBLE,
			() -> new BlockModelCustomActivator<>(RestonedBlocks.ACTIVATOR_COBBLE_MARBLE,
				"restoned:block/activators/marble/top_active",
				"restoned:block/activators/marble/bottom_active",
				"restoned:block/activators/marble/side_active",
				"restoned:block/activators/marble/front_active",
				"restoned:block/activators/marble/top_active_overlay",
				"restoned:block/activators/marble/bottom_active_overlay",
				"restoned:block/activators/marble/side_active_overlay",
				"restoned:block/activators/marble/front_active_overlay")
				.setTex(0, "restoned:block/activators/marble/side", Side.sides)
				.setTex(0, "restoned:block/activators/marble/top", Side.TOP)
				.setTex(0, "restoned:block/activators/marble/bottom", Side.BOTTOM)
				.setTex(0, "restoned:block/activators/marble/front", Side.SOUTH)
		);
		ModelHelper.setBlockModel(RestonedBlocks.ACTIVATOR_COBBLE_SLATE,
			() -> new BlockModelCustomActivator<>(RestonedBlocks.ACTIVATOR_COBBLE_SLATE,
				"restoned:block/activators/slate/top_active",
				"restoned:block/activators/slate/bottom_active",
				"restoned:block/activators/slate/side_active",
				"restoned:block/activators/slate/front_active",
				"restoned:block/activators/slate/top_active_overlay",
				"restoned:block/activators/slate/bottom_active_overlay",
				"restoned:block/activators/slate/side_active_overlay",
				"restoned:block/activators/slate/front_active_overlay")
				.setTex(0, "restoned:block/activators/slate/side", Side.sides)
				.setTex(0, "restoned:block/activators/slate/top", Side.TOP)
				.setTex(0, "restoned:block/activators/slate/bottom", Side.BOTTOM)
				.setTex(0, "restoned:block/activators/slate/front", Side.SOUTH)
		);
		ModelHelper.setBlockModel(RestonedBlocks.ACTIVATOR_COBBLE_PERMAFROST,
			() -> new BlockModelCustomActivator<>(RestonedBlocks.ACTIVATOR_COBBLE_PERMAFROST,
				"restoned:block/activators/permafrost/top_active",
				"restoned:block/activators/permafrost/bottom_active",
				"restoned:block/activators/permafrost/side_active",
				"restoned:block/activators/permafrost/front_active",
				"restoned:block/activators/permafrost/top_active_overlay",
				"restoned:block/activators/permafrost/bottom_active_overlay",
				"restoned:block/activators/permafrost/side_active_overlay",
				"restoned:block/activators/permafrost/front_active_overlay")
				.setTex(0, "restoned:block/activators/permafrost/side", Side.sides)
				.setTex(0, "restoned:block/activators/permafrost/top", Side.TOP)
				.setTex(0, "restoned:block/activators/permafrost/bottom", Side.BOTTOM)
				.setTex(0, "restoned:block/activators/permafrost/front", Side.SOUTH)
		);
	}

	@Override
	public void initItemModels(ItemModelDispatcher dispatcher) {
		ModelHelper.setItemModel(RestonedItems.REPEATER_BASALT,
			() -> {
				ItemModelStandard model = new ItemModelStandard(RestonedItems.REPEATER_BASALT, RestonedMain.MOD_ID);
				model.icon = TextureRegistry.getTexture(RestonedItems.REPEATER_BASALT.namespaceID);
				return model;
		});
		ModelHelper.setItemModel(RestonedItems.REPEATER_LIMESTONE,
			() -> {
				ItemModelStandard model = new ItemModelStandard(RestonedItems.REPEATER_LIMESTONE, RestonedMain.MOD_ID);
				model.icon = TextureRegistry.getTexture(RestonedItems.REPEATER_LIMESTONE.namespaceID);
				return model;
			});
		ModelHelper.setItemModel(RestonedItems.REPEATER_GRANITE,
			() -> {
				ItemModelStandard model = new ItemModelStandard(RestonedItems.REPEATER_GRANITE, RestonedMain.MOD_ID);
				model.icon = TextureRegistry.getTexture(RestonedItems.REPEATER_GRANITE.namespaceID);
				return model;
			});
		ModelHelper.setItemModel(RestonedItems.REPEATER_MARBLE,
			() -> {
				ItemModelStandard model = new ItemModelStandard(RestonedItems.REPEATER_MARBLE, RestonedMain.MOD_ID);
				model.icon = TextureRegistry.getTexture(RestonedItems.REPEATER_MARBLE.namespaceID);
				return model;
			});
		ModelHelper.setItemModel(RestonedItems.REPEATER_SLATE,
			() -> {
				ItemModelStandard model = new ItemModelStandard(RestonedItems.REPEATER_SLATE, RestonedMain.MOD_ID);
				model.icon = TextureRegistry.getTexture(RestonedItems.REPEATER_SLATE.namespaceID);
				return model;
			});
		ModelHelper.setItemModel(RestonedItems.REPEATER_PERMAFROST,
			() -> {
				ItemModelStandard model = new ItemModelStandard(RestonedItems.REPEATER_PERMAFROST, RestonedMain.MOD_ID);
				model.icon = TextureRegistry.getTexture(RestonedItems.REPEATER_PERMAFROST.namespaceID);
				return model;
			});
		ModelHelper.setItemModel(RestonedItems.REPEATER_NETHERRACK,
			() -> {
				ItemModelStandard model = new ItemModelStandard(RestonedItems.REPEATER_NETHERRACK, RestonedMain.MOD_ID);
				model.icon = TextureRegistry.getTexture(RestonedItems.REPEATER_NETHERRACK.namespaceID);
				return model;
			});
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
