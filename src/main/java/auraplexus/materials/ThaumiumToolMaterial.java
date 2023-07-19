package auraplexus.materials;

import auraplexus.item.custom.Thaumium;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class ThaumiumToolMaterial implements ToolMaterial {

    public static final ThaumiumToolMaterial INSTANCE = new ThaumiumToolMaterial();

    @Override
    public int getDurability() {
        return 1000;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 7.0F;
    }

    @Override
    public float getAttackDamage() {
        return 3.0F;
    }

    @Override
    public int getMiningLevel() {
        return 3;
    }

    @Override
    public int getEnchantability() {
        return 15;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(Thaumium.INGOT_THAUMIUM);
    }
}
