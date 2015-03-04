package io.github.fergoman123.msb.common.blocks;

import io.github.fergoman123.fergoutil.block.BlockFergo;
import io.github.fergoman123.fergoutil.helper.ItemStackHelper;
import io.github.fergoman123.fergoutil.helper.NameHelper;
import io.github.fergoman123.msb.MSB;
import io.github.fergoman123.msb.info.BlockNames;
import io.github.fergoman123.msb.info.ModInfo;
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

public class BlockGoldApple extends BlockFergo
{
    public static final PropertyEnum VARIANT = PropertyEnum.create("variant", EnumType.class);

    public BlockGoldApple()
    {
        super(Material.iron, 1, MSB.tabMSB, 5.f, 10f, BlockNames.blockGoldAppleName);
        this.setDefaultState(this.blockState.getBaseState().withProperty(VARIANT, EnumType.blockGoldApple1));
        this.setHarvestLevel("pickaxe", 1);
        this.setStepSound(Block.soundTypeMetal);
    }

    @Override
    public void getSubBlocks(Item itemIn, CreativeTabs tab, List list) {
        list.add(new ItemStack(itemIn, 1, EnumType.blockGoldApple1.ordinal()));
        list.add(new ItemStack(itemIn, 1, EnumType.blockGoldApple2.ordinal()));
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
        blockGoldApple1,
        blockGoldApple2;

        public static final String[] names = new String[]{blockGoldApple1.getName(), blockGoldApple2.getName()};

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
