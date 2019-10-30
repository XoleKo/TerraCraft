package xoleko.terracraft.world;

import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage.Decoration;
import net.minecraft.world.gen.feature.CompositeFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.MinableConfig;
import net.minecraft.world.gen.placement.CountRange;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraftforge.registries.ForgeRegistries;
import xoleko.terracraft.lists.BlockList;

public class OreGeneration 
{
	public static void setupOreGeneration()
	{
		for(Biome biome : ForgeRegistries.BIOMES)
		{
			CountRangeConfig copper_ore_placement = new CountRangeConfig(1, 20, 30, 50);
			biome.addFeature(Decoration.UNDERGROUND_ORES, new CompositeFeature<>(Feature.MINABLE, new MinableConfig(MinableConfig.IS_ROCK, BlockList.copper_ore_block.getDefaultState(), 10), new CountRange(), copper_ore_placement));
			
			CountRangeConfig tin_ore_placement = new CountRangeConfig(1, 20, 50, 60);
			biome.addFeature(Decoration.UNDERGROUND_ORES, new CompositeFeature<>(Feature.MINABLE, new MinableConfig(MinableConfig.IS_ROCK, BlockList.tin_ore_block.getDefaultState(), 10), new CountRange(), tin_ore_placement));
			
			CountRangeConfig iron_ore_placement = new CountRangeConfig(1, 20, 50, 60);
			biome.addFeature(Decoration.UNDERGROUND_ORES, new CompositeFeature<>(Feature.MINABLE, new MinableConfig(MinableConfig.IS_ROCK, BlockList.iron_ore_block.getDefaultState(), 10), new CountRange(), iron_ore_placement));
			
			CountRangeConfig lead_ore_placement = new CountRangeConfig(1, 20, 50, 60);
			biome.addFeature(Decoration.UNDERGROUND_ORES, new CompositeFeature<>(Feature.MINABLE, new MinableConfig(MinableConfig.IS_ROCK, BlockList.lead_ore_block.getDefaultState(), 10), new CountRange(), lead_ore_placement));
			
			CountRangeConfig silver_ore_placement = new CountRangeConfig(1, 20, 50, 60);
			biome.addFeature(Decoration.UNDERGROUND_ORES, new CompositeFeature<>(Feature.MINABLE, new MinableConfig(MinableConfig.IS_ROCK, BlockList.silver_ore_block.getDefaultState(), 10), new CountRange(), silver_ore_placement));
			
			CountRangeConfig tungsten_ore_placement = new CountRangeConfig(1, 20, 50, 60);
			biome.addFeature(Decoration.UNDERGROUND_ORES, new CompositeFeature<>(Feature.MINABLE, new MinableConfig(MinableConfig.IS_ROCK, BlockList.tungsten_ore_block.getDefaultState(), 10), new CountRange(), tungsten_ore_placement));
			
			CountRangeConfig gold_ore_placement = new CountRangeConfig(1, 20, 50, 60);
			biome.addFeature(Decoration.UNDERGROUND_ORES, new CompositeFeature<>(Feature.MINABLE, new MinableConfig(MinableConfig.IS_ROCK, BlockList.gold_ore_block.getDefaultState(), 10), new CountRange(), gold_ore_placement));
			
			CountRangeConfig platinum_ore_placement = new CountRangeConfig(1, 20, 50, 60);
			biome.addFeature(Decoration.UNDERGROUND_ORES, new CompositeFeature<>(Feature.MINABLE, new MinableConfig(MinableConfig.IS_ROCK, BlockList.platinum_ore_block.getDefaultState(), 10), new CountRange(), platinum_ore_placement));
			
			CountRangeConfig demonite_ore_placement = new CountRangeConfig(1, 20, 50, 60);
			biome.addFeature(Decoration.UNDERGROUND_ORES, new CompositeFeature<>(Feature.MINABLE, new MinableConfig(MinableConfig.IS_ROCK, BlockList.demonite_ore_block.getDefaultState(), 10), new CountRange(), demonite_ore_placement));
			
			CountRangeConfig crimtane_ore_placement = new CountRangeConfig(1, 20, 50, 60);
			biome.addFeature(Decoration.UNDERGROUND_ORES, new CompositeFeature<>(Feature.MINABLE, new MinableConfig(MinableConfig.IS_ROCK, BlockList.crimtane_ore_block.getDefaultState(), 10), new CountRange(), crimtane_ore_placement));
			
			CountRangeConfig hellstone_placement = new CountRangeConfig(1, 20, 50, 60);
			biome.addFeature(Decoration.UNDERGROUND_ORES, new CompositeFeature<>(Feature.MINABLE, new MinableConfig(MinableConfig.IS_ROCK, BlockList.hellstone_block.getDefaultState(), 10), new CountRange(), hellstone_placement));
		}
	}
}
