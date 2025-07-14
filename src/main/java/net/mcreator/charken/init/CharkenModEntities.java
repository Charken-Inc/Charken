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
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;

import net.mcreator.charken.entity.YolktrienEntity;
import net.mcreator.charken.entity.YolkproEntity;
import net.mcreator.charken.entity.WarlmEntity;
import net.mcreator.charken.entity.TurtkenTamedEntity;
import net.mcreator.charken.entity.TurtkenEntity;
import net.mcreator.charken.entity.SprayEntity;
import net.mcreator.charken.entity.GoatinEntity;
import net.mcreator.charken.entity.CharkleyEntity;
import net.mcreator.charken.entity.CharkenEntity;
import net.mcreator.charken.CharkenMod;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class CharkenModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(Registries.ENTITY_TYPE, CharkenMod.MODID);
	public static final DeferredHolder<EntityType<?>, EntityType<CharkenEntity>> CHARKEN = register("charken",
			EntityType.Builder.<CharkenEntity>of(CharkenEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(70).setUpdateInterval(3)

					.sized(2.55f, 2.7f));
	public static final DeferredHolder<EntityType<?>, EntityType<YolktrienEntity>> YOLKTRIEN = register("yolktrien",
			EntityType.Builder.<YolktrienEntity>of(YolktrienEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 0.2f));
	public static final DeferredHolder<EntityType<?>, EntityType<YolkproEntity>> YOLKPRO = register("yolkpro",
			EntityType.Builder.<YolkproEntity>of(YolkproEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<WarlmEntity>> WARLM = register("warlm",
			EntityType.Builder.<WarlmEntity>of(WarlmEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 0.4f));
	public static final DeferredHolder<EntityType<?>, EntityType<CharkleyEntity>> CHARKLEY = register("charkley",
			EntityType.Builder.<CharkleyEntity>of(CharkleyEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(70).setUpdateInterval(3)

					.sized(1.8f, 2f));
	public static final DeferredHolder<EntityType<?>, EntityType<SprayEntity>> SPRAY = register("spray",
			EntityType.Builder.<SprayEntity>of(SprayEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<GoatinEntity>> GOATIN = register("goatin",
			EntityType.Builder.<GoatinEntity>of(GoatinEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(1.7f, 3.2f));
	public static final DeferredHolder<EntityType<?>, EntityType<TurtkenEntity>> TURTKEN = register("turtken",
			EntityType.Builder.<TurtkenEntity>of(TurtkenEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(70).setUpdateInterval(3)

					.sized(2.3f, 2.3f));
	public static final DeferredHolder<EntityType<?>, EntityType<TurtkenTamedEntity>> TURTKEN_TAMED = register("turtken_tamed",
			EntityType.Builder.<TurtkenTamedEntity>of(TurtkenTamedEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(70).setUpdateInterval(3)

					.sized(2.3f, 2.3f));

	// Start of user code block custom entities
	// End of user code block custom entities
	private static <T extends Entity> DeferredHolder<EntityType<?>, EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(ResourceKey.create(Registries.ENTITY_TYPE, ResourceLocation.fromNamespaceAndPath(CharkenMod.MODID, registryname))));
	}

	@SubscribeEvent
	public static void init(RegisterSpawnPlacementsEvent event) {
		CharkenEntity.init(event);
		YolktrienEntity.init(event);
		WarlmEntity.init(event);
		CharkleyEntity.init(event);
		GoatinEntity.init(event);
		TurtkenEntity.init(event);
		TurtkenTamedEntity.init(event);
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(CHARKEN.get(), CharkenEntity.createAttributes().build());
		event.put(YOLKTRIEN.get(), YolktrienEntity.createAttributes().build());
		event.put(WARLM.get(), WarlmEntity.createAttributes().build());
		event.put(CHARKLEY.get(), CharkleyEntity.createAttributes().build());
		event.put(GOATIN.get(), GoatinEntity.createAttributes().build());
		event.put(TURTKEN.get(), TurtkenEntity.createAttributes().build());
		event.put(TURTKEN_TAMED.get(), TurtkenTamedEntity.createAttributes().build());
	}
}