package fergoman123.mods.msb.block;

import fergoman123.mods.fergoutil.helper.BlockHelper;
import fergoman123.mods.msb.reference.Names;
import net.minecraft.item.Item;

import java.util.Random;

public class BlockFireball extends BlockMSB
{
    public BlockFireball()
    {
        super();
        this.setBlockName(Names.Blocks.blockFireball);
    }

    public Item getItemDropped(int par1, Random rand, int par3)
    {
        return BlockHelper.getItemFromBlock(this);
    }
}
