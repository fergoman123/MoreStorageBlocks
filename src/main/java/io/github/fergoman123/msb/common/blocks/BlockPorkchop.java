package io.github.fergoman123.msb.common.blocks;

import io.github.fergoman123.fergoutil.block.BlockFergo;
import io.github.fergoman123.msb.MSB;
import io.github.fergoman123.msb.info.BlockNames;
import net.minecraft.block.Block;
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

public class BlockPorkchop extends BlockFergo
{
    public static final PropertyEnum VARIANT = PropertyEnum.create("variant", EnumType.class);

    public BlockPorkchop()
    {
        super(Material.iron, 1, MSB.tabMSB, 5f, 10f, BlockNames.blockPorkchopName);
        this.setDefaultState(this.blockState.getBaseState().withProperty(VARIANT, EnumType.blockRawPorkchop));
        this.setHarvestLevel("pickaxe", 1);
        this.setStepSound(Block.soundTypeMetal);
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
    protected BlockState createBlockState() {
        return new BlockState(this, new IProperty[]{VARIANT});
    }

    @Override
    public void getSubBlocks(Item itemIn, CreativeTabs tab, List list) {
        list.add(new ItemStack(itemIn, 1, EnumType.blockRawPorkchop.ordinal()));
        list.add(new ItemStack(itemIn, 1, EnumType.blockCookedPorkchop.ordinal()));
    }

    public static enum EnumType implements IStringSerializable
    {
        blockRawPorkchop,
        blockCookedPorkchop;

        public String getName()
        {
            return this.name();
        }

        @Override
        public String toString() {
            return getName();
        }
    }
}
