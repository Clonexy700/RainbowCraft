package com.clonexy700.RainbowCraft.blocks;

import com.clonexy700.RainbowCraft.RainbowMod;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;

public class BlockItemBase extends BlockItem {

    public BlockItemBase(Block block) {
        super(block, new Item.Properties().group(RainbowMod.TAB));
    }
}
