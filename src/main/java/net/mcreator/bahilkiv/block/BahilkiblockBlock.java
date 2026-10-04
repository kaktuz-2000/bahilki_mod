package net.mcreator.bahilkiv.block;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.FallingBlock;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.core.BlockPos;

import com.mojang.serialization.MapCodec;

public class BahilkiblockBlock extends FallingBlock {
	public static final MapCodec<BahilkiblockBlock> CODEC = simpleCodec(BahilkiblockBlock::new);

	@Override
	public MapCodec<BahilkiblockBlock> codec() {
		return CODEC;
	}

	@Override
	public int getDustColor(BlockState blockstate, BlockGetter world, BlockPos pos) {
		return blockstate.getMapColor(world, pos).col;
	}

	public BahilkiblockBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.SLIME_BLOCK).strength(1f, 10f).lightLevel(blockstate -> 1).requiresCorrectToolForDrops().postProcess((bs, br, bp) -> bp).emissiveRendering((bs, br, bp) -> true));
	}
}