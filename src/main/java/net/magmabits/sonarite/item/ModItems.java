package net.magmabits.sonarite.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.magmabits.sonarite.Sonarite;
import net.magmabits.sonarite.item.custom.ModAxeItem;
import net.magmabits.sonarite.item.custom.ModHoeItem;
import net.magmabits.sonarite.item.custom.ModPickaxeItem;
import net.magmabits.sonarite.item.custom.ModSwordItem;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;

public class ModItems {

     public static final Item SONARITE_INGOT = registerItem("sonarite_ingot", new Item(new FabricItemSettings().group(ModItemGroup.SONARITE).rarity(Rarity.RARE).fireproof()));
     public static final Item SONARITE_SWORD = registerItem("sonarite_sword", new ModSwordItem(ModToolMaterial.SONARITE, 4, -2.4f, new FabricItemSettings().group(ModItemGroup.SONARITE).rarity(Rarity.EPIC).fireproof()));
     public static final Item SONARITE_PICKAXE = registerItem("sonarite_pickaxe", new ModPickaxeItem(ModToolMaterial.SONARITE, 2, -2.8f, new FabricItemSettings().group(ModItemGroup.SONARITE).rarity(Rarity.EPIC).fireproof()));
     public static final Item SONARITE_AXE = registerItem("sonarite_axe", new ModAxeItem(ModToolMaterial.SONARITE, 6, -2.9f, new FabricItemSettings().group(ModItemGroup.SONARITE).rarity(Rarity.EPIC).fireproof()));
     public static final Item SONARITE_SHOVEL = registerItem("sonarite_shovel", new ShovelItem(ModToolMaterial.SONARITE, 2.5f, -3f,new FabricItemSettings().group(ModItemGroup.SONARITE).rarity(Rarity.EPIC).fireproof()));
     public static final Item SONARITE_HOE = registerItem("sonarite_hoe", new ModHoeItem(ModToolMaterial.SONARITE, -3, 0f, new FabricItemSettings().group(ModItemGroup.SONARITE).rarity(Rarity.EPIC).fireproof()));

     public static final Item SONARITE_HELMET = registerItem("sonarite_helmet", new ArmorItem(ModArmorMaterial.SONARITE, EquipmentSlot.HEAD, new FabricItemSettings().group(ModItemGroup.SONARITE).rarity(Rarity.EPIC).fireproof()));
     public static final Item SONARITE_CHESTPLATE = registerItem("sonarite_chestplate", new ModArmorItem(ModArmorMaterial.SONARITE, EquipmentSlot.CHEST, new FabricItemSettings().group(ModItemGroup.SONARITE).rarity(Rarity.EPIC).fireproof()));
     public static final Item SONARITE_LEGGINGS = registerItem("sonarite_leggings", new ArmorItem(ModArmorMaterial.SONARITE, EquipmentSlot.LEGS, new FabricItemSettings().group(ModItemGroup.SONARITE).rarity(Rarity.EPIC).fireproof()));
     public static final Item SONARITE_BOOTS = registerItem("sonarite_boots", new ArmorItem(ModArmorMaterial.SONARITE, EquipmentSlot.FEET, new FabricItemSettings().group(ModItemGroup.SONARITE).rarity(Rarity.EPIC).fireproof()));

     public static void registerModItems() {
          Sonarite.LOGGER.debug("Registering mod items for" + Sonarite.MOD_ID);
     }

     private static Item registerItem(String name, Item item) {
          return Registry.register(Registry.ITEM, new Identifier(Sonarite.MOD_ID, name), item);
     }
}
