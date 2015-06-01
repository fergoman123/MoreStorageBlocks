package io.github.fergoman123.msb.info;

public class Models
{
    public static final String blockGoldApple0 = getModel(BlockNames.blockGoldApple[0]);
    public static final String blockGoldApple1 = getModel(BlockNames.blockGoldApple[1]);
    public static final String[] blockGoldApple = {blockGoldApple0, blockGoldApple1};

    public static final String blockSeeds0 = getModel(BlockNames.blockSeeds[0]);
    public static final String blockSeeds1 = getModel(BlockNames.blockSeeds[1]);
    public static final String blockSeeds2 = getModel(BlockNames.blockSeeds[2]);
    public static final String[] blockSeeds = {blockSeeds0,blockSeeds1,blockSeeds2};

    public static final String blockDye0 = getModel(BlockNames.blockDye[0]);
    public static final String blockDye1 = getModel(BlockNames.blockDye[1]);
    public static final String blockDye2 = getModel(BlockNames.blockDye[2]);
    public static final String blockDye3 = getModel(BlockNames.blockDye[3]);
    public static final String blockDye4 = getModel(BlockNames.blockDye[4]);
    public static final String blockDye5 = getModel(BlockNames.blockDye[5]);
    public static final String blockDye6 = getModel(BlockNames.blockDye[6]);
    public static final String blockDye7 = getModel(BlockNames.blockDye[7]);
    public static final String blockDye8 = getModel(BlockNames.blockDye[8]);
    public static final String blockDye9 = getModel(BlockNames.blockDye[9]);
    public static final String blockDye10 = getModel(BlockNames.blockDye[10]);
    public static final String blockDye11 = getModel(BlockNames.blockDye[11]);
    public static final String blockDye12 = getModel(BlockNames.blockDye[12]);
    public static final String blockDye13 = getModel(BlockNames.blockDye[13]);
    public static final String blockDye14 = getModel(BlockNames.blockDye[14]);
    public static final String[] blockDye = {blockDye0,blockDye1,blockDye2,blockDye3,blockDye4,blockDye5,blockDye6,blockDye7,blockDye8,blockDye9,blockDye10,blockDye11,blockDye12,blockDye13,blockDye14};

    public static final String blockPorkchop0 = getModel(BlockNames.blockPorkchop[0]);
    public static final String blockPorkchop1 = getModel(BlockNames.blockPorkchop[1]);
    public static final String[] blockPorkchop = {blockPorkchop0, blockPorkchop1};

    public static final String blockFish0 = getModel(BlockNames.blockFish[0]);
    public static final String blockFish1 = getModel(BlockNames.blockFish[1]);
    public static final String blockFish2 = getModel(BlockNames.blockFish[2]);
    public static final String blockFish3 = getModel(BlockNames.blockFish[3]);
    public static final String blockFish4 = getModel(BlockNames.blockFish[4]);
    public static final String blockFish5 = getModel(BlockNames.blockFish[5]);
    public static final String[] blockFish = {blockFish0,blockFish1,blockFish2,blockFish3,blockFish4,blockFish5};

    public static final String blockBeef0 = getModel(BlockNames.blockBeef[0]);
    public static final String blockBeef1 = getModel(BlockNames.blockBeef[1]);
    public static final String[] blockBeef = {blockBeef0, blockBeef1};

    public static final String blockSkull0 = getModel(BlockNames.blockSkull[0]);
    public static final String blockSkull1 = getModel(BlockNames.blockSkull[1]);
    public static final String blockSkull2 = getModel(BlockNames.blockSkull[2]);
    public static final String blockSkull3 = getModel(BlockNames.blockSkull[3]);
    public static final String[] blockSkull = {blockSkull0,blockSkull1,blockSkull2,blockSkull3};

    public static final String blockMutton0 = getModel(BlockNames.blockMutton[0]);
    public static final String blockMutton1 = getModel(BlockNames.blockMutton[1]);
    public static final String[] blockMutton = {blockMutton0, blockMutton1};

    public static final String blockRabbit0 = getModel(BlockNames.blockRabbit[0]);
    public static final String blockRabbit1 = getModel(BlockNames.blockRabbit[1]);
    public static final String[] blockRabbit = {blockRabbit0, blockRabbit1};

    private static String getModel(String name)
    {
        return "msb:" + name;
    }
}
