package io.github.fergoman123.msb.block;

import io.github.fergoman123.msb.info.BlockNames;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;

import static io.github.fergoman123.msb.enums.EnumTypes.Fish;

public class BlockFish extends BlockMultiMSB{
    public static final PropertyEnum VARIANT = PropertyEnum.create("variant", Fish.class);

    public BlockFish(String name) {
        super(BlockNames.blockFish, name);
    }

    @Override
    public int damageDropped(IBlockState state) {
        return ((Fish)state.getValue(VARIANT)).getMeta();
    }

    @Override
    public IBlockState getStateFromMeta(int meta) {
        return this.getDefaultState().withProperty(VARIANT, Fish.values()[meta]);
    }

    @Override
    public int getMetaFromState(IBlockState state) {
        return ((Fish)state.getValue(VARIANT)).getMeta();
    }

    @Override
    public BlockState createBlockState() {
        return new BlockState(this, VARIANT);
    }
}
