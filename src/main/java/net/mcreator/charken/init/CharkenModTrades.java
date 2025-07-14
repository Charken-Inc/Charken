/*
*	MCreator note: This file will be REGENERATED on each build.
*/
package net.mcreator.charken.init;

import net.neoforged.neoforge.event.village.VillagerTradesEvent;
import net.neoforged.neoforge.common.BasicItemListing;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;

@EventBusSubscriber
public class CharkenModTrades {
	@SubscribeEvent
	public static void registerTrades(VillagerTradesEvent event) {
		if (event.getType() == CharkenModVillagerProfessions.CHARKEN_PRO.get()) {
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(Items.LEATHER_BOOTS), new ItemStack(Items.EMERALD, 2), new ItemStack(CharkenModItems.FLINGSHOT.get()), 8, 5, 0.05f));
		}
		if (event.getType() == CharkenModVillagerProfessions.CHARKEN_PRO.get()) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Items.EMERALD, 4), new ItemStack(CharkenModItems.YOLK.get(), 16), 21, 5, 0.05f));
		}
		if (event.getType() == CharkenModVillagerProfessions.CHARKEN_PRO.get()) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(CharkenModItems.YOLK.get(), 17), new ItemStack(Items.EMERALD), 21, 5, 0.05f));
		}
		if (event.getType() == CharkenModVillagerProfessions.CHARKEN_PRO.get()) {
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(Items.EMERALD, 2), new ItemStack(CharkenModBlocks.CHARKEN_SIGN.get(), 3), 10, 10, 0.05f));
		}
		if (event.getType() == CharkenModVillagerProfessions.CHARKEN_PRO.get()) {
			event.getTrades().get(4).add(new BasicItemListing(new ItemStack(Items.EMERALD, 3), new ItemStack(CharkenModItems.CHARKEN_SPRAY.get()), 20, 11, 0.05f));
		}
		if (event.getType() == CharkenModVillagerProfessions.CHARKEN_PRO.get()) {
			event.getTrades().get(5).add(new BasicItemListing(new ItemStack(Items.EMERALD, 5), new ItemStack(CharkenModItems.MOVIE_SWORD.get()), 5, 15, 0.05f));
		}
		if (event.getType() == CharkenModVillagerProfessions.CHARKEN_PRO.get()) {
			event.getTrades().get(5).add(new BasicItemListing(new ItemStack(Items.EMERALD, 3), new ItemStack(Items.PAPER), new ItemStack(CharkenModBlocks.POSTER.get()), 10, 5, 0.05f));
		}
	}
}