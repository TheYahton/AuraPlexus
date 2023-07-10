package auraplexus.block.custom;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;

public class ArcaneWorkbench extends Block {
    public ArcaneWorkbench() {
        super(FabricBlockSettings.copyOf(Blocks.CRAFTING_TABLE));
    }

//    @Override
//    public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
//        return new DemoBlockEntity(pos, state);
//    }
}
