package auraplexus.block;

import auraplexus.AuraPlexus;
import auraplexus.block.custom.ArcaneWorkbench;
import auraplexus.block.custom.CrystalOre;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final Block CRYSTAL_ORE = new CrystalOre(FabricBlockSettings.copyOf(Blocks.STONE));
    public static final Block ARCANE_WORKBENCH = new ArcaneWorkbench(FabricBlockSettings.copyOf(Blocks.CRAFTING_TABLE));

    public static void registerBlock(String name, Block block) {
        Registry.register(Registries.BLOCK, new Identifier(AuraPlexus.MOD_ID, name), block);
    }

    private static void registerBlocks() {
        registerBlock("crystal_ore", CRYSTAL_ORE);
        registerBlock("arcane_workbench", ARCANE_WORKBENCH);
    }

    public static void registerModBlocks() {
        AuraPlexus.LOGGER.info("Registering ModBlocks for " + AuraPlexus.MOD_ID);
        registerBlocks();
    }
}
