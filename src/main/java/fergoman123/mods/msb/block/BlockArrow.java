package fergoman123.mods.msb.block;

import fergoman123.mods.fergoutil.helper.BlockHelper;
import fergoman123.mods.msb.reference.Names;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

import java.util.Random;

public class BlockArrow extends BlockMSB {

    public BlockArrow()
    {
        super(Material.iron);
        this.setBlockName(Names.Blocks.blockArrow);
    }

    @Override
    public Item getItemDropped(int par1, Random random, int par3) {
        return BlockHelper.getItemFromBlock(this);
    }
}
