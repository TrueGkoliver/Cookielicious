package com.evoslab.cookielicious.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class SandwichCookieTiles extends Block {

    public SandwichCookieTiles() {
        super(Properties.create(Material.WOOD)
                .hardnessAndResistance(1.0f, 1.0f)
                .sound(SoundType.WOOD)
                .harvestTool(ToolType.AXE)
        );
    }
}
