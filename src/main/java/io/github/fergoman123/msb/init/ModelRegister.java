package io.github.fergoman123.msb.init;

import io.github.fergoman123.fergoutil.helper.RegisterHelper;
import io.github.fergoman123.msb.api.ModelEntryMSB;
import io.github.fergoman123.msb.info.BlockNames;
import net.minecraft.block.Block;

public class ModelRegister {

    public static void registerModels() {
        registerModel(ModBlocks.blockCharcoal, BlockNames.blockCharcoal);
        registerModel(ModBlocks.blockApple, BlockNames.blockApple);
        registerModel(ModBlocks.blockGoldApple, BlockNames.blockGoldApple);
        registerModel(ModBlocks.blockBook, BlockNames.blockBook);
        registerModel(ModBlocks.blockEgg, BlockNames.blockEgg);
        registerModel(ModBlocks.blockEnderPearl, BlockNames.blockEnderPearl);
        registerModel(ModBlocks.blockEnderEye, BlockNames.blockEnderEye);
        registerModel(ModBlocks.blockLead, BlockNames.blockLead);
        registerModel(ModBlocks.blockReed, BlockNames.blockReed);
        registerModel(ModBlocks.blockSeeds, BlockNames.blockSeeds);
        registerModel(ModBlocks.blockStick, BlockNames.blockStick);
        registerModel(ModBlocks.blockLeather, BlockNames.blockLeather);
        registerModel(ModBlocks.blockBucket, BlockNames.blockBucket);
        registerModel(ModBlocks.blockDye, BlockNames.blockDye);
        registerModel(ModBlocks.blockFireball, BlockNames.blockFireball);
        registerModel(ModBlocks.blockSlimeball, BlockNames.blockSlimeball);
        registerModel(ModBlocks.blockRottenFlesh, BlockNames.blockRottenFlesh);
        registerModel(ModBlocks.blockPotato, BlockNames.blockPotato);
        registerModel(ModBlocks.blockNetherWart, BlockNames.blockNetherWart);
        registerModel(ModBlocks.blockGunpowder, BlockNames.blockGunpowder);
        registerModel(ModBlocks.blockCarrot, BlockNames.blockCarrot);
        registerModel(ModBlocks.blockArrow, BlockNames.blockArrow);
        registerModel(ModBlocks.blockBlazeRod, BlockNames.blockBlazeRod);
        registerModel(ModBlocks.blockFlint, BlockNames.blockFlint);
        registerModel(ModBlocks.blockBone, BlockNames.blockBone);
        registerModel(ModBlocks.blockSugar, BlockNames.blockSugar);
        registerModel(ModBlocks.blockNetherStar, BlockNames.blockNetherStar);
        registerModel(ModBlocks.blockClay, BlockNames.blockClay);
        registerModel(ModBlocks.blockString, BlockNames.blockString);
        registerModel(ModBlocks.blockFeather, BlockNames.blockFeather);
        registerModel(ModBlocks.blockBread, BlockNames.blockBread);
        registerModel(ModBlocks.blockPorkchop, BlockNames.blockPorkchop);
        registerModel(ModBlocks.blockFish, BlockNames.blockFish);
        registerModel(ModBlocks.blockCookie, BlockNames.blockCookie);
        registerModel(ModBlocks.blockBeef, BlockNames.blockBeef);
        registerModel(ModBlocks.blockPumpkinPie, BlockNames.blockPumpkinPie);
        registerModel(ModBlocks.blockGhastTear, BlockNames.blockGhastTear);
        registerModel(ModBlocks.blockSkull, BlockNames.blockSkull);
        registerModel(ModBlocks.blockMutton, BlockNames.blockMutton);
        registerModel(ModBlocks.blockRabbit, BlockNames.blockRabbit);
    }

    private static void registerModel(Block block, String modelName) {
        RegisterHelper.registerModel(new ModelEntryMSB(block, modelName));
    }

    public static void registerModel(Block block, String[] modelNames) {
        ModelEntryMSB[] models = new ModelEntryMSB[modelNames.length];
        for (int i = 0; i < models.length; i++) {
            models[i] = new ModelEntryMSB(block, i, modelNames[i]);
            RegisterHelper.registerModel(models[i]);
        }
    }
}
