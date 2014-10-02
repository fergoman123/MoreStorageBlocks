package fergoman123.mods.msb.itemblock;

import fergoman123.mods.fergoutil.helper.NameHelper;
import fergoman123.mods.msb.block.BlockSkullStorage;
import fergoman123.mods.msb.init.ModBlocks;
import fergoman123.mods.msb.reference.Names;
import fergoman123.mods.msb.util.ItemMultiTextureMSB;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;

import java.util.List;

public class ItemBlockSkull extends ItemMultiTextureMSB
{
    public ItemBlockSkull(Block block) {
        super(ModBlocks.blockSkull, ModBlocks.blockSkull, BlockSkullStorage.subtypes);
        this.setHasSubtypes(true);
    }

    @Override
    public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean extraInfo) {
        list.add(NameHelper.translateToLocal(Names.odn.oreDictName));
        list.add(NameHelper.translateToLocal(Names.odn.blockSkull));
    }
}
