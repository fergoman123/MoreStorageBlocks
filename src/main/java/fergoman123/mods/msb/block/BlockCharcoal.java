package fergoman123.mods.msb.block;

import fergoman123.mods.msb.reference.Names;
import net.minecraft.block.material.Material;

public class BlockCharcoal extends BlockMSB
{
    public BlockCharcoal()
    {
        super(Material.rock);
        this.setBlockName(Names.Blocks.blockCharcoal);
        this.setHardness(2.5f);
        this.setResistance(50f);
    }
}
