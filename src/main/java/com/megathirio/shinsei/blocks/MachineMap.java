package com.megathirio.shinsei.blocks;

import com.megathirio.shinsei.ref.Names;
import net.minecraft.block.Block;

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