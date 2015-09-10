package com.megathirio.shinsei.crafting;

import com.megathirio.shinsei.items.BooksMap;
import com.megathirio.shinsei.items.tools.ToolMap;
import com.megathirio.shinsei.ref.Names;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

import java.util.HashMap;

public class BookRecipes {

    public static HashMap<String, Item> bookMap = new BooksMap().getBookMap();
    public static void initRecipes(){
        GameRegistry.addShapelessRecipe(new ItemStack(bookMap.get(Names.books.AXE), 1), Items.book, Items.stick);
        GameRegistry.addShapelessRecipe(new ItemStack(bookMap.get(Names.books.CHISEL), 1), Items.book, Items.flint);
        GameRegistry.addShapelessRecipe(new ItemStack(bookMap.get(Names.books.HOE), 1), Items.book, Items.wheat_seeds);
        GameRegistry.addShapelessRecipe(new ItemStack(bookMap.get(Names.books.PICKAXE), 1), Items.book, Item.getItemFromBlock(Blocks.cobblestone));
        GameRegistry.addShapelessRecipe(new ItemStack(bookMap.get(Names.books.SHOVEL), 1), Items.book, Item.getItemFromBlock(Blocks.dirt));
        GameRegistry.addShapelessRecipe(new ItemStack(bookMap.get(Names.books.SWORD), 1), Items.book, Items.rotten_flesh);
        GameRegistry.addShapelessRecipe(new ItemStack(bookMap.get(Names.books.SHINSEI), 1), Items.book);
    }
}