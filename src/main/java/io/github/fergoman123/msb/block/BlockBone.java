package io.github.fergoman123.msb.block;

import io.github.fergoman123.msb.reference.Names;
import net.minecraft.item.Item;

import java.util.Random;

public class BlockBone extends BlockMSB
{
    public BlockBone()
    {
        super();
        this.setBlockName(Names.Blocks.blockBone);
    }

    public Item getItemDropped(int metadata, Random rand, int fortune)
    {
        return Item.getItemFromBlock(this);
    }
}
