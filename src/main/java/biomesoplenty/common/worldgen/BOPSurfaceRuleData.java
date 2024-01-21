/*******************************************************************************
 * Copyright 2022, the Glitchfiend Team.
 * All rights reserved.
 ******************************************************************************/
package biomesoplenty.common.worldgen;

import biomesoplenty.api.biome.BOPBiomes;
import biomesoplenty.api.block.BOPBlocks;
import com.google.common.collect.ImmutableList;
import net.minecraft.world.level.biome.Biomes;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.Noises;
import net.minecraft.world.level.levelgen.SurfaceRules;
import net.minecraft.world.level.levelgen.VerticalAnchor;

public class BOPSurfaceRuleData
{
    private static final SurfaceRules.RuleSource AIR = makeStateRule(Blocks.AIR);
    private static final SurfaceRules.RuleSource BEDROCK = makeStateRule(Blocks.BEDROCK);
    private static final SurfaceRules.RuleSource WHITE_TERRACOTTA = makeStateRule(Blocks.WHITE_TERRACOTTA);
    private static final SurfaceRules.RuleSource ORANGE_TERRACOTTA = makeStateRule(Blocks.ORANGE_TERRACOTTA);
    private static final SurfaceRules.RuleSource TERRACOTTA = makeStateRule(Blocks.TERRACOTTA);
    private static final SurfaceRules.RuleSource RED_SAND = makeStateRule(Blocks.RED_SAND);
    private static final SurfaceRules.RuleSource RED_SANDSTONE = makeStateRule(Blocks.RED_SANDSTONE);
    private static final SurfaceRules.RuleSource STONE = makeStateRule(Blocks.STONE);
    private static final SurfaceRules.RuleSource DEEPSLATE = makeStateRule(Blocks.DEEPSLATE);
    private static final SurfaceRules.RuleSource DIRT = makeStateRule(Blocks.DIRT);
    private static final SurfaceRules.RuleSource PODZOL = makeStateRule(Blocks.PODZOL);
    private static final SurfaceRules.RuleSource COARSE_DIRT = makeStateRule(Blocks.COARSE_DIRT);
    private static final SurfaceRules.RuleSource MYCELIUM = makeStateRule(Blocks.MYCELIUM);
    private static final SurfaceRules.RuleSource GRASS_BLOCK = makeStateRule(Blocks.GRASS_BLOCK);
    private static final SurfaceRules.RuleSource CALCITE = makeStateRule(Blocks.CALCITE);
    private static final SurfaceRules.RuleSource GRAVEL = makeStateRule(Blocks.GRAVEL);
    private static final SurfaceRules.RuleSource SAND = makeStateRule(Blocks.SAND);
    private static final SurfaceRules.RuleSource SANDSTONE = makeStateRule(Blocks.SANDSTONE);
    private static final SurfaceRules.RuleSource PACKED_ICE = makeStateRule(Blocks.PACKED_ICE);
    private static final SurfaceRules.RuleSource SNOW_BLOCK = makeStateRule(Blocks.SNOW_BLOCK);
    private static final SurfaceRules.RuleSource POWDER_SNOW = makeStateRule(Blocks.POWDER_SNOW);
    private static final SurfaceRules.RuleSource ICE = makeStateRule(Blocks.ICE);
    private static final SurfaceRules.RuleSource WATER = makeStateRule(Blocks.WATER);
    private static final SurfaceRules.RuleSource LAVA = makeStateRule(Blocks.LAVA);
    private static final SurfaceRules.RuleSource MAGMA = makeStateRule(Blocks.MAGMA_BLOCK);
    private static final SurfaceRules.RuleSource OBSIDIAN = makeStateRule(Blocks.OBSIDIAN);
    private static final SurfaceRules.RuleSource TUFF = makeStateRule(Blocks.TUFF);
    private static final SurfaceRules.RuleSource SMOOTH_BASALT = makeStateRule(Blocks.SMOOTH_BASALT);

    // Nether
    private static final SurfaceRules.RuleSource NETHERRACK = makeStateRule(Blocks.NETHERRACK);
    private static final SurfaceRules.RuleSource SOUL_SAND = makeStateRule(Blocks.SOUL_SAND);
    private static final SurfaceRules.RuleSource SOUL_SOIL = makeStateRule(Blocks.SOUL_SOIL);
    private static final SurfaceRules.RuleSource BASALT = makeStateRule(Blocks.BASALT);
    private static final SurfaceRules.RuleSource BLACKSTONE = makeStateRule(Blocks.BLACKSTONE);
    private static final SurfaceRules.RuleSource WARPED_WART_BLOCK = makeStateRule(Blocks.WARPED_WART_BLOCK);
    private static final SurfaceRules.RuleSource WARPED_NYLIUM = makeStateRule(Blocks.WARPED_NYLIUM);
    private static final SurfaceRules.RuleSource NETHER_WART_BLOCK = makeStateRule(Blocks.NETHER_WART_BLOCK);
    private static final SurfaceRules.RuleSource CRIMSON_NYLIUM = makeStateRule(Blocks.CRIMSON_NYLIUM);
    private static final SurfaceRules.RuleSource ENDSTONE = makeStateRule(Blocks.END_STONE);

    // BOP
    private static final SurfaceRules.RuleSource DRIED_SALT = makeStateRule(BOPBlocks.DRIED_SALT.get());
    private static final SurfaceRules.RuleSource ORANGE_SAND = makeStateRule(BOPBlocks.ORANGE_SAND.get());
    private static final SurfaceRules.RuleSource ORANGE_SANDSTONE = makeStateRule(BOPBlocks.ORANGE_SANDSTONE.get());
    private static final SurfaceRules.RuleSource BLACK_SAND = makeStateRule(BOPBlocks.BLACK_SAND.get());
    private static final SurfaceRules.RuleSource BLACK_SANDSTONE = makeStateRule(BOPBlocks.BLACK_SANDSTONE.get());
    private static final SurfaceRules.RuleSource ORIGIN_GRASS = makeStateRule(BOPBlocks.ORIGIN_GRASS_BLOCK.get());
    private static final SurfaceRules.RuleSource FLESH = makeStateRule(BOPBlocks.FLESH.get());
    private static final SurfaceRules.RuleSource BRIMSTONE = makeStateRule(BOPBlocks.BRIMSTONE.get());

    private static SurfaceRules.RuleSource makeStateRule(Block p_194811_) {
        return SurfaceRules.state(p_194811_.defaultBlockState());
    }

    public static SurfaceRules.RuleSource overworld() {
        return overworldLike(true, false, true);
    }

    public static SurfaceRules.RuleSource overworldLike(boolean checkAbovePreliminarySurface, boolean p_198382_, boolean p_198383_) {
        SurfaceRules.ConditionSource above97 = SurfaceRules.yBlockCheck(VerticalAnchor.absolute(97), 2);
        SurfaceRules.ConditionSource above256 = SurfaceRules.yBlockCheck(VerticalAnchor.absolute(256), 0);
        SurfaceRules.ConditionSource above63_1 = SurfaceRules.yStartCheck(VerticalAnchor.absolute(63), -1);
        SurfaceRules.ConditionSource above74 = SurfaceRules.yStartCheck(VerticalAnchor.absolute(74), 1);
        SurfaceRules.ConditionSource above62 = SurfaceRules.yBlockCheck(VerticalAnchor.absolute(62), 0);
        SurfaceRules.ConditionSource above63_0 = SurfaceRules.yBlockCheck(VerticalAnchor.absolute(63), 0);

        SurfaceRules.ConditionSource isAtOrAboveWaterLevel = SurfaceRules.waterBlockCheck(-1, 0);
        SurfaceRules.ConditionSource isAboveWaterLevel = SurfaceRules.waterBlockCheck(0, 0);
        SurfaceRules.ConditionSource surfacerules$conditionsource8 = SurfaceRules.waterStartCheck(-6, -1);
        SurfaceRules.ConditionSource isHole = SurfaceRules.hole();
        SurfaceRules.ConditionSource isFrozenOcean = SurfaceRules.isBiome(Biomes.FROZEN_OCEAN, Biomes.DEEP_FROZEN_OCEAN);
        SurfaceRules.ConditionSource isSteep = SurfaceRules.steep();

        SurfaceRules.RuleSource grassSurface = SurfaceRules.sequence(SurfaceRules.ifTrue(isAtOrAboveWaterLevel, GRASS_BLOCK), DIRT);
        SurfaceRules.RuleSource sandstoneLinedSand = SurfaceRules.sequence(SurfaceRules.ifTrue(SurfaceRules.ON_CEILING, SANDSTONE), SAND);
        SurfaceRules.RuleSource stoneLinedGravel = SurfaceRules.sequence(SurfaceRules.ifTrue(SurfaceRules.ON_CEILING, STONE), GRAVEL);

        SurfaceRules.ConditionSource isSandstoneLiningBiome = SurfaceRules.isBiome(Biomes.WARM_OCEAN, Biomes.DESERT, Biomes.BEACH, Biomes.SNOWY_BEACH, BOPBiomes.DUNE_BEACH);

        SurfaceRules.RuleSource surfacerules$rulesource3 = SurfaceRules.sequence(
            SurfaceRules.ifTrue(
                SurfaceRules.isBiome(Biomes.STONY_PEAKS),
                SurfaceRules.sequence(
                    SurfaceRules.ifTrue(SurfaceRules.noiseCondition(Noises.CALCITE, -0.0125D, 0.0125D), CALCITE),
                    STONE
                )
            ),
            SurfaceRules.ifTrue(
                SurfaceRules.isBiome(Biomes.STONY_SHORE),
                SurfaceRules.sequence(SurfaceRules.ifTrue(SurfaceRules.noiseCondition(Noises.GRAVEL, -0.05D, 0.05D), stoneLinedGravel), STONE)
            ),
            SurfaceRules.ifTrue(
                SurfaceRules.isBiome(Biomes.WINDSWEPT_HILLS), SurfaceRules.ifTrue(surfaceNoiseAbove(1.0D), STONE)
            ),
            SurfaceRules.ifTrue(isSandstoneLiningBiome, sandstoneLinedSand),
            SurfaceRules.ifTrue(SurfaceRules.isBiome(Biomes.DRIPSTONE_CAVES), STONE)
        );

        SurfaceRules.RuleSource surfacerules$rulesource4 = SurfaceRules.ifTrue(SurfaceRules.noiseCondition(Noises.POWDER_SNOW, 0.45D, 0.58D), POWDER_SNOW);
        SurfaceRules.RuleSource surfacerules$rulesource5 = SurfaceRules.ifTrue(SurfaceRules.noiseCondition(Noises.POWDER_SNOW, 0.35D, 0.6D), POWDER_SNOW);
        SurfaceRules.RuleSource surfacerules$rulesource6 = SurfaceRules.sequence(
            SurfaceRules.ifTrue(
                SurfaceRules.isBiome(Biomes.FROZEN_PEAKS),
                SurfaceRules.sequence(
                    SurfaceRules.ifTrue(isSteep, PACKED_ICE),
                    SurfaceRules.ifTrue(SurfaceRules.noiseCondition(Noises.PACKED_ICE, -0.5D, 0.2D), PACKED_ICE),
                    SurfaceRules.ifTrue(SurfaceRules.noiseCondition(Noises.ICE, -0.0625D, 0.025D), ICE), SNOW_BLOCK
                )
            ),
            SurfaceRules.ifTrue(
                SurfaceRules.isBiome(Biomes.SNOWY_SLOPES),
                SurfaceRules.sequence(
                    SurfaceRules.ifTrue(isSteep, STONE), surfacerules$rulesource4, SNOW_BLOCK
                )
            ),
            SurfaceRules.ifTrue(SurfaceRules.isBiome(Biomes.JAGGED_PEAKS), STONE),
            SurfaceRules.ifTrue(
                SurfaceRules.isBiome(Biomes.GROVE),
                SurfaceRules.sequence(surfacerules$rulesource4, DIRT)
            ),
            surfacerules$rulesource3,
            SurfaceRules.ifTrue(
                SurfaceRules.isBiome(Biomes.WINDSWEPT_SAVANNA),
                SurfaceRules.ifTrue(surfaceNoiseAbove(1.75D), STONE)
            ),
            SurfaceRules.ifTrue(
                SurfaceRules.isBiome(Biomes.WINDSWEPT_GRAVELLY_HILLS),
                SurfaceRules.sequence(
                    SurfaceRules.ifTrue(surfaceNoiseAbove(2.0D), stoneLinedGravel),
                    SurfaceRules.ifTrue(surfaceNoiseAbove(1.0D), STONE),
                    SurfaceRules.ifTrue(surfaceNoiseAbove(-1.0D), DIRT),
                    stoneLinedGravel
                )
            ),
            DIRT
        );

        SurfaceRules.RuleSource atOrAboveWaterLevelRules = SurfaceRules.sequence(
            SurfaceRules.ifTrue(
                SurfaceRules.isBiome(Biomes.FROZEN_PEAKS),
                SurfaceRules.sequence(
                    SurfaceRules.ifTrue(isSteep, PACKED_ICE),
                    SurfaceRules.ifTrue(SurfaceRules.noiseCondition(Noises.PACKED_ICE, 0.0D, 0.2D), PACKED_ICE),
                    SurfaceRules.ifTrue(SurfaceRules.noiseCondition(Noises.ICE, 0.0D, 0.025D), ICE), SNOW_BLOCK
                )
            ),
            SurfaceRules.ifTrue(
                SurfaceRules.isBiome(Biomes.SNOWY_SLOPES),
                SurfaceRules.sequence(
                    SurfaceRules.ifTrue(isSteep, STONE),
                    surfacerules$rulesource5, SNOW_BLOCK
                )
            ),
            SurfaceRules.ifTrue(
                SurfaceRules.isBiome(Biomes.JAGGED_PEAKS),
                SurfaceRules.sequence(
                    SurfaceRules.ifTrue(isSteep, STONE),
                    SNOW_BLOCK
                )
            ),
            SurfaceRules.ifTrue(
                SurfaceRules.isBiome(Biomes.GROVE),
                SurfaceRules.sequence(surfacerules$rulesource5, SNOW_BLOCK)
            ),
            surfacerules$rulesource3,
            SurfaceRules.ifTrue(
                SurfaceRules.isBiome(Biomes.WINDSWEPT_SAVANNA),
                SurfaceRules.sequence(
                    SurfaceRules.ifTrue(surfaceNoiseAbove(1.75D), STONE),
                    SurfaceRules.ifTrue(surfaceNoiseAbove(-0.5D), COARSE_DIRT)
                )
            ),
            SurfaceRules.ifTrue(
                SurfaceRules.isBiome(Biomes.WINDSWEPT_GRAVELLY_HILLS),
                SurfaceRules.sequence(
                    SurfaceRules.ifTrue(surfaceNoiseAbove(2.0D), stoneLinedGravel),
                    SurfaceRules.ifTrue(surfaceNoiseAbove(1.0D), STONE),
                    SurfaceRules.ifTrue(surfaceNoiseAbove(-1.0D), grassSurface),
                    stoneLinedGravel
                )
            ),
            SurfaceRules.ifTrue(
                SurfaceRules.isBiome(Biomes.OLD_GROWTH_PINE_TAIGA, Biomes.OLD_GROWTH_SPRUCE_TAIGA),
                SurfaceRules.sequence(
                    SurfaceRules.ifTrue(surfaceNoiseAbove(1.75D), COARSE_DIRT),
                    SurfaceRules.ifTrue(surfaceNoiseAbove(-0.95D), PODZOL)
                )
            ),
            SurfaceRules.ifTrue(SurfaceRules.isBiome(Biomes.ICE_SPIKES), SNOW_BLOCK),
            SurfaceRules.ifTrue(SurfaceRules.isBiome(Biomes.MUSHROOM_FIELDS), MYCELIUM),
            grassSurface
        );

        SurfaceRules.ConditionSource surfacerules$conditionsource13 = SurfaceRules.noiseCondition(Noises.SURFACE, -0.909D, -0.5454D);
        SurfaceRules.ConditionSource surfacerules$conditionsource14 = SurfaceRules.noiseCondition(Noises.SURFACE, -0.1818D, 0.1818D);
        SurfaceRules.ConditionSource surfacerules$conditionsource15 = SurfaceRules.noiseCondition(Noises.SURFACE, 0.5454D, 0.909D);
        SurfaceRules.RuleSource surfaceRules = SurfaceRules.sequence(
            makeBOPRules(),
            SurfaceRules.ifTrue(
                SurfaceRules.ON_FLOOR,
                SurfaceRules.sequence(
                    SurfaceRules.ifTrue(
                        SurfaceRules.isBiome(Biomes.WOODED_BADLANDS),
                        SurfaceRules.ifTrue(
                            above97,
                            SurfaceRules.sequence(
                                    SurfaceRules.ifTrue(surfacerules$conditionsource13, COARSE_DIRT),
                                    SurfaceRules.ifTrue(surfacerules$conditionsource14, COARSE_DIRT),
                                    SurfaceRules.ifTrue(surfacerules$conditionsource15, COARSE_DIRT),
                                    grassSurface
                            )
                        )
                    ),
                    SurfaceRules.ifTrue(
                        SurfaceRules.isBiome(Biomes.SWAMP),
                        SurfaceRules.ifTrue(
                            above62,
                            SurfaceRules.ifTrue(SurfaceRules.not(above63_0),
                                    SurfaceRules.ifTrue(
                                            SurfaceRules.noiseCondition(Noises.SWAMP, 0.0D),
                                            WATER
                                    )
                            )
                        )
                    )
                )
            ),
            SurfaceRules.ifTrue(
                SurfaceRules.isBiome(Biomes.BADLANDS, Biomes.ERODED_BADLANDS, Biomes.WOODED_BADLANDS),
                SurfaceRules.sequence(
                    SurfaceRules.ifTrue(
                        SurfaceRules.ON_FLOOR,
                        SurfaceRules.sequence(
                            SurfaceRules.ifTrue(above256, ORANGE_TERRACOTTA),
                            SurfaceRules.ifTrue(
                                above74,
                                SurfaceRules.sequence(
                                    SurfaceRules.ifTrue(surfacerules$conditionsource13, TERRACOTTA),
                                    SurfaceRules.ifTrue(surfacerules$conditionsource14, TERRACOTTA),
                                    SurfaceRules.ifTrue(surfacerules$conditionsource15, TERRACOTTA),
                                    SurfaceRules.bandlands()
                                )
                            ),
                            SurfaceRules.ifTrue(
                                isAtOrAboveWaterLevel,
                                SurfaceRules.sequence(
                                    SurfaceRules.ifTrue(SurfaceRules.ON_CEILING, RED_SANDSTONE),
                                    RED_SAND
                                )
                            ),
                            SurfaceRules.ifTrue(SurfaceRules.not(isHole), ORANGE_TERRACOTTA),
                            SurfaceRules.ifTrue(surfacerules$conditionsource8, WHITE_TERRACOTTA),
                            stoneLinedGravel
                        )
                    ),
                    SurfaceRules.ifTrue(
                        above63_1,
                        SurfaceRules.sequence(
                            SurfaceRules.ifTrue(
                                above63_0,
                                SurfaceRules.ifTrue(SurfaceRules.not(above74), ORANGE_TERRACOTTA)
                            ),
                            SurfaceRules.bandlands()
                        )
                    ),
                    SurfaceRules.ifTrue(
                        SurfaceRules.UNDER_FLOOR,
                        SurfaceRules.ifTrue(surfacerules$conditionsource8, WHITE_TERRACOTTA)
                    )
                )
            ),
            SurfaceRules.ifTrue(
                SurfaceRules.ON_FLOOR,
                SurfaceRules.ifTrue(
                    isAtOrAboveWaterLevel,
                    SurfaceRules.sequence(
                        SurfaceRules.ifTrue(
                            isFrozenOcean,
                            SurfaceRules.ifTrue(
                                isHole,
                                SurfaceRules.sequence(
                                    SurfaceRules.ifTrue(
                                        isAboveWaterLevel,
                                        AIR),
                                    SurfaceRules.ifTrue(SurfaceRules.temperature(), ICE),
                                    WATER
                                )
                            )
                        ),
                        atOrAboveWaterLevelRules
                    )
                )
            ),
            SurfaceRules.ifTrue(
                surfacerules$conditionsource8,
                SurfaceRules.sequence(
                    SurfaceRules.ifTrue(
                        SurfaceRules.ON_FLOOR,
                        SurfaceRules.ifTrue(
                            isFrozenOcean,
                            SurfaceRules.ifTrue(
                                isHole,
                                WATER
                            )
                        )
                    ),
                    SurfaceRules.ifTrue(SurfaceRules.UNDER_FLOOR, surfacerules$rulesource6),
                    SurfaceRules.ifTrue(
                        isSandstoneLiningBiome,
                        SurfaceRules.ifTrue(
                            SurfaceRules.DEEP_UNDER_FLOOR,
                            SANDSTONE
                        )
                    )
                )
            ),
            SurfaceRules.ifTrue(
                SurfaceRules.ON_FLOOR,
                SurfaceRules.sequence(
                    SurfaceRules.ifTrue(
                        SurfaceRules.isBiome(Biomes.FROZEN_PEAKS, Biomes.JAGGED_PEAKS),
                        STONE),
                    SurfaceRules.ifTrue(
                        SurfaceRules.isBiome(Biomes.WARM_OCEAN, Biomes.LUKEWARM_OCEAN, Biomes.DEEP_LUKEWARM_OCEAN),
                        sandstoneLinedSand
                    ),
                    stoneLinedGravel
                )
            )
        );

        ImmutableList.Builder<SurfaceRules.RuleSource> builder = ImmutableList.builder();
        if (p_198382_) {
            builder.add(SurfaceRules.ifTrue(SurfaceRules.not(SurfaceRules.verticalGradient("bedrock_roof", VerticalAnchor.belowTop(5), VerticalAnchor.top())), BEDROCK));
        }

        if (p_198383_) {
            builder.add(SurfaceRules.ifTrue(SurfaceRules.verticalGradient("bedrock_floor", VerticalAnchor.bottom(), VerticalAnchor.aboveBottom(5)), BEDROCK));
        }

        SurfaceRules.RuleSource surfacerules$rulesource9 = SurfaceRules.ifTrue(SurfaceRules.abovePreliminarySurface(), surfaceRules);
        builder.add(checkAbovePreliminarySurface ? surfacerules$rulesource9 : surfaceRules);
        builder.add(SurfaceRules.ifTrue(SurfaceRules.verticalGradient("deepslate", VerticalAnchor.absolute(0), VerticalAnchor.absolute(8)), DEEPSLATE));
        return SurfaceRules.sequence(builder.build().toArray((p_198379_) -> {
            return new SurfaceRules.RuleSource[p_198379_];
        }));
    }

    private static SurfaceRules.RuleSource makeBOPRules()
    {
        // Conditions
        SurfaceRules.ConditionSource isAtOrAboveWaterLevel = SurfaceRules.waterBlockCheck(-1, 0);
        SurfaceRules.ConditionSource sixBelowWater = SurfaceRules.waterStartCheck(-6, -1);
        SurfaceRules.ConditionSource isAbove62 = SurfaceRules.yBlockCheck(VerticalAnchor.absolute(62), 0);
        SurfaceRules.ConditionSource isAbove63 = SurfaceRules.yBlockCheck(VerticalAnchor.absolute(63), 0);

        SurfaceRules.RuleSource powderedSnowSurface = SurfaceRules.sequence(
            SurfaceRules.ifTrue(SurfaceRules.ON_FLOOR, POWDER_SNOW),
            SurfaceRules.ifTrue(SurfaceRules.UNDER_FLOOR, POWDER_SNOW)
        );

        SurfaceRules.RuleSource gravelStoneSurface = SurfaceRules.sequence(
                SurfaceRules.ifTrue(SurfaceRules.ON_FLOOR, GRAVEL),
                SurfaceRules.ifTrue(SurfaceRules.UNDER_FLOOR, STONE)
        );

        SurfaceRules.RuleSource mixedLushDesertSurface = SurfaceRules.sequence(
            SurfaceRules.ifTrue(surfaceNoiseAbove(1.9D), ORANGE_SANDSTONE),
            ORANGE_SAND
        );

        SurfaceRules.RuleSource mixedColdDesertSurface = SurfaceRules.sequence(
            SurfaceRules.ifTrue(surfaceNoiseAbove(2.6D), powderedSnowSurface),
            gravelStoneSurface
        );

        SurfaceRules.RuleSource volcanoSurface = SurfaceRules.sequence(
                SurfaceRules.ifTrue(SurfaceRules.ON_FLOOR, BASALT),
                SMOOTH_BASALT
        );

        // Sandstone linings
        SurfaceRules.RuleSource sandstoneLinedSand = SurfaceRules.sequence(SurfaceRules.ifTrue(SurfaceRules.ON_CEILING, SANDSTONE), SAND);
        SurfaceRules.RuleSource lushDesertSandstoneLinedOrangeSand = SurfaceRules.sequence(SurfaceRules.ifTrue(SurfaceRules.ON_CEILING, ORANGE_SANDSTONE), mixedLushDesertSurface);
        SurfaceRules.RuleSource blackSandstoneLining = SurfaceRules.sequence(SurfaceRules.ifTrue(SurfaceRules.ON_CEILING, BLACK_SANDSTONE), BLACK_SAND);
        SurfaceRules.RuleSource coldDesertStoneLinedGravelSnow = SurfaceRules.sequence(SurfaceRules.ifTrue(SurfaceRules.ON_CEILING, STONE), mixedColdDesertSurface);

        return SurfaceRules.sequence(
            SurfaceRules.ifTrue(SurfaceRules.isBiome(BOPBiomes.CRAG),
                SurfaceRules.ifTrue(surfaceNoiseAbove(1.9D), STONE)
            ),
            SurfaceRules.ifTrue(SurfaceRules.isBiome(BOPBiomes.ROCKY_RAINFOREST),
                SurfaceRules.ifTrue(surfaceNoiseAbove(1.7D), TERRACOTTA)
            ),
            SurfaceRules.ifTrue(
                sixBelowWater,
                SurfaceRules.sequence(
                    SurfaceRules.ifTrue(
                        SurfaceRules.UNDER_FLOOR,
                        SurfaceRules.sequence(
                            SurfaceRules.ifTrue(SurfaceRules.isBiome(BOPBiomes.DRYLAND),
                                SurfaceRules.ifTrue(surfaceNoiseAbove(1.75D), sandstoneLinedSand)
                            ),
                            SurfaceRules.ifTrue(SurfaceRules.isBiome(BOPBiomes.COLD_DESERT), coldDesertStoneLinedGravelSnow),
                            SurfaceRules.ifTrue(SurfaceRules.isBiome(BOPBiomes.LUSH_DESERT), lushDesertSandstoneLinedOrangeSand),
                            SurfaceRules.ifTrue(SurfaceRules.isBiome(BOPBiomes.VOLCANIC_PLAINS), blackSandstoneLining)
                        )
                    ),
                    SurfaceRules.ifTrue(
                        SurfaceRules.DEEP_UNDER_FLOOR,
                        SurfaceRules.sequence(
                            SurfaceRules.ifTrue(SurfaceRules.isBiome(BOPBiomes.DRYLAND),
                                SurfaceRules.ifTrue(surfaceNoiseAbove(1.75D), SANDSTONE)
                            ),
                            SurfaceRules.ifTrue(SurfaceRules.isBiome(BOPBiomes.COLD_DESERT), STONE),
                            SurfaceRules.ifTrue(SurfaceRules.isBiome(BOPBiomes.LUSH_DESERT), ORANGE_SANDSTONE),
                            SurfaceRules.ifTrue(SurfaceRules.isBiome(BOPBiomes.VOLCANIC_PLAINS), BLACK_SANDSTONE)
                        )
                    )
                )
            ),
            SurfaceRules.ifTrue(
                SurfaceRules.ON_FLOOR,
                SurfaceRules.sequence(
                    SurfaceRules.ifTrue(
                        // Swamp water noise
                        SurfaceRules.isBiome(BOPBiomes.MARSH, BOPBiomes.FLOODPLAIN),
                        SurfaceRules.ifTrue(
                            isAbove62,
                            SurfaceRules.ifTrue(
                                SurfaceRules.not(isAbove63),
                                SurfaceRules.ifTrue(
                                    SurfaceRules.noiseCondition(Noises.SWAMP, 0.0D),
                                    WATER
                                )
                            )
                        )
                    ),
                    SurfaceRules.ifTrue(
                        // Grass substitutes
                        isAtOrAboveWaterLevel,
                        SurfaceRules.sequence(
                            SurfaceRules.ifTrue(
                                SurfaceRules.isBiome(BOPBiomes.LUSH_SAVANNA),
                                SurfaceRules.ifTrue(surfaceNoiseAbove(2.0D), ORANGE_SAND)
                            ),
                            SurfaceRules.ifTrue(
                                SurfaceRules.isBiome(BOPBiomes.GRASSLAND),
                                SurfaceRules.ifTrue(surfaceNoiseAbove(1.7D), COARSE_DIRT)
                            ),
                            SurfaceRules.ifTrue(
                                SurfaceRules.isBiome(BOPBiomes.HOT_SPRINGS),
                                SurfaceRules.ifTrue(surfaceNoiseAbove(2.0D), COARSE_DIRT)
                            ),
                            SurfaceRules.ifTrue(
                                SurfaceRules.isBiome(BOPBiomes.OLD_GROWTH_WOODLAND),
                                SurfaceRules.ifTrue(surfaceNoiseAbove(2.6D), COARSE_DIRT)
                            ),
                            SurfaceRules.ifTrue(
                                SurfaceRules.isBiome(BOPBiomes.OLD_GROWTH_DEAD_FOREST),
                                SurfaceRules.ifTrue(surfaceNoiseAbove(2.3D), PODZOL)
                            ),
                            SurfaceRules.ifTrue(
                                SurfaceRules.isBiome(BOPBiomes.MEDITERRANEAN_FOREST),
                                SurfaceRules.ifTrue(surfaceNoiseAbove(1.9D), PODZOL)
                            ),
                            SurfaceRules.ifTrue(SurfaceRules.isBiome(BOPBiomes.ORIGIN_VALLEY), ORIGIN_GRASS),
                            SurfaceRules.ifTrue(SurfaceRules.isBiome(BOPBiomes.REDWOOD_FOREST), PODZOL)
                        )
                    ),
                    SurfaceRules.ifTrue(
                        // Underwater lining
                        SurfaceRules.not(isAtOrAboveWaterLevel),
                        SurfaceRules.sequence(
                            SurfaceRules.ifTrue(SurfaceRules.isBiome(BOPBiomes.CRAG, BOPBiomes.ROCKY_RAINFOREST), GRAVEL),
                            SurfaceRules.ifTrue(
                                SurfaceRules.isBiome(BOPBiomes.VOLCANO),
                                SurfaceRules.ifTrue(surfaceNoiseAbove(2.7D), SMOOTH_BASALT)
                            )
                        )
                    )
                )
            ),
            SurfaceRules.ifTrue(SurfaceRules.isBiome(BOPBiomes.COLD_DESERT),
                SurfaceRules.sequence(
                    SurfaceRules.ifTrue(surfaceNoiseAbove(2.6D), powderedSnowSurface),
                    gravelStoneSurface
                )
            ),
            SurfaceRules.ifTrue(SurfaceRules.isBiome(BOPBiomes.CRAG), STONE),
            SurfaceRules.ifTrue(
                SurfaceRules.isBiome(BOPBiomes.VOLCANO),
                SurfaceRules.sequence(
                    SurfaceRules.ifTrue(surfaceNoiseAbove(2.8D), MAGMA),
                    volcanoSurface
                )
            ),
            SurfaceRules.ifTrue(
                SurfaceRules.isBiome(BOPBiomes.ROCKY_SHRUBLAND),
                SurfaceRules.ifTrue(surfaceNoiseAbove(1.7D), STONE)
            ),
            SurfaceRules.ifTrue(SurfaceRules.isBiome(BOPBiomes.WASTELAND), DRIED_SALT)
        );
    }

    private static SurfaceRules.RuleSource makeBOPNetherRules()
    {
        SurfaceRules.ConditionSource isAbove30 = SurfaceRules.yStartCheck(VerticalAnchor.absolute(30), 0);
        SurfaceRules.ConditionSource isBelow35 = SurfaceRules.not(SurfaceRules.yStartCheck(VerticalAnchor.absolute(35), 0));
        SurfaceRules.ConditionSource isSuitablePatchNoise = SurfaceRules.noiseCondition(Noises.PATCH, -0.012D);
        SurfaceRules.ConditionSource isStateSelectorNoiseSuitable = SurfaceRules.noiseCondition(Noises.NETHER_STATE_SELECTOR, 0.2D);

        SurfaceRules.RuleSource obsidianPatchRules = SurfaceRules.ifTrue(isSuitablePatchNoise, SurfaceRules.ifTrue(isAbove30, SurfaceRules.ifTrue(isBelow35, OBSIDIAN)));
        SurfaceRules.RuleSource tuffPatchRules = SurfaceRules.ifTrue(isSuitablePatchNoise, SurfaceRules.ifTrue(isAbove30, SurfaceRules.ifTrue(isBelow35, TUFF)));

        return SurfaceRules.sequence(
            SurfaceRules.ifTrue(
                SurfaceRules.isBiome(BOPBiomes.ERUPTING_INFERNO),
                SurfaceRules.sequence(
                    SurfaceRules.ifTrue(SurfaceRules.UNDER_CEILING, NETHERRACK),
                    SurfaceRules.ifTrue(SurfaceRules.UNDER_FLOOR,
                        SurfaceRules.sequence(
                            tuffPatchRules,
                            SurfaceRules.ifTrue(isStateSelectorNoiseSuitable, NETHERRACK),
                            BRIMSTONE
                        )
                    )
                )
            ),
            SurfaceRules.ifTrue(
                SurfaceRules.isBiome(BOPBiomes.VISCERAL_HEAP),
                SurfaceRules.sequence(
                    SurfaceRules.ifTrue(SurfaceRules.UNDER_CEILING, FLESH),
                    SurfaceRules.ifTrue(SurfaceRules.UNDER_FLOOR, FLESH)
                )
            ),
            SurfaceRules.ifTrue(
                SurfaceRules.isBiome(BOPBiomes.WITHERED_ABYSS),
                SurfaceRules.sequence(
                    SurfaceRules.ifTrue(SurfaceRules.UNDER_CEILING, BLACKSTONE),
                    SurfaceRules.ifTrue(SurfaceRules.UNDER_FLOOR,
                        SurfaceRules.sequence(
                            obsidianPatchRules,
                            BLACKSTONE
                        )
                    )
                )
            )
        );
    }

    public static SurfaceRules.RuleSource nether()
    {
        SurfaceRules.ConditionSource isAbove31 = SurfaceRules.yBlockCheck(VerticalAnchor.absolute(31), 0);
        SurfaceRules.ConditionSource surfacerules$conditionsource1 = SurfaceRules.yBlockCheck(VerticalAnchor.absolute(32), 0);
        SurfaceRules.ConditionSource yStart30 = SurfaceRules.yStartCheck(VerticalAnchor.absolute(30), 0);
        SurfaceRules.ConditionSource isBelow35 = SurfaceRules.not(SurfaceRules.yStartCheck(VerticalAnchor.absolute(35), 0));
        SurfaceRules.ConditionSource isTop5Blocks = SurfaceRules.yBlockCheck(VerticalAnchor.belowTop(5), 0);
        SurfaceRules.ConditionSource isHole = SurfaceRules.hole();
        SurfaceRules.ConditionSource isSuitableSoulSandNoise = SurfaceRules.noiseCondition(Noises.SOUL_SAND_LAYER, -0.012D);
        SurfaceRules.ConditionSource surfacerules$conditionsource7 = SurfaceRules.noiseCondition(Noises.GRAVEL_LAYER, -0.012D);
        SurfaceRules.ConditionSource isSuitablePatchNoise = SurfaceRules.noiseCondition(Noises.PATCH, -0.012D);
        SurfaceRules.ConditionSource isSuitableNetherrackNoise = SurfaceRules.noiseCondition(Noises.NETHERRACK, 0.54D);
        SurfaceRules.ConditionSource surfacerules$conditionsource10 = SurfaceRules.noiseCondition(Noises.NETHER_WART, 1.17D);
        SurfaceRules.ConditionSource isStateSelectorNoiseSuitable = SurfaceRules.noiseCondition(Noises.NETHER_STATE_SELECTOR, 0.0D);

        SurfaceRules.RuleSource gravelPatchRules = SurfaceRules.ifTrue(isSuitablePatchNoise, SurfaceRules.ifTrue(yStart30, SurfaceRules.ifTrue(isBelow35, GRAVEL)));

        return SurfaceRules.sequence(
            SurfaceRules.ifTrue(
                SurfaceRules.verticalGradient("bedrock_floor", VerticalAnchor.bottom(), VerticalAnchor.aboveBottom(5)),
                BEDROCK
            ),
            SurfaceRules.ifTrue(SurfaceRules.not(SurfaceRules.verticalGradient("bedrock_roof", VerticalAnchor.belowTop(5), VerticalAnchor.top())), BEDROCK),
            SurfaceRules.ifTrue(isTop5Blocks, NETHERRACK),
            makeBOPNetherRules(),
            SurfaceRules.ifTrue(
                SurfaceRules.isBiome(Biomes.BASALT_DELTAS),
                SurfaceRules.sequence(
                    SurfaceRules.ifTrue(SurfaceRules.UNDER_CEILING, BASALT),
                    SurfaceRules.ifTrue(SurfaceRules.UNDER_FLOOR,
                        SurfaceRules.sequence(
                            gravelPatchRules,
                            SurfaceRules.ifTrue(isStateSelectorNoiseSuitable, BASALT),
                            BLACKSTONE
                        )
                    )
                )
            ),
            SurfaceRules.ifTrue(
                SurfaceRules.isBiome(Biomes.SOUL_SAND_VALLEY),
                SurfaceRules.sequence(
                    SurfaceRules.ifTrue(
                        SurfaceRules.UNDER_CEILING,
                        SurfaceRules.sequence(
                            SurfaceRules.ifTrue(isStateSelectorNoiseSuitable, SOUL_SAND), SOUL_SOIL
                        )
                    ),
                    SurfaceRules.ifTrue(
                        SurfaceRules.UNDER_FLOOR,
                        SurfaceRules.sequence(
                            gravelPatchRules,
                            SurfaceRules.ifTrue(isStateSelectorNoiseSuitable, SOUL_SAND),
                            SOUL_SOIL
                        )
                    )
                )
            ),
            SurfaceRules.ifTrue(
                SurfaceRules.ON_FLOOR,
                SurfaceRules.sequence(
                    SurfaceRules.ifTrue(
                        SurfaceRules.not(surfacerules$conditionsource1),
                        SurfaceRules.ifTrue(isHole, LAVA)
                    ),
                    SurfaceRules.ifTrue(
                        SurfaceRules.isBiome(Biomes.WARPED_FOREST),
                        SurfaceRules.ifTrue(
                            SurfaceRules.not(isSuitableNetherrackNoise),
                            SurfaceRules.ifTrue(
                                isAbove31,
                                SurfaceRules.sequence(
                                    SurfaceRules.ifTrue(surfacerules$conditionsource10, WARPED_WART_BLOCK),
                                    WARPED_NYLIUM
                                )
                            )
                        )
                    ),
                    SurfaceRules.ifTrue(
                        SurfaceRules.isBiome(Biomes.CRIMSON_FOREST),
                        SurfaceRules.ifTrue(
                            SurfaceRules.not(isSuitableNetherrackNoise),
                            SurfaceRules.ifTrue(isAbove31,
                                SurfaceRules.sequence(
                                    SurfaceRules.ifTrue(surfacerules$conditionsource10, NETHER_WART_BLOCK),
                                    CRIMSON_NYLIUM
                                )
                            )
                        )
                    )
                )
            ), SurfaceRules.ifTrue(SurfaceRules.isBiome(Biomes.NETHER_WASTES), SurfaceRules.sequence(SurfaceRules.ifTrue(SurfaceRules.UNDER_FLOOR, SurfaceRules.ifTrue(isSuitableSoulSandNoise, SurfaceRules.sequence(SurfaceRules.ifTrue(SurfaceRules.not(isHole), SurfaceRules.ifTrue(yStart30, SurfaceRules.ifTrue(isBelow35, SOUL_SAND))), NETHERRACK))), SurfaceRules.ifTrue(SurfaceRules.ON_FLOOR, SurfaceRules.ifTrue(isAbove31, SurfaceRules.ifTrue(isBelow35, SurfaceRules.ifTrue(surfacerules$conditionsource7, SurfaceRules.sequence(SurfaceRules.ifTrue(surfacerules$conditionsource1, GRAVEL), SurfaceRules.ifTrue(SurfaceRules.not(isHole), GRAVEL)))))))), NETHERRACK);
    }

    private static SurfaceRules.ConditionSource surfaceNoiseAbove(double p_194809_) {
        return SurfaceRules.noiseCondition(Noises.SURFACE, p_194809_ / 8.25D, Double.MAX_VALUE);
    }
}
