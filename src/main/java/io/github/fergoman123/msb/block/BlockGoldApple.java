package io.github.fergoman123.msb.block;

import io.github.fergoman123.msb.info.BlockNames;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;

import static io.github.fergoman123.msb.enums.EnumTypes.GoldApple;

public class BlockGoldApple extends BlockMultiMSB {

    public static final PropertyEnum VARIANT = PropertyEnum.create("variant", GoldApple.class);

    public BlockGoldApple(String name) {
        super(BlockNames.blockGoldApple, name);
        this.setDefaultState(this.blockState.getBaseState().withProperty(VARIANT, GoldApple.blockGoldApple1));
    }

    @Override
    public int damageDropped(IBlockState state) {
        return ((GoldApple)state.getValue(VARIANT)).getMeta();
    }

    @Override
    public IBlockState getStateFromMeta(int meta) {
        return this.getDefaultState().withProperty(VARIANT, GoldApple.values()[meta]);
    }

    @Override
    public int getMetaFromState(IBlockState state) {
        return ((GoldApple)state.getValue(VARIANT)).getMeta();
    }

    @Override
    public BlockState createBlockState() {
        return new BlockState(this, VARIANT);
    }
}
