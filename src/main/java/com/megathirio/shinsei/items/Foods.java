package com.megathirio.shinsei.items;

import com.megathirio.shinsei.ref.Ref;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

import java.util.HashMap;
import java.util.Map;

public class Foods {
    public static HashMap<String, Item> foodMap = new FoodMap().getFoodMap();

    public static void createFoods(){
        FoodMap.addFoods();
        FoodMap.addSets();
        for(Map.Entry<String, Item> mapEntry : foodMap.entrySet()) {
            GameRegistry.registerItem(mapEntry.getValue(), mapEntry.getKey());
        }
    }

    public static void registerItemRenderer(){
        for (Map.Entry<String, Item> mapEntry : foodMap.entrySet()) {
            String unlocalizedName = mapEntry.getKey();
            Item item = mapEntry.getValue();

            Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
                    .register(item, 0, new ModelResourceLocation(Ref.RESOURCE_PREFIX + unlocalizedName, "inventory"));
        }
    }

    public static Item getItem(String itemName){
        return foodMap.get(itemName);
    }

}
