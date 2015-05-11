package io.github.fergoman123.msb.common.blocks;

import io.github.fergoman123.msb.api.BlockMultiMSB;
import io.github.fergoman123.msb.api.Sounds;
import io.github.fergoman123.msb.info.BlockNames;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.util.IStringSerializable;
import net.minecraft.world.World;

import java.util.List;

public class BlockMutton extends BlockMultiMSB
{
    public static final PropertyEnum VARIANT = PropertyEnum.create("variant", EnumType.class);

    public BlockMutton()
    {
        super(Material.iron, BlockNames.blockMutton, BlockNames.blockMuttonName);
        this.setDefaultState(this.blockState.getBaseState().withProperty(VARIANT, EnumType.blockRawMutton));
        this.setStepSound(Sounds.mutton);
    }

    @Override
    public int damageDropped(IBlockState state) {
        return ((EnumType)state.getValue(VARIANT)).ordinal();
    }

    @Override
    public IBlockState getStateFromMeta(int meta) {
        return this.getDefaultState().withProperty(VARIANT, EnumType.values()[meta]);
    }

    @Override
    public int getMetaFromState(IBlockState state) {
        return ((EnumType)state.getValue(VARIANT)).ordinal();
    }

    @Override
    public BlockState createBlockState() {
        return new BlockState(this, VARIANT);
    }

    public Item getItem(World world, BlockPos pos)
    {
        return Item.getItemFromBlock(this);
    }

    @Override
    public void getSubBlocks(Item item, CreativeTabs tab, List list) {
        list.add(new ItemStack(item, 1, EnumType.blockRawMutton.getMeta()));
        list.add(new ItemStack(item, 1, EnumType.blockCookedMutton.getMeta()));
    }

    public enum EnumType implements IStringSerializable
    {
        blockRawMutton,
        blockCookedMutton;

        @Override
        public String getName() {
            return this.name();
        }

        @Override
        public String toString() {
            return getName();
        }

        public int getMeta()
        {
            return this.ordinal();
        }
    }
}
