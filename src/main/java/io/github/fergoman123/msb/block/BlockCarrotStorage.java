package io.github.fergoman123.msb.block;

import io.github.fergoman123.fergoutil.helper.BlockHelper;
import io.github.fergoman123.msb.reference.Names;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

import java.util.Random;

public class BlockCarrotStorage extends BlockMSB{
    public BlockCarrotStorage() {
        super(Material.iron);
        this.setBlockName(Names.Blocks.blockCarrot);
    }

    @Override
    public Item getItemDropped(int par1, Random random, int par3) {
        return BlockHelper.getItemFromBlock(this);
    }
}
