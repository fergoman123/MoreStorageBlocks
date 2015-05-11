package io.github.fergoman123.msb.info;

import io.github.fergoman123.msb.api.ModelResLocMSB;

public class Assets
{
    public static final class Models
    {
        public static final ModelResLocMSB blockCharcoal = getModel(BlockNames.blockCharcoal);
        public static final ModelResLocMSB blockApple = getModel(BlockNames.blockApple);
        public static final ModelResLocMSB[] blockGoldApple = getModelArray(BlockNames.blockGoldApple);
        public static final ModelResLocMSB blockBook = getModel(BlockNames.blockBook);
        public static final ModelResLocMSB blockEgg = getModel(BlockNames.blockEgg);
        public static final ModelResLocMSB blockEnderPearl = getModel(BlockNames.blockEnderPearl);
        public static final ModelResLocMSB blockEnderEye = getModel(BlockNames.blockEnderEye);
        public static final ModelResLocMSB blockLead = getModel(BlockNames.blockLead);
        public static final ModelResLocMSB blockReed = getModel(BlockNames.blockReed);
        public static final ModelResLocMSB[] blockSeeds = getModelArray(BlockNames.blockSeeds);
        public static final ModelResLocMSB blockStick = getModel(BlockNames.blockStick);
        public static final ModelResLocMSB blockLeather = getModel(BlockNames.blockLeather);
        public static final ModelResLocMSB blockBucket = getModel(BlockNames.blockBucket);
        public static final ModelResLocMSB[] blockDye = getModelArray(BlockNames.blockDye);
        public static final ModelResLocMSB blockFireball = getModel(BlockNames.blockFireball);
        public static final ModelResLocMSB blockSlimeball = getModel(BlockNames.blockSlimeball);
        public static final ModelResLocMSB blockRottenFlesh = getModel(BlockNames.blockRottenFlesh);
        public static final ModelResLocMSB blockPotato = getModel(BlockNames.blockPotato);
        public static final ModelResLocMSB blockNetherWart = getModel(BlockNames.blockNetherWart);
        public static final ModelResLocMSB blockGunpowder = getModel(BlockNames.blockGunpowder);
        public static final ModelResLocMSB blockCarrot = getModel(BlockNames.blockCarrot);
        public static final ModelResLocMSB blockArrow = getModel(BlockNames.blockArrow);
        public static final ModelResLocMSB blockBlazeRod = getModel(BlockNames.blockBlazeRod);
        public static final ModelResLocMSB blockFlint = getModel(BlockNames.blockFlint);
        public static final ModelResLocMSB blockBone = getModel(BlockNames.blockBone);
        public static final ModelResLocMSB blockSugar = getModel(BlockNames.blockSugar);
        public static final ModelResLocMSB blockNetherStar = getModel(BlockNames.blockNetherStar);
        public static final ModelResLocMSB blockClay = getModel(BlockNames.blockClay);
        public static final ModelResLocMSB blockString = getModel(BlockNames.blockString);
        public static final ModelResLocMSB blockFeather = getModel(BlockNames.blockFeather);
        public static final ModelResLocMSB blockBread = getModel(BlockNames.blockBread);
        public static final ModelResLocMSB[] blockPorkchop = getModelArray(BlockNames.blockPorkchop);
        public static final ModelResLocMSB[] blockFish = getModelArray(BlockNames.blockFish);
        public static final ModelResLocMSB blockCookie = getModel(BlockNames.blockCookie);
        public static final ModelResLocMSB[] blockBeef = getModelArray(BlockNames.blockBeef);
        public static final ModelResLocMSB blockPumpkinPie = getModel(BlockNames.blockPumpkinPie);
        public static final ModelResLocMSB blockGhastTear = getModel(BlockNames.blockGhastTear);
        public static final ModelResLocMSB[] blockSkull = getModelArray(BlockNames.blockSkull);
        public static final ModelResLocMSB[] blockMutton = getModelArray(BlockNames.blockMutton);
        public static final ModelResLocMSB[] blockRabbit = getModelArray(BlockNames.blockRabbit);

        public static ModelResLocMSB getModel(String name)
        {
            return new ModelResLocMSB(name);
        }

        public static ModelResLocMSB[] getModelArray(String[] names)
        {
            ModelResLocMSB[] models = new ModelResLocMSB[names.length];
            for (int i = 0; i < models.length; i++) {
                models[i] = new ModelResLocMSB(names[i]);
            }
            return models;
        }
    }
}
