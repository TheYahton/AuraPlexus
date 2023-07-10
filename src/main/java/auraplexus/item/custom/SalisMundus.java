package auraplexus.item.custom;

import auraplexus.block.ModBlocks;
import auraplexus.item.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.entity.ItemEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class SalisMundus extends Item {
    public SalisMundus(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        // For more comfort
        World world = context.getWorld();
        BlockPos pos = context.getBlockPos();
        ItemStack stack = context.getStack();
        Block clickedBlock = world.getBlockState(pos).getBlock();

        if (clickedBlock == Blocks.CRAFTING_TABLE) {
            stack.setCount(stack.getCount()-1); // decrease items count by 1
            world.setBlockState(pos, ModBlocks.ARCANE_WORKBENCH.getDefaultState()); // Replace crafting table by arcane workbench

            return ActionResult.SUCCESS;
        }

        else if (clickedBlock == Blocks.BOOKSHELF) {
            double x = context.getBlockPos().getX()+0.5; // Very...
            double y = context.getBlockPos().getY(); // Very...
            double z = context.getBlockPos().getZ()+0.5; // Very... boring
            stack.setCount(stack.getCount()-1); // decrease items count by 1
            world.removeBlock(pos, false); // delete bookshelf
            world.spawnEntity(new ItemEntity(world, x, y, z,
                    ModItems.THAUMONOMICON.getDefaultStack())); // Spawn Thaumonomicon at pos.

            return ActionResult.SUCCESS;
        }

        else {
            return ActionResult.PASS;
        }
    }
}
