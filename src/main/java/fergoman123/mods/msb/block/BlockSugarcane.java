package fergoman123.mods.msb.block;

import fergoman123.mods.msb.reference.Names;
import net.minecraft.item.Item;

import java.util.Random;

public class BlockSugarcane extends BlockMSB
{
    public BlockSugarcane()
    {
        super();
        this.setBlockName(Names.Blocks.blockSugarcane);
    }

    @Override
    public Item getItemDropped(int metadata, Random random, int fortune) {
        return Item.getItemFromBlock(this);
    }
}
