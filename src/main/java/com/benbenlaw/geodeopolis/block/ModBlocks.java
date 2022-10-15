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
