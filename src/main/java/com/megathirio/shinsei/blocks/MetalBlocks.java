package com.megathirio.shinsei.blocks;

import com.megathirio.shinsei.ref.Ref;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

import java.util.HashMap;
import java.util.Map;

public class MetalBlocks {

    public static HashMap<String, BaseMetal> metalMap = new MetalMap().getMetalMap();

    public static void createMetalBlocks(){
        MetalMap.addMetals();
        MetalMap.addSets();
        for(Map.Entry<String, BaseMetal> mapEntry : metalMap.entrySet()) {
            GameRegistry.registerBlock(mapEntry.getValue(), mapEntry.getKey());
        }
    }

    public static void registerBlockRenderer(){
        for (Map.Entry<String, BaseMetal> mapEntry : metalMap.entrySet()) {
            String unlocalizedName = mapEntry.getKey();
            Block block = mapEntry.getValue();

            Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
                    .register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(Ref.RESOURCE_PREFIX + unlocalizedName, "inventory"));
        }
    }

    public static Block getBlock(String blockName){
        BaseMetal block = null;
        String name = blockName;

        for (Map.Entry<String, BaseMetal> mapEntry : metalMap.entrySet()) {
            if(name.equals(mapEntry.getKey())){
                block = mapEntry.getValue();
                break;
            }
        }
        return block;
    }
}