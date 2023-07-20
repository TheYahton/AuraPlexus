package auraplexus.item.custom;

import auraplexus.materials.MiraculumArmorMaterial;
import auraplexus.materials.MiraculumToolMaterial;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.*;

public class Miraculum {
    public static final Item MIRACULUM_INGOT = new Item(new FabricItemSettings());
    public static final ArmorMaterial MIRACULUM_ARMOR_MATERIAL_ARMOR_MATERIAL = new MiraculumArmorMaterial();
//    public static final Item THAUMIUM_MATERIAL = new CustomMaterialItem(new Item.Settings());

    public static final Item MIRACULUM_HELMET = new ArmorItem(MIRACULUM_ARMOR_MATERIAL_ARMOR_MATERIAL, ArmorItem.Type.HELMET ,new Item.Settings());
    public static final Item MIRACULUM_CHESTPLATE = new ArmorItem(MIRACULUM_ARMOR_MATERIAL_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE, new Item.Settings());
    public static final Item MIRACULUM_LEGGINGS = new ArmorItem(MIRACULUM_ARMOR_MATERIAL_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS, new Item.Settings());
    public static final Item MIRACULUM_BOOTS = new ArmorItem(MIRACULUM_ARMOR_MATERIAL_ARMOR_MATERIAL, ArmorItem.Type.BOOTS, new Item.Settings());


    public static final Item MIRACULUM_SWORD = new SwordItem(MiraculumToolMaterial.INSTANCE, 3, -2.4F, new Item.Settings());
    public static final Item MIRACULUM_PICKAXE = new PickaxeItem(MiraculumToolMaterial.INSTANCE, 3, -2.4F, new Item.Settings());
    public static final Item MIRACULUM_AXE = new AxeItem(MiraculumToolMaterial.INSTANCE, 3, -2.4F, new Item.Settings());
    public static final Item MIRACULUM_SHOVEL = new ShovelItem(MiraculumToolMaterial.INSTANCE, 3, -2.4F, new Item.Settings());
    public static final Item MIRACULUM_HOE = new HoeItem(MiraculumToolMaterial.INSTANCE, 3, -2.4F, new Item.Settings());
}
