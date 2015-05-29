package io.github.fergoman123.msb.api;

import io.github.fergoman123.fergoutil.info.BlockInfo;
import net.minecraft.block.material.Material;

public class BlockInfoMSB extends BlockInfo
{
    public BlockInfoMSB(String name)
    {
        super(Material.iron, name, "msb:" + name);
    }
}
