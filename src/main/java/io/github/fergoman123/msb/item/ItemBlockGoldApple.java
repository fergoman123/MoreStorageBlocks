package io.github.fergoman123.msb.item;

import io.github.fergoman123.msb.init.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;

public class ItemBlockGoldApple extends ItemBlockMSB {
    public ItemBlockGoldApple(Block block){
        super(block);
    }

    @Override
    public int getMetadata(int damage) {
        return damage;
    }

    @Override
    public String getUnlocalizedName(ItemStack stack) {
        return super.getUnlocalizedName() + "." + ModBlocks.blockGoldApple.subNames[stack.getItemDamage()];
    }
}
