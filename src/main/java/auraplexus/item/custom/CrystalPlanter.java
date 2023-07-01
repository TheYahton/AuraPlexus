package auraplexus.item.custom;

import auraplexus.block.custom.CrystalOre;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

public class CrystalPlanter extends BlockItem {

    public CrystalPlanter(Block block, Settings settings) {
        super(block, settings);
    }

    @Override
    protected boolean postPlacement(BlockPos pos, World world, @Nullable PlayerEntity player, ItemStack stack, BlockState state) {
        Integer aspect = stack.getOrCreateNbt().getInt("aspect");
        world.setBlockState(pos, state.with(CrystalOre.ASPECT, aspect));
        return writeNbtToBlockEntity(world, player, pos, stack);
    }
}
