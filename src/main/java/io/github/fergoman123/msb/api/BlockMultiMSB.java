package io.github.fergoman123.msb.api;

import io.github.fergoman123.fergoutil.block.BlockMultiFergo;
import io.github.fergoman123.fergoutil.info.MultiBlockInfo;
import io.github.fergoman123.msb.MSB;

public abstract class BlockMultiMSB extends BlockMultiFergo
{
    public BlockMultiMSB(MultiBlockInfo info) {
        super(1, MSB.tabMSB, 5f, 10f, info);
        this.setHarvestLevel("pickaxe", 1);
    }
}
