package io.github.fergoman123.msb.common.blocks;

import java.util.Random;

import io.github.fergoman123.msb.api.BlockMultiMSB;
import io.github.fergoman123.msb.enums.EnumTypes;
import io.github.fergoman123.msb.info.BlockNames;
import net.minecraft.block.Block;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;

public class BlockFish extends BlockMultiMSB
{
    public static final PropertyEnum VARIANT = PropertyEnum.create("variant", EnumTypes.Fish.class);

    public BlockFish()
    {
        super(BlockNames.blockFish, BlockNames.blockFishName);
        this.setDefaultState(this.blockState.getBaseState().withProperty(VARIANT, EnumTypes.Fish.blockRawFish));
        this.setStepSound(Block.soundTypeMetal);
    }

    @Override
    public IBlockState getStateFromMeta(int meta) {
        return this.getDefaultState().withProperty(VARIANT, EnumTypes.Fish.values()[meta]);
    }

    @Override
    public int getMetaFromState(IBlockState state) {
        return ((EnumTypes.Fish)state.getValue(VARIANT)).ordinal();
    }

    @Override
    public BlockState createBlockState() {
        return new BlockState(this, VARIANT);
    }

    @Override
    public Item getItem(World worldIn, BlockPos pos) {
        return Item.getItemFromBlock(this);
    }

    @Override
    public int damageDropped(IBlockState state) {
        return ((EnumTypes.Fish)state.getValue(VARIANT)).ordinal();
    }
    
    @Override
    public Item getItemDropped(IBlockState state, Random random, int fortune) {
    	// TODO: fix this
    	return null;
    }
}
