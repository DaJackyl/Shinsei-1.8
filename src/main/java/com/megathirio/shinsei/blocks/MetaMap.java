package com.megathirio.shinsei.blocks;

import com.megathirio.shinsei.core.ShinseiTabs;
import com.megathirio.shinsei.items.tools.BaseItem;
import com.megathirio.shinsei.ref.Names;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

import java.util.HashMap;

public class MetaMap {

    public static HashMap<BlockProperties, String> blockMap = new HashMap<BlockProperties, String>();
    public static HashMap<BrickProperties, String> brickMap = new HashMap<BrickProperties, String>();

    public static void addBricks() {
        //new BrickProperties(name, material, hardness, resistance),name);
        brickMap.put(new BrickProperties(Names.metas.BRICKS, Material.rock, 4.0f, 6.5f), Names.metas.BRICKS);
    }

    public static void addBlocks() {
        //new BlockProperties(name, material, hardness, resistance),name);
        blockMap.put(new BlockProperties(Names.metas.GRANITE, Material.rock, 7.0f, 11.3f), Names.metas.GRANITE);
        blockMap.put(new BlockProperties(Names.metas.MARBLE), Names.metas.MARBLE);
        blockMap.put(new BlockProperties(Names.metas.SIDING, Material.wood, 4.0f, 15.0f), Names.metas.SIDING);
    }

    public static HashMap<BlockProperties, String> getBlockMap() {
        return blockMap;
    }

    public static HashMap<BrickProperties, String> getBrickMap() {
        return brickMap;
    }
}