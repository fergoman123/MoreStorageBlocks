package fergoman123.mods.msb.block;

import fergoman123.mods.msb.reference.Names;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

import java.util.Random;

public class BlockNetherWartStorage extends BlockMSB
{
    public BlockNetherWartStorage() {
        super(Material.iron);
        this.setBlockName(Names.Blocks.blockNetherWart);
    }

    public Item getItemDropped(int par1, Random random, int par3)
    {
        return Item.getItemFromBlock(this);
    }
}
