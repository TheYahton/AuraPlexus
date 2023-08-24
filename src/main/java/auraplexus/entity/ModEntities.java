package auraplexus.entity;

import auraplexus.AuraPlexus;
import auraplexus.block.ModBlocks;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModEntities {
    public static final BlockEntityType<ArcaneWorkbenchEntity> DEMO_BLOCK_ENTITY = Registry.register(
            Registries.BLOCK_ENTITY_TYPE,
            new Identifier(AuraPlexus.MOD_ID, "demo_block_entity"),
            FabricBlockEntityTypeBuilder.create(ArcaneWorkbenchEntity.ArcaneWorkbenchEntity, ModBlocks.ARCANE_WORKBENCH).build());
}
