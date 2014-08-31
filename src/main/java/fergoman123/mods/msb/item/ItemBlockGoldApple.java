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
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemMultiTexture;
import net.minecraft.item.ItemStack;

public class ItemBlockGoldApple extends ItemBlockMSB
{

    public ItemBlockGoldApple(Block block)
    {
        super(ModBlocks.blockGoldApple, ModBlocks.blockGoldApple, Names.Blocks.blockGoldApple);
    }

    public EnumRarity getRarity(ItemStack stack)
    {
        if (stack.getItemDamage() == 0)
            return EnumRarity.rare;
        if (stack.getItemDamage() == 1)
            return EnumRarity.epic;
        else
            return EnumRarity.common;
    }
}
