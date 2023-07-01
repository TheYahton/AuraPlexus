package auraplexus;

import auraplexus.block.ModBlocks;
import auraplexus.block.custom.CrystalOre;
import auraplexus.item.ModItems;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;

import static auraplexus.item.custom.Aspects.getAspectColor;
import static auraplexus.item.custom.Aspects.intAspectColor;

public class AuraPlexusClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ColorProviderRegistry.ITEM.register((stack, tintIndex)
                -> getAspectColor(stack.getOrCreateNbt().getString("aspect")),
                ModItems.CRYSTAL_ESSENCE);

        ColorProviderRegistry.ITEM.register((stack, tintIndex)
                -> getAspectColor(intAspectColor.get(stack.getOrCreateNbt().getInt("aspect"))),
                ModItems.CRYSTAL_PLANTER);

        ColorProviderRegistry.BLOCK.register((state, view, pos, tintIndex)
                -> getAspectColor(intAspectColor.get(state.get(CrystalOre.ASPECT))),
                ModBlocks.CRYSTAL_ORE);
    }
}
