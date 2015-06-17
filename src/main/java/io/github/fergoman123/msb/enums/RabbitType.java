package io.github.fergoman123.msb.enums;

import net.minecraft.util.IStringSerializable;

public enum RabbitType implements IStringSerializable
{
    blockRawRabbit(0, "blockRawRabbit"),
    blockCookedRabbit(1, "blockCookedPorkchop");

    private int meta;
    private String name;

    private RabbitType(int meta, String name){
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
