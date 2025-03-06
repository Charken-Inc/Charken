
package net.mcreator.charken.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class EggbrickItem extends Item {
	public EggbrickItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
