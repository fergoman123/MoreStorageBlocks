package io.github.fergoman123.msb.itemblock;

import io.github.fergoman123.fergoutil.helper.NameHelper;
import io.github.fergoman123.msb.init.ModBlocks;
import io.github.fergoman123.msb.util.ItemBlockMSB;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;

import java.util.List;

/**
 * Created By Fergoman123 on 26/09/2014 09:00
 */
public class ItemBlockNetherWart extends ItemBlockMSB {

    public ItemBlockNetherWart(Block block) {
        super(ModBlocks.blockNetherWart);
    }

    @Override
    public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean extraInfo) {
        list.add(NameHelper.getInstance().translateToLocal(odn.oreDictName));
        list.add(NameHelper.getInstance().translateToLocal(odn.blockNetherWart));
    }
}
