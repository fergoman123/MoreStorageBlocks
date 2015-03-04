package io.github.fergoman123.msb.init;

import io.github.fergoman123.fergoutil.helper.RegisterHelper;
import io.github.fergoman123.msb.api.BlockMSB;
import io.github.fergoman123.msb.common.blocks.*;
import io.github.fergoman123.msb.common.itemblocks.*;
import io.github.fergoman123.msb.info.BlockNames;
import io.github.fergoman123.msb.info.ModInfo;
import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;

public class ModBlocks
{
    public static Block blockCharcoal;
    public static Block blockApple;
    public static Block blockGoldApple;
    public static Block blockBook;
    public static Block blockEgg;
    public static Block blockEnderPearl;
    public static Block blockEnderEye;
    public static Block blockLead;
    public static Block blockReed;
    public static Block blockSeeds;
    public static Block blockStick;
    public static Block blockLeather;
    public static Block blockBucket;
    public static Block blockDye;
    public static Block blockFireball;
    public static Block blockSlimeball;
    public static Block blockRottenFlesh;
    public static Block blockPotato;
    public static Block blockNetherWart;
    public static Block blockGunpowder;
    public static Block blockCarrot;
    public static Block blockArrow;
    public static Block blockBlazeRod;
    public static Block blockFlint;
    public static Block blockBone;
    public static Block blockSugar;
    public static Block blockNetherStar;
    public static Block blockClay;
    public static Block blockString;
    public static Block blockFeather;
    public static Block blockBread;
    public static Block blockPorkchop;
    public static Block blockFish;
    public static Block blockCookie;
    public static Block blockBeef;
    public static Block blockPumpkinPie;
    public static Block blockGhastTear;
    public static Block blockSkull;

    public static void init()
    {
        blockCharcoal = new BlockMSB(BlockNames.blockCharcoal);
        blockApple = new BlockMSB(BlockNames.blockApple);
        blockGoldApple = new BlockGoldApple();
        blockBook = new BlockMSB(BlockNames.blockBook);
        blockEgg = new BlockMSB(BlockNames.blockEgg);
        blockEnderPearl = new BlockMSB(BlockNames.blockEnderPearl);
        blockEnderEye = new BlockMSB(BlockNames.blockEnderEye);
        blockLead = new BlockMSB(BlockNames.blockLead);
        blockReed = new BlockMSB(BlockNames.blockReed);
        blockSeeds = new BlockSeeds();
        blockStick = new BlockMSB(BlockNames.blockStick);
        blockLeather = new BlockMSB(BlockNames.blockLeather);
        blockBucket = new BlockMSB(BlockNames.blockBucket);
        blockDye = new BlockDye();
        blockFireball = new BlockMSB(BlockNames.blockFireball);
        blockSlimeball = new BlockMSB(BlockNames.blockSlimeball);
        blockRottenFlesh = new BlockMSB(BlockNames.blockRottenFlesh);
        blockPotato = new BlockMSB(BlockNames.blockPotato);
        blockNetherWart = new BlockMSB(BlockNames.blockNetherWart);
        blockGunpowder = new BlockMSB(BlockNames.blockGunpowder);
        blockCarrot = new BlockMSB(BlockNames.blockCarrot);
        blockArrow = new BlockMSB(BlockNames.blockArrow);
        blockBlazeRod = new BlockMSB(BlockNames.blockBlazeRod);
        blockFlint = new BlockMSB(BlockNames.blockFlint);
        blockBone = new BlockMSB(BlockNames.blockBone);
        blockSugar = new BlockMSB(BlockNames.blockSugar);
        blockNetherStar = new BlockMSB(BlockNames.blockNetherStar);
        blockClay = new BlockMSB(BlockNames.blockClay);
        blockString = new BlockMSB(BlockNames.blockString);
        blockFeather = new BlockMSB(BlockNames.blockFeather);
        blockBread = new BlockMSB(BlockNames.blockBread);
        blockPorkchop = new BlockPorkchop();
        blockFish = new BlockFish();
        blockCookie = new BlockMSB(BlockNames.blockCookie);
        blockBeef = new BlockBeef();
        blockPumpkinPie = new BlockMSB(BlockNames.blockPumpkinPie);
        blockGhastTear = new BlockMSB(BlockNames.blockGhastTear);
        blockSkull = new BlockSkullStorage();
    }

    public static void register()
    {
        registerBlock(blockCharcoal, BlockNames.blockCharcoal);
        registerBlock(blockApple, BlockNames.blockApple);
        registerBlock(blockGoldApple, ItemBlockGoldApple.class, BlockNames.blockGoldAppleName, BlockNames.blockGoldApple);
        registerBlock(blockBook, BlockNames.blockBook);
        registerBlock(blockEgg, BlockNames.blockEgg);
        registerBlock(blockEnderPearl, BlockNames.blockEnderPearl);
        registerBlock(blockEnderEye, BlockNames.blockEnderEye);
        registerBlock(blockLead, BlockNames.blockLead);
        registerBlock(blockReed, BlockNames.blockReed);
        registerBlock(blockSeeds, ItemBlockSeeds.class, BlockNames.blockSeedsName, BlockNames.blockSeeds);
        registerBlock(blockStick, BlockNames.blockStick);
        registerBlock(blockLeather, BlockNames.blockLeather);
        registerBlock(blockBucket, BlockNames.blockBucket);
        registerBlock(blockDye, ItemBlockDye.class, BlockNames.blockDyeName, BlockNames.blockDye);
        registerBlock(blockFireball, BlockNames.blockFireball);
        registerBlock(blockSlimeball, BlockNames.blockSlimeball);
        registerBlock(blockRottenFlesh, BlockNames.blockRottenFlesh);
        registerBlock(blockPotato, BlockNames.blockPotato);
        registerBlock(blockNetherWart, BlockNames.blockNetherWart);
        registerBlock(blockGunpowder, BlockNames.blockGunpowder);
        registerBlock(blockCarrot, BlockNames.blockCarrot);
        registerBlock(blockArrow, BlockNames.blockArrow);
        registerBlock(blockBlazeRod, BlockNames.blockBlazeRod);
        registerBlock(blockFlint, BlockNames.blockFlint);
        registerBlock(blockBone, BlockNames.blockBone);
        registerBlock(blockSugar, BlockNames.blockSugar);
        registerBlock(blockNetherStar, BlockNames.blockNetherStar);
        registerBlock(blockClay, BlockNames.blockClay);
        registerBlock(blockString, BlockNames.blockString);
        registerBlock(blockFeather, BlockNames.blockFeather);
        registerBlock(blockBread, BlockNames.blockBread);
        registerBlock(blockPorkchop, ItemBlockPorkchop.class, BlockNames.blockPorkchopName, BlockNames.blockPorkchop);
        registerBlock(blockFish, ItemBlockFish.class, BlockNames.blockFishName, BlockNames.blockFish);
        registerBlock(blockCookie, BlockNames.blockCookie);
        registerBlock(blockBeef, ItemBlockBeef.class, BlockNames.blockBeefName, BlockNames.blockBeef);
        registerBlock(blockPumpkinPie, BlockNames.blockPumpkinPie);
        registerBlock(blockGhastTear, BlockNames.blockGhastTear);
        registerBlock(blockSkull, ItemBlockSkull.class, BlockNames.blockSkullName, BlockNames.blockSkull);
    }

    public static void registerBlock(Block block, Class<? extends ItemBlock> itemBlock, String name)
    {
        RegisterHelper.registerBlock(block, itemBlock, ModInfo.modid, name);
    }

    public static void registerBlock(Block block, String name)
    {
        RegisterHelper.registerBlock(block, ModInfo.modid, name);
    }

    public static void registerBlock(Block block, Class<? extends ItemBlock> itemBlock, String name, String[] modelNames)
    {
        RegisterHelper.registerBlock(block, itemBlock, ModInfo.modid, name, modelNames);
    }
}
