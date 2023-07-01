package auraplexus.item.custom;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;

import java.util.ArrayList;
import java.util.Collection;

import static auraplexus.block.ModBlocks.CRYSTAL_ORE;

public class CrystalPlanters {
    public static Item CRYSTAL_PLANTER = new CrystalPlanter(CRYSTAL_ORE, new FabricItemSettings());


    public static ItemStack group = CRYSTAL_PLANTER.getDefaultStack();
    public static final Collection<ItemStack> CRYSTAL_PLANTERS = getCrystalEssences();

    private static Collection<ItemStack> getCrystalEssences() {
        ArrayList<ItemStack> stacks = new ArrayList<>();
        NbtCompound nbt = new NbtCompound();

        for(int i = 0; i < 6; i++) {
            nbt.putInt("aspect", i);
            group.setNbt(nbt);
            stacks.add(group.copy());
        }
        return stacks;
    }
}
