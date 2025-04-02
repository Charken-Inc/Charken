
package net.mcreator.charken.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;

import net.mcreator.charken.CharkenMod;

public class IWantToKnowWhereMyWoodIsItem extends Item {
	public IWantToKnowWhereMyWoodIsItem(Item.Properties properties) {
		super(properties.rarity(Rarity.RARE).stacksTo(1).jukeboxPlayable(ResourceKey.create(Registries.JUKEBOX_SONG, ResourceLocation.fromNamespaceAndPath(CharkenMod.MODID, "i_want_to_know_where_my_wood_is"))));
	}
}
