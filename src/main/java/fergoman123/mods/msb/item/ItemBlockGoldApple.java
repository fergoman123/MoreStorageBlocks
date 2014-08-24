package fergoman123.mods.msb.item;

import fergoman123.mods.msb.init.ModBlocks;
import fergoman123.mods.msb.reference.Names;
import net.minecraft.block.Block;
import net.minecraft.item.ItemMultiTexture;

public class ItemBlockGoldApple extends ItemMultiTexture
{

    public ItemBlockGoldApple(Block block)
    {
        super(ModBlocks.blockGoldApple, ModBlocks.blockGoldApple, Names.Blocks.blockGoldApple);
    }
}
