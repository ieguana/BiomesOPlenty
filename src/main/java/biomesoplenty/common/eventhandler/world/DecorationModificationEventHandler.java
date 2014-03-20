package biomesoplenty.common.eventhandler.world;

import biomesoplenty.common.world.decoration.BiomeTweaker;
import biomesoplenty.common.world.decoration.IBOPBiome;
import cpw.mods.fml.common.eventhandler.Event.Result;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.event.terraingen.DecorateBiomeEvent.Decorate;
import net.minecraftforge.event.terraingen.PopulateChunkEvent.Populate;

import java.util.Random;

public class DecorationModificationEventHandler 
{
	@SubscribeEvent
	public void modifyDecor(Decorate event)
	{
        if (event.type == Decorate.EventType.LAKE)
        {
            event.setResult(Result.DENY);
            return;
        }
	    
		World world = event.world;

		int chunkX = event.chunkX;
		int chunkZ = event.chunkZ;

		Random random = event.rand;
		
		BiomeGenBase biome = world.getBiomeGenForCoordsBody(chunkX + 16, chunkZ + 16);
		IBOPBiome bopDecoration = null;

		if (biome instanceof IBOPBiome)
		{
			bopDecoration = (IBOPBiome)biome;
		}
		else if (BiomeTweaker.biomeHasForcedDecorator(biome.biomeID))
		{
			bopDecoration = BiomeTweaker.getForcedDecorator(biome.biomeID);
		}
		
		if (bopDecoration != null)
		{
			if (event.type == Decorate.EventType.PUMPKIN)
			{
				if (!(Boolean)bopDecoration.getBiomeFeatures().getFeature("generatePumpkins"))
				{
					event.setResult(Result.DENY);
				}
			}
		}
	}
	
	@SubscribeEvent
	public void modifyPopulation(Populate event)
	{
		World world = event.world;

		int chunkX = event.chunkX;
		int chunkZ = event.chunkZ;

		Random random = event.rand;
		
		BiomeGenBase biome = world.getBiomeGenForCoordsBody(chunkX + 16, chunkZ + 16);
		IBOPBiome bopDecoration = null;

		if (biome instanceof IBOPBiome)
		{
			bopDecoration = (IBOPBiome)biome;
		}
		else if (BiomeTweaker.biomeHasForcedDecorator(biome.biomeID))
		{
			bopDecoration = BiomeTweaker.getForcedDecorator(biome.biomeID);
		}
		
		if (bopDecoration != null)
		{			
		}
	}
}
