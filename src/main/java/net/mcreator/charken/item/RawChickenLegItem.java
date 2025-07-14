package net.mcreator.charken.item;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class RawChickenLegItem extends Item {
	public RawChickenLegItem(Item.Properties properties) {
		super(properties.food((new FoodProperties.Builder()).nutrition(2).saturationModifier(0.3f).build()).usingConvertsTo(Items.BONE));
	}
}