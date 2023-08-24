package auraplexus.recipe;

import auraplexus.AuraPlexus;
import auraplexus.test.TestRecipe;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModRecipes {
    public static void registerRecipes() {
        Registry.register(Registries.RECIPE_SERIALIZER, new Identifier(AuraPlexus.MOD_ID, TestRecipe.Serializer.ID),
                TestRecipe.Serializer.INSTANCE);
        Registry.register(Registries.RECIPE_TYPE, new Identifier(AuraPlexus.MOD_ID, TestRecipe.Type.ID),
                TestRecipe.Type.INSTANCE);
    }
}
