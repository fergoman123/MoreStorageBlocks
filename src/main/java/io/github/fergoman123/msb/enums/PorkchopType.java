package io.github.fergoman123.msb.enums;

import net.minecraft.util.IStringSerializable;

public enum PorkchopType implements IStringSerializable{

    blockRawPorkchop(0, "blockRawPorkchop"),
    blockCookedPorkchop(1, "blockCookedPorkchop");

    private int meta;
    private String name;

    private PorkchopType(int meta, String name){
        this.meta = meta;
        this.name = name;
    }

    public int getMeta() {
        return meta;
    }

    @Override
    public String toString() {
        return getName();
    }

    @Override
    public String getName() {
        return name;
    }
}
