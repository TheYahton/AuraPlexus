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
import static auraplexus.item.custom.Thaumium.*;

public class ModItems {

    public static final Item CRYSTAL_ESSENCE = CrystalEssences.CRYSTAL_ESSENCE;
    public static final Item SALIS_MUNDUS =  new SalisMundus(new FabricItemSettings());
    public static final Item ARCANE_WORKBENCH_ITEM = new BlockItem(ARCANE_WORKBENCH, new FabricItemSettings());
    public static final Item CRYSTAL_PLANTER = CrystalPlanters.CRYSTAL_PLANTER;
    public static final Item THAUMONOMICON =  new Item(new FabricItemSettings());
    public static final Item ORE_AMBER = new BlockItem(ModBlocks.ORE_AMBER, new FabricItemSettings());
    public static final Item AMBER = new Item(new FabricItemSettings());
    public static final Item ORE_CINNABAR = new BlockItem(ModBlocks.ORE_CINNABAR, new FabricItemSettings());
    public static final Item QUICKSILVER = new Item(new FabricItemSettings());
    public static final Item ORE_QUARTZ = new BlockItem(ModBlocks.ORE_QUARTZ, new FabricItemSettings());
    public static final Item THAUMOMETER = new Item(new FabricItemSettings());


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
        registerItem("ore_amber", ORE_AMBER);
        registerItem("amber", AMBER);
        registerItem("ore_cinnabar", ORE_CINNABAR);
        registerItem("quicksilver", QUICKSILVER);
        registerItem("ore_quartz", ORE_QUARTZ);
        registerItem("thaumometer", THAUMOMETER);
        registerItem("ingot_thaumium", INGOT_THAUMIUM);
        registerItem("thaumium_sword", THAUMIUM_SWORD);
        registerItem("thaumium_pickaxe", THAUMIUM_PICKAXE);
        registerItem("thaumium_axe", THAUMIUM_AXE);
        registerItem("thaumium_shovel", THAUMIUM_SHOVEL);
        registerItem("thaumium_hoe", THAUMIUM_HOE);

    }

    public static void addItemsToItemGroup() {
        addToItemGroup(CRYSTAL_ESSENCES); // add crystal_essence with all aspects to ItemGroup
        addToItemGroup(SALIS_MUNDUS);
        addToItemGroup(ARCANE_WORKBENCH_ITEM);
        addToItemGroup(CRYSTAL_PLANTERS); // add crystal_planters with all aspects to ItemGroup
        addToItemGroup(THAUMONOMICON);
        addToItemGroup(ORE_AMBER);
        addToItemGroup(AMBER);
        addToItemGroup(ORE_CINNABAR);
        addToItemGroup(QUICKSILVER);
        addToItemGroup(ORE_QUARTZ);
        addToItemGroup(THAUMOMETER);
        addToItemGroup(INGOT_THAUMIUM);
        addToItemGroup(THAUMIUM_SWORD);
        addToItemGroup(THAUMIUM_PICKAXE);
        addToItemGroup(THAUMIUM_AXE);
        addToItemGroup(THAUMIUM_SHOVEL);
        addToItemGroup(THAUMIUM_HOE);
    }

    public static void registerModItems() {
        AuraPlexus.LOGGER.info("Registering ModItems for " + AuraPlexus.MOD_ID);

        registerItems();
        addItemsToItemGroup();
    }
}
