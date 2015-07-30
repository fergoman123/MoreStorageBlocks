package io.github.fergoman123.msb.block;

import io.github.fergoman123.msb.info.BlockNames;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;

import static io.github.fergoman123.msb.enums.EnumTypes.Skull;

public class BlockSkullStorage extends BlockMultiMSB{
    public static final PropertyEnum VARIANT = PropertyEnum.create("variant", Skull.class);

    public BlockSkullStorage(String name) {
        super(BlockNames.blockSkull, name);
        this.setDefaultState(this.blockState.getBaseState().withProperty(VARIANT, Skull.blockSkullSkeleton));
    }

    @Override
    public int damageDropped(IBlockState state) {
        return ((Skull)state.getValue(VARIANT)).getMeta();
    }

    @Override
    public IBlockState getStateFromMeta(int meta) {
        return this.getDefaultState().withProperty(VARIANT, Skull.values()[meta]);
    }

    @Override
    public int getMetaFromState(IBlockState state) {
        return ((Skull)state.getValue(VARIANT)).getMeta();
    }

    @Override
    public BlockState createBlockState() {
        return new BlockState(this, VARIANT);
    }
}
