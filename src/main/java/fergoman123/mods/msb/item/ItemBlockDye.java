 /*
  * More Storage Blocks
  * Copyright (c) 2014 fergoman123.
  * All rights reserved. This program and the accompanying materials
  * are made available under the terms of the GNU Lesser Public License v2.1
  * which accompanies this distribution, and is available at
  * http://www.gnu.org/licenses/gpl-3.0.html
  */

package fergoman123.mods.msb.item;

import fergoman123.mods.msb.init.ModBlocks;
import fergoman123.mods.msb.reference.Names;
import net.minecraft.block.Block;
import net.minecraft.item.ItemMultiTexture;

public class ItemBlockDye extends ItemBlockMSB
{
    public ItemBlockDye(Block block)
    {
        super(ModBlocks.blockDye, ModBlocks.blockDye, Names.Blocks.blockDye);
    }
}
