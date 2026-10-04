package net.mcreator.bahilkiv.item;

import net.minecraft.world.item.equipment.EquipmentAssets;
import net.minecraft.world.item.equipment.ArmorType;
import net.minecraft.world.item.equipment.ArmorMaterial;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.tags.TagKey;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.registries.BuiltInRegistries;

import java.util.Map;

public abstract class BahilkibootsItem extends Item {
	public static ArmorMaterial ARMOR_MATERIAL = new ArmorMaterial(4, Map.of(ArmorType.BOOTS, 6, ArmorType.LEGGINGS, 0, ArmorType.CHESTPLATE, 0, ArmorType.HELMET, 0, ArmorType.BODY, 0), 30,
			BuiltInRegistries.SOUND_EVENT.wrapAsHolder(SoundEvents.EMPTY), 0f, 0f, TagKey.create(Registries.ITEM, Identifier.parse("bahilki_v:bahilkiboots_repair_items")),
			ResourceKey.create(EquipmentAssets.ROOT_ID, Identifier.parse("bahilki_v:bahilkiboots")));

	private BahilkibootsItem(Item.Properties properties) {
		super(properties);
	}

	public static class Boots extends BahilkibootsItem {
		public Boots(Item.Properties properties) {
			super(properties.rarity(Rarity.EPIC).humanoidArmor(ARMOR_MATERIAL, ArmorType.BOOTS));
		}
	}
}