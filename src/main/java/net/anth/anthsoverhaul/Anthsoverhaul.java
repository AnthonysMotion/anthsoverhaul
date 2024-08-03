package net.anth.anthsoverhaul;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Anthsoverhaul implements ModInitializer {
	public static final String MOD_ID = "anthsoverhaul";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
	// base ver

	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric world!");
	}
}