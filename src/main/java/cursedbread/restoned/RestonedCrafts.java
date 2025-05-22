package cursedbread.restoned;

import net.minecraft.core.block.Block;
import net.minecraft.core.block.Blocks;
import net.minecraft.core.data.registry.Registries;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.item.Items;
import turniplabs.halplibe.helper.RecipeBuilder;
import turniplabs.halplibe.util.RecipeEntrypoint;

public class RestonedCrafts implements RecipeEntrypoint {
	@Override
	public void initNamespaces() {
		RecipeBuilder.initNameSpace(RestonedMain.MOD_ID);
		RecipeBuilder.getRecipeNamespace(RestonedMain.MOD_ID);
		Registries.ITEM_GROUPS.register("restoned:motion_sensor", Registries.stackListOf(
			Blocks.MOTION_SENSOR_IDLE,
			Blocks.MOTION_SENSOR_ACTIVE,
			RestonedBlocks.BASALT_MOTION_SENSOR_IDLE,
			RestonedBlocks.BASALT_MOTION_SENSOR_ACTIVE
		));
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

	static Block[] buttonIngr = {
		Blocks.STONE,
		Blocks.BASALT,
		Blocks.LIMESTONE,
		Blocks.GRANITE,
		Blocks.MARBLE,
		Blocks.SLATE,
		Blocks.PERMAFROST,
		Blocks.NETHERRACK
	};

	static Block[] buttonResult = {
		Blocks.BUTTON_STONE,
		RestonedBlocks.BUTTON_BASALT,
		RestonedBlocks.BUTTON_LIMESTONE,
		RestonedBlocks.BUTTON_GRANITE,
		RestonedBlocks.BUTTON_MARBLE,
		RestonedBlocks.BUTTON_SLATE,
		RestonedBlocks.BUTTON_PERMAFROST,
		RestonedBlocks.BUTTON_NETHERRACK
	};

	static Block[] leverIngr = {
		Blocks.COBBLE_STONE,
		Blocks.COBBLE_BASALT,
		Blocks.COBBLE_LIMESTONE,
		Blocks.COBBLE_GRANITE,
		RestonedBlocks.COBBLE_MARBLE,
		RestonedBlocks.COBBLE_SLATE,
		Blocks.COBBLE_PERMAFROST,
		Blocks.COBBLE_NETHERRACK
	};

	static Block[] leverResult = {
		Blocks.LEVER_COBBLE_STONE,
		RestonedBlocks.LEVER_COBBLE_BASALT,
		RestonedBlocks.LEVER_COBBLE_LIMESTONE,
		RestonedBlocks.LEVER_COBBLE_GRANITE,
		RestonedBlocks.LEVER_COBBLE_MARBLE,
		RestonedBlocks.LEVER_COBBLE_SLATE,
		RestonedBlocks.LEVER_COBBLE_PERMAFROST,
		RestonedBlocks.LEVER_COBBLE_NETHERRACK
	};

	static Block[] stonePressurePlateIngr = buttonIngr;

	static Block[] stonePressurePlateResult = {
		Blocks.PRESSURE_PLATE_STONE,
		RestonedBlocks.PRESSURE_PLATE_BASALT,
		RestonedBlocks.PRESSURE_PLATE_LIMESTONE,
		RestonedBlocks.PRESSURE_PLATE_GRANITE,
		RestonedBlocks.PRESSURE_PLATE_MARBLE,
		RestonedBlocks.PRESSURE_PLATE_SLATE,
		RestonedBlocks.PRESSURE_PLATE_PERMAFROST,
		RestonedBlocks.PRESSURE_PLATE_NETHERRACK
	};

	static Block[] cobblePressurePlateIngr = leverIngr;

	static Block[] cobblePressurePlateResult = {
		Blocks.PRESSURE_PLATE_COBBLE_STONE,
		RestonedBlocks.PRESSURE_PLATE_COBBLE_BASALT,
		RestonedBlocks.PRESSURE_PLATE_COBBLE_LIMESTONE,
		RestonedBlocks.PRESSURE_PLATE_COBBLE_GRANITE,
		RestonedBlocks.PRESSURE_PLATE_COBBLE_MARBLE,
		RestonedBlocks.PRESSURE_PLATE_COBBLE_SLATE,
		RestonedBlocks.PRESSURE_PLATE_COBBLE_PERMAFROST,
		RestonedBlocks.PRESSURE_PLATE_COBBLE_NETHERRACK
	};

	static Block[] motionIngr = {
		Blocks.COBBLE_STONE_MOSSY,
		RestonedBlocks.COBBLE_BASALT_MOSSY,
		RestonedBlocks.COBBLE_LIMESTONE_MOSSY,
		RestonedBlocks.COBBLE_GRANITE_MOSSY,
		RestonedBlocks.COBBLE_MARBLE_MOSSY,
		RestonedBlocks.COBBLE_SLATE_MOSSY,
		RestonedBlocks.COBBLE_PERMAFROST_MOSSY,
		Blocks.COBBLE_NETHERRACK_MOSSY
	};

	static Block[] motionResult = {
		Blocks.MOTION_SENSOR_IDLE,
		RestonedBlocks.BASALT_MOTION_SENSOR_IDLE
	};

	static String[] annihilateVanillaCraft = {
		"marble_pillar",
		"marble_slab",
		"stone_button",
		"cobblestone_lever",
		"cobblestone_pressure_plate",
		"stone_pressure_plate"
	};

	@Override
	public void onRecipesReady() {
		for (int i = 0; i <= annihilateVanillaCraft.length - 1; i++){
			RecipeBuilder.ModifyWorkbench("minecraft").removeRecipe(annihilateVanillaCraft[i]);
		}

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

		for (int i = 0; i <= buttonResult.length - 1; i++){
			RecipeBuilder.Shapeless(RestonedMain.MOD_ID)
				.addInput(buttonIngr[i])
				.create("buttons", new ItemStack(buttonResult[i], 4));
		}

		for (int i = 0; i <= leverResult.length - 1; i++){
			RecipeBuilder.Shaped(RestonedMain.MOD_ID)
				.setShape("S", "X")
				.addInput('S', Items.STICK)
				.addInput('X', leverIngr[i])
				.create("buttons", new ItemStack(leverResult[i], 2));
		}

		for (int i = 0; i <= stonePressurePlateResult.length - 1; i++){
			RecipeBuilder.Shaped(RestonedMain.MOD_ID)
				.setShape("XX")
				.addInput('X', stonePressurePlateIngr[i])
				.create("stonepreddureplate", new ItemStack(stonePressurePlateResult[i], 1));
		}

		for (int i = 0; i <= cobblePressurePlateResult.length - 1; i++){
			RecipeBuilder.Shaped(RestonedMain.MOD_ID)
				.setShape("XX")
				.addInput('X', cobblePressurePlateIngr[i])
				.create("cobblepreddureplate", new ItemStack(cobblePressurePlateResult[i], 1));
		}

		for (int i = 0; i <= motionResult.length - 1; i++){
			RecipeBuilder.Shaped(RestonedMain.MOD_ID)
				.setShape("XXX", "XMX", "XXX")
				.addInput('X', motionIngr[i])
				.addInput('M', "restoned:motion_sensor")
				.create("motionsensors", new ItemStack(motionResult[i]));
		}
	}
}
