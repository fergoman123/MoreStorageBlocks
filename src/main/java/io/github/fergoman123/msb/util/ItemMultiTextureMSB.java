/*
 * More Storage Blocks
 * Copyright (c) 2014 fergoman123.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Lesser Public License v2.1
 * which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/lgpl-3.0.html
 */

package io.github.fergoman123.msb.util;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemMultiTexture;
import net.minecraft.item.ItemStack;

import java.util.List;

/**
 * Created By Fergoman123 on 26/09/2014 07:46
 */
public abstract class ItemMultiTextureMSB extends ItemMultiTexture
{

    public ItemMultiTextureMSB(Block block1, Block block2, String[] textureNames) {
        super(block1, block2, textureNames);
    }

    public abstract void addInformation(ItemStack stack, EntityPlayer player, List list, boolean extraInfo);

}
