package net.mcreator.bahilkiv.item;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.component.Consumables;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.LivingEntity;

import net.mcreator.bahilkiv.procedures.BahilkishardPriZaviershieniiIspolzovaniiaProcedure;

public class BahilkishardItem extends Item {
	public BahilkishardItem(Item.Properties properties) {
		super(properties.rarity(Rarity.RARE).food((new FoodProperties.Builder()).nutrition(1).saturationModifier(0.1f).alwaysEdible().build(), Consumables.defaultFood().consumeSeconds(2.4F).build()).enchantable(1));
	}

	@Override
	public float getDestroySpeed(ItemStack itemstack, BlockState state) {
		return 0.1f;
	}

	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
		ItemStack retval = super.finishUsingItem(itemstack, world, entity);
		BahilkishardPriZaviershieniiIspolzovaniiaProcedure.execute(entity);
		return retval;
	}
}