
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.charken.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.event.entity.RegisterSpawnPlacementsEvent;
import net.neoforged.neoforge.event.entity.EntityAttributeCreationEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.registries.Registries;

import net.mcreator.charken.entity.YolktrienEntity;
import net.mcreator.charken.entity.YolkproEntity;
import net.mcreator.charken.entity.WarlmEntity;
import net.mcreator.charken.entity.CharkenEntity;
import net.mcreator.charken.CharkenMod;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class CharkenModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(Registries.ENTITY_TYPE, CharkenMod.MODID);
	public static final DeferredHolder<EntityType<?>, EntityType<CharkenEntity>> CHARKEN = register("charken",
			EntityType.Builder.<CharkenEntity>of(CharkenEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(70).setUpdateInterval(3)

					.sized(1.8f, 2.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<YolktrienEntity>> YOLKTRIEN = register("yolktrien",
			EntityType.Builder.<YolktrienEntity>of(YolktrienEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 0.3f));
	public static final DeferredHolder<EntityType<?>, EntityType<YolkproEntity>> YOLKPRO = register("yolkpro",
			EntityType.Builder.<YolkproEntity>of(YolkproEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<WarlmEntity>> WARLM = register("warlm",
			EntityType.Builder.<WarlmEntity>of(WarlmEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 0.4f));

	// Start of user code block custom entities
	// End of user code block custom entities
	private static <T extends Entity> DeferredHolder<EntityType<?>, EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(RegisterSpawnPlacementsEvent event) {
		CharkenEntity.init(event);
		YolktrienEntity.init(event);
		WarlmEntity.init(event);
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(CHARKEN.get(), CharkenEntity.createAttributes().build());
		event.put(YOLKTRIEN.get(), YolktrienEntity.createAttributes().build());
		event.put(WARLM.get(), WarlmEntity.createAttributes().build());
	}
}
