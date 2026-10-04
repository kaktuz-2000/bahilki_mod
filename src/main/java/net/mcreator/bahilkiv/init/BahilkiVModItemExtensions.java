/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.bahilkiv.init;

import net.fabricmc.fabric.api.registry.FuelValueEvents;

public class BahilkiVModItemExtensions {
	public static void load() {
		FuelValueEvents.BUILD.register((builder, context) -> {
			builder.add(BahilkiVModItems.BAHILKISHARD, 1700);
			builder.add(BahilkiVModBlocks.BAHILKIBLOCK.asItem(), 15300);
		});
	}
}