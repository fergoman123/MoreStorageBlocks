package io.github.fergoman123.msb.block;

import io.github.fergoman123.fergoutil.helper.NameHelper;
import io.github.fergoman123.msb.MSB;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import java.util.List;

public abstract class BlockMultiMSB extends Block {

    private String[] names;

    public BlockMultiMSB(String[] names, String name) {
        super(Material.iron);
        this.names = names;
        this.setUnlocalizedName(name);
        setCreativeTab(MSB.tabMSB);
    }

    public abstract int damageDropped(IBlockState state);

    public abstract IBlockState getStateFromMeta(int meta);

    public abstract int getMetaFromState(IBlockState state);

    public abstract BlockState createBlockState();

    public String[] getNames() {
        return names;
    }

    @SuppressWarnings({"unchecked", "rawtypes"})
    public void getSubBlocks(Item item, CreativeTabs tab, List list) {
        for (int i = 0; i < getNames().length; i++) {
            list.add(new ItemStack(item, 1, i));
        }
    }

    public String getUnlocalizedName(){
        return String.format("tile.msb.%s", NameHelper.getName(super.getUnlocalizedName(), "."));
    }
}
