package io.github.fergoman123.msb.block;

import io.github.fergoman123.fergoutil.block.IBlockInfo;
import io.github.fergoman123.fergoutil.item.ItemBlockVariants;
import io.github.fergoman123.msb.MSB;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import java.util.List;

public abstract class BlockMultiMSB extends Block implements IBlockInfo{
	private String[] subNames;
	private String name;

	public BlockMultiMSB(String[] subNames, String name) {
		super(Material.iron);
		this.setCreativeTab(MSB.tabMSB);
		this.setUnlocalizedName(name);
        this.subNames = subNames;
        this.name = name;
	}

    public String getUnlocalizedName(){
        return String.format("tile.msb.%s", this.name);
    }

    public String[] getSubNames() {
        return subNames;
    }

    public String getName() {
        return name;
    }

    public static final class ItemBlockMSB extends ItemBlockVariants{
		public ItemBlockMSB(Block block){
            super(block);
        }

        public String getUnlocalizedName(ItemStack stack){
            BlockMultiMSB block = (BlockMultiMSB)this.block;
            return super.getUnlocalizedName() + "." + block.getSubNames()[stack.getItemDamage()];
        }
	}

    public abstract int damageDropped(IBlockState state);
    public abstract IBlockState getStateFromMeta(int meta);
    public abstract int getMetaFromState(IBlockState state);
    public abstract BlockState createBlockState();

    @SuppressWarnings({"unchecked", "rawtypes"})
    public void getSubBlocks(Item item, CreativeTabs tab, List list){
        for (int i = 0; i < subNames.length; i++) {
            list.add(new ItemStack(item, 1, i));
        }
    }
}
