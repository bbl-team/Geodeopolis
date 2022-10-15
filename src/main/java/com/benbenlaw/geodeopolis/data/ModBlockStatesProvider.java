package com.benbenlaw.geodeopolis.data;

import com.benbenlaw.geodeopolis.Geodeopolis;
import com.benbenlaw.geodeopolis.block.ModBlocks;

import net.minecraft.data.DataGenerator;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.client.model.generators.VariantBlockStateBuilder;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;

public class ModBlockStatesProvider extends BlockStateProvider {

    public ModBlockStatesProvider(DataGenerator gen, ExistingFileHelper exFileHelper) {
        super(gen, Geodeopolis.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {


        simpleBlock(ModBlocks.BUDDING_TIN.get());
        simpleBlock(ModBlocks.TIN_SHARD_BLOCK.get());
        directionalBlock(ModBlocks.SMALL_TIN_BUD.get(), models().cross("small_tin_bud", modLoc("block/small_tin_bud")).renderType("cutout"));
        directionalBlock(ModBlocks.MEDIUM_TIN_BUD.get(), models().cross("medium_tin_bud", modLoc("block/medium_tin_bud")).renderType("cutout"));
        directionalBlock(ModBlocks.LARGE_TIN_BUD.get(), models().cross("large_tin_bud", modLoc("block/large_tin_bud")).renderType("cutout"));
        directionalBlock(ModBlocks.TIN_CLUSTER.get(), models().cross("tin_cluster", modLoc("block/tin_cluster")).renderType("cutout"));
       
        simpleBlock(ModBlocks.BUDDING_COPPER.get());
        simpleBlock(ModBlocks.COPPER_SHARD_BLOCK.get());
        directionalBlock(ModBlocks.SMALL_COPPER_BUD.get(), models().cross("small_copper_bud", modLoc("block/small_copper_bud")).renderType("cutout"));
        directionalBlock(ModBlocks.MEDIUM_COPPER_BUD.get(), models().cross("medium_copper_bud", modLoc("block/medium_copper_bud")).renderType("cutout"));
        directionalBlock(ModBlocks.LARGE_COPPER_BUD.get(), models().cross("large_copper_bud", modLoc("block/large_copper_bud")).renderType("cutout"));
        directionalBlock(ModBlocks.COPPER_CLUSTER.get(), models().cross("copper_cluster", modLoc("block/copper_cluster")).renderType("cutout"));
       
        simpleBlock(ModBlocks.BUDDING_DEBRIS.get());
        simpleBlock(ModBlocks.DEBRIS_SHARD_BLOCK.get());
        directionalBlock(ModBlocks.SMALL_DEBRIS_BUD.get(), models().cross("small_debris_bud", modLoc("block/small_debris_bud")).renderType("cutout"));
        directionalBlock(ModBlocks.MEDIUM_DEBRIS_BUD.get(), models().cross("medium_debris_bud", modLoc("block/medium_debris_bud")).renderType("cutout"));
        directionalBlock(ModBlocks.LARGE_DEBRIS_BUD.get(), models().cross("large_debris_bud", modLoc("block/large_debris_bud")).renderType("cutout"));
        directionalBlock(ModBlocks.DEBRIS_CLUSTER.get(), models().cross("debris_cluster", modLoc("block/debris_cluster")).renderType("cutout"));
        
        simpleBlock(ModBlocks.BUDDING_GOLD.get());
        simpleBlock(ModBlocks.GOLD_SHARD_BLOCK.get());
        directionalBlock(ModBlocks.SMALL_GOLD_BUD.get(), models().cross("small_gold_bud", modLoc("block/small_gold_bud")).renderType("cutout"));
        directionalBlock(ModBlocks.MEDIUM_GOLD_BUD.get(), models().cross("medium_gold_bud", modLoc("block/medium_gold_bud")).renderType("cutout"));
        directionalBlock(ModBlocks.LARGE_GOLD_BUD.get(), models().cross("large_gold_bud", modLoc("block/large_gold_bud")).renderType("cutout"));
        directionalBlock(ModBlocks.GOLD_CLUSTER.get(), models().cross("gold_cluster", modLoc("block/gold_cluster")).renderType("cutout"));
       
        simpleBlock(ModBlocks.BUDDING_IRON.get());
        simpleBlock(ModBlocks.IRON_SHARD_BLOCK.get());
        directionalBlock(ModBlocks.SMALL_IRON_BUD.get(), models().cross("small_iron_bud", modLoc("block/small_iron_bud")).renderType("cutout"));
        directionalBlock(ModBlocks.MEDIUM_IRON_BUD.get(), models().cross("medium_iron_bud", modLoc("block/medium_iron_bud")).renderType("cutout"));
        directionalBlock(ModBlocks.LARGE_IRON_BUD.get(), models().cross("large_iron_bud", modLoc("block/large_iron_bud")).renderType("cutout"));
        directionalBlock(ModBlocks.IRON_CLUSTER.get(), models().cross("iron_cluster", modLoc("block/iron_cluster")).renderType("cutout"));
       
        simpleBlock(ModBlocks.BUDDING_OSMIUM.get());
        simpleBlock(ModBlocks.OSMIUM_SHARD_BLOCK.get());
        directionalBlock(ModBlocks.SMALL_OSMIUM_BUD.get(), models().cross("small_osmium_bud", modLoc("block/small_osmium_bud")).renderType("cutout"));
        directionalBlock(ModBlocks.MEDIUM_OSMIUM_BUD.get(), models().cross("medium_osmium_bud", modLoc("block/medium_osmium_bud")).renderType("cutout"));
        directionalBlock(ModBlocks.LARGE_OSMIUM_BUD.get(), models().cross("large_osmium_bud", modLoc("block/large_osmium_bud")).renderType("cutout"));
        directionalBlock(ModBlocks.OSMIUM_CLUSTER.get(), models().cross("osmium_cluster", modLoc("block/osmium_cluster")).renderType("cutout"));

        simpleBlock(ModBlocks.BUDDING_SILVER.get());
        simpleBlock(ModBlocks.SILVER_SHARD_BLOCK.get());
        directionalBlock(ModBlocks.SMALL_SILVER_BUD.get(), models().cross("small_silver_bud", modLoc("block/small_silver_bud")).renderType("cutout"));
        directionalBlock(ModBlocks.MEDIUM_SILVER_BUD.get(), models().cross("medium_silver_bud", modLoc("block/medium_silver_bud")).renderType("cutout"));
        directionalBlock(ModBlocks.LARGE_SILVER_BUD.get(), models().cross("large_silver_bud", modLoc("block/large_silver_bud")).renderType("cutout"));
        directionalBlock(ModBlocks.SILVER_CLUSTER.get(), models().cross("silver_cluster", modLoc("block/silver_cluster")).renderType("cutout"));

        simpleBlock(ModBlocks.BUDDING_URANIUM.get());
        simpleBlock(ModBlocks.URANIUM_SHARD_BLOCK.get());
        directionalBlock(ModBlocks.SMALL_URANIUM_BUD.get(), models().cross("small_uranium_bud", modLoc("block/small_uranium_bud")).renderType("cutout"));
        directionalBlock(ModBlocks.MEDIUM_URANIUM_BUD.get(), models().cross("medium_uranium_bud", modLoc("block/medium_uranium_bud")).renderType("cutout"));
        directionalBlock(ModBlocks.LARGE_URANIUM_BUD.get(), models().cross("large_uranium_bud", modLoc("block/large_uranium_bud")).renderType("cutout"));
        directionalBlock(ModBlocks.URANIUM_CLUSTER.get(), models().cross("uranium_cluster", modLoc("block/uranium_cluster")).renderType("cutout"));




         //       cross("small_tin_bud", modLoc("block/small_tin_bud")).renderType("cutout"));

    }
}