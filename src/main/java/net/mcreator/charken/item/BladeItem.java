
package net.mcreator.charken.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class BladeItem extends Item {
	public BladeItem(Item.Properties properties) {
		super(properties.rarity(Rarity.COMMON).durability(150));
	}
}
