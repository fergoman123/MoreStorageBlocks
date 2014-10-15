 /*
  * More Storage Blocks
  * Copyright (c) 2014 fergoman123.
  * All rights reserved. This program and the accompanying materials
  * are made available under the terms of the GNU Lesser Public License v2.1
  * which accompanies this distribution, and is available at
  * http://www.gnu.org/licenses/gpl-3.0.html
  */

package io.github.fergoman123.msb.itemblock;

 import io.github.fergoman123.fergoutil.helper.NameHelper;
 import io.github.fergoman123.msb.init.ModBlocks;
 import io.github.fergoman123.msb.reference.Names;
 import io.github.fergoman123.msb.util.ItemMultiTextureMSB;
 import net.minecraft.block.Block;
 import net.minecraft.entity.player.EntityPlayer;
 import net.minecraft.item.ItemStack;

 import java.util.List;

 public class ItemBlockDye extends ItemMultiTextureMSB
{
    public ItemBlockDye(Block block)
    {
        super(ModBlocks.blockDye, ModBlocks.blockDye, Names.Blocks.blockDye);
        this.setHasSubtypes(true);
    }

    @Override
    public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
        list.add(NameHelper.translateToLocal(Names.OreDict.oreDictName));
        list.add(NameHelper.translateToLocal(Names.OreDict.blockDye));
    }
}
