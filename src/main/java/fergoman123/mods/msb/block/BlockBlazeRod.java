package fergoman123.mods.msb.block;

import fergoman123.mods.msb.reference.Names;
import fergoman123.mods.msb.util.IBlockMSB;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

import java.util.Random;

public class BlockBlazeRod extends BlockMSB implements IBlockMSB{
    public BlockBlazeRod() {
        super(Material.iron);
        this.setBlockName(Names.Blocks.blockBlazeRod);
    }

    public Item getItemDropped(int par1, Random rand, int par3)
    {
        return Item.getItemFromBlock(this);
    }
}
