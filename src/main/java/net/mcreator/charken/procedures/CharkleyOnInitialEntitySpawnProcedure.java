package net.mcreator.charken.procedures;

import net.minecraft.world.entity.Entity;

public class CharkleyOnInitialEntitySpawnProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.getPersistentData().putDouble("Age", (-24000));
	}
}