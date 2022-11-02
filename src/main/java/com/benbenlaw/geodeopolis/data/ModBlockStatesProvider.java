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
        
        simpleBlock(ModBlocks.BUDDING_ZINC.get());
        simpleBlock(ModBlocks.ZINC_SHARD_BLOCK.get());
        directionalBlock(ModBlocks.SMALL_ZINC_BUD.get(), models().cross("small_zinc_bud", modLoc("block/small_zinc_bud")).renderType("cutout"));
        directionalBlock(ModBlocks.MEDIUM_ZINC_BUD.get(), models().cross("medium_zinc_bud", modLoc("block/medium_zinc_bud")).renderType("cutout"));
        directionalBlock(ModBlocks.LARGE_ZINC_BUD.get(), models().cross("large_zinc_bud", modLoc("block/large_zinc_bud")).renderType("cutout"));
        directionalBlock(ModBlocks.ZINC_CLUSTER.get(), models().cross("zinc_cluster", modLoc("block/zinc_cluster")).renderType("cutout"));
        
        simpleBlock(ModBlocks.BUDDING_LEAD.get());
        simpleBlock(ModBlocks.LEAD_SHARD_BLOCK.get());
        directionalBlock(ModBlocks.SMALL_LEAD_BUD.get(), models().cross("small_lead_bud", modLoc("block/small_lead_bud")).renderType("cutout"));
        directionalBlock(ModBlocks.MEDIUM_LEAD_BUD.get(), models().cross("medium_lead_bud", modLoc("block/medium_lead_bud")).renderType("cutout"));
        directionalBlock(ModBlocks.LARGE_LEAD_BUD.get(), models().cross("large_lead_bud", modLoc("block/large_lead_bud")).renderType("cutout"));
        directionalBlock(ModBlocks.LEAD_CLUSTER.get(), models().cross("lead_cluster", modLoc("block/lead_cluster")).renderType("cutout"));
        
        simpleBlock(ModBlocks.BUDDING_NICKEL.get());
        simpleBlock(ModBlocks.NICKEL_SHARD_BLOCK.get());
        directionalBlock(ModBlocks.SMALL_NICKEL_BUD.get(), models().cross("small_nickel_bud", modLoc("block/small_nickel_bud")).renderType("cutout"));
        directionalBlock(ModBlocks.MEDIUM_NICKEL_BUD.get(), models().cross("medium_nickel_bud", modLoc("block/medium_nickel_bud")).renderType("cutout"));
        directionalBlock(ModBlocks.LARGE_NICKEL_BUD.get(), models().cross("large_nickel_bud", modLoc("block/large_nickel_bud")).renderType("cutout"));
        directionalBlock(ModBlocks.NICKEL_CLUSTER.get(), models().cross("nickel_cluster", modLoc("block/nickel_cluster")).renderType("cutout"));
       
        simpleBlock(ModBlocks.BUDDING_GLOWSTONE.get());
        simpleBlock(ModBlocks.GLOWSTONE_SHARD_BLOCK.get());
        directionalBlock(ModBlocks.SMALL_GLOWSTONE_BUD.get(), models().cross("small_glowstone_bud", modLoc("block/small_glowstone_bud")).renderType("cutout"));
        directionalBlock(ModBlocks.MEDIUM_GLOWSTONE_BUD.get(), models().cross("medium_glowstone_bud", modLoc("block/medium_glowstone_bud")).renderType("cutout"));
        directionalBlock(ModBlocks.LARGE_GLOWSTONE_BUD.get(), models().cross("large_glowstone_bud", modLoc("block/large_glowstone_bud")).renderType("cutout"));
        directionalBlock(ModBlocks.GLOWSTONE_CLUSTER.get(), models().cross("glowstone_cluster", modLoc("block/glowstone_cluster")).renderType("cutout"));
       
        simpleBlock(ModBlocks.BUDDING_ALUMINUM.get());
        simpleBlock(ModBlocks.ALUMINUM_SHARD_BLOCK.get());
        directionalBlock(ModBlocks.SMALL_ALUMINUM_BUD.get(), models().cross("small_aluminum_bud", modLoc("block/small_aluminum_bud")).renderType("cutout"));
        directionalBlock(ModBlocks.MEDIUM_ALUMINUM_BUD.get(), models().cross("medium_aluminum_bud", modLoc("block/medium_aluminum_bud")).renderType("cutout"));
        directionalBlock(ModBlocks.LARGE_ALUMINUM_BUD.get(), models().cross("large_aluminum_bud", modLoc("block/large_aluminum_bud")).renderType("cutout"));
        directionalBlock(ModBlocks.ALUMINUM_CLUSTER.get(), models().cross("aluminum_cluster", modLoc("block/aluminum_cluster")).renderType("cutout"));
       
        simpleBlock(ModBlocks.BUDDING_COAL.get());
        simpleBlock(ModBlocks.COAL_SHARD_BLOCK.get());
        directionalBlock(ModBlocks.SMALL_COAL_BUD.get(), models().cross("small_coal_bud", modLoc("block/small_coal_bud")).renderType("cutout"));
        directionalBlock(ModBlocks.MEDIUM_COAL_BUD.get(), models().cross("medium_coal_bud", modLoc("block/medium_coal_bud")).renderType("cutout"));
        directionalBlock(ModBlocks.LARGE_COAL_BUD.get(), models().cross("large_coal_bud", modLoc("block/large_coal_bud")).renderType("cutout"));
        directionalBlock(ModBlocks.COAL_CLUSTER.get(), models().cross("coal_cluster", modLoc("block/coal_cluster")).renderType("cutout"));
       
        simpleBlock(ModBlocks.BUDDING_REDSTONE.get());
        simpleBlock(ModBlocks.REDSTONE_SHARD_BLOCK.get());
        directionalBlock(ModBlocks.SMALL_REDSTONE_BUD.get(), models().cross("small_redstone_bud", modLoc("block/small_redstone_bud")).renderType("cutout"));
        directionalBlock(ModBlocks.MEDIUM_REDSTONE_BUD.get(), models().cross("medium_redstone_bud", modLoc("block/medium_redstone_bud")).renderType("cutout"));
        directionalBlock(ModBlocks.LARGE_REDSTONE_BUD.get(), models().cross("large_redstone_bud", modLoc("block/large_redstone_bud")).renderType("cutout"));
        directionalBlock(ModBlocks.REDSTONE_CLUSTER.get(), models().cross("redstone_cluster", modLoc("block/redstone_cluster")).renderType("cutout"));
       
        simpleBlock(ModBlocks.BUDDING_QUARTZ.get());
        simpleBlock(ModBlocks.QUARTZ_SHARD_BLOCK.get());
        directionalBlock(ModBlocks.SMALL_QUARTZ_BUD.get(), models().cross("small_quartz_bud", modLoc("block/small_quartz_bud")).renderType("cutout"));
        directionalBlock(ModBlocks.MEDIUM_QUARTZ_BUD.get(), models().cross("medium_quartz_bud", modLoc("block/medium_quartz_bud")).renderType("cutout"));
        directionalBlock(ModBlocks.LARGE_QUARTZ_BUD.get(), models().cross("large_quartz_bud", modLoc("block/large_quartz_bud")).renderType("cutout"));
        directionalBlock(ModBlocks.QUARTZ_CLUSTER.get(), models().cross("quartz_cluster", modLoc("block/quartz_cluster")).renderType("cutout"));
       
        simpleBlock(ModBlocks.BUDDING_DIAMOND.get());
        simpleBlock(ModBlocks.DIAMOND_SHARD_BLOCK.get());
        directionalBlock(ModBlocks.SMALL_DIAMOND_BUD.get(), models().cross("small_diamond_bud", modLoc("block/small_diamond_bud")).renderType("cutout"));
        directionalBlock(ModBlocks.MEDIUM_DIAMOND_BUD.get(), models().cross("medium_diamond_bud", modLoc("block/medium_diamond_bud")).renderType("cutout"));
        directionalBlock(ModBlocks.LARGE_DIAMOND_BUD.get(), models().cross("large_diamond_bud", modLoc("block/large_diamond_bud")).renderType("cutout"));
        directionalBlock(ModBlocks.DIAMOND_CLUSTER.get(), models().cross("diamond_cluster", modLoc("block/diamond_cluster")).renderType("cutout"));
       
        simpleBlock(ModBlocks.BUDDING_EMERALD.get());
        simpleBlock(ModBlocks.EMERALD_SHARD_BLOCK.get());
        directionalBlock(ModBlocks.SMALL_EMERALD_BUD.get(), models().cross("small_emerald_bud", modLoc("block/small_emerald_bud")).renderType("cutout"));
        directionalBlock(ModBlocks.MEDIUM_EMERALD_BUD.get(), models().cross("medium_emerald_bud", modLoc("block/medium_emerald_bud")).renderType("cutout"));
        directionalBlock(ModBlocks.LARGE_EMERALD_BUD.get(), models().cross("large_emerald_bud", modLoc("block/large_emerald_bud")).renderType("cutout"));
        directionalBlock(ModBlocks.EMERALD_CLUSTER.get(), models().cross("emerald_cluster", modLoc("block/emerald_cluster")).renderType("cutout"));
       
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