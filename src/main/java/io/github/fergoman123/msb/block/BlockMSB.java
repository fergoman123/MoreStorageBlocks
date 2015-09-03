package io.github.fergoman123.msb.block;

import io.github.fergoman123.msb.MSB;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockMSB extends Block {

    private String name;

    public BlockMSB(String name){
        super(Material.iron);
        this.setCreativeTab(MSB.tabMSB);
        this.setUnlocalizedName(name);
        this.name = name;
    }

    public String getUnlocalizedName(){
        return String.format("tile.msb.%s", this.name);
    }

    public String getName() {
        return name;
    }
}
