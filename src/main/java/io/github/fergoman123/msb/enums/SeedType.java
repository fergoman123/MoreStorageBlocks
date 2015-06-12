package io.github.fergoman123.msb.enums;

import net.minecraft.util.IStringSerializable;

public enum SeedType implements IStringSerializable
{
    blockWheatSeeds(0, "blockWheatSeeds"),
    blockPumpkinSeeds(1, "blockPumpkinSeeds"),
    blockMelonSeeds(2, "blockMelonSeeds");

    private int meta;
    private String name;

    private SeedType(int meta, String name)
    {
        this.meta = meta;
        this.name = name;
    }

    public String getName(){return this.name;}
    public String toString(){return getName();}
    public int getMeta()
    {
        return this.meta;
    }
}
