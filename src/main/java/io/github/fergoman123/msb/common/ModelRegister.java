package io.github.fergoman123.msb.common;

import io.github.fergoman123.fergoutil.model.ModelHelper;
import io.github.fergoman123.msb.models.ModelList;
import io.github.fergoman123.msb.models.ModelVariants;

public class ModelRegister
{
    public static void registerModels()
    {
        registerModel(ModelList.blockCharcoal);
        registerModel(ModelList.blockApple);
        registerModelArray(ModelList.blockGoldApple);
        registerModel(ModelList.blockBook);
        registerModel(ModelList.blockEgg);
        registerModel(ModelList.blockEnderPearl);
        registerModel(ModelList.blockEnderEye);
        registerModel(ModelList.blockLead);
        registerModel(ModelList.blockReed);
        registerModelArray(ModelList.blockSeeds);
        registerModel(ModelList.blockStick);
        registerModel(ModelList.blockLeather);
        registerModel(ModelList.blockBucket);
        registerModelArray(ModelList.blockDye);
        registerModel(ModelList.blockFireball);
        registerModel(ModelList.blockSlimeball);
        registerModel(ModelList.blockRottenFlesh);
        registerModel(ModelList.blockPotato);
        registerModel(ModelList.blockNetherWart);
        registerModel(ModelList.blockGunpowder);
        registerModel(ModelList.blockCarrot);
        registerModel(ModelList.blockArrow);
        registerModel(ModelList.blockBlazeRod);
        registerModel(ModelList.blockFlint);
        registerModel(ModelList.blockBone);
        registerModel(ModelList.blockSugar);
        registerModel(ModelList.blockNetherStar);
        registerModel(ModelList.blockClay);
        registerModel(ModelList.blockString);
        registerModel(ModelList.blockFeather);
        registerModel(ModelList.blockBread);
        registerModelArray(ModelList.blockPorkchop);
        registerModelArray(ModelList.blockFish);
        registerModel(ModelList.blockCookie);
        registerModelArray(ModelList.blockBeef);
        registerModel(ModelList.blockPumpkinPie);
        registerModel(ModelList.blockGhastTear);
        registerModelArray(ModelList.blockSkull);
        registerModelArray(ModelList.blockMutton);
        registerModelArray(ModelList.blockRabbit);
    }

    public static void registerVariants()
    {
        registerVariant(ModelVariants.blockCharcoal);
        registerVariant(ModelVariants.blockApple);
        registerVariantArray(ModelVariants.blockGoldApple);
        registerVariant(ModelVariants.blockBook);
        registerVariant(ModelVariants.blockEgg);
        registerVariant(ModelVariants.blockEnderPearl);
        registerVariant(ModelVariants.blockEnderEye);
        registerVariant(ModelVariants.blockLead);
        registerVariant(ModelVariants.blockReed);
        registerVariantArray(ModelVariants.blockSeeds);
        registerVariant(ModelVariants.blockStick);
        registerVariant(ModelVariants.blockLeather);
        registerVariant(ModelVariants.blockBucket);
        registerVariantArray(ModelVariants.blockDye);
        registerVariant(ModelVariants.blockFireball);
        registerVariant(ModelVariants.blockSlimeball);
        registerVariant(ModelVariants.blockRottenFlesh);
        registerVariant(ModelVariants.blockPotato);
        registerVariant(ModelVariants.blockNetherWart);
        registerVariant(ModelVariants.blockGunpowder);
        registerVariant(ModelVariants.blockCarrot);
        registerVariant(ModelVariants.blockArrow);
        registerVariant(ModelVariants.blockBlazeRod);
        registerVariant(ModelVariants.blockFlint);
        registerVariant(ModelVariants.blockBone);
        registerVariant(ModelVariants.blockSugar);
        registerVariant(ModelVariants.blockNetherStar);
        registerVariant(ModelVariants.blockClay);
        registerVariant(ModelVariants.blockString);
        registerVariant(ModelVariants.blockFeather);
        registerVariant(ModelVariants.blockBread);
        registerVariantArray(ModelVariants.blockPorkchop);
        registerVariantArray(ModelVariants.blockFish);
        registerVariant(ModelVariants.blockCookie);
        registerVariantArray(ModelVariants.blockBeef);
        registerVariant(ModelVariants.blockPumpkinPie);
        registerVariant(ModelVariants.blockGhastTear);
        registerVariantArray(ModelVariants.blockSkull);
        registerVariantArray(ModelVariants.blockMutton);
        registerVariantArray(ModelVariants.blockRabbit);

    }

    public static void registerModel(ModelHelper.BlockModel model)
    {
        ModelHelper.registerBlockModel(model);
    }

    public static void registerModelArray(ModelHelper.BlockModel[] models)
    {
        for(ModelHelper.BlockModel model : models)
        {
            ModelHelper.registerBlockModel(model);
        }
    }

    public static void registerVariant(ModelHelper.BlockVariant variant)
    {
        ModelHelper.addBlockVariant(variant);
    }

    public static void registerVariantArray(ModelHelper.BlockVariant[] variants)
    {
        for(ModelHelper.BlockVariant variant : variants)
        {
            ModelHelper.addBlockVariant(variant);
        }
    }
}
