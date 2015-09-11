package com.megathirio.shinsei.blocks;

import com.megathirio.shinsei.core.ShinseiTabs;
import com.megathirio.shinsei.items.tools.BaseItem;
import com.megathirio.shinsei.ref.Names;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

import java.util.HashMap;

public class MetalMap {

    public static HashMap<String, Item> metalItemMap = new HashMap<String, Item>();
    public static HashMap<String, BaseMetal> metalMap = new HashMap<String, BaseMetal>();
    public static HashMap<Block[], Item[]> metalSets = new HashMap<Block[], Item[]>();

    public static void addMetals() {
        //new BaseMetal(name),name); - default hardess 2.0f and resistance 3.2f
        metalMap.put(Names.ores.ACANTHITE, new BaseMetal(Names.ores.ACANTHITE));
        metalMap.put(Names.ores.BAUXITE, new BaseMetal(Names.ores.BAUXITE));
        metalMap.put(Names.ores.CINNABAR, new BaseMetal(Names.ores.CINNABAR));
        metalMap.put(Names.ores.METEORITE, new BaseMetal(Names.ores.METEORITE));
        metalMap.put(Names.ores.REALGAR, new BaseMetal(Names.ores.REALGAR));
        metalMap.put(Names.ores.STIBNITE, new BaseMetal(Names.ores.STIBNITE));
        metalMap.put(Names.ores.SYLVITE, new BaseMetal(Names.ores.SYLVITE));

        metalMap.put(Names.blocks.ALUMINUM, new BaseMetal(Names.blocks.ALUMINUM));
        metalMap.put(Names.blocks.ANTIMONY, new BaseMetal(Names.blocks.ANTIMONY));
        metalMap.put(Names.blocks.BARIUM, new BaseMetal(Names.blocks.BARIUM));
        metalMap.put(Names.blocks.BISMUTH, new BaseMetal(Names.blocks.BISMUTH));
        metalMap.put(Names.blocks.BRASS, new BaseMetal(Names.blocks.BRASS));
        metalMap.put(Names.blocks.BRONZE, new BaseMetal(Names.blocks.BRONZE));
        metalMap.put(Names.blocks.CHROMIUM, new BaseMetal(Names.blocks.CHROMIUM));
        metalMap.put(Names.blocks.COBALT, new BaseMetal(Names.blocks.COBALT));
        metalMap.put(Names.blocks.COPPER, new BaseMetal(Names.blocks.COPPER));
        metalMap.put(Names.blocks.LEAD, new BaseMetal(Names.blocks.LEAD));
        metalMap.put(Names.blocks.MAGNESIUM, new BaseMetal(Names.blocks.MAGNESIUM));
        metalMap.put(Names.blocks.MANGANESE, new BaseMetal(Names.blocks.MANGANESE));
        metalMap.put(Names.blocks.MOLYBDENUM, new BaseMetal(Names.blocks.MOLYBDENUM));
        metalMap.put(Names.blocks.NICKEL, new BaseMetal(Names.blocks.NICKEL));
        metalMap.put(Names.blocks.PLATINUM, new BaseMetal(Names.blocks.PLATINUM));
        metalMap.put(Names.blocks.SILVER, new BaseMetal(Names.blocks.SILVER));
        metalMap.put(Names.blocks.STAINLESS_STEEL, new BaseMetal(Names.blocks.STAINLESS_STEEL));
        metalMap.put(Names.blocks.STEEL, new BaseMetal(Names.blocks.STEEL));
        metalMap.put(Names.blocks.TANTALUM, new BaseMetal(Names.blocks.TANTALUM));
        metalMap.put(Names.blocks.TIN, new BaseMetal(Names.blocks.TIN));
        metalMap.put(Names.blocks.TITANIUM, new BaseMetal(Names.blocks.TITANIUM));
        metalMap.put(Names.blocks.TUNGSTEN, new BaseMetal(Names.blocks.TUNGSTEN));
        metalMap.put(Names.blocks.VANADIUM, new BaseMetal(Names.blocks.VANADIUM));
        metalMap.put(Names.blocks.ZINC, new BaseMetal(Names.blocks.ZINC));

        //new BaseMetal(name, hardness, resistance),name);
        metalMap.put(Names.ores.BARITE, new BaseMetal(Names.ores.BARITE, 3.5f, 5.7f));
        metalMap.put(Names.ores.BISMUTH, new BaseMetal(Names.ores.BISMUTH, 2.25f, 3.6f));
        metalMap.put(Names.ores.BORNITE, new BaseMetal(Names.ores.BORNITE, 3.0f, 4.9f));
        metalMap.put(Names.ores.CHALCOPYRITE, new BaseMetal(Names.ores.CHALCOPYRITE, 3.5f, 5.7f));
        metalMap.put(Names.ores.CRYOLITE, new BaseMetal(Names.ores.CRYOLITE, 2.5f, 4.0f));
        metalMap.put(Names.ores.GALENA, new BaseMetal(Names.ores.GALENA, 2.5f, 6.5f));
        metalMap.put(Names.ores.HEMATITE, new BaseMetal(Names.ores.HEMATITE, 5.0f, 8.1f));
        metalMap.put(Names.ores.PENTLANDITE, new BaseMetal(Names.ores.PENTLANDITE, 4.0f, 6.5f));
        metalMap.put(Names.ores.SPHALERITE, new BaseMetal(Names.ores.SPHALERITE, 3.5f, 4.9f));
        metalMap.put(Names.ores.URANINITE, new BaseMetal(Names.ores.URANINITE, 1.0f, 3.0f));
        //new BaseMetal(name, hardness, resistance, tool class, harvest level),name);
        metalMap.put(Names.ores.CASSITERITE, new BaseMetal(Names.ores.CASSITERITE, 7.0f, 11.3f, "pickaxe", 2));
        metalMap.put(Names.ores.CHROMITE, new BaseMetal(Names.ores.CHROMITE, 8.5f, 13.8f, "pickaxe", 3));
        metalMap.put(Names.ores.COBALTITE, new BaseMetal(Names.ores.COBALTITE, 5.0f, 8.1f, "pickaxe", 2));
        metalMap.put(Names.ores.ILMENITE, new BaseMetal(Names.ores.ILMENITE, 6.0f, 9.7f, "pickaxe", 2));
        metalMap.put(Names.ores.MOLYBDENITE, new BaseMetal(Names.ores.MOLYBDENITE, 1.5f, 2.4f, "pickaxe", 0));
        metalMap.put(Names.ores.PYROLUSITE, new BaseMetal(Names.ores.PYROLUSITE, 6.0f, 9.7f, "pickaxe", 2));
        metalMap.put(Names.ores.RUTILE, new BaseMetal(Names.ores.RUTILE, 6.0f, 9.7f, "pickaxe", 2));
        metalMap.put(Names.ores.SCHEELITE, new BaseMetal(Names.ores.SCHEELITE, 5.0f, 8.1f, "pickaxe", 2));
        metalMap.put(Names.ores.SPERRYLITE, new BaseMetal(Names.ores.SPERRYLITE, 6.0f, 9.7f, "pickaxe", 2));
        metalMap.put(Names.ores.TANTALITE, new BaseMetal(Names.ores.TANTALITE, 6.5f, 10.5f, "pickaxe", 2));
    }

    public static void addMetalItems() {
        //Ingots
        metalItemMap.put(Names.ingots.ALUMINUM, new BaseItem(Names.ingots.ALUMINUM, ShinseiTabs.METALS_TAB));
        metalItemMap.put(Names.ingots.ANTIMONY, new BaseItem(Names.ingots.ANTIMONY, ShinseiTabs.METALS_TAB));
        metalItemMap.put(Names.ingots.BARIUM, new BaseItem(Names.ingots.BARIUM, ShinseiTabs.METALS_TAB));
        metalItemMap.put(Names.ingots.BISMUTH, new BaseItem(Names.ingots.BISMUTH, ShinseiTabs.METALS_TAB));
        metalItemMap.put(Names.ingots.BRASS, new BaseItem(Names.ingots.BRASS, ShinseiTabs.METALS_TAB));
        metalItemMap.put(Names.ingots.BRONZE, new BaseItem(Names.ingots.BRONZE, ShinseiTabs.METALS_TAB));
        metalItemMap.put(Names.ingots.CHROMIUM, new BaseItem(Names.ingots.CHROMIUM, ShinseiTabs.METALS_TAB));
        metalItemMap.put(Names.ingots.COBALT, new BaseItem(Names.ingots.COBALT, ShinseiTabs.METALS_TAB));
        metalItemMap.put(Names.ingots.COPPER, new BaseItem(Names.ingots.COPPER, ShinseiTabs.METALS_TAB));
        metalItemMap.put(Names.ingots.LEAD, new BaseItem(Names.ingots.LEAD, ShinseiTabs.METALS_TAB));
        metalItemMap.put(Names.ingots.MAGNESIUM, new BaseItem(Names.ingots.MAGNESIUM, ShinseiTabs.METALS_TAB));
        metalItemMap.put(Names.ingots.MANGANESE, new BaseItem(Names.ingots.MANGANESE, ShinseiTabs.METALS_TAB));
        metalItemMap.put(Names.ingots.MOLYBDENUM, new BaseItem(Names.ingots.MOLYBDENUM, ShinseiTabs.METALS_TAB));
        metalItemMap.put(Names.ingots.NICKEL, new BaseItem(Names.ingots.NICKEL, ShinseiTabs.METALS_TAB));
        metalItemMap.put(Names.ingots.PLATINUM, new BaseItem(Names.ingots.PLATINUM, ShinseiTabs.METALS_TAB));
        metalItemMap.put(Names.ingots.SILVER, new BaseItem(Names.ingots.SILVER, ShinseiTabs.METALS_TAB));
        metalItemMap.put(Names.ingots.STAINLESS_STEEL, new BaseItem(Names.ingots.STAINLESS_STEEL, ShinseiTabs.METALS_TAB));
        metalItemMap.put(Names.ingots.STEEL, new BaseItem(Names.ingots.STEEL, ShinseiTabs.METALS_TAB));
        metalItemMap.put(Names.ingots.TANTALUM, new BaseItem(Names.ingots.TANTALUM, ShinseiTabs.METALS_TAB));
        metalItemMap.put(Names.ingots.TIN, new BaseItem(Names.ingots.TIN, ShinseiTabs.METALS_TAB));
        metalItemMap.put(Names.ingots.TITANIUM, new BaseItem(Names.ingots.TITANIUM, ShinseiTabs.METALS_TAB));
        metalItemMap.put(Names.ingots.TUNGSTEN, new BaseItem(Names.ingots.TUNGSTEN, ShinseiTabs.METALS_TAB));
        metalItemMap.put(Names.ingots.VANADIUM, new BaseItem(Names.ingots.VANADIUM, ShinseiTabs.METALS_TAB));
        metalItemMap.put(Names.ingots.ZINC, new BaseItem(Names.ingots.ZINC, ShinseiTabs.METALS_TAB));

        //Nuggets
        metalItemMap.put(Names.nuggets.ALUMINUM, new BaseItem(Names.nuggets.ALUMINUM, ShinseiTabs.METALS_TAB));
        metalItemMap.put(Names.nuggets.ANTIMONY, new BaseItem(Names.nuggets.ANTIMONY, ShinseiTabs.METALS_TAB));
        metalItemMap.put(Names.nuggets.BARIUM, new BaseItem(Names.nuggets.BARIUM, ShinseiTabs.METALS_TAB));
        metalItemMap.put(Names.nuggets.BISMUTH, new BaseItem(Names.nuggets.BISMUTH, ShinseiTabs.METALS_TAB));
        metalItemMap.put(Names.nuggets.BRASS, new BaseItem(Names.nuggets.BRASS, ShinseiTabs.METALS_TAB));
        metalItemMap.put(Names.nuggets.BRONZE, new BaseItem(Names.nuggets.BRONZE, ShinseiTabs.METALS_TAB));
        metalItemMap.put(Names.nuggets.CHROMIUM, new BaseItem(Names.nuggets.CHROMIUM, ShinseiTabs.METALS_TAB));
        metalItemMap.put(Names.nuggets.COBALT, new BaseItem(Names.nuggets.COBALT, ShinseiTabs.METALS_TAB));
        metalItemMap.put(Names.nuggets.COPPER, new BaseItem(Names.nuggets.COPPER, ShinseiTabs.METALS_TAB));
        metalItemMap.put(Names.nuggets.IRON, new BaseItem(Names.nuggets.IRON, ShinseiTabs.METALS_TAB));
        metalItemMap.put(Names.nuggets.LEAD, new BaseItem(Names.nuggets.LEAD, ShinseiTabs.METALS_TAB));
        metalItemMap.put(Names.nuggets.MAGNESIUM, new BaseItem(Names.nuggets.MAGNESIUM, ShinseiTabs.METALS_TAB));
        metalItemMap.put(Names.nuggets.MANGANESE, new BaseItem(Names.nuggets.MANGANESE, ShinseiTabs.METALS_TAB));
        metalItemMap.put(Names.nuggets.MOLYBDENUM, new BaseItem(Names.nuggets.MOLYBDENUM, ShinseiTabs.METALS_TAB));
        metalItemMap.put(Names.nuggets.NICKEL, new BaseItem(Names.nuggets.NICKEL, ShinseiTabs.METALS_TAB));
        metalItemMap.put(Names.nuggets.PLATINUM, new BaseItem(Names.nuggets.PLATINUM, ShinseiTabs.METALS_TAB));
        metalItemMap.put(Names.nuggets.SILVER, new BaseItem(Names.nuggets.SILVER, ShinseiTabs.METALS_TAB));
        metalItemMap.put(Names.nuggets.STAINLESS_STEEL, new BaseItem(Names.nuggets.STAINLESS_STEEL, ShinseiTabs.METALS_TAB));
        metalItemMap.put(Names.nuggets.STEEL, new BaseItem(Names.nuggets.STEEL, ShinseiTabs.METALS_TAB));
        metalItemMap.put(Names.nuggets.TANTALUM, new BaseItem(Names.nuggets.TANTALUM, ShinseiTabs.METALS_TAB));
        metalItemMap.put(Names.nuggets.TIN, new BaseItem(Names.nuggets.TIN, ShinseiTabs.METALS_TAB));
        metalItemMap.put(Names.nuggets.TITANIUM, new BaseItem(Names.nuggets.TITANIUM, ShinseiTabs.METALS_TAB));
        metalItemMap.put(Names.nuggets.TUNGSTEN, new BaseItem(Names.nuggets.TUNGSTEN, ShinseiTabs.METALS_TAB));
        metalItemMap.put(Names.nuggets.VANADIUM, new BaseItem(Names.nuggets.VANADIUM, ShinseiTabs.METALS_TAB));
        metalItemMap.put(Names.nuggets.ZINC, new BaseItem(Names.nuggets.ZINC, ShinseiTabs.METALS_TAB));
        //Dusts
        metalItemMap.put(Names.dusts.ALUMINUM, new BaseItem(Names.dusts.ALUMINUM, ShinseiTabs.METALS_TAB));
        metalItemMap.put(Names.dusts.ANTIMONY, new BaseItem(Names.dusts.ANTIMONY, ShinseiTabs.METALS_TAB));
        metalItemMap.put(Names.dusts.ARSENIC, new BaseItem(Names.dusts.ARSENIC, ShinseiTabs.METALS_TAB));
        metalItemMap.put(Names.dusts.BARIUM, new BaseItem(Names.dusts.BARIUM, ShinseiTabs.METALS_TAB));
        metalItemMap.put(Names.dusts.BISMUTH, new BaseItem(Names.dusts.BISMUTH, ShinseiTabs.METALS_TAB));
        metalItemMap.put(Names.dusts.BRASS, new BaseItem(Names.dusts.BRASS, ShinseiTabs.METALS_TAB));
        metalItemMap.put(Names.dusts.BRONZE, new BaseItem(Names.dusts.BRONZE, ShinseiTabs.METALS_TAB));
        metalItemMap.put(Names.dusts.CHROMIUM, new BaseItem(Names.dusts.CHROMIUM, ShinseiTabs.METALS_TAB));
        metalItemMap.put(Names.dusts.COBALT, new BaseItem(Names.dusts.COBALT, ShinseiTabs.METALS_TAB));
        metalItemMap.put(Names.dusts.COPPER, new BaseItem(Names.dusts.COPPER, ShinseiTabs.METALS_TAB));
        metalItemMap.put(Names.dusts.IRON, new BaseItem(Names.dusts.IRON, ShinseiTabs.METALS_TAB));
        metalItemMap.put(Names.dusts.LEAD, new BaseItem(Names.dusts.LEAD, ShinseiTabs.METALS_TAB));
        metalItemMap.put(Names.dusts.MAGNESIUM, new BaseItem(Names.dusts.MAGNESIUM, ShinseiTabs.METALS_TAB));
        metalItemMap.put(Names.dusts.MANGANESE, new BaseItem(Names.dusts.MANGANESE, ShinseiTabs.METALS_TAB));
        metalItemMap.put(Names.dusts.MOLYBDENUM, new BaseItem(Names.dusts.MOLYBDENUM, ShinseiTabs.METALS_TAB));
        metalItemMap.put(Names.dusts.NICKEL, new BaseItem(Names.dusts.NICKEL, ShinseiTabs.METALS_TAB));
        metalItemMap.put(Names.dusts.PLATINUM, new BaseItem(Names.dusts.PLATINUM, ShinseiTabs.METALS_TAB));
        metalItemMap.put(Names.dusts.SILVER, new BaseItem(Names.dusts.SILVER, ShinseiTabs.METALS_TAB));
        metalItemMap.put(Names.dusts.STAINLESS_STEEL, new BaseItem(Names.dusts.STAINLESS_STEEL, ShinseiTabs.METALS_TAB));
        metalItemMap.put(Names.dusts.STEEL, new BaseItem(Names.dusts.STEEL, ShinseiTabs.METALS_TAB));
        metalItemMap.put(Names.dusts.TANTALUM, new BaseItem(Names.dusts.TANTALUM, ShinseiTabs.METALS_TAB));
        metalItemMap.put(Names.dusts.TIN, new BaseItem(Names.dusts.TIN, ShinseiTabs.METALS_TAB));
        metalItemMap.put(Names.dusts.TITANIUM, new BaseItem(Names.dusts.TITANIUM, ShinseiTabs.METALS_TAB));
        metalItemMap.put(Names.dusts.TUNGSTEN, new BaseItem(Names.dusts.TUNGSTEN, ShinseiTabs.METALS_TAB));
        metalItemMap.put(Names.dusts.VANADIUM, new BaseItem(Names.dusts.VANADIUM, ShinseiTabs.METALS_TAB));
        metalItemMap.put(Names.dusts.ZINC, new BaseItem(Names.dusts.ZINC, ShinseiTabs.METALS_TAB));
    }

    public static void addSets() {
        //new Block[]{ore,block}, new Item[]{ingot,nugget,dust}
        metalSets.put(new Block[]{metalMap.get(Names.ores.ACANTHITE), metalMap.get(Names.blocks.SILVER)}, new Item[]{metalItemMap.get(Names.ingots.SILVER), metalItemMap.get(Names.nuggets.SILVER), metalItemMap.get(Names.dusts.SILVER)});
        metalSets.put(new Block[]{metalMap.get(Names.ores.BARITE), metalMap.get(Names.blocks.BARIUM)}, new Item[]{metalItemMap.get(Names.ingots.BARIUM), metalItemMap.get(Names.nuggets.BARIUM), metalItemMap.get(Names.dusts.BARIUM)});
        metalSets.put(new Block[]{metalMap.get(Names.ores.BAUXITE), metalMap.get(Names.blocks.ALUMINUM)}, new Item[]{metalItemMap.get(Names.ingots.ALUMINUM), metalItemMap.get(Names.nuggets.ALUMINUM), metalItemMap.get(Names.dusts.ALUMINUM)});
        metalSets.put(new Block[]{metalMap.get(Names.ores.BORNITE), metalMap.get(Names.blocks.COPPER)}, new Item[]{metalItemMap.get(Names.ingots.COPPER), metalItemMap.get(Names.nuggets.COPPER), metalItemMap.get(Names.dusts.COPPER)});
        metalSets.put(new Block[]{metalMap.get(Names.ores.BISMUTH), metalMap.get(Names.blocks.BISMUTH)}, new Item[]{metalItemMap.get(Names.ingots.BISMUTH), metalItemMap.get(Names.nuggets.BISMUTH), metalItemMap.get(Names.dusts.BISMUTH)});
        metalSets.put(new Block[]{metalMap.get(Names.ores.CHALCOPYRITE), metalMap.get(Names.blocks.COPPER)}, new Item[]{metalItemMap.get(Names.ingots.COPPER), metalItemMap.get(Names.nuggets.COPPER), metalItemMap.get(Names.dusts.COPPER)});
        metalSets.put(new Block[]{metalMap.get(Names.ores.CHROMITE), metalMap.get(Names.blocks.CHROMIUM)}, new Item[]{metalItemMap.get(Names.ingots.CHROMIUM), metalItemMap.get(Names.nuggets.CHROMIUM), metalItemMap.get(Names.dusts.CHROMIUM)});
        metalSets.put(new Block[]{metalMap.get(Names.ores.COBALTITE), metalMap.get(Names.blocks.COBALT)}, new Item[]{metalItemMap.get(Names.ingots.COBALT), metalItemMap.get(Names.nuggets.COBALT), metalItemMap.get(Names.dusts.COBALT)});
        metalSets.put(new Block[]{metalMap.get(Names.ores.HEMATITE), Blocks.iron_block}, new Item[]{Items.iron_ingot, metalItemMap.get(Names.nuggets.IRON), metalItemMap.get(Names.dusts.IRON)});
        metalSets.put(new Block[]{metalMap.get(Names.ores.STIBNITE), metalMap.get(Names.blocks.ANTIMONY)}, new Item[]{metalItemMap.get(Names.ingots.ANTIMONY), metalItemMap.get(Names.nuggets.ANTIMONY), metalItemMap.get(Names.dusts.ANTIMONY)});
        metalSets.put(new Block[]{metalMap.get(Names.ores.CASSITERITE), metalMap.get(Names.blocks.TIN)}, new Item[]{metalItemMap.get(Names.ingots.TIN), metalItemMap.get(Names.nuggets.TIN), metalItemMap.get(Names.dusts.TIN)});
        metalSets.put(new Block[]{metalMap.get(Names.ores.GALENA), metalMap.get(Names.blocks.LEAD)}, new Item[]{metalItemMap.get(Names.ingots.LEAD), metalItemMap.get(Names.nuggets.LEAD), metalItemMap.get(Names.dusts.LEAD)});
        metalSets.put(new Block[]{metalMap.get(Names.ores.MOLYBDENITE), metalMap.get(Names.blocks.MOLYBDENUM)}, new Item[]{metalItemMap.get(Names.ingots.MOLYBDENUM), metalItemMap.get(Names.nuggets.MOLYBDENUM), metalItemMap.get(Names.dusts.MOLYBDENUM)});
        metalSets.put(new Block[]{metalMap.get(Names.ores.PENTLANDITE), metalMap.get(Names.blocks.NICKEL)}, new Item[]{metalItemMap.get(Names.ingots.NICKEL), metalItemMap.get(Names.nuggets.NICKEL), metalItemMap.get(Names.dusts.NICKEL)});
        metalSets.put(new Block[]{metalMap.get(Names.ores.SPHALERITE), metalMap.get(Names.blocks.ZINC)}, new Item[]{metalItemMap.get(Names.ingots.ZINC), metalItemMap.get(Names.nuggets.ZINC), metalItemMap.get(Names.dusts.ZINC)});
        metalSets.put(new Block[]{metalMap.get(Names.ores.ILMENITE), metalMap.get(Names.blocks.TITANIUM)}, new Item[]{metalItemMap.get(Names.ingots.TITANIUM), metalItemMap.get(Names.nuggets.TITANIUM), metalItemMap.get(Names.dusts.TITANIUM)});
        metalSets.put(new Block[]{metalMap.get(Names.ores.PYROLUSITE), metalMap.get(Names.blocks.MANGANESE)}, new Item[]{metalItemMap.get(Names.ingots.MANGANESE), metalItemMap.get(Names.nuggets.MANGANESE), metalItemMap.get(Names.dusts.MANGANESE)});
        metalSets.put(new Block[]{metalMap.get(Names.ores.RUTILE), metalMap.get(Names.blocks.TITANIUM)}, new Item[]{metalItemMap.get(Names.ingots.TITANIUM), metalItemMap.get(Names.nuggets.TITANIUM), metalItemMap.get(Names.dusts.TITANIUM)});
        metalSets.put(new Block[]{metalMap.get(Names.ores.SCHEELITE), metalMap.get(Names.blocks.TUNGSTEN)}, new Item[]{metalItemMap.get(Names.ingots.TUNGSTEN), metalItemMap.get(Names.nuggets.TUNGSTEN), metalItemMap.get(Names.dusts.TUNGSTEN)});
        metalSets.put(new Block[]{metalMap.get(Names.ores.SPERRYLITE), metalMap.get(Names.blocks.PLATINUM)}, new Item[]{metalItemMap.get(Names.ingots.PLATINUM), metalItemMap.get(Names.nuggets.PLATINUM), metalItemMap.get(Names.dusts.PLATINUM)});
        metalSets.put(new Block[]{metalMap.get(Names.ores.TANTALITE), metalMap.get(Names.blocks.TANTALUM)}, new Item[]{metalItemMap.get(Names.ingots.TANTALUM), metalItemMap.get(Names.nuggets.TANTALUM), metalItemMap.get(Names.dusts.TANTALUM)});
    }

    public static HashMap<String, Item> getMetalItemMap() {
        return metalItemMap;
    }

    public static HashMap<String, BaseMetal> getMetalMap() {
        return metalMap;
    }

    public static HashMap<Block[], Item[]> getMetalSets() {
        return metalSets;
    }
}