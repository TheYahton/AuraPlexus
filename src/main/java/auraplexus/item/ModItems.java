package auraplexus.item;

import auraplexus.AuraPlexus;
import auraplexus.item.custom.CrystalEssences;
import auraplexus.item.custom.CrystalPlanters;
import auraplexus.item.custom.SalisMundus;
import net.minecraft.item.*;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import java.util.Collection;

import static auraplexus.block.ModBlocks.ARCANE_WORKBENCH;
import static auraplexus.item.custom.CrystalEssences.CRYSTAL_ESSENCES;
import static auraplexus.item.custom.CrystalPlanters.CRYSTAL_PLANTERS;

public class ModItems {

    public static final Item CRYSTAL_ESSENCE = CrystalEssences.CRYSTAL_ESSENCE;
    public static final Item SALIS_MUNDUS =  new SalisMundus(new FabricItemSettings());
    public static final Item ARCANE_WORKBENCH_ITEM = new BlockItem(ARCANE_WORKBENCH, new FabricItemSettings());
    public static final Item CRYSTAL_PLANTER = CrystalPlanters.CRYSTAL_PLANTER;
    public static final Item THAUMONOMICON =  new Item(new FabricItemSettings());


    private static void registerItem(String name, Item item) {
        Registry.register(Registries.ITEM, new Identifier(AuraPlexus.MOD_ID, name), item);
    }

    private static void addToItemGroup(ItemConvertible item) {
        ItemGroupEvents.modifyEntriesEvent(ModItemGroup.AURAPLEXUS).register(content -> content.add(item));
    }

    private static void addToItemGroup(Collection<ItemStack> item) {
        ItemGroupEvents.modifyEntriesEvent(ModItemGroup.AURAPLEXUS).register(content -> content.addAll(item));
    }


    private static void registerItems() {
        registerItem("crystal_essence", CRYSTAL_ESSENCE);
        registerItem("salis_mundus", SALIS_MUNDUS);
        registerItem("arcane_workbench", ARCANE_WORKBENCH_ITEM);
        registerItem("crystal_planter", CRYSTAL_PLANTER);
        registerItem("thaumonomicon", THAUMONOMICON);
    }

    public static void addItemsToItemGroup() {
        addToItemGroup(CRYSTAL_ESSENCES);
        addToItemGroup(SALIS_MUNDUS);
        addToItemGroup(ARCANE_WORKBENCH_ITEM);
        addToItemGroup(CRYSTAL_PLANTERS);
        addToItemGroup(THAUMONOMICON);
    }

    public static void registerModItems() {
        AuraPlexus.LOGGER.info("Registering ModItems for " + AuraPlexus.MOD_ID);

        registerItems();
        addItemsToItemGroup();
    }
}
