package fergoman123.mods.msb.block;

import fergoman123.mods.msb.reference.Names;
import net.minecraft.item.Item;

import java.util.Random;

public class BlockSeeds extends BlockMSB
{
    public BlockSeeds()
    {
        super();
        this.setBlockName(Names.Blocks.blockSeeds);
    }

    public Item getItemDropped(int par1, Random random, int par3)
    {
        return Item.getItemFromBlock(this);
    }
}
