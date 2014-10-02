package fergoman123.mods.msb.block;

import fergoman123.mods.msb.reference.Names;
import net.minecraft.item.Item;

import java.util.Random;

public class BlockNetherStar extends BlockMSB
{
    public BlockNetherStar()
    {
        super();
        this.setBlockName(Names.Blocks.blockNetherStar);
    }

    @Override
    public Item getItemDropped(int metadata, Random random, int fortune) {
        return Item.getItemFromBlock(this);
    }
}
