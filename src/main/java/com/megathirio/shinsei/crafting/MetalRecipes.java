package com.megathirio.shinsei.crafting;

import com.megathirio.shinsei.blocks.MetalBlocks;
import com.megathirio.shinsei.blocks.MetalMap;
import com.megathirio.shinsei.blocks.MineralBlocks;
import com.megathirio.shinsei.items.Books;
import com.megathirio.shinsei.items.BooksMap;
import com.megathirio.shinsei.items.MetalItems;
import com.megathirio.shinsei.items.MineralItems;
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

public class MetalRecipes {

    public static HashMap<Block[], Item[]> metalSets = new MetalMap().getMetalSets();

    public static void initRecipes(){
        for (Map.Entry<Block[], Item[]> mapEntry : metalSets.entrySet()) {
            Block ore = mapEntry.getKey()[0];
            Block block = mapEntry.getKey()[1];
            Item ingot = mapEntry.getValue()[0];
            Item nugget = mapEntry.getValue()[1];
            Item dust = mapEntry.getValue()[2];

            GameRegistry.addShapedRecipe(new ItemStack(block, 1), "!!!", "!!!", "!!!", '!', ingot);
            GameRegistry.addShapedRecipe(new ItemStack(ingot, 1), "!!!", "!!!", "!!!", '!', nugget);
            GameRegistry.addShapelessRecipe(new ItemStack(ingot, 9), block);
            GameRegistry.addShapelessRecipe(new ItemStack(nugget, 9), ingot);
            GameRegistry.addSmelting(ore, new ItemStack(ingot, 1), .5f);
            GameRegistry.addSmelting(dust, new ItemStack(ingot, 1), .5f);
        }
        GameRegistry.addSmelting(MetalBlocks.getBlock(Names.ores.REALGAR), new ItemStack(MetalItems.getItem(Names.dusts.ARSENIC), 3), .5f);
        GameRegistry.addSmelting(MineralBlocks.getBlock(Names.ores.DOLOMITE), new ItemStack(MineralItems.getItem(Names.dusts.DOLOMITE), 1), .5f);
        GameRegistry.addSmelting(MineralBlocks.getBlock(Names.ores.LIMESTONE), new ItemStack(MineralItems.getItem(Names.dusts.QUICKLIME), 2), .5f);
        GameRegistry.addSmelting(MineralBlocks.getBlock(Names.ores.CHALK), new ItemStack(MineralItems.getItem(Names.dusts.QUICKLIME), 2), .5f);
        GameRegistry.addSmelting(MineralItems.getItem(Names.dusts.CHALK), new ItemStack(MineralItems.getItem(Names.dusts.QUICKLIME), 1), .5f);
    }
}