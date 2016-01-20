package io.github.fergoman123.msb.block;

import io.github.fergoman123.msb.init.ModBlocks;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IStringSerializable;

public class BlockCompCobble extends BlockMultiMSB {

    public static final PropertyEnum VARIANT = PropertyEnum.create("variant", EnumType.class);

    public BlockCompCobble(String name) {
        super(EnumType.getNames(), name);
        this.setDefaultState(this.blockState.getBaseState().withProperty(VARIANT, EnumType.blockCompCobble1));
    }

    @Override
    public int damageDropped(IBlockState state) {
        return ((EnumType) state.getValue(VARIANT)).ordinal();
    }

    @Override
    public IBlockState getStateFromMeta(int meta) {
        return this.getDefaultState().withProperty(VARIANT, EnumType.values()[meta]);
    }

    @Override
    public int getMetaFromState(IBlockState state) {
        return ((EnumType) state.getValue(VARIANT)).ordinal();
    }

    @Override
    public BlockState createBlockState() {
        return new BlockState(this, VARIANT);
    }

    public enum EnumType implements IStringSerializable {

        blockCompCobble1("blockCompCobble1"),
        blockCompCobble2("blockCompCobble2"),
        blockCompCobble3("blockCompCobble3"),
        blockCompCobble4("blockCompCobble4"),
        blockCompCobble5("blockCompCobble5"),
        blockCompCobble6("blockCompCobble6"),
        blockCompCobble7("blockCompCobble7"),
        blockCompCobble8("blockCompCobble8"),
        blockCompCobble9("blockCompCobble9"),
        blockCompCobble10("blockCompCobble10"),
        blockCompCobble11("blockCompCobble11"),
        blockCompCobble12("blockCompCobble12"),
        blockCompCobble13("blockCompCobble13"),
        blockCompCobble14("blockCompCobble14"),
        blockCompCobble15("blockCompCobble15"),
        blockCompCobble16("blockCompCobble16");

        public String name;

        EnumType(String name) {
            this.name = name;
        }

        @Override
        public String getName() {
            return name;
        }

        public static String[] getNames() {
            String[] names = new String[values().length];
            for (int i = 0; i < names.length; i++) {
                names[i] = values()[i].getName();
            }
            return names;
        }

        public ItemStack getItemStack(int amt) {
            return new ItemStack(ModBlocks.blockCompCobble, amt, ordinal());
        }
    }
}
