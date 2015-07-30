package io.github.fergoman123.msb.item;

import io.github.fergoman123.fergoutil.helper.NameHelper;
import io.github.fergoman123.msb.block.BlockMSB;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

import java.util.List;

public class IBMSB extends ItemBlock{
    public IBMSB(Block block){
        super(block);
    }

    @Override
    @SuppressWarnings("unchecked")
    public void addInformation(ItemStack stack, EntityPlayer playerIn, List tooltip, boolean advanced) {
        tooltip.add(NameHelper.translate("msb.tooltip.odn"));
        BlockMSB blockMSB = (BlockMSB)this.block;
        tooltip.add(blockMSB.getUnlocalizedName().replace("tile.msb.", ""));
    }
}
