 /*
  * More Storage Blocks
  * Copyright (c) 2014 fergoman123.
  * All rights reserved. This program and the accompanying materials
  * are made available under the terms of the GNU Lesser Public License v2.1
  * which accompanies this distribution, and is available at
  * http://www.gnu.org/licenses/gpl-3.0.html
  */

package fergoman123.mods.msb.block;

import fergoman123.mods.fergoutil.helper.NameHelper;
import fergoman123.mods.msb.init.Tabs;
import fergoman123.mods.msb.reference.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

import java.util.List;
import java.util.Random;

public abstract class BlockMSBST extends Block
{

    public IIcon[] icons;
    public Item item;

    public BlockMSBST(Material material)
    {
        super(material);
        this.setCreativeTab(Tabs.tabMSB);
        this.setHardness(2.5f);
        this.setResistance(50f);
    }

    public BlockMSBST()
    {
        this(Material.iron);
    }

    public String getUnlocalizedName()
    {
        return String.format("tile.%s%s", Reference.textureLoc, NameHelper.getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    public abstract Item getItemDropped(int metadata, Random random, int fortune);

    public abstract int damageDropped(int metadata);

    public abstract IIcon getIcon(int side, int metadata);

    public abstract void registerBlockIcons(IIconRegister register);

    public abstract void getSubBlocks(Item item, CreativeTabs tabs, List list);

    public abstract Item getItem(World world, int x, int y, int z);
}
