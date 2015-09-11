package com.megathirio.shinsei.items;

import com.megathirio.shinsei.ref.Names;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;

import java.util.HashMap;

public class FoodMap {
    public static HashMap<String, Item> foodMap = new HashMap<String, Item>();
    public static HashMap<String, Item> foodSets = new HashMap<String, Item>();
    public static HashMap<String, Item> poisonSets = new HashMap<String, Item>();

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

    public static void addSets() {
        //new String name, Item food
        foodSets.put(Names.foods.CURED_BEEF, Items.beef);
        foodSets.put(Names.foods.CURED_PORK, Items.porkchop);

        poisonSets.put(Names.foods.POISON_APPLE, Items.apple);
        poisonSets.put(Names.foods.POISON_BEEF, Items.cooked_beef);
        poisonSets.put(Names.foods.POISON_BREAD, Items.bread);
        poisonSets.put(Names.foods.POISON_CARROT, Items.carrot);
        poisonSets.put(Names.foods.POISON_CHICKEN, Items.cooked_chicken);
        poisonSets.put(Names.foods.POISON_COD, Items.cooked_fish);
        poisonSets.put(Names.foods.POISON_COOKIE, Items.cookie);
        poisonSets.put(Names.foods.POISON_MELON, Items.melon);
        poisonSets.put(Names.foods.POISON_MILK, Items.milk_bucket);
        poisonSets.put(Names.foods.POISON_MUTTON, Items.cooked_mutton);
        poisonSets.put(Names.foods.POISON_PIE, Items.pumpkin_pie);
        poisonSets.put(Names.foods.POISON_PORK, Items.cooked_porkchop);
        poisonSets.put(Names.foods.POISON_RABBIT, Items.cooked_rabbit);
        poisonSets.put(Names.foods.POISON_RABBIT_STEW, Items.rabbit_stew);
    }

    public static HashMap<String, Item> getFoodMap() {
        return foodMap;
    }

    public static HashMap<String, Item> getFoodSets() {
        return foodSets;
    }

    public static HashMap<String, Item> getPoisonSets() {
        return poisonSets;
    }
}
