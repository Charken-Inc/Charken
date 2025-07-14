package net.mcreator.charken.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class LassoItem extends Item {
	public LassoItem(Item.Properties properties) {
		super(properties.rarity(Rarity.RARE).durability(10));
	}
}