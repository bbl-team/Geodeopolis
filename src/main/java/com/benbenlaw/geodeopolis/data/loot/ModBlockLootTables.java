package com.benbenlaw.geodeopolis.data.loot;

import com.benbenlaw.geodeopolis.block.ModBlocks;
import com.benbenlaw.geodeopolis.item.ModItems;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.data.loot.BlockLoot;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.predicates.MatchTool;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockLootTables extends BlockLoot {
    @Override
    protected void addTables() {
        simpleDrops();
    }

    private void simpleDrops() {

        this.dropSelf(ModBlocks.ALUMINUM_SHARD_BLOCK.get());
        this.add(ModBlocks.BUDDING_ALUMINUM.get(), (Block) -> noDrop());
        this.add(ModBlocks.ALUMINUM_CLUSTER.get(), (Block) ->
                createSilkTouchDispatchTable(Block, LootItem.lootTableItem(ModItems.ALUMINUM_SHARD.get())
                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(4.0F)))
                        .apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE))
                        .when(MatchTool.toolMatches(ItemPredicate.Builder.item().of(ItemTags.CLUSTER_MAX_HARVESTABLES)))
                        .otherwise(applyExplosionDecay(Block, LootItem.lootTableItem(ModItems.ALUMINUM_SHARD.get())
                                .apply(SetItemCountFunction.setCount(ConstantValue.exactly(2.0F)))))));
        this.dropWhenSilkTouch(ModBlocks.LARGE_ALUMINUM_BUD.get());
        this.dropWhenSilkTouch(ModBlocks.MEDIUM_ALUMINUM_BUD.get());
        this.dropWhenSilkTouch(ModBlocks.SMALL_ALUMINUM_BUD.get());
        
        this.dropSelf(ModBlocks.GLOWSTONE_SHARD_BLOCK.get());
        this.add(ModBlocks.BUDDING_GLOWSTONE.get(), (Block) -> noDrop());
        this.add(ModBlocks.GLOWSTONE_CLUSTER.get(), (Block) ->
                createSilkTouchDispatchTable(Block, LootItem.lootTableItem(ModItems.GLOWSTONE_SHARD.get())
                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(4.0F)))
                        .apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE))
                        .when(MatchTool.toolMatches(ItemPredicate.Builder.item().of(ItemTags.CLUSTER_MAX_HARVESTABLES)))
                        .otherwise(applyExplosionDecay(Block, LootItem.lootTableItem(ModItems.GLOWSTONE_SHARD.get())
                                .apply(SetItemCountFunction.setCount(ConstantValue.exactly(2.0F)))))));
        this.dropWhenSilkTouch(ModBlocks.LARGE_GLOWSTONE_BUD.get());
        this.dropWhenSilkTouch(ModBlocks.MEDIUM_GLOWSTONE_BUD.get());
        this.dropWhenSilkTouch(ModBlocks.SMALL_GLOWSTONE_BUD.get());

        this.dropSelf(ModBlocks.COPPER_SHARD_BLOCK.get());
        this.add(ModBlocks.BUDDING_COPPER.get(), (Block) -> noDrop());
        this.add(ModBlocks.COPPER_CLUSTER.get(), (Block) ->
            createSilkTouchDispatchTable(Block, LootItem.lootTableItem(ModItems.COPPER_SHARD.get())
                    .apply(SetItemCountFunction.setCount(ConstantValue.exactly(4.0F)))
                    .apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE))
                    .when(MatchTool.toolMatches(ItemPredicate.Builder.item().of(ItemTags.CLUSTER_MAX_HARVESTABLES)))
                    .otherwise(applyExplosionDecay(Block, LootItem.lootTableItem(ModItems.COPPER_SHARD.get())
                            .apply(SetItemCountFunction.setCount(ConstantValue.exactly(2.0F)))))));
       this.dropWhenSilkTouch(ModBlocks.LARGE_COPPER_BUD.get());
       this.dropWhenSilkTouch(ModBlocks.MEDIUM_COPPER_BUD.get());
       this.dropWhenSilkTouch(ModBlocks.SMALL_COPPER_BUD.get());

        this.dropSelf(ModBlocks.TIN_SHARD_BLOCK.get());
        this.add(ModBlocks.BUDDING_TIN.get(), (Block) -> noDrop());
        this.add(ModBlocks.TIN_CLUSTER.get(), (Block) ->
            createSilkTouchDispatchTable(Block, LootItem.lootTableItem(ModItems.TIN_SHARD.get())
                    .apply(SetItemCountFunction.setCount(ConstantValue.exactly(4.0F)))
                    .apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE))
                    .when(MatchTool.toolMatches(ItemPredicate.Builder.item().of(ItemTags.CLUSTER_MAX_HARVESTABLES)))
                    .otherwise(applyExplosionDecay(Block, LootItem.lootTableItem(ModItems.TIN_SHARD.get())
                            .apply(SetItemCountFunction.setCount(ConstantValue.exactly(2.0F)))))));
       this.dropWhenSilkTouch(ModBlocks.LARGE_TIN_BUD.get());
       this.dropWhenSilkTouch(ModBlocks.MEDIUM_TIN_BUD.get());
       this.dropWhenSilkTouch(ModBlocks.SMALL_TIN_BUD.get());

        this.dropSelf(ModBlocks.GOLD_SHARD_BLOCK.get());
        this.add(ModBlocks.BUDDING_GOLD.get(), (Block) -> noDrop());
        this.add(ModBlocks.GOLD_CLUSTER.get(), (Block) ->
            createSilkTouchDispatchTable(Block, LootItem.lootTableItem(ModItems.GOLD_SHARD.get())
                    .apply(SetItemCountFunction.setCount(ConstantValue.exactly(4.0F)))
                    .apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE))
                    .when(MatchTool.toolMatches(ItemPredicate.Builder.item().of(ItemTags.CLUSTER_MAX_HARVESTABLES)))
                    .otherwise(applyExplosionDecay(Block, LootItem.lootTableItem(ModItems.GOLD_SHARD.get())
                            .apply(SetItemCountFunction.setCount(ConstantValue.exactly(2.0F)))))));
       this.dropWhenSilkTouch(ModBlocks.LARGE_GOLD_BUD.get());
       this.dropWhenSilkTouch(ModBlocks.MEDIUM_GOLD_BUD.get());
       this.dropWhenSilkTouch(ModBlocks.SMALL_GOLD_BUD.get());

        this.dropSelf(ModBlocks.IRON_SHARD_BLOCK.get());
        this.add(ModBlocks.BUDDING_IRON.get(), (Block) -> noDrop());
        this.add(ModBlocks.IRON_CLUSTER.get(), (Block) ->
            createSilkTouchDispatchTable(Block, LootItem.lootTableItem(ModItems.IRON_SHARD.get())
                    .apply(SetItemCountFunction.setCount(ConstantValue.exactly(4.0F)))
                    .apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE))
                    .when(MatchTool.toolMatches(ItemPredicate.Builder.item().of(ItemTags.CLUSTER_MAX_HARVESTABLES)))
                    .otherwise(applyExplosionDecay(Block, LootItem.lootTableItem(ModItems.IRON_SHARD.get())
                            .apply(SetItemCountFunction.setCount(ConstantValue.exactly(2.0F)))))));
       this.dropWhenSilkTouch(ModBlocks.LARGE_IRON_BUD.get());
       this.dropWhenSilkTouch(ModBlocks.MEDIUM_IRON_BUD.get());
       this.dropWhenSilkTouch(ModBlocks.SMALL_IRON_BUD.get());

        this.dropSelf(ModBlocks.DIAMOND_SHARD_BLOCK.get());
        this.add(ModBlocks.BUDDING_DIAMOND.get(), (Block) -> noDrop());
        this.add(ModBlocks.DIAMOND_CLUSTER.get(), (Block) ->
            createSilkTouchDispatchTable(Block, LootItem.lootTableItem(ModItems.DIAMOND_SHARD.get())
                    .apply(SetItemCountFunction.setCount(ConstantValue.exactly(4.0F)))
                    .apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE))
                    .when(MatchTool.toolMatches(ItemPredicate.Builder.item().of(ItemTags.CLUSTER_MAX_HARVESTABLES)))
                    .otherwise(applyExplosionDecay(Block, LootItem.lootTableItem(ModItems.DIAMOND_SHARD.get())
                            .apply(SetItemCountFunction.setCount(ConstantValue.exactly(2.0F)))))));
       this.dropWhenSilkTouch(ModBlocks.LARGE_DIAMOND_BUD.get());
       this.dropWhenSilkTouch(ModBlocks.MEDIUM_DIAMOND_BUD.get());
       this.dropWhenSilkTouch(ModBlocks.SMALL_DIAMOND_BUD.get());

        this.dropSelf(ModBlocks.EMERALD_SHARD_BLOCK.get());
        this.add(ModBlocks.BUDDING_EMERALD.get(), (Block) -> noDrop());
        this.add(ModBlocks.EMERALD_CLUSTER.get(), (Block) ->
            createSilkTouchDispatchTable(Block, LootItem.lootTableItem(ModItems.EMERALD_SHARD.get())
                    .apply(SetItemCountFunction.setCount(ConstantValue.exactly(4.0F)))
                    .apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE))
                    .when(MatchTool.toolMatches(ItemPredicate.Builder.item().of(ItemTags.CLUSTER_MAX_HARVESTABLES)))
                    .otherwise(applyExplosionDecay(Block, LootItem.lootTableItem(ModItems.EMERALD_SHARD.get())
                            .apply(SetItemCountFunction.setCount(ConstantValue.exactly(2.0F)))))));
       this.dropWhenSilkTouch(ModBlocks.LARGE_EMERALD_BUD.get());
       this.dropWhenSilkTouch(ModBlocks.MEDIUM_EMERALD_BUD.get());
       this.dropWhenSilkTouch(ModBlocks.SMALL_EMERALD_BUD.get());

        this.dropSelf(ModBlocks.REDSTONE_SHARD_BLOCK.get());
        this.add(ModBlocks.BUDDING_REDSTONE.get(), (Block) -> noDrop());
        this.add(ModBlocks.REDSTONE_CLUSTER.get(), (Block) ->
            createSilkTouchDispatchTable(Block, LootItem.lootTableItem(ModItems.REDSTONE_SHARD.get())
                    .apply(SetItemCountFunction.setCount(ConstantValue.exactly(4.0F)))
                    .apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE))
                    .when(MatchTool.toolMatches(ItemPredicate.Builder.item().of(ItemTags.CLUSTER_MAX_HARVESTABLES)))
                    .otherwise(applyExplosionDecay(Block, LootItem.lootTableItem(ModItems.REDSTONE_SHARD.get())
                            .apply(SetItemCountFunction.setCount(ConstantValue.exactly(2.0F)))))));
       this.dropWhenSilkTouch(ModBlocks.LARGE_REDSTONE_BUD.get());
       this.dropWhenSilkTouch(ModBlocks.MEDIUM_REDSTONE_BUD.get());
       this.dropWhenSilkTouch(ModBlocks.SMALL_REDSTONE_BUD.get());

        this.dropSelf(ModBlocks.COAL_SHARD_BLOCK.get());
        this.add(ModBlocks.BUDDING_COAL.get(), (Block) -> noDrop());
        this.add(ModBlocks.COAL_CLUSTER.get(), (Block) ->
            createSilkTouchDispatchTable(Block, LootItem.lootTableItem(ModItems.COAL_SHARD.get())
                    .apply(SetItemCountFunction.setCount(ConstantValue.exactly(4.0F)))
                    .apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE))
                    .when(MatchTool.toolMatches(ItemPredicate.Builder.item().of(ItemTags.CLUSTER_MAX_HARVESTABLES)))
                    .otherwise(applyExplosionDecay(Block, LootItem.lootTableItem(ModItems.COAL_SHARD.get())
                            .apply(SetItemCountFunction.setCount(ConstantValue.exactly(2.0F)))))));
       this.dropWhenSilkTouch(ModBlocks.LARGE_COAL_BUD.get());
       this.dropWhenSilkTouch(ModBlocks.MEDIUM_COAL_BUD.get());
       this.dropWhenSilkTouch(ModBlocks.SMALL_COAL_BUD.get());

        this.dropSelf(ModBlocks.OSMIUM_SHARD_BLOCK.get());
        this.add(ModBlocks.BUDDING_OSMIUM.get(), (Block) -> noDrop());
        this.add(ModBlocks.OSMIUM_CLUSTER.get(), (Block) ->
            createSilkTouchDispatchTable(Block, LootItem.lootTableItem(ModItems.OSMIUM_SHARD.get())
                    .apply(SetItemCountFunction.setCount(ConstantValue.exactly(4.0F)))
                    .apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE))
                    .when(MatchTool.toolMatches(ItemPredicate.Builder.item().of(ItemTags.CLUSTER_MAX_HARVESTABLES)))
                    .otherwise(applyExplosionDecay(Block, LootItem.lootTableItem(ModItems.OSMIUM_SHARD.get())
                            .apply(SetItemCountFunction.setCount(ConstantValue.exactly(2.0F)))))));
       this.dropWhenSilkTouch(ModBlocks.LARGE_OSMIUM_BUD.get());
       this.dropWhenSilkTouch(ModBlocks.MEDIUM_OSMIUM_BUD.get());
       this.dropWhenSilkTouch(ModBlocks.SMALL_OSMIUM_BUD.get());

        this.dropSelf(ModBlocks.URANIUM_SHARD_BLOCK.get());
        this.add(ModBlocks.BUDDING_URANIUM.get(), (Block) -> noDrop());
        this.add(ModBlocks.URANIUM_CLUSTER.get(), (Block) ->
            createSilkTouchDispatchTable(Block, LootItem.lootTableItem(ModItems.URANIUM_SHARD.get())
                    .apply(SetItemCountFunction.setCount(ConstantValue.exactly(4.0F)))
                    .apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE))
                    .when(MatchTool.toolMatches(ItemPredicate.Builder.item().of(ItemTags.CLUSTER_MAX_HARVESTABLES)))
                    .otherwise(applyExplosionDecay(Block, LootItem.lootTableItem(ModItems.URANIUM_SHARD.get())
                            .apply(SetItemCountFunction.setCount(ConstantValue.exactly(2.0F)))))));
       this.dropWhenSilkTouch(ModBlocks.LARGE_URANIUM_BUD.get());
       this.dropWhenSilkTouch(ModBlocks.MEDIUM_URANIUM_BUD.get());
       this.dropWhenSilkTouch(ModBlocks.SMALL_URANIUM_BUD.get());

        this.dropSelf(ModBlocks.QUARTZ_SHARD_BLOCK.get());
        this.add(ModBlocks.BUDDING_QUARTZ.get(), (Block) -> noDrop());
        this.add(ModBlocks.QUARTZ_CLUSTER.get(), (Block) ->
            createSilkTouchDispatchTable(Block, LootItem.lootTableItem(ModItems.QUARTZ_SHARD.get())
                    .apply(SetItemCountFunction.setCount(ConstantValue.exactly(4.0F)))
                    .apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE))
                    .when(MatchTool.toolMatches(ItemPredicate.Builder.item().of(ItemTags.CLUSTER_MAX_HARVESTABLES)))
                    .otherwise(applyExplosionDecay(Block, LootItem.lootTableItem(ModItems.QUARTZ_SHARD.get())
                            .apply(SetItemCountFunction.setCount(ConstantValue.exactly(2.0F)))))));
       this.dropWhenSilkTouch(ModBlocks.LARGE_QUARTZ_BUD.get());
       this.dropWhenSilkTouch(ModBlocks.MEDIUM_QUARTZ_BUD.get());
       this.dropWhenSilkTouch(ModBlocks.SMALL_QUARTZ_BUD.get());

        this.dropSelf(ModBlocks.SILVER_SHARD_BLOCK.get());
        this.add(ModBlocks.BUDDING_SILVER.get(), (Block) -> noDrop());
        this.add(ModBlocks.SILVER_CLUSTER.get(), (Block) ->
            createSilkTouchDispatchTable(Block, LootItem.lootTableItem(ModItems.SILVER_SHARD.get())
                    .apply(SetItemCountFunction.setCount(ConstantValue.exactly(4.0F)))
                    .apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE))
                    .when(MatchTool.toolMatches(ItemPredicate.Builder.item().of(ItemTags.CLUSTER_MAX_HARVESTABLES)))
                    .otherwise(applyExplosionDecay(Block, LootItem.lootTableItem(ModItems.SILVER_SHARD.get())
                            .apply(SetItemCountFunction.setCount(ConstantValue.exactly(2.0F)))))));
       this.dropWhenSilkTouch(ModBlocks.LARGE_SILVER_BUD.get());
       this.dropWhenSilkTouch(ModBlocks.MEDIUM_SILVER_BUD.get());
       this.dropWhenSilkTouch(ModBlocks.SMALL_SILVER_BUD.get());

        this.dropSelf(ModBlocks.DEBRIS_SHARD_BLOCK.get());
        this.add(ModBlocks.BUDDING_DEBRIS.get(), (Block) -> noDrop());
        this.add(ModBlocks.DEBRIS_CLUSTER.get(), (Block) ->
            createSilkTouchDispatchTable(Block, LootItem.lootTableItem(ModItems.DEBRIS_SHARD.get())
                    .apply(SetItemCountFunction.setCount(ConstantValue.exactly(4.0F)))
                    .apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE))
                    .when(MatchTool.toolMatches(ItemPredicate.Builder.item().of(ItemTags.CLUSTER_MAX_HARVESTABLES)))
                    .otherwise(applyExplosionDecay(Block, LootItem.lootTableItem(ModItems.DEBRIS_SHARD.get())
                            .apply(SetItemCountFunction.setCount(ConstantValue.exactly(2.0F)))))));
       this.dropWhenSilkTouch(ModBlocks.LARGE_DEBRIS_BUD.get());
       this.dropWhenSilkTouch(ModBlocks.MEDIUM_DEBRIS_BUD.get());
       this.dropWhenSilkTouch(ModBlocks.SMALL_DEBRIS_BUD.get());


    }


    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }


}
