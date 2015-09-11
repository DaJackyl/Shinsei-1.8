package com.megathirio.shinsei.crafting;

public class RecipeManager {
    public static void initRecipes() {
        RemoveRecipes.initRecipes();
        BaseRecipes.initRecipes();
        BookRecipes.initRecipes();
        FoodRecipes.initRecipes();
        MetalRecipes.initRecipes();
        ToolRecipes.initRecipes();
    }
}
