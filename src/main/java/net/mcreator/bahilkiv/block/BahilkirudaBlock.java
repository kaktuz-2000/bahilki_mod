package net.mcreator.bahilkiv.block;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.ItemStack;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.BlockPos;

import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectionContext;

import java.util.function.Predicate;

public class BahilkirudaBlock extends Block {
	public BahilkirudaBlock(BlockBehaviour.Properties properties) {
		super(properties.strength(5f, 10f).lightLevel(blockstate -> 1).requiresCorrectToolForDrops());
	}

	public static final Predicate<BiomeSelectionContext> GENERATE_BIOMES = BiomeSelectors.includeByKey(ResourceKey.create(Registries.BIOME, Identifier.parse("badlands")), ResourceKey.create(Registries.BIOME, Identifier.parse("bamboo_jungle")),
			ResourceKey.create(Registries.BIOME, Identifier.parse("basalt_deltas")), ResourceKey.create(Registries.BIOME, Identifier.parse("beach")), ResourceKey.create(Registries.BIOME, Identifier.parse("birch_forest")),
			ResourceKey.create(Registries.BIOME, Identifier.parse("cherry_grove")), ResourceKey.create(Registries.BIOME, Identifier.parse("cold_ocean")), ResourceKey.create(Registries.BIOME, Identifier.parse("crimson_forest")),
			ResourceKey.create(Registries.BIOME, Identifier.parse("dark_forest")), ResourceKey.create(Registries.BIOME, Identifier.parse("deep_cold_ocean")), ResourceKey.create(Registries.BIOME, Identifier.parse("deep_dark")),
			ResourceKey.create(Registries.BIOME, Identifier.parse("deep_frozen_ocean")), ResourceKey.create(Registries.BIOME, Identifier.parse("deep_lukewarm_ocean")), ResourceKey.create(Registries.BIOME, Identifier.parse("deep_ocean")),
			ResourceKey.create(Registries.BIOME, Identifier.parse("desert")), ResourceKey.create(Registries.BIOME, Identifier.parse("dripstone_caves")), ResourceKey.create(Registries.BIOME, Identifier.parse("end_barrens")),
			ResourceKey.create(Registries.BIOME, Identifier.parse("end_highlands")), ResourceKey.create(Registries.BIOME, Identifier.parse("end_midlands")), ResourceKey.create(Registries.BIOME, Identifier.parse("eroded_badlands")),
			ResourceKey.create(Registries.BIOME, Identifier.parse("flower_forest")), ResourceKey.create(Registries.BIOME, Identifier.parse("forest")), ResourceKey.create(Registries.BIOME, Identifier.parse("frozen_ocean")),
			ResourceKey.create(Registries.BIOME, Identifier.parse("frozen_peaks")), ResourceKey.create(Registries.BIOME, Identifier.parse("frozen_river")), ResourceKey.create(Registries.BIOME, Identifier.parse("grove")),
			ResourceKey.create(Registries.BIOME, Identifier.parse("ice_spikes")), ResourceKey.create(Registries.BIOME, Identifier.parse("jagged_peaks")), ResourceKey.create(Registries.BIOME, Identifier.parse("jungle")),
			ResourceKey.create(Registries.BIOME, Identifier.parse("lukewarm_ocean")), ResourceKey.create(Registries.BIOME, Identifier.parse("lush_caves")), ResourceKey.create(Registries.BIOME, Identifier.parse("mangrove_swamp")),
			ResourceKey.create(Registries.BIOME, Identifier.parse("meadow")), ResourceKey.create(Registries.BIOME, Identifier.parse("mushroom_fields")), ResourceKey.create(Registries.BIOME, Identifier.parse("nether_wastes")),
			ResourceKey.create(Registries.BIOME, Identifier.parse("ocean")), ResourceKey.create(Registries.BIOME, Identifier.parse("old_growth_birch_forest")), ResourceKey.create(Registries.BIOME, Identifier.parse("old_growth_pine_taiga")),
			ResourceKey.create(Registries.BIOME, Identifier.parse("old_growth_spruce_taiga")), ResourceKey.create(Registries.BIOME, Identifier.parse("pale_garden")), ResourceKey.create(Registries.BIOME, Identifier.parse("plains")),
			ResourceKey.create(Registries.BIOME, Identifier.parse("river")), ResourceKey.create(Registries.BIOME, Identifier.parse("savanna")), ResourceKey.create(Registries.BIOME, Identifier.parse("savanna_plateau")),
			ResourceKey.create(Registries.BIOME, Identifier.parse("small_end_islands")), ResourceKey.create(Registries.BIOME, Identifier.parse("snowy_slopes")), ResourceKey.create(Registries.BIOME, Identifier.parse("snowy_beach")),
			ResourceKey.create(Registries.BIOME, Identifier.parse("snowy_plains")), ResourceKey.create(Registries.BIOME, Identifier.parse("snowy_taiga")), ResourceKey.create(Registries.BIOME, Identifier.parse("soul_sand_valley")),
			ResourceKey.create(Registries.BIOME, Identifier.parse("sparse_jungle")), ResourceKey.create(Registries.BIOME, Identifier.parse("stony_peaks")), ResourceKey.create(Registries.BIOME, Identifier.parse("stony_shore")),
			ResourceKey.create(Registries.BIOME, Identifier.parse("sunflower_plains")), ResourceKey.create(Registries.BIOME, Identifier.parse("swamp")), ResourceKey.create(Registries.BIOME, Identifier.parse("taiga")),
			ResourceKey.create(Registries.BIOME, Identifier.parse("the_end")), ResourceKey.create(Registries.BIOME, Identifier.parse("the_void")), ResourceKey.create(Registries.BIOME, Identifier.parse("warm_ocean")),
			ResourceKey.create(Registries.BIOME, Identifier.parse("warped_forest")), ResourceKey.create(Registries.BIOME, Identifier.parse("windswept_forest")), ResourceKey.create(Registries.BIOME, Identifier.parse("windswept_gravelly_hills")),
			ResourceKey.create(Registries.BIOME, Identifier.parse("windswept_hills")), ResourceKey.create(Registries.BIOME, Identifier.parse("windswept_savanna")), ResourceKey.create(Registries.BIOME, Identifier.parse("wooded_badlands")));

	@Override
	protected void spawnAfterBreak(BlockState state, ServerLevel level, BlockPos pos, ItemStack tool, boolean dropExperience) {
		super.spawnAfterBreak(state, level, pos, tool, dropExperience);
		if (dropExperience)
			this.tryDropExperience(level, pos, tool, UniformInt.of(1, 5));
	}
}