package io.github.fergoman123.msb.api;

import io.github.fergoman123.msb.MSB;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockMSB extends Block
{
    public BlockMSB(String name) {
        super(Material.iron);
        this.setHardness(5.0f);
        this.setResistance(10.0f);
        this.setCreativeTab(MSB.tabMSB);
        this.setUnlocalizedName("msb." + name);
        this.setStepSound(Block.soundTypeMetal);
    }
}
