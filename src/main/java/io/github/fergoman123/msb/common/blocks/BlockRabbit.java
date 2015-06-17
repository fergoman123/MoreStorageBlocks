package io.github.fergoman123.msb.common.blocks;

import io.github.fergoman123.msb.api.BlockMultiMSB;
import io.github.fergoman123.msb.enums.RabbitType;
import io.github.fergoman123.msb.info.BlockNames;
import io.github.fergoman123.msb.init.Sounds;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;

public class BlockRabbit extends BlockMultiMSB
{
    public static final PropertyEnum VARIANT = PropertyEnum.create("variant", RabbitType.class);

    public BlockRabbit()
    {
        super(BlockNames.blockRabbit, BlockNames.blockRabbitName);
        this.setDefaultState(this.blockState.getBaseState().withProperty(VARIANT, RabbitType.blockRawRabbit));
        this.setStepSound(Sounds.rabbit);
    }

    @Override
    public IBlockState getStateFromMeta(int meta) {
        return this.getDefaultState().withProperty(VARIANT, RabbitType.values()[meta]);
    }

    @Override
    public int getMetaFromState(IBlockState state) {
        return ((RabbitType)state.getValue(VARIANT)).ordinal();
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
        return ((RabbitType)state.getValue(VARIANT)).ordinal();
    }
}
