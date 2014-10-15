 /*
  * More Storage Blocks
  * Copyright (c) 2014 fergoman123.
  * All rights reserved. This program and the accompanying materials
  * are made available under the terms of the GNU Lesser Public License v2.1
  * which accompanies this distribution, and is available at
  * http://www.gnu.org/licenses/gpl-3.0.html
  */

package io.github.fergoman123.msb.block;

 import io.github.fergoman123.msb.reference.Names;
 import net.minecraft.block.material.Material;
 import net.minecraft.item.Item;

 import java.util.Random;

public class BlockGunpowder extends BlockMSB{
    public BlockGunpowder(){
        super(Material.iron);
        this.setBlockName(Names.Blocks.blockGunpowder);
    }

    public Item getItemDropped(int par1, Random rand, int par3)
    {
        return Item.getItemFromBlock(this);
    }
}
