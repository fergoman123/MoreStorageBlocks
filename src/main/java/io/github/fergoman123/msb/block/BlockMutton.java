package io.github.fergoman123.msb.block;

import io.github.fergoman123.msb.info.BlockNames;
import net.minecraft.block.properties.PropertyEnum;
import io.github.fergoman123.msb.enums.EnumTypes.Mutton;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;

public class BlockMutton extends BlockMultiMSB{
    public static final PropertyEnum VARIANT = PropertyEnum.create("variant", Mutton.class);

    public BlockMutton(String name){
        super(BlockNames.blockMutton, name);
        this.setDefaultState(this.blockState.getBaseState().withProperty(VARIANT, Mutton.blockRawMutton));
    }

    @Override
    public int damageDropped(IBlockState state) {
        return ((Mutton)state.getValue(VARIANT)).getMeta();
    }

    @Override
    public IBlockState getStateFromMeta(int meta) {
        return this.getDefaultState().withProperty(VARIANT, Mutton.values()[meta]);
    }

    @Override
    public int getMetaFromState(IBlockState state) {
        return ((Mutton)state.getValue(VARIANT)).getMeta();
    }

    @Override
    public BlockState createBlockState() {
        return new BlockState(this, VARIANT);
    }
}
