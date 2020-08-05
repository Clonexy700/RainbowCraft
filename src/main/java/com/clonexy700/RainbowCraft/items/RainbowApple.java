package com.clonexy700.RainbowCraft.items;

import com.clonexy700.RainbowCraft.RainbowMod;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class RainbowApple extends Item {
    public RainbowApple(Properties properties) {
        super(new Item.Properties()
                .group(RainbowMod.TAB)
                .food(new Food.Builder()
                            .hunger(12)
                            .saturation(5.8f)
                            .effect(new EffectInstance(Effects.GLOWING, 600, 1), 1)
                            .effect(new EffectInstance(Effects.FIRE_RESISTANCE, 600, 1), 1)
                            .effect(new EffectInstance(Effects.SPEED, 600, 1), 1)
                        .setAlwaysEdible()
                        .build())



        );
    }
}
