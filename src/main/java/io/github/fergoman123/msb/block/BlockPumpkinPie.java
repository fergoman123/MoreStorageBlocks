package io.github.fergoman123.msb.block;

import io.github.fergoman123.msb.reference.Names;
import net.minecraft.item.Item;

import java.util.Random;

public class BlockPumpkinPie extends BlockMSB
{
    public BlockPumpkinPie()
    {
        super();
        this.setBlockName(Names.Blocks.blockPumpkinPie);
        this.item = Item.getItemFromBlock(this);
    }

    @Override
    public Item getItemDropped(int metadata, Random random, int fortune) {
        return this.item;
    }
}
