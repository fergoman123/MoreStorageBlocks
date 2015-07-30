package io.github.fergoman123.msb.block;

import io.github.fergoman123.msb.info.BlockNames;
import net.minecraft.block.properties.PropertyEnum;
import io.github.fergoman123.msb.enums.EnumTypes.Rabbit;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;

public class BlockRabbit extends BlockMultiMSB {
    public static final PropertyEnum VARIANT = PropertyEnum.create("variant", Rabbit.class);

    public BlockRabbit(String name) {
        super(BlockNames.blockRabbit, name);
        this.setDefaultState(this.blockState.getBaseState().withProperty(VARIANT, Rabbit.blockRawRabbit));
    }

    @Override
    public int damageDropped(IBlockState state) {
        return ((Rabbit)state.getValue(VARIANT)).getMeta();
    }

    @Override
    public IBlockState getStateFromMeta(int meta) {
        return this.getDefaultState().withProperty(VARIANT, Rabbit.values()[meta]);
    }

    @Override
    public int getMetaFromState(IBlockState state) {
        return ((Rabbit)state.getValue(VARIANT)).getMeta();
    }

    @Override
    public BlockState createBlockState() {
        return new BlockState(this, VARIANT);
    }
}
