package net.abanoub.litevanillaextras;

import net.abanoub.litevanillaextras.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LiteVanillaExtras implements ModInitializer {
	public static final String MOD_ID = "litevanillaextras";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
	}
}