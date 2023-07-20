package auraplexus.block;

import auraplexus.AuraPlexus;
import auraplexus.block.custom.ArcaneWorkbench;
import auraplexus.block.custom.Crucible;
import auraplexus.block.custom.OreCrystal;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final Block ORE_CRYSTAL = new OreCrystal();
    public static final Block ARCANE_WORKBENCH = new ArcaneWorkbench();
    public static final Block ORE_AMBER = new Block(FabricBlockSettings.copyOf(Blocks.COAL_ORE));
    public static final Block ORE_CINNABAR = new Block(FabricBlockSettings.copyOf(Blocks.COAL_ORE));
    public static final Block ORE_QUARTZ = new Block(FabricBlockSettings.copyOf(Blocks.COAL_ORE));
    public static final Block CRUCIBLE = new Crucible();



    public static void registerBlock(String name, Block block) {
        Registry.register(Registries.BLOCK, new Identifier(AuraPlexus.MOD_ID, name), block);
    }

    private static void registerBlocks() {
        registerBlock("ore_crystal", ORE_CRYSTAL);
        registerBlock("arcane_workbench", ARCANE_WORKBENCH);
        registerBlock("ore_amber", ORE_AMBER);
        registerBlock("ore_cinnabar", ORE_CINNABAR);
        registerBlock("ore_quartz", ORE_QUARTZ);
        registerBlock("crucible", CRUCIBLE);
    }

    public static void registerModBlocks() {
        AuraPlexus.LOGGER.info("Registering ModBlocks for " + AuraPlexus.MOD_ID);
        registerBlocks();
    }
}
