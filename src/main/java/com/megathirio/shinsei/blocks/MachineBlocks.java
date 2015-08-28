package com.megathirio.shinsei.blocks;

import com.megathirio.shinsei.ref.Ref;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

import java.util.HashMap;
import java.util.Map;

public class MachineBlocks {

    public static HashMap<Block, String> machineMap = new MachineMap().getMachineMap();

    public static void createMachines(){
        MetalMap.addMetals();
        for(Map.Entry<Block, String> mapEntry : machineMap.entrySet()) {
            GameRegistry.registerBlock(mapEntry.getKey(), mapEntry.getValue());
        }
    }

    public static void registerBlockRenderer(){
        for (Map.Entry<Block, String> mapEntry : machineMap.entrySet()) {
            String unlocalizedName = mapEntry.getValue();
            Block block = mapEntry.getKey();

            Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
                    .register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(Ref.RESOURCE_PREFIX + unlocalizedName, "inventory"));
        }
    }

    public static Block getBlock(String blockName){
        Block key = null;
        String value = blockName;

        for (Map.Entry<Block, String> mapEntry : machineMap.entrySet()) {
            if(value.equals(mapEntry.getValue())){
                key = mapEntry.getKey();
                break;
            }
        }
        return key;
    }
}