package fergoman123.mods.msb.itemblock;

import fergoman123.mods.fergoutil.helper.NameHelper;
import fergoman123.mods.msb.init.ModBlocks;
import fergoman123.mods.msb.reference.Names;
import fergoman123.mods.msb.util.ItemBlockMSB;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;

import java.util.List;

public class ItemBlockGhastTear extends ItemBlockMSB
{
    public ItemBlockGhastTear(Block block) {
        super(ModBlocks.blockGhastTear);
    }

    @Override
    public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean extraInfo) {
        list.add(NameHelper.translateToLocal(Names.odn.oreDictName));
        list.add(NameHelper.translateToLocal(Names.odn.blockGhastTear));
    }
}
