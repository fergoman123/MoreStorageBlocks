package fergoman123.mods.msb.item;

import fergoman123.mods.msb.init.ModBlocks;
import fergoman123.mods.msb.reference.Names;
import net.minecraft.block.Block;
import net.minecraft.item.ItemMultiTexture;

public class ItemBlockDye extends ItemBlockMSB
{
    public ItemBlockDye(Block block)
    {
        super(ModBlocks.blockDye, ModBlocks.blockDye, Names.Blocks.blockDye);
    }
}
