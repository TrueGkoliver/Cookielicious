package com.evoslab.cookielicious.common.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class StrawberryCookieTiles extends Block {

    public StrawberryCookieTiles() {
        super(Properties.create(Material.WOOD)
                .hardnessAndResistance(1.0f, 1.0f)
                .sound(SoundType.WOOD)
                .harvestTool(ToolType.AXE)
        );
    }
}
