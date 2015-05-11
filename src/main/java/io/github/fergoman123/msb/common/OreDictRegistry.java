package io.github.fergoman123.msb.common;

import io.github.fergoman123.fergoutil.oredict.OreDictBlock;
import io.github.fergoman123.fergoutil.oredict.OreDictHelper;
import io.github.fergoman123.fergoutil.oredict.OreDictItemStack;
import io.github.fergoman123.msb.info.BlockNames;
import io.github.fergoman123.msb.init.ModBlocks;

public class OreDictRegistry {

    public static void init()
    {
        registerOre(OreDictList.blockCharcoal);
        registerOre(OreDictList.blockApple);
        registerOre(OreDictList.blockGoldApple);
        registerOre(OreDictList.blockBook);
        registerOre(OreDictList.blockEgg);
        registerOre(OreDictList.blockEnderPearl);
        registerOre(OreDictList.blockEnderEye);
        registerOre(OreDictList.blockLead);
        registerOre(OreDictList.blockReed);
        registerOre(OreDictList.blockSeeds);
        registerOre(OreDictList.blockStick);
        registerOre(OreDictList.blockLeather);
        registerOre(OreDictList.blockBucket);
        registerOre(OreDictList.blockDye);
        registerOre(OreDictList.blockFireball);
        registerOre(OreDictList.blockSlimeball);
        registerOre(OreDictList.blockRottenFlesh);
        registerOre(OreDictList.blockPotato);
        registerOre(OreDictList.blockNetherWart);
        registerOre(OreDictList.blockGunpowder);
        registerOre(OreDictList.blockCarrot);
        registerOre(OreDictList.blockArrow);
        registerOre(OreDictList.blockBlazeRod);
        registerOre(OreDictList.blockFlint);
        registerOre(OreDictList.blockBone);
        registerOre(OreDictList.blockSugar);
        registerOre(OreDictList.blockNetherStar);
        registerOre(OreDictList.blockClay);
        registerOre(OreDictList.blockString);
        registerOre(OreDictList.blockFeather);
        registerOre(OreDictList.blockBread);
        registerOre(OreDictList.blockPorkchop);
        registerOre(OreDictList.blockFish);
        registerOre(OreDictList.blockCookie);
        registerOre(OreDictList.blockBeef);
        registerOre(OreDictList.blockPumpkinPie);
        registerOre(OreDictList.blockGhastTear);
        registerOre(OreDictList.blockSkull);
    }

    public static void registerOre(OreDictBlock ore)
    {
        OreDictHelper.registerOre(ore);
    }

    public static void registerOre(OreDictItemStack[] ores)
    {
        for(OreDictItemStack ore : ores)
        {
            OreDictHelper.registerOre(ore);
        }
    }
}
