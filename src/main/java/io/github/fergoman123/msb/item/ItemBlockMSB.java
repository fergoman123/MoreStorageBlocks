package io.github.fergoman123.msb.item;

import io.github.fergoman123.fergoutil.helper.NameHelper;
import io.github.fergoman123.msb.block.BlockMultiMSB;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

import java.util.List;

public class ItemBlockMSB extends ItemBlock{
    public ItemBlockMSB(Block block){
        super(block);
        this.setMaxDamage(0);
        this.setHasSubtypes(true);
    }

    public int getMetadata(int damage) {
        return damage;
    }

    public String getUnlocalizedName(ItemStack stack) {
        BlockMultiMSB blockMultiMSB = (BlockMultiMSB)this.block;
        return super.getUnlocalizedName() + "." + blockMultiMSB.subNames[stack.getItemDamage()];
    }

    @Override
    public void addInformation(ItemStack stack, EntityPlayer playerIn, List tooltip, boolean advanced) {
        BlockMultiMSB blockMultiMSB = (BlockMultiMSB)this.block;
        tooltip.add(NameHelper.translate("msb.tooltip.odn"));
        tooltip.add(blockMultiMSB.subNames[stack.getItemDamage()]);
    }
}
