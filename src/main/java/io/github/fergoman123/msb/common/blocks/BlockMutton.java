package io.github.fergoman123.msb.common.blocks;

import java.util.Random;

import io.github.fergoman123.msb.api.BlockMultiMSB;
import io.github.fergoman123.msb.enums.EnumTypes;
import io.github.fergoman123.msb.info.BlockNames;
import io.github.fergoman123.msb.init.Sounds;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;

public class BlockMutton extends BlockMultiMSB
{
    public static final PropertyEnum VARIANT = PropertyEnum.create("variant", EnumTypes.Mutton.class);

    public BlockMutton()
    {
        super(BlockNames.blockMutton, BlockNames.blockMuttonName);
        this.setDefaultState(this.blockState.getBaseState().withProperty(VARIANT, EnumTypes.Mutton.blockRawMutton));
        this.setStepSound(Sounds.mutton);
    }

    @Override
    public int damageDropped(IBlockState state) {
        return ((EnumTypes.Mutton)state.getValue(VARIANT)).ordinal();
    }

    @Override
    public IBlockState getStateFromMeta(int meta) {
        return this.getDefaultState().withProperty(VARIANT, EnumTypes.Mutton.values()[meta]);
    }

    @Override
    public int getMetaFromState(IBlockState state) {
        return ((EnumTypes.Mutton)state.getValue(VARIANT)).ordinal();
    }

    @Override
    public BlockState createBlockState() {
        return new BlockState(this, VARIANT);
    }
    
    @Override
    public Item getItemDropped(IBlockState state, Random random, int fortune) {
    	return null; //TODO: fix this
    }

    public Item getItem(World world, BlockPos pos) {
        return Item.getItemFromBlock(this);
    }
}
