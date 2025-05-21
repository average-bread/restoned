package cursedbread.restoned;

import net.minecraft.core.block.*;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.block.tag.BlockTags;
import net.minecraft.core.data.tag.Tag;
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

		initBlockDetails();
	}
}
