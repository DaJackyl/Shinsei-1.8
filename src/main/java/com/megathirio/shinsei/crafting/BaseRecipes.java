package com.megathirio.shinsei.crafting;

import com.megathirio.shinsei.items.Foods;
import com.megathirio.shinsei.items.MetalItems;
import com.megathirio.shinsei.items.MineralItems;
import com.megathirio.shinsei.ref.Names;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class BaseRecipes {
    public static void initRecipes() {
        GameRegistry.addShapelessRecipe(new ItemStack(Items.flint, 1), Item.getItemFromBlock(Blocks.gravel), Item.getItemFromBlock(Blocks.gravel));
/*
        GameRegistry.addShapedRecipe(new ItemStack(Foods.getItem(Names.foods.CURED_BEEF), 1), "!!!", "!@!", "!!!", '!', MineralItems.getItem(Names.dusts.SALT), '@', Items.beef);
        GameRegistry.addShapedRecipe(new ItemStack(Foods.getItem(Names.foods.CURED_PORK), 1), "!!!", "!@!", "!!!", '!', MineralItems.getItem(Names.dusts.SALT), '@', Items.porkchop);
        GameRegistry.addShapelessRecipe(new ItemStack(Foods.getItem(Names.foods.POISON_APPLE), 1), MetalItems.getItem(Names.dusts.ARSENIC), Items.apple);
        GameRegistry.addShapelessRecipe(new ItemStack(Foods.getItem(Names.foods.POISON_BEEF), 1), MetalItems.getItem(Names.dusts.ARSENIC), Items.cooked_beef);
        GameRegistry.addShapelessRecipe(new ItemStack(Foods.getItem(Names.foods.POISON_BREAD), 1), MetalItems.getItem(Names.dusts.ARSENIC), Items.bread);
        GameRegistry.addShapelessRecipe(new ItemStack(Foods.getItem(Names.foods.POISON_CARROT), 1), MetalItems.getItem(Names.dusts.ARSENIC), Items.carrot);
        GameRegistry.addShapelessRecipe(new ItemStack(Foods.getItem(Names.foods.POISON_CHICKEN), 1), MetalItems.getItem(Names.dusts.ARSENIC), Items.cooked_chicken);
        GameRegistry.addShapelessRecipe(new ItemStack(Foods.getItem(Names.foods.POISON_COD), 1), MetalItems.getItem(Names.dusts.ARSENIC), Items.cooked_fish);
        GameRegistry.addShapelessRecipe(new ItemStack(Foods.getItem(Names.foods.POISON_COOKIE), 1), MetalItems.getItem(Names.dusts.ARSENIC), Items.cookie);
        GameRegistry.addShapelessRecipe(new ItemStack(Foods.getItem(Names.foods.POISON_MELON), 1), MetalItems.getItem(Names.dusts.ARSENIC), Items.melon);
        GameRegistry.addShapelessRecipe(new ItemStack(Foods.getItem(Names.foods.POISON_MILK), 1), MetalItems.getItem(Names.dusts.ARSENIC), Items.milk_bucket);
        GameRegistry.addShapelessRecipe(new ItemStack(Foods.getItem(Names.foods.POISON_MUTTON), 1), MetalItems.getItem(Names.dusts.ARSENIC), Items.cooked_mutton);
        GameRegistry.addShapelessRecipe(new ItemStack(Foods.getItem(Names.foods.POISON_PIE), 1), MetalItems.getItem(Names.dusts.ARSENIC), Items.pumpkin_pie);
        GameRegistry.addShapelessRecipe(new ItemStack(Foods.getItem(Names.foods.POISON_PORK), 1), MetalItems.getItem(Names.dusts.ARSENIC), Items.cooked_porkchop);
        GameRegistry.addShapelessRecipe(new ItemStack(Foods.getItem(Names.foods.POISON_RABBIT), 1), MetalItems.getItem(Names.dusts.ARSENIC), Items.cooked_rabbit);
        GameRegistry.addShapelessRecipe(new ItemStack(Foods.getItem(Names.foods.POISON_RABBIT_STEW), 1), MetalItems.getItem(Names.dusts.ARSENIC), Items.rabbit_stew);
*/
    }
}