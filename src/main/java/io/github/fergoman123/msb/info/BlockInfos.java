package io.github.fergoman123.msb.info;

import io.github.fergoman123.fergoutil.info.BlockInfo;
import io.github.fergoman123.fergoutil.info.MultiBlockInfo;
import net.minecraft.block.material.Material;

public class BlockInfos
{
    public static final BlockInfo blockCharcoal = getBlockInfo(BlockNames.blockCharcoal);
    public static final BlockInfo blockApple = getBlockInfo(BlockNames.blockApple);
    public static final MultiBlockInfo blockGoldApple = getMultiBlockInfo(BlockNames.blockGoldAppleName, BlockNames.blockGoldApple, Models.blockGoldApple);
    public static final BlockInfo blockBook = getBlockInfo(BlockNames.blockBook);
    public static final BlockInfo blockEgg = getBlockInfo(BlockNames.blockEgg);
    public static final BlockInfo blockEnderPearl = getBlockInfo(BlockNames.blockEnderPearl);
    public static final BlockInfo blockEnderEye = getBlockInfo(BlockNames.blockEnderEye);
    public static final BlockInfo blockLead = getBlockInfo(BlockNames.blockLead);
    public static final BlockInfo blockReed = getBlockInfo(BlockNames.blockReed);
    public static final MultiBlockInfo blockSeeds = getMultiBlockInfo(BlockNames.blockSeedsName, BlockNames.blockSeeds, Models.blockSeeds);
    public static final BlockInfo blockStick = getBlockInfo(BlockNames.blockStick);
    public static final BlockInfo blockLeather = getBlockInfo(BlockNames.blockLeather);
    public static final BlockInfo blockBucket = getBlockInfo(BlockNames.blockBucket);
    public static final MultiBlockInfo blockDye = getMultiBlockInfo(BlockNames.blockDyeName, BlockNames.blockDye, Models.blockDye);
    public static final BlockInfo blockFireball = getBlockInfo(BlockNames.blockFireball);
    public static final BlockInfo blockSlimeball = getBlockInfo(BlockNames.blockSlimeball);
    public static final BlockInfo blockRottenFlesh = getBlockInfo(BlockNames.blockRottenFlesh);
    public static final BlockInfo blockPotato = getBlockInfo(BlockNames.blockPotato);
    public static final BlockInfo blockNetherWart = getBlockInfo(BlockNames.blockNetherWart);
    public static final BlockInfo blockGunpowder = getBlockInfo(BlockNames.blockGunpowder);
    public static final BlockInfo blockCarrot = getBlockInfo(BlockNames.blockCarrot);
    public static final BlockInfo blockArrow = getBlockInfo(BlockNames.blockArrow);
    public static final BlockInfo blockBlazeRod = getBlockInfo(BlockNames.blockBlazeRod);
    public static final BlockInfo blockFlint = getBlockInfo(BlockNames.blockFlint);
    public static final BlockInfo blockBone = getBlockInfo(BlockNames.blockBone);
    public static final BlockInfo blockSugar = getBlockInfo(BlockNames.blockSugar);
    public static final BlockInfo blockNetherStar = getBlockInfo(BlockNames.blockNetherStar);
    public static final BlockInfo blockClay = getBlockInfo(BlockNames.blockClay);
    public static final BlockInfo blockString = getBlockInfo(BlockNames.blockString);
    public static final BlockInfo blockFeather = getBlockInfo(BlockNames.blockFeather);
    public static final BlockInfo blockBread = getBlockInfo(BlockNames.blockBread);
    public static final MultiBlockInfo blockPorkchop = getMultiBlockInfo(BlockNames.blockPorkchopName, BlockNames.blockPorkchop, Models.blockPorkchop);
    public static final MultiBlockInfo blockFish = getMultiBlockInfo(BlockNames.blockFishName, BlockNames.blockFish, Models.blockFish);
    public static final BlockInfo blockCookie = getBlockInfo(BlockNames.blockCookie);
    public static final MultiBlockInfo blockBeef = getMultiBlockInfo(BlockNames.blockBeefName, BlockNames.blockBeef, Models.blockBeef);
    public static final BlockInfo blockPumpkinPie = getBlockInfo(BlockNames.blockPumpkinPie);
    public static final BlockInfo blockGhastTear = getBlockInfo(BlockNames.blockGhastTear);
    public static final MultiBlockInfo blockSkull = getMultiBlockInfo(BlockNames.blockSkullName, BlockNames.blockSkull, Models.blockSkull);
    public static final MultiBlockInfo blockMutton = getMultiBlockInfo(BlockNames.blockMuttonName, BlockNames.blockMutton, Models.blockMutton);
    public static final MultiBlockInfo blockRabbit = getMultiBlockInfo(BlockNames.blockRabbitName, BlockNames.blockRabbit, Models.blockRabbit);

    private static BlockInfo getBlockInfo(String name)
    {
        return new BlockInfo(Material.iron, name, "msb:" + name);
    }

    private static MultiBlockInfo getMultiBlockInfo(String name, String[] names, String[] models)
    {
        return new MultiBlockInfo(Material.iron, name, names, models);
    }
}
