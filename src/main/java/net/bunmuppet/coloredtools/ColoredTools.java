package net.bunmuppet.coloredtools;

import net.bunmuppet.coloredtools.item.Moditems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ColoredTools implements ModInitializer {
	public static final String MOD_ID = "colored-tools";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		Moditems.registerModItems();
	}
}