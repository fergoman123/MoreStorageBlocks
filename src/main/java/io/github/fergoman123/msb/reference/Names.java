 /*
  * More Storage Blocks
  * Copyright (c) 2014 fergoman123.
  * All rights reserved. This program and the accompanying materials
  * are made available under the terms of the GNU Lesser Public License v2.1
  * which accompanies this distribution, and is available at
  * http://www.gnu.org/licenses/gpl-3.0.html
  */

package io.github.fergoman123.msb.reference;

public class Names
{
    public static final OreDict od = new OreDict();
    public static final Blocks blocks = new Blocks();
    public static final Locale locale = new Locale();

    public static final class BlocksUtil
    {
        public static final String[] blockNames =
                {
                  blocks.blockApple, blocks.blockArrow, blocks.blockBlazeRod, blocks.blockBook,
                  blocks.blockCarrot, blocks.blockCharcoal, blocks.blockEgg, blocks.blockEnderPearl,
                  blocks.blockEnderEye, blocks.blockGunpowder, blocks.blockNetherWart, blocks.blockPotato,
                  blocks.blockRottenFlesh, blocks.blockSlimeball, blocks.blockFireball, blocks.blockLead,
                  blocks.blockLeather, blocks.blockBucket, blocks.blockStick, blocks.blockFlint, blocks.blockBone,
                  blocks.blockSugarcane, blocks.blockSugar, blocks.blockNetherStar, blocks.blockClay, blocks.blockString,
                  blocks.blockFeather, blocks.blockBread, blocks.blockCookie, blocks.blockPumpkinPie, blocks.blockGhastTear
                };

        public static final String[] blockNamesItemStack =
                {
                  blocks.blockDyeName, blocks.blockGoldAppleName, blocks.blockSeedsName,
                  blocks.blockPorkchopName, blocks.blockBeefName, blocks.blockSkull
                };
    }

    public static final class Blocks
    {
        public static final String blockCharcoal = "blockCharcoal";
        public static final String blockApple = "blockApple";
        public static final String blockGoldAppleName = "blockGA";
        public static final String[] blockGoldApple = {"blockGoldApple1", "blockGoldApple2"};
        public static final String blockBook = "blockBook";
        public static final String blockEgg = "blockEgg";
        public static final String blockEnderPearl = "blockEnderPearl";
        public static final String blockEnderEye = "blockEnderEye";
        public static final String blockLead = "blockLead";
        public static final String blockReed = "blockReed";
        public static final String blockSeedsName = "blockSeeds";
        public static final String[] blockSeeds = {"blockWheatSeeds", "blockPumpkinSeeds", "blockMelonSeeds"};
        public static final String blockStick = "blockStick";
        public static final String blockLeather = "blockLeather";
        public static final String blockBucket = "blockBucket";
        public static final String blockDyeName = "blockDye";
        public static final String[] blockDye = {"blockInkSack", "blockRoseRed", "blockCactusGreen", "blockCocoa", "blockBlueDye", "blockPurpleDye", "blockCyanDye", "blockSilverDye", "blockGrayDye", "blockPinkDye", "blockLimeDye", "blockYellowDye", "blockLightBlueDye", "blockMagentaDye", "blockOrangeDye", "blockWhiteDye"};
        public static final String blockFireball = "blockFireball";
        public static final String blockSlimeball = "blockSlimeball";
        public static final String blockRottenFlesh = "blockRottenFlesh";
        public static final String blockPotato = "blockPotato";
        public static final String blockNetherWart = "blockNetherWart";
        public static final String blockGunpowder = "blockGunpowder";
        public static final String blockCarrot = "blockCarrot";
        public static final String blockArrow = "blockArrow";
        public static final String blockBlazeRod = "blockBlazeRod";
        public static final String blockFlint = "blockFlint";
        public static final String blockBone = "blockBone";
        public static final String blockSugarcane = "blockSugarcane";
        public static final String blockSugar = "blockSugar";
        public static final String blockNetherStar = "blockNetherStar";
        public static final String blockClay = "blockClay";
        public static final String blockString = "blockString";
        public static final String blockFeather = "blockFeather";
        public static final String blockBread = "blockBread";
        public static final String blockPorkchopName = "blockPorkchop";
        public static final String[] blockPorkchop = {"blockRawPorkchop", "blockCookedPorkchop"};
        public static final String blockFishName = "blockFish";
        public static final String[] blockFish = {"blockRawFish", "blockRawSalmon", "blockClownfish", "blockPufferfish", "blockCookedFish", "blockCookedSalmon"};
        public static final String blockCookie = "blockCookie";
        public static final String blockBeefName = "blockBeef";
        public static final String[] blockBeef = {"blockRawBeef", "blockCookedBeef"};
        public static final String blockPumpkinPie = "blockPumpkinPie";
        public static final String blockGhastTear = "blockGhastTear";
        public static final String blockSkull = "blockSkull";
    }

    public static final class Locale
    {
        public static final String tabMSB = "tabMSB";
        public static final String tabMSBTranslated = Reference.textureLoc + tabMSB;
    }

    public static final class OreDict
    {
        public static final String oreDict = "oreDict.";

        public static final String oreDictName = oreDict + "name";

        public static final String blockApple = oreDict + Blocks.blockApple;
        public static final String blockArrow = oreDict + Blocks.blockArrow;
        public static final String blockGA = oreDict + Blocks.blockGoldAppleName;
        public static final String blockBook = oreDict + Blocks.blockBook;
        public static final String blockEgg = oreDict + Blocks.blockEgg;
        public static final String blockEnderPearl = oreDict + Blocks.blockEnderPearl;
        public static final String blockEnderEye = oreDict + Blocks.blockEnderEye;
        public static final String blockLead = oreDict + Blocks.blockLead;
        public static final String blockReed = oreDict +  Blocks.blockReed;
        public static final String blockSeeds = oreDict + Blocks.blockSeedsName;
        public static final String blockStick = oreDict + Blocks.blockStick;
        public static final String blockLeather = oreDict + Blocks.blockLeather;
        public static final String blockBucket = oreDict + Blocks.blockBucket;
        public static final String blockDye = oreDict + Blocks.blockDyeName;
        public static final String blockFireball = oreDict + Blocks.blockFireball;
        public static final String blockSlimeball = oreDict + Blocks.blockSlimeball;
        public static final String blockRottenFlesh = oreDict + Blocks.blockRottenFlesh;
        public static final String blockPotato = oreDict + Blocks.blockPotato;
        public static final String blockNetherWart = oreDict + Blocks.blockNetherWart;
        public static final String blockGunpowder = oreDict + Blocks.blockGunpowder;
        public static final String blockCarrot = oreDict + Blocks.blockCarrot;
        public static final String blockBlazeRod = oreDict + Blocks.blockBlazeRod;
        public static final String blockFlint = oreDict + Blocks.blockFlint;
        public static final String blockCharcoal = oreDict + Blocks.blockCharcoal;
        public static final String blockBone = oreDict + Blocks.blockBone;
        public static final String blockSugarcane = oreDict + Blocks.blockSugarcane;
        public static final String blockSugar = oreDict + Blocks.blockSugar;
        public static final String blockNetherStar = oreDict + Blocks.blockNetherStar;
        public static final String blockClay = oreDict + Blocks.blockClay;
        public static final String blockString = oreDict + Blocks.blockString;
        public static final String blockFeather = oreDict + Blocks.blockFeather;
        public static final String blockBread = oreDict + Blocks.blockBread;
        public static final String blockPorkchop = oreDict + Blocks.blockPorkchopName;
        public static final String blockFish = oreDict + Blocks.blockFishName;
        public static final String blockCookie = oreDict + Blocks.blockCookie;
        public static final String blockBeef = oreDict + Blocks.blockBeefName;
        public static final String blockPumpkinPie = oreDict + Blocks.blockPumpkinPie;
        public static final String blockGhastTear = oreDict + Blocks.blockGhastTear;
        public static final String blockSkull = oreDict + Blocks.blockSkull;
    }
}
