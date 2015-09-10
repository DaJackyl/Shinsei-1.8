package com.megathirio.shinsei.blocks;

import com.megathirio.shinsei.core.ShinseiTabs;
import com.megathirio.shinsei.items.GemItems;
import com.megathirio.shinsei.items.MineralItems;
import com.megathirio.shinsei.items.tools.BaseItem;
import com.megathirio.shinsei.ref.Names;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

import java.util.HashMap;

public class MineralMap {

    public static HashMap<String, Item> mineralItemMap = new HashMap<String, Item>();
    public static HashMap<BaseMineral, String> mineralMap = new HashMap<BaseMineral, String>();

    public static void addMinerals() {
        mineralMap.put(new BaseMineral(Names.ores.BASALT, Material.rock, MineralItems.getItem(Names.dusts.BORAX), 2, 4), Names.ores.BASALT);
        mineralMap.put(new BaseMineral(Names.ores.BORAX, Material.rock, MineralItems.getItem(Names.dusts.BORAX), 2, 4), Names.ores.BORAX);
        mineralMap.put(new BaseMineral(Names.ores.CHALK, Material.rock, MineralItems.getItem(Names.dusts.CHALK), 2, 4), Names.ores.CHALK);
        mineralMap.put(new BaseMineral(Names.ores.DOLOMITE, Material.rock, MineralItems.getItem(Names.dusts.DOLOMITE), 2, 4), Names.ores.DOLOMITE);
        mineralMap.put(new BaseMineral(Names.ores.GYPSUM, Material.rock, MineralItems.getItem(Names.dusts.GYPSUM), 2, 4), Names.ores.GYPSUM);
        mineralMap.put(new BaseMineral(Names.ores.HALITE, Material.rock, MineralItems.getItem(Names.dusts.SALT), 2, 4), Names.ores.HALITE);
        mineralMap.put(new BaseMineral(Names.ores.LIMESTONE, Material.rock, MineralItems.getItem(Names.dusts.QUICKLIME), 2, 4), Names.ores.LIMESTONE);
        mineralMap.put(new BaseMineral(Names.ores.SILTSTONE, Material.rock, MineralItems.getItem(Names.dusts.SILT), 2, 4), Names.ores.SILTSTONE);
    }

    public static void addMineralItems() {
        mineralItemMap.put(Names.dusts.BORAX, new BaseItem(Names.dusts.BORAX, ShinseiTabs.MINERALS_TAB));
        mineralItemMap.put(Names.dusts.CHALK, new BaseItem(Names.dusts.CHALK, ShinseiTabs.MINERALS_TAB));
        mineralItemMap.put(Names.dusts.DOLOMITE, new BaseItem(Names.dusts.DOLOMITE, ShinseiTabs.MINERALS_TAB));
        mineralItemMap.put(Names.dusts.GYPSUM, new BaseItem(Names.dusts.GYPSUM, ShinseiTabs.MINERALS_TAB));
        mineralItemMap.put(Names.dusts.QUICKLIME, new BaseItem(Names.dusts.QUICKLIME, ShinseiTabs.MINERALS_TAB));
        mineralItemMap.put(Names.dusts.SALT, new BaseItem(Names.dusts.SALT, ShinseiTabs.MINERALS_TAB));
        mineralItemMap.put(Names.dusts.SILT, new BaseItem(Names.dusts.SILT, ShinseiTabs.MINERALS_TAB));
    }

    public static HashMap<String, Item> getMineralItemMap() {
        return mineralItemMap;
    }

    public static HashMap<BaseMineral, String> getMineralMap() {
        return mineralMap;
    }
}