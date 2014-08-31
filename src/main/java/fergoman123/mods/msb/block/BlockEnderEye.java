package fergoman123.mods.msb.block;

import fergoman123.mods.msb.reference.Names;
import fergoman123.mods.msb.util.IBlockMSB;
import net.minecraft.item.Item;

import java.util.Random;

public class BlockEnderEye extends BlockMSB implements IBlockMSB
{
    public BlockEnderEye() {
        super();
        this.setBlockName(Names.Blocks.blockEnderEye);
    }

    @Override
    public Item getItemDropped(int par1, Random random, int par3) {
        return Item.getItemFromBlock(this);
    }
}
