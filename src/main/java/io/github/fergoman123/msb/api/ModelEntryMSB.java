/*
 * More Storage Blocks
 * Copyright (c) 2014 fergoman123.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Lesser Public License v2.1
 * which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/gpl-3.0.html
 */

package io.github.fergoman123.msb.api;

import io.github.fergoman123.fergoutil.model.ModelEntry;
import io.github.fergoman123.msb.info.ModInfo;
import net.minecraft.block.Block;

public class ModelEntryMSB extends ModelEntry
{
    public ModelEntryMSB(Block block, int meta, String name){
        super(block, meta,  ModInfo.modid.toLowerCase() + ":" + name);
    }

    public ModelEntryMSB(Block block, String name)
    {
        super(block, ModInfo.modid.toLowerCase() + ":" + name);
    }
}
