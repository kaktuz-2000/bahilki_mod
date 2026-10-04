package net.mcreator.bahilkiv.client.renderer.item;

import net.minecraft.world.item.ItemStack;
import net.minecraft.resources.Identifier;
import net.minecraft.client.resources.model.EquipmentClientInfo;

import net.mcreator.bahilkiv.init.BahilkiVModItems;
import net.mcreator.bahilkiv.init.BahilkiVModArmorModels;

import net.fabricmc.api.Environment;
import net.fabricmc.api.EnvType;

@Environment(EnvType.CLIENT)
public class BahilkibootsArmor {
	public static void clientLoad() {
		BahilkiVModArmorModels.ARMOR_MODELS.put(BahilkiVModItems.BAHILKIBOOTS_BOOTS, new BahilkiVModArmorModels.ArmorModel() {
			private final Identifier armorTexture = Identifier.parse("bahilki_v:textures/entities/bahilki_icons.png");

			@Override
			public Identifier getArmorTexture(ItemStack stack, EquipmentClientInfo.LayerType type, EquipmentClientInfo.Layer layer, Identifier original) {
				return armorTexture;
			}
		});
	}
}