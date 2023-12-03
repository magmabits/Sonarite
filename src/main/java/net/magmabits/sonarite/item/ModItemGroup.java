package net.magmabits.sonarite.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.magmabits.sonarite.Sonarite;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup SONARITE = FabricItemGroupBuilder.build(new Identifier(Sonarite.MOD_ID, "sonarite"), () -> new ItemStack(ModItems.SONARITE_INGOT));
}
