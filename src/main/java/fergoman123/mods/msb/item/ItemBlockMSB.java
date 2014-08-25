 /*
  * More Storage Blocks
  * Copyright (c) 2014 fergoman123.
  * All rights reserved. This program and the accompanying materials
  * are made available under the terms of the GNU Lesser Public License v2.1
  * which accompanies this distribution, and is available at
  * http://www.gnu.org/licenses/gpl-3.0.html
  */

package fergoman123.mods.msb.item;

 import net.minecraft.block.Block;
 import net.minecraft.item.ItemMultiTexture;

public class ItemBlockMSB extends ItemMultiTexture
{
    public ItemBlockMSB(Block block1, Block block2, String[] textureNames)
    {
        super(block1, block2, textureNames);
    }
}
