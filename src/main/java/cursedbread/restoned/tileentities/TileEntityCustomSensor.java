package cursedbread.restoned.tileentities;

import cursedbread.restoned.logics.BlockLogicCustomMotionSensor;
import net.minecraft.core.achievement.Achievements;
import net.minecraft.core.block.Block;
import net.minecraft.core.block.BlockLogicMotionSensor;
import net.minecraft.core.block.Blocks;
import net.minecraft.core.block.entity.TileEntity;
import net.minecraft.core.block.entity.TileEntitySensor;
import net.minecraft.core.block.tag.BlockTags;
import net.minecraft.core.entity.Entity;
import net.minecraft.core.entity.player.Player;
import net.minecraft.core.sound.SoundCategory;
import net.minecraft.core.util.helper.Direction;
import net.minecraft.core.util.helper.MathHelper;
import net.minecraft.core.util.phys.AABB;
import net.minecraft.core.world.World;

import java.util.List;

public class TileEntityCustomSensor extends TileEntity {
	protected Block idle_block;
	protected Block active_block;
	public TileEntityCustomSensor(Block idle, Block active) {
		this.idle_block = idle;
		this.active_block = active;
	}

	private int getSightRange(World world, double x, double y, double z, Direction facing) {
		if (facing == Direction.NONE) {
			return 0;
		} else {
			int range = 4;
			int blockInFront = world.getBlockId(MathHelper.round(x + (double)facing.getOffsetX()), MathHelper.round(y + (double)facing.getOffsetY()), MathHelper.round(z + (double)facing.getOffsetZ()));
			if (Blocks.hasTag(blockInFront, BlockTags.EXTENDS_MOTION_SENSOR_RANGE)) {
				range = 8;
			}

			for(int i = 1; i <= range; ++i) {
				int x1 = MathHelper.round(x + (double)(facing.getOffsetX() * i));
				int y1 = MathHelper.round(y + (double)(facing.getOffsetY() * i));
				int z1 = MathHelper.round(z + (double)(facing.getOffsetZ() * i));
				int id = world.getBlockId(x1, y1, z1);
				if (Blocks.solid[id] && !Blocks.hasTag(id, BlockTags.EXTENDS_MOTION_SENSOR_RANGE)) {
					return i - 1;
				}
			}

			return range;
		}
	}

	private AABB getDetectionBox(double x, double y, double z, Direction facing, int range) {
		double x1 = x + (double)facing.getOffsetX();
		double y1 = y + (double)facing.getOffsetY();
		double z1 = z + (double)facing.getOffsetZ();
		double x2 = x + (double)(facing.getOffsetX() * range);
		double y2 = y + (double)(facing.getOffsetY() * range);
		double z2 = z + (double)(facing.getOffsetZ() * range);
		double minX = Math.min(x1, x2);
		double minY = Math.min(y1, y2);
		double minZ = Math.min(z1, z2);
		double maxX = Math.max(x1, x2) + 1.0;
		double maxY = Math.max(y1, y2) + 1.0;
		double maxZ = Math.max(z1, z2) + 1.0;
		return AABB.getTemporaryBB(minX, minY, minZ, maxX, maxY, maxZ);
	}

	public void tick() {
		if (this.worldObj != null && !this.worldObj.isClientSide) {
			int id = this.worldObj.getBlockId(this.x, this.y, this.z);
			int meta = this.worldObj.getBlockMetadata(this.x, this.y, this.z);
			boolean shouldBeActive = false;
			Direction facing = BlockLogicCustomMotionSensor.getFacingDirection(meta);
			int effectiveRange = this.getSightRange(this.worldObj, (double)this.x, (double)this.y, (double)this.z, facing);
			if (effectiveRange > 0) {
				AABB detectionBox = this.getDetectionBox((double)this.x, (double)this.y, (double)this.z, facing, effectiveRange);
				List<Entity> list = this.worldObj.getEntitiesWithinAABBExcludingEntity((Entity)null, detectionBox);

				for(int i = 0; i < list.size(); ++i) {
					Entity entity = (Entity)list.get(i);
					if (entity.canInteract()) {
						if (entity instanceof Player) {
							Player player = (Player)entity;
							player.triggerAchievement(Achievements.GET_SENSED);
						}

						shouldBeActive = true;
					}
				}
			}

			if (shouldBeActive && id == idle_block.id()) {
				this.worldObj.playSoundEffect((Entity)null, SoundCategory.WORLD_SOUNDS, (double)this.x + 0.5, (double)this.y + 0.5, (double)this.z + 0.5, "tile.sensor_block.sense", 1.0F, this.worldObj.rand.nextFloat());
				this.updateSensorBlockState(true, this.worldObj);
			}

			if (!shouldBeActive && id == active_block.id()) {
				this.updateSensorBlockState(false, this.worldObj);
			}

		}
	}

	public void heldTick(World world, Entity holder) {
		if (world != null && this.carriedBlock != null && !world.isClientSide) {
			assert this.worldObj == null;

			int id = this.carriedBlock.blockId;
			int meta = this.carriedBlock.metadata;
			boolean shouldBeActive = false;
			Direction facing = BlockLogicMotionSensor.getFacingDirection(meta);
			int effectiveRange = this.getSightRange(world, holder.x, holder.y, holder.z, facing);
			if (effectiveRange > 0) {
				AABB detectionBox = this.getDetectionBox(holder.x, holder.y, holder.z, facing, effectiveRange);
				List<Entity> list = world.getEntitiesWithinAABBExcludingEntity((Entity)null, detectionBox);

				for(int i = 0; i < list.size(); ++i) {
					Entity entity = (Entity)list.get(i);
					if (entity != holder) {
						if (entity instanceof Player) {
							Player player = (Player)entity;
							player.triggerAchievement(Achievements.GET_SENSED);
						}

						shouldBeActive = true;
					}
				}
			}

			if (shouldBeActive && id == idle_block.id()) {
				world.playSoundEffect((Entity)null, SoundCategory.WORLD_SOUNDS, (double)this.x + 0.5, (double)this.y + 0.5, (double)this.z + 0.5, "tile.sensor_block.sense", 1.0F, world.rand.nextFloat());
				this.updateSensorBlockState(true, world);
			}

			if (!shouldBeActive && id == active_block.id()) {
				this.updateSensorBlockState(false, world);
			}

		}
	}

	public void updateSensorBlockState(boolean active, World world) {
		if (this.carriedBlock != null) {
			if (active) {
				this.carriedBlock.blockId = active_block.id();
			} else {
				this.carriedBlock.blockId = idle_block.id();
			}
		} else {
			int meta = world.getBlockMetadata(this.x, this.y, this.z);
			int blockId;
			if (active) {
				blockId = active_block.id();
			} else {
				blockId = idle_block.id();
			}

			world.setBlock(this.x, this.y, this.z, blockId);
			world.setBlockMetadata(this.x, this.y, this.z, meta);
			world.notifyBlockChange(this.x, this.y, this.z, blockId);
		}

	}
}
