package io.github.fergoman123.msb.block;

import io.github.fergoman123.msb.enums.EnumTypes.Porkchop;
import io.github.fergoman123.msb.info.BlockNames;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;

public class BlockPorkchop extends BlockMultiMSB{

    public static final PropertyEnum VARIANT = PropertyEnum.create("variant", Porkchop.class);

    public BlockPorkchop(String name) {
        super(BlockNames.blockGoldApple, name);
        this.setDefaultState(this.blockState.getBaseState().withProperty(VARIANT, Porkchop.blockRawPorkchop));
    }

    @Override
    public int damageDropped(IBlockState state) {
        return ((Porkchop)state.getValue(VARIANT)).getMeta();
    }

    @Override
    public IBlockState getStateFromMeta(int meta) {
        return this.getDefaultState().withProperty(VARIANT, Porkchop.values()[meta]);
    }

    @Override
    public int getMetaFromState(IBlockState state) {
        return ((Porkchop)state.getValue(VARIANT)).getMeta();
    }

    @Override
    public BlockState createBlockState() {
        return new BlockState(this, VARIANT);
    }
}
