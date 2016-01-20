package io.github.fergoman123.msb.item;

import io.github.fergoman123.msb.block.BlockGoldApple;
import io.github.fergoman123.msb.block.BlockMultiMSB;
import io.github.fergoman123.msb.init.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemBlockMultiMSB extends ItemBlock {
    public ItemBlockMultiMSB(Block block) {
        super(block);
        this.setMaxDamage(0);
        this.setHasSubtypes(true);
    }

    @Override
    public int getMetadata(int damage) {
        return damage;
    }

    @Override
    public EnumRarity getRarity(ItemStack stack) {
        if (stack == BlockGoldApple.EnumType.blockGoldApple1.getItemStack(1)){
            return EnumRarity.RARE;
        } else if(stack == BlockGoldApple.EnumType.blockGoldApple2.getItemStack(1)) {
            return EnumRarity.EPIC;
        } else {
            return EnumRarity.COMMON;
        }
    }

    @Override
    public String getUnlocalizedName(ItemStack stack) {
        BlockMultiMSB multi = (BlockMultiMSB) this.block;
        return super.getUnlocalizedName() + "." + multi.getNames()[stack.getMetadata()];
    }
}
