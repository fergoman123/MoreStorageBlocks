package io.github.fergoman123.msb.block;

import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

import java.util.Random;

public class BlockArrow extends BlockMSB
{
    public BlockArrow(String name) {
        super(name);
    }

    public Item getItemDropped(IBlockState state, Random rand, int fortune){
        return Items.arrow;
    }

    public int quantityDropped(Random rand){
        return 9;
    }
}
