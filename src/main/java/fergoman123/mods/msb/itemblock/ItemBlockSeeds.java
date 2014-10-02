package fergoman123.mods.msb.itemblock;

import fergoman123.mods.fergoutil.helper.NameHelper;
import fergoman123.mods.msb.init.ModBlocks;
import fergoman123.mods.msb.reference.Names;
import fergoman123.mods.msb.util.ItemBlockMSB;
import fergoman123.mods.msb.util.ItemMultiTextureMSB;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

import java.util.List;

/**
 * Created By Fergoman123 on 26/09/2014 09:03
 */
public class ItemBlockSeeds extends ItemMultiTextureMSB {

    public ItemBlockSeeds(Block block) {
        super(ModBlocks.blockSeeds, ModBlocks.blockSeeds, Names.Blocks.blockSeeds);
        this.setHasSubtypes(true);
    }

    @Override
    public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean extraInfo) {
        list.add(NameHelper.getInstance().translateToLocal(Names.OreDict.oreDictName));
        list.add(NameHelper.getInstance().translateToLocal(Names.OreDict.blockSeeds));
    }
}