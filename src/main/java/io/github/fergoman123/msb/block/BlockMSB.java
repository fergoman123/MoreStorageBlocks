package io.github.fergoman123.msb.block;

import io.github.fergoman123.fergoutil.block.IBlockInfo;
import io.github.fergoman123.fergoutil.helper.NameHelper;
import io.github.fergoman123.msb.MSB;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;

import java.util.List;

public class BlockMSB extends Block implements IBlockInfo{

    private String name;

    public BlockMSB(String name){
        super(Material.iron);
        this.setHardness(5.0f);
        this.setResistance(10.0f);
        this.setUnlocalizedName(name);
        this.setCreativeTab(MSB.tabMSB);
        this.name = name;
    }

    public String getUnlocalizedName(){
        return String.format("tile.msb.%s", NameHelper.getUnlocalizedName(super.getUnlocalizedName()));
    }

    public String getName(){
        return this.name;
    }

    @Override
    @SuppressWarnings("unchecked")
    public void addInformation(ItemStack stack, EntityPlayer playerIn, List tooltip, boolean advanced) {
        tooltip.add(NameHelper.translate("msb.tooltip.oredict"));
        tooltip.add(this.getName());
    }
}
