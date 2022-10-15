package com.benbenlaw.geodeopolis.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModTab {
    public static final CreativeModeTab GEODEOPOLIS = new CreativeModeTab("geodeopolis") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.TIN_SHARD.get());
        }
    };


}
