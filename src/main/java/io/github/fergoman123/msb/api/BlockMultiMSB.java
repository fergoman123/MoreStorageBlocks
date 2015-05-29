package io.github.fergoman123.msb.api;

import io.github.fergoman123.fergoutil.block.BlockMultiFergo;
import io.github.fergoman123.fergoutil.info.MultiBlockInfo;
import io.github.fergoman123.msb.MSB;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import java.util.List;

public abstract class BlockMultiMSB extends BlockMultiFergo
{
    public BlockMultiMSB(MultiBlockInfo info) {
        super(1, MSB.tabMSB, 5f, 10f, info);
        this.setHarvestLevel("pickaxe", 1);
    }
}
