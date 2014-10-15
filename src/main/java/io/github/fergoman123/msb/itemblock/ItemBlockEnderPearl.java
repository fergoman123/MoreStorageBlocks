package io.github.fergoman123.msb.itemblock;

import io.github.fergoman123.fergoutil.helper.NameHelper;
import io.github.fergoman123.msb.init.ModBlocks;
import io.github.fergoman123.msb.util.ItemBlockMSB;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;

import java.util.List;

/**
 * Created By Fergoman123 on 26/09/2014 08:46
 */
public class ItemBlockEnderPearl extends ItemBlockMSB
{
    public ItemBlockEnderPearl(Block block) {
        super(ModBlocks.blockEnderPearl);
    }

    @Override
    public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean extraInfo) {
        list.add(NameHelper.translateToLocal(odn.oreDictName));
        list.add(NameHelper.translateToLocal(odn.blockEnderPearl));
    }
}
