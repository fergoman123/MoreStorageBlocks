package io.github.fergoman123.msb.itemblock;

import io.github.fergoman123.msb.init.ModBlocks;
import io.github.fergoman123.msb.util.ItemBlockMSB;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;

import java.util.List;

import static io.github.fergoman123.fergoutil.helper.NameHelper.translateToLocal;

/**
 * Created By Fergoman123 on 26/09/2014 09:03
 */
public class ItemBlockStick extends ItemBlockMSB {

    public ItemBlockStick(Block block) {
        super(ModBlocks.blockStick);
    }

    @Override
    public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean extraInfo) {
        list.add(translateToLocal(odn.oreDictName));
        list.add(translateToLocal(odn.blockStick));
    }
}
