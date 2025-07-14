package net.mcreator.charken.item;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BucketItem;

import net.mcreator.charken.init.CharkenModFluids;

public class YolkliqItem extends BucketItem {
	public YolkliqItem(Item.Properties properties) {
		super(CharkenModFluids.YOLKLIQ.get(), properties.craftRemainder(Items.BUCKET).stacksTo(1)

		);
	}
}