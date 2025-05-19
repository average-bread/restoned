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

import static net.minecraft.core.block.Blocks.GRAVEL;

public class RestonedBlocks {
	public static int blockId;

	public static Block <?> COBBLE_MARBLE;
	public static Block <?> COBBLE_SLATE;

	public static Block <BlockLogicSlab> SLAB_COBBLE_MARBLE;
	public static Block <BlockLogicSlab> SLAB_COBBLE_SLATE;

	public static Block <BlockLogicStairs> STAIRS_COBBLE_MARBLE;
	public static Block <BlockLogicStairs> STAIRS_COBBLE_SLATE;

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

		SLAB_COBBLE_MARBLE = new BlockBuilder(RestonedMain.MOD_ID)
			.setBlockSound(BlockSounds.STONE)
			.setTags(BlockTags.MINEABLE_BY_PICKAXE)
			.build("slab.cobble.marble", blockId++, b -> new BlockLogicSlab(b, COBBLE_MARBLE));

		SLAB_COBBLE_SLATE = new BlockBuilder(RestonedMain.MOD_ID)
			.setBlockSound(BlockSounds.STONE)
			.setTags(BlockTags.MINEABLE_BY_PICKAXE)
			.build("slab.cobble.slate", blockId++, b -> new BlockLogicSlab(b, COBBLE_SLATE));

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

		initBlockDetails();
	}
}
