package io.github.fergoman123.msb.common.blocks;

import io.github.fergoman123.fergoutil.block.BlockFergo;
import io.github.fergoman123.msb.MSB;
import io.github.fergoman123.msb.info.BlockNames;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IStringSerializable;

import java.util.List;

public class BlockSkullStorage extends BlockFergo
{
    public static final PropertyEnum VARIANT = PropertyEnum.create("variant", EnumType.class);

    public BlockSkullStorage()
    {
        super(Material.iron, 1, MSB.tabMSB, 5f, 10f, BlockNames.blockSkullName);
        this.setDefaultState(this.blockState.getBaseState().withProperty(VARIANT, EnumType.blockSkullSkeleton));
        this.setHarvestLevel("pickaxe", 1);
        this.setStepSound(BlockFergo.soundTypeMetal);
    }

    @Override
    public void getSubBlocks(Item itemIn, CreativeTabs tab, List list) {
        list.add(new ItemStack(itemIn, 1, EnumType.blockSkullSkeleton.ordinal()));
        list.add(new ItemStack(itemIn, 1, EnumType.blockSkullWither.ordinal()));
        list.add(new ItemStack(itemIn, 1, EnumType.blockSkullZombie.ordinal()));
        list.add(new ItemStack(itemIn, 1, EnumType.blockSkullCreeper.ordinal()));
    }

    @Override
    public IBlockState getStateFromMeta(int meta) {
        return this.getDefaultState().withProperty(VARIANT, EnumType.values()[meta]);
    }

    @Override
    public int getMetaFromState(IBlockState state) {
        int meta = ((EnumType)state.getValue(VARIANT)).ordinal();

        return meta;
    }

    @Override
    protected BlockState createBlockState() {
        return new BlockState(this, new IProperty[]{VARIANT});
    }

    public static enum EnumType implements IStringSerializable
    {
        blockSkullSkeleton,
        blockSkullWither,
        blockSkullZombie,
        blockSkullCreeper;

        @Override
        public String getName() {
            return this.name();
        }

        @Override
        public String toString() {
            return getName();
        }
    }
}
