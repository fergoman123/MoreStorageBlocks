package fergoman123.mods.msb.item;

import fergoman123.mods.msb.init.ModBlocks;
import fergoman123.mods.msb.reference.Names;
import net.minecraft.block.Block;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemMultiTexture;
import net.minecraft.item.ItemStack;

public class ItemBlockGoldApple extends ItemMultiTexture
{

    public ItemBlockGoldApple(Block block)
    {
        super(ModBlocks.blockGoldApple, ModBlocks.blockGoldApple, Names.Blocks.blockGoldApple);
    }

    public EnumRarity getRarity(ItemStack stack)
    {
        if (stack.getItemDamage() == 0)
            return EnumRarity.rare;
        if (stack.getItemDamage() == 1)
            return EnumRarity.epic;
        else
            return EnumRarity.common;
    }
}
