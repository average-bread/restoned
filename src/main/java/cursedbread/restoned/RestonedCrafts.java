package cursedbread.restoned;

import net.minecraft.core.block.Block;
import net.minecraft.core.block.Blocks;
import net.minecraft.core.data.registry.Registries;
import net.minecraft.core.item.Item;
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
			RestonedBlocks.BASALT_MOTION_SENSOR_IDLE,
			RestonedBlocks.LIMESTONE_MOTION_SENSOR_IDLE,
			RestonedBlocks.GRANITE_MOTION_SENSOR_IDLE,
			RestonedBlocks.MARBLE_MOTION_SENSOR_IDLE,
			RestonedBlocks.SLATE_MOTION_SENSOR_IDLE,
			RestonedBlocks.PERMAFROST_MOTION_SENSOR_IDLE,
			RestonedBlocks.NETHERRACK_MOTION_SENSOR_IDLE
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
		RestonedBlocks.BASALT_MOTION_SENSOR_IDLE,
		RestonedBlocks.LIMESTONE_MOTION_SENSOR_IDLE,
		RestonedBlocks.GRANITE_MOTION_SENSOR_IDLE,
		RestonedBlocks.MARBLE_MOTION_SENSOR_IDLE,
		RestonedBlocks.SLATE_MOTION_SENSOR_IDLE,
		RestonedBlocks.PERMAFROST_MOTION_SENSOR_IDLE,
		RestonedBlocks.NETHERRACK_MOTION_SENSOR_IDLE
	};

	static Block[] pistonIngr = leverIngr;

	static Block[] pistonResult = {
		Blocks.PISTON_BASE,
		RestonedBlocks.BASALT_PISTON_BASE,
		RestonedBlocks.LIMESTONE_PISTON_BASE,
		RestonedBlocks.GRANITE_PISTON_BASE,
		RestonedBlocks.MARBLE_PISTON_BASE,
		RestonedBlocks.SLATE_PISTON_BASE,
		RestonedBlocks.PERMAFROST_PISTON_BASE,
		RestonedBlocks.NETHERRACK_PISTON_BASE
	};

	static Block[] stickPistonIngr = {
		RestonedBlocks.BASALT_PISTON_BASE,
		RestonedBlocks.LIMESTONE_PISTON_BASE,
		RestonedBlocks.GRANITE_PISTON_BASE,
		RestonedBlocks.MARBLE_PISTON_BASE,
		RestonedBlocks.SLATE_PISTON_BASE,
		RestonedBlocks.PERMAFROST_PISTON_BASE,
		RestonedBlocks.NETHERRACK_PISTON_BASE
	};

	static Block[] stickPistonResult = {
		RestonedBlocks.BASALT_PISTON_BASE_STICKY,
		RestonedBlocks.LIMESTONE_PISTON_BASE_STICKY,
		RestonedBlocks.GRANITE_PISTON_BASE_STICKY,
		RestonedBlocks.MARBLE_PISTON_BASE_STICKY,
		RestonedBlocks.SLATE_PISTON_BASE_STICKY,
		RestonedBlocks.PERMAFROST_PISTON_BASE_STICKY,
		RestonedBlocks.NETHERRACK_PISTON_BASE_STICKY
	};

	static Block[] reinforcedPistonIngr = buttonIngr;

	static Block[] reinforcedPistonResult = {
		Blocks.PISTON_BASE_STEEL,
		RestonedBlocks.BASALT_PISTON_BASE_STEEL,
		RestonedBlocks.LIMESTONE_PISTON_BASE_STEEL,
		RestonedBlocks.GRANITE_PISTON_BASE_STEEL,
		RestonedBlocks.MARBLE_PISTON_BASE_STEEL,
		RestonedBlocks.SLATE_PISTON_BASE_STEEL,
		RestonedBlocks.PERMAFROST_PISTON_BASE_STEEL,
		RestonedBlocks.NETHERRACK_PISTON_BASE_STEEL
	};

	static Block[] spikesIngr = leverIngr;

	static Block[] spikesResult = {
		Blocks.SPIKES,
		RestonedBlocks.BASALT_SPIKES,
		RestonedBlocks.LIMESTONE_SPIKES,
		RestonedBlocks.GRANITE_SPIKES,
		RestonedBlocks.MARBLE_SPIKES,
		RestonedBlocks.SLATE_SPIKES,
		RestonedBlocks.PERMAFROST_SPIKES,
		RestonedBlocks.NETHERRACK_SPIKES
	};

	static Block[] dispeserIngr = leverIngr;

	static Block[] dispenserResult = {
		Blocks.DISPENSER_COBBLE_STONE,
		RestonedBlocks.DISPENSER_COBBLE_BASALT,
		RestonedBlocks.DISPENSER_COBBLE_LIMESTONE,
		RestonedBlocks.DISPENSER_COBBLE_GRANITE,
		RestonedBlocks.DISPENSER_COBBLE_MARBLE,
		RestonedBlocks.DISPENSER_COBBLE_SLATE,
		RestonedBlocks.DISPENSER_COBBLE_PERMAFROST,
		RestonedBlocks.DISPENSER_COBBLE_NETHERRACK
	};

	static Block[] repeaterIngr = buttonIngr;

	static Item[] repeaterResult = {
		Items.REPEATER,
		RestonedItems.REPEATER_BASALT,
		RestonedItems.REPEATER_LIMESTONE,
		RestonedItems.REPEATER_GRANITE,
		RestonedItems.REPEATER_MARBLE,
		RestonedItems.REPEATER_SLATE,
		RestonedItems.REPEATER_PERMAFROST,
		RestonedItems.REPEATER_NETHERRACK
	};

	static Block[] activatorIngr = leverIngr;

	static Block[] activatorResult = {
		RestonedBlocks.ACTIVATOR_COBBLE_STONE,
		RestonedBlocks.ACTIVATOR_COBBLE_BASALT,
		RestonedBlocks.ACTIVATOR_COBBLE_LIMESTONE,
		RestonedBlocks.ACTIVATOR_COBBLE_GRANITE,
		RestonedBlocks.ACTIVATOR_COBBLE_MARBLE,
		RestonedBlocks.ACTIVATOR_COBBLE_SLATE,
		RestonedBlocks.ACTIVATOR_COBBLE_PERMAFROST
	};

	static Block[] furnaceIngr = leverIngr;

	static Block[] furnaceResult = {
		Blocks.FURNACE_STONE_IDLE,
		RestonedBlocks.FURNACE_BASALT_IDLE,
		RestonedBlocks.FURNACE_LIMESTONE_IDLE,
		RestonedBlocks.FURNACE_GRANITE_IDLE,
		RestonedBlocks.FURNACE_MARBLE_IDLE,
		RestonedBlocks.FURNACE_SLATE_IDLE,
		RestonedBlocks.FURNACE_PERMAFROST_IDLE,
		RestonedBlocks.FURNACE_NETHERRACK_IDLE
	};

	static Block[] trommelIngr = leverIngr;

	static Block[] trommelResult = {
		Blocks.TROMMEL_IDLE
	};

	static String[] annihilateVanillaCraft = {
		"marble_pillar",
		"marble_slab",
		"stone_button",
		"cobblestone_lever",
		"cobblestone_pressure_plate",
		"stone_pressure_plate",
		"piston",
		"steel_piston",
		"spikes",
		"dispenser",
		"redstone_repeater",
		"furnace",
		"trommel"
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

		for (int i = 0; i <= pistonResult.length - 1; i++){
			RecipeBuilder.Shaped(RestonedMain.MOD_ID)
				.setShape("PPP", "XIX", "XRX")
				.addInput('P', "minecraft:planks")
				.addInput('I', Items.INGOT_IRON)
				.addInput('R', Items.DUST_REDSTONE)
				.addInput('X', pistonIngr[i])
				.create("pistons", new ItemStack(pistonResult[i]));
		}

		for (int i = 0; i <= stickPistonResult.length - 1; i++){
			RecipeBuilder.Shaped(RestonedMain.MOD_ID)
				.setShape("S", "X")
				.addInput('S', Items.SLIMEBALL)
				.addInput('X', stickPistonIngr[i])
				.create("stickypistons", new ItemStack(stickPistonResult[i]));
		}

		for (int i = 0; i <= reinforcedPistonResult.length - 1; i++){
			RecipeBuilder.Shaped(RestonedMain.MOD_ID)
				.setShape("PPP", "XIX", "XRX")
				.addInput('P', Items.INGOT_STEEL_CRUDE)
				.addInput('I', Items.INGOT_STEEL)
				.addInput('R', Items.DUST_REDSTONE)
				.addInput('X', reinforcedPistonIngr[i])
				.create("reinforcedpistons", new ItemStack(reinforcedPistonResult[i]));
		}

		for (int i = 0; i <= spikesResult.length - 1; i++){
			RecipeBuilder.Shaped(RestonedMain.MOD_ID)
				.setShape(" I ", "IRI", "XXX")
				.addInput('I', Items.INGOT_IRON)
				.addInput('R', Items.DUST_REDSTONE)
				.addInput('X', spikesIngr[i])
				.create("spikes", new ItemStack(spikesResult[i]));
		}

		for (int i = 0; i <= dispenserResult.length - 1; i++){
			RecipeBuilder.Shaped(RestonedMain.MOD_ID)
				.setShape("XXX", "XBX", "XRX")
				.addInput('X', dispeserIngr[i])
				.addInput('B', Items.TOOL_BOW)
				.addInput('R', Items.DUST_REDSTONE)
				.create("dispensers", new ItemStack(dispenserResult[i]));
		}

		for (int i = 0; i <= repeaterResult.length - 1; i++){
			RecipeBuilder.Shaped(RestonedMain.MOD_ID)
				.setShape("TRT", "XXX")
				.addInput('T', Blocks.TORCH_REDSTONE_ACTIVE)
				.addInput('R', Items.DUST_REDSTONE)
				.addInput('X', repeaterIngr[i])
				.create("repeaters", new ItemStack(repeaterResult[i]));
		}

		for (int i = 0; i <= activatorResult.length - 1; i++){
			RecipeBuilder.Shaped(RestonedMain.MOD_ID)
				.setShape("XSX", "XNX", "XRX")
				.addInput('S', Blocks.SOULSAND)
				.addInput('N', Items.NETHERCOAL)
				.addInput('R', Items.DUST_REDSTONE)
				.addInput('X', activatorIngr[i])
				.create("acitvators", new ItemStack(activatorResult[i]));
		}

//		for (int i = 0; i <= furnaceResult.length - 1; i++){
//			RecipeBuilder.Shaped(RestonedMain.MOD_ID)
//				.setShape("XXX", "X X", "XXX")
//				.addInput('X', furnaceIngr[i])
//				.create("furnaces", new ItemStack(furnaceResult[i]));
//		}
//
//		for (int i = 0; i <= trommelResult.length - 1; i++){
//			RecipeBuilder.Shaped(RestonedMain.MOD_ID)
//				.setShape("XXX", "XMX", "LLL")
//				.addInput('X', trommelIngr[i])
//				.addInput('M', Blocks.MESH)
//				.addInput('L', "minecraft:logs")
//				.create("furnaces", new ItemStack(trommelResult[i]));
//		}
	}
}
