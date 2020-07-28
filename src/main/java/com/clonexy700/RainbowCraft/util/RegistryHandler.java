package com.clonexy700.RainbowCraft.util;

import com.clonexy700.RainbowCraft.RainbowMod;
import com.clonexy700.RainbowCraft.blocks.*;
import com.clonexy700.RainbowCraft.items.ItemBase;
import com.clonexy700.RainbowCraft.tools.ModItemTier;
import net.minecraft.block.Block;
import net.minecraft.item.*;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {

    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, RainbowMod.MOD_ID);
    public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, RainbowMod.MOD_ID);

    public static void init() {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    // предметы

    public static final RegistryObject<Item> RUBY = ITEMS.register("ruby", ItemBase::new);
    public static final RegistryObject<Item> RAINBOW_INGOT = ITEMS.register("rainbow_ingot", ItemBase::new);
    public static final RegistryObject<Item> RAINBOW_GEM = ITEMS.register("rainbow_gem", ItemBase::new);
    public static final RegistryObject<Item> RAINBOW_FORGED_INGOT = ITEMS.register("rainbow_forged_ingot", ItemBase::new);

    // инструменты

    public static final RegistryObject<SwordItem> RAINBOW_SWORD = ITEMS.register("rainbow_sword", () ->
            new SwordItem(ModItemTier.RAINBOW_FORGED, 6, 0.0F, new Item.Properties().group(RainbowMod.TAB)));

    public static final RegistryObject<PickaxeItem> RAINBOW_PICKAXE = ITEMS.register("rainbow_pickaxe", () ->
            new PickaxeItem(ModItemTier.RAINBOW_FORGED, 3, 0.0F, new Item.Properties().group(RainbowMod.TAB)));

    public static final RegistryObject<AxeItem> RAINBOW_AXE = ITEMS.register("rainbow_axe", () ->
            new AxeItem(ModItemTier.RAINBOW_FORGED, 4, 0.0F, new Item.Properties().group(RainbowMod.TAB)));

    public static final RegistryObject<ShovelItem> RAINBOW_SHOVEL = ITEMS.register("rainbow_shovel", () ->
            new ShovelItem(ModItemTier.RAINBOW_FORGED, 2, 0.0F, new Item.Properties().group(RainbowMod.TAB)));

    public static final RegistryObject<HoeItem> RAINBOW_HOE = ITEMS.register("rainbow_hoe", () ->
            new HoeItem(ModItemTier.RAINBOW_FORGED, 0.0F, new Item.Properties().group(RainbowMod.TAB)));



    // блок

    public static final RegistryObject<Block> RUBY_BLOCK = BLOCKS.register("ruby_block", RubyBlock::new);

    public static final RegistryObject<Block> RAINBOW_BLOCK = BLOCKS.register("rainbow_block", RainbowBlock::new);

    public static final RegistryObject<Block> RAINBOW_ORE = BLOCKS.register("rainbow_ore", RainbowOre::new);

    public static final RegistryObject<Block> RAINBOW_GEM_ORE = BLOCKS.register("rainbow_gem_ore", RainbowGemOre::new);

    public static final RegistryObject<Block> RAINBOW_GEM_BLOCK = BLOCKS.register("rainbow_gem_block", RainbowGemBlock::new);

    // предмет блок

    public static final RegistryObject<Item> RUBY_BLOCK_ITEM = ITEMS.register("ruby_block", () -> new BlockItemBase(RUBY_BLOCK.get()));

    public static final RegistryObject<Item> RAINBOW_BLOCK_ITEM = ITEMS.register("rainbow_block", () -> new BlockItemBase(RAINBOW_BLOCK.get()));

    public static final RegistryObject<Item> RAINBOW_ORE_ITEM = ITEMS.register("rainbow_ore", () -> new BlockItemBase(RAINBOW_ORE.get()));

    public static final RegistryObject<Item> RAINBOW_GEM_ORE_ITEM = ITEMS.register("rainbow_gem_ore", () -> new BlockItemBase(RAINBOW_GEM_ORE.get()));

    public static final RegistryObject<Item> RAINBOW_GEM_BLOCK_ITEM = ITEMS.register("rainbow_gem_block", () -> new BlockItemBase(RAINBOW_GEM_BLOCK.get()));


}
