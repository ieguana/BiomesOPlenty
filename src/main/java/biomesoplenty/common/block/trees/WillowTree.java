package biomesoplenty.common.block.trees;

import biomesoplenty.common.world.gen.feature.BOPFeatures;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;

import java.util.Random;

public class WillowTree extends TreeDefaultConfig
{
   @Override
   protected Feature<? extends TreeConfiguration> getFeature(Random random)
   {
      return BOPFeatures.WILLOW_TREE;
   }
}