package io.github.fergoman123.msb.block;

import io.github.fergoman123.fergoutil.helper.NameHelper;
import io.github.fergoman123.msb.reference.Names;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

import java.util.List;
import java.util.Random;

public class BlockPorkchop extends BlockMSBST
{
    public BlockPorkchop()
    {
        super();
        this.setBlockName(Names.Blocks.blockPorkchopName);
    }

    @Override
    public Item getItemDropped(int metadata, Random random, int fortune) {
        return Item.getItemFromBlock(this);
    }

    public int damageDropped(int metadata)
    {
        return metadata;
    }

    public Item getItem(World world, int x, int y, int z)
    {
        return Item.getItemFromBlock(this);
    }

    public IIcon getIcon(int side, int metadata)
    {
        return this.icons[metadata];
    }

    public void registerBlockIcons(IIconRegister register)
    {
        this.icons = new IIcon[2];

        for (int i = 0; i < Names.Blocks.blockPorkchop.length; i++)
        {
            this.icons[i] = register.registerIcon(String.format("%s.%s", NameHelper.getUnwrappedUnlocalizedName(this.getUnlocalizedName()), Names.Blocks.blockPorkchop[i]));
        }
    }

    @SuppressWarnings("unchecked")
    public void getSubBlocks(Item item, CreativeTabs tabs, List list)
    {
        for (int i = 0; i < Names.Blocks.blockPorkchop.length; i++) {
            list.add(new ItemStack(item, 1, i));
        }
    }
}
