package com.megathirio.shinsei.client.render.items;


import com.megathirio.shinsei.items.*;
import com.megathirio.shinsei.items.tools.Tools;

public class ItemRenderRegister {
    public static void registerItemRenderer() {
        Foods.registerItemRenderer();
        GemItems.registerItemRenderer();
        MetalItems.registerItemRenderer();
        MineralItems.registerItemRenderer();
        Tools.registerItemRenderer();
        Books.registerItemRenderer();
    }
}
