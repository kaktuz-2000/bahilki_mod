/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.bahilkiv.init;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.Registries;

import net.mcreator.bahilkiv.item.BahilkishardItem;
import net.mcreator.bahilkiv.item.BahilkibootsItem;
import net.mcreator.bahilkiv.BahilkiVMod;

import java.util.function.Function;

public class BahilkiVModItems {
	public static Item BAHILKISHARD;
	public static Item BAHILKIRUDA;
	public static Item BAHILKIBLOCK;
	public static Item BAHILKIBOOTS_BOOTS;

	public static void load() {
		BAHILKISHARD = register("bahilkishard", BahilkishardItem::new);
		BAHILKIRUDA = block(BahilkiVModBlocks.BAHILKIRUDA, "bahilkiruda", new Item.Properties().rarity(Rarity.RARE).fireResistant());
		BAHILKIBLOCK = block(BahilkiVModBlocks.BAHILKIBLOCK, "bahilkiblock", new Item.Properties().rarity(Rarity.RARE));
		BAHILKIBOOTS_BOOTS = register("bahilkiboots_boots", BahilkibootsItem.Boots::new);
	}

	// Start of user code block custom items
	// End of user code block custom items
	private static <I extends Item> I register(String name, Function<Item.Properties, ? extends I> supplier) {
		return (I) Items.registerItem(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(BahilkiVMod.MODID, name)), (Function<Item.Properties, Item>) supplier);
	}

	private static Item block(Block block, String name) {
		return block(block, name, new Item.Properties());
	}

	private static Item block(Block block, String name, Item.Properties properties) {
		return Items.registerItem(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(BahilkiVMod.MODID, name)), prop -> new BlockItem(block, prop), properties);
	}
}