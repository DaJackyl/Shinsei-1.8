package com.megathirio.shinsei.world;

import com.megathirio.shinsei.blocks.GemBlocks;
import com.megathirio.shinsei.blocks.MetaBlocks;
import com.megathirio.shinsei.blocks.MetalBlocks;
import com.megathirio.shinsei.blocks.MineralBlocks;
import com.megathirio.shinsei.ref.Names;
import net.minecraft.block.state.pattern.BlockHelper;
import net.minecraft.init.Blocks;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;

import java.util.HashMap;

public class WorldGenMap {

    public static HashMap<WorldGenerator, Integer[]> worldGenMap = new HashMap<WorldGenerator, Integer[]>();

    public static void addWorldGen() {
        //Metals
        worldGenMap.put(new WorldGenMinable(MetalBlocks.getBlock(Names.ores.ACANTHITE).getDefaultState(), 7), new Integer[]{20, 0, 256});
        worldGenMap.put(new WorldGenMinable(MetalBlocks.getBlock(Names.ores.BARITE).getDefaultState(), 7), new Integer[]{20, 0, 65});
        worldGenMap.put(new WorldGenMinable(MetalBlocks.getBlock(Names.ores.BAUXITE).getDefaultState(), 9), new Integer[]{25, 40, 75});
        worldGenMap.put(new WorldGenMinable(MetalBlocks.getBlock(Names.ores.BISMUTH).getDefaultState(), 7), new Integer[]{20, 0, 128});
        worldGenMap.put(new WorldGenMinable(MetalBlocks.getBlock(Names.ores.BORNITE).getDefaultState(), 7), new Integer[]{35, 0, 256});
        worldGenMap.put(new WorldGenMinable(MetalBlocks.getBlock(Names.ores.CASSITERITE).getDefaultState(), 7), new Integer[]{25, 0, 256});
        worldGenMap.put(new WorldGenMinable(MetalBlocks.getBlock(Names.ores.CHALCOPYRITE).getDefaultState(), 7), new Integer[]{40, 0, 256});
        worldGenMap.put(new WorldGenMinable(MetalBlocks.getBlock(Names.ores.CHROMITE).getDefaultState(), 7), new Integer[]{20, 0, 256});
        worldGenMap.put(new WorldGenMinable(MetalBlocks.getBlock(Names.ores.CINNABAR).getDefaultState(), 7), new Integer[]{15, 0, 256});
        worldGenMap.put(new WorldGenMinable(MetalBlocks.getBlock(Names.ores.COBALTITE).getDefaultState(), 4), new Integer[]{10, 0, 64});
        worldGenMap.put(new WorldGenMinable(MetalBlocks.getBlock(Names.ores.CRYOLITE).getDefaultState(), 7), new Integer[]{20, 0, 64});
        worldGenMap.put(new WorldGenMinable(MetalBlocks.getBlock(Names.ores.GALENA).getDefaultState(), 9), new Integer[]{25, 0, 256});
        worldGenMap.put(new WorldGenMinable(MetalBlocks.getBlock(Names.ores.HEMATITE).getDefaultState(), 9), new Integer[]{30, 0, 256});
        worldGenMap.put(new WorldGenMinable(MetalBlocks.getBlock(Names.ores.ILMENITE).getDefaultState(), 6), new Integer[]{20, 0, 64});
        worldGenMap.put(new WorldGenMinable(MetalBlocks.getBlock(Names.ores.MOLYBDENITE).getDefaultState(), 7), new Integer[]{40, 0, 256});
        worldGenMap.put(new WorldGenMinable(MetalBlocks.getBlock(Names.ores.PENTLANDITE).getDefaultState(), 8), new Integer[]{25, 0, 35});
        worldGenMap.put(new WorldGenMinable(MetalBlocks.getBlock(Names.ores.PYROLUSITE).getDefaultState(), 9), new Integer[]{20, 0, 128});
        worldGenMap.put(new WorldGenMinable(MetalBlocks.getBlock(Names.ores.REALGAR).getDefaultState(), 8), new Integer[]{25, 0, 64});
        worldGenMap.put(new WorldGenMinable(MetalBlocks.getBlock(Names.ores.RUTILE).getDefaultState(), 6), new Integer[]{20, 0, 64});
        worldGenMap.put(new WorldGenMinable(MetalBlocks.getBlock(Names.ores.SCHEELITE).getDefaultState(), 6), new Integer[]{15, 0, 35});
        worldGenMap.put(new WorldGenMinable(MetalBlocks.getBlock(Names.ores.SPERRYLITE).getDefaultState(), 4), new Integer[]{15, 0, 35});
        worldGenMap.put(new WorldGenMinable(MetalBlocks.getBlock(Names.ores.SPHALERITE).getDefaultState(), 9), new Integer[]{25, 0, 128});
        worldGenMap.put(new WorldGenMinable(MetalBlocks.getBlock(Names.ores.STIBNITE).getDefaultState(), 5), new Integer[]{25, 0, 128});
        worldGenMap.put(new WorldGenMinable(MetalBlocks.getBlock(Names.ores.SYLVITE).getDefaultState(), 8), new Integer[]{20, 0, 128});
        worldGenMap.put(new WorldGenMinable(MetalBlocks.getBlock(Names.ores.TANTALITE).getDefaultState(), 5), new Integer[]{20, 0, 64});
        worldGenMap.put(new WorldGenMinable(MetalBlocks.getBlock(Names.ores.URANINITE).getDefaultState(), 6), new Integer[]{10, 0, 45});

        //Gems
        worldGenMap.put(new WorldGenMinable(GemBlocks.getBlock(Names.ores.AMETHYST).getDefaultState(), 6), new Integer[]{10, 0, 64});
        worldGenMap.put(new WorldGenMinable(GemBlocks.getBlock(Names.ores.APATITE).getDefaultState(), 9), new Integer[]{25, 0, 256});
        worldGenMap.put(new WorldGenMinable(GemBlocks.getBlock(Names.ores.BERYL).getDefaultState(), 5), new Integer[]{10, 0, 256});
        worldGenMap.put(new WorldGenMinable(GemBlocks.getBlock(Names.ores.CHALCEDONY).getDefaultState(), 5), new Integer[]{15, 0, 256});
        worldGenMap.put(new WorldGenMinable(GemBlocks.getBlock(Names.ores.CORUNDUM).getDefaultState(), 4), new Integer[]{10, 0, 64});
        worldGenMap.put(new WorldGenMinable(GemBlocks.getBlock(Names.ores.FLUORITE).getDefaultState(), 9), new Integer[]{20, 0, 256});
        worldGenMap.put(new WorldGenMinable(GemBlocks.getBlock(Names.ores.JADEITE).getDefaultState(), 4), new Integer[]{10, 0, 64});
        worldGenMap.put(new WorldGenMinable(GemBlocks.getBlock(Names.ores.OLIVINE).getDefaultState(), 4), new Integer[]{20, 0, 64});
        worldGenMap.put(new WorldGenMinable(GemBlocks.getBlock(Names.ores.OPAL).getDefaultState(), 6), new Integer[]{15, 0, 128});
        worldGenMap.put(new WorldGenMinable(GemBlocks.getBlock(Names.ores.TOPAZ).getDefaultState(), 4), new Integer[]{15, 0, 64});
        worldGenMap.put(new WorldGenMinable(GemBlocks.getBlock(Names.ores.TURQUOISE).getDefaultState(), 4), new Integer[]{20, 0, 128});

        //Minerals
        worldGenMap.put(new WorldGenMinable(MineralBlocks.getBlock(Names.ores.BASALT).getDefaultState(), 16), new Integer[]{20, 0, 65});
        worldGenMap.put(new WorldGenMinable(MineralBlocks.getBlock(Names.ores.BORAX).getDefaultState(), 18), new Integer[]{15, 0, 256});
        worldGenMap.put(new WorldGenMinable(MineralBlocks.getBlock(Names.ores.CHALK).getDefaultState(), 12), new Integer[]{20, 50, 256});
        worldGenMap.put(new WorldGenMinable(MineralBlocks.getBlock(Names.ores.DOLOMITE).getDefaultState(), 9), new Integer[]{20, 0, 75});
        worldGenMap.put(new WorldGenMinable(MetaBlocks.getBlock(Names.metas.GRANITE).getDefaultState(), 25), new Integer[]{25, 0, 256});
        worldGenMap.put(new WorldGenMinable(MineralBlocks.getBlock(Names.ores.GYPSUM).getDefaultState(), 12), new Integer[]{20, 45, 256});
        worldGenMap.put(new WorldGenMinable(MineralBlocks.getBlock(Names.ores.HALITE).getDefaultState(), 8), new Integer[]{15, 25, 75});
        worldGenMap.put(new WorldGenMinable(MineralBlocks.getBlock(Names.ores.LIMESTONE).getDefaultState(), 18), new Integer[]{25, 35, 128});
        worldGenMap.put(new WorldGenMinable(MetaBlocks.getBlock(Names.metas.MARBLE).getDefaultState(), 25), new Integer[]{25, 0, 256});
        worldGenMap.put(new WorldGenMinable(MineralBlocks.getBlock(Names.ores.SILTSTONE).getDefaultState(), 12), new Integer[]{20, 60, 75});

        //Miscellaneous
        worldGenMap.put(new WorldGenMinable(MetalBlocks.getBlock(Names.ores.METEORITE).getDefaultState(), 3, BlockHelper.forBlock(Blocks.grass)), new Integer[]{10, 0, 256});

    }

    public static HashMap<WorldGenerator, Integer[]> getWorldGenMap() {
        return worldGenMap;
    }
}