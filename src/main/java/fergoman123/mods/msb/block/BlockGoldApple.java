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
 import fergoman123.mods.msb.reference.Names;
 import net.minecraft.client.renderer.texture.IIconRegister;
 import net.minecraft.creativetab.CreativeTabs;
 import net.minecraft.item.Item;
 import net.minecraft.item.ItemStack;
 import net.minecraft.util.IIcon;
 import net.minecraft.world.World;

 import java.util.List;
 import java.util.Random;

 public class BlockGoldApple extends BlockMSBST
{

    public BlockGoldApple()
    {
        super();
        this.setBlockName(Names.Blocks.blockGoldAppleName);
    }

    @Override
    public Item getItemDropped(int metadata, Random random, int fortune) {
        return Item.getItemFromBlock(this);
    }

    @Override
    public int damageDropped(int metadata) {
        return metadata;
    }

    @Override
    public Item getItem(World world, int x, int y, int z) {
        return Item.getItemFromBlock(this);
    }

    @Override
    public IIcon getIcon(int side, int metadata) {
        return this.icons[metadata];
    }

    @Override
    public void registerBlockIcons(IIconRegister register) {
        this.icons = new IIcon[2];

        for (int i = 0; i < Names.Blocks.blockGoldApple.length; i++)
        {
            this.icons[i] = register.registerIcon(String.format("%s.%s", NameHelper.getUnwrappedUnlocalizedName(this.getUnlocalizedName()), Names.Blocks.blockGoldApple[i]));
        }
    }

    @SuppressWarnings("unchecked")
    @Override
    public void getSubBlocks(Item item, CreativeTabs tabs, List list) {
        for (int i = 0; i < Names.Blocks.blockGoldApple.length; i++)
        {
            list.add(new ItemStack(item, 1, i));
        }
    }
}
