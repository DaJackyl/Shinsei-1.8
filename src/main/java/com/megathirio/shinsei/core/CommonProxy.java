package com.megathirio.shinsei.core;

import com.megathirio.shinsei.blocks.*;
import com.megathirio.shinsei.crafting.RecipeManager;
import com.megathirio.shinsei.items.*;
import com.megathirio.shinsei.items.tools.Tools;
import com.megathirio.shinsei.world.ShinseiWorldGen;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CommonProxy {

    public void preInit(FMLPreInitializationEvent e){
        Foods.createFoods();
        GemItems.createGemItems();
        GemBlocks.createGemBlocks();
        MetalItems.createMetalItems();
        MetalBlocks.createMetalBlocks();
        MachineBlocks.createMachines();
        MineralBlocks.createMineralBlocks();
        MineralItems.createMineralItems();
        MetaBlocks.createMetaBlocks();
        Tools.createTools();
        Books.createBooks();
    }

    public void init(FMLInitializationEvent e){
        GameRegistry.registerWorldGenerator(new ShinseiWorldGen(), 0);
        RecipeManager.initRecipes();
    }

    public void postInit(FMLPostInitializationEvent e){

    }

}
