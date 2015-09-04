package com.megathirio.shinsei.items;

import com.megathirio.shinsei.ref.Names;
import net.minecraft.item.Item;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;

import java.util.HashMap;

public class FoodMap {
    public static HashMap<String, Item> foodMap = new HashMap<String, Item>();

    public static void addFoods() {
        foodMap.put(Names.foods.POISON_APPLE, new BaseFood(Names.foods.POISON_APPLE, 4, 0.3f, true).addPotionEffect(new PotionEffect(Potion.poison.id, 1200, 1)));
        foodMap.put(Names.foods.POISON_BEEF, new BaseFood(Names.foods.POISON_BEEF, 4, 0.3f, true).addPotionEffect(new PotionEffect(Potion.poison.id, 1200, 1)));
        foodMap.put(Names.foods.POISON_BREAD, new BaseFood(Names.foods.POISON_BREAD, 4, 0.3f, true).addPotionEffect(new PotionEffect(Potion.poison.id, 1200, 1)));
        foodMap.put(Names.foods.POISON_CARROT, new BaseFood(Names.foods.POISON_CARROT, 4, 0.3f, true).addPotionEffect(new PotionEffect(Potion.poison.id, 1200, 1)));
        foodMap.put(Names.foods.POISON_CHICKEN, new BaseFood(Names.foods.POISON_CHICKEN, 4, 0.3f, true).addPotionEffect(new PotionEffect(Potion.poison.id, 1200, 1)));
        foodMap.put(Names.foods.POISON_COD, new BaseFood(Names.foods.POISON_COD, 4, 0.3f, true).addPotionEffect(new PotionEffect(Potion.poison.id, 1200, 1)));
        foodMap.put(Names.foods.POISON_COOKIE, new BaseFood(Names.foods.POISON_COOKIE, 4, 0.3f, true).addPotionEffect(new PotionEffect(Potion.poison.id, 1200, 1)));
        foodMap.put(Names.foods.POISON_MELON, new BaseFood(Names.foods.POISON_MELON, 4, 0.3f, true).addPotionEffect(new PotionEffect(Potion.poison.id, 1200, 1)));
        foodMap.put(Names.foods.POISON_MILK, new BaseFood(Names.foods.POISON_MILK, 4, 0.3f, true).addPotionEffect(new PotionEffect(Potion.poison.id, 1200, 1)));
        foodMap.put(Names.foods.POISON_MUTTON, new BaseFood(Names.foods.POISON_MUTTON, 4, 0.3f, true).addPotionEffect(new PotionEffect(Potion.poison.id, 1200, 1)));
        foodMap.put(Names.foods.POISON_PIE, new BaseFood(Names.foods.POISON_PIE, 4, 0.3f, true).addPotionEffect(new PotionEffect(Potion.poison.id, 1200, 1)));
        foodMap.put(Names.foods.POISON_PORK, new BaseFood(Names.foods.POISON_PORK, 4, 0.3f, true).addPotionEffect(new PotionEffect(Potion.poison.id, 1200, 1)));
        foodMap.put(Names.foods.POISON_RABBIT, new BaseFood(Names.foods.POISON_RABBIT, 4, 0.3f, true).addPotionEffect(new PotionEffect(Potion.poison.id, 1200, 1)));
        foodMap.put(Names.foods.POISON_RABBIT_STEW, new BaseFood(Names.foods.POISON_RABBIT_STEW, 4, 0.3f, true).addPotionEffect(new PotionEffect(Potion.poison.id, 1200, 1)));
        foodMap.put(Names.foods.POISON_SALMON, new BaseFood(Names.foods.POISON_SALMON, 4, 0.3f, true).addPotionEffect(new PotionEffect(Potion.poison.id, 1200, 1)));
        foodMap.put(Names.foods.CURED_BEEF, new BaseFood(Names.foods.CURED_BEEF, 2, 0.8f, true).setAlwaysEdible());
        foodMap.put(Names.foods.CURED_PORK, new BaseFood(Names.foods.CURED_PORK, 2, 0.8f, true).setAlwaysEdible());
    }

    public static HashMap<String, Item> getFoodMap() {
        return foodMap;
    }
}
