package io.github.fergoman123.msb.api;

import io.github.fergoman123.fergoutil.block.BlockFergo;
import io.github.fergoman123.fergoutil.helper.NameHelper;
import io.github.fergoman123.msb.MSB;
import io.github.fergoman123.msb.info.ModInfo;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockMSB extends BlockFergo
{
    public BlockMSB(String name) {
        super(Material.iron, 1, MSB.tabMSB, 5.0f, 10.0f, name);
        this.setStepSound(Block.soundTypeMetal);
    }
}
