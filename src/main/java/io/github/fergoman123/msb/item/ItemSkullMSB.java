package io.github.fergoman123.msb.item;

import io.github.fergoman123.fergoutil.helper.NameHelper;
import io.github.fergoman123.msb.MSB;
import io.github.fergoman123.msb.common.blocks.BlockSkullMSB;
import io.github.fergoman123.msb.info.BlockNames;
import io.github.fergoman123.msb.tileentity.TileEntitySkullMSB;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.List;

public class ItemSkullMSB extends Item {
    public ItemSkullMSB() {
        this.setUnlocalizedName(BlockNames.ItemNames.itemSkullMSB);
        this.setMaxDamage(0);
        this.setHasSubtypes(true);
        this.setCreativeTab(MSB.tabMSB);
    }

    public boolean onItemUse(ItemStack stack, EntityPlayer playerIn, World worldIn, BlockPos pos, EnumFacing side, float hitX, float hitY, float hitZ) {
        if (worldIn.getBlockState(pos).getBlock().isReplaceable(worldIn, pos) && side != EnumFacing.DOWN) {
            side = EnumFacing.UP;
            pos = pos.down();
        }
        if (side == EnumFacing.DOWN) {
            return false;
        } else {
            IBlockState iblockstate = worldIn.getBlockState(pos);
            Block block = iblockstate.getBlock();
            boolean flag = block.isReplaceable(worldIn, pos);

            if (!flag) {
                if (!worldIn.isSideSolid(pos, side, true)) {
                    return false;
                }

                pos = pos.offset(side);
            }

            if (!playerIn.canPlayerEdit(pos, side, stack)) {
                return false;
            }//todo replace Blocks.skull with Modblocks.blockSkullMSB
            else if (!Blocks.skull.canPlaceBlockAt(worldIn, pos)) {
                return false;
            } else {
                if (!worldIn.isRemote) {
                    //todo replace Blocks.skull with Modblocks.blockSkullMSB
                    if (!Blocks.skull.canPlaceBlockOnSide(worldIn, pos, side)) return false;
                    worldIn.setBlockState(pos, Blocks.skull.getDefaultState().withProperty(BlockSkullMSB.FACING, side), 3);
                    int i = 0;

                    if (side == EnumFacing.UP) {
                        i = MathHelper.floor_double((double) (playerIn.rotationYaw * 16.0F / 360.0F) + 0.5D) & 15;
                    }

                    TileEntity tileentity = worldIn.getTileEntity(pos);

                    if (tileentity instanceof TileEntitySkullMSB) {
                        TileEntitySkullMSB tileentityskull = (TileEntitySkullMSB) tileentity;
                        tileentityskull.setType(stack.getMetadata());
                    }

                    --stack.stackSize;
                }

                return true;
            }
        }
    }

    @SideOnly(Side.CLIENT)
    public void getSubItems(Item item, CreativeTabs tab, List list)
    {
        for (int i = 0; i < BlockNames.ItemNames.skullNames.length; i++) {
            list.add(new ItemStack(item, 1, i));
        }
    }

    @Override
    public int getMetadata(int damage) {
        return damage;
    }

    public String getUnlocalizedName() {
        return NameHelper.formatItemName(1, NameHelper.getUnlocalizedName(super.getUnlocalizedName()));
    }

    public String getUnlocalizedName(ItemStack stack) {
        return NameHelper.formatMetadataItem(stack, 1, NameHelper.getUnlocalizedName(super.getUnlocalizedName()), BlockNames.ItemNames.skullNames);
    }
}
