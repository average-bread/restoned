package cursedbread.restoned;

import net.minecraft.core.item.Item;
import net.minecraft.core.item.ItemPlaceable;

public class RestonedItems {
	public static int itemId;

	public static Item REPEATER_BASALT;
	public static Item REPEATER_LIMESTONE;
	public static Item REPEATER_GRANITE;
	public static Item REPEATER_MARBLE;
	public static Item REPEATER_SLATE;
	public static Item REPEATER_PERMAFROST;
	public static Item REPEATER_NETHERRACK;

	public void initItems(){
		REPEATER_BASALT = new ItemPlaceable("restoned.repeater.basalt", "restoned:item/repeaters/basalt", itemId++, RestonedBlocks.REPEATER_IDLE_BASALT);
		REPEATER_LIMESTONE = new ItemPlaceable("restoned.repeater.limestone", "restoned:item/repeaters/limestone", itemId++, RestonedBlocks.REPEATER_IDLE_LIMESTONE);
		REPEATER_GRANITE = new ItemPlaceable("restoned.repeater.granite", "restoned:item/repeaters/granite", itemId++, RestonedBlocks.REPEATER_IDLE_GRANITE);
		REPEATER_MARBLE = new ItemPlaceable("restoned.repeater.marble", "restoned:item/repeaters/marble", itemId++, RestonedBlocks.REPEATER_IDLE_MARBLE);
		REPEATER_SLATE = new ItemPlaceable("restoned.repeater.slate", "restoned:item/repeaters/slate", itemId++, RestonedBlocks.REPEATER_IDLE_SLATE);
		REPEATER_PERMAFROST = new ItemPlaceable("restoned.repeater.permafrost", "restoned:item/repeaters/permafrost", itemId++, RestonedBlocks.REPEATER_IDLE_PERMAFROST);
		REPEATER_NETHERRACK = new ItemPlaceable("restoned.repeater.netherrack", "restoned:item/repeaters/netherrack", itemId++, RestonedBlocks.REPEATER_IDLE_NETHERRACK);
	}
}
