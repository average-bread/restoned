package cursedbread.restoned.logics;

import net.minecraft.core.block.Block;
import net.minecraft.core.block.BlockLogic;
import net.minecraft.core.block.BlockLogicRepeater;
import net.minecraft.core.block.Blocks;
import net.minecraft.core.block.entity.TileEntity;
import net.minecraft.core.enums.EnumDropCause;
import net.minecraft.core.item.Item;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.item.Items;
import net.minecraft.core.util.helper.Side;
import net.minecraft.core.world.World;

import java.util.Random;

public class BlockLogicCustomRepeater extends BlockLogicRepeater {
	private static final int[] tickDelayMap = new int[]{1, 2, 3, 4};
	protected Block idle_block;
	protected Block active_block;
	protected Item item_drop;
	public BlockLogicCustomRepeater(Block<?> block, boolean flag, Block idle, Block active, Item item) {
		super(block, flag);
		this.idle_block = idle;
		this.active_block = active;
		this.item_drop = item;
	}

	@Override
	public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int meta, TileEntity tileEntity) {
		return new ItemStack[]{new ItemStack(item_drop)};
	}

	@Override
	public void updateTick(World world, int x, int y, int z, Random rand) {
		int meta = world.getBlockMetadata(x, y, z);
		boolean flag = this.isGettingPower(world, x, y, z, meta);
		if (this.isRepeaterPowered && !flag) {
			world.setBlockAndMetadataWithNotify(x, y, z, idle_block.id(), meta);
		} else if (!this.isRepeaterPowered) {
			world.setBlockAndMetadataWithNotify(x, y, z, active_block.id(), meta);
			if (!flag) {
				int i1 = (meta & 12) >> 2;
				world.scheduleBlockUpdate(x, y, z, active_block.id(), tickDelayMap[i1] * 2);
			}
		}
	}

	private boolean isGettingPower(World world, int x, int y, int z, int meta) {
		int direction = meta & 3;
		switch (direction) {
			case 0:
				return world.getSignal(x, y, z + 1, Side.SOUTH) || world.getBlockId(x, y, z + 1) == Blocks.WIRE_REDSTONE.id() && world.getBlockMetadata(x, y, z + 1) > 0;
			case 1:
				return world.getSignal(x - 1, y, z, Side.WEST) || world.getBlockId(x - 1, y, z) == Blocks.WIRE_REDSTONE.id() && world.getBlockMetadata(x - 1, y, z) > 0;
			case 2:
				return world.getSignal(x, y, z - 1, Side.NORTH) || world.getBlockId(x, y, z - 1) == Blocks.WIRE_REDSTONE.id() && world.getBlockMetadata(x, y, z - 1) > 0;
			case 3:
				return world.getSignal(x + 1, y, z, Side.EAST) || world.getBlockId(x + 1, y, z) == Blocks.WIRE_REDSTONE.id() && world.getBlockMetadata(x + 1, y, z) > 0;
			default:
				return false;
		}
	}
}
