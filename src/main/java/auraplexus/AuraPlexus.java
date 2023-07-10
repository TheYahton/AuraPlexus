package auraplexus;

import auraplexus.block.ModBlocks;
import auraplexus.item.ModItemGroup;
import auraplexus.item.ModItems;
import auraplexus.recipe.ModRecipes;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AuraPlexus implements ModInitializer {
    public static final String MOD_ID = "auraplexus";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        ModItemGroup.registerItemGroups();
        ModItems.registerModItems();
        ModBlocks.registerModBlocks();
        ModRecipes.registerRecipes();
    }
}
