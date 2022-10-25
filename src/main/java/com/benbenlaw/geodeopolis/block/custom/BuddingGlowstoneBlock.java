package com.benbenlaw.geodeopolis.block.custom;

import com.benbenlaw.geodeopolis.block.ModBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.block.AmethystBlock;
import net.minecraft.world.level.block.AmethystClusterBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.level.material.PushReaction;

public class BuddingGlowstoneBlock extends AmethystBlock {
    public static final int GROWTH_CHANCE = 5;
    private static final Direction[] DIRECTIONS = Direction.values();

    public BuddingGlowstoneBlock(Properties p_152726_) {
        super(p_152726_);
    }

    public PushReaction getPistonPushReaction(BlockState pState) {
        return PushReaction.DESTROY;
    }

    public void randomTick(BlockState p_220898_, ServerLevel p_220899_, BlockPos p_220900_, RandomSource p_220901_) {
        if (p_220901_.nextInt(5) == 0) {
            Direction direction = DIRECTIONS[p_220901_.nextInt(DIRECTIONS.length)];
            BlockPos blockpos = p_220900_.relative(direction);
            BlockState blockstate = p_220899_.getBlockState(blockpos);
            Block block = null;
            if (canClusterGrowAtState(blockstate)) {
                block = ModBlocks.SMALL_GLOWSTONE_BUD.get();
            } else if (blockstate.is(ModBlocks.SMALL_GLOWSTONE_BUD.get()) && blockstate.getValue(AmethystClusterBlock.FACING) == direction) {
                block = ModBlocks.MEDIUM_GLOWSTONE_BUD.get();
            } else if (blockstate.is(ModBlocks.MEDIUM_GLOWSTONE_BUD.get()) && blockstate.getValue(AmethystClusterBlock.FACING) == direction) {
                block = ModBlocks.LARGE_GLOWSTONE_BUD.get();
            } else if (blockstate.is(ModBlocks.LARGE_GLOWSTONE_BUD.get()) && blockstate.getValue(AmethystClusterBlock.FACING) == direction) {
                block = ModBlocks.GLOWSTONE_CLUSTER.get();
            }

            if (block != null) {
                BlockState blockstate1 = block.defaultBlockState().setValue(AmethystClusterBlock.FACING, direction).setValue(AmethystClusterBlock.WATERLOGGED, Boolean.valueOf(blockstate.getFluidState().getType() == Fluids.WATER));
                p_220899_.setBlockAndUpdate(blockpos, blockstate1);
            }

        }
    }

    public static boolean canClusterGrowAtState(BlockState pState) {
        return pState.isAir() || pState.is(Blocks.WATER) && pState.getFluidState().getAmount() == 8;
    }
}