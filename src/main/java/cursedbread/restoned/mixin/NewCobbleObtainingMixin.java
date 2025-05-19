package cursedbread.restoned.mixin;

import cursedbread.restoned.RestonedBlocks;
import net.minecraft.core.block.Block;
import net.minecraft.core.block.BlockLogic;
import net.minecraft.core.block.BlockLogicCobble;
import net.minecraft.core.block.Blocks;
import net.minecraft.core.block.entity.TileEntity;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.entity.player.Player;
import net.minecraft.core.enums.EnumDropCause;
import net.minecraft.core.item.IItemConvertible;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.item.Items;
import net.minecraft.core.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.Objects;

@Mixin(value = BlockLogic.class, remap = false)

public class NewCobbleObtainingMixin {
	@Inject(method = "getBreakResult(Lnet/minecraft/core/world/World;Lnet/minecraft/core/enums/EnumDropCause;IIIILnet/minecraft/core/block/entity/TileEntity;)[Lnet/minecraft/core/item/ItemStack;", at=@At("TAIL"), cancellable = true)
	public void getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity tileEntity, CallbackInfoReturnable<ItemStack[]> cir) {

		Block block = world.getBlock(x, y, z);

		if (block == Blocks.MARBLE){
			switch (dropCause) {
				case PISTON_CRUSH:
				case WORLD:
				case EXPLOSION:
				case PROPER_TOOL:
					cir.setReturnValue(new ItemStack[]{new ItemStack((IItemConvertible) RestonedBlocks.COBBLE_MARBLE)});
				case PICK_BLOCK:
				case SILK_TOUCH:
					cir.setReturnValue(new ItemStack[]{new ItemStack((IItemConvertible) Blocks.MARBLE)});
				default:
					cir.setReturnValue(null);
			}
		}

		if (block == Blocks.SLATE){
			switch (dropCause) {
				case PISTON_CRUSH:
				case WORLD:
				case EXPLOSION:
				case PROPER_TOOL:
					cir.setReturnValue(new ItemStack[]{new ItemStack((IItemConvertible) RestonedBlocks.COBBLE_SLATE)});
				case PICK_BLOCK:
				case SILK_TOUCH:
					cir.setReturnValue(new ItemStack[]{new ItemStack((IItemConvertible) Blocks.SLATE)});
				default:
					cir.setReturnValue(null);
			}
		}
	}
}
