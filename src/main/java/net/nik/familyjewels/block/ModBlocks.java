package net.nik.familyjewels.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.nik.familyjewels.FamilyJewels;



public class ModBlocks {


    public static final Block FLUORITE_BLOCK = registerBlock("fluorite_block",
        new Block(AbstractBlock.Settings.create().sounds(BlockSoundGroup.AMETHYST_BLOCK)
                .strength(4f).requiresTool()));

    public static final Block FLUORITE_ORE = registerBlock("fluorite_ore",
        new ExperienceDroppingBlock(UniformIntProvider.create(2, 4),
                AbstractBlock.Settings.create().sounds(BlockSoundGroup.AMETHYST_BLOCK)
                .strength(4f).requiresTool()));

public static final Block FLUORITE_DEEPSLATE_ORE = registerBlock("fluorite_deepslate_ore",
        new ExperienceDroppingBlock(UniformIntProvider.create(2, 4),
                AbstractBlock.Settings.create().sounds(BlockSoundGroup.AMETHYST_BLOCK)
                .strength(4f).requiresTool()));

public static final Block FLUORITE_NETHER_ORE = registerBlock("fluorite_nether_ore",
        new ExperienceDroppingBlock(UniformIntProvider.create(2, 4),
                AbstractBlock.Settings.create().sounds(BlockSoundGroup.AMETHYST_BLOCK)
                .strength(4f).requiresTool()));

public static final Block FLUORITE_END_ORE = registerBlock("fluorite_end_ore",
        new ExperienceDroppingBlock(UniformIntProvider.create(2, 4),
                AbstractBlock.Settings.create().sounds(BlockSoundGroup.AMETHYST_BLOCK)
                .strength(4f).requiresTool()));


    public static void registerModBlocks() {
        FamilyJewels.LOGGER.info("Registering blocks for " + FamilyJewels.MOD_ID);
    }
    private static Block registerBlock(String name, Block block){
        RegisterBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(FamilyJewels.MOD_ID, name), block);
    }

    private static void RegisterBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(FamilyJewels.MOD_ID,  name),
                new BlockItem(block, new Item.Settings()));
    }




}
