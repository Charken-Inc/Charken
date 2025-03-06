
package net.mcreator.charken.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BucketItem;

import net.mcreator.charken.init.CharkenModFluids;

public class YolkliqItem extends BucketItem {
	public YolkliqItem() {
		super(CharkenModFluids.YOLKLIQ.get(), new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.COMMON));
	}
}
