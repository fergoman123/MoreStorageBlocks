package io.github.fergoman123.msb.block;

import io.github.fergoman123.msb.reference.Names;
import net.minecraft.item.Item;

import java.util.Random;

public class BlockEnderEye extends BlockMSB
{
    public BlockEnderEye() {
        super();
        this.setBlockName(Names.Blocks.blockEnderEye);
    }

    @Override
    public Item getItemDropped(int par1, Random random, int par3) {
        return Item.getItemFromBlock(this);
    }
}
