package auraplexus.block.custom;

import com.ibm.icu.text.AlphabeticIndex.Bucket;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.BucketItem;
import net.minecraft.item.Items;
import net.minecraft.sound.SoundEvents;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;


public class Crucible extends Block {

    public static final BooleanProperty WATERED = BooleanProperty.of("watered");

    public Crucible(Settings settings) {
        super(settings);
        setDefaultState(getDefaultState().with(WATERED, false));
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(WATERED);
    }

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        player.playSound(SoundEvents.BLOCK_RESPAWN_ANCHOR_CHARGE, 1, 1);
        Boolean newstate = state.get(WATERED) ? false : true;
        if (player.getMainHandStack().getItem() == Items.WATER_BUCKET) {
            player.setStackInHand(hand, Items.BUCKET.getDefaultStack());
            world.setBlockState(pos, state.with(WATERED, true));
        } else if (player.getMainHandStack().getItem() == Items.BUCKET) {
            if (state.get(WATERED) == true) {
                player.setStackInHand(hand, Items.WATER_BUCKET.getDefaultStack());
                world.setBlockState(pos, state.with(WATERED, false));
            }
        }
        return ActionResult.SUCCESS;
    }
}
