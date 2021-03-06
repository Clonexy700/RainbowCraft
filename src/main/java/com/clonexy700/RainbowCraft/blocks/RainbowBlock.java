package com.clonexy700.RainbowCraft.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class RainbowBlock extends Block {

    public RainbowBlock() {
        super(Block.Properties.create(Material.IRON)
                .hardnessAndResistance(3.0f, 6.0f)
                .sound(SoundType.METAL)
                .harvestLevel(2)
                .setLightLevel(value -> 13)
                .harvestTool(ToolType.PICKAXE)
                .setRequiresTool()
        );
    }
}
