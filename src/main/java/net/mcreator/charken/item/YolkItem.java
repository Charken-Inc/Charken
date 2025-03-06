
package net.mcreator.charken.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class YolkItem extends Item {
	public YolkItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
