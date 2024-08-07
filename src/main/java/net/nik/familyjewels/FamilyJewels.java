package net.nik.familyjewels;

import net.fabricmc.api.ModInitializer;

import net.nik.familyjewels.item.ModItemGroups;
import net.nik.familyjewels.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FamilyJewels implements ModInitializer {

	public static final String MOD_ID ="familyjewels" ;
    public static final Logger LOGGER = LoggerFactory.getLogger("familyjewels");

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModItemGroups.registerItemGroups();

		LOGGER.info("Gaze into the abyss");
	}


}
