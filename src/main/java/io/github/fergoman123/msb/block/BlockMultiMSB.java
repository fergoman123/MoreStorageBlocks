package io.github.fergoman123.msb.block;

import io.github.fergoman123.fergoutil.item.ItemBlockVariants;
import io.github.fergoman123.msb.MSB;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.ItemStack;

public abstract class BlockMultiMSB extends Block {
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
            BlockMultiMSB multiMSB = (BlockMultiMSB)this.block;
            return super.getUnlocalizedName() + "." + multiMSB.getSubNames()[stack.getItemDamage()];
        }
	}

    public abstract int damageDropped(IBlockState state);
    public abstract IBlockState getStateFromMeta(int meta);
    public abstract int getMetaFromState(IBlockState state);
    public abstract BlockState createBlockState();
}
