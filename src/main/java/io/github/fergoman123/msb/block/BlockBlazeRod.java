package io.github.fergoman123.msb.block;

import io.github.fergoman123.msb.reference.Names;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

import java.util.Random;

public class BlockBlazeRod extends BlockMSB{
    public BlockBlazeRod() {
        super(Material.iron);
        this.setBlockName(Names.Blocks.blockBlazeRod);
    }

    public Item getItemDropped(int par1, Random rand, int par3)
    {
        return Item.getItemFromBlock(this);
    }
}
