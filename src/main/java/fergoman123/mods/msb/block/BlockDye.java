package fergoman123.mods.msb.block;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import fergoman123.mods.fergoutil.helper.NameHelper;
import fergoman123.mods.msb.reference.Names;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

import java.util.List;
import java.util.Random;

public class BlockDye extends BlockMSB
{
    @SideOnly(Side.CLIENT)
    private IIcon[] icons;

    public BlockDye()
    {
        super(Material.carpet);
        this.setBlockName(Names.Blocks.blockDyeName);
        this.setHardness(2.5f);
        this.setResistance(50f);
    }

    public Item getItemDropped(int par1, Random rand, int par3)
    {
        return Item.getItemFromBlock(this);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void getSubBlocks(Item item, CreativeTabs tabs, List list)
    {
        for (int meta = 0; meta < Names.Blocks.blockDye.length; meta++)
        {
            list.add(new ItemStack(item, 1, meta));
        }
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister register)
    {
        this.icons = new IIcon[16];

        for (int i = 0; i < Names.Blocks.blockDye.length; i++)
        {
            this.icons[i] = register.registerIcon(NameHelper.format("%s.%s", NameHelper.getUnwrappedUnlocalizedName(this.getUnlocalizedName()), Names.Blocks.blockDye[i]));
        }
    }

    @Override
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int side, int metadata)
    {
        return this.icons[metadata];
    }

    public Item getItem(World world, int x, int y, int z)
    {
        return Item.getItemFromBlock(this);
    }
}
