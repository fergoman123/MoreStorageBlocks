package fergoman123.mods.msb.block;

import fergoman123.mods.msb.reference.Names;
import net.minecraft.item.Item;

import java.util.Random;

public class BlockBone extends BlockMSB
{
    public BlockBone()
    {
        super();
        this.setBlockName(Names.Blocks.blockBone);
    }

    public Item getItemDropped(int metadata, Random rand, int fortune)
    {
        return Item.getItemFromBlock(this);
    }
}
