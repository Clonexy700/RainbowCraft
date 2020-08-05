package com.clonexy700.RainbowCraft.world.gen;

import com.clonexy700.RainbowCraft.RainbowMod;
import com.clonexy700.RainbowCraft.util.RegistryHandler;
import net.minecraft.block.BlockState;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.placement.ConfiguredPlacement;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLLoadCompleteEvent;
import net.minecraftforge.registries.ForgeRegistries;

@Mod.EventBusSubscriber(modid = RainbowMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)

public class ModOreGen {

    @SubscribeEvent
    public static void generateOres(FMLLoadCompleteEvent event) {
        for (Biome biome: ForgeRegistries.BIOMES) {

                // ад
            if (biome.getCategory() == Biome.Category.NETHER) {

                // край
            } else if (biome.getCategory() == Biome.Category.THEEND) {

                // world gen
            } else {
                genOre(biome, 17, 24, 0, 50, OreFeatureConfig.FillerBlockType.NATURAL_STONE,
                        RegistryHandler.RAINBOW_ORE.get().getDefaultState(), 9);
                genOre(biome, 6, 5, 0, 20, OreFeatureConfig.FillerBlockType.NATURAL_STONE,
                        RegistryHandler.RAINBOW_GEM_ORE.get().getDefaultState(), 6);
            }
        }
    }

    private static void genOre(Biome biome, int count, int bottomOffset, int topOffset, int max,
                               OreFeatureConfig.FillerBlockType filler, BlockState defaultBlockstate, int size) {
        CountRangeConfig range = new CountRangeConfig(count, bottomOffset, topOffset, max);
        OreFeatureConfig feature = new OreFeatureConfig(filler, defaultBlockstate, size);
        ConfiguredPlacement config = Placement.COUNT_RANGE.configure(range);
        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(feature).withPlacement(config));
    }
}
