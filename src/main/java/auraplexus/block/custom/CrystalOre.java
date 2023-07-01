package auraplexus.block.custom;

import auraplexus.item.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.ItemEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.stat.Stats;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.IntProperty;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import static auraplexus.item.custom.Aspects.intAspectColor;


public class CrystalOre extends Block {
    public static final IntProperty ASPECT = IntProperty.of("aspect", 0, 5);

    public CrystalOre(Settings settings) {
        super(settings);
        setDefaultState(getDefaultState().with(ASPECT, 0));
    }

    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(ASPECT);
    }

    @Override
    public void afterBreak(World world, PlayerEntity player, BlockPos pos, BlockState state, @Nullable BlockEntity blockEntity, ItemStack tool) {
        player.incrementStat(Stats.MINED.getOrCreateStat(this));
        player.addExhaustion(0.005F);
        int x = pos.getX();
        int y = pos.getY();
        int z = pos.getZ();
        ItemStack crystal = ModItems.CRYSTAL_ESSENCE.getDefaultStack();
        NbtCompound nbt = new NbtCompound();
        nbt.putString("aspect", intAspectColor.get(state.get(ASPECT)));
        crystal.setNbt(nbt);
        world.spawnEntity(new ItemEntity(world, x, y, z, crystal));
    }

}
