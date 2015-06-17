package io.github.fergoman123.msb.common;

import io.github.fergoman123.fergoutil.oredict.OreDictItemStack;

public class OreDictRegistry {

    public static void init()
    {
        OreDictList.blockCharcoal.registerOre();
        OreDictList.blockApple.registerOre();
        registerOres(OreDictList.blockGoldApple);
        OreDictList.blockBook.registerOre();
        OreDictList.blockEgg.registerOre();
        OreDictList.blockEnderPearl.registerOre();
        OreDictList.blockEnderEye.registerOre();
        OreDictList.blockLead.registerOre();
        OreDictList.blockReed.registerOre();
        registerOres(OreDictList.blockSeeds);
        OreDictList.blockStick.registerOre();
        OreDictList.blockLeather.registerOre();
        OreDictList.blockBucket.registerOre();
        registerOres(OreDictList.blockDye);
        OreDictList.blockFireball.registerOre();
        OreDictList.blockSlimeball.registerOre();
        OreDictList.blockRottenFlesh.registerOre();
        OreDictList.blockPotato.registerOre();
        OreDictList.blockNetherWart.registerOre();
        OreDictList.blockGunpowder.registerOre();
        OreDictList.blockCarrot.registerOre();
        OreDictList.blockArrow.registerOre();
        OreDictList.blockBlazeRod.registerOre();
        OreDictList.blockFlint.registerOre();
        OreDictList.blockBone.registerOre();
        OreDictList.blockSugar.registerOre();
        OreDictList.blockNetherStar.registerOre();
        OreDictList.blockClay.registerOre();
        OreDictList.blockString.registerOre();
        OreDictList.blockFeather.registerOre();
        OreDictList.blockBread.registerOre();
        registerOres(OreDictList.blockPorkchop);
        registerOres(OreDictList.blockFish);
        OreDictList.blockCookie.registerOre();
        registerOres(OreDictList.blockBeef);
        OreDictList.blockPumpkinPie.registerOre();
        OreDictList.blockGhastTear.registerOre();
        registerOres(OreDictList.blockSkull);
    }

    private static void registerOres(OreDictItemStack[] ores){
        for (OreDictItemStack ore : ores){
            ore.registerOre();
        }
    }
}
