package io.github.fergoman123.msb.block;

import net.minecraft.block.Block;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.IStringSerializable;

public class BlockNether extends BlockMultiMSB {


    public BlockNether(String name) {
        super(E);
    }

    @Override
    public int damageDropped(IBlockState state) {
        return 0;
    }

    @Override
    public IBlockState getStateFromMeta(int meta) {
        return null;
    }

    @Override
    public int getMetaFromState(IBlockState state) {
        return 0;
    }

    @Override
    public BlockState createBlockState() {
        return new BlockState();
    }

    public enum EnumType implements IStringSerializable{

        blockNetherWart("blockNetherWart"),
        blockNetherStar("blockNetherStar");

        private String name;

        EnumType(String name){
            this.name = name;
        }

        @Override
        public String getName() {
            return this.name;
        }

        public int meta(){
            return ordinal();
        }

        public static String[] getNames(){
            String[] names = new String[values().length];
        }
    }
}
