package io.github.fergoman123.msb.block;

import io.github.fergoman123.msb.enums.EnumTypes;
import io.github.fergoman123.msb.info.BlockNames;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;

public class BlockSeeds extends BlockMultiMSB {
    public static final PropertyEnum VARIANT = PropertyEnum.create("variant", EnumTypes.Seeds.class);
    public BlockSeeds(String name) {
        super(BlockNames.blockSeeds, name);
        this.setDefaultState(this.blockState.getBaseState().withProperty(VARIANT, EnumTypes.Seeds.blockWheatSeeds));
    }

    @Override
    public int damageDropped(IBlockState state) {
        return ((EnumTypes.Seeds)state.getValue(VARIANT)).getMeta();
    }

    @Override
    public IBlockState getStateFromMeta(int meta) {
        return this.getDefaultState().withProperty(VARIANT, EnumTypes.Seeds.values()[meta]);
    }

    @Override
    public int getMetaFromState(IBlockState state) {
        return ((EnumTypes.Seeds)state.getValue(VARIANT)).getMeta();
    }

    @Override
    public BlockState createBlockState() {
        return new BlockState(this, VARIANT);
    }
}
