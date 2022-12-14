package net.coderang.tutorialmod.block;

import net.coderang.tutorialmod.TutorialMod;
import net.coderang.tutorialmod.block.custom.SpeedyBlock;
import net.coderang.tutorialmod.item.ModItemGroup;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.block.TurtleEggBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.lwjgl.system.CallbackI;

public class ModBlocks {
    public static final Block MYTHRIL_BLOCK = registerBlock("mythril_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(6f).requiresTool()), ModItemGroup.MYTHRIL);

    public static final Block NETHERRACK_MYTHRIL_BLOCK = registerBlock("netherrack_mythril_block",
            new Block(FabricBlockSettings.of(Material.STONE).strength(6f).requiresTool()), ModItemGroup.MYTHRIL);

    public static final Block MYTHRIL_ORE = registerBlock("mythril_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(6f).requiresTool()), ModItemGroup.MYTHRIL);
    public static final Block SPEEDY_BLOCK = registerBlock("speedy_block",
            new SpeedyBlock(FabricBlockSettings.of(Material.STONE).strength(6f)), ItemGroup.REDSTONE);

    private static Block registerBlock(String name, Block block, ItemGroup group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registry.BLOCK, new Identifier(TutorialMod.MOD_ID, name), block);
    }

    public static Item registerBlockItem(String name, Block block, ItemGroup group) {
        return Registry.register(Registry.ITEM, new Identifier(TutorialMod.MOD_ID, name), new BlockItem(block, new FabricItemSettings().group(group)));
    }
    public static void registerModBlocks () {
        TutorialMod.LOGGER.info("Registering ModBlocks for " + TutorialMod.MOD_ID);
    }
}
