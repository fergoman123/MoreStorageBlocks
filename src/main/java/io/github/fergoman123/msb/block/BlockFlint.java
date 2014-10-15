package io.github.fergoman123.msb.block;

import io.github.fergoman123.msb.reference.Names;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

import java.util.Random;

public class BlockFlint extends BlockMSB
{
    public BlockFlint()
    {
        super(Material.sand);
        this.setBlockName(Names.Blocks.blockFlint);
        this.setStepSound(soundTypeSand);
    }

    public Item getItemDropped(int metadata, Random rand, int fortune)
    {
        return Item.getItemFromBlock(this);
    }
}
