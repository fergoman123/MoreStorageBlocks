/*
 * More Storage Blocks
 * Copyright (c) 2014 fergoman123.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Lesser Public License v2.1
 * which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/lgpl-3.0.html
 */

package fergoman123.mods.msb.util;

import fergoman123.mods.msb.reference.Names;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

import java.util.List;

public abstract class ItemBlockMSB extends ItemBlock
{
    public static Names.OreDict odn = new Names.OreDict();

    public ItemBlockMSB(Block block) {
        super(block);
    }

    public abstract void addInformation(ItemStack stack, EntityPlayer player, List list, boolean extraInfo);

}
