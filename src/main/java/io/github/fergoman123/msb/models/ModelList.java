package io.github.fergoman123.msb.models;

import io.github.fergoman123.fergoutil.model.BlockModel;
import io.github.fergoman123.msb.info.BlockNames;
import io.github.fergoman123.msb.info.ModInfo;
import io.github.fergoman123.msb.init.ModBlocks;
import net.minecraft.block.Block;

public class ModelList
{
    public static final BlockModel blockCharcoal = getBlockModel(ModBlocks.blockCharcoal, BlockNames.blockCharcoal);
    public static final BlockModel blockApple = getBlockModel(ModBlocks.blockApple, BlockNames.blockApple);
    public static final BlockModel[] blockGoldApple = getBlockModelArray(ModBlocks.blockGoldApple, BlockNames.blockGoldApple);
    public static final BlockModel blockBook = getBlockModel(ModBlocks.blockBook, BlockNames.blockBook);
    public static final BlockModel blockEgg = getBlockModel(ModBlocks.blockEgg, BlockNames.blockEgg);
    public static final BlockModel blockEnderPearl = getBlockModel(ModBlocks.blockEnderPearl, BlockNames.blockEnderPearl);
    public static final BlockModel blockEnderEye = getBlockModel(ModBlocks.blockEnderEye, BlockNames.blockEnderEye);
    public static final BlockModel blockLead = getBlockModel(ModBlocks.blockLead, BlockNames.blockLead);
    public static final BlockModel blockReed = getBlockModel(ModBlocks.blockReed, BlockNames.blockReed);
    public static final BlockModel[] blockSeeds = getBlockModelArray(ModBlocks.blockSeeds, BlockNames.blockSeeds);
    public static final BlockModel blockStick = getBlockModel(ModBlocks.blockStick, BlockNames.blockStick);
    public static final BlockModel blockLeather = getBlockModel(ModBlocks.blockLeather, BlockNames.blockLeather);
    public static final BlockModel blockBucket = getBlockModel(ModBlocks.blockBucket, BlockNames.blockBucket);
    public static final BlockModel[] blockDye = getBlockModelArray(ModBlocks.blockDye, BlockNames.blockDye);
    public static final BlockModel blockFireball = getBlockModel(ModBlocks.blockFireball, BlockNames.blockFireball);
    public static final BlockModel blockSlimeball = getBlockModel(ModBlocks.blockSlimeball, BlockNames.blockSlimeball);
    public static final BlockModel blockRottenFlesh = getBlockModel(ModBlocks.blockRottenFlesh, BlockNames.blockRottenFlesh);
    public static final BlockModel blockPotato = getBlockModel(ModBlocks.blockPotato, BlockNames.blockPotato);
    public static final BlockModel blockNetherWart = getBlockModel(ModBlocks.blockNetherWart, BlockNames.blockNetherWart);
    public static final BlockModel blockGunpowder = getBlockModel(ModBlocks.blockGunpowder, BlockNames.blockGunpowder);
    public static final BlockModel blockCarrot = getBlockModel(ModBlocks.blockCarrot, BlockNames.blockCarrot);
    public static final BlockModel blockArrow = getBlockModel(ModBlocks.blockArrow, BlockNames.blockArrow);
    public static final BlockModel blockBlazeRod = getBlockModel(ModBlocks.blockBlazeRod, BlockNames.blockBlazeRod);
    public static final BlockModel blockFlint = getBlockModel(ModBlocks.blockFlint, BlockNames.blockFlint);
    public static final BlockModel blockBone = getBlockModel(ModBlocks.blockBone, BlockNames.blockBone);
    public static final BlockModel blockSugar = getBlockModel(ModBlocks.blockSugar, BlockNames.blockSugar);
    public static final BlockModel blockNetherStar = getBlockModel(ModBlocks.blockNetherStar, BlockNames.blockNetherStar);
    public static final BlockModel blockClay = getBlockModel(ModBlocks.blockClay, BlockNames.blockClay);
    public static final BlockModel blockString = getBlockModel(ModBlocks.blockString, BlockNames.blockString);
    public static final BlockModel blockFeather = getBlockModel(ModBlocks.blockFeather, BlockNames.blockFeather);
    public static final BlockModel blockBread = getBlockModel(ModBlocks.blockBread, BlockNames.blockBread);
    public static final BlockModel[] blockPorkchop = getBlockModelArray(ModBlocks.blockPorkchop, BlockNames.blockPorkchop);
    public static final BlockModel[] blockFish = getBlockModelArray(ModBlocks.blockFish, BlockNames.blockFish);
    public static final BlockModel blockCookie = getBlockModel(ModBlocks.blockCookie, BlockNames.blockCookie);
    public static final BlockModel[] blockBeef = getBlockModelArray(ModBlocks.blockBeef, BlockNames.blockBeef);
    public static final BlockModel blockPumpkinPie = getBlockModel(ModBlocks.blockPumpkinPie, BlockNames.blockPumpkinPie);
    public static final BlockModel blockGhastTear = getBlockModel(ModBlocks.blockGhastTear, BlockNames.blockGhastTear);
    public static final BlockModel[] blockSkull = getBlockModelArray(ModBlocks.blockSkull, BlockNames.blockSkull);

    public static BlockModel getBlockModel(Block block, int meta, String name)
    {
        return new BlockModel(block, meta, ModInfo.modid.toLowerCase() + ":" + name);
    }

    public static BlockModel getBlockModel(Block block, String name)
    {
        return new BlockModel(block, ModInfo.modid.toLowerCase() + ":" + name);
    }

    public static BlockModel[] getBlockModelArray(Block block, String[] names)
    {
        BlockModel[] blockModels = new BlockModel[names.length];
        for (int i = 0; i < blockModels.length; i++)
        {
            blockModels[i] = getBlockModel(block, i, names[i]);
        }
        return blockModels;
    }
}
