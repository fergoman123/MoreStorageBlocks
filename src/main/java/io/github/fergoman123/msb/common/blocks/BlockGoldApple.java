package io.github.fergoman123.msb.common.blocks;

import io.github.fergoman123.msb.api.BlockMultiMSB;
import io.github.fergoman123.msb.enums.GoldAppleType;
import io.github.fergoman123.msb.info.BlockNames;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;

public class BlockGoldApple extends BlockMultiMSB
{
    public static final PropertyEnum VARIANT = PropertyEnum.create("variant", GoldAppleType.class);

    public BlockGoldApple()
    {
        super(BlockNames.blockGoldApple, BlockNames.blockGoldAppleName);
        this.setDefaultState(this.blockState.getBaseState().withProperty(VARIANT, GoldAppleType.blockGoldApple1));
    }

    @Override
    public IBlockState getStateFromMeta(int meta) {
        return this.getDefaultState().withProperty(VARIANT, GoldAppleType.values()[meta]);
    }

    @Override
    public int getMetaFromState(IBlockState state) {
        return ((GoldAppleType)state.getValue(VARIANT)).getMeta();
    }

    @Override
    public BlockState createBlockState() {
        return new BlockState(this, VARIANT);
    }

    @Override
    public Item getItem(World worldIn, BlockPos pos) {
        return Item.getItemFromBlock(this);
    }

    @Override
    public int damageDropped(IBlockState state) {
        return ((GoldAppleType)state.getValue(VARIANT)).getMeta();
    }
}
