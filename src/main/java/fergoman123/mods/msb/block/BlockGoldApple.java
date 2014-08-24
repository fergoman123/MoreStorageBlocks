package fergoman123.mods.msb.block;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import fergoman123.mods.fergoutil.helper.NameHelper;
import fergoman123.mods.msb.reference.Names;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

import java.util.List;
import java.util.Random;

public class BlockGoldApple extends BlockMSB
{
    @SideOnly(Side.CLIENT)
    private IIcon[] icons;

    public BlockGoldApple()
    {
        super();
        this.setBlockName(Names.Blocks.blockGoldAppleName);
        this.setHardness(2.5f);
        this.setResistance(50f);
    }

    @Override
    public Item getItemDropped(int par1, Random par2, int par3)
    {
        return Item.getItemFromBlock(this);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void getSubBlocks(Item item, CreativeTabs tabs, List list)
    {
        for (int meta = 0; meta < Names.Blocks.blockGoldApple.length; meta++)
        {
            list.add(new ItemStack(item, 1, meta));
        }
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister register)
    {
        this.icons = new IIcon[2];

        for (int i = 0; i < Names.Blocks.blockGoldApple.length; i++)
        {
            this.icons[i] = register.registerIcon(NameHelper.format("%s.%s", NameHelper.getUnwrappedUnlocalizedName(this.getUnlocalizedName()), Names.Blocks.blockGoldApple[i]));
        }
    }

    @Override
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int side, int metadata)
    {

        if (metadata == 1)
        {
            return icons[1];
        }
        else
        {
            return icons[0];
        }
    }

    public EnumRarity getRarity(ItemStack stack)
    {
        if (stack.getItemDamage() == 0)
            return EnumRarity.rare;
        if (stack.getItemDamage() == 1)
            return EnumRarity.epic;
        else
            return EnumRarity.common;
    }
}
