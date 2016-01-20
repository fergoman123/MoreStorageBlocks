package io.github.fergoman123.msb.block;

import io.github.fergoman123.fergoutil.helper.NameHelper;
import io.github.fergoman123.msb.MSB;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockMSB extends Block {

    public BlockMSB(String name) {
        super(Material.iron);
        this.setUnlocalizedName(name);
        setCreativeTab(MSB.tabMSB);
    }

    public String getUnlocalizedName(){
        return String.format("tile.msb.%s", NameHelper.getName(super.getUnlocalizedName(), "."));
    }
}