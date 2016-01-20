package io.github.fergoman123.msb.item;

import net.minecraft.block.Block;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;

public class ItemBlockGoldApple extends ItemBlockMultiMSB {
    public ItemBlockGoldApple(Block block) {
        super(block);
    }

    @Override
    public EnumRarity getRarity(ItemStack stack) {
        EnumRarity[] rarities = new EnumRarity[]{EnumRarity.RARE, EnumRarity.EPIC};
        return rarities[stack.getItemDamage()];
    }
}
