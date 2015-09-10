package com.megathirio.shinsei.blocks;

import com.megathirio.shinsei.core.ShinseiTabs;
import com.megathirio.shinsei.items.tools.BaseItem;
import com.megathirio.shinsei.items.GemItems;
import com.megathirio.shinsei.ref.Names;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

import java.util.HashMap;

public class GemMap {

    public static HashMap<String, Item> gemItemMap = new HashMap<String, Item>();
    public static HashMap<BaseGem, String> gemMap = new HashMap<BaseGem, String>();

    public static void addGems() {
        gemMap.put(new BaseGem(Names.ores.AMETHYST, Material.rock, GemItems.getItem(Names.gems.AMETHYST), 2, 4), Names.ores.AMETHYST);
        gemMap.put(new BaseGem(Names.ores.APATITE, Material.rock, GemItems.getItem(Names.gems.APATITE), 2, 4), Names.ores.APATITE);
        gemMap.put(new BaseGem(Names.ores.BERYL, Material.rock, GemItems.getItem(Names.gems.AQUAMARINE), 2, 4), Names.ores.BERYL);
        gemMap.put(new BaseGem(Names.ores.CHALCEDONY, Material.rock, GemItems.getItem(Names.gems.ONYX), 2, 4), Names.ores.CHALCEDONY);
        gemMap.put(new BaseGem(Names.ores.CORUNDUM, Material.rock, GemItems.getItem(Names.gems.SAPPHIRE), 2, 4), Names.ores.CORUNDUM);
        gemMap.put(new BaseGem(Names.ores.FLUORITE, Material.rock, GemItems.getItem(Names.gems.FLUORITE), 2, 4), Names.ores.FLUORITE);
        gemMap.put(new BaseGem(Names.ores.JADEITE, Material.rock, GemItems.getItem(Names.gems.JADE), 2, 4), Names.ores.JADEITE);
        gemMap.put(new BaseGem(Names.ores.OLIVINE, Material.rock, GemItems.getItem(Names.gems.PERIDOT), 2, 4), Names.ores.OLIVINE);
        gemMap.put(new BaseGem(Names.ores.OPAL, Material.rock, GemItems.getItem(Names.gems.OPAL), 2, 4), Names.ores.OPAL);
        gemMap.put(new BaseGem(Names.ores.TOPAZ, Material.rock, GemItems.getItem(Names.gems.TOPAZ), 2, 4), Names.ores.TOPAZ);
        gemMap.put(new BaseGem(Names.ores.TURQUOISE, Material.rock, GemItems.getItem(Names.gems.TURQUOISE), 2, 4), Names.ores.TURQUOISE);
    }

    public static void addGemItems() {
        gemItemMap.put(Names.gems.AMETHYST, new BaseItem(Names.gems.AMETHYST, ShinseiTabs.GEMS_TAB));
        gemItemMap.put(Names.gems.APATITE, new BaseItem(Names.gems.APATITE, ShinseiTabs.GEMS_TAB));
        gemItemMap.put(Names.gems.AQUAMARINE, new BaseItem(Names.gems.AQUAMARINE, ShinseiTabs.GEMS_TAB));
        gemItemMap.put(Names.gems.FLUORITE, new BaseItem(Names.gems.FLUORITE, ShinseiTabs.GEMS_TAB));
        gemItemMap.put(Names.gems.JADE, new BaseItem(Names.gems.JADE, ShinseiTabs.GEMS_TAB));
        gemItemMap.put(Names.gems.PERIDOT, new BaseItem(Names.gems.PERIDOT, ShinseiTabs.GEMS_TAB));
        gemItemMap.put(Names.gems.ONYX, new BaseItem(Names.gems.ONYX, ShinseiTabs.GEMS_TAB));
        gemItemMap.put(Names.gems.OPAL, new BaseItem(Names.gems.OPAL, ShinseiTabs.GEMS_TAB));
        gemItemMap.put(Names.gems.RUBY, new BaseItem(Names.gems.RUBY, ShinseiTabs.GEMS_TAB));
        gemItemMap.put(Names.gems.SAPPHIRE, new BaseItem(Names.gems.SAPPHIRE, ShinseiTabs.GEMS_TAB));
        gemItemMap.put(Names.gems.SCARLET_EMERALD, new BaseItem(Names.gems.SCARLET_EMERALD, ShinseiTabs.GEMS_TAB));
        gemItemMap.put(Names.gems.TOPAZ, new BaseItem(Names.gems.TOPAZ, ShinseiTabs.GEMS_TAB));
        gemItemMap.put(Names.gems.TURQUOISE, new BaseItem(Names.gems.TURQUOISE, ShinseiTabs.GEMS_TAB));
    }

    public static HashMap<String, Item> getGemItemMap() {
        return gemItemMap;
    }

    public static HashMap<BaseGem, String> getGemMap() {
        return gemMap;
    }
}