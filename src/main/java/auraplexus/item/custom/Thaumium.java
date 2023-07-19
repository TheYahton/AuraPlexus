package auraplexus.item.custom;

import auraplexus.materials.ThaumiumArmorMaterial;
import auraplexus.materials.ThaumiumToolMaterial;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.*;

public class Thaumium {
    public static final Item INGOT_THAUMIUM = new Item(new FabricItemSettings());
    public static final ArmorMaterial THAUMIUM_ARMOR_MATERIAL = new ThaumiumArmorMaterial();
//    public static final Item THAUMIUM_MATERIAL = new CustomMaterialItem(new Item.Settings());

    public static final Item THAUMIUM_HELMET = new ArmorItem(THAUMIUM_ARMOR_MATERIAL, ArmorItem.Type.HELMET ,new Item.Settings());
    public static final Item THAUMIUM_CHESTPLATE = new ArmorItem(THAUMIUM_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE, new Item.Settings());
    public static final Item THAUMIUM_LEGGINGS = new ArmorItem(THAUMIUM_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS, new Item.Settings());
    public static final Item THAUMIUM_BOOTS = new ArmorItem(THAUMIUM_ARMOR_MATERIAL, ArmorItem.Type.BOOTS, new Item.Settings());


    public static final Item THAUMIUM_SWORD = new SwordItem(ThaumiumToolMaterial.INSTANCE, 3, -2.4F, new Item.Settings());
    public static final Item THAUMIUM_PICKAXE = new PickaxeItem(ThaumiumToolMaterial.INSTANCE, 3, -2.4F, new Item.Settings());
    public static final Item THAUMIUM_AXE = new AxeItem(ThaumiumToolMaterial.INSTANCE, 3, -2.4F, new Item.Settings());
    public static final Item THAUMIUM_SHOVEL = new ShovelItem(ThaumiumToolMaterial.INSTANCE, 3, -2.4F, new Item.Settings());
    public static final Item THAUMIUM_HOE = new HoeItem(ThaumiumToolMaterial.INSTANCE, 3, -2.4F, new Item.Settings());
}
