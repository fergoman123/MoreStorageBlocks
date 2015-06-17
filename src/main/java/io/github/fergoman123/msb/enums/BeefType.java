package io.github.fergoman123.msb.enums;

import net.minecraft.util.IStringSerializable;

public enum  BeefType implements IStringSerializable
{
    blockRawBeef(0, "blockRawBeef"),
    blockCookedBeef(1, "blockCookedBeef");

    private int meta;
    private String name;

    private BeefType(int meta, String name){
        this.meta = meta;
        this.name = name;
    }

    public int getMeta(){
        return meta;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return this.getName();
    }
}
