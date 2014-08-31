package fergoman123.mods.msb.block;

import fergoman123.mods.fergoutil.helper.BlockHelper;
import fergoman123.mods.msb.reference.Names;
import fergoman123.mods.msb.util.IBlockMSB;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

import java.util.Random;

public class BlockCarrotStorage extends BlockMSB implements IBlockMSB{
    public BlockCarrotStorage() {
        super(Material.iron);
        this.setBlockName(Names.Blocks.blockCarrot);
    }

    @Override
    public Item getItemDropped(int par1, Random random, int par3) {
        return BlockHelper.getItemFromBlock(this);
    }
}
