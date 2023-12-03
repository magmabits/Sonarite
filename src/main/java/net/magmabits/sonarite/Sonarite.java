package net.magmabits.sonarite;

import net.fabricmc.api.ModInitializer;
import net.magmabits.sonarite.block.ModBlocks;
import net.magmabits.sonarite.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Sonarite implements ModInitializer {
	public static final String MOD_ID = "sonarite";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}
