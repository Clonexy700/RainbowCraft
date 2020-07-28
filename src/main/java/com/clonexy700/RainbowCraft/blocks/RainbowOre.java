package com.clonexy700.RainbowCraft.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class RainbowOre extends Block {

    public RainbowOre() {
        super(Block.Properties.create(Material.ROCK)
                .hardnessAndResistance(3.0f, 6.0f)
                .sound(SoundType.METAL)
                .harvestLevel(1)
                .harvestTool(ToolType.PICKAXE));
    }
}
