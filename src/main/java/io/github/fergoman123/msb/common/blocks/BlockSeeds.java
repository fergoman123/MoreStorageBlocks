package io.github.fergoman123.msb.common.blocks;

import io.github.fergoman123.fergoutil.block.BlockFergo;
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

public class BlockSeeds extends BlockFergo
{
    public static final PropertyEnum VARIANT = PropertyEnum.create("variant", EnumType.class);

    public BlockSeeds() {
        super(Material.iron, 1, MSB.tabMSB, 5f, 10f, BlockNames.blockSeedsName);
        this.setDefaultState(this.blockState.getBaseState().withProperty(VARIANT, EnumType.blockWheatSeeds));
        this.setHarvestLevel("pickaxe", 1);
        this.setStepSound(Block.soundTypeMetal);
    }

    @Override
    public void getSubBlocks(Item itemIn, CreativeTabs tab, List list) {
        list.add(new ItemStack(itemIn, 1, EnumType.blockWheatSeeds.ordinal()));
        list.add(new ItemStack(itemIn, 1, EnumType.blockPumpkinSeeds.ordinal()));
        list.add(new ItemStack(itemIn, 1, EnumType.blockMelonSeeds.ordinal()));
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

    public static enum EnumType implements IStringSerializable
    {
        blockWheatSeeds,
        blockPumpkinSeeds,
        blockMelonSeeds;

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
