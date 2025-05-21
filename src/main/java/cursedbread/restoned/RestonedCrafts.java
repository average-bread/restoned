package cursedbread.restoned;

import net.minecraft.core.block.Block;
import net.minecraft.core.block.Blocks;
import net.minecraft.core.item.ItemStack;
import turniplabs.halplibe.helper.RecipeBuilder;
import turniplabs.halplibe.util.RecipeEntrypoint;

public class RestonedCrafts implements RecipeEntrypoint {
	@Override
	public void initNamespaces() {
		RecipeBuilder.initNameSpace(RestonedMain.MOD_ID);
		RecipeBuilder.getRecipeNamespace(RestonedMain.MOD_ID);
	}

	static Block[] slabIngr = {
		RestonedBlocks.COBBLE_MARBLE,
		RestonedBlocks.COBBLE_SLATE
	};

	static Block[] slabResult = {
		RestonedBlocks.SLAB_COBBLE_MARBLE,
		RestonedBlocks.SLAB_COBBLE_SLATE
	};

	static Block[] stairIngr = slabIngr;

	static Block[] stairResult = {
		RestonedBlocks.STAIRS_COBBLE_MARBLE,
		RestonedBlocks.STAIRS_COBBLE_SLATE
	};

	static Block[] smeltingIngr = slabIngr;

	static Block[]  smeltingResult = {
		Blocks.MARBLE,
		Blocks.SLATE
	};

	static Block[] pillarIngr = {
		Blocks.STONE_POLISHED,
		Blocks.BASALT_POLISHED,
		Blocks.LIMESTONE_POLISHED,
		Blocks.GRANITE_POLISHED,
		RestonedBlocks.MARBLE_POLISHED,
		Blocks.SLATE_POLISHED,
		Blocks.PERMAFROST_POLISHED,
		Blocks.NETHERRACK_POLISHED
	};

	static Block[] pillarResult = {
		RestonedBlocks.PILLAR_STONE,
		RestonedBlocks.PILLAR_BASALT,
		RestonedBlocks.PILLAR_LIMESTONE,
		RestonedBlocks.PILLAR_GRANITE,
		Blocks.PILLAR_MARBLE,
		RestonedBlocks.PILLAR_SLATE,
		RestonedBlocks.PILLAR_PERMAFROST,
		RestonedBlocks.PILLAR_NETHERRACK
	};

	static Block[] polishedslabIngr = {
		RestonedBlocks.MARBLE_POLISHED,
		Blocks.SLATE_POLISHED
	};

	static Block[] polishedslabResult = {
		RestonedBlocks.SLAB_MARBLE_POLISHED,
		RestonedBlocks.SLAB_SLATE_POLISHED
	};

	static Block[] capstoneIngr = {
		RestonedBlocks.PILLAR_STONE,
		RestonedBlocks.PILLAR_BASALT,
		RestonedBlocks.PILLAR_LIMESTONE,
		RestonedBlocks.PILLAR_GRANITE,
		Blocks.PILLAR_MARBLE,
		RestonedBlocks.PILLAR_SLATE,
		RestonedBlocks.PILLAR_PERMAFROST,
		RestonedBlocks.PILLAR_NETHERRACK
	};

	static Block[] capstoneResult = {
		RestonedBlocks.SLAB_CAPSTONE_STONE,
		RestonedBlocks.SLAB_CAPSTONE_BASALT,
		RestonedBlocks.SLAB_CAPSTONE_LIMESTONE,
		RestonedBlocks.SLAB_CAPSTONE_GRANITE,
		Blocks.SLAB_CAPSTONE_MARBLE,
		RestonedBlocks.SLAB_CAPSTONE_SLATE,
		RestonedBlocks.SLAB_CAPSTONE_PERMAFROST,
		RestonedBlocks.SLAB_CAPSTONE_NETHERRACK
	};

	@Override
	public void onRecipesReady() {
		RecipeBuilder.ModifyWorkbench("minecraft").removeRecipe("marble_pillar");
		RecipeBuilder.ModifyWorkbench("minecraft").removeRecipe("marble_slab");

		for (int i = 0; i <= slabResult.length - 1; i++){
			RecipeBuilder.Shaped(RestonedMain.MOD_ID)
				.setShape("XXX")
				.addInput('X', slabIngr[i])
				.create("cobbleslabs", new ItemStack(slabResult[i], 6));
		}

		for (int i = 0; i <= stairResult.length - 1; i++){
			RecipeBuilder.Shaped(RestonedMain.MOD_ID)
				.setShape("X  ", "XX ", "XXX")
				.addInput('X', stairIngr[i])
				.create("cobblestairs", new ItemStack(stairResult[i], 6));
		}

		for (int i = 0; i <= smeltingResult.length - 1; i++){
			RecipeBuilder.Furnace(RestonedMain.MOD_ID)
				.setInput(smeltingIngr[i])
				.create("cobblesmelting", new ItemStack(smeltingResult[i], 1));
		}

		for (int i = 0; i <= pillarResult.length - 1; i++){
			RecipeBuilder.Shaped(RestonedMain.MOD_ID)
				.setShape("X", "X")
				.addInput('X', pillarIngr[i])
				.create("pillars", new ItemStack(pillarResult[i], 2));
		}

		RecipeBuilder.Shaped(RestonedMain.MOD_ID)
			.setShape("X", "X")
			.addInput('X', Blocks.MARBLE)
			.create("polishedmarble", new ItemStack(RestonedBlocks.MARBLE_POLISHED, 2));

		for (int i = 0; i <= polishedslabResult.length - 1; i++){
			RecipeBuilder.Shaped(RestonedMain.MOD_ID)
				.setShape("XXX")
				.addInput('X', polishedslabIngr[i])
				.create("polishedslabs", new ItemStack(polishedslabResult[i], 6));
		}

		RecipeBuilder.Shaped(RestonedMain.MOD_ID)
			.setShape("X  ", "XX ", "XXX")
			.addInput('X', Blocks.BRICK_MARBLE)
			.create("brickmarblestairs", new ItemStack(RestonedBlocks.STAIRS_BRICK_MARBLE, 6));

		for (int i = 0; i <= capstoneResult.length - 1; i++){
			RecipeBuilder.Shaped(RestonedMain.MOD_ID)
				.setShape("XXX")
				.addInput('X', capstoneIngr[i])
				.create("polishedslabs", new ItemStack(capstoneResult[i], 6));
		}
	}
}
