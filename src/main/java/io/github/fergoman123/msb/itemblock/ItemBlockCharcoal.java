/*
 * More Storage Blocks
 * Copyright (c) 2014 fergoman123.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Lesser Public License v2.1
 * which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/lgpl-3.0.html
 */

package io.github.fergoman123.msb.itemblock;

import io.github.fergoman123.fergoutil.helper.NameHelper;
import io.github.fergoman123.msb.init.ModBlocks;
import io.github.fergoman123.msb.util.ItemBlockMSB;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;

import java.util.List;

/**
 * Created By Fergoman123 on 26/09/2014 08:25
 */
public class ItemBlockCharcoal extends ItemBlockMSB {


    public ItemBlockCharcoal(Block block) {
        super(ModBlocks.blockCharcoal);
    }

    @Override
    public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean extraInfo) {
        list.add(NameHelper.getInstance().translateToLocal(odn.oreDictName));
        list.add(NameHelper.getInstance().translateToLocal(odn.blockCharcoal));
    }
}
