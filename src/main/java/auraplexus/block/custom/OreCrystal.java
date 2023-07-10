package auraplexus.block.custom;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.IntProperty;


public class OreCrystal extends Block {
    public static final IntProperty ASPECT = IntProperty.of("aspect", 0, 5);

    public OreCrystal() {
        super(FabricBlockSettings.copyOf(Blocks.AMETHYST_CLUSTER));
        setDefaultState(getDefaultState().with(ASPECT, 0));
    }

    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(ASPECT);
    }
}
