package fergoman123.mods.msb.block;

import fergoman123.mods.fergoutil.helper.NameHelper;
import fergoman123.mods.msb.init.MSBMod;
import fergoman123.mods.msb.init.Tabs;
import fergoman123.mods.msb.reference.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;

import java.util.Random;

public abstract class BlockMSB extends Block
{
    public BlockMSB(Material material)
    {
        super(material);
        this.setCreativeTab(Tabs.tabMSB);
        this.setHardness(2.5f);
        this.setResistance(50f);
    }

    public BlockMSB()
    {
        this(Material.iron);
    }

    public String getUnlocalizedName()
    {
        return String.format("tile.%s%s", Reference.textureLoc, NameHelper.getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    public void registerBlockIcons(IIconRegister register)
    {
        blockIcon = register.registerIcon(String.format("%s", NameHelper.getUnwrappedUnlocalizedName(this.getUnlocalizedName())));
    }
}