package io.github.fergoman123.msb.api;

import io.github.fergoman123.msb.MSB;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockMultiMSB extends Block
{
	private String[] subNames;
	
    public BlockMultiMSB(String[] subNames, String name) {
        super(Material.iron);
        this.setCreativeTab(MSB.tabMSB);
        this.setHardness(5f);
        this.setResistance(10f);
        this.setUnlocalizedName("msb." + name);
        this.setHarvestLevel("pickaxe", 1);
        this.subNames = subNames;
    }
    
    public String[] getSubNames(){
    	return subNames;
    }
}
