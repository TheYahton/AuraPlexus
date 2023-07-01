package auraplexus.item.custom;

import auraplexus.block.ModBlocks;
import auraplexus.item.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.entity.ItemEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.util.ActionResult;

public class SalisMundus extends Item {
    public SalisMundus(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        Block clickedBlock = context.getWorld().getBlockState(context.getBlockPos()).getBlock();
        if (clickedBlock == Blocks.CRAFTING_TABLE) {
            context.getStack().setCount(context.getStack().getCount()-1);
            context.getWorld().setBlockState(context.getBlockPos(), ModBlocks.ARCANE_WORKBENCH.getDefaultState());
            return ActionResult.SUCCESS;
        }
        else if (clickedBlock == Blocks.BOOKSHELF) {
            context.getStack().setCount(context.getStack().getCount()-1);
            context.getWorld().removeBlock(context.getBlockPos(), false);
            int x = context.getBlockPos().getX();
            int y = context.getBlockPos().getY();
            int z = context.getBlockPos().getZ();
            context.getWorld().spawnEntity(new ItemEntity(context.getWorld(), x, y, z,
                    ModItems.THAUMONOMICON.getDefaultStack(), 0, 0, 0));
            return ActionResult.SUCCESS;
        }
        else {
            return ActionResult.PASS;
        }
    }
}
