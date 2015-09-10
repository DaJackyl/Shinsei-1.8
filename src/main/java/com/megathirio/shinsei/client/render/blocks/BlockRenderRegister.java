package com.megathirio.shinsei.client.render.blocks;

import com.megathirio.shinsei.blocks.*;

public class BlockRenderRegister {
    public static void registerBlockRenderer(){
        GemBlocks.registerBlockRenderer();
        MetalBlocks.registerBlockRenderer();
        MetaBlocks.registerBlockRenderer();
        MachineBlocks.registerBlockRenderer();
        MineralBlocks.registerBlockRenderer();
    }
}
