package io.github.fergoman123.msb.block;

import io.github.fergoman123.msb.reference.Names;
import net.minecraft.item.Item;

import java.util.Random;

public class BlockSugarcane extends BlockMSB
{
    public BlockSugarcane()
    {
        super();
        this.setBlockName(Names.Blocks.blockSugarcane);
    }

    @Override
    public Item getItemDropped(int metadata, Random random, int fortune) {
        return Item.getItemFromBlock(this);
    }
}
