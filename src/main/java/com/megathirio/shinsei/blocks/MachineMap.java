package com.megathirio.shinsei.blocks;

import com.megathirio.shinsei.core.ShinseiTabs;
import com.megathirio.shinsei.items.BaseItem;
import com.megathirio.shinsei.ref.Names;
import net.minecraft.block.Block;
import net.minecraft.item.Item;

import java.util.HashMap;

public class MachineMap {

    public static HashMap<Block, String> machineMap = new HashMap<Block, String>();

    public static void addMachines() {
        machineMap.put(new Anbiru(Names.machines.ANBIRU), Names.machines.ANBIRU);
    }

    public static HashMap<Block, String> getMachineMap() {
        return machineMap;
    }
}