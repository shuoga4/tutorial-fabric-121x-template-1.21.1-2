package net.shuoga.tutorialfabric;

import net.fabricmc.api.ModInitializer;

import net.shuoga.tutorialfabric.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TutorialFabric121x implements ModInitializer {
	public static final String MOD_ID = "tutorialshuogamod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
	}
}