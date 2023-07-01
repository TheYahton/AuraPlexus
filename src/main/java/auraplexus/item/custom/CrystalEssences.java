package auraplexus.item.custom;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;

import java.util.ArrayList;
import java.util.Collection;

import static auraplexus.item.custom.Aspects.intAspectColor;

public class CrystalEssences {
    public static final Item CRYSTAL_ESSENCE = new Item(new FabricItemSettings());

    public static ItemStack group = CRYSTAL_ESSENCE.getDefaultStack();
    public static final Collection<ItemStack> CRYSTAL_ESSENCES = getCrystalEssences();

    private static Collection<ItemStack> getCrystalEssences() {
        ArrayList<ItemStack> stacks = new ArrayList<>();
        NbtCompound nbt = new NbtCompound();

        for(int i = 0; i< intAspectColor.size(); i++) {
            nbt.putString("aspect", intAspectColor.get(i));
            group.setNbt(nbt);
            stacks.add(group.copy());
        }
        return stacks;
    }

}
