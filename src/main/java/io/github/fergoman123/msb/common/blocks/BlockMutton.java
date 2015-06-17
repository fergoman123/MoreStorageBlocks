package io.github.fergoman123.msb.common.blocks;

import io.github.fergoman123.msb.api.BlockMultiMSB;
import io.github.fergoman123.msb.enums.MuttonType;
import io.github.fergoman123.msb.info.BlockNames;
import io.github.fergoman123.msb.init.Sounds;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;

public class BlockMutton extends BlockMultiMSB
{
    public static final PropertyEnum VARIANT = PropertyEnum.create("variant", MuttonType.class);

    public BlockMutton()
    {
        super(BlockNames.blockMutton, BlockNames.blockMuttonName);
        this.setDefaultState(this.blockState.getBaseState().withProperty(VARIANT, MuttonType.blockRawMutton));
        this.setStepSound(Sounds.mutton);
    }

    @Override
    public int damageDropped(IBlockState state) {
        return ((MuttonType)state.getValue(VARIANT)).ordinal();
    }

    @Override
    public IBlockState getStateFromMeta(int meta) {
        return this.getDefaultState().withProperty(VARIANT, MuttonType.values()[meta]);
    }

    @Override
    public int getMetaFromState(IBlockState state) {
        return ((MuttonType)state.getValue(VARIANT)).ordinal();
    }

    @Override
    public BlockState createBlockState() {
        return new BlockState(this, VARIANT);
    }

    public Item getItem(World world, BlockPos pos) {
        return Item.getItemFromBlock(this);
    }
}
