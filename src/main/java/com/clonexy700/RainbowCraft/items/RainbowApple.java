package com.clonexy700.RainbowCraft.items;

import com.clonexy700.RainbowCraft.RainbowMod;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class RainbowApple extends Item{

    public RainbowApple() {
        super(new Item.Properties()
        .group(RainbowMod.TAB)
        .food(new Food.Builder()
                .hunger(12)
                .saturation(5.6f)
                .effect(() -> new EffectInstance(Effects.GLOWING, 600, 2),1)
                .effect(() -> new EffectInstance(Effects.ABSORPTION, 600, 2),1)
                .effect(() -> new EffectInstance(Effects.HASTE, 600, 2),1)
                .effect(() -> new EffectInstance(Effects.HEALTH_BOOST, 600, 2),1)
                .build())
        );
    }
}
