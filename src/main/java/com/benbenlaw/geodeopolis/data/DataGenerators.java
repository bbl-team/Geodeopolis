package com.benbenlaw.geodeopolis.data;


import com.benbenlaw.geodeopolis.Geodeopolis;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Geodeopolis.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerators {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();

    //    generator.addProvider(true, new ModRecipeProvider(generator));
    //    generator.addProvider(true, new ModLootTableProvider(generator));
        generator.addProvider(true, new ModBlockStatesProvider(generator, existingFileHelper));
        generator.addProvider(true, new ModItemModelProvider(generator, existingFileHelper));
        generator.addProvider(true, new ModBlockTagProvider(generator, Geodeopolis.MOD_ID, existingFileHelper));
    }
}