package io.github.fergoman123.msb.common.blocks;

import io.github.fergoman123.msb.tileentity.TileEntitySkullMSB;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BlockSkullMSB extends BlockContainer
{
    public static final PropertyDirection FACING = PropertyDirection.create("facing");

    public BlockSkullMSB()
    {
        super(Material.circuits);
        this.setDefaultState(this.blockState.getBaseState().withProperty(FACING, EnumFacing.NORTH));
        this.setBlockBounds(0.25F, 0.0F, 0.25F, 0.75F, 0.5F, 0.75F);
    }

    @Override
    public boolean isOpaqueCube() {
        return false;
    }

    @Override
    public boolean isFullBlock() {
        return false;
    }

    @Override
    public void setBlockBoundsBasedOnState(IBlockAccess worldIn, BlockPos pos) {
        switch (SwitchEnumFacing.FACING_LOOKUP[((EnumFacing)worldIn.getBlockState(pos).getValue(FACING)).ordinal()])
        {
            case 1:
            default:
                this.setBlockBounds(0.25F, 0.0F, 0.25F, 0.75F, 0.5F, 0.75F);
                break;
            case 2:
                this.setBlockBounds(0.25F, 0.25F, 0.5F, 0.75F, 0.75F, 1.0F);
                break;
            case 3:
                this.setBlockBounds(0.25F, 0.25F, 0.0F, 0.75F, 0.75F, 0.5F);
                break;
            case 4:
                this.setBlockBounds(0.5F, 0.25F, 0.25F, 1.0F, 0.75F, 0.75F);
                break;
            case 5:
                this.setBlockBounds(0.0F, 0.25F, 0.25F, 0.5F, 0.75F, 0.75F);
        }
    }

    @Override
    public AxisAlignedBB getCollisionBoundingBox(World worldIn, BlockPos pos, IBlockState state) {
        this.setBlockBoundsBasedOnState(worldIn, pos);
        return super.getCollisionBoundingBox(worldIn, pos, state);
    }

    @Override
    public IBlockState onBlockPlaced(World worldIn, BlockPos pos, EnumFacing facing, float hitX, float hitY, float hitZ, int meta, EntityLivingBase placer) {
        return this.getDefaultState().withProperty(FACING, placer.getHorizontalFacing());
    }

    @Override
    public TileEntity createNewTileEntity(World worldIn, int meta) {
        return new TileEntitySkullMSB();
    }

    @Override
    public Item getItem(World world, BlockPos pos) {
        return null;
        //todo skull item
    }

    @Override
    public int getDamageValue(World worldIn, BlockPos pos) {
        TileEntity entity = worldIn.getTileEntity(pos);
        return entity instanceof TileEntitySkullMSB ? ((TileEntitySkullMSB)entity).getSkullType() : super.getDamageValue(worldIn, pos);
    }

    @Override
    public void onBlockHarvested(World worldIn, BlockPos pos, IBlockState state, EntityPlayer player) {
        this.dropBlockAsItem(worldIn, pos, state, 0);
        super.onBlockHarvested(worldIn, pos, state, player);
    }

    @Override
    public void breakBlock(World worldIn, BlockPos pos, IBlockState state) {
        super.breakBlock(worldIn, pos, state);
    }

    @Override
    public List<ItemStack> getDrops(IBlockAccess world, BlockPos pos, IBlockState state, int fortune) {
        List<ItemStack> ret = new ArrayList<ItemStack>();
        {
            TileEntity entity = world.getTileEntity(pos);

            if (entity instanceof TileEntitySkullMSB)
            {
                TileEntitySkullMSB skullMSB = (TileEntitySkullMSB)entity;
                //ItemStack stack = new ItemStack(ModBlocks.itemSkullMSB, 1, skullMSB.getSkullType());
                //todo skull item

                //ret.add(stack);
            }
        }
        return ret;
    }

    @Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune) {
        return null;
        //todo skull item
    }

    @Override
    public IBlockState getStateFromMeta(int meta) {
        return this.getDefaultState().withProperty(FACING, EnumFacing.getFront(meta & 7));
    }

    @Override
    public int getMetaFromState(IBlockState state) {
        return ((EnumFacing) state.getValue(FACING)).getIndex();
    }

    @Override
    protected BlockState createBlockState() {
        return new BlockState(this, FACING);
    }

    static final class SwitchEnumFacing
    {
        static final int[] FACING_LOOKUP = new int[EnumFacing.values().length];

        static
        {
            try
            {
                FACING_LOOKUP[EnumFacing.UP.ordinal()] = 1;
            }
            catch (NoSuchFieldError var5)
            {
                var5.printStackTrace();
            }

            try
            {
                FACING_LOOKUP[EnumFacing.NORTH.ordinal()] = 2;
            }
            catch (NoSuchFieldError var4)
            {
                var4.printStackTrace();
            }

            try
            {
                FACING_LOOKUP[EnumFacing.SOUTH.ordinal()] = 3;
            }
            catch (NoSuchFieldError var3)
            {
                var3.printStackTrace();
            }

            try
            {
                FACING_LOOKUP[EnumFacing.WEST.ordinal()] = 4;
            }
            catch (NoSuchFieldError var2)
            {
                var2.printStackTrace();
            }

            try
            {
                FACING_LOOKUP[EnumFacing.EAST.ordinal()] = 5;
            }
            catch (NoSuchFieldError var1)
            {
                var1.printStackTrace();
            }
        }
    }
}
