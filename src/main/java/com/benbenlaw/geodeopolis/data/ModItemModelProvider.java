package com.benbenlaw.geodeopolis.data;

import com.benbenlaw.geodeopolis.Geodeopolis;
import com.benbenlaw.geodeopolis.block.ModBlocks;
import com.benbenlaw.geodeopolis.item.ModItems;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModItemModelProvider extends ItemModelProvider {



    public ModItemModelProvider(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, Geodeopolis.MOD_ID, existingFileHelper);
    }



    @Override
    protected void registerModels() {

        simpleItem(ModItems.CLUSTER_TEMPLATE);

        simpleItem(ModItems.TIN_SHARD);
        simpleBlock(ModBlocks.BUDDING_TIN);
        simpleBlock(ModBlocks.TIN_SHARD_BLOCK);
        shardItem(ModBlocks.TIN_CLUSTER);
        shardItem(ModBlocks.SMALL_TIN_BUD);
        shardItem(ModBlocks.MEDIUM_TIN_BUD);
        shardItem(ModBlocks.LARGE_TIN_BUD);

        simpleItem(ModItems.GLOWSTONE_SHARD);
        simpleBlock(ModBlocks.BUDDING_GLOWSTONE);
        simpleBlock(ModBlocks.GLOWSTONE_SHARD_BLOCK);
        shardItem(ModBlocks.GLOWSTONE_CLUSTER);
        shardItem(ModBlocks.SMALL_GLOWSTONE_BUD);
        shardItem(ModBlocks.MEDIUM_GLOWSTONE_BUD);
        shardItem(ModBlocks.LARGE_GLOWSTONE_BUD);

        simpleItem(ModItems.ALUMINUM_SHARD);
        simpleBlock(ModBlocks.BUDDING_ALUMINUM);
        simpleBlock(ModBlocks.ALUMINUM_SHARD_BLOCK);
        shardItem(ModBlocks.ALUMINUM_CLUSTER);
        shardItem(ModBlocks.SMALL_ALUMINUM_BUD);
        shardItem(ModBlocks.MEDIUM_ALUMINUM_BUD);
        shardItem(ModBlocks.LARGE_ALUMINUM_BUD);

        simpleItem(ModItems.DIAMOND_SHARD);
        simpleBlock(ModBlocks.BUDDING_DIAMOND);
        simpleBlock(ModBlocks.DIAMOND_SHARD_BLOCK);
        shardItem(ModBlocks.DIAMOND_CLUSTER);
        shardItem(ModBlocks.SMALL_DIAMOND_BUD);
        shardItem(ModBlocks.MEDIUM_DIAMOND_BUD);
        shardItem(ModBlocks.LARGE_DIAMOND_BUD);

        simpleItem(ModItems.EMERALD_SHARD);
        simpleBlock(ModBlocks.BUDDING_EMERALD);
        simpleBlock(ModBlocks.EMERALD_SHARD_BLOCK);
        shardItem(ModBlocks.EMERALD_CLUSTER);
        shardItem(ModBlocks.SMALL_EMERALD_BUD);
        shardItem(ModBlocks.MEDIUM_EMERALD_BUD);
        shardItem(ModBlocks.LARGE_EMERALD_BUD);

        simpleItem(ModItems.QUARTZ_SHARD);
        simpleBlock(ModBlocks.BUDDING_QUARTZ);
        simpleBlock(ModBlocks.QUARTZ_SHARD_BLOCK);
        shardItem(ModBlocks.QUARTZ_CLUSTER);
        shardItem(ModBlocks.SMALL_QUARTZ_BUD);
        shardItem(ModBlocks.MEDIUM_QUARTZ_BUD);
        shardItem(ModBlocks.LARGE_QUARTZ_BUD);

        simpleItem(ModItems.REDSTONE_SHARD);
        simpleBlock(ModBlocks.BUDDING_REDSTONE);
        simpleBlock(ModBlocks.REDSTONE_SHARD_BLOCK);
        shardItem(ModBlocks.REDSTONE_CLUSTER);
        shardItem(ModBlocks.SMALL_REDSTONE_BUD);
        shardItem(ModBlocks.MEDIUM_REDSTONE_BUD);
        shardItem(ModBlocks.LARGE_REDSTONE_BUD);

        simpleItem(ModItems.COAL_SHARD);
        simpleBlock(ModBlocks.BUDDING_COAL);
        simpleBlock(ModBlocks.COAL_SHARD_BLOCK);
        shardItem(ModBlocks.COAL_CLUSTER);
        shardItem(ModBlocks.SMALL_COAL_BUD);
        shardItem(ModBlocks.MEDIUM_COAL_BUD);
        shardItem(ModBlocks.LARGE_COAL_BUD);
        
        simpleItem(ModItems.COPPER_SHARD);
        simpleBlock(ModBlocks.BUDDING_COPPER);
        simpleBlock(ModBlocks.COPPER_SHARD_BLOCK);
        shardItem(ModBlocks.COPPER_CLUSTER);
        shardItem(ModBlocks.SMALL_COPPER_BUD);
        shardItem(ModBlocks.MEDIUM_COPPER_BUD);
        shardItem(ModBlocks.LARGE_COPPER_BUD);      
        
        simpleItem(ModItems.URANIUM_SHARD);
        simpleBlock(ModBlocks.BUDDING_URANIUM);
        simpleBlock(ModBlocks.URANIUM_SHARD_BLOCK);
        shardItem(ModBlocks.URANIUM_CLUSTER);
        shardItem(ModBlocks.SMALL_URANIUM_BUD);
        shardItem(ModBlocks.MEDIUM_URANIUM_BUD);
        shardItem(ModBlocks.LARGE_URANIUM_BUD);      
        
        simpleItem(ModItems.DEBRIS_SHARD);
        simpleBlock(ModBlocks.BUDDING_DEBRIS);
        simpleBlock(ModBlocks.DEBRIS_SHARD_BLOCK);
        shardItem(ModBlocks.DEBRIS_CLUSTER);
        shardItem(ModBlocks.SMALL_DEBRIS_BUD);
        shardItem(ModBlocks.MEDIUM_DEBRIS_BUD);
        shardItem(ModBlocks.LARGE_DEBRIS_BUD);      
        
        simpleItem(ModItems.GOLD_SHARD);
        simpleBlock(ModBlocks.BUDDING_GOLD);
        simpleBlock(ModBlocks.GOLD_SHARD_BLOCK);
        shardItem(ModBlocks.GOLD_CLUSTER);
        shardItem(ModBlocks.SMALL_GOLD_BUD);
        shardItem(ModBlocks.MEDIUM_GOLD_BUD);
        shardItem(ModBlocks.LARGE_GOLD_BUD);      
        
        simpleItem(ModItems.IRON_SHARD);
        simpleBlock(ModBlocks.BUDDING_IRON);
        simpleBlock(ModBlocks.IRON_SHARD_BLOCK);
        shardItem(ModBlocks.IRON_CLUSTER);
        shardItem(ModBlocks.SMALL_IRON_BUD);
        shardItem(ModBlocks.MEDIUM_IRON_BUD);
        shardItem(ModBlocks.LARGE_IRON_BUD);      
        
        simpleItem(ModItems.OSMIUM_SHARD);
        simpleBlock(ModBlocks.BUDDING_OSMIUM);
        simpleBlock(ModBlocks.OSMIUM_SHARD_BLOCK);
        shardItem(ModBlocks.OSMIUM_CLUSTER);
        shardItem(ModBlocks.SMALL_OSMIUM_BUD);
        shardItem(ModBlocks.MEDIUM_OSMIUM_BUD);
        shardItem(ModBlocks.LARGE_OSMIUM_BUD);      
        
        simpleItem(ModItems.SILVER_SHARD);
        simpleBlock(ModBlocks.BUDDING_SILVER);
        simpleBlock(ModBlocks.SILVER_SHARD_BLOCK);
        shardItem(ModBlocks.SILVER_CLUSTER);
        shardItem(ModBlocks.SMALL_SILVER_BUD);
        shardItem(ModBlocks.MEDIUM_SILVER_BUD);
        shardItem(ModBlocks.LARGE_SILVER_BUD);



    }
    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(Geodeopolis.MOD_ID,"item/" + item.getId().getPath()));
    }

    private ItemModelBuilder simpleTorch(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(Geodeopolis.MOD_ID,"block/" + item.getId().getPath()));
    }

    private ItemModelBuilder toolItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/handheld")).texture("layer0",
                new ResourceLocation(Geodeopolis.MOD_ID,"item/" + item.getId().getPath()));
    }

    private ItemModelBuilder shardItem(RegistryObject<Block> block) {
        return withExistingParent(block.getId().getPath(),
                new ResourceLocation("item/handheld")).texture("layer0",
                new ResourceLocation(Geodeopolis.MOD_ID,"block/" + block.getId().getPath()));
    }

    private ItemModelBuilder simpleBlock(RegistryObject<Block> block) {
        return cubeAll(block.getId().getPath(), new ResourceLocation(Geodeopolis.MOD_ID,
                "block/" + block.getId().getPath()));
    }
}