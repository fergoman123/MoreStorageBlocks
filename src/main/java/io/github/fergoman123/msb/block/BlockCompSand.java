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

        blockCompSand1(0, "blockCompSand1"),
        blockCompSand2(1, "blockCompSand2"),
        blockCompSand3(2, "blockCompSand3"),
        blockCompSand4(3, "blockCompSand4"),
        blockCompSand5(4, "blockCompSand5"),
        blockCompSand6(5, "blockCompSand6"),
        blockCompSand7(6, "blockCompSand7"),
        blockCompSand8(7, "blockCompSand8"),
        blockCompSand9(8, "blockCompSand9"),
        blockCompSand10(9, "blockCompSand10"),
        blockCompSand11(10, "blockCompSand11"),
        blockCompSand12(11, "blockCompSand12"),
        blockCompSand13(12, "blockCompSand13"),
        blockCompSand14(13, "blockCompSand14"),
        blockCompSand15(14, "blockCompSand15"),
        blockCompSand16(15, "blockCompSand16");

        private int meta;
        private String name;

        EnumType(int meta, String name) {
            this.meta = meta;
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

        public int meta(){
            return this.meta;
        }

        public ItemStack getItemStack(int amt) {
            return new ItemStack(ModBlocks.blockCompSand, amt, this.meta);
        }
    }
}
