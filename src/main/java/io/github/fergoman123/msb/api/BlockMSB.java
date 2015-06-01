package io.github.fergoman123.msb.api;

import io.github.fergoman123.fergoutil.block.BlockFergo;
import io.github.fergoman123.fergoutil.info.BlockInfo;
import io.github.fergoman123.msb.MSB;
import net.minecraft.block.Block;

public class BlockMSB extends BlockFergo
{
    public BlockMSB(BlockInfo info) {
        super(1, MSB.tabMSB, 5.0f, 10.0f, info);
        this.setStepSound(Block.soundTypeMetal);
    }
}
