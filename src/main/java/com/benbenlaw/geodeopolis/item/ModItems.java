package com.benbenlaw.geodeopolis.item;

import com.benbenlaw.geodeopolis.Geodeopolis;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ShearsItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Geodeopolis.MOD_ID);


    public static final RegistryObject<Item> CLUSTER_TEMPLATE = ITEMS.register("cluster_template",
            () -> new Item(new Item.Properties().tab(ModCreativeModTab.GEODEOPOLIS)));

    public static final RegistryObject<Item> ZINC_SHARD = ITEMS.register("zinc_shard",
            () -> new Item(new Item.Properties().tab(ModCreativeModTab.GEODEOPOLIS)));

    public static final RegistryObject<Item> GLOWSTONE_SHARD = ITEMS.register("glowstone_shard",
            () -> new Item(new Item.Properties().tab(ModCreativeModTab.GEODEOPOLIS)));

    public static final RegistryObject<Item> LEAD_SHARD = ITEMS.register("lead_shard",
            () -> new Item(new Item.Properties().tab(ModCreativeModTab.GEODEOPOLIS)));

    public static final RegistryObject<Item> NICKEL_SHARD = ITEMS.register("nickel_shard",
            () -> new Item(new Item.Properties().tab(ModCreativeModTab.GEODEOPOLIS)));

    public static final RegistryObject<Item> ALUMINUM_SHARD = ITEMS.register("aluminum_shard",
            () -> new Item(new Item.Properties().tab(ModCreativeModTab.GEODEOPOLIS)));

    public static final RegistryObject<Item> TIN_SHARD = ITEMS.register("tin_shard",
            () -> new Item(new Item.Properties().tab(ModCreativeModTab.GEODEOPOLIS)));

    public static final RegistryObject<Item> COPPER_SHARD = ITEMS.register("copper_shard",
            () -> new Item(new Item.Properties().tab(ModCreativeModTab.GEODEOPOLIS)));

    public static final RegistryObject<Item> DEBRIS_SHARD = ITEMS.register("debris_shard",
            () -> new Item(new Item.Properties().tab(ModCreativeModTab.GEODEOPOLIS)));

    public static final RegistryObject<Item> GOLD_SHARD = ITEMS.register("gold_shard",
            () -> new Item(new Item.Properties().tab(ModCreativeModTab.GEODEOPOLIS)));

    public static final RegistryObject<Item> IRON_SHARD = ITEMS.register("iron_shard",
            () -> new Item(new Item.Properties().tab(ModCreativeModTab.GEODEOPOLIS)));

    public static final RegistryObject<Item> OSMIUM_SHARD = ITEMS.register("osmium_shard",
            () -> new Item(new Item.Properties().tab(ModCreativeModTab.GEODEOPOLIS)));

    public static final RegistryObject<Item> SILVER_SHARD = ITEMS.register("silver_shard",
            () -> new Item(new Item.Properties().tab(ModCreativeModTab.GEODEOPOLIS)));

    public static final RegistryObject<Item> URANIUM_SHARD = ITEMS.register("uranium_shard",
            () -> new Item(new Item.Properties().tab(ModCreativeModTab.GEODEOPOLIS)));

    public static final RegistryObject<Item> COAL_SHARD = ITEMS.register("coal_shard",
            () -> new Item(new Item.Properties().tab(ModCreativeModTab.GEODEOPOLIS)));

    public static final RegistryObject<Item> REDSTONE_SHARD = ITEMS.register("redstone_shard",
            () -> new Item(new Item.Properties().tab(ModCreativeModTab.GEODEOPOLIS)));

    public static final RegistryObject<Item> QUARTZ_SHARD = ITEMS.register("quartz_shard",
            () -> new Item(new Item.Properties().tab(ModCreativeModTab.GEODEOPOLIS)));

    public static final RegistryObject<Item> DIAMOND_SHARD = ITEMS.register("diamond_shard",
            () -> new Item(new Item.Properties().tab(ModCreativeModTab.GEODEOPOLIS)));

    public static final RegistryObject<Item> EMERALD_SHARD = ITEMS.register("emerald_shard",
            () -> new Item(new Item.Properties().tab(ModCreativeModTab.GEODEOPOLIS)));




    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }



}