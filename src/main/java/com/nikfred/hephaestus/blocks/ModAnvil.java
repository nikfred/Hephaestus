package com.nikfred.hephaestus.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.IBooleanFunction;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nonnull;

public class ModAnvil extends Block {

    private static final VoxelShape TOP = Block.makeCuboidShape(1, 7, 1, 15, 13, 15);
    private static final VoxelShape BOTTOM = Block.makeCuboidShape(2, 0, 2, 14, 7, 14);
    private static final VoxelShape SHAPE = VoxelShapes.combineAndSimplify(TOP, BOTTOM, IBooleanFunction.OR);

    public ModAnvil (Properties properties){
        super(properties
                .sound(SoundType.ANVIL)
                .harvestTool(ToolType.PICKAXE)
                .setRequiresTool());
    }

    @Nonnull
    @Override
    public VoxelShape getShape(BlockState state, IBlockReader world, BlockPos pos, ISelectionContext ctx){
        return SHAPE;
    }
}
