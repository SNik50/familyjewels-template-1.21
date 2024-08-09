package net.nik.familyjewels.util;

import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.nik.familyjewels.FamilyJewels;
import net.nik.familyjewels.item.ModItems;

public class ModFuels {

    public static void registerFuels(){
        FuelRegistry.INSTANCE. add(ModItems.STARLIGHT_ASHES, 600);

        FamilyJewels.LOGGER.info("Registered mod fuels for " + FamilyJewels.MOD_ID);
    }
}
