package io.github.fergoman123.msb.api;

import io.github.fergoman123.fergoutil.block.BlockFergo;
import io.github.fergoman123.fergoutil.item.ItemBlockFergo;
import io.github.fergoman123.fergoutil.item.ItemBlockFergo.ItemBlockNormalFergo;
import io.github.fergoman123.msb.MSB;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import java.util.Random;

public class BlockMSB extends BlockFergo
{
    public BlockMSB(String name) {
        super(Material.iron, 1, MSB.tabMSB, 5.0f, 10.0f, name);
        this.setStepSound(Block.soundTypeMetal);
    }

    @Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune) {
        return Item.getItemFromBlock(this);
    }
}
