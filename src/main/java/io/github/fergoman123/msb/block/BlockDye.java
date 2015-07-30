package io.github.fergoman123.msb.block;

import io.github.fergoman123.msb.info.BlockNames;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;

import static io.github.fergoman123.msb.enums.EnumTypes.Dye;

public class BlockDye extends BlockMultiMSB {
    public static final PropertyEnum VARIANT = PropertyEnum.create("variant", Dye.class);

    public BlockDye(String name){
        super(BlockNames.blockDye, name);
        this.setDefaultState(this.blockState.getBaseState().withProperty(VARIANT, Dye.blockInkSack));
    }


    @Override
    public int damageDropped(IBlockState state) {
        return ((Dye)state.getValue(VARIANT)).getMeta();
    }

    @Override
    public IBlockState getStateFromMeta(int meta) {
        return this.getDefaultState().withProperty(VARIANT, Dye.values()[meta]);
    }

    @Override
    public int getMetaFromState(IBlockState state) {
        return ((Dye)state.getValue(VARIANT)).getMeta();
    }

    @Override
    public BlockState createBlockState() {
        return new BlockState(this, VARIANT);
    }
}
