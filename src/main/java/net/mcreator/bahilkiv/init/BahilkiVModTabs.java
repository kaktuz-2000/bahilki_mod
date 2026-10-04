/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.bahilkiv.init;

import net.minecraft.world.item.CreativeModeTabs;

import net.fabricmc.fabric.api.creativetab.v1.CreativeModeTabEvents;

public class BahilkiVModTabs {
	public static void load() {
		CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.INGREDIENTS).register(tabData -> {
			tabData.accept(BahilkiVModItems.BAHILKISHARD);
			tabData.accept(BahilkiVModBlocks.BAHILKIBLOCK.asItem());
		});
		CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.NATURAL_BLOCKS).register(tabData -> {
			tabData.accept(BahilkiVModBlocks.BAHILKIRUDA.asItem());
		});
		CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.COMBAT).register(tabData -> {
			tabData.accept(BahilkiVModItems.BAHILKIBOOTS_BOOTS);
		});
	}
}