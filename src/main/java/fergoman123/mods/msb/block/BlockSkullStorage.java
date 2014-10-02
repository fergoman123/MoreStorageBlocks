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

public class BlockSkullStorage extends BlockMSBST
{
    public static final String[] subtypes = new String[]{"blockSkeletonSkull", "blockWitherSkull", "blockZombieSkull", "blockCreeperSkull"};

    public BlockSkullStorage() {
        super();
        this.setBlockName(Names.Blocks.blockSkull);
    }

    @Override
    public Item getItemDropped(int metadata, Random random, int fortune) {
        return Item.getItemFromBlock(this);
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
        this.icons = new IIcon[subtypes.length];

        for (int i = 0; i < subtypes.length; i++) {
            this.icons[i] = register.registerIcon(String.format("%s.%s", NameHelper.getUnwrappedUnlocalizedName(this.getUnlocalizedName()), subtypes[i]));
        }
    }

    @Override
    @SuppressWarnings("unchecked")
    public void getSubBlocks(Item item, CreativeTabs tabs, List list) {
        for (int i = 0; i < subtypes.length; i++) {
            ItemStack stack = new ItemStack(item, 1, i);
            list.add(stack);
        }
    }

    @Override
    public Item getItem(World world, int x, int y, int z) {
        return Item.getItemFromBlock(this);
    }
}
