package com.megathirio.shinsei.client.render.items;


import com.megathirio.shinsei.items.Books;
import com.megathirio.shinsei.items.Foods;
import com.megathirio.shinsei.items.GemItems;
import com.megathirio.shinsei.items.MetalItems;
import com.megathirio.shinsei.items.tools.Tools;

public class ItemRenderRegister {
    public static void registerItemRenderer() {
        Foods.registerItemRenderer();
        GemItems.registerItemRenderer();
        MetalItems.registerItemRenderer();
        Tools.registerItemRenderer();
        Books.registerItemRenderer();
    }
}
