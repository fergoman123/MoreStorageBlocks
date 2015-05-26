package io.github.fergoman123.msb.common.blocks;

import io.github.fergoman123.msb.api.BlockMultiMSB;
import io.github.fergoman123.msb.info.BlockNames;
import io.github.fergoman123.msb.init.Sounds;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.IStringSerializable;
import net.minecraft.world.World;

import java.util.List;

public class BlockPorkchop extends BlockMultiMSB
{
    public static final PropertyEnum VARIANT = PropertyEnum.create("variant", EnumType.class);

    public BlockPorkchop()
    {
        super(Material.iron, BlockNames.blockPorkchop, BlockNames.blockPorkchopName);
        this.setDefaultState(this.blockState.getBaseState().withProperty(VARIANT, EnumType.blockRawPorkchop));
        this.setStepSound(Sounds.pig);
    }

    @Override
    public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumFacing side, float hitX, float hitY, float hitZ) {
        if (!worldIn.isRemote)
        {
            return false;
        }
        else
        {
            worldIn.playSoundAtEntity(playerIn, "pig", 1f, 1f);
            return true;
        }
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

    @Override
    public Item getItem(World worldIn, BlockPos pos) {
        return Item.getItemFromBlock(this);
    }

    @Override
    public int damageDropped(IBlockState state) {
        return ((EnumType)state.getValue(VARIANT)).ordinal();
    }

    @Override
    public void getSubBlocks(Item item, CreativeTabs tab, List list) {
        list.add(new ItemStack(item, 1, EnumType.blockRawPorkchop.getMeta()));
        list.add(new ItemStack(item, 1, EnumType.blockCookedPorkchop.getMeta()));
    }

    public enum EnumType implements IStringSerializable
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

        public int getMeta()
        {
            return this.ordinal();
        }
    }
}
