package io.github.fergoman123.msb.block;

import io.github.fergoman123.msb.init.ModBlocks;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IStringSerializable;

public class BlockCompSand extends BlockMultiMSB {
    public static final PropertyEnum VARIANT = PropertyEnum.create("variant", EnumType.class);

    public BlockCompSand(String name) {
        super(EnumType.getNames(), name);
        this.setDefaultState(this.blockState.getBaseState().withProperty(VARIANT, EnumType.blockCompSand1));
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

    @Override
    protected ItemStack createStackedBlock(IBlockState state) {
        return ((EnumType) state.getValue(VARIANT)).getItemStack(1);
    }

    public enum EnumType implements IStringSerializable {

        blockCompSand1("blockCompSand1"),
        blockCompSand2("blockCompSand2"),
        blockCompSand3("blockCompSand3"),
        blockCompSand4("blockCompSand4"),
        blockCompSand5("blockCompSand5"),
        blockCompSand6("blockCompSand6"),
        blockCompSand7("blockCompSand7"),
        blockCompSand8("blockCompSand8"),
        blockCompSand9("blockCompSand9"),
        blockCompSand10("blockCompSand10"),
        blockCompSand11("blockCompSand11"),
        blockCompSand12("blockCompSand12"),
        blockCompSand13("blockCompSand13"),
        blockCompSand14("blockCompSand14"),
        blockCompSand15("blockCompSand15"),
        blockCompSand16("blockCompSand16");

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
            return new ItemStack(ModBlocks.blockCompSand, amt, ordinal());
        }
    }
}
