package io.github.fergoman123.msb.block;

import io.github.fergoman123.msb.init.ModBlocks;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IStringSerializable;

public class BlockDye extends BlockMultiMSB {
    public static final PropertyEnum VARIANT = PropertyEnum.create("variant", EnumType.class);

    public BlockDye(String name) {
        super(EnumType.getNames(), name);
        this.setDefaultState(this.blockState.getBaseState().withProperty(VARIANT, EnumType.blockInkSack));
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
        blockInkSack(0, "blockInkSack"),
        blockRoseRed(1, "blockRoseRed"),
        blockCactusGreen(2, "blockCactusGreen"),
        blockCocoa(3, "blockCocoa"),
        blockPurpleDye(4, "blockPurpleDye"),
        blockCyanDye(5, "blockCyanDye"),
        blockSilverDye(6, "blockSilverDye"),
        blockGrayDye(7, "blockGrayDye"),
        blockPinkDye(8, "blockPinkDye"),
        blockLimeDye(9, "blockLimeDye"),
        blockYellowDye(10, "blockYellowDye"),
        blockLightBlueDye(11, "blockLightBlueDye"),
        blockMagentaDye(12, "blockMagentaDye"),
        blockOrangeDye(13, "blockOrangeDye"),
        blockWhiteDye(14, "blockWhiteDye");

        private int meta;
        private String name;

        EnumType(int meta, String name) {
            this.meta = meta;
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

        public int meta(){
            return this.meta;
        }

        public ItemStack getItemStack(int amt) {
            return new ItemStack(ModBlocks.blockDye, amt, this.meta);
        }
    }
}
