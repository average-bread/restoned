package cursedbread.restoned.mixin;

import cursedbread.restoned.RestonedBlocks;
import net.minecraft.core.block.Block;
import net.minecraft.core.block.BlockLogic;
import net.minecraft.core.block.BlockLogicMoss;
import net.minecraft.core.block.Blocks;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.entity.player.Player;
import net.minecraft.core.item.IBonemealable;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.util.helper.Side;
import net.minecraft.core.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import static net.minecraft.core.block.BlockLogicMoss.stoneToMossMap;

@Mixin(value = BlockLogicMoss.class, remap = false)

public abstract class NewStoneToMossMixin extends BlockLogic implements IBonemealable {
	public NewStoneToMossMixin(Block<?> block, Material material) {
		super(block, material);
	}

	@Inject(method = "initMossMap()V", at = @At(value = "INVOKE", ordinal = 0, target = "Ljava/util/Map;put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"), cancellable = true)
	private static void initMossMap(CallbackInfo ci) {
		stoneToMossMap.put(Blocks.COBBLE_BASALT, RestonedBlocks.COBBLE_BASALT_MOSSY);
		stoneToMossMap.put(Blocks.COBBLE_LIMESTONE, RestonedBlocks.COBBLE_LIMESTONE_MOSSY);
		stoneToMossMap.put(Blocks.COBBLE_GRANITE, RestonedBlocks.COBBLE_GRANITE_MOSSY);
		stoneToMossMap.put(RestonedBlocks.COBBLE_MARBLE, RestonedBlocks.COBBLE_MARBLE_MOSSY);
		stoneToMossMap.put(RestonedBlocks.COBBLE_SLATE, RestonedBlocks.COBBLE_SLATE_MOSSY);
		stoneToMossMap.put(Blocks.COBBLE_PERMAFROST, RestonedBlocks.COBBLE_PERMAFROST_MOSSY);
	}

	@Inject(method = "onBonemealUsed(Lnet/minecraft/core/item/ItemStack;Lnet/minecraft/core/entity/player/Player;Lnet/minecraft/core/world/World;IIILnet/minecraft/core/util/helper/Side;DD)Z", at=@At("TAIL"), cancellable = true)
	public void onBonemealUsed(ItemStack itemstack, Player player, World world, int blockX, int blockY, int blockZ, Side side, double xPlaced, double yPlaced, CallbackInfoReturnable<Boolean> cir) {
		if (!world.isClientSide) {
			if (player == null || player.getGamemode().consumeBlocks()) {
				--itemstack.stackSize;
			}

			for(int j1 = 0; j1 < 32; ++j1) {
				int k1 = blockX;
				int l1 = blockY;
				int i2 = blockZ;

				int blockId;
				for(blockId = 0; blockId < j1 / 16; ++blockId) {
					k1 += world.rand.nextInt(3) - 1;
					l1 += (world.rand.nextInt(3) - 1) * world.rand.nextInt(3) / 2;
					i2 += world.rand.nextInt(3) - 1;
				}

				if (!Block.isBuried(world, k1, l1, i2) && world.getBlockLightValue(k1, l1 + 1, i2) <= 5 && world.getBlockLightValue(k1, l1 - 1, i2) <= 5 && world.getBlockLightValue(k1 + 1, l1, i2) <= 5 && world.getBlockLightValue(k1 - 1, l1, i2) <= 5 && world.getBlockLightValue(k1, l1, i2 - 1) <= 5 && world.getBlockLightValue(k1, l1, i2 + 1) <= 5) {
					blockId = world.getBlockId(k1, l1, i2);
					if (blockId == Blocks.COBBLE_BASALT.id()) {
						world.setBlockWithNotify(k1, l1, i2, RestonedBlocks.COBBLE_BASALT_MOSSY.id());
					} else if (blockId == Blocks.COBBLE_LIMESTONE.id()) {
						world.setBlockWithNotify(k1, l1, i2, RestonedBlocks.COBBLE_LIMESTONE_MOSSY.id());
					} else if (blockId == Blocks.COBBLE_GRANITE.id()) {
						world.setBlockWithNotify(k1, l1, i2, RestonedBlocks.COBBLE_GRANITE_MOSSY.id());
					} else if (blockId == RestonedBlocks.COBBLE_MARBLE.id()) {
						world.setBlockWithNotify(k1, l1, i2, RestonedBlocks.COBBLE_MARBLE_MOSSY.id());
					} else if (blockId == RestonedBlocks.COBBLE_SLATE.id()) {
						world.setBlockWithNotify(k1, l1, i2, RestonedBlocks.COBBLE_SLATE_MOSSY.id());
					} else if (blockId == Blocks.COBBLE_PERMAFROST.id()) {
						world.setBlockWithNotify(k1, l1, i2, RestonedBlocks.COBBLE_PERMAFROST_MOSSY.id());
					}
				}
			}
		}

		cir.setReturnValue(true);
	}
}
