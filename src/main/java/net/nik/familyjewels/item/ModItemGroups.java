package net.nik.familyjewels.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.nik.familyjewels.FamilyJewels;
import net.nik.familyjewels.block.ModBlocks;

public class ModItemGroups {
    public static final ItemGroup FLUORITE_GROUP = Registry.register(Registries.ITEM_GROUP, Identifier.of
            (FamilyJewels.MOD_ID, "fluorite"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.fluorite")).icon( ()-> new
                    ItemStack(ModItems.FLUORITE)).entries((displayContext, entries) -> {
                        entries.add(ModItems.FLUORITE);
                        entries.add(ModItems.RAW_FLUORITE);
                        entries.add(ModItems.CHAINSAW);

            }).build());

    public static final ItemGroup FLUORITE_BLOCK_GROUP = Registry.register(Registries.ITEM_GROUP, Identifier.of
                    (FamilyJewels.MOD_ID, "fluorite_blocks"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.fluorite_blocks")).icon( ()-> new
                    ItemStack(ModBlocks.FLUORITE_BLOCK)).entries((displayContext, entries) -> {
                        entries.add(ModBlocks.FLUORITE_BLOCK);
                        entries.add(ModBlocks.FLUORITE_ORE);
                        entries.add(ModBlocks.FLUORITE_DEEPSLATE_ORE);
                        entries.add(ModBlocks.FLUORITE_NETHER_ORE);
                        entries.add(ModBlocks.FLUORITE_END_ORE);
                        entries.add(ModBlocks.MAGIC_BLOCK);

            }).build());

    public static void registerItemGroups(){
        FamilyJewels.LOGGER.info("Registering item groups for " + FamilyJewels.MOD_ID);
    }
}
