package io.github.fergoman123.msb.enums;

import net.minecraft.util.IStringSerializable;

public enum  SkullType implements IStringSerializable
{
    blockSkullSkeleton(0, "blockSkullSkeleton"),
    blockSkullWither(1, "blockSkullWither"),
    blockSkullZombie(2, "blockSkullZombie"),
    blockSkullCreeper(3, "blockSkullCreeper");

    private int meta;
    private String name;

    private SkullType(int meta, String name){
        this.meta = meta;
        this.name = name;
    }

    public String getName(){return this.name();}
    public String toString(){return this.getName();}
    public int getMeta(){return this.ordinal();}
}
