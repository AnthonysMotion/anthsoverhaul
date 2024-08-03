package net.anth.anthsoverhaul;

import net.anth.anthsoverhaul.item.ModItemGroups;
import net.anth.anthsoverhaul.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AnthsOverhaul implements ModInitializer {
	public static final String MOD_ID = "anthsoverhaul";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric world!");

		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
	}
}