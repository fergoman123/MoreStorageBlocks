package fergoman123.mods.msb.block;

import fergoman123.mods.fergoutil.helper.NameHelper;
import fergoman123.mods.msb.reference.Names;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

import java.util.List;
import java.util.Random;

public class BlockBeef extends BlockMSBST
{

    public BlockBeef()
    {
        super();
        this.setBlockName(Names.Blocks.blockBeefName);
        this.item = Item.getItemFromBlock(this);
    }

    @Override
    public Item getItemDropped(int metadata, Random random, int fortune) {
        return this.item;
    }

    @Override
    public int damageDropped(int metadata) {
        return metadata;
    }

    @Override
    public IIcon getIcon(int side, int metadata) {
        return this.icons[metadata];
    }

    @Override
    public void registerBlockIcons(IIconRegister register) {
        this.icons = new IIcon[Names.Blocks.blockBeef.length];

        for (int i = 0; i < Names.Blocks.blockBeef.length; i++) {
            this.icons[i] = register.registerIcon(String.format("%s.%s", NameHelper.getUnwrappedUnlocalizedName(this.getUnlocalizedName()), Names.Blocks.blockBeef[i]));
        }
    }

    @Override
    public void getSubBlocks(Item item, CreativeTabs tabs, List list) {
        for (int i = 0; i < Names.Blocks.blockBeef.length; i++) {
            list.add(new ItemStack(item, 1, i));
        }
    }

    @Override
    public Item getItem(World world, int x, int y, int z) {
        return this.item;
    }
}
