package io.github.fergoman123.msb.block;

import io.github.fergoman123.fergoutil.helper.NameHelper;
import io.github.fergoman123.msb.info.BlockNames;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IStringSerializable;

import java.util.List;

public class BlockCompCobble extends BlockMultiMSB {

	public static final PropertyEnum VARIANT = PropertyEnum.create("variant", EnumType.class);

	public BlockCompCobble(String name) {
		super(BlockNames.compCobble, name);
		this.setDefaultState(this.blockState.getBaseState().withProperty(VARIANT, EnumType.compCobble1));
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

	@Override
	@SuppressWarnings("unchecked")
	public void addInformation(ItemStack stack, EntityPlayer playerIn, List tooltip, boolean advanced) {
		tooltip.add(NameHelper.translate("msb.tooltip.oredict"));
		if(stack.getItemDamage() == 0)tooltip.add("blockCompCobble1");
		if(stack.getItemDamage() == 1)tooltip.add("blockCompCobble2");
		if(stack.getItemDamage() == 2)tooltip.add("blockCompCobble3");
		if(stack.getItemDamage() == 3)tooltip.add("blockCompCobble4");
		if(stack.getItemDamage() == 4)tooltip.add("blockCompCobble5");
		if(stack.getItemDamage() == 5)tooltip.add("blockCompCobble6");
		if(stack.getItemDamage() == 6)tooltip.add("blockCompCobble7");
		if(stack.getItemDamage() == 7)tooltip.add("blockCompCobble8");
		if(stack.getItemDamage() == 8)tooltip.add("blockCompCobble9");
		if(stack.getItemDamage() == 9)tooltip.add("blockCompCobble10");
		if(stack.getItemDamage() == 10)tooltip.add("blockCompCobble11");
		if(stack.getItemDamage() == 11)tooltip.add("blockCompCobble12");
		if(stack.getItemDamage() == 12)tooltip.add("blockCompCobble13");
		if(stack.getItemDamage() == 13)tooltip.add("blockCompCobble14");
		if(stack.getItemDamage() == 14)tooltip.add("blockCompCobble15");
		if(stack.getItemDamage() == 15)tooltip.add("blockCompCobble15");
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
		compCobble16(15, "1853020188851841x");

		public int meta;
		public String name;

		EnumType(int meta, String name){
			this.meta = meta;
			this.name = name;
		}

		public static final String prefix = "cobble";

		@Override
		public String getName() {
			return name;
		}
	}
}
