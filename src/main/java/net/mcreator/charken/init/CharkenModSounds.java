
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.charken.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

import net.mcreator.charken.CharkenMod;

public class CharkenModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(Registries.SOUND_EVENT, CharkenMod.MODID);
	public static final DeferredHolder<SoundEvent, SoundEvent> THE_TALE_OF_CHARKEN = REGISTRY.register("the_tale_of_charken", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("charken", "the_tale_of_charken")));
	public static final DeferredHolder<SoundEvent, SoundEvent> WOOD = REGISTRY.register("wood", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("charken", "wood")));
}
