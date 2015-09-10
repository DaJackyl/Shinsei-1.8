package com.megathirio.shinsei.items.tools;

import com.megathirio.shinsei.core.ShinseiTabs;
import com.megathirio.shinsei.ref.Names;
import net.minecraft.item.Item;

import java.util.HashMap;

public class ToolMap {
    public static HashMap<String, Item> toolMap = new HashMap<String, Item>();

    public static void addTools() {
        toolMap.put(Names.tools.WOOD_HANDLE, new BaseItem(Names.tools.WOOD_HANDLE, ShinseiTabs.TOOLS_TAB));
        toolMap.put(Names.tools.BONE_AXE, new PrimitiveAxe(Names.tools.BONE_AXE, Materials.materialBone));
        toolMap.put(Names.tools.FLINT_AXE, new PrimitiveAxe(Names.tools.FLINT_AXE, Materials.materialFlint));
        toolMap.put(Names.tools.BRASS_AXE, new BaseAxe(Names.tools.BRASS_AXE, Materials.materialBrass));
        toolMap.put(Names.tools.BRASS_HOE, new BaseAxe(Names.tools.BRASS_HOE, Materials.materialBrass));
        toolMap.put(Names.tools.BRASS_PICK, new BaseAxe(Names.tools.BRASS_PICK, Materials.materialBrass));
        toolMap.put(Names.tools.BRASS_SHOVEL, new BaseAxe(Names.tools.BRASS_SHOVEL, Materials.materialBrass));
        toolMap.put(Names.tools.BRASS_SWORD, new BaseAxe(Names.tools.BRASS_SWORD, Materials.materialBrass));
        toolMap.put(Names.tools.BRONZE_AXE, new BaseAxe(Names.tools.BRONZE_AXE, Materials.materialBronze));
        toolMap.put(Names.tools.BRONZE_HOE, new BaseAxe(Names.tools.BRONZE_HOE, Materials.materialBronze));
        toolMap.put(Names.tools.BRONZE_PICK, new BaseAxe(Names.tools.BRONZE_PICK, Materials.materialBronze));
        toolMap.put(Names.tools.BRONZE_SHOVEL, new BaseAxe(Names.tools.BRONZE_SHOVEL, Materials.materialBronze));
        toolMap.put(Names.tools.BRONZE_SWORD, new BaseAxe(Names.tools.BRONZE_SWORD, Materials.materialBronze));
        toolMap.put(Names.tools.COPPER_AXE, new BaseAxe(Names.tools.COPPER_AXE, Materials.materialCopper));
        toolMap.put(Names.tools.COPPER_HOE, new BaseHoe(Names.tools.COPPER_HOE, Materials.materialCopper));
        toolMap.put(Names.tools.COPPER_PICK, new BasePickaxe(Names.tools.COPPER_PICK, Materials.materialCopper));
        toolMap.put(Names.tools.COPPER_SWORD, new BaseSword(Names.tools.COPPER_SWORD, Materials.materialCopper));
        toolMap.put(Names.tools.COPPER_SHOVEL, new BaseShovel(Names.tools.COPPER_SHOVEL, Materials.materialCopper));
        toolMap.put(Names.tools.SILVER_AXE, new BaseAxe(Names.tools.SILVER_AXE, Materials.materialSilver));
        toolMap.put(Names.tools.SILVER_HOE, new BaseHoe(Names.tools.SILVER_HOE, Materials.materialSilver));
        toolMap.put(Names.tools.SILVER_PICK, new BasePickaxe(Names.tools.SILVER_PICK, Materials.materialSilver));
        toolMap.put(Names.tools.SILVER_SWORD, new BaseSword(Names.tools.SILVER_SWORD, Materials.materialSilver));
        toolMap.put(Names.tools.SILVER_SHOVEL, new BaseShovel(Names.tools.SILVER_SHOVEL, Materials.materialSilver));
        toolMap.put(Names.tools.STAINLESS_STEEL_AXE, new BaseAxe(Names.tools.STAINLESS_STEEL_AXE, Materials.materialStainlessSteel));
        toolMap.put(Names.tools.STAINLESS_STEEL_HOE, new BaseAxe(Names.tools.STAINLESS_STEEL_HOE, Materials.materialStainlessSteel));
        toolMap.put(Names.tools.STAINLESS_STEEL_PICK, new BaseAxe(Names.tools.STAINLESS_STEEL_PICK, Materials.materialStainlessSteel));
        toolMap.put(Names.tools.STAINLESS_STEEL_SHOVEL, new BaseAxe(Names.tools.STAINLESS_STEEL_SHOVEL, Materials.materialStainlessSteel));
        toolMap.put(Names.tools.STAINLESS_STEEL_SWORD, new BaseAxe(Names.tools.STAINLESS_STEEL_SWORD, Materials.materialStainlessSteel));
        toolMap.put(Names.tools.STEEL_AXE, new BaseAxe(Names.tools.STEEL_AXE, Materials.materialSteel));
        toolMap.put(Names.tools.STEEL_HOE, new BaseAxe(Names.tools.STEEL_HOE, Materials.materialSteel));
        toolMap.put(Names.tools.STEEL_PICK, new BaseAxe(Names.tools.STEEL_PICK, Materials.materialSteel));
        toolMap.put(Names.tools.STEEL_SHOVEL, new BaseAxe(Names.tools.STEEL_SHOVEL, Materials.materialSteel));
        toolMap.put(Names.tools.STEEL_SWORD, new BaseAxe(Names.tools.STEEL_SWORD, Materials.materialSteel));
        toolMap.put(Names.tools.TITANIUM_AXE, new BaseAxe(Names.tools.TITANIUM_AXE, Materials.materialTitanium));
        toolMap.put(Names.tools.TITANIUM_HOE, new BaseAxe(Names.tools.TITANIUM_HOE, Materials.materialTitanium));
        toolMap.put(Names.tools.TITANIUM_PICK, new BaseAxe(Names.tools.TITANIUM_PICK, Materials.materialTitanium));
        toolMap.put(Names.tools.TITANIUM_SHOVEL, new BaseAxe(Names.tools.TITANIUM_SHOVEL, Materials.materialTitanium));
        toolMap.put(Names.tools.TITANIUM_SWORD, new BaseAxe(Names.tools.TITANIUM_SWORD, Materials.materialTitanium));
    }

    public static HashMap<String, Item> getToolMap() {
        return toolMap;
    }
}
