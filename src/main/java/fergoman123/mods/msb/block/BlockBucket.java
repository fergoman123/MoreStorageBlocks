package fergoman123.mods.msb.block;

import fergoman123.mods.msb.reference.Names;
import net.minecraft.item.Item;

import java.util.Random;

public class BlockBucket extends BlockMSB
{
    public BlockBucket() {
        super();
        this.setBlockName(Names.Blocks.blockBucket);
    }

    @Override
    public Item getItemDropped(int par1, Random random, int par3) {
        return Item.getItemFromBlock(this);
    }
}
