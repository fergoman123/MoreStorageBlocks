package io.github.fergoman123.msb.api;

import io.github.fergoman123.fergoutil.model.ModelHelper;
import io.github.fergoman123.msb.info.ModInfo;
import net.minecraft.block.Block;

public class BlockVariantMSB extends ModelHelper.BlockVariant
{
    public BlockVariantMSB(Block block, String name) {
        super(block, ModInfo.modid + ":" + name);
    }
}
