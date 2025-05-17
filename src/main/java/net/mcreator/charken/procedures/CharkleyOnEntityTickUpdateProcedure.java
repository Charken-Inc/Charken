package net.mcreator.charken.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.EntitySpawnReason;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import net.mcreator.charken.init.CharkenModEntities;

public class CharkleyOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		entity.getPersistentData().putDouble("Age", (entity.getPersistentData().getDouble("Age") + 1));
		if (entity.getPersistentData().getDouble("Age") >= 24000) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = CharkenModEntities.CHARKEN.get().spawn(_level, BlockPos.containing(x, y, z), EntitySpawnReason.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
				}
			}
			if (!entity.level().isClientSide())
				entity.discard();
		}
	}
}
