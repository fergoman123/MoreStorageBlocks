package io.github.fergoman123.msb.block;

import io.github.fergoman123.fergoutil.item.ItemBlockVariants;
import net.minecraft.block.Block;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IStringSerializable;

public class BlockCompCobble extends BlockMultiMSB {

	public static final PropertyEnum VARIANT = PropertyEnum.create("variant", EnumType.class);

	public BlockCompCobble(String[] subNames, String name) {
		super(subNames, name);
	}

	@Override
	public int damageDropped(IBlockState state) {
		return ((EnumType)state.getValue(VARIANT)).meta;
	}

	@Override
	public IBlockState getStateFromMeta(int meta) {
		return this.getDefaultState().withProperty(VARIANT, EnumType.values()[meta]);
	}

	@Override
	public int getMetaFromState(IBlockState state) {
		return ((EnumType)state.getValue(VARIANT)).meta;
	}

	@Override
	public BlockState createBlockState() {
		return new BlockState(this, VARIANT);
	}

	public enum EnumType implements IStringSerializable{
		compCobble1(0, "9x"),
		compCobble2(1, "81x"),
		compCobble3(2, "729x"),
		compCobble4(3, "6561x"),
		compCobble5(4, "59049x"),
		compCobble6(5, "531441x"),
		compCobble7(6, "4782969x"),
		compCobble8(7, "43046721x"),
		compCobble9(8, "387420489x"),
		compCobble10(9, "3486784401x"),
		compCobble11(10, "31381059609x"),
		compCobble12(11, "282429536481x"),
		compCobble13(12, "2541865828329x"),
		compCobble14(13, "22876792454961x"),
		compCobble15(14, "205891132094649x"),
		compCobble16(15, "1853020188851841x"),
		;

		public int meta;
		public String name;

		private EnumType(int meta, String name){
			this.meta = meta;
			this.name = name;
		}

		public static final String prefix = "cobble";

		@Override
		public String getName() {
			return name;
		}
	}

    public static final class ItemBlockCompCobble extends ItemBlockVariants {
        public ItemBlockCompCobble(Block block) {
            super(block);
        }

        @Override
        public String getUnlocalizedName(ItemStack stack) {
            return super.getUnlocalizedName() + "." + EnumType.prefix + EnumType.values()[stack.getItemDamage()];

        }
    }
}
