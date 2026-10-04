/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.bahilkiv.init;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.Block;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.Registries;

import net.mcreator.bahilkiv.block.BahilkirudaBlock;
import net.mcreator.bahilkiv.block.BahilkiblockBlock;
import net.mcreator.bahilkiv.BahilkiVMod;

import java.util.function.Function;

public class BahilkiVModBlocks {
	public static Block BAHILKIRUDA;
	public static Block BAHILKIBLOCK;

	public static void load() {
		BAHILKIRUDA = register("bahilkiruda", BahilkirudaBlock::new);
		BAHILKIBLOCK = register("bahilkiblock", BahilkiblockBlock::new);
	}

	// Start of user code block custom blocks
	// End of user code block custom blocks
	private static <B extends Block> B register(String name, Function<BlockBehaviour.Properties, B> supplier) {
		return (B) Blocks.register(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(BahilkiVMod.MODID, name)), (Function<BlockBehaviour.Properties, Block>) supplier, BlockBehaviour.Properties.of());
	}
}