package dev.doctor4t.trainmurdermystery.block;

import net.minecraft.block.BarrierBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockRenderType;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;

public class LightBarrierBlock extends BarrierBlock {
    public LightBarrierBlock(Settings settings) {
        super(settings);
    }

    @Override
    protected int getOpacity(BlockState state, BlockView world, BlockPos pos) {
        return 15;
    }
}