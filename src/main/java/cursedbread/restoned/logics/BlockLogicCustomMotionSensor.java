package cursedbread.restoned.logics;

import cursedbread.restoned.tileentities.TileEntityCustomSensor;
import net.minecraft.core.block.Block;
import net.minecraft.core.block.BlockLogicMotionSensor;
import net.minecraft.core.block.BlockLogicVeryRotatable;
import net.minecraft.core.block.Blocks;
import net.minecraft.core.block.entity.TileEntity;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.enums.EnumDropCause;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.util.helper.Direction;
import net.minecraft.core.util.helper.Side;
import net.minecraft.core.world.World;
import net.minecraft.core.world.WorldSource;

import java.util.Random;
import java.util.function.Supplier;

public class BlockLogicCustomMotionSensor extends BlockLogicVeryRotatable {
	public final boolean isActive;
	protected Block idle_block;
	protected Block active_block;
	protected String sound_block;
	public BlockLogicCustomMotionSensor(Block<?> block, boolean isActive, Block idle, Block active, String sound) {
		super(block, Material.glass);
		this.isActive = isActive;
		this.idle_block = idle;
		this.active_block = active;
		this.sound_block = sound;
		block.withEntity(() -> new TileEntityCustomSensor(this.idle_block, this.active_block, this.sound_block));
	}

	public void animationTick(World world, int x, int y, int z, Random rand) {
		if (this.isActive) {
			Random random = world.rand;
			int redstoneBrightness = 1;
			double d = 0.0625;

			for(int i = 0; i < 6; ++i) {
				double px = (double)x + (double)random.nextFloat();
				double py = (double)y + (double)random.nextFloat();
				double pz = (double)z + (double)random.nextFloat();
				if (i == 0 && !world.isBlockOpaqueCube(x, y + 1, z)) {
					py = (double)(y + 1) + d;
				}

				if (i == 1 && !world.isBlockOpaqueCube(x, y - 1, z)) {
					py = (double)(y + 0) - d;
				}

				if (i == 2 && !world.isBlockOpaqueCube(x, y, z + 1)) {
					pz = (double)(z + 1) + d;
				}

				if (i == 3 && !world.isBlockOpaqueCube(x, y, z - 1)) {
					pz = (double)(z + 0) - d;
				}

				if (i == 4 && !world.isBlockOpaqueCube(x + 1, y, z)) {
					px = (double)(x + 1) + d;
				}

				if (i == 5 && !world.isBlockOpaqueCube(x - 1, y, z)) {
					px = (double)(x + 0) - d;
				}

				if (px < (double)x || px > (double)(x + 1) || py < 0.0 || py > (double)(y + 1) || pz < (double)z || pz > (double)(z + 1)) {
					world.spawnParticle("reddust", px, py, pz, 0.0, 0.0, 0.0, 10);
				}
			}

		}
	}

	public boolean isSignalSource() {
		return true;
	}

	public boolean getDirectSignal(World world, int x, int y, int z, Side side) {
		return this.getSignal(world, x, y, z, side);
	}

	public boolean getSignal(WorldSource worldSource, int x, int y, int z, Side side) {
		return this.isActive;
	}

	@Override
	public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int meta, TileEntity tileEntity) {
		return dropCause == EnumDropCause.IMPROPER_TOOL ? null : new ItemStack[]{new ItemStack(idle_block)};
	}

	public static Direction getFacingDirection(int meta) {
		if (meta == 0) {
			return Direction.DOWN;
		} else if (meta == 1) {
			return Direction.UP;
		} else if (meta == 2) {
			return Direction.NORTH;
		} else if (meta == 3) {
			return Direction.SOUTH;
		} else if (meta == 4) {
			return Direction.WEST;
		} else {
			return meta == 5 ? Direction.EAST : Direction.NONE;
		}
	}
}
