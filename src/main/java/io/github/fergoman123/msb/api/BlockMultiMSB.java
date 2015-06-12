package io.github.fergoman123.msb.api;

import io.github.fergoman123.fergoutil.block.BlockMultiFergo;
import io.github.fergoman123.msb.MSB;
import net.minecraft.block.material.Material;

public abstract class BlockMultiMSB extends BlockMultiFergo
{
    public BlockMultiMSB(String[] subNames, String name) {
        super(Material.iron, 1, MSB.tabMSB, 5f, 10f, subNames, name);
        this.setHarvestLevel("pickaxe", 1);
    }
}
