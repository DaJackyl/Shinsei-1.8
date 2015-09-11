package com.megathirio.shinsei.crafting;

import com.megathirio.shinsei.blocks.MetalBlocks;
import com.megathirio.shinsei.blocks.MetalMap;
import com.megathirio.shinsei.items.Books;
import com.megathirio.shinsei.items.BooksMap;
import com.megathirio.shinsei.items.MetalItems;
import com.megathirio.shinsei.items.tools.ToolMap;
import com.megathirio.shinsei.items.tools.Tools;
import com.megathirio.shinsei.ref.Names;
import net.minecraft.block.Block;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;

import java.util.HashMap;
import java.util.Map;

public class ToolRecipes {

    public static HashMap<String, Item> toolMap = new ToolMap().getToolMap();
    public static HashMap<String, String[]> toolSets = new ToolMap().getToolSets();

    public static void initRecipes(){
        GameRegistry.addShapelessRecipe(new ItemStack(toolMap.get(Names.tools.WOOD_HANDLE), 1), Items.stick, Items.stick);
        GameRegistry.addShapelessRecipe(new ItemStack(toolMap.get(Names.tools.BONE_AXE), 1), Items.bone, toolMap.get(Names.tools.WOOD_HANDLE));
        GameRegistry.addShapelessRecipe(new ItemStack(toolMap.get(Names.tools.FLINT_AXE), 1), Items.flint, toolMap.get(Names.tools.WOOD_HANDLE));
        GameRegistry.addShapelessRecipe(new ItemStack(toolMap.get(Names.tools.IRON_HAMMER), 1), Items.iron_ingot, toolMap.get(Names.tools.WOOD_HANDLE));

        GameRegistry.addShapelessRecipe(new ItemStack(Items.iron_axe, 1), new ItemStack(Tools.getItem(Names.tools.IRON_HAMMER), 1, OreDictionary.WILDCARD_VALUE), Books.getItem(Names.books.AXE), Items.iron_ingot, Tools.getItem(Names.tools.WOOD_HANDLE));
        GameRegistry.addShapelessRecipe(new ItemStack(Items.iron_hoe, 1), new ItemStack(Tools.getItem(Names.tools.IRON_HAMMER), 1, OreDictionary.WILDCARD_VALUE), Books.getItem(Names.books.HOE), Items.iron_ingot, Tools.getItem(Names.tools.WOOD_HANDLE));
        GameRegistry.addShapelessRecipe(new ItemStack(Items.iron_pickaxe, 1), new ItemStack(Tools.getItem(Names.tools.IRON_HAMMER), 1, OreDictionary.WILDCARD_VALUE), Books.getItem(Names.books.PICKAXE), Items.iron_ingot, Tools.getItem(Names.tools.WOOD_HANDLE));
        GameRegistry.addShapelessRecipe(new ItemStack(Items.iron_shovel, 1), new ItemStack(Tools.getItem(Names.tools.IRON_HAMMER), 1, OreDictionary.WILDCARD_VALUE), Books.getItem(Names.books.SHOVEL), Items.iron_ingot, Tools.getItem(Names.tools.WOOD_HANDLE));
        GameRegistry.addShapelessRecipe(new ItemStack(Items.iron_sword, 1), new ItemStack(Tools.getItem(Names.tools.IRON_HAMMER), 1, OreDictionary.WILDCARD_VALUE), Books.getItem(Names.books.SWORD), Items.iron_ingot, Tools.getItem(Names.tools.WOOD_HANDLE));

        for (Map.Entry<String, String[]> mapEntry : toolSets.entrySet()) {
            ItemStack tool = new ItemStack(Tools.getItem(mapEntry.getKey()), 1);
            ItemStack workTool = new ItemStack(Tools.getItem(mapEntry.getValue()[0]), 1, OreDictionary.WILDCARD_VALUE);
            Item book = Books.getItem(mapEntry.getValue()[1]);
            Item material = MetalItems.getItem(mapEntry.getValue()[2]);
            Item handle = Tools.getItem(mapEntry.getValue()[3]);

            GameRegistry.addShapelessRecipe(tool, workTool, book, material, handle);
        }
    }
}