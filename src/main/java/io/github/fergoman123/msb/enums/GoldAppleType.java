package io.github.fergoman123.msb.enums;

import net.minecraft.util.IStringSerializable;

public enum GoldAppleType implements IStringSerializable
{

    blockGoldApple1(0, "blockGoldApple1"),
    blockGoldApple2(1, "blockGoldApple2");

    private int meta;
    private String name;

    private GoldAppleType(int meta, String name){
        this.meta = meta;
        this.name = name;
    }

    public int getMeta() {
        return meta;
    }

    @Override
    public String toString() {
        return this.getName();
    }

    @Override
    public String getName() {
        return name;
    }
}
