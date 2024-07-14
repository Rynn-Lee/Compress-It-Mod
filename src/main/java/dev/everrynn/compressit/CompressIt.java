package dev.everrynn.compressit;

import dev.everrynn.compressit.item.ModItemGroups;
import dev.everrynn.compressit.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CompressIt implements ModInitializer {
	public static final String MOD_ID = "compressit";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
	}
}