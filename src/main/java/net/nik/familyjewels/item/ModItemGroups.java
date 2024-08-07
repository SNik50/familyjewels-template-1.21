package net.nik.familyjewels.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.nik.familyjewels.FamilyJewels;

public class ModItemGroups {
    public static final ItemGroup FLUORITE_GROUP = Registry.register(Registries.ITEM_GROUP, Identifier.of
            (FamilyJewels.MOD_ID, "fluorite"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.fluorite")).icon( ()-> new
                    ItemStack(ModItems.FLUORITE)).entries((displayContext, entries) -> {
                        entries.add(ModItems.FLUORITE);
                        entries.add(ModItems.RAW_FLUORITE);
            }).build());

    public static void registerItemGroups(){
        FamilyJewels.LOGGER.info("Registering item groups for " + FamilyJewels.MOD_ID);
    }
}
