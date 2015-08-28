package com.megathirio.shinsei.client.render.blocks;

import com.megathirio.shinsei.blocks.GemBlocks;
import com.megathirio.shinsei.blocks.MachineBlocks;
import com.megathirio.shinsei.blocks.MetalBlocks;

public class BlockRenderRegister {
    public static void registerBlockRenderer(){
        GemBlocks.registerBlockRenderer();
        MetalBlocks.registerBlockRenderer();
        MachineBlocks.registerBlockRenderer();
    }
}
