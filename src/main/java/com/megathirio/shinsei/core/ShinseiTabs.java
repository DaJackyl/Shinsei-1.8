package com.megathirio.shinsei.core;

import com.megathirio.shinsei.blocks.GemBlocks;
import com.megathirio.shinsei.blocks.MachineBlocks;
import com.megathirio.shinsei.blocks.MetalBlocks;
import com.megathirio.shinsei.blocks.MineralBlocks;
import com.megathirio.shinsei.items.Foods;
import com.megathirio.shinsei.items.MetalItems;
import com.megathirio.shinsei.items.tools.Tools;
import com.megathirio.shinsei.ref.Names;
import com.megathirio.shinsei.ref.Ref;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ShinseiTabs {
    public static final CreativeTabs METALS_TAB = new CreativeTabs(Ref.RESOURCE_PREFIX + "metals_tab") {
        @Override
        public Item getTabIconItem() {
            return Item.getItemFromBlock(MetalBlocks.getBlock(Names.ores.BORNITE));
        }
    };

    public static final CreativeTabs MINERALS_TAB = new CreativeTabs(Ref.RESOURCE_PREFIX + "minerals_tab") {
        @Override
        public Item getTabIconItem() {
            return Item.getItemFromBlock(MineralBlocks.getBlock(Names.ores.DOLOMITE));
        }
    };

    public static final CreativeTabs GEMS_TAB = new CreativeTabs(Ref.RESOURCE_PREFIX + "gems_tab") {
        @Override
        public Item getTabIconItem() {
            return Item.getItemFromBlock(GemBlocks.getBlock(Names.ores.AMETHYST));
        }
    };

    public static final CreativeTabs MACHINES_TAB = new CreativeTabs(Ref.RESOURCE_PREFIX + "machines_tab") {
        @Override
        public Item getTabIconItem() {
            return Item.getItemFromBlock(MachineBlocks.getBlock(Names.machines.ANBIRU));
        }
    };

    public static final CreativeTabs BLOCKS_TAB = new CreativeTabs(Ref.RESOURCE_PREFIX + "blocks_tab") {
        @Override
        public Item getTabIconItem() {
            return Item.getItemFromBlock(MetalBlocks.getBlock(Names.blocks.MOLYBDENUM));
        }
    };

    public static final CreativeTabs FOODS_TAB = new CreativeTabs(Ref.RESOURCE_PREFIX + "foods_tab") {
        @Override
        public Item getTabIconItem() {
            return Foods.getItem(Names.foods.CURED_BEEF);
        }
    };
    public static final CreativeTabs TOOLS_TAB = new CreativeTabs(Ref.RESOURCE_PREFIX + "tools_tab") {
        @Override
        public Item getTabIconItem() {
            return Tools.getItem(Names.tools.COPPER_PICK);
        }
    };

    public static final CreativeTabs ITEMS_TAB = new CreativeTabs(Ref.RESOURCE_PREFIX + "items_tab") {
        @Override
        public Item getTabIconItem() {
            return MetalItems.getItem(Names.ingots.SILVER);
        }
    };
}
