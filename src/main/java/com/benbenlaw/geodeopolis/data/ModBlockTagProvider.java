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
                
                .add(ModBlocks.BUDDING_ZINC.get())
                .add(ModBlocks.ZINC_SHARD_BLOCK.get())      
                
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
                .add(ModBlocks.URANIUM_SHARD_BLOCK.get())        
        
                .add(ModBlocks.BUDDING_COAL.get())
                .add(ModBlocks.COAL_SHARD_BLOCK.get())    
                
                .add(ModBlocks.BUDDING_REDSTONE.get())
                .add(ModBlocks.REDSTONE_SHARD_BLOCK.get())     
                
                .add(ModBlocks.BUDDING_QUARTZ.get())
                .add(ModBlocks.QUARTZ_SHARD_BLOCK.get())   
                
                .add(ModBlocks.BUDDING_DIAMOND.get())
                .add(ModBlocks.DIAMOND_SHARD_BLOCK.get())
                
                .add(ModBlocks.BUDDING_EMERALD.get())
                .add(ModBlocks.EMERALD_SHARD_BLOCK.get()) 
        
                .add(ModBlocks.BUDDING_ALUMINUM.get())
                .add(ModBlocks.ALUMINUM_SHARD_BLOCK.get())  
                
                .add(ModBlocks.BUDDING_LEAD.get())
                .add(ModBlocks.LEAD_SHARD_BLOCK.get())  
                
                .add(ModBlocks.BUDDING_NICKEL.get())
                .add(ModBlocks.NICKEL_SHARD_BLOCK.get())  
                
                .add(ModBlocks.BUDDING_GLOWSTONE.get())
                .add(ModBlocks.GLOWSTONE_SHARD_BLOCK.get());


        tag(BlockTags.MINEABLE_WITH_PICKAXE)

                .add(ModBlocks.SMALL_TIN_BUD.get())
                .add(ModBlocks.MEDIUM_TIN_BUD.get())
                .add(ModBlocks.LARGE_TIN_BUD.get())
                .add(ModBlocks.TIN_CLUSTER.get())
                .add(ModBlocks.BUDDING_TIN.get())
                .add(ModBlocks.TIN_SHARD_BLOCK.get())
                
                .add(ModBlocks.SMALL_ZINC_BUD.get())
                .add(ModBlocks.MEDIUM_ZINC_BUD.get())
                .add(ModBlocks.LARGE_ZINC_BUD.get())
                .add(ModBlocks.ZINC_CLUSTER.get())
                .add(ModBlocks.BUDDING_ZINC.get())
                .add(ModBlocks.ZINC_SHARD_BLOCK.get())

                .add(ModBlocks.SMALL_LAPIS_BUD.get())
                .add(ModBlocks.MEDIUM_LAPIS_BUD.get())
                .add(ModBlocks.LARGE_LAPIS_BUD.get())
                .add(ModBlocks.LAPIS_CLUSTER.get())
                .add(ModBlocks.BUDDING_LAPIS.get())
                .add(ModBlocks.LAPIS_SHARD_BLOCK.get()) 
                
                .add(ModBlocks.SMALL_LEAD_BUD.get())
                .add(ModBlocks.MEDIUM_LEAD_BUD.get())
                .add(ModBlocks.LARGE_LEAD_BUD.get())
                .add(ModBlocks.LEAD_CLUSTER.get())
                .add(ModBlocks.BUDDING_LEAD.get())
                .add(ModBlocks.LEAD_SHARD_BLOCK.get()) 
                
                .add(ModBlocks.SMALL_NICKEL_BUD.get())
                .add(ModBlocks.MEDIUM_NICKEL_BUD.get())
                .add(ModBlocks.LARGE_NICKEL_BUD.get())
                .add(ModBlocks.NICKEL_CLUSTER.get())
                .add(ModBlocks.BUDDING_NICKEL.get())
                .add(ModBlocks.NICKEL_SHARD_BLOCK.get()) 

                .add(ModBlocks.SMALL_ALUMINUM_BUD.get())
                .add(ModBlocks.MEDIUM_ALUMINUM_BUD.get())
                .add(ModBlocks.LARGE_ALUMINUM_BUD.get())
                .add(ModBlocks.ALUMINUM_CLUSTER.get())
                .add(ModBlocks.BUDDING_ALUMINUM.get())
                .add(ModBlocks.ALUMINUM_SHARD_BLOCK.get()) 

                .add(ModBlocks.SMALL_GLOWSTONE_BUD.get())
                .add(ModBlocks.MEDIUM_GLOWSTONE_BUD.get())
                .add(ModBlocks.LARGE_GLOWSTONE_BUD.get())
                .add(ModBlocks.GLOWSTONE_CLUSTER.get())
                .add(ModBlocks.BUDDING_GLOWSTONE.get())
                .add(ModBlocks.GLOWSTONE_SHARD_BLOCK.get())     

                .add(ModBlocks.SMALL_COAL_BUD.get())
                .add(ModBlocks.MEDIUM_COAL_BUD.get())
                .add(ModBlocks.LARGE_COAL_BUD.get())
                .add(ModBlocks.COAL_CLUSTER.get())
                .add(ModBlocks.BUDDING_COAL.get())
                .add(ModBlocks.COAL_SHARD_BLOCK.get())     

                .add(ModBlocks.SMALL_REDSTONE_BUD.get())
                .add(ModBlocks.MEDIUM_REDSTONE_BUD.get())
                .add(ModBlocks.LARGE_REDSTONE_BUD.get())
                .add(ModBlocks.REDSTONE_CLUSTER.get())
                .add(ModBlocks.BUDDING_REDSTONE.get())
                .add(ModBlocks.REDSTONE_SHARD_BLOCK.get())     

                .add(ModBlocks.SMALL_QUARTZ_BUD.get())
                .add(ModBlocks.MEDIUM_QUARTZ_BUD.get())
                .add(ModBlocks.LARGE_QUARTZ_BUD.get())
                .add(ModBlocks.QUARTZ_CLUSTER.get())
                .add(ModBlocks.BUDDING_QUARTZ.get())
                .add(ModBlocks.QUARTZ_SHARD_BLOCK.get())     

                .add(ModBlocks.SMALL_DIAMOND_BUD.get())
                .add(ModBlocks.MEDIUM_DIAMOND_BUD.get())
                .add(ModBlocks.LARGE_DIAMOND_BUD.get())
                .add(ModBlocks.DIAMOND_CLUSTER.get())
                .add(ModBlocks.BUDDING_DIAMOND.get())
                .add(ModBlocks.DIAMOND_SHARD_BLOCK.get())     

                .add(ModBlocks.SMALL_EMERALD_BUD.get())
                .add(ModBlocks.MEDIUM_EMERALD_BUD.get())
                .add(ModBlocks.LARGE_EMERALD_BUD.get())
                .add(ModBlocks.EMERALD_CLUSTER.get())
                .add(ModBlocks.BUDDING_EMERALD.get())
                .add(ModBlocks.EMERALD_SHARD_BLOCK.get())        
        
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