package net.mcreator.charken.item;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class ChickenLegItem extends Item {
	public ChickenLegItem(Item.Properties properties) {
		super(properties.food((new FoodProperties.Builder()).nutrition(4).saturationModifier(0.6f).build()).usingConvertsTo(Items.BONE));
	}
}