package auraplexus.item;

import auraplexus.AuraPlexus;
import auraplexus.block.ModBlocks;
import auraplexus.item.custom.CrystalEssences;
import auraplexus.item.custom.CrystalPlanters;
import auraplexus.item.custom.SalisMundus;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import java.util.Collection;

import static auraplexus.block.ModBlocks.ARCANE_WORKBENCH;
import static auraplexus.item.custom.CrystalEssences.CRYSTAL_ESSENCES;
import static auraplexus.item.custom.CrystalPlanters.CRYSTAL_PLANTERS;
import static auraplexus.item.custom.Miraculum.*;

public class ModItems {

    public static final Item CRYSTAL_ESSENCE = CrystalEssences.CRYSTAL_ESSENCE;
    public static final Item SALIS_MUNDUS =  new SalisMundus(new FabricItemSettings());
    public static final Item ARCANE_WORKBENCH_ITEM = new BlockItem(ARCANE_WORKBENCH, new FabricItemSettings());
    public static final Item CRYSTAL_PLANTER = CrystalPlanters.CRYSTAL_PLANTER;
    public static final Item MIRACULONOMICON =  new Item(new FabricItemSettings());
    public static final Item ORE_AMBER = new BlockItem(ModBlocks.ORE_AMBER, new FabricItemSettings());
    public static final Item AMBER = new Item(new FabricItemSettings());
    public static final Item ORE_CINNABAR = new BlockItem(ModBlocks.ORE_CINNABAR, new FabricItemSettings());
    public static final Item QUICKSILVER = new Item(new FabricItemSettings());
    public static final Item ORE_QUARTZ = new BlockItem(ModBlocks.ORE_QUARTZ, new FabricItemSettings());
    public static final Item MIRACULOMETER = new Item(new FabricItemSettings());
    public static final Item CRUCIBLE = new BlockItem(ModBlocks.CRUCIBLE, new FabricItemSettings());


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
        registerItem("miraculonomicon", MIRACULONOMICON);
        registerItem("ore_amber", ORE_AMBER);
        registerItem("amber", AMBER);
        registerItem("ore_cinnabar", ORE_CINNABAR);
        registerItem("quicksilver", QUICKSILVER);
        registerItem("ore_quartz", ORE_QUARTZ);
        registerItem("miraculometer", MIRACULOMETER);
        registerItem("miraculum_ingot", MIRACULUM_INGOT);
        registerItem("miraculum_sword", MIRACULUM_SWORD);
        registerItem("miraculum_pickaxe", MIRACULUM_PICKAXE);
        registerItem("miraculum_axe", MIRACULUM_AXE);
        registerItem("miraculum_shovel", MIRACULUM_SHOVEL);
        registerItem("miraculum_hoe", MIRACULUM_HOE);
        registerItem("miraculum_helmet", MIRACULUM_HELMET);
        registerItem("miraculum_chestplate", MIRACULUM_CHESTPLATE);
        registerItem("miraculum_leggings", MIRACULUM_LEGGINGS);
        registerItem("miraculum_boots", MIRACULUM_BOOTS);
        registerItem("crucible", CRUCIBLE);

    }

    public static void addItemsToItemGroup() {
        addToItemGroup(CRYSTAL_ESSENCES); // add crystal_essence with all aspects to ItemGroup
        addToItemGroup(SALIS_MUNDUS);
        addToItemGroup(ARCANE_WORKBENCH_ITEM);
        addToItemGroup(CRYSTAL_PLANTERS); // add crystal_planters with all aspects to ItemGroup
        addToItemGroup(MIRACULONOMICON);
        addToItemGroup(ORE_AMBER);
        addToItemGroup(AMBER);
        addToItemGroup(ORE_CINNABAR);
        addToItemGroup(QUICKSILVER);
        addToItemGroup(ORE_QUARTZ);
        addToItemGroup(MIRACULOMETER);
        addToItemGroup(MIRACULUM_INGOT);
        addToItemGroup(MIRACULUM_SWORD);
        addToItemGroup(MIRACULUM_PICKAXE);
        addToItemGroup(MIRACULUM_AXE);
        addToItemGroup(MIRACULUM_SHOVEL);
        addToItemGroup(MIRACULUM_HOE);
        addToItemGroup(MIRACULUM_HELMET);
        addToItemGroup(MIRACULUM_CHESTPLATE);
        addToItemGroup(MIRACULUM_LEGGINGS);
        addToItemGroup(MIRACULUM_BOOTS);
        addToItemGroup(CRUCIBLE);
    }

    public static void registerModItems() {
        AuraPlexus.LOGGER.info("Registering ModItems for " + AuraPlexus.MOD_ID);

        registerItems();
        addItemsToItemGroup();
    }
}
