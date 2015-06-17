package io.github.fergoman123.msb.common.blocks;

import net.minecraft.util.IStringSerializable;

public enum BlockFishType implements IStringSerializable
{
    blockRawFish(0, "blockRawFish"),
    blockRawSalmon(1, "blockRawSalmon"),
    blockClownfish(2, "blockClownfish"),
    blockPufferfish(3, "blockPufferfish"),
    blockCookedFish(4, "blockCookedFish"),
    blockCookedSalmon(5, "blockCookedSalmon");

    private int meta;
    private String name;

    private BlockFishType(int meta, String name){
        this.meta = meta;
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return this.getName();
    }

    public int getMeta()
    {
        return this.meta;
    }
}
