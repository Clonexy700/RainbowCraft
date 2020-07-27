package com.clonexy700.RainbowCraft.util;

import com.clonexy700.RainbowCraft.RainbowMod;
import com.clonexy700.RainbowCraft.items.ItemBase;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {

    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, RainbowMod.MOD_ID);

    public static void init() {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    // предметы

    public static final RegistryObject<Item> RUBY = ITEMS.register("ruby", ItemBase::new);
    public static final RegistryObject<Item> RAINBOW_INGOT = ITEMS.register("rainbow_ingot", ItemBase::new);

}
