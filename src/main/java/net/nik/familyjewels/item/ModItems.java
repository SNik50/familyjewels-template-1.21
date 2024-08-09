package net.nik.familyjewels.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroups;
import net.nik.familyjewels.FamilyJewels;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.nik.familyjewels.block.custom.MagicBlock;
import net.nik.familyjewels.item.custom.BevandaAnalcolica;
import net.nik.familyjewels.item.custom.ChainsawItem;

import static net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents.*;

public class ModItems {

    public static final Item EXAMPLE_ITEM = registerItem("example_item", new Item(new Item.Settings()));
    public static final Item FLUORITE = registerItem("fluorite", new Item(new Item.Settings()));
    public static final Item RAW_FLUORITE = registerItem("raw_fluorite", new Item(new Item.Settings()));
    public static final Item CHAINSAW = registerItem("chainsaw", new ChainsawItem(new Item.Settings().maxDamage(32)));
    public static final Item STRAWBERRY = registerItem("strawberry", new Item(new Item.Settings().food(ModFoodComponent.STRAWBERRY)));
    public static final Item BEVANDA_ANALCOLICA =registerItem("bevanda_analcolica", new BevandaAnalcolica(new Item.Settings()));


    private static void customIngredients(FabricItemGroupEntries entries){
        entries.add(FLUORITE);
        entries.add(EXAMPLE_ITEM);
        entries.add(RAW_FLUORITE);

    }

     private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(FamilyJewels.MOD_ID, name), item);
     }

     public static void registerModItems() {
                FamilyJewels.LOGGER.info("registering mod items for " + FamilyJewels.MOD_ID);
         ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::customIngredients);
             }


}
