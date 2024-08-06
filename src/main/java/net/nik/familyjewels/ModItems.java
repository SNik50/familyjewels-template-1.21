package net.nik.familyjewels;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item EXAMPLE_ITEM = registerItem("example_item", new Item(new Item.Settings()));

    private static void addItemsToIngredientTabItemGroup(FabricItemGroupEntries entries){
        entries.add(EXAMPLE_ITEM);
    }
     private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(FamilyJewels.MOD_ID, name), item);
     }

     public static void registerModItems() {
                FamilyJewels.LOGGER.info("registering mod items for " + FamilyJewels.MOD_ID);
            }

}
