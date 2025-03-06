package net.mcreator.charken.procedures;

import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

public class EggSaplingOnBoneMealSuccessProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (Mth.nextDouble(RandomSource.create(), 0, 100) <= 45) {
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("charken", "egg_tree"));
				if (template != null) {
					template.placeInWorld(_serverworld, BlockPos.containing(x - 2, y, z - 2), BlockPos.containing(x - 2, y, z - 2), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
							_serverworld.random, 3);
				}
			}
		}
	}
}
