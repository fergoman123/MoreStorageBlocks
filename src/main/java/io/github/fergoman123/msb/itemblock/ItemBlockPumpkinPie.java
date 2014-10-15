package io.github.fergoman123.msb.itemblock;

import io.github.fergoman123.fergoutil.helper.NameHelper;
import io.github.fergoman123.msb.init.ModBlocks;
import io.github.fergoman123.msb.reference.Names;
import io.github.fergoman123.msb.util.ItemBlockMSB;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;

import java.util.List;

public class ItemBlockPumpkinPie extends ItemBlockMSB
{
    public ItemBlockPumpkinPie(Block block) {
        super(ModBlocks.blockPumpkinPie);
    }

    @Override
    public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean extraInfo) {
        list.add(NameHelper.translateToLocal(Names.od.oreDictName));
        list.add(NameHelper.translateToLocal(Names.od.blockPumpkinPie));
    }
}
