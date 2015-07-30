package io.github.fergoman123.msb.block;

import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import java.util.List;

public abstract class BlockMultiMSB extends BlockMSB {

    public String[] subNames;

    public BlockMultiMSB(String[] subNames, String name){
        super(name);
        this.subNames = subNames;
    }

    @SuppressWarnings("unchecked")
    public void getSubBlocks(Item item, CreativeTabs tabs, List list){
        for (int i = 0; i < this.subNames.length; i++) {
            list.add(new ItemStack(item, 1, i));
        }
    }

    public abstract int damageDropped(IBlockState state);
    public abstract IBlockState getStateFromMeta(int meta);
    public abstract int getMetaFromState(IBlockState state);
    public abstract BlockState createBlockState();
}
