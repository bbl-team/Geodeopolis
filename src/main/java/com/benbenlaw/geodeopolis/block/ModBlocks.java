package com.benbenlaw.geodeopolis.block;

import com.benbenlaw.geodeopolis.Geodeopolis;
import com.benbenlaw.geodeopolis.block.custom.*;
import com.benbenlaw.geodeopolis.item.ModCreativeModTab;
import com.benbenlaw.geodeopolis.item.ModItems;
import net.minecraft.network.chat.Component;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.*;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.function.Supplier;
import java.util.function.ToIntFunction;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, Geodeopolis.MOD_ID);



    public static final RegistryObject<Block> BUDDING_TIN = registerBlock("budding_tin",
            () -> new BuddingTinBlock(BlockBehaviour.Properties.of(Material.STONE).strength(1.5f).sound(SoundType.AMETHYST).randomTicks().requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> TIN_SHARD_BLOCK = registerBlock("tin_shard_block",
            () -> new AmethystBlock(BlockBehaviour.Properties.of(Material.STONE).strength(1.5f).sound(SoundType.AMETHYST).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> TIN_CLUSTER = registerBlock("tin_cluster",
            () -> new AmethystClusterBlock(7, 3, BlockBehaviour.Properties.of(Material.AMETHYST).noOcclusion().randomTicks().sound(SoundType.AMETHYST_CLUSTER).strength(1.5f).lightLevel((state) -> 5)));

    public static final RegistryObject<Block> LARGE_TIN_BUD = registerBlock("large_tin_bud",
            () -> new AmethystClusterBlock(5, 3, BlockBehaviour.Properties.copy(TIN_CLUSTER.get()).sound(SoundType.LARGE_AMETHYST_BUD).lightLevel((state) -> 4)));

    public static final RegistryObject<Block> MEDIUM_TIN_BUD = registerBlock("medium_tin_bud",
            () -> new AmethystClusterBlock(4, 3, BlockBehaviour.Properties.copy(TIN_CLUSTER.get()).sound(SoundType.MEDIUM_AMETHYST_BUD).lightLevel((state) -> 2)));

    public static final RegistryObject<Block> SMALL_TIN_BUD = registerBlock("small_tin_bud",
            () -> new AmethystClusterBlock(3, 4, BlockBehaviour.Properties.copy(TIN_CLUSTER.get()).sound(SoundType.SMALL_AMETHYST_BUD).lightLevel((state) -> 2)));




    public static final RegistryObject<Block> BUDDING_LAPIS = registerBlock("budding_lapis",
            () -> new BuddingLapisBlock(BlockBehaviour.Properties.of(Material.STONE).strength(1.5f).sound(SoundType.AMETHYST).randomTicks().requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> LAPIS_SHARD_BLOCK = registerBlock("lapis_shard_block",
            () -> new AmethystBlock(BlockBehaviour.Properties.of(Material.STONE).strength(1.5f).sound(SoundType.AMETHYST).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> LAPIS_CLUSTER = registerBlock("lapis_cluster",
            () -> new AmethystClusterBlock(7, 3, BlockBehaviour.Properties.of(Material.AMETHYST).noOcclusion().randomTicks().sound(SoundType.AMETHYST_CLUSTER).strength(1.5f).lightLevel((state) -> 5)));

    public static final RegistryObject<Block> LARGE_LAPIS_BUD = registerBlock("large_lapis_bud",
            () -> new AmethystClusterBlock(5, 3, BlockBehaviour.Properties.copy(LAPIS_CLUSTER.get()).sound(SoundType.LARGE_AMETHYST_BUD).lightLevel((state) -> 4)));

    public static final RegistryObject<Block> MEDIUM_LAPIS_BUD = registerBlock("medium_lapis_bud",
            () -> new AmethystClusterBlock(4, 3, BlockBehaviour.Properties.copy(LAPIS_CLUSTER.get()).sound(SoundType.MEDIUM_AMETHYST_BUD).lightLevel((state) -> 2)));

    public static final RegistryObject<Block> SMALL_LAPIS_BUD = registerBlock("small_lapis_bud",
            () -> new AmethystClusterBlock(3, 4, BlockBehaviour.Properties.copy(LAPIS_CLUSTER.get()).sound(SoundType.SMALL_AMETHYST_BUD).lightLevel((state) -> 2)));



    public static final RegistryObject<Block> BUDDING_ZINC = registerBlock("budding_zinc",
            () -> new BuddingZincBlock(BlockBehaviour.Properties.of(Material.STONE).strength(1.5f).sound(SoundType.AMETHYST).randomTicks().requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> ZINC_SHARD_BLOCK = registerBlock("zinc_shard_block",
            () -> new AmethystBlock(BlockBehaviour.Properties.of(Material.STONE).strength(1.5f).sound(SoundType.AMETHYST).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> ZINC_CLUSTER = registerBlock("zinc_cluster",
            () -> new AmethystClusterBlock(7, 3, BlockBehaviour.Properties.of(Material.AMETHYST).noOcclusion().randomTicks().sound(SoundType.AMETHYST_CLUSTER).strength(1.5f).lightLevel((state) -> 5)));

    public static final RegistryObject<Block> LARGE_ZINC_BUD = registerBlock("large_zinc_bud",
            () -> new AmethystClusterBlock(5, 3, BlockBehaviour.Properties.copy(ZINC_CLUSTER.get()).sound(SoundType.LARGE_AMETHYST_BUD).lightLevel((state) -> 4)));

    public static final RegistryObject<Block> MEDIUM_ZINC_BUD = registerBlock("medium_zinc_bud",
            () -> new AmethystClusterBlock(4, 3, BlockBehaviour.Properties.copy(ZINC_CLUSTER.get()).sound(SoundType.MEDIUM_AMETHYST_BUD).lightLevel((state) -> 2)));

    public static final RegistryObject<Block> SMALL_ZINC_BUD = registerBlock("small_zinc_bud",
            () -> new AmethystClusterBlock(3, 4, BlockBehaviour.Properties.copy(ZINC_CLUSTER.get()).sound(SoundType.SMALL_AMETHYST_BUD).lightLevel((state) -> 2)));


    
    public static final RegistryObject<Block> BUDDING_NICKEL = registerBlock("budding_nickel",
            () -> new BuddingNickelBlock(BlockBehaviour.Properties.of(Material.STONE).strength(1.5f).sound(SoundType.AMETHYST).randomTicks().requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> NICKEL_SHARD_BLOCK = registerBlock("nickel_shard_block",
            () -> new AmethystBlock(BlockBehaviour.Properties.of(Material.STONE).strength(1.5f).sound(SoundType.AMETHYST).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> NICKEL_CLUSTER = registerBlock("nickel_cluster",
            () -> new AmethystClusterBlock(7, 3, BlockBehaviour.Properties.of(Material.AMETHYST).noOcclusion().randomTicks().sound(SoundType.AMETHYST_CLUSTER).strength(1.5f).lightLevel((state) -> 5)));

    public static final RegistryObject<Block> LARGE_NICKEL_BUD = registerBlock("large_nickel_bud",
            () -> new AmethystClusterBlock(5, 3, BlockBehaviour.Properties.copy(NICKEL_CLUSTER.get()).sound(SoundType.LARGE_AMETHYST_BUD).lightLevel((state) -> 4)));

    public static final RegistryObject<Block> MEDIUM_NICKEL_BUD = registerBlock("medium_nickel_bud",
            () -> new AmethystClusterBlock(4, 3, BlockBehaviour.Properties.copy(NICKEL_CLUSTER.get()).sound(SoundType.MEDIUM_AMETHYST_BUD).lightLevel((state) -> 2)));

    public static final RegistryObject<Block> SMALL_NICKEL_BUD = registerBlock("small_nickel_bud",
            () -> new AmethystClusterBlock(3, 4, BlockBehaviour.Properties.copy(NICKEL_CLUSTER.get()).sound(SoundType.SMALL_AMETHYST_BUD).lightLevel((state) -> 2)));


    
    public static final RegistryObject<Block> BUDDING_LEAD = registerBlock("budding_lead",
            () -> new BuddingLeadBlock(BlockBehaviour.Properties.of(Material.STONE).strength(1.5f).sound(SoundType.AMETHYST).randomTicks().requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> LEAD_SHARD_BLOCK = registerBlock("lead_shard_block",
            () -> new AmethystBlock(BlockBehaviour.Properties.of(Material.STONE).strength(1.5f).sound(SoundType.AMETHYST).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> LEAD_CLUSTER = registerBlock("lead_cluster",
            () -> new AmethystClusterBlock(7, 3, BlockBehaviour.Properties.of(Material.AMETHYST).noOcclusion().randomTicks().sound(SoundType.AMETHYST_CLUSTER).strength(1.5f).lightLevel((state) -> 5)));

    public static final RegistryObject<Block> LARGE_LEAD_BUD = registerBlock("large_lead_bud",
            () -> new AmethystClusterBlock(5, 3, BlockBehaviour.Properties.copy(LEAD_CLUSTER.get()).sound(SoundType.LARGE_AMETHYST_BUD).lightLevel((state) -> 4)));

    public static final RegistryObject<Block> MEDIUM_LEAD_BUD = registerBlock("medium_lead_bud",
            () -> new AmethystClusterBlock(4, 3, BlockBehaviour.Properties.copy(LEAD_CLUSTER.get()).sound(SoundType.MEDIUM_AMETHYST_BUD).lightLevel((state) -> 2)));

    public static final RegistryObject<Block> SMALL_LEAD_BUD = registerBlock("small_lead_bud",
            () -> new AmethystClusterBlock(3, 4, BlockBehaviour.Properties.copy(LEAD_CLUSTER.get()).sound(SoundType.SMALL_AMETHYST_BUD).lightLevel((state) -> 2)));

    

    public static final RegistryObject<Block> BUDDING_GLOWSTONE = registerBlock("budding_glowstone",
            () -> new BuddingGlowstoneBlock(BlockBehaviour.Properties.of(Material.STONE).strength(1.5f).sound(SoundType.AMETHYST).randomTicks().requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> GLOWSTONE_SHARD_BLOCK = registerBlock("glowstone_shard_block",
            () -> new AmethystBlock(BlockBehaviour.Properties.of(Material.STONE).strength(1.5f).sound(SoundType.AMETHYST).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> GLOWSTONE_CLUSTER = registerBlock("glowstone_cluster",
            () -> new AmethystClusterBlock(7, 3, BlockBehaviour.Properties.of(Material.AMETHYST).noOcclusion().randomTicks().sound(SoundType.AMETHYST_CLUSTER).strength(1.5f).lightLevel((state) -> 5)));

    public static final RegistryObject<Block> LARGE_GLOWSTONE_BUD = registerBlock("large_glowstone_bud",
            () -> new AmethystClusterBlock(5, 3, BlockBehaviour.Properties.copy(GLOWSTONE_CLUSTER.get()).sound(SoundType.LARGE_AMETHYST_BUD).lightLevel((state) -> 4)));

    public static final RegistryObject<Block> MEDIUM_GLOWSTONE_BUD = registerBlock("medium_glowstone_bud",
            () -> new AmethystClusterBlock(4, 3, BlockBehaviour.Properties.copy(GLOWSTONE_CLUSTER.get()).sound(SoundType.MEDIUM_AMETHYST_BUD).lightLevel((state) -> 2)));

    public static final RegistryObject<Block> SMALL_GLOWSTONE_BUD = registerBlock("small_glowstone_bud",
            () -> new AmethystClusterBlock(3, 4, BlockBehaviour.Properties.copy(GLOWSTONE_CLUSTER.get()).sound(SoundType.SMALL_AMETHYST_BUD).lightLevel((state) -> 2)));
    
    
    
    public static final RegistryObject<Block> BUDDING_ALUMINUM = registerBlock("budding_aluminum",
            () -> new BuddingAluminumBlock(BlockBehaviour.Properties.of(Material.STONE).strength(1.5f).sound(SoundType.AMETHYST).randomTicks().requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> ALUMINUM_SHARD_BLOCK = registerBlock("aluminum_shard_block",
            () -> new AmethystBlock(BlockBehaviour.Properties.of(Material.STONE).strength(1.5f).sound(SoundType.AMETHYST).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> ALUMINUM_CLUSTER = registerBlock("aluminum_cluster",
            () -> new AmethystClusterBlock(7, 3, BlockBehaviour.Properties.of(Material.AMETHYST).noOcclusion().randomTicks().sound(SoundType.AMETHYST_CLUSTER).strength(1.5f).lightLevel((state) -> 5)));

    public static final RegistryObject<Block> LARGE_ALUMINUM_BUD = registerBlock("large_aluminum_bud",
            () -> new AmethystClusterBlock(5, 3, BlockBehaviour.Properties.copy(ALUMINUM_CLUSTER.get()).sound(SoundType.LARGE_AMETHYST_BUD).lightLevel((state) -> 4)));

    public static final RegistryObject<Block> MEDIUM_ALUMINUM_BUD = registerBlock("medium_aluminum_bud",
            () -> new AmethystClusterBlock(4, 3, BlockBehaviour.Properties.copy(ALUMINUM_CLUSTER.get()).sound(SoundType.MEDIUM_AMETHYST_BUD).lightLevel((state) -> 2)));

    public static final RegistryObject<Block> SMALL_ALUMINUM_BUD = registerBlock("small_aluminum_bud",
            () -> new AmethystClusterBlock(3, 4, BlockBehaviour.Properties.copy(ALUMINUM_CLUSTER.get()).sound(SoundType.SMALL_AMETHYST_BUD).lightLevel((state) -> 2)));



    public static final RegistryObject<Block> BUDDING_COAL = registerBlock("budding_coal",
            () -> new BuddingCoalBlock(BlockBehaviour.Properties.of(Material.STONE).strength(1.5f).sound(SoundType.AMETHYST).randomTicks().requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> COAL_SHARD_BLOCK = registerBlock("coal_shard_block",
            () -> new AmethystBlock(BlockBehaviour.Properties.of(Material.STONE).strength(1.5f).sound(SoundType.AMETHYST).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> COAL_CLUSTER = registerBlock("coal_cluster",
            () -> new AmethystClusterBlock(7, 3, BlockBehaviour.Properties.of(Material.AMETHYST).noOcclusion().randomTicks().sound(SoundType.AMETHYST_CLUSTER).strength(1.5f).lightLevel((state) -> 5)));

    public static final RegistryObject<Block> LARGE_COAL_BUD = registerBlock("large_coal_bud",
            () -> new AmethystClusterBlock(5, 3, BlockBehaviour.Properties.copy(COAL_CLUSTER.get()).sound(SoundType.LARGE_AMETHYST_BUD).lightLevel((state) -> 4)));

    public static final RegistryObject<Block> MEDIUM_COAL_BUD = registerBlock("medium_coal_bud",
            () -> new AmethystClusterBlock(4, 3, BlockBehaviour.Properties.copy(COAL_CLUSTER.get()).sound(SoundType.MEDIUM_AMETHYST_BUD).lightLevel((state) -> 2)));

    public static final RegistryObject<Block> SMALL_COAL_BUD = registerBlock("small_coal_bud",
            () -> new AmethystClusterBlock(3, 4, BlockBehaviour.Properties.copy(COAL_CLUSTER.get()).sound(SoundType.SMALL_AMETHYST_BUD).lightLevel((state) -> 2)));



    public static final RegistryObject<Block> BUDDING_REDSTONE = registerBlock("budding_redstone",
            () -> new BuddingRedstoneBlock(BlockBehaviour.Properties.of(Material.STONE).strength(1.5f).sound(SoundType.AMETHYST).randomTicks().requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> REDSTONE_SHARD_BLOCK = registerBlock("redstone_shard_block",
            () -> new AmethystBlock(BlockBehaviour.Properties.of(Material.STONE).strength(1.5f).sound(SoundType.AMETHYST).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> REDSTONE_CLUSTER = registerBlock("redstone_cluster",
            () -> new AmethystClusterBlock(7, 3, BlockBehaviour.Properties.of(Material.AMETHYST).noOcclusion().randomTicks().sound(SoundType.AMETHYST_CLUSTER).strength(1.5f).lightLevel((state) -> 5)));

    public static final RegistryObject<Block> LARGE_REDSTONE_BUD = registerBlock("large_redstone_bud",
            () -> new AmethystClusterBlock(5, 3, BlockBehaviour.Properties.copy(REDSTONE_CLUSTER.get()).sound(SoundType.LARGE_AMETHYST_BUD).lightLevel((state) -> 4)));

    public static final RegistryObject<Block> MEDIUM_REDSTONE_BUD = registerBlock("medium_redstone_bud",
            () -> new AmethystClusterBlock(4, 3, BlockBehaviour.Properties.copy(REDSTONE_CLUSTER.get()).sound(SoundType.MEDIUM_AMETHYST_BUD).lightLevel((state) -> 2)));

    public static final RegistryObject<Block> SMALL_REDSTONE_BUD = registerBlock("small_redstone_bud",
            () -> new AmethystClusterBlock(3, 4, BlockBehaviour.Properties.copy(REDSTONE_CLUSTER.get()).sound(SoundType.SMALL_AMETHYST_BUD).lightLevel((state) -> 2)));



    public static final RegistryObject<Block> BUDDING_QUARTZ = registerBlock("budding_quartz",
            () -> new BuddingQuartzBlock(BlockBehaviour.Properties.of(Material.STONE).strength(1.5f).sound(SoundType.AMETHYST).randomTicks().requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> QUARTZ_SHARD_BLOCK = registerBlock("quartz_shard_block",
            () -> new AmethystBlock(BlockBehaviour.Properties.of(Material.STONE).strength(1.5f).sound(SoundType.AMETHYST).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> QUARTZ_CLUSTER = registerBlock("quartz_cluster",
            () -> new AmethystClusterBlock(7, 3, BlockBehaviour.Properties.of(Material.AMETHYST).noOcclusion().randomTicks().sound(SoundType.AMETHYST_CLUSTER).strength(1.5f).lightLevel((state) -> 5)));

    public static final RegistryObject<Block> LARGE_QUARTZ_BUD = registerBlock("large_quartz_bud",
            () -> new AmethystClusterBlock(5, 3, BlockBehaviour.Properties.copy(QUARTZ_CLUSTER.get()).sound(SoundType.LARGE_AMETHYST_BUD).lightLevel((state) -> 4)));

    public static final RegistryObject<Block> MEDIUM_QUARTZ_BUD = registerBlock("medium_quartz_bud",
            () -> new AmethystClusterBlock(4, 3, BlockBehaviour.Properties.copy(QUARTZ_CLUSTER.get()).sound(SoundType.MEDIUM_AMETHYST_BUD).lightLevel((state) -> 2)));

    public static final RegistryObject<Block> SMALL_QUARTZ_BUD = registerBlock("small_quartz_bud",
            () -> new AmethystClusterBlock(3, 4, BlockBehaviour.Properties.copy(QUARTZ_CLUSTER.get()).sound(SoundType.SMALL_AMETHYST_BUD).lightLevel((state) -> 2)));



    public static final RegistryObject<Block> BUDDING_DIAMOND = registerBlock("budding_diamond",
            () -> new BuddingDiamondBlock(BlockBehaviour.Properties.of(Material.STONE).strength(1.5f).sound(SoundType.AMETHYST).randomTicks().requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> DIAMOND_SHARD_BLOCK = registerBlock("diamond_shard_block",
            () -> new AmethystBlock(BlockBehaviour.Properties.of(Material.STONE).strength(1.5f).sound(SoundType.AMETHYST).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> DIAMOND_CLUSTER = registerBlock("diamond_cluster",
            () -> new AmethystClusterBlock(7, 3, BlockBehaviour.Properties.of(Material.AMETHYST).noOcclusion().randomTicks().sound(SoundType.AMETHYST_CLUSTER).strength(1.5f).lightLevel((state) -> 5)));

    public static final RegistryObject<Block> LARGE_DIAMOND_BUD = registerBlock("large_diamond_bud",
            () -> new AmethystClusterBlock(5, 3, BlockBehaviour.Properties.copy(DIAMOND_CLUSTER.get()).sound(SoundType.LARGE_AMETHYST_BUD).lightLevel((state) -> 4)));

    public static final RegistryObject<Block> MEDIUM_DIAMOND_BUD = registerBlock("medium_diamond_bud",
            () -> new AmethystClusterBlock(4, 3, BlockBehaviour.Properties.copy(DIAMOND_CLUSTER.get()).sound(SoundType.MEDIUM_AMETHYST_BUD).lightLevel((state) -> 2)));

    public static final RegistryObject<Block> SMALL_DIAMOND_BUD = registerBlock("small_diamond_bud",
            () -> new AmethystClusterBlock(3, 4, BlockBehaviour.Properties.copy(DIAMOND_CLUSTER.get()).sound(SoundType.SMALL_AMETHYST_BUD).lightLevel((state) -> 2)));

    
    
    public static final RegistryObject<Block> BUDDING_EMERALD = registerBlock("budding_emerald",
            () -> new BuddingEmeraldBlock(BlockBehaviour.Properties.of(Material.STONE).strength(1.5f).sound(SoundType.AMETHYST).randomTicks().requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> EMERALD_SHARD_BLOCK = registerBlock("emerald_shard_block",
            () -> new AmethystBlock(BlockBehaviour.Properties.of(Material.STONE).strength(1.5f).sound(SoundType.AMETHYST).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> EMERALD_CLUSTER = registerBlock("emerald_cluster",
            () -> new AmethystClusterBlock(7, 3, BlockBehaviour.Properties.of(Material.AMETHYST).noOcclusion().randomTicks().sound(SoundType.AMETHYST_CLUSTER).strength(1.5f).lightLevel((state) -> 5)));

    public static final RegistryObject<Block> LARGE_EMERALD_BUD = registerBlock("large_emerald_bud",
            () -> new AmethystClusterBlock(5, 3, BlockBehaviour.Properties.copy(EMERALD_CLUSTER.get()).sound(SoundType.LARGE_AMETHYST_BUD).lightLevel((state) -> 4)));

    public static final RegistryObject<Block> MEDIUM_EMERALD_BUD = registerBlock("medium_emerald_bud",
            () -> new AmethystClusterBlock(4, 3, BlockBehaviour.Properties.copy(EMERALD_CLUSTER.get()).sound(SoundType.MEDIUM_AMETHYST_BUD).lightLevel((state) -> 2)));

    public static final RegistryObject<Block> SMALL_EMERALD_BUD = registerBlock("small_emerald_bud",
            () -> new AmethystClusterBlock(3, 4, BlockBehaviour.Properties.copy(EMERALD_CLUSTER.get()).sound(SoundType.SMALL_AMETHYST_BUD).lightLevel((state) -> 2)));

    
    
    public static final RegistryObject<Block> BUDDING_URANIUM = registerBlock("budding_uranium",
            () -> new BuddingUraniumBlock(BlockBehaviour.Properties.of(Material.STONE).strength(1.5f).sound(SoundType.AMETHYST).randomTicks().requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> URANIUM_SHARD_BLOCK = registerBlock("uranium_shard_block",
            () -> new AmethystBlock(BlockBehaviour.Properties.of(Material.STONE).strength(1.5f).sound(SoundType.AMETHYST).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> URANIUM_CLUSTER = registerBlock("uranium_cluster",
            () -> new AmethystClusterBlock(7, 3, BlockBehaviour.Properties.of(Material.AMETHYST).noOcclusion().randomTicks().sound(SoundType.AMETHYST_CLUSTER).strength(1.5f).lightLevel((state) -> 5)));

    public static final RegistryObject<Block> LARGE_URANIUM_BUD = registerBlock("large_uranium_bud",
            () -> new AmethystClusterBlock(5, 3, BlockBehaviour.Properties.copy(URANIUM_CLUSTER.get()).sound(SoundType.LARGE_AMETHYST_BUD).lightLevel((state) -> 4)));

    public static final RegistryObject<Block> MEDIUM_URANIUM_BUD = registerBlock("medium_uranium_bud",
            () -> new AmethystClusterBlock(4, 3, BlockBehaviour.Properties.copy(URANIUM_CLUSTER.get()).sound(SoundType.MEDIUM_AMETHYST_BUD).lightLevel((state) -> 2)));

    public static final RegistryObject<Block> SMALL_URANIUM_BUD = registerBlock("small_uranium_bud",
            () -> new AmethystClusterBlock(3, 4, BlockBehaviour.Properties.copy(URANIUM_CLUSTER.get()).sound(SoundType.SMALL_AMETHYST_BUD).lightLevel((state) -> 2)));

    
    
    public static final RegistryObject<Block> BUDDING_SILVER = registerBlock("budding_silver",
            () -> new BuddingSilverBlock(BlockBehaviour.Properties.of(Material.STONE).strength(1.5f).sound(SoundType.AMETHYST).randomTicks().requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> SILVER_SHARD_BLOCK = registerBlock("silver_shard_block",
            () -> new AmethystBlock(BlockBehaviour.Properties.of(Material.STONE).strength(1.5f).sound(SoundType.AMETHYST).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> SILVER_CLUSTER = registerBlock("silver_cluster",
            () -> new AmethystClusterBlock(7, 3, BlockBehaviour.Properties.of(Material.AMETHYST).noOcclusion().randomTicks().sound(SoundType.AMETHYST_CLUSTER).strength(1.5f).lightLevel((state) -> 5)));

    public static final RegistryObject<Block> LARGE_SILVER_BUD = registerBlock("large_silver_bud",
            () -> new AmethystClusterBlock(5, 3, BlockBehaviour.Properties.copy(SILVER_CLUSTER.get()).sound(SoundType.LARGE_AMETHYST_BUD).lightLevel((state) -> 4)));

    public static final RegistryObject<Block> MEDIUM_SILVER_BUD = registerBlock("medium_silver_bud",
            () -> new AmethystClusterBlock(4, 3, BlockBehaviour.Properties.copy(SILVER_CLUSTER.get()).sound(SoundType.MEDIUM_AMETHYST_BUD).lightLevel((state) -> 2)));

    public static final RegistryObject<Block> SMALL_SILVER_BUD = registerBlock("small_silver_bud",
            () -> new AmethystClusterBlock(3, 4, BlockBehaviour.Properties.copy(SILVER_CLUSTER.get()).sound(SoundType.SMALL_AMETHYST_BUD).lightLevel((state) -> 2)));

    
    
    public static final RegistryObject<Block> BUDDING_OSMIUM = registerBlock("budding_osmium",
            () -> new BuddingOsmiumBlock(BlockBehaviour.Properties.of(Material.STONE).strength(1.5f).sound(SoundType.AMETHYST).randomTicks().requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> OSMIUM_SHARD_BLOCK = registerBlock("osmium_shard_block",
            () -> new AmethystBlock(BlockBehaviour.Properties.of(Material.STONE).strength(1.5f).sound(SoundType.AMETHYST).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> OSMIUM_CLUSTER = registerBlock("osmium_cluster",
            () -> new AmethystClusterBlock(7, 3, BlockBehaviour.Properties.of(Material.AMETHYST).noOcclusion().randomTicks().sound(SoundType.AMETHYST_CLUSTER).strength(1.5f).lightLevel((state) -> 5)));

    public static final RegistryObject<Block> LARGE_OSMIUM_BUD = registerBlock("large_osmium_bud",
            () -> new AmethystClusterBlock(5, 3, BlockBehaviour.Properties.copy(OSMIUM_CLUSTER.get()).sound(SoundType.LARGE_AMETHYST_BUD).lightLevel((state) -> 4)));

    public static final RegistryObject<Block> MEDIUM_OSMIUM_BUD = registerBlock("medium_osmium_bud",
            () -> new AmethystClusterBlock(4, 3, BlockBehaviour.Properties.copy(OSMIUM_CLUSTER.get()).sound(SoundType.MEDIUM_AMETHYST_BUD).lightLevel((state) -> 2)));

    public static final RegistryObject<Block> SMALL_OSMIUM_BUD = registerBlock("small_osmium_bud",
            () -> new AmethystClusterBlock(3, 4, BlockBehaviour.Properties.copy(OSMIUM_CLUSTER.get()).sound(SoundType.SMALL_AMETHYST_BUD).lightLevel((state) -> 2)));

    
    
    public static final RegistryObject<Block> BUDDING_IRON = registerBlock("budding_iron",
            () -> new BuddingIronBlock(BlockBehaviour.Properties.of(Material.STONE).strength(1.5f).sound(SoundType.AMETHYST).randomTicks().requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> IRON_SHARD_BLOCK = registerBlock("iron_shard_block",
            () -> new AmethystBlock(BlockBehaviour.Properties.of(Material.STONE).strength(1.5f).sound(SoundType.AMETHYST).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> IRON_CLUSTER = registerBlock("iron_cluster",
            () -> new AmethystClusterBlock(7, 3, BlockBehaviour.Properties.of(Material.AMETHYST).noOcclusion().randomTicks().sound(SoundType.AMETHYST_CLUSTER).strength(1.5f).lightLevel((state) -> 5)));

    public static final RegistryObject<Block> LARGE_IRON_BUD = registerBlock("large_iron_bud",
            () -> new AmethystClusterBlock(5, 3, BlockBehaviour.Properties.copy(IRON_CLUSTER.get()).sound(SoundType.LARGE_AMETHYST_BUD).lightLevel((state) -> 4)));

    public static final RegistryObject<Block> MEDIUM_IRON_BUD = registerBlock("medium_iron_bud",
            () -> new AmethystClusterBlock(4, 3, BlockBehaviour.Properties.copy(IRON_CLUSTER.get()).sound(SoundType.MEDIUM_AMETHYST_BUD).lightLevel((state) -> 2)));

    public static final RegistryObject<Block> SMALL_IRON_BUD = registerBlock("small_iron_bud",
            () -> new AmethystClusterBlock(3, 4, BlockBehaviour.Properties.copy(IRON_CLUSTER.get()).sound(SoundType.SMALL_AMETHYST_BUD).lightLevel((state) -> 2)));

    
    
    public static final RegistryObject<Block> BUDDING_GOLD = registerBlock("budding_gold",
            () -> new BuddingGoldBlock(BlockBehaviour.Properties.of(Material.STONE).strength(1.5f).sound(SoundType.AMETHYST).randomTicks().requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> GOLD_SHARD_BLOCK = registerBlock("gold_shard_block",
            () -> new AmethystBlock(BlockBehaviour.Properties.of(Material.STONE).strength(1.5f).sound(SoundType.AMETHYST).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> GOLD_CLUSTER = registerBlock("gold_cluster",
            () -> new AmethystClusterBlock(7, 3, BlockBehaviour.Properties.of(Material.AMETHYST).noOcclusion().randomTicks().sound(SoundType.AMETHYST_CLUSTER).strength(1.5f).lightLevel((state) -> 5)));

    public static final RegistryObject<Block> LARGE_GOLD_BUD = registerBlock("large_gold_bud",
            () -> new AmethystClusterBlock(5, 3, BlockBehaviour.Properties.copy(GOLD_CLUSTER.get()).sound(SoundType.LARGE_AMETHYST_BUD).lightLevel((state) -> 4)));

    public static final RegistryObject<Block> MEDIUM_GOLD_BUD = registerBlock("medium_gold_bud",
            () -> new AmethystClusterBlock(4, 3, BlockBehaviour.Properties.copy(GOLD_CLUSTER.get()).sound(SoundType.MEDIUM_AMETHYST_BUD).lightLevel((state) -> 2)));

    public static final RegistryObject<Block> SMALL_GOLD_BUD = registerBlock("small_gold_bud",
            () -> new AmethystClusterBlock(3, 4, BlockBehaviour.Properties.copy(GOLD_CLUSTER.get()).sound(SoundType.SMALL_AMETHYST_BUD).lightLevel((state) -> 2)));

    
    
    
    public static final RegistryObject<Block> BUDDING_DEBRIS = registerBlock("budding_debris",
            () -> new BuddingDebrisBlock(BlockBehaviour.Properties.of(Material.STONE).strength(1.5f).sound(SoundType.AMETHYST).randomTicks().requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> DEBRIS_SHARD_BLOCK = registerBlock("debris_shard_block",
            () -> new AmethystBlock(BlockBehaviour.Properties.of(Material.STONE).strength(1.5f).sound(SoundType.AMETHYST).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> DEBRIS_CLUSTER = registerBlock("debris_cluster",
            () -> new AmethystClusterBlock(7, 3, BlockBehaviour.Properties.of(Material.AMETHYST).noOcclusion().randomTicks().sound(SoundType.AMETHYST_CLUSTER).strength(1.5f).lightLevel((state) -> 5)));

    public static final RegistryObject<Block> LARGE_DEBRIS_BUD = registerBlock("large_debris_bud",
            () -> new AmethystClusterBlock(5, 3, BlockBehaviour.Properties.copy(DEBRIS_CLUSTER.get()).sound(SoundType.LARGE_AMETHYST_BUD).lightLevel((state) -> 4)));

    public static final RegistryObject<Block> MEDIUM_DEBRIS_BUD = registerBlock("medium_debris_bud",
            () -> new AmethystClusterBlock(4, 3, BlockBehaviour.Properties.copy(DEBRIS_CLUSTER.get()).sound(SoundType.MEDIUM_AMETHYST_BUD).lightLevel((state) -> 2)));

    public static final RegistryObject<Block> SMALL_DEBRIS_BUD = registerBlock("small_debris_bud",
            () -> new AmethystClusterBlock(3, 4, BlockBehaviour.Properties.copy(DEBRIS_CLUSTER.get()).sound(SoundType.SMALL_AMETHYST_BUD).lightLevel((state) -> 2)));

    
    
    
    public static final RegistryObject<Block> BUDDING_COPPER = registerBlock("budding_copper",
            () -> new BuddingCopperBlock(BlockBehaviour.Properties.of(Material.STONE).strength(1.5f).sound(SoundType.AMETHYST).randomTicks().requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> COPPER_SHARD_BLOCK = registerBlock("copper_shard_block",
            () -> new AmethystBlock(BlockBehaviour.Properties.of(Material.STONE).strength(1.5f).sound(SoundType.AMETHYST).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> COPPER_CLUSTER = registerBlock("copper_cluster",
            () -> new AmethystClusterBlock(7, 3, BlockBehaviour.Properties.of(Material.AMETHYST).noOcclusion().randomTicks().sound(SoundType.AMETHYST_CLUSTER).strength(1.5f).lightLevel((state) -> 5)));

    public static final RegistryObject<Block> LARGE_COPPER_BUD = registerBlock("large_copper_bud",
            () -> new AmethystClusterBlock(5, 3, BlockBehaviour.Properties.copy(COPPER_CLUSTER.get()).sound(SoundType.LARGE_AMETHYST_BUD).lightLevel((state) -> 4)));

    public static final RegistryObject<Block> MEDIUM_COPPER_BUD = registerBlock("medium_copper_bud",
            () -> new AmethystClusterBlock(4, 3, BlockBehaviour.Properties.copy(COPPER_CLUSTER.get()).sound(SoundType.MEDIUM_AMETHYST_BUD).lightLevel((state) -> 2)));

    public static final RegistryObject<Block> SMALL_COPPER_BUD = registerBlock("small_copper_bud",
            () -> new AmethystClusterBlock(3, 4, BlockBehaviour.Properties.copy(COPPER_CLUSTER.get()).sound(SoundType.SMALL_AMETHYST_BUD).lightLevel((state) -> 2)));














    private static <T extends Block>RegistryObject<T> registerBlock(String name, Supplier<T> block, String tooltipKey) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tooltipKey);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block, String tooltipKey) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(ModCreativeModTab.GEODEOPOLIS)){
            @Override
            public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltip, TooltipFlag pFlag) {
                pTooltip.add(Component.literal(tooltipKey));
            }
        });

    }








    private static <T extends Block>RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(ModCreativeModTab.GEODEOPOLIS)));

    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
