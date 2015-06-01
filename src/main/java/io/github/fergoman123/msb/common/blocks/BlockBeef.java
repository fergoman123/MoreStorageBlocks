package io.github.fergoman123.msb.common.blocks;

import io.github.fergoman123.msb.api.BlockMultiMSB;
import io.github.fergoman123.msb.info.BlockInfos;
import io.github.fergoman123.msb.init.Sounds;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.util.IStringSerializable;
import net.minecraft.world.World;

import java.util.List;

public class BlockBeef extends BlockMultiMSB {

    public static final PropertyEnum VARIANT = PropertyEnum.create("variant", EnumType.class);

    public BlockBeef() {
        super(BlockInfos.blockBeef);
        this.setDefaultState(this.blockState.getBaseState().withProperty(VARIANT, EnumType.blockRawBeef));
        this.setStepSound(Sounds.cow);
    }

    @Override
    public void getSubBlocks(Item item, CreativeTabs tab, List list) {
        list.add(new ItemStack(item, 1, EnumType.blockRawBeef.getMeta()));
        list.add(new ItemStack(item, 1, EnumType.blockCookedBeef.getMeta()));
    }

    @Override
    public IBlockState getStateFromMeta(int meta) {
        return this.getDefaultState().withProperty(VARIANT, EnumType.values()[meta]);
    }

    @Override
    public int getMetaFromState(IBlockState state) {
        return ((EnumType) state.getValue(VARIANT)).getMeta();
    }

    @Override
    public BlockState createBlockState() {
        return new BlockState(this, VARIANT);
    }

    @Override
    public Item getItem(World worldIn, BlockPos pos) {
        return Item.getItemFromBlock(this);
    }

    @Override
    public int damageDropped(IBlockState state) {
        return ((EnumType)state.getValue(VARIANT)).getMeta();
    }

    public static enum EnumType implements IStringSerializable
    {
        blockRawBeef(0, "blockRawBeef"),
        blockCookedBeef(1, "blockCookedBeef");

        private int meta;
        private String name;

        private EnumType(int meta, String name)
        {
            this.meta = meta;
            this.name = name;
        }

        public String getName()
        {
            return name;
        }

        @Override
        public String toString() {
            return this.getName();
        }

        public int getMeta() {
            return meta;
        }
    }
}
