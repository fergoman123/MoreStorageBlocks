package io.github.fergoman123.msb.enums;

import net.minecraft.util.IStringSerializable;

public enum DyeType implements IStringSerializable
{
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
    blockMagentaDye(12, "blockMegentaDye"),
    blockOrangeDye(13, "blockOrangeDye"),
    blockWhiteDye(14, "blockWhiteDye");

    private int meta;
    private String name;

    private DyeType(int meta, String name){
        this.meta = meta;
        this.name = name;
    }

    public String getName(){return this.name;}
    public String toString(){return getName();}
    public int getMeta(){return this.meta;}
}
