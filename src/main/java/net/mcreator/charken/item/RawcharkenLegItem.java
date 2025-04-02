
package net.mcreator.charken.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class RawcharkenLegItem extends Item {
	public RawcharkenLegItem(Item.Properties properties) {
		super(properties.rarity(Rarity.UNCOMMON).stacksTo(64).food((new FoodProperties.Builder()).nutrition(6).saturationModifier(1f).build()));
	}
}
