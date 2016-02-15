package io.github.fergoman123.msb.block;

import io.github.fergoman123.msb.init.ModBlocks;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IStringSerializable;

public class BlockEnder extends BlockMultiMSB {

    public static final PropertyEnum variant = PropertyEnum.create("variant", EnumType.class);

    public BlockEnder(String name) {
        super(EnumType.getNames(), name);
    }

    @Override
    public int damageDropped(IBlockState state) {
        return ((EnumType) state.getValue(variant)).ordinal();
    }

    @Override
    public IBlockState getStateFromMeta(int meta) {
        return this.getDefaultState().withProperty(variant, EnumType.values()[meta]);
    }

    @Override
    public int getMetaFromState(IBlockState state) {
        return ((EnumType) state.getValue(variant)).ordinal();
    }

    @Override
    public BlockState createBlockState() {
        return new BlockState(this, variant);
    }

    public enum EnumType implements IStringSerializable {
        blockEnderPearl(0, "blockEnderPearl"),
        blockEnderEye(1, "blockEnderEye");

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
            return new ItemStack(ModBlocks.blockEnder, amt, this.meta);
        }
    }
}