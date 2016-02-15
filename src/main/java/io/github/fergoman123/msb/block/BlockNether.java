package io.github.fergoman123.msb.block;

import io.github.fergoman123.msb.init.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTBase;
import net.minecraft.util.IStringSerializable;

public class BlockNether extends BlockMultiMSB {
    public static final PropertyEnum<EnumType> VARIANT = PropertyEnum.create("variant", EnumType.class);

    public BlockNether(String name) {
        super(EnumType.getNames(), name);
        this.setDefaultState(this.blockState.getBaseState().withProperty(VARIANT, EnumType.blockNetherWart));
    }

    @Override
    public int damageDropped(IBlockState state) {
        return state.getValue(VARIANT).meta();
    }

    @Override
    public IBlockState getStateFromMeta(int meta) {
        return this.getDefaultState().withProperty(VARIANT, EnumType.values()[meta]);
    }

    @Override
    public int getMetaFromState(IBlockState state) {
        return state.getValue(VARIANT).meta();
    }

    @Override
    public BlockState createBlockState() {
        return new BlockState(this, VARIANT);
    }

    public enum EnumType implements IStringSerializable{

        blockNetherWart(0, "blockNetherWart"),
        blockNetherStar(1, "blockNetherStar");

        private int meta;
        private String name;

        EnumType(int meta, String name){
            this.meta = meta;
            this.name = name;
        }

        @Override
        public String getName() {
            return this.name;
        }

        public int meta(){
            return this.meta;
        }

        public static String[] getNames(){
            String[] names = new String[values().length];
            for (int i = 0; i < names.length; i++){
                names[i] = values()[i].getName();
            }
            return names;
        }

        public ItemStack getItemStack(int amt){
            return new ItemStack(ModBlocks.blockNether, amt, this.meta);
        }
    }
}
