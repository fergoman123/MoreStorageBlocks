package io.github.fergoman123.msb.block;

import io.github.fergoman123.msb.enums.EnumTypes.Beef;
import io.github.fergoman123.msb.info.BlockNames;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;

public class BlockBeef extends BlockMultiMSB{
    public static final PropertyEnum VARIANT = PropertyEnum.create("variant", Beef.class);

    public BlockBeef(String name) {
        super(BlockNames.blockBeef, name);
        this.setDefaultState(this.blockState.getBaseState().withProperty(VARIANT, Beef.blockRawBeef));
    }

    @Override
    public int damageDropped(IBlockState state) {
        return ((Beef)state.getValue(VARIANT)).getMeta();
    }

    @Override
    public IBlockState getStateFromMeta(int meta) {
        return this.getDefaultState().withProperty(VARIANT, Beef.values()[meta]);
    }

    @Override
    public int getMetaFromState(IBlockState state) {
        return ((Beef)state.getValue(VARIANT)).getMeta();
    }

    @Override
    public BlockState createBlockState() {
        return new BlockState(this, VARIANT);
    }
}
