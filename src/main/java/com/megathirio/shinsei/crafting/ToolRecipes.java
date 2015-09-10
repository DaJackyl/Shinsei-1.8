package com.megathirio.shinsei.crafting;

import com.megathirio.shinsei.blocks.BaseMetal;
import com.megathirio.shinsei.blocks.MetalBlocks;
import com.megathirio.shinsei.blocks.MetalMap;
import com.megathirio.shinsei.items.BooksMap;
import com.megathirio.shinsei.items.MetalItems;
import com.megathirio.shinsei.items.tools.ToolMap;
import com.megathirio.shinsei.ref.Names;
import net.minecraft.block.Block;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;

import java.util.HashMap;
import java.util.Set;

public class ToolRecipes {

    public static HashMap<String, Item> toolMap = new ToolMap().getToolMap();
    public static HashMap<String, Item> bookMap = new BooksMap().getBookMap();
    public static HashMap<String, Item> metalItemMap = new MetalMap().getMetalItemMap();
    public static void initRecipes(){
        GameRegistry.addShapelessRecipe(new ItemStack(toolMap.get(Names.tools.WOOD_HANDLE), 1), Items.stick, Items.stick);
        GameRegistry.addShapelessRecipe(new ItemStack(toolMap.get(Names.tools.BONE_AXE), 1), Items.bone, toolMap.get(Names.tools.WOOD_HANDLE));
        GameRegistry.addShapelessRecipe(new ItemStack(toolMap.get(Names.tools.FLINT_AXE), 1), Items.flint, toolMap.get(Names.tools.WOOD_HANDLE));
/*
        GameRegistry.addShapelessRecipe(new ItemStack(toolMap.get(Names.tools.BRASS_PICK), 1), toolMap.get(Names.tools.WOOD_HANDLE), metalItemMap.get(Names.ingots.COPPER), bookMap.get(Names.books.PICKAXE));
        GameRegistry.addShapelessRecipe(new ItemStack(toolMap.get(Names.tools.BRONZE_PICK), 1), toolMap.get(Names.tools.WOOD_HANDLE), metalItemMap.get(Names.ingots.COPPER), bookMap.get(Names.books.PICKAXE));
*/
        GameRegistry.addShapelessRecipe(new ItemStack(toolMap.get(Names.tools.COPPER_AXE), 1), toolMap.get(Names.tools.WOOD_HANDLE), metalItemMap.get(Names.ingots.COPPER), bookMap.get(Names.books.AXE));
        GameRegistry.addShapelessRecipe(new ItemStack(Items.iron_axe, 1), toolMap.get(Names.tools.WOOD_HANDLE), Items.iron_ingot, bookMap.get(Names.books.AXE));
/*
        GameRegistry.addShapelessRecipe(new ItemStack(toolMap.get(Names.tools.COPPER_CHISEL), 1), toolMap.get(Names.tools.WOOD_HANDLE), metalItemMap.get(Names.ingots.COPPER), bookMap.get(Names.books.PICKAXE));
        GameRegistry.addShapelessRecipe(new ItemStack(toolMap.get(Names.tools.IRON_CHISEL), 1), toolMap.get(Names.tools.WOOD_HANDLE), Items.iron_ingot, bookMap.get(Names.books.PICKAXE));
*/
        GameRegistry.addShapelessRecipe(new ItemStack(toolMap.get(Names.tools.COPPER_HOE), 1), toolMap.get(Names.tools.WOOD_HANDLE), metalItemMap.get(Names.ingots.COPPER), bookMap.get(Names.books.HOE));
        GameRegistry.addShapelessRecipe(new ItemStack(Items.iron_hoe, 1), toolMap.get(Names.tools.WOOD_HANDLE), Items.iron_ingot, bookMap.get(Names.books.HOE));
        GameRegistry.addShapelessRecipe(new ItemStack(toolMap.get(Names.tools.COPPER_PICK), 1), toolMap.get(Names.tools.WOOD_HANDLE), metalItemMap.get(Names.ingots.COPPER), bookMap.get(Names.books.PICKAXE));
        GameRegistry.addShapelessRecipe(new ItemStack(Items.iron_pickaxe, 1), toolMap.get(Names.tools.WOOD_HANDLE), Items.iron_ingot, bookMap.get(Names.books.PICKAXE));
        GameRegistry.addShapelessRecipe(new ItemStack(toolMap.get(Names.tools.COPPER_SHOVEL), 1), toolMap.get(Names.tools.WOOD_HANDLE), metalItemMap.get(Names.ingots.COPPER), bookMap.get(Names.books.SHOVEL));
        GameRegistry.addShapelessRecipe(new ItemStack(Items.iron_shovel, 1), toolMap.get(Names.tools.WOOD_HANDLE), Items.iron_ingot, bookMap.get(Names.books.SHOVEL));
        GameRegistry.addShapelessRecipe(new ItemStack(toolMap.get(Names.tools.COPPER_SWORD), 1), toolMap.get(Names.tools.WOOD_HANDLE), metalItemMap.get(Names.ingots.COPPER), bookMap.get(Names.books.SWORD));
        GameRegistry.addShapelessRecipe(new ItemStack(Items.iron_sword, 1), toolMap.get(Names.tools.WOOD_HANDLE), Items.iron_ingot, bookMap.get(Names.books.SWORD));
/*
        GameRegistry.addShapelessRecipe(new ItemStack(toolMap.get(Names.tools.SILVER_PICK), 1), toolMap.get(Names.tools.WOOD_HANDLE), metalItemMap.get(Names.ingots.COPPER), bookMap.get(Names.books.PICKAXE));
        GameRegistry.addShapelessRecipe(new ItemStack(toolMap.get(Names.tools.STAINLESS_STEEL_PICK), 1), toolMap.get(Names.tools.WOOD_HANDLE), metalItemMap.get(Names.ingots.COPPER), bookMap.get(Names.books.PICKAXE));
        GameRegistry.addShapelessRecipe(new ItemStack(toolMap.get(Names.tools.STEEL_PICK), 1), toolMap.get(Names.tools.WOOD_HANDLE), metalItemMap.get(Names.ingots.COPPER), bookMap.get(Names.books.PICKAXE));
        GameRegistry.addShapelessRecipe(new ItemStack(toolMap.get(Names.tools.TITANIUM_PICK), 1), toolMap.get(Names.tools.WOOD_HANDLE), metalItemMap.get(Names.ingots.COPPER), bookMap.get(Names.books.PICKAXE));
*/
        GameRegistry.addSmelting(MetalBlocks.getBlock(Names.ores.CHALCOPYRITE), new ItemStack(metalItemMap.get(Names.ingots.COPPER), 1), .5f);
        GameRegistry.addSmelting(MetalBlocks.getBlock(Names.ores.BORNITE), new ItemStack(metalItemMap.get(Names.ingots.COPPER), 1), .5f);
        GameRegistry.addSmelting(MetalBlocks.getBlock(Names.ores.HEMATITE), new ItemStack(Items.iron_ingot, 1), .5f);
        GameRegistry.addSmelting(MetalBlocks.getBlock(Names.ores.REALGAR), new ItemStack(MetalItems.getItem(Names.dusts.ARSENIC), 3), .5f);
    }
}