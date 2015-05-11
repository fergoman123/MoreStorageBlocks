package io.github.fergoman123.msb.models;

import io.github.fergoman123.fergoutil.model.ModelHelper.BlockModel;
import io.github.fergoman123.msb.api.ModelResLocMSB;
import io.github.fergoman123.msb.info.Assets.Models;
import io.github.fergoman123.msb.init.ModBlocks;
import net.minecraft.block.Block;

public class ModelList
{
    public static final BlockModel blockCharcoal = getModel(ModBlocks.blockCharcoal, Models.blockCharcoal);
    public static final BlockModel blockApple = getModel(ModBlocks.blockApple, Models.blockApple);
    public static final BlockModel[] blockGoldApple = getModelArray(ModBlocks.blockGoldApple, Models.blockGoldApple);
    public static final BlockModel blockBook = getModel(ModBlocks.blockBook, Models.blockBook);
    public static final BlockModel blockEgg = getModel(ModBlocks.blockEgg, Models.blockEgg);
    public static final BlockModel blockEnderPearl = getModel(ModBlocks.blockEnderPearl, Models.blockEnderPearl);
    public static final BlockModel blockEnderEye = getModel(ModBlocks.blockEnderEye, Models.blockEnderEye);
    public static final BlockModel blockLead = getModel(ModBlocks.blockLead, Models.blockLead);
    public static final BlockModel blockReed = getModel(ModBlocks.blockReed, Models.blockReed);
    public static final BlockModel[] blockSeeds = getModelArray(ModBlocks.blockSeeds, Models.blockSeeds);
    public static final BlockModel blockStick = getModel(ModBlocks.blockStick, Models.blockStick);
    public static final BlockModel blockLeather = getModel(ModBlocks.blockLeather, Models.blockLeather);
    public static final BlockModel blockBucket = getModel(ModBlocks.blockBucket, Models.blockBucket);
    public static final BlockModel[] blockDye = getModelArray(ModBlocks.blockDye, Models.blockDye);
    public static final BlockModel blockFireball = getModel(ModBlocks.blockFireball, Models.blockFireball);
    public static final BlockModel blockSlimeball = getModel(ModBlocks.blockSlimeball, Models.blockSlimeball);
    public static final BlockModel blockRottenFlesh = getModel(ModBlocks.blockRottenFlesh, Models.blockRottenFlesh);
    public static final BlockModel blockPotato = getModel(ModBlocks.blockPotato, Models.blockPotato);
    public static final BlockModel blockNetherWart = getModel(ModBlocks.blockNetherWart, Models.blockNetherWart);
    public static final BlockModel blockGunpowder = getModel(ModBlocks.blockGunpowder, Models.blockGunpowder);
    public static final BlockModel blockCarrot = getModel(ModBlocks.blockCarrot, Models.blockCarrot);
    public static final BlockModel blockArrow = getModel(ModBlocks.blockArrow, Models.blockArrow);
    public static final BlockModel blockBlazeRod = getModel(ModBlocks.blockBlazeRod, Models.blockBlazeRod);
    public static final BlockModel blockFlint = getModel(ModBlocks.blockFlint, Models.blockFlint);
    public static final BlockModel blockBone = getModel(ModBlocks.blockBone, Models.blockBone);
    public static final BlockModel blockSugar = getModel(ModBlocks.blockSugar, Models.blockSugar);
    public static final BlockModel blockNetherStar = getModel(ModBlocks.blockNetherStar, Models.blockNetherStar);
    public static final BlockModel blockClay = getModel(ModBlocks.blockClay, Models.blockClay);
    public static final BlockModel blockString = getModel(ModBlocks.blockString, Models.blockString);
    public static final BlockModel blockFeather = getModel(ModBlocks.blockFeather, Models.blockFeather);
    public static final BlockModel blockBread = getModel(ModBlocks.blockBread, Models.blockBread);
    public static final BlockModel[] blockPorkchop = getModelArray(ModBlocks.blockPorkchop, Models.blockPorkchop);
    public static final BlockModel[] blockFish = getModelArray(ModBlocks.blockFish, Models.blockFish);
    public static final BlockModel blockCookie = getModel(ModBlocks.blockCookie, Models.blockCookie);
    public static final BlockModel[] blockBeef = getModelArray(ModBlocks.blockBeef, Models.blockBeef);
    public static final BlockModel blockPumpkinPie = getModel(ModBlocks.blockPumpkinPie, Models.blockPumpkinPie);
    public static final BlockModel blockGhastTear = getModel(ModBlocks.blockGhastTear, Models.blockGhastTear);
    public static final BlockModel[] blockSkull = getModelArray(ModBlocks.blockSkull, Models.blockSkull);
    public static final BlockModel[] blockMutton = getModelArray(ModBlocks.blockMutton, Models.blockMutton);
    public static final BlockModel[] blockRabbit = getModelArray(ModBlocks.blockRabbit, Models.blockRabbit);

    public static BlockModel getModel(Block block, ModelResLocMSB model)
    {
        return new BlockModel(block, model);
    }

    public static BlockModel[] getModelArray(Block block, ModelResLocMSB[] models)
    {
        BlockModel[] blockModels = new BlockModel[models.length];
        for (int i = 0; i < blockModels.length; i++) {
            blockModels[i] = new BlockModel(block, i, models[i]);
        }
        return blockModels;
    }
}
