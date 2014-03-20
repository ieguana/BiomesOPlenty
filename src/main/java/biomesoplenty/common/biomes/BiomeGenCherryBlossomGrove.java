package biomesoplenty.common.biomes;

import biomesoplenty.api.BOPBlockHelper;
import biomesoplenty.common.world.features.WorldGenBOPDoubleFlora;
import biomesoplenty.common.world.features.WorldGenBOPFlora;
import biomesoplenty.common.world.features.WorldGenBOPTallGrass;
import biomesoplenty.common.world.features.trees.WorldGenBOPBigTree;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenAbstractTree;

import java.util.Random;

public class BiomeGenCherryBlossomGrove extends BOPBiome
{
	private static final Height biomeHeight = new Height(0.1F, 0.2F);

	public BiomeGenCherryBlossomGrove(int id)
	{
		super(id);

        //TODO: setHeight()
        this.setHeight(biomeHeight);
        //TODO:	setColor()
        this.setColor(16289679);
        this.setTemperatureRainfall(0.7F, 0.8F);
		
		this.theBiomeDecorator.treesPerChunk = 3;
		this.theBiomeDecorator.grassPerChunk = 15;
		this.theBiomeDecorator.flowersPerChunk = -999;

        this.bopWorldFeatures.setFeature("bopFlowersPerChunk", 10);
        this.bopWorldFeatures.setFeature("shrubsPerChunk", 2);
        this.bopWorldFeatures.setFeature("cloverPatchesPerChunk", 15);
        this.bopWorldFeatures.setFeature("leafPilesPerChunk", 15);
        this.bopWorldFeatures.setFeature("generatePumpkins", false);

        this.bopWorldFeatures.setFeature("bopGrassPerChunk", 15);

        this.bopWorldFeatures.weightedFlowerGen.put(new WorldGenBOPFlora(BOPBlockHelper.get("flowers"), 6), 12);
        this.bopWorldFeatures.weightedFlowerGen.put(new WorldGenBOPFlora(BOPBlockHelper.get("flowers"), 9), 8);
        this.bopWorldFeatures.weightedFlowerGen.put(new WorldGenBOPFlora(BOPBlockHelper.get("flowers"), 0), 6);
        this.bopWorldFeatures.weightedFlowerGen.put(new WorldGenBOPDoubleFlora(1, 5), 4);

        this.bopWorldFeatures.weightedGrassGen.put(new WorldGenBOPTallGrass(BOPBlockHelper.get("foliage"), 10), 0.5D);
        this.bopWorldFeatures.weightedGrassGen.put(new WorldGenBOPTallGrass(BOPBlockHelper.get("foliage"), 11), 0.5D);
        this.bopWorldFeatures.weightedGrassGen.put(new WorldGenBOPTallGrass(Blocks.tallgrass, 1), 1D);
	}

	@Override
	//TODO:						getRandomWorldGenForTrees()
	public WorldGenAbstractTree func_150567_a(Random random)
	{
		return random.nextInt(3) == 0 ? new WorldGenBOPBigTree(BOPBlockHelper.get("logs1"), BOPBlockHelper.get("leaves3"), 1, 3) : new WorldGenBOPBigTree(BOPBlockHelper.get("logs1"), BOPBlockHelper.get("leaves3"), 1, 1);
	}
	
	@Override
	public void decorate(World world, Random random, int chunkX, int chunkZ)
	{
		super.decorate(world, random, chunkX, chunkZ);
		int var5 = 12 + random.nextInt(6);

		for (int var6 = 0; var6 < var5; ++var6)
		{
			int x = chunkX + random.nextInt(16);
			int y = random.nextInt(28) + 4;
			int z = chunkZ + random.nextInt(16);

			Block block = world.getBlock(x, y, z);

			if (block != null && block.isReplaceableOreGen(world, x, y, z, Blocks.stone))
			{
				world.setBlock(x, y, z, BOPBlockHelper.get("gemOre"), 6, 2);
			}
		}
	}

	@Override
	//TODO:		getBiomeGrassColor()
	public int getBiomeGrassColor(int x, int y, int z)
	{
		return 10747818;
	}

	@Override
	//TODO:		getBiomeFoliageColor()
	public int getBiomeFoliageColor(int x, int y, int z)
	{
		return 10747818;
	}
}
