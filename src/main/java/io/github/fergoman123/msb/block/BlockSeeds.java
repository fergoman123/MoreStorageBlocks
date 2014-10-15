 /*
  * More Storage Blocks
  * Copyright (c) 2014 fergoman123.
  * All rights reserved. This program and the accompanying materials
  * are made available under the terms of the GNU Lesser Public License v2.1
  * which accompanies this distribution, and is available at
  * http://www.gnu.org/licenses/gpl-3.0.html
  */

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

public class BlockSeeds extends BlockMSBST
{
    public BlockSeeds()
    {
        super();
        this.setBlockName(Names.Blocks.blockSeedsName);
    }

    public Item getItemDropped(int par1, Random random, int par3)
    {
        return Item.getItemFromBlock(this);
    }

    @Override
    public int damageDropped(int metadata) {
        return metadata;
    }

    @Override
    public IIcon getIcon(int side, int metadata) {
        return this.icons[metadata];
    }

    @Override
    public void registerBlockIcons(IIconRegister register) {
        this.icons = new IIcon[3];

        for (int i = 0; i < Names.Blocks.blockSeeds.length; i++)
        {
            this.icons[i] = register.registerIcon(String.format("%s.%s", NameHelper.getUnwrappedUnlocalizedName(this.getUnlocalizedName()), Names.Blocks.blockSeeds[i]));
        }
    }

    @Override
    public void getSubBlocks(Item item, CreativeTabs tabs, List list) {
        for (int i = 0; i < Names.Blocks.blockSeeds.length; i++)
        {
            list.add(new ItemStack(item, 1, i));
        }
    }

    @Override
    public Item getItem(World world, int x, int y, int z) {
        return Item.getItemFromBlock(this);
    }
}
