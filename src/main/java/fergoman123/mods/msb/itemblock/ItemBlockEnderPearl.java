package fergoman123.mods.msb.itemblock;

import fergoman123.mods.fergoutil.helper.NameHelper;
import fergoman123.mods.msb.init.ModBlocks;
import fergoman123.mods.msb.util.ItemBlockMSB;
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
