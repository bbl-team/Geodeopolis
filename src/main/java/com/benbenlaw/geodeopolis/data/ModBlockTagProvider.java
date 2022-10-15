package com.benbenlaw.geodeopolis.data;


import com.benbenlaw.geodeopolis.Geodeopolis;
import com.benbenlaw.geodeopolis.block.ModBlocks;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModBlockTagProvider extends BlockTagsProvider {
    public ModBlockTagProvider(DataGenerator generator, String modId, ExistingFileHelper existingFileHelper) {
        super(generator, Geodeopolis.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags() {

        tag(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.BUDDING_TIN.get())
                .add(ModBlocks.TIN_SHARD_BLOCK.get())      
                
                .add(ModBlocks.BUDDING_COPPER.get())
                .add(ModBlocks.COPPER_SHARD_BLOCK.get())
                
                .add(ModBlocks.BUDDING_DEBRIS.get())
                .add(ModBlocks.DEBRIS_SHARD_BLOCK.get())
                
                .add(ModBlocks.BUDDING_GOLD.get())
                .add(ModBlocks.GOLD_SHARD_BLOCK.get())
                
                .add(ModBlocks.BUDDING_IRON.get())
                .add(ModBlocks.IRON_SHARD_BLOCK.get())
                
                .add(ModBlocks.BUDDING_OSMIUM.get())
                .add(ModBlocks.OSMIUM_SHARD_BLOCK.get())
                
                .add(ModBlocks.BUDDING_SILVER.get())
                .add(ModBlocks.SILVER_SHARD_BLOCK.get())
        
                .add(ModBlocks.BUDDING_URANIUM.get())
                .add(ModBlocks.URANIUM_SHARD_BLOCK.get());


        tag(BlockTags.MINEABLE_WITH_PICKAXE)

                .add(ModBlocks.SMALL_TIN_BUD.get())
                .add(ModBlocks.MEDIUM_TIN_BUD.get())
                .add(ModBlocks.LARGE_TIN_BUD.get())
                .add(ModBlocks.TIN_CLUSTER.get())
                .add(ModBlocks.BUDDING_TIN.get())
                .add(ModBlocks.TIN_SHARD_BLOCK.get() )        
        
                .add(ModBlocks.SMALL_COPPER_BUD.get())
                .add(ModBlocks.MEDIUM_COPPER_BUD.get())
                .add(ModBlocks.LARGE_COPPER_BUD.get())
                .add(ModBlocks.COPPER_CLUSTER.get())
                .add(ModBlocks.BUDDING_COPPER.get())
                .add(ModBlocks.COPPER_SHARD_BLOCK.get())
                
                .add(ModBlocks.SMALL_URANIUM_BUD.get())
                .add(ModBlocks.MEDIUM_URANIUM_BUD.get())
                .add(ModBlocks.LARGE_URANIUM_BUD.get())
                .add(ModBlocks.URANIUM_CLUSTER.get())
                .add(ModBlocks.BUDDING_URANIUM.get())
                .add(ModBlocks.URANIUM_SHARD_BLOCK.get())                
                
                .add(ModBlocks.SMALL_GOLD_BUD.get())
                .add(ModBlocks.MEDIUM_GOLD_BUD.get())
                .add(ModBlocks.LARGE_GOLD_BUD.get())
                .add(ModBlocks.GOLD_CLUSTER.get())
                .add(ModBlocks.BUDDING_GOLD.get())
                .add(ModBlocks.GOLD_SHARD_BLOCK.get())
                
                .add(ModBlocks.SMALL_IRON_BUD.get())
                .add(ModBlocks.MEDIUM_IRON_BUD.get())
                .add(ModBlocks.LARGE_IRON_BUD.get())
                .add(ModBlocks.IRON_CLUSTER.get())
                .add(ModBlocks.BUDDING_IRON.get())
                .add(ModBlocks.IRON_SHARD_BLOCK.get())                
                
                .add(ModBlocks.SMALL_OSMIUM_BUD.get())
                .add(ModBlocks.MEDIUM_OSMIUM_BUD.get())
                .add(ModBlocks.LARGE_OSMIUM_BUD.get())
                .add(ModBlocks.OSMIUM_CLUSTER.get())
                .add(ModBlocks.BUDDING_OSMIUM.get())
                .add(ModBlocks.OSMIUM_SHARD_BLOCK.get())
                
                .add(ModBlocks.SMALL_SILVER_BUD.get())
                .add(ModBlocks.MEDIUM_SILVER_BUD.get())
                .add(ModBlocks.LARGE_SILVER_BUD.get())
                .add(ModBlocks.SILVER_CLUSTER.get())
                .add(ModBlocks.BUDDING_SILVER.get())
                .add(ModBlocks.SILVER_SHARD_BLOCK.get())
        
                .add(ModBlocks.SMALL_DEBRIS_BUD.get())
                .add(ModBlocks.MEDIUM_DEBRIS_BUD.get())
                .add(ModBlocks.LARGE_DEBRIS_BUD.get())
                .add(ModBlocks.DEBRIS_CLUSTER.get())
                .add(ModBlocks.BUDDING_DEBRIS.get())
                .add(ModBlocks.DEBRIS_SHARD_BLOCK.get());
    }

}