package auraplexus.item;

import auraplexus.AuraPlexus;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroup {

    public static final RegistryKey<ItemGroup> AURAPLEXUS = RegistryKey.of(RegistryKeys.ITEM_GROUP,
            new Identifier(AuraPlexus.MOD_ID, "auraplexus"));

    public static void registerItemGroups() {
        Registry.register(Registries.ITEM_GROUP, AURAPLEXUS, FabricItemGroup.builder()
       .icon(() -> new ItemStack(ModItems.MIRACULONOMICON))
       .displayName(Text.translatable("auraplexus.itemgroup"))
       .build());
    }
}
