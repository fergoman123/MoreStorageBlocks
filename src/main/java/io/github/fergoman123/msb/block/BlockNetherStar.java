package io.github.fergoman123.msb.block;

import io.github.fergoman123.msb.reference.Names;
import net.minecraft.item.Item;

import java.util.Random;

public class BlockNetherStar extends BlockMSB
{
    public BlockNetherStar()
    {
        super();
        this.setBlockName(Names.Blocks.blockNetherStar);
    }

    @Override
    public Item getItemDropped(int metadata, Random random, int fortune) {
        return Item.getItemFromBlock(this);
    }
}
