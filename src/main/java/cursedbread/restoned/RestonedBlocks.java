package cursedbread.restoned;

import cursedbread.restoned.logics.BlockLogicCustomMotionSensor;
import net.minecraft.core.block.*;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.block.material.MaterialColor;
import net.minecraft.core.block.tag.BlockTags;
import net.minecraft.core.data.tag.Tag;
import net.minecraft.core.entity.Mob;
import net.minecraft.core.entity.player.Player;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.sound.BlockSound;
import net.minecraft.core.sound.BlockSounds;
import turniplabs.halplibe.helper.BlockBuilder;
import turniplabs.halplibe.helper.CreativeHelper;

import java.util.function.Supplier;

import static net.minecraft.core.block.Blocks.BRICK_MARBLE;
import static net.minecraft.core.block.Blocks.GRAVEL;

public class RestonedBlocks {
	public static int blockId;

	public static Block <?> COBBLE_MARBLE;
	public static Block <?> COBBLE_SLATE;

	public static Block <BlockLogicSlab> SLAB_COBBLE_MARBLE;
	public static Block <BlockLogicSlab> SLAB_COBBLE_SLATE;

	public static Block <BlockLogicStairs> STAIRS_COBBLE_MARBLE;
	public static Block <BlockLogicStairs> STAIRS_COBBLE_SLATE;

	public static Block <?> COBBLE_BASALT_MOSSY;
	public static Block <?> COBBLE_LIMESTONE_MOSSY;
	public static Block <?> COBBLE_GRANITE_MOSSY;
	public static Block <?> COBBLE_MARBLE_MOSSY;
	public static Block <?> COBBLE_SLATE_MOSSY;
	public static Block <?> COBBLE_PERMAFROST_MOSSY;

	public static Block <?> PILLAR_STONE;
	public static Block <?> PILLAR_BASALT;
	public static Block <?> PILLAR_LIMESTONE;
	public static Block <?> PILLAR_GRANITE;
	public static Block <?> PILLAR_SLATE;
	public static Block <?> PILLAR_PERMAFROST;
	public static Block <?> PILLAR_NETHERRACK;

	public static Block <?> MARBLE_POLISHED;

	public static Block <?> MARBLE_CARVED;
	public static Block <?> SLATE_CARVED;

	public static Block <BlockLogicSlab> SLAB_MARBLE_POLISHED;
	public static Block <BlockLogicSlab> SLAB_SLATE_POLISHED;

	public static Block <BlockLogicStairs> STAIRS_BRICK_MARBLE;

	public static Block <BlockLogicSlab> SLAB_CAPSTONE_STONE;
	public static Block <BlockLogicSlab> SLAB_CAPSTONE_BASALT;
	public static Block <BlockLogicSlab> SLAB_CAPSTONE_LIMESTONE;
	public static Block <BlockLogicSlab> SLAB_CAPSTONE_GRANITE;
	public static Block <BlockLogicSlab> SLAB_CAPSTONE_SLATE;
	public static Block <BlockLogicSlab> SLAB_CAPSTONE_PERMAFROST;
	public static Block <BlockLogicSlab> SLAB_CAPSTONE_NETHERRACK;

	public static Block <?> CAPSTONE_STONE;
	public static Block <?> CAPSTONE_BASALT;
	public static Block <?> CAPSTONE_LIMESTONE;
	public static Block <?> CAPSTONE_GRANITE;
	public static Block <?> CAPSTONE_SLATE;
	public static Block <?> CAPSTONE_PERMAFROST;
	public static Block <?> CAPSTONE_NETHERRACK;

	public static Block <?> BUTTON_BASALT;
	public static Block <?> BUTTON_LIMESTONE;
	public static Block <?> BUTTON_GRANITE;
	public static Block <?> BUTTON_MARBLE;
	public static Block <?> BUTTON_SLATE;
	public static Block <?> BUTTON_PERMAFROST;
	public static Block <?> BUTTON_NETHERRACK;

	public static Block <?> LEVER_COBBLE_BASALT;
	public static Block <?> LEVER_COBBLE_LIMESTONE;
	public static Block <?> LEVER_COBBLE_GRANITE;
	public static Block <?> LEVER_COBBLE_MARBLE;
	public static Block <?> LEVER_COBBLE_SLATE;
	public static Block <?> LEVER_COBBLE_PERMAFROST;
	public static Block <?> LEVER_COBBLE_NETHERRACK;

	public static Block <?> PRESSURE_PLATE_BASALT;
	public static Block <?> PRESSURE_PLATE_LIMESTONE;
	public static Block <?> PRESSURE_PLATE_GRANITE;
	public static Block <?> PRESSURE_PLATE_MARBLE;
	public static Block <?> PRESSURE_PLATE_SLATE;
	public static Block <?> PRESSURE_PLATE_PERMAFROST;
	public static Block <?> PRESSURE_PLATE_NETHERRACK;

	public static Block <?> PRESSURE_PLATE_COBBLE_BASALT;
	public static Block <?> PRESSURE_PLATE_COBBLE_LIMESTONE;
	public static Block <?> PRESSURE_PLATE_COBBLE_GRANITE;
	public static Block <?> PRESSURE_PLATE_COBBLE_MARBLE;
	public static Block <?> PRESSURE_PLATE_COBBLE_SLATE;
	public static Block <?> PRESSURE_PLATE_COBBLE_PERMAFROST;
	public static Block <?> PRESSURE_PLATE_COBBLE_NETHERRACK;

	public static Block <BlockLogicMotionSensor> BASALT_MOTION_SENSOR_IDLE;
	public static Block <BlockLogicMotionSensor> BASALT_MOTION_SENSOR_ACTIVE;
	public static Block <BlockLogicMotionSensor> LIMESTONE_MOTION_SENSOR_IDLE;
	public static Block <BlockLogicMotionSensor> LIMESTONE_MOTION_SENSOR_ACTIVE;
	public static Block <BlockLogicMotionSensor> GRANITE_MOTION_SENSOR_IDLE;
	public static Block <BlockLogicMotionSensor> GRANITE_MOTION_SENSOR_ACTIVE;
	public static Block <BlockLogicMotionSensor> MARBLE_MOTION_SENSOR_IDLE;
	public static Block <BlockLogicMotionSensor> MARBLE_MOTION_SENSOR_ACTIVE;
	public static Block <BlockLogicMotionSensor> SLATE_MOTION_SENSOR_IDLE;
	public static Block <BlockLogicMotionSensor> SLATE_MOTION_SENSOR_ACTIVE;
	public static Block <BlockLogicMotionSensor> PERMAFROST_MOTION_SENSOR_IDLE;
	public static Block <BlockLogicMotionSensor> PERMAFROST_MOTION_SENSOR_ACTIVE;
	public static Block <BlockLogicMotionSensor> NETHERRACK_MOTION_SENSOR_IDLE;
	public static Block <BlockLogicMotionSensor> NETHERRACK_MOTION_SENSOR_ACTIVE;

	public void initBlockDetails(){

	}

	public void initBlocks(){
		COBBLE_MARBLE = new BlockBuilder(RestonedMain.MOD_ID)
			.setBlockSound(BlockSounds.STONE)
			.setHardness(1.0F)
			.setTags(BlockTags.MINEABLE_BY_PICKAXE)
			.build("cobble.marble", blockId++, b -> new BlockLogicCobble(b, Material.marble, () -> {return GRAVEL;}));
		COBBLE_SLATE = new BlockBuilder(RestonedMain.MOD_ID)
			.setBlockSound(BlockSounds.STONE)
			.setHardness(1.5F)
			.setResistance(10.0F)
			.setTags(BlockTags.MINEABLE_BY_PICKAXE)
			.build("cobble.slate", blockId++, b -> new BlockLogicCobble(b, Material.slate, () -> {return GRAVEL;}));

		COBBLE_BASALT_MOSSY = new BlockBuilder(RestonedMain.MOD_ID)
			.setBlockSound(BlockSounds.STONE)
			.setHardness(2.0F)
			.setResistance(10.0F)
			.setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.GROWS_FLOWERS)
			.build("cobble.basalt.mossy", blockId++, b -> new BlockLogicCobble(b, Material.basalt, () -> {return GRAVEL;}));
		COBBLE_LIMESTONE_MOSSY = new BlockBuilder(RestonedMain.MOD_ID)
			.setBlockSound(BlockSounds.STONE)
			.setHardness(2.0F)
			.setResistance(10.0F)
			.setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.GROWS_FLOWERS)
			.build("cobble.limestone.mossy", blockId++, b -> new BlockLogicCobble(b, Material.limestone, () -> {return GRAVEL;}));
		COBBLE_GRANITE_MOSSY = new BlockBuilder(RestonedMain.MOD_ID)
			.setBlockSound(BlockSounds.STONE)
			.setHardness(2.0F)
			.setResistance(10.0F)
			.setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.GROWS_FLOWERS)
			.build("cobble.granite.mossy", blockId++, b -> new BlockLogicCobble(b, Material.granite, () -> {return GRAVEL;}));
		COBBLE_MARBLE_MOSSY = new BlockBuilder(RestonedMain.MOD_ID)
			.setBlockSound(BlockSounds.STONE)
			.setHardness(2.0F)
			.setResistance(10.0F)
			.setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.GROWS_FLOWERS)
			.build("cobble.marble.mossy", blockId++, b -> new BlockLogicCobble(b, Material.marble, () -> {return GRAVEL;}));
		COBBLE_SLATE_MOSSY = new BlockBuilder(RestonedMain.MOD_ID)
			.setBlockSound(BlockSounds.STONE)
			.setHardness(2.0F)
			.setResistance(10.0F)
			.setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.GROWS_FLOWERS)
			.build("cobble.slate.mossy", blockId++, b -> new BlockLogicCobble(b, Material.slate, () -> {return GRAVEL;}));
		COBBLE_PERMAFROST_MOSSY = new BlockBuilder(RestonedMain.MOD_ID)
			.setBlockSound(BlockSounds.STONE)
			.setHardness(2.0F)
			.setResistance(10.0F)
			.setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.GROWS_FLOWERS)
			.build("cobble.permafrost.mossy", blockId++, b -> new BlockLogicCobble(b, Material.permafrost, () -> {return GRAVEL;}));

		PILLAR_STONE = new BlockBuilder(RestonedMain.MOD_ID)
			.setBlockSound(BlockSounds.STONE)
			.setHardness(1.0F)
			.setResistance(10.0F)
			.setTags(new Tag[]{BlockTags.MINEABLE_BY_PICKAXE})
			.build("pillar.stone", blockId++, b -> new BlockLogicAxisAligned(b, Material.stone))
			.withDisabledNeighborNotifyOnMetadataChange();
		PILLAR_BASALT = new BlockBuilder(RestonedMain.MOD_ID)
			.setBlockSound(BlockSounds.STONE)
			.setHardness(1.0F)
			.setResistance(10.0F)
			.setTags(new Tag[]{BlockTags.MINEABLE_BY_PICKAXE})
			.build("pillar.basalt", blockId++, b -> new BlockLogicAxisAligned(b, Material.basalt))
			.withDisabledNeighborNotifyOnMetadataChange();
		PILLAR_LIMESTONE = new BlockBuilder(RestonedMain.MOD_ID)
			.setBlockSound(BlockSounds.STONE)
			.setHardness(1.0F)
			.setResistance(10.0F)
			.setTags(new Tag[]{BlockTags.MINEABLE_BY_PICKAXE})
			.build("pillar.limestone", blockId++, b -> new BlockLogicAxisAligned(b, Material.limestone))
			.withDisabledNeighborNotifyOnMetadataChange();
		PILLAR_GRANITE = new BlockBuilder(RestonedMain.MOD_ID)
			.setBlockSound(BlockSounds.STONE)
			.setHardness(1.0F)
			.setResistance(10.0F)
			.setTags(new Tag[]{BlockTags.MINEABLE_BY_PICKAXE})
			.build("pillar.granite", blockId++, b -> new BlockLogicAxisAligned(b, Material.granite))
			.withDisabledNeighborNotifyOnMetadataChange();
		PILLAR_SLATE = new BlockBuilder(RestonedMain.MOD_ID)
			.setBlockSound(BlockSounds.STONE)
			.setHardness(1.0F)
			.setResistance(10.0F)
			.setTags(new Tag[]{BlockTags.MINEABLE_BY_PICKAXE})
			.build("pillar.slate", blockId++, b -> new BlockLogicAxisAligned(b, Material.slate))
			.withDisabledNeighborNotifyOnMetadataChange();
		PILLAR_PERMAFROST = new BlockBuilder(RestonedMain.MOD_ID)
			.setBlockSound(BlockSounds.PERMAFROST)
			.setHardness(1.0F)
			.setResistance(10.0F)
			.setTags(new Tag[]{BlockTags.MINEABLE_BY_PICKAXE})
			.build("pillar.permafrost", blockId++, b -> new BlockLogicAxisAligned(b, Material.permafrost))
			.withDisabledNeighborNotifyOnMetadataChange();
		PILLAR_NETHERRACK = new BlockBuilder(RestonedMain.MOD_ID)
			.setBlockSound(BlockSounds.STONE)
			.setHardness(1.0F)
			.setResistance(10.0F)
			.setTags(new Tag[]{BlockTags.MINEABLE_BY_PICKAXE, BlockTags.INFINITE_BURN})
			.build("pillar.netherrack", blockId++, b -> new BlockLogicAxisAligned(b, Material.netherrack))
			.withDisabledNeighborNotifyOnMetadataChange();

		SLAB_COBBLE_MARBLE = new BlockBuilder(RestonedMain.MOD_ID)
			.setBlockSound(BlockSounds.STONE)
			.setTags(BlockTags.MINEABLE_BY_PICKAXE)
			.build("slab.cobble.marble", blockId++, b -> new BlockLogicSlab(b, COBBLE_MARBLE));
		SLAB_COBBLE_SLATE = new BlockBuilder(RestonedMain.MOD_ID)
			.setBlockSound(BlockSounds.STONE)
			.setTags(BlockTags.MINEABLE_BY_PICKAXE)
			.build("slab.cobble.slate", blockId++, b -> new BlockLogicSlab(b, COBBLE_SLATE));

		SLAB_MARBLE_POLISHED = new BlockBuilder(RestonedMain.MOD_ID)
			.build("slab.marble.carved", blockId++, b -> new BlockLogicSlab(b, MARBLE_CARVED))
			.withSound(BlockSounds.STONE)
			.withDisabledNeighborNotifyOnMetadataChange()
			.withLitInteriorSurface(true)
			.withTags(new Tag[]{BlockTags.MINEABLE_BY_PICKAXE});
		SLAB_SLATE_POLISHED = new BlockBuilder(RestonedMain.MOD_ID)
			.build("slab.slate.carved", blockId++, b -> new BlockLogicSlab(b, SLATE_CARVED))
			.withSound(BlockSounds.STONE)
			.withDisabledNeighborNotifyOnMetadataChange()
			.withLitInteriorSurface(true)
			.withTags(new Tag[]{BlockTags.MINEABLE_BY_PICKAXE});

		SLAB_CAPSTONE_STONE = new BlockBuilder(RestonedMain.MOD_ID)
			.build("slab.capstone.stone", blockId++, b -> new BlockLogicSlab(b, CAPSTONE_STONE))
			.withSound(BlockSounds.STONE)
			.withDisabledNeighborNotifyOnMetadataChange()
			.withLitInteriorSurface(true)
			.withTags(new Tag[]{BlockTags.MINEABLE_BY_PICKAXE});
		SLAB_CAPSTONE_BASALT = new BlockBuilder(RestonedMain.MOD_ID)
			.build("slab.capstone.basalt", blockId++, b -> new BlockLogicSlab(b, CAPSTONE_BASALT))
			.withSound(BlockSounds.STONE)
			.withDisabledNeighborNotifyOnMetadataChange()
			.withLitInteriorSurface(true)
			.withTags(new Tag[]{BlockTags.MINEABLE_BY_PICKAXE});
		SLAB_CAPSTONE_LIMESTONE = new BlockBuilder(RestonedMain.MOD_ID)
			.build("slab.capstone.limestone", blockId++, b -> new BlockLogicSlab(b, CAPSTONE_LIMESTONE))
			.withSound(BlockSounds.STONE)
			.withDisabledNeighborNotifyOnMetadataChange()
			.withLitInteriorSurface(true)
			.withTags(new Tag[]{BlockTags.MINEABLE_BY_PICKAXE});
		SLAB_CAPSTONE_GRANITE = new BlockBuilder(RestonedMain.MOD_ID)
			.build("slab.capstone.granite", blockId++, b -> new BlockLogicSlab(b, CAPSTONE_GRANITE))
			.withSound(BlockSounds.STONE)
			.withDisabledNeighborNotifyOnMetadataChange()
			.withLitInteriorSurface(true)
			.withTags(new Tag[]{BlockTags.MINEABLE_BY_PICKAXE});
		SLAB_CAPSTONE_SLATE = new BlockBuilder(RestonedMain.MOD_ID)
			.build("slab.capstone.slate", blockId++, b -> new BlockLogicSlab(b, CAPSTONE_SLATE))
			.withSound(BlockSounds.STONE)
			.withDisabledNeighborNotifyOnMetadataChange()
			.withLitInteriorSurface(true)
			.withTags(new Tag[]{BlockTags.MINEABLE_BY_PICKAXE});
		SLAB_CAPSTONE_PERMAFROST = new BlockBuilder(RestonedMain.MOD_ID)
			.build("slab.capstone.permafrost", blockId++, b -> new BlockLogicSlab(b, CAPSTONE_PERMAFROST))
			.withSound(BlockSounds.STONE)
			.withDisabledNeighborNotifyOnMetadataChange()
			.withLitInteriorSurface(true)
			.withTags(new Tag[]{BlockTags.MINEABLE_BY_PICKAXE});
		SLAB_CAPSTONE_NETHERRACK = new BlockBuilder(RestonedMain.MOD_ID)
			.build("slab.capstone.netherrack", blockId++, b -> new BlockLogicSlab(b, CAPSTONE_NETHERRACK))
			.withSound(BlockSounds.STONE)
			.withDisabledNeighborNotifyOnMetadataChange()
			.withLitInteriorSurface(true)
			.withTags(new Tag[]{BlockTags.MINEABLE_BY_PICKAXE});

		STAIRS_COBBLE_MARBLE = new BlockBuilder(RestonedMain.MOD_ID)
			.build("stairs.cobble.marble", blockId++, b -> new BlockLogicStairs(b, COBBLE_MARBLE))
			.withSound(BlockSounds.STONE)
			.withDisabledNeighborNotifyOnMetadataChange()
			.withLitInteriorSurface(true)
			.withTags(new Tag[]{BlockTags.MINEABLE_BY_PICKAXE});
		STAIRS_COBBLE_SLATE = new BlockBuilder(RestonedMain.MOD_ID)
			.build("stairs.cobble.slate", blockId++, b -> new BlockLogicStairs(b, COBBLE_SLATE))
			.withSound(BlockSounds.STONE)
			.withDisabledNeighborNotifyOnMetadataChange()
			.withLitInteriorSurface(true)
			.withTags(new Tag[]{BlockTags.MINEABLE_BY_PICKAXE});

		STAIRS_BRICK_MARBLE = new BlockBuilder(RestonedMain.MOD_ID)
			.build("stairs.brick.marble", blockId++, b -> new BlockLogicStairs(b, BRICK_MARBLE))
			.withSound(BlockSounds.STONE)
			.withDisabledNeighborNotifyOnMetadataChange()
			.withLitInteriorSurface(true)
			.withTags(new Tag[]{BlockTags.MINEABLE_BY_PICKAXE});

		MARBLE_POLISHED = new BlockBuilder(RestonedMain.MOD_ID)
			.setBlockSound(BlockSounds.STONE)
			.setHardness(1.0F)
			.setResistance(10.0F)
			.setTags(new Tag[]{BlockTags.MINEABLE_BY_PICKAXE})
			.build("marble.polished", blockId++, b -> new BlockLogic(b, Material.marble))
			.withDisabledNeighborNotifyOnMetadataChange();

		MARBLE_CARVED = new BlockBuilder(RestonedMain.MOD_ID)
			.setBlockSound(BlockSounds.STONE)
			.setHardness(1.0F)
			.setResistance(10.0F)
			.setTags(new Tag[]{BlockTags.NOT_IN_CREATIVE_MENU, BlockTags.MINEABLE_BY_PICKAXE})
			.build("marble.carved", blockId++, b -> new BlockLogic(b, Material.marble))
			.withDisabledStats();
		SLATE_CARVED = new BlockBuilder(RestonedMain.MOD_ID)
			.setBlockSound(BlockSounds.STONE)
			.setHardness(1.0F)
			.setResistance(10.0F)
			.setTags(new Tag[]{BlockTags.NOT_IN_CREATIVE_MENU, BlockTags.MINEABLE_BY_PICKAXE})
			.build("slate.carved", blockId++, b -> new BlockLogic(b, Material.slate))
			.withDisabledStats();

		CAPSTONE_STONE = new BlockBuilder(RestonedMain.MOD_ID)
			.setBlockSound(BlockSounds.STONE)
			.setHardness(1.0F)
			.setResistance(10.0F)
			.setTags(new Tag[]{BlockTags.NOT_IN_CREATIVE_MENU, BlockTags.MINEABLE_BY_PICKAXE})
			.build("capstone.stone", blockId++, b -> new BlockLogic(b, Material.stone))
			.withDisabledNeighborNotifyOnMetadataChange();
		CAPSTONE_BASALT = new BlockBuilder(RestonedMain.MOD_ID)
			.setBlockSound(BlockSounds.STONE)
			.setHardness(1.0F)
			.setResistance(10.0F)
			.setTags(new Tag[]{BlockTags.NOT_IN_CREATIVE_MENU, BlockTags.MINEABLE_BY_PICKAXE})
			.build("capstone.basalt", blockId++, b -> new BlockLogic(b, Material.basalt))
			.withDisabledNeighborNotifyOnMetadataChange();
		CAPSTONE_LIMESTONE = new BlockBuilder(RestonedMain.MOD_ID)
			.setBlockSound(BlockSounds.STONE)
			.setHardness(1.0F)
			.setResistance(10.0F)
			.setTags(new Tag[]{BlockTags.NOT_IN_CREATIVE_MENU, BlockTags.MINEABLE_BY_PICKAXE})
			.build("capstone.limestone", blockId++, b -> new BlockLogic(b, Material.limestone))
			.withDisabledNeighborNotifyOnMetadataChange();
		CAPSTONE_GRANITE = new BlockBuilder(RestonedMain.MOD_ID)
			.setBlockSound(BlockSounds.STONE)
			.setHardness(1.0F)
			.setResistance(10.0F)
			.setTags(new Tag[]{BlockTags.NOT_IN_CREATIVE_MENU, BlockTags.MINEABLE_BY_PICKAXE})
			.build("capstone.granite", blockId++, b -> new BlockLogic(b, Material.granite))
			.withDisabledNeighborNotifyOnMetadataChange();
		CAPSTONE_SLATE = new BlockBuilder(RestonedMain.MOD_ID)
			.setBlockSound(BlockSounds.STONE)
			.setHardness(1.0F)
			.setResistance(10.0F)
			.setTags(new Tag[]{BlockTags.NOT_IN_CREATIVE_MENU, BlockTags.MINEABLE_BY_PICKAXE})
			.build("capstone.slate", blockId++, b -> new BlockLogic(b, Material.slate))
			.withDisabledNeighborNotifyOnMetadataChange();
		CAPSTONE_PERMAFROST = new BlockBuilder(RestonedMain.MOD_ID)
			.setBlockSound(BlockSounds.PERMAFROST)
			.setHardness(1.0F)
			.setResistance(10.0F)
			.setTags(new Tag[]{BlockTags.NOT_IN_CREATIVE_MENU, BlockTags.MINEABLE_BY_PICKAXE})
			.build("capstone.permafrost", blockId++, b -> new BlockLogic(b, Material.permafrost))
			.withDisabledNeighborNotifyOnMetadataChange();
		CAPSTONE_NETHERRACK = new BlockBuilder(RestonedMain.MOD_ID)
			.setBlockSound(BlockSounds.STONE)
			.setHardness(1.0F)
			.setResistance(10.0F)
			.setTags(new Tag[]{BlockTags.NOT_IN_CREATIVE_MENU, BlockTags.MINEABLE_BY_PICKAXE})
			.build("capstone.netherrack", blockId++, b -> new BlockLogic(b, Material.netherrack))
			.withDisabledNeighborNotifyOnMetadataChange();

		BUTTON_BASALT = new BlockBuilder(RestonedMain.MOD_ID)
			.setBlockSound(BlockSounds.STONE)
			.setHardness(0.5F)
			.setTags(new Tag[]{BlockTags.BROKEN_BY_FLUIDS, BlockTags.MINEABLE_BY_PICKAXE, BlockTags.PREVENT_MOB_SPAWNS})
			.build("button.basalt", blockId++, b -> new BlockLogicButton(b))
			.withDisabledNeighborNotifyOnMetadataChange();
		BUTTON_LIMESTONE = new BlockBuilder(RestonedMain.MOD_ID)
			.setBlockSound(BlockSounds.STONE)
			.setHardness(0.5F)
			.setTags(new Tag[]{BlockTags.BROKEN_BY_FLUIDS, BlockTags.MINEABLE_BY_PICKAXE, BlockTags.PREVENT_MOB_SPAWNS})
			.build("button.limestone", blockId++, b -> new BlockLogicButton(b))
			.withDisabledNeighborNotifyOnMetadataChange();
		BUTTON_GRANITE = new BlockBuilder(RestonedMain.MOD_ID)
			.setBlockSound(BlockSounds.STONE)
			.setHardness(0.5F)
			.setTags(new Tag[]{BlockTags.BROKEN_BY_FLUIDS, BlockTags.MINEABLE_BY_PICKAXE, BlockTags.PREVENT_MOB_SPAWNS})
			.build("button.granite", blockId++, b -> new BlockLogicButton(b))
			.withDisabledNeighborNotifyOnMetadataChange();
		BUTTON_MARBLE = new BlockBuilder(RestonedMain.MOD_ID)
			.setBlockSound(BlockSounds.STONE)
			.setHardness(0.5F)
			.setTags(new Tag[]{BlockTags.BROKEN_BY_FLUIDS, BlockTags.MINEABLE_BY_PICKAXE, BlockTags.PREVENT_MOB_SPAWNS})
			.build("button.marble", blockId++, b -> new BlockLogicButton(b))
			.withDisabledNeighborNotifyOnMetadataChange();
		BUTTON_SLATE = new BlockBuilder(RestonedMain.MOD_ID)
			.setBlockSound(BlockSounds.STONE)
			.setHardness(0.5F)
			.setTags(new Tag[]{BlockTags.BROKEN_BY_FLUIDS, BlockTags.MINEABLE_BY_PICKAXE, BlockTags.PREVENT_MOB_SPAWNS})
			.build("button.slate", blockId++, b -> new BlockLogicButton(b))
			.withDisabledNeighborNotifyOnMetadataChange();
		BUTTON_PERMAFROST = new BlockBuilder(RestonedMain.MOD_ID)
			.setBlockSound(BlockSounds.PERMAFROST)
			.setHardness(0.5F)
			.setTags(new Tag[]{BlockTags.BROKEN_BY_FLUIDS, BlockTags.MINEABLE_BY_PICKAXE, BlockTags.PREVENT_MOB_SPAWNS})
			.build("button.permafrost", blockId++, b -> new BlockLogicButton(b))
			.withDisabledNeighborNotifyOnMetadataChange();
		BUTTON_NETHERRACK = new BlockBuilder(RestonedMain.MOD_ID)
			.setBlockSound(BlockSounds.STONE)
			.setHardness(0.5F)
			.setTags(new Tag[]{BlockTags.BROKEN_BY_FLUIDS, BlockTags.MINEABLE_BY_PICKAXE, BlockTags.PREVENT_MOB_SPAWNS})
			.build("button.netherrack", blockId++, b -> new BlockLogicButton(b))
			.withDisabledNeighborNotifyOnMetadataChange();

		LEVER_COBBLE_BASALT = new BlockBuilder(RestonedMain.MOD_ID)
			.setBlockSound(BlockSounds.STONE)
			.setHardness(0.5F)
			.setTags(new Tag[]{BlockTags.BROKEN_BY_FLUIDS, BlockTags.MINEABLE_BY_PICKAXE, BlockTags.PREVENT_MOB_SPAWNS})
			.build("lever.cobble.basalt", blockId++, b -> new BlockLogicLever(b))
			.withDisabledNeighborNotifyOnMetadataChange();
		LEVER_COBBLE_LIMESTONE = new BlockBuilder(RestonedMain.MOD_ID)
			.setBlockSound(BlockSounds.STONE)
			.setHardness(0.5F)
			.setTags(new Tag[]{BlockTags.BROKEN_BY_FLUIDS, BlockTags.MINEABLE_BY_PICKAXE, BlockTags.PREVENT_MOB_SPAWNS})
			.build("lever.cobble.limestone", blockId++, b -> new BlockLogicLever(b))
			.withDisabledNeighborNotifyOnMetadataChange();
		LEVER_COBBLE_GRANITE = new BlockBuilder(RestonedMain.MOD_ID)
			.setBlockSound(BlockSounds.STONE)
			.setHardness(0.5F)
			.setTags(new Tag[]{BlockTags.BROKEN_BY_FLUIDS, BlockTags.MINEABLE_BY_PICKAXE, BlockTags.PREVENT_MOB_SPAWNS})
			.build("lever.cobble.granite", blockId++, b -> new BlockLogicLever(b))
			.withDisabledNeighborNotifyOnMetadataChange();
		LEVER_COBBLE_MARBLE = new BlockBuilder(RestonedMain.MOD_ID)
			.setBlockSound(BlockSounds.STONE)
			.setHardness(0.5F)
			.setTags(new Tag[]{BlockTags.BROKEN_BY_FLUIDS, BlockTags.MINEABLE_BY_PICKAXE, BlockTags.PREVENT_MOB_SPAWNS})
			.build("lever.cobble.marble", blockId++, b -> new BlockLogicLever(b))
			.withDisabledNeighborNotifyOnMetadataChange();
		LEVER_COBBLE_SLATE = new BlockBuilder(RestonedMain.MOD_ID)
			.setBlockSound(BlockSounds.STONE)
			.setHardness(0.5F)
			.setTags(new Tag[]{BlockTags.BROKEN_BY_FLUIDS, BlockTags.MINEABLE_BY_PICKAXE, BlockTags.PREVENT_MOB_SPAWNS})
			.build("lever.cobble.slate", blockId++, b -> new BlockLogicLever(b))
			.withDisabledNeighborNotifyOnMetadataChange();
		LEVER_COBBLE_PERMAFROST = new BlockBuilder(RestonedMain.MOD_ID)
			.setBlockSound(BlockSounds.STONE)
			.setHardness(0.5F)
			.setTags(new Tag[]{BlockTags.BROKEN_BY_FLUIDS, BlockTags.MINEABLE_BY_PICKAXE, BlockTags.PREVENT_MOB_SPAWNS})
			.build("lever.cobble.permafrost", blockId++, b -> new BlockLogicLever(b))
			.withDisabledNeighborNotifyOnMetadataChange();
		LEVER_COBBLE_NETHERRACK = new BlockBuilder(RestonedMain.MOD_ID)
			.setBlockSound(BlockSounds.STONE)
			.setHardness(0.5F)
			.setTags(new Tag[]{BlockTags.BROKEN_BY_FLUIDS, BlockTags.MINEABLE_BY_PICKAXE, BlockTags.PREVENT_MOB_SPAWNS})
			.build("lever.cobble.netherrack", blockId++, b -> new BlockLogicLever(b))
			.withDisabledNeighborNotifyOnMetadataChange();

		PRESSURE_PLATE_BASALT = new BlockBuilder(RestonedMain.MOD_ID)
			.setBlockSound(BlockSounds.STONE)
			.setHardness(0.5F)
			.setTags(new Tag[]{BlockTags.MINEABLE_BY_PICKAXE, BlockTags.PREVENT_MOB_SPAWNS})
			.build("pressureplate.basalt", blockId++, b -> new BlockLogicPressurePlate(b, Mob.class, Material.basalt))
			.withDisabledNeighborNotifyOnMetadataChange();
		PRESSURE_PLATE_LIMESTONE = new BlockBuilder(RestonedMain.MOD_ID)
			.setBlockSound(BlockSounds.STONE)
			.setHardness(0.5F)
			.setTags(new Tag[]{BlockTags.MINEABLE_BY_PICKAXE, BlockTags.PREVENT_MOB_SPAWNS})
			.build("pressureplate.limestone", blockId++, b -> new BlockLogicPressurePlate(b, Mob.class, Material.limestone))
			.withDisabledNeighborNotifyOnMetadataChange();
		PRESSURE_PLATE_GRANITE = new BlockBuilder(RestonedMain.MOD_ID)
			.setBlockSound(BlockSounds.STONE)
			.setHardness(0.5F)
			.setTags(new Tag[]{BlockTags.MINEABLE_BY_PICKAXE, BlockTags.PREVENT_MOB_SPAWNS})
			.build("pressureplate.granite", blockId++, b -> new BlockLogicPressurePlate(b, Mob.class, Material.granite))
			.withDisabledNeighborNotifyOnMetadataChange();
		PRESSURE_PLATE_MARBLE = new BlockBuilder(RestonedMain.MOD_ID)
			.setBlockSound(BlockSounds.STONE)
			.setHardness(0.5F)
			.setTags(new Tag[]{BlockTags.MINEABLE_BY_PICKAXE, BlockTags.PREVENT_MOB_SPAWNS})
			.build("pressureplate.marble", blockId++, b -> new BlockLogicPressurePlate(b, Mob.class, Material.marble))
			.withDisabledNeighborNotifyOnMetadataChange();
		PRESSURE_PLATE_SLATE = new BlockBuilder(RestonedMain.MOD_ID)
			.setBlockSound(BlockSounds.STONE)
			.setHardness(0.5F)
			.setTags(new Tag[]{BlockTags.MINEABLE_BY_PICKAXE, BlockTags.PREVENT_MOB_SPAWNS})
			.build("pressureplate.slate", blockId++, b -> new BlockLogicPressurePlate(b, Mob.class, Material.slate))
			.withDisabledNeighborNotifyOnMetadataChange();
		PRESSURE_PLATE_PERMAFROST = new BlockBuilder(RestonedMain.MOD_ID)
			.setBlockSound(BlockSounds.PERMAFROST)
			.setHardness(0.5F)
			.setTags(new Tag[]{BlockTags.MINEABLE_BY_PICKAXE, BlockTags.PREVENT_MOB_SPAWNS})
			.build("pressureplate.permafrost", blockId++, b -> new BlockLogicPressurePlate(b, Mob.class, Material.permafrost))
			.withDisabledNeighborNotifyOnMetadataChange();
		PRESSURE_PLATE_NETHERRACK = new BlockBuilder(RestonedMain.MOD_ID)
			.setBlockSound(BlockSounds.STONE)
			.setHardness(0.5F)
			.setTags(new Tag[]{BlockTags.MINEABLE_BY_PICKAXE, BlockTags.PREVENT_MOB_SPAWNS})
			.build("pressureplate.netherrack", blockId++, b -> new BlockLogicPressurePlate(b, Mob.class, Material.netherrack))
			.withDisabledNeighborNotifyOnMetadataChange();

		PRESSURE_PLATE_COBBLE_BASALT = new BlockBuilder(RestonedMain.MOD_ID)
			.setBlockSound(BlockSounds.STONE)
			.setHardness(0.5F)
			.setTags(new Tag[]{BlockTags.MINEABLE_BY_PICKAXE, BlockTags.PREVENT_MOB_SPAWNS})
			.build("pressureplate.cobble.basalt", blockId++, b -> new BlockLogicPressurePlate(b, Player.class, Material.basalt))
			.withDisabledNeighborNotifyOnMetadataChange();
		PRESSURE_PLATE_COBBLE_LIMESTONE = new BlockBuilder(RestonedMain.MOD_ID)
			.setBlockSound(BlockSounds.STONE)
			.setHardness(0.5F)
			.setTags(new Tag[]{BlockTags.MINEABLE_BY_PICKAXE, BlockTags.PREVENT_MOB_SPAWNS})
			.build("pressureplate.cobble.limestone", blockId++, b -> new BlockLogicPressurePlate(b, Player.class, Material.limestone))
			.withDisabledNeighborNotifyOnMetadataChange();
		PRESSURE_PLATE_COBBLE_GRANITE = new BlockBuilder(RestonedMain.MOD_ID)
			.setBlockSound(BlockSounds.STONE)
			.setHardness(0.5F)
			.setTags(new Tag[]{BlockTags.MINEABLE_BY_PICKAXE, BlockTags.PREVENT_MOB_SPAWNS})
			.build("pressureplate.cobble.granite", blockId++, b -> new BlockLogicPressurePlate(b, Player.class, Material.granite))
			.withDisabledNeighborNotifyOnMetadataChange();
		PRESSURE_PLATE_COBBLE_MARBLE = new BlockBuilder(RestonedMain.MOD_ID)
			.setBlockSound(BlockSounds.STONE)
			.setHardness(0.5F)
			.setTags(new Tag[]{BlockTags.MINEABLE_BY_PICKAXE, BlockTags.PREVENT_MOB_SPAWNS})
			.build("pressureplate.cobble.marble", blockId++, b -> new BlockLogicPressurePlate(b, Player.class, Material.marble))
			.withDisabledNeighborNotifyOnMetadataChange();
		PRESSURE_PLATE_COBBLE_SLATE = new BlockBuilder(RestonedMain.MOD_ID)
			.setBlockSound(BlockSounds.STONE)
			.setHardness(0.5F)
			.setTags(new Tag[]{BlockTags.MINEABLE_BY_PICKAXE, BlockTags.PREVENT_MOB_SPAWNS})
			.build("pressureplate.cobble.slate", blockId++, b -> new BlockLogicPressurePlate(b, Player.class, Material.slate))
			.withDisabledNeighborNotifyOnMetadataChange();
		PRESSURE_PLATE_COBBLE_PERMAFROST = new BlockBuilder(RestonedMain.MOD_ID)
			.setBlockSound(BlockSounds.PERMAFROST)
			.setHardness(0.5F)
			.setTags(new Tag[]{BlockTags.MINEABLE_BY_PICKAXE, BlockTags.PREVENT_MOB_SPAWNS})
			.build("pressureplate.cobble.permafrost", blockId++, b -> new BlockLogicPressurePlate(b, Player.class, Material.permafrost))
			.withDisabledNeighborNotifyOnMetadataChange();
		PRESSURE_PLATE_COBBLE_NETHERRACK = new BlockBuilder(RestonedMain.MOD_ID)
			.setBlockSound(BlockSounds.STONE)
			.setHardness(0.5F)
			.setTags(new Tag[]{BlockTags.MINEABLE_BY_PICKAXE, BlockTags.PREVENT_MOB_SPAWNS})
			.build("pressureplate.cobble.netherrack", blockId++, b -> new BlockLogicPressurePlate(b, Player.class, Material.netherrack))
			.withDisabledNeighborNotifyOnMetadataChange();

		BASALT_MOTION_SENSOR_IDLE = new BlockBuilder(RestonedMain.MOD_ID)
			.build("basalt.motionsensor.idle", blockId++, b -> new BlockLogicCustomMotionSensor(b,
				false,
				BASALT_MOTION_SENSOR_IDLE,
				BASALT_MOTION_SENSOR_ACTIVE,
				"random.breath"))
			.withSound(BlockSounds.STONE)
			.withHardness(2.0F)
			.withBlastResistance(10.0F)
			.withDisabledNeighborNotifyOnMetadataChange()
			.withOverrideColor(MaterialColor.basalt)
			.withTags(new Tag[]{BlockTags.MINEABLE_BY_PICKAXE});
		BASALT_MOTION_SENSOR_ACTIVE = new BlockBuilder(RestonedMain.MOD_ID)
			.build("basalt.motionsensor.active", blockId++, b -> new BlockLogicCustomMotionSensor(b,
				true,
				BASALT_MOTION_SENSOR_IDLE,
				BASALT_MOTION_SENSOR_ACTIVE,
				"random.breath"))
			.withSound(BlockSounds.STONE)
			.withLightEmission(0.3F)
			.withHardness(2.0F)
			.withBlastResistance(10.0F)
			.withOverrideColor(MaterialColor.basalt)
			.setStatParent(() -> {return BASALT_MOTION_SENSOR_IDLE;})
			.withTags(new Tag[]{BlockTags.NOT_IN_CREATIVE_MENU, BlockTags.MINEABLE_BY_PICKAXE});
		LIMESTONE_MOTION_SENSOR_IDLE = new BlockBuilder(RestonedMain.MOD_ID)
			.build("limestone.motionsensor.idle", blockId++, b -> new BlockLogicCustomMotionSensor(b,
				false,
				LIMESTONE_MOTION_SENSOR_IDLE,
				LIMESTONE_MOTION_SENSOR_ACTIVE,
				"tile.sensor_block.sense"))
			.withSound(BlockSounds.STONE)
			.withHardness(2.0F)
			.withBlastResistance(10.0F)
			.withDisabledNeighborNotifyOnMetadataChange()
			.withOverrideColor(MaterialColor.limestone)
			.withTags(new Tag[]{BlockTags.MINEABLE_BY_PICKAXE});
		LIMESTONE_MOTION_SENSOR_ACTIVE = new BlockBuilder(RestonedMain.MOD_ID)
			.build("limestone.motionsensor.active", blockId++, b -> new BlockLogicCustomMotionSensor(b,
				true,
				LIMESTONE_MOTION_SENSOR_IDLE,
				LIMESTONE_MOTION_SENSOR_ACTIVE,
				"tile.sensor_block.sense"))
			.withSound(BlockSounds.STONE)
			.withLightEmission(0.3F)
			.withHardness(2.0F)
			.withBlastResistance(10.0F)
			.withOverrideColor(MaterialColor.limestone)
			.setStatParent(() -> {return LIMESTONE_MOTION_SENSOR_IDLE;})
			.withTags(new Tag[]{BlockTags.NOT_IN_CREATIVE_MENU, BlockTags.MINEABLE_BY_PICKAXE});
		GRANITE_MOTION_SENSOR_IDLE = new BlockBuilder(RestonedMain.MOD_ID)
			.build("granite.motionsensor.idle", blockId++, b -> new BlockLogicCustomMotionSensor(b,
				false,
				GRANITE_MOTION_SENSOR_IDLE,
				GRANITE_MOTION_SENSOR_ACTIVE,
				"tile.sensor_block.sense"))
			.withSound(BlockSounds.STONE)
			.withHardness(2.0F)
			.withBlastResistance(10.0F)
			.withDisabledNeighborNotifyOnMetadataChange()
			.withOverrideColor(MaterialColor.granite)
			.withTags(new Tag[]{BlockTags.MINEABLE_BY_PICKAXE});
		GRANITE_MOTION_SENSOR_ACTIVE = new BlockBuilder(RestonedMain.MOD_ID)
			.build("granite.motionsensor.active", blockId++, b -> new BlockLogicCustomMotionSensor(b,
				true,
				GRANITE_MOTION_SENSOR_IDLE,
				GRANITE_MOTION_SENSOR_ACTIVE,
				"tile.sensor_block.sense"))
			.withSound(BlockSounds.STONE)
			.withLightEmission(0.3F)
			.withHardness(2.0F)
			.withBlastResistance(10.0F)
			.withOverrideColor(MaterialColor.granite)
			.setStatParent(() -> {return GRANITE_MOTION_SENSOR_IDLE;})
			.withTags(new Tag[]{BlockTags.NOT_IN_CREATIVE_MENU, BlockTags.MINEABLE_BY_PICKAXE});
		MARBLE_MOTION_SENSOR_IDLE = new BlockBuilder(RestonedMain.MOD_ID)
			.build("marble.motionsensor.idle", blockId++, b -> new BlockLogicCustomMotionSensor(b,
				false,
				MARBLE_MOTION_SENSOR_IDLE,
				MARBLE_MOTION_SENSOR_ACTIVE,
				"mob.pig"))
			.withSound(BlockSounds.STONE)
			.withHardness(2.0F)
			.withBlastResistance(10.0F)
			.withDisabledNeighborNotifyOnMetadataChange()
			.withOverrideColor(MaterialColor.marble)
			.withTags(new Tag[]{BlockTags.MINEABLE_BY_PICKAXE});
		MARBLE_MOTION_SENSOR_ACTIVE = new BlockBuilder(RestonedMain.MOD_ID)
			.build("marble.motionsensor.active", blockId++, b -> new BlockLogicCustomMotionSensor(b,
				true,
				MARBLE_MOTION_SENSOR_IDLE,
				MARBLE_MOTION_SENSOR_ACTIVE,
				"mob.pig"))
			.withSound(BlockSounds.STONE)
			.withLightEmission(0.3F)
			.withHardness(2.0F)
			.withBlastResistance(10.0F)
			.withOverrideColor(MaterialColor.marble)
			.setStatParent(() -> {return MARBLE_MOTION_SENSOR_IDLE;})
			.withTags(new Tag[]{BlockTags.NOT_IN_CREATIVE_MENU, BlockTags.MINEABLE_BY_PICKAXE});
		SLATE_MOTION_SENSOR_IDLE = new BlockBuilder(RestonedMain.MOD_ID)
			.build("slate.motionsensor.idle", blockId++, b -> new BlockLogicCustomMotionSensor(b,
				false,
				SLATE_MOTION_SENSOR_IDLE,
				SLATE_MOTION_SENSOR_ACTIVE,
				"tile.sensor_block.sense"))
			.withSound(BlockSounds.STONE)
			.withHardness(2.0F)
			.withBlastResistance(10.0F)
			.withDisabledNeighborNotifyOnMetadataChange()
			.withOverrideColor(MaterialColor.slate)
			.withTags(new Tag[]{BlockTags.MINEABLE_BY_PICKAXE});
		SLATE_MOTION_SENSOR_ACTIVE = new BlockBuilder(RestonedMain.MOD_ID)
			.build("slate.motionsensor.active", blockId++, b -> new BlockLogicCustomMotionSensor(b,
				true,
				SLATE_MOTION_SENSOR_IDLE,
				SLATE_MOTION_SENSOR_ACTIVE,
				"tile.sensor_block.sense"))
			.withSound(BlockSounds.STONE)
			.withLightEmission(0.3F)
			.withHardness(2.0F)
			.withBlastResistance(10.0F)
			.withOverrideColor(MaterialColor.slate)
			.setStatParent(() -> {return SLATE_MOTION_SENSOR_IDLE;})
			.withTags(new Tag[]{BlockTags.NOT_IN_CREATIVE_MENU, BlockTags.MINEABLE_BY_PICKAXE});
		PERMAFROST_MOTION_SENSOR_IDLE = new BlockBuilder(RestonedMain.MOD_ID)
			.build("permafrost.motionsensor.idle", blockId++, b -> new BlockLogicCustomMotionSensor(b,
				false,
				PERMAFROST_MOTION_SENSOR_IDLE,
				PERMAFROST_MOTION_SENSOR_ACTIVE,
				"mob.zombie"))
			.withSound(BlockSounds.PERMAFROST)
			.withHardness(2.0F)
			.withBlastResistance(10.0F)
			.withDisabledNeighborNotifyOnMetadataChange()
			.withOverrideColor(MaterialColor.permafrost)
			.withTags(new Tag[]{BlockTags.MINEABLE_BY_PICKAXE});
		PERMAFROST_MOTION_SENSOR_ACTIVE = new BlockBuilder(RestonedMain.MOD_ID)
			.build("permafrost.motionsensor.active", blockId++, b -> new BlockLogicCustomMotionSensor(b,
				true,
				PERMAFROST_MOTION_SENSOR_IDLE,
				PERMAFROST_MOTION_SENSOR_ACTIVE,
				"mob.zombie"))
			.withSound(BlockSounds.PERMAFROST)
			.withLightEmission(0.3F)
			.withHardness(2.0F)
			.withBlastResistance(10.0F)
			.withOverrideColor(MaterialColor.permafrost)
			.setStatParent(() -> {return PERMAFROST_MOTION_SENSOR_IDLE;})
			.withTags(new Tag[]{BlockTags.NOT_IN_CREATIVE_MENU, BlockTags.MINEABLE_BY_PICKAXE});
		NETHERRACK_MOTION_SENSOR_IDLE = new BlockBuilder(RestonedMain.MOD_ID)
			.build("netherrack.motionsensor.idle", blockId++, b -> new BlockLogicCustomMotionSensor(b,
				false,
				NETHERRACK_MOTION_SENSOR_IDLE,
				NETHERRACK_MOTION_SENSOR_ACTIVE,
				"mob.ghast.charge"))
			.withSound(BlockSounds.STONE)
			.withHardness(2.0F)
			.withBlastResistance(10.0F)
			.withDisabledNeighborNotifyOnMetadataChange()
			.withOverrideColor(MaterialColor.netherrack)
			.withTags(new Tag[]{BlockTags.MINEABLE_BY_PICKAXE});
		NETHERRACK_MOTION_SENSOR_ACTIVE = new BlockBuilder(RestonedMain.MOD_ID)
			.build("netherrack.motionsensor.active", blockId++, b -> new BlockLogicCustomMotionSensor(b,
				true,
				NETHERRACK_MOTION_SENSOR_IDLE,
				NETHERRACK_MOTION_SENSOR_ACTIVE,
				"mob.ghast.charge"))
			.withSound(BlockSounds.STONE)
			.withLightEmission(0.3F)
			.withHardness(2.0F)
			.withBlastResistance(10.0F)
			.withOverrideColor(MaterialColor.netherrack)
			.setStatParent(() -> {return NETHERRACK_MOTION_SENSOR_IDLE;})
			.withTags(new Tag[]{BlockTags.NOT_IN_CREATIVE_MENU, BlockTags.MINEABLE_BY_PICKAXE});

		initBlockDetails();
	}
}
