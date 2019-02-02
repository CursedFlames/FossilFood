package cursedflames.fossilfood;

import java.util.Random;

import cursedflames.fossilfood.block.ModBlocks;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;

public class OreGen implements IWorldGenerator {
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world,
			IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
		if (world.provider.getDimension()!=0)
			return;
		generateOre(ModBlocks.breadstoneOre.getDefaultState(), world, random, chunkX*16, chunkZ*16,
				3, 64, ModConfig.veinSize, ModConfig.probability, ModConfig.veinsPerChunk);
	}

	private void generateOre(IBlockState ore, World world, Random random, int x, int z, int minY,
			int maxY, int size, float spawnProbability, int count) {
		int deltaY = maxY-minY;

		for (int i = 0; i<count; i++) {
			if (Math.random()>spawnProbability)
				continue;
			BlockPos pos = new BlockPos(x+random.nextInt(16), minY+random.nextInt(deltaY),
					z+random.nextInt(16));

			WorldGenMinable generator = new WorldGenMinable(ore, size);
			generator.generate(world, random, pos);
		}
	}
}
