package com.megathirio.shinsei.crafting;

import com.megathirio.shinsei.blocks.MetalBlocks;
import com.megathirio.shinsei.blocks.MetalMap;
import com.megathirio.shinsei.items.FoodMap;
import com.megathirio.shinsei.items.Foods;
import com.megathirio.shinsei.items.MetalItems;
import com.megathirio.shinsei.items.MineralItems;
import com.megathirio.shinsei.ref.Names;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

import java.util.HashMap;
import java.util.Map;

public class FoodRecipes {

    public static HashMap<String, Item> foodSets = new FoodMap().getFoodSets();
    public static HashMap<String, Item> poisonSets = new FoodMap().getPoisonSets();

    public static void initRecipes(){
        for (Map.Entry<String, Item> mapEntry : foodSets.entrySet()) {
            ItemStack name = new ItemStack(Foods.getItem(mapEntry.getKey()), 1);
            Item food = mapEntry.getValue();

            GameRegistry.addShapedRecipe(name, "!!!", "!@!", "!!!", '!', MineralItems.getItem(Names.dusts.SALT), '@', food);
        }

        for (Map.Entry<String, Item> mapEntry : poisonSets.entrySet()) {
            ItemStack name = new ItemStack(Foods.getItem(mapEntry.getKey()), 1);
            Item food = mapEntry.getValue();

            GameRegistry.addShapelessRecipe(name, MetalItems.getItem(Names.dusts.ARSENIC), food);
        }
    }
}