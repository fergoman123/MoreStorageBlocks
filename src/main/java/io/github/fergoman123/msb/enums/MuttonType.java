package io.github.fergoman123.msb.enums;

import net.minecraft.util.IStringSerializable;

public enum MuttonType implements IStringSerializable{

    blockRawMutton(0, "blockRawMutton"),
    blockCookedMutton(1, "blockCookedMutton");

    private int meta;
    private String name;

    private MuttonType(int meta, String name){
        this.meta = meta;
        this.name = name;
    }

    public int getMeta() {
        return meta;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return getName();
    }
}