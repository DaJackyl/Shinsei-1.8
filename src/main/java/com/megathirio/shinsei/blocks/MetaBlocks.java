package com.megathirio.shinsei.blocks;

import com.megathirio.shinsei.ref.Ref;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

import java.util.HashMap;
import java.util.Map;

public class MetaBlocks {

    public static HashMap<BlockProperties, String> blockMap = new MetaMap().getBlockMap();
    public static HashMap<BrickProperties, String> brickMap = new MetaMap().getBrickMap();

    public static void createMetaBlocks(){
        MetaMap.addBlocks();
        MetaMap.addBricks();
        for(Map.Entry<BlockProperties, String> mapEntry : blockMap.entrySet()) {
            GameRegistry.registerBlock(mapEntry.getKey(), ItemBlockMeta.class, mapEntry.getValue());
        }

        for(Map.Entry<BrickProperties, String> mapEntry : brickMap.entrySet()) {
            GameRegistry.registerBlock(mapEntry.getKey(), ItemBlockMeta.class, mapEntry.getValue());
        }
    }

    public static void registerBlockRenderer(){
        for (Map.Entry<BlockProperties, String> mapEntry : blockMap.entrySet()) {
            String unlocalizedName = mapEntry.getValue();
            Block block = mapEntry.getKey();

            Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
                    .register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(Ref.RESOURCE_PREFIX + unlocalizedName, "inventory"));
        }
        for (Map.Entry<BrickProperties, String> mapEntry : brickMap.entrySet()) {
            String unlocalizedName = mapEntry.getValue();
            Block brick = mapEntry.getKey();

            Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
                    .register(Item.getItemFromBlock(brick), 0, new ModelResourceLocation(Ref.RESOURCE_PREFIX + unlocalizedName, "inventory"));
        }
    }

    public static Block getBlock(String blockName){
        BlockProperties key = null;
        String value = blockName;

        for (Map.Entry<BlockProperties, String> mapEntry : blockMap.entrySet()) {
            if(value.equals(mapEntry.getValue())){
                key = mapEntry.getKey();
                break;
            }
        }
        return key;
    }

    public static Block getBrick(String blockName){
        BrickProperties key = null;
        String value = blockName;

        for (Map.Entry<BrickProperties, String> mapEntry : brickMap.entrySet()) {
            if(value.equals(mapEntry.getValue())){
                key = mapEntry.getKey();
                break;
            }
        }
        return key;
    }
}