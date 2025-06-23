package cursedbread.restoned.tileentities;

import com.mojang.nbt.tags.CompoundTag;
import com.mojang.nbt.tags.ListTag;
import cursedbread.restoned.logics.BlockLogicCustomFurnace;
import net.minecraft.core.block.Block;
import net.minecraft.core.block.Blocks;
import net.minecraft.core.block.entity.TileEntity;
import net.minecraft.core.block.entity.TileEntityFurnace;
import net.minecraft.core.block.motion.CarriedBlock;
import net.minecraft.core.crafting.LookupFuelFurnace;
import net.minecraft.core.data.registry.Registries;
import net.minecraft.core.data.registry.recipe.entry.RecipeEntryFurnace;
import net.minecraft.core.entity.Entity;
import net.minecraft.core.entity.EntityItem;
import net.minecraft.core.entity.player.Player;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.item.Items;
import net.minecraft.core.net.packet.Packet;
import net.minecraft.core.net.packet.PacketTileEntityData;
import net.minecraft.core.player.inventory.container.Container;
import net.minecraft.core.util.helper.Side;
import net.minecraft.core.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class TileEntityCustomFurnace extends TileEntityFurnace implements Container {
	private final Random random = new Random();
	protected Block idle_block;
	protected Block active_block;

	public TileEntityCustomFurnace(Block idle, Block active_b) {
		this.idle_block = idle;
		this.active_block = active_b;
	}

	@Override
	public void tick() {
		boolean isBurnTimeHigherThan0 = this.currentBurnTime > 0;
		boolean furnaceUpdated = false;
		if (this.currentBurnTime > 0) {
			--this.currentBurnTime;
		}

		if (this.worldObj == null || !this.worldObj.isClientSide) {
			if ((this.worldObj == null || this.worldObj.getBlockId(this.x, this.y, this.z) == idle_block.id()) && this.currentBurnTime == 0 && this.furnaceItemStacks[0] == null && this.furnaceItemStacks[1] != null && this.furnaceItemStacks[1].itemID == Blocks.COBBLE_NETHERRACK.id()) {
				--this.furnaceItemStacks[1].stackSize;
				if (this.furnaceItemStacks[1].stackSize <= 0) {
					this.furnaceItemStacks[1] = null;
				}

				this.updateFurnace(true);
				furnaceUpdated = true;
			}

			if (this.currentBurnTime == 0 && this.furnaceItemStacks[1] != null && this.canSmelt()) {
				this.maxBurnTime = this.currentBurnTime = this.getBurnTimeFromItem(this.furnaceItemStacks[1]);
				if (this.currentBurnTime > 0) {
					furnaceUpdated = true;
					if (this.furnaceItemStacks[1] != null) {
						if (this.furnaceItemStacks[1].getItem() == Items.BUCKET_LAVA) {
							this.furnaceItemStacks[1] = new ItemStack(Items.BUCKET);
						} else {
							--this.furnaceItemStacks[1].stackSize;
							if (this.furnaceItemStacks[1].stackSize <= 0) {
								this.furnaceItemStacks[1] = null;
							}
						}
					}
				}
			}

			if (this.isBurning() && this.canSmelt()) {
				++this.currentCookTime;
				if (this.currentCookTime == this.maxCookTime) {
					this.currentCookTime = 0;
					this.smeltItem();
					furnaceUpdated = true;
				}
			} else {
				this.currentCookTime = 0;
			}

			if (isBurnTimeHigherThan0 != this.currentBurnTime > 0) {
				furnaceUpdated = true;
				this.updateFurnace(false);
			}
		}

		if (furnaceUpdated) {
			this.setChanged();
		}

	}

	private boolean canSmelt() {
		if (this.furnaceItemStacks[0] == null) {
			return false;
		} else {
			List<RecipeEntryFurnace> list = Registries.RECIPES.getAllFurnaceRecipes();
			ItemStack itemstack = null;
			Iterator var3 = list.iterator();

			while(var3.hasNext()) {
				RecipeEntryFurnace recipeEntryBase = (RecipeEntryFurnace)var3.next();
				if (recipeEntryBase != null && recipeEntryBase.matches(this.furnaceItemStacks[0])) {
					itemstack = (ItemStack)recipeEntryBase.getOutput();
				}
			}

			if (itemstack == null) {
				return false;
			} else if (this.furnaceItemStacks[2] == null) {
				return true;
			} else if (!this.furnaceItemStacks[2].isItemEqual(itemstack)) {
				return false;
			} else if (this.furnaceItemStacks[2].stackSize < this.getMaxStackSize() && this.furnaceItemStacks[2].stackSize < this.furnaceItemStacks[2].getMaxStackSize()) {
				return true;
			} else {
				return this.furnaceItemStacks[2].stackSize < itemstack.getMaxStackSize();
			}
		}
	}

	@Override
	protected void updateFurnace(boolean forceLit) {
		if (this.worldObj != null) {
			BlockLogicCustomFurnace.updateFurnaceBlockState(forceLit | this.currentBurnTime > 0, this.worldObj, this.x, this.y, this.z);
		} else if (this.carriedBlock != null) {
			this.carriedBlock.blockId = forceLit | this.currentBurnTime > 0 ? active_block.id() : idle_block.id();
		}

	}

	private int getBurnTimeFromItem(ItemStack itemStack) {
		return itemStack == null ? 0 : LookupFuelFurnace.instance.getFuelYield(itemStack.getItem().id);
	}

	@Override
	public void dropContents(World world, int x, int y, int z) {
		super.dropContents(world, x, y, z);
		if (!BlockLogicCustomFurnace.keepFurnaceInventory) {
			for(int l = 0; l < this.getContainerSize(); ++l) {
				ItemStack itemstack = this.getItem(l);
				if (itemstack != null) {
					float f = this.random.nextFloat() * 0.8F + 0.1F;
					float f1 = this.random.nextFloat() * 0.8F + 0.1F;
					float f2 = this.random.nextFloat() * 0.8F + 0.1F;

					while(itemstack.stackSize > 0) {
						int i1 = this.random.nextInt(21) + 10;
						if (i1 > itemstack.stackSize) {
							i1 = itemstack.stackSize;
						}

						itemstack.stackSize -= i1;
						EntityItem entityItem = new EntityItem(world, (double)((float)x + f), (double)((float)y + f1), (double)((float)z + f2), new ItemStack(itemstack.itemID, i1, itemstack.getMetadata()));
						float f3 = 0.05F;
						entityItem.xd = (double)((float)this.random.nextGaussian() * f3);
						entityItem.yd = (double)((float)this.random.nextGaussian() * f3 + 0.2F);
						entityItem.zd = (double)((float)this.random.nextGaussian() * f3);
						world.entityJoinedWorld(entityItem);
					}
				}
			}
		}

	}
}
