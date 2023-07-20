package auraplexus.block.custom;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;

public class Crucible extends Block {

    public static final BooleanProperty WATERED = BooleanProperty.of("watered");

    public Crucible() {
        super(FabricBlockSettings.copyOf(Blocks.CAULDRON));
        setDefaultState(getDefaultState().with(WATERED, Boolean.FALSE));
    }

    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(WATERED);
    }
}
