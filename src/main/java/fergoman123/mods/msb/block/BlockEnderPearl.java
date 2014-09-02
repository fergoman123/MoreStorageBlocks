package fergoman123.mods.msb.block;

import fergoman123.mods.msb.reference.Names;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

import java.util.Random;

public class BlockEnderPearl extends BlockMSB
{
    public BlockEnderPearl()
    {
        super(Material.web);
        this.setBlockName(Names.Blocks.blockEnderPearl);
        this.setHardness(2.5f);
        this.setResistance(50f);
    }

    @Override
    public Item getItemDropped(int par1, Random random, int par3) {
        return Item.getItemFromBlock(this);
    }
}
