package io.github.fergoman123.msb.block;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import io.github.fergoman123.fergoutil.helper.NameHelper;
import io.github.fergoman123.msb.reference.Names;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

import java.util.List;
import java.util.Random;

public class BlockDye extends BlockMSBST {
    @SideOnly(Side.CLIENT)
    private IIcon[] icons;

    public BlockDye() {
        super(Material.carpet);
        this.setBlockName(Names.Blocks.blockDyeName);
        this.setHardness(2.5f);
        this.setResistance(50f);
    }

    public Item getItemDropped(int metadata, Random random, int fortune) {
        return Item.getItemFromBlock(this);
    }

    public Item getItem(World world, int x, int y, int z) {
        return Item.getItemFromBlock(this);
    }

    public int damageDropped(int metadata) {
        return metadata;
    }

    @Override
    @SuppressWarnings("unchecked")
    @SideOnly(Side.CLIENT)
    public void getSubBlocks(Item item, CreativeTabs tabs, List list) {
        for (int meta = 0; meta < Names.Blocks.blockDye.length; meta++) {
            list.add(new ItemStack(item, 1, meta));
        }
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister register) {
        this.icons = new IIcon[16];

        for (int i = 0; i < Names.Blocks.blockDye.length; i++) {
            this.icons[i] = register.registerIcon(NameHelper.format("%s.%s", NameHelper.getUnwrappedUnlocalizedName(this.getUnlocalizedName()), Names.Blocks.blockDye[i]));
        }
    }

    @Override
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int side, int metadata) {
        return this.icons[metadata];
    }
}
