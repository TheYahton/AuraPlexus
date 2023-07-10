package auraplexus.entity;

import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.util.math.BlockPos;

public class ArcaneWorkbenchEntity extends BlockEntity{
    public ArcaneWorkbenchEntity(BlockEntityType<?> type, BlockPos pos, BlockState state) {
        super(type, pos, state);
    }

    public static FabricBlockEntityTypeBuilder.Factory<ArcaneWorkbenchEntity> ArcaneWorkbenchEntity;
}
