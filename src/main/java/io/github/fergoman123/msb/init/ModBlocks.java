package io.github.fergoman123.msb.init;

import io.github.fergoman123.msb.api.BlockMSB;
import io.github.fergoman123.msb.api.BlockMultiMSB;
import io.github.fergoman123.msb.common.blocks.*;

import static io.github.fergoman123.fergoutil.helper.RegisterHelper.registerBlock;

public class ModBlocks
{
    public static BlockMSB blockCharcoal;
    public static BlockMSB blockApple;
    public static BlockMultiMSB blockGoldApple;
    public static BlockMSB blockBook;
    public static BlockMSB blockEgg;
    public static BlockMSB blockEnderPearl;
    public static BlockMSB blockEnderEye;
    public static BlockMSB blockLead;
    public static BlockMSB blockReed;
    public static BlockMultiMSB blockSeeds;
    public static BlockMSB blockStick;
    public static BlockMSB blockLeather;
    public static BlockMSB blockBucket;
    public static BlockMultiMSB blockDye;
    public static BlockMSB blockFireball;
    public static BlockMSB blockSlimeball;
    public static BlockMSB blockRottenFlesh;
    public static BlockMSB blockPotato;
    public static BlockMSB blockNetherWart;
    public static BlockMSB blockGunpowder;
    public static BlockMSB blockCarrot;
    public static BlockMSB blockArrow;
    public static BlockMSB blockBlazeRod;
    public static BlockMSB blockFlint;
    public static BlockMSB blockBone;
    public static BlockMSB blockSugar;
    public static BlockMSB blockNetherStar;
    public static BlockMSB blockClay;
    public static BlockMSB blockString;
    public static BlockMSB blockFeather;
    public static BlockMSB blockBread;
    public static BlockMultiMSB blockPorkchop;
    public static BlockMultiMSB blockFish;
    public static BlockMSB blockCookie;
    public static BlockMultiMSB blockBeef;
    public static BlockMSB blockPumpkinPie;
    public static BlockMSB blockGhastTear;
    public static BlockMultiMSB blockSkull;
    public static BlockMultiMSB blockMutton;
    public static BlockMultiMSB blockRabbit;

    public static void addBlocks()
    {
        blockCharcoal = new BlockMSB(BlockInfos.blockCharcoal);
        blockApple = new BlockMSB(BlockInfos.blockApple);
        blockGoldApple = new BlockGoldApple();
        blockBook = new BlockMSB(BlockInfos.blockBook);
        blockEgg = new BlockMSB(BlockInfos.blockEgg);
        blockEnderPearl = new BlockMSB(BlockInfos.blockEnderPearl);
        blockEnderEye = new BlockMSB(BlockInfos.blockEnderEye);
        blockLead = new BlockMSB(BlockInfos.blockLead);
        blockReed = new BlockMSB(BlockInfos.blockReed);
        blockSeeds = new BlockSeeds();
        blockStick = new BlockMSB(BlockInfos.blockStick);
        blockLeather = new BlockMSB(BlockInfos.blockLeather);
        blockBucket = new BlockMSB(BlockInfos.blockBucket);
        blockDye = new BlockDye();
        blockFireball = new BlockMSB(BlockInfos.blockFireball);
        blockSlimeball = new BlockMSB(BlockInfos.blockSlimeball);
        blockRottenFlesh = new BlockMSB(BlockInfos.blockRottenFlesh);
        blockPotato = new BlockMSB(BlockInfos.blockPotato);
        blockNetherWart = new BlockMSB(BlockInfos.blockNetherWart);
        blockGunpowder = new BlockMSB(BlockInfos.blockGunpowder);
        blockCarrot = new BlockMSB(BlockInfos.blockCarrot);
        blockArrow = new BlockMSB(BlockInfos.blockArrow);
        blockBlazeRod = new BlockMSB(BlockInfos.blockBlazeRod);
        blockFlint = new BlockMSB(BlockInfos.blockFlint);
        blockBone = new BlockMSB(BlockInfos.blockBone);
        blockSugar = new BlockMSB(BlockInfos.blockSugar);
        blockNetherStar = new BlockMSB(BlockInfos.blockNetherStar);
        blockClay = new BlockMSB(BlockInfos.blockClay);
        blockString = new BlockMSB(BlockInfos.blockString);
        blockFeather = new BlockMSB(BlockInfos.blockFeather);
        blockBread = new BlockMSB(BlockInfos.blockBread);
        blockPorkchop = new BlockPorkchop();
        blockFish = new BlockFish();
        blockCookie = new BlockMSB(BlockInfos.blockCookie);
        blockBeef = new BlockBeef();
        blockPumpkinPie = new BlockMSB(BlockInfos.blockPumpkinPie);
        blockGhastTear = new BlockMSB(BlockInfos.blockGhastTear);
        blockSkull = new BlockSkullStorage();
        blockMutton = new BlockMutton();
        blockRabbit = new BlockRabbit();
    }

    public static void registerBlocks()
    {
        registerBlock(blockCharcoal);
        registerBlock(blockApple);
        registerBlock(blockGoldApple);
        registerBlock(blockBook);
        registerBlock(blockEgg);
        registerBlock(blockEnderPearl);
        registerBlock(blockEnderEye);
        registerBlock(blockLead);
        registerBlock(blockReed);
        registerBlock(blockSeeds);
        registerBlock(blockStick);
        registerBlock(blockLeather);
        registerBlock(blockBucket);
        registerBlock(blockDye);
        registerBlock(blockFireball);
        registerBlock(blockSlimeball);
        registerBlock(blockRottenFlesh);
        registerBlock(blockPotato);
        registerBlock(blockNetherWart);
        registerBlock(blockGunpowder);
        registerBlock(blockCarrot);
        registerBlock(blockArrow);
        registerBlock(blockBlazeRod);
        registerBlock(blockFlint);
        registerBlock(blockBone);
        registerBlock(blockSugar);
        registerBlock(blockNetherStar);
        registerBlock(blockClay);
        registerBlock(blockString);
        registerBlock(blockFeather);
        registerBlock(blockBread);
        registerBlock(blockPorkchop);
        registerBlock(blockFish);
        registerBlock(blockCookie);
        registerBlock(blockBeef);
        registerBlock(blockPumpkinPie);
        registerBlock(blockGhastTear);
        registerBlock(blockSkull);
        registerBlock(blockMutton);
        registerBlock(blockRabbit);
    }
}
