 /*
  * More Storage Blocks
  * Copyright (c) 2014 fergoman123.
  * All rights reserved. This program and the accompanying materials
  * are made available under the terms of the GNU Lesser Public License v2.1
  * which accompanies this distribution, and is available at
  * http://www.gnu.org/licenses/gpl-3.0.html
  */

package fergoman123.mods.msb.block;

 import fergoman123.mods.msb.reference.Names;
 import net.minecraft.block.material.Material;
 import net.minecraft.item.Item;

 import java.util.Random;

public class BlockApple extends BlockMSB
{
    public BlockApple()
    {
        super(Material.ground);
        this.setBlockName(Names.Blocks.blockApple);
        this.setHardness(2.5f);
        this.setResistance(50f);
    }

    public Item getItemDropped(int par1, Random random, int par3)
    {
        return Item.getItemFromBlock(this);
    }
}
