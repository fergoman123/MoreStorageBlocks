package io.github.fergoman123.msb.block;

import io.github.fergoman123.msb.init.ModBlocks;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IStringSerializable;

public class BlockMutton extends BlockMultiMSB {
    public static final PropertyEnum VARIANT = PropertyEnum.create("variant", EnumType.class);

    public BlockMutton(String name) {
        super(EnumType.getNames(), name);
        this.setDefaultState(this.blockState.getBaseState().withProperty(VARIANT, EnumType.blockRawMutton));
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
        blockRawMutton("blockRawMutton"),
        blockCookedMutton("blockCookedMutton");

        private String name;

        EnumType(String name) {
            this.name = name;
        }

        public String getName() {
            return this.name;
        }

        public static String[] getNames() {
            String[] names = new String[values().length];
            for (int i = 0; i < names.length; i++) {
                names[i] = values()[i].getName();
            }
            return names;
        }

        public ItemStack getItemStack(int amt) {
            return new ItemStack(ModBlocks.blockMutton, amt, ordinal());
        }
    }
}
