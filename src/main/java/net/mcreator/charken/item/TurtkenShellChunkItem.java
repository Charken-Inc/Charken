package net.mcreator.charken.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class TurtkenShellChunkItem extends Item {
	public TurtkenShellChunkItem(Item.Properties properties) {
		super(properties.rarity(Rarity.UNCOMMON));
	}
}