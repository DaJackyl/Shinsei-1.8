package com.megathirio.shinsei.crafting;

import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.item.crafting.IRecipe;

import java.util.Iterator;

public class RemoveRecipes {
    public static void initRecipes(){

        Iterator<IRecipe> iterator = CraftingManager.getInstance().getRecipeList().iterator();

        while (iterator.hasNext())
        {
            IRecipe recipe = iterator.next();
            if (recipe == null)
                continue;
            ItemStack output = recipe.getRecipeOutput();

            Item item[] = new Item[]{Items.wooden_axe, Items.wooden_hoe, Items.wooden_pickaxe, Items.wooden_shovel, Items.wooden_sword,
                    Items.stone_axe, Items.stone_hoe, Items.stone_pickaxe, Items.stone_shovel, Items.stone_sword,
                    Items.golden_axe, Items.golden_hoe, Items.golden_pickaxe, Items.golden_shovel, Items.golden_sword,
                    Items.diamond_axe, Items.diamond_hoe, Items.diamond_pickaxe, Items.diamond_shovel, Items.diamond_sword,
                    Items.iron_axe, Items.iron_hoe, Items.iron_pickaxe, Items.iron_shovel, Items.iron_sword};

            for(int i = 0; i < item.length; i++){
                if (output != null && output.getItem() == item[i]) {
                    iterator.remove();
                }
            }
        }
    }
}
