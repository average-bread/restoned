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

	@Override
	public void onRecipesReady() {
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
	}
}
