package cursedbread.restoned.logics;

import cursedbread.restoned.RestonedBlocks;
import cursedbread.restoned.tileentities.TileEntityCustomFurnace;
import net.minecraft.core.Global;
import net.minecraft.core.block.Block;
import net.minecraft.core.block.BlockLogicFurnace;
import net.minecraft.core.block.BlockLogicRotatable;
import net.minecraft.core.block.Blocks;
import net.minecraft.core.block.entity.TileEntity;
import net.minecraft.core.block.entity.TileEntityFurnace;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.entity.player.Player;
import net.minecraft.core.enums.EnumDropCause;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.util.helper.Side;
import net.minecraft.core.world.World;
import org.jetbrains.annotations.NotNull;

import java.util.Random;

public class BlockLogicCustomFurnace extends BlockLogicFurnace {
	protected Block idle_block;
	protected Block active_block;
	protected final boolean isActive;
	public static boolean keepFurnaceInventory = false;
	public BlockLogicCustomFurnace(Block<?> block, boolean active, Block idle, Block active_b) {
		super(block, active);
		this.idle_block = idle;
		this.active_block = active_b;
		this.isActive = active;
		block.withEntity(() -> new TileEntityCustomFurnace(idle_block, active_block));
	}

	public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int meta, TileEntity tileEntity) {
		switch (dropCause) {
			case PICK_BLOCK:
			case EXPLOSION:
			case PROPER_TOOL:
			case SILK_TOUCH:
			case PISTON_CRUSH:
				return new ItemStack[]{new ItemStack(idle_block)};
			default:
				return null;
		}
	}

	public void animationTick(World world, int x, int y, int z, Random rand) {
		if (this.isActive) {
			int l = world.getBlockMetadata(x, y, z);
			double poxX = (double)x + 0.5;
			double posY = (double)y + 0.0 + (double)(rand.nextFloat() * 6.0F / 16.0F);
			double posZ = (double)z + 0.5;
			double f3 = 0.5199999809265137;
			double f4 = (double)(rand.nextFloat() * 0.6F - 0.3F);
			if (l == 4) {
				world.spawnParticle("smoke", poxX - f3, posY, posZ + f4, 0.0, 0.0, 0.0, 0);
				world.spawnParticle("flame", poxX - f3, posY, posZ + f4, 0.0, 0.0, 0.0, 0);
			} else if (l == 5) {
				world.spawnParticle("smoke", poxX + f3, posY, posZ + f4, 0.0, 0.0, 0.0, 0);
				world.spawnParticle("flame", poxX + f3, posY, posZ + f4, 0.0, 0.0, 0.0, 0);
			} else if (l == 2) {
				world.spawnParticle("smoke", poxX + f4, posY, posZ - f3, 0.0, 0.0, 0.0, 0);
				world.spawnParticle("flame", poxX + f4, posY, posZ - f3, 0.0, 0.0, 0.0, 0);
			} else if (l == 3) {
				world.spawnParticle("smoke", poxX + f4, posY, posZ + f3, 0.0, 0.0, 0.0, 0);
				world.spawnParticle("flame", poxX + f4, posY, posZ + f3, 0.0, 0.0, 0.0, 0);
			}

		}
	}

	public boolean onBlockRightClicked(World world, int x, int y, int z, Player player, Side side, double xPlaced, double yPlaced) {
		if (!world.isClientSide) {
			TileEntityCustomFurnace tileentitycustomfurnace = (TileEntityCustomFurnace)world.getTileEntity(x, y, z);
			player.displayFurnaceScreen(tileentitycustomfurnace);
		}

		return true;
	}

	public static void updateFurnaceBlockState(boolean lit, @NotNull World world, int x, int y, int z) {
		int meta = world.getBlockMetadata(x, y, z);
		TileEntity tileEntity = world.getTileEntity(x, y, z);
		if (tileEntity == null) {
			String msg = "Furnace is missing Tile Entity at x: " + x + " y: " + y + " z: " + z + ", block will be removed!";
			if (Global.BUILD_CHANNEL.isUnstableBuild()) {
				throw new RuntimeException(msg);
			} else {
				world.setBlockWithNotify(x, y, z, 0);
			}
		} else {
			keepFurnaceInventory = true;
			if (world.getBlock(x, y, z) == RestonedBlocks.FURNACE_BASALT_IDLE || world.getBlock(x, y, z) == RestonedBlocks.FURNACE_BASALT_ACTIVE){
				if (lit) {
					world.setBlockWithNotify(x, y, z, RestonedBlocks.FURNACE_BASALT_ACTIVE.id());
				} else {
					world.setBlockWithNotify(x, y, z, RestonedBlocks.FURNACE_BASALT_IDLE.id());
				}
			}
			if (world.getBlock(x, y, z) == RestonedBlocks.FURNACE_LIMESTONE_IDLE || world.getBlock(x, y, z) == RestonedBlocks.FURNACE_LIMESTONE_ACTIVE){
				if (lit) {
					world.setBlockWithNotify(x, y, z, RestonedBlocks.FURNACE_LIMESTONE_ACTIVE.id());
				} else {
					world.setBlockWithNotify(x, y, z, RestonedBlocks.FURNACE_LIMESTONE_IDLE.id());
				}
			}
			if (world.getBlock(x, y, z) == RestonedBlocks.FURNACE_GRANITE_IDLE || world.getBlock(x, y, z) == RestonedBlocks.FURNACE_GRANITE_ACTIVE){
				if (lit) {
					world.setBlockWithNotify(x, y, z, RestonedBlocks.FURNACE_GRANITE_ACTIVE.id());
				} else {
					world.setBlockWithNotify(x, y, z, RestonedBlocks.FURNACE_GRANITE_IDLE.id());
				}
			}
			if (world.getBlock(x, y, z) == RestonedBlocks.FURNACE_MARBLE_IDLE || world.getBlock(x, y, z) == RestonedBlocks.FURNACE_MARBLE_ACTIVE){
				if (lit) {
					world.setBlockWithNotify(x, y, z, RestonedBlocks.FURNACE_MARBLE_ACTIVE.id());
				} else {
					world.setBlockWithNotify(x, y, z, RestonedBlocks.FURNACE_MARBLE_IDLE.id());
				}
			}
			if (world.getBlock(x, y, z) == RestonedBlocks.FURNACE_SLATE_IDLE || world.getBlock(x, y, z) == RestonedBlocks.FURNACE_SLATE_ACTIVE){
				if (lit) {
					world.setBlockWithNotify(x, y, z, RestonedBlocks.FURNACE_SLATE_ACTIVE.id());
				} else {
					world.setBlockWithNotify(x, y, z, RestonedBlocks.FURNACE_SLATE_IDLE.id());
				}
			}
			if (world.getBlock(x, y, z) == RestonedBlocks.FURNACE_PERMAFROST_IDLE || world.getBlock(x, y, z) == RestonedBlocks.FURNACE_PERMAFROST_ACTIVE){
				if (lit) {
					world.setBlockWithNotify(x, y, z, RestonedBlocks.FURNACE_PERMAFROST_ACTIVE.id());
				} else {
					world.setBlockWithNotify(x, y, z, RestonedBlocks.FURNACE_PERMAFROST_IDLE.id());
				}
			}
			if (world.getBlock(x, y, z) == RestonedBlocks.FURNACE_NETHERRACK_IDLE || world.getBlock(x, y, z) == RestonedBlocks.FURNACE_NETHERRACK_ACTIVE){
				if (lit) {
					world.setBlockWithNotify(x, y, z, RestonedBlocks.FURNACE_NETHERRACK_ACTIVE.id());
				} else {
					world.setBlockWithNotify(x, y, z, RestonedBlocks.FURNACE_NETHERRACK_IDLE.id());
				}
			}

			keepFurnaceInventory = false;
			world.setBlockMetadataWithNotify(x, y, z, meta);
			tileEntity.validate();
			world.setTileEntity(x, y, z, tileEntity);
		}
	}
}
