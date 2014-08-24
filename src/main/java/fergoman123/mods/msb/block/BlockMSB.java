package fergoman123.mods.msb.block;

import fergoman123.mods.fergoutil.helper.NameHelper;
import fergoman123.mods.msb.init.MSBMod;
import fergoman123.mods.msb.reference.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;

public abstract class BlockMSB extends Block
{
    public BlockMSB(Material material)
    {
        super(material);
        this.setCreativeTab(MSBMod.tabMSB);
    }

    public BlockMSB()
    {
        this(Material.iron);
        this.setCreativeTab(MSBMod.tabMSB);
    }

    public String getUnlocalizedName()
    {
        return NameHelper.format("tile.%s%s", Reference.textureLoc, NameHelper.getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    public void registerBlockIcons(IIconRegister register)
    {
        blockIcon = register.registerIcon(NameHelper.format("%s", NameHelper.getUnwrappedUnlocalizedName(super.getUnlocalizedName())));
    }
}
