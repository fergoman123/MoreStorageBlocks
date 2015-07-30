package io.github.fergoman123.msb.block;

import io.github.fergoman123.fergoutil.helper.NameHelper;
import io.github.fergoman123.msb.MSB;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public abstract class BlockMSB extends Block {

    public BlockMSB(String name){
        super(Material.iron);
        this.setHardnessResist(5.0f, 10.0f);
        this.setUnlocalizedName(name);
        this.setCreativeTab(MSB.tabMSB);
    }

    public Block setHardnessResist(float hardness, float resist){
        this.setHardness(hardness);
        this.setResistance(resist);
        return this;
    }

    public String getUnlocalizedName(){
        return String.format("tile.msb.%s", NameHelper.getUnlocalizedName(super.getUnlocalizedName()));
    }
}
