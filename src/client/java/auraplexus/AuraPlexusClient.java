package auraplexus;

import auraplexus.block.ModBlocks;
import auraplexus.block.custom.Crucible;
import auraplexus.block.custom.OreCrystal;
import auraplexus.item.ModItems;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;

import static auraplexus.item.custom.Aspects.getAspectColor;

public class AuraPlexusClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ColorProviderRegistry.ITEM.register((stack, tintIndex)
                -> getAspectColor(stack.getOrCreateNbt().getInt("aspect")),
                ModItems.CRYSTAL_ESSENCE); // set crystal_essence color by nbt

        ColorProviderRegistry.ITEM.register((stack, tintIndex)
                -> getAspectColor(stack.getOrCreateNbt().getInt("aspect")),
                ModItems.CRYSTAL_PLANTER); // set crystal_planter color by nbt

        ColorProviderRegistry.BLOCK.register((state, view, pos, tintIndex)
                -> getAspectColor(state.get(OreCrystal.ASPECT)),
                ModBlocks.ORE_CRYSTAL); // set crystal_ore color by BlockState

        ColorProviderRegistry.BLOCK.register((state, view, pos, tintIndex)
                        -> {
//        return state.get(Crucible.WATERED) ? 1 : 0xFFFFFF;
            return 0x0000AA;
        },
                ModBlocks.CRUCIBLE); // set crucible color by BlockState
    }
}
