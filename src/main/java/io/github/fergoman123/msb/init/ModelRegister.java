package io.github.fergoman123.msb.init;

import io.github.fergoman123.fergoutil.helper.RegisterHelper;
import io.github.fergoman123.msb.info.BlockNames;
import io.github.fergoman123.msb.info.ModInfo;
import net.minecraft.block.Block;

public class ModelRegister
{
    public static void register(){
        registerModels();
        addVariants();
    }

    private static void registerModels(){
        RegisterHelper.registerModel(ModBlocks.blockCharcoal, BlockNames.blockCharcoal);
        RegisterHelper.registerModel(ModBlocks.blockApple, BlockNames.blockApple);
        RegisterHelper.registerModel(ModBlocks.blockGoldApple, 0, BlockNames.blockGoldApple[0]);
        RegisterHelper.registerModel(ModBlocks.blockGoldApple, 1, BlockNames.blockGoldApple[1]);
        RegisterHelper.registerModel(ModBlocks.blockBook, BlockNames.blockBook);
        RegisterHelper.registerModel(ModBlocks.blockEgg, BlockNames.blockEgg);
        RegisterHelper.registerModel(ModBlocks.blockEnderPearl, BlockNames.blockEnderPearl);
        RegisterHelper.registerModel(ModBlocks.blockEnderEye, BlockNames.blockEnderEye);
        RegisterHelper.registerModel(ModBlocks.blockLead, BlockNames.blockLead);
        RegisterHelper.registerModel(ModBlocks.blockReed, BlockNames.blockReed);
        RegisterHelper.registerModel(ModBlocks.blockSeeds, 0, BlockNames.blockSeeds[0]);
        RegisterHelper.registerModel(ModBlocks.blockSeeds, 1, BlockNames.blockSeeds[1]);
        RegisterHelper.registerModel(ModBlocks.blockSeeds, 2, BlockNames.blockSeeds[2]);
        RegisterHelper.registerModel(ModBlocks.blockStick, BlockNames.blockStick);
        RegisterHelper.registerModel(ModBlocks.blockLeather, BlockNames.blockLeather);
        RegisterHelper.registerModel(ModBlocks.blockBucket, BlockNames.blockBucket);
        RegisterHelper.registerModel(ModBlocks.blockDye, 0, BlockNames.blockDye[0]);
        RegisterHelper.registerModel(ModBlocks.blockDye, 1, BlockNames.blockDye[1]);
        RegisterHelper.registerModel(ModBlocks.blockDye, 2, BlockNames.blockDye[2]);
        RegisterHelper.registerModel(ModBlocks.blockDye, 3, BlockNames.blockDye[3]);
        RegisterHelper.registerModel(ModBlocks.blockDye, 4, BlockNames.blockDye[4]);
        RegisterHelper.registerModel(ModBlocks.blockDye, 5, BlockNames.blockDye[5]);
        RegisterHelper.registerModel(ModBlocks.blockDye, 6, BlockNames.blockDye[6]);
        RegisterHelper.registerModel(ModBlocks.blockDye, 7, BlockNames.blockDye[7]);
        RegisterHelper.registerModel(ModBlocks.blockDye, 8, BlockNames.blockDye[8]);
        RegisterHelper.registerModel(ModBlocks.blockDye, 9, BlockNames.blockDye[9]);
        RegisterHelper.registerModel(ModBlocks.blockDye, 10, BlockNames.blockDye[10]);
        RegisterHelper.registerModel(ModBlocks.blockDye, 11, BlockNames.blockDye[11]);
        RegisterHelper.registerModel(ModBlocks.blockDye, 12, BlockNames.blockDye[12]);
        RegisterHelper.registerModel(ModBlocks.blockDye, 13, BlockNames.blockDye[13]);
        RegisterHelper.registerModel(ModBlocks.blockDye, 14, BlockNames.blockDye[14]);
        RegisterHelper.registerModel(ModBlocks.blockFireball, BlockNames.blockFireball);
        RegisterHelper.registerModel(ModBlocks.blockSlimeball, BlockNames.blockSlimeball);
        RegisterHelper.registerModel(ModBlocks.blockRottenFlesh, BlockNames.blockRottenFlesh);
        RegisterHelper.registerModel(ModBlocks.blockPotato, BlockNames.blockPotato);
        RegisterHelper.registerModel(ModBlocks.blockNetherWart, BlockNames.blockNetherWart);
        RegisterHelper.registerModel(ModBlocks.blockGunpowder, BlockNames.blockGunpowder);
        RegisterHelper.registerModel(ModBlocks.blockCarrot, BlockNames.blockCarrot);
        RegisterHelper.registerModel(ModBlocks.blockArrow, BlockNames.blockArrow);
        RegisterHelper.registerModel(ModBlocks.blockBlazeRod, BlockNames.blockBlazeRod);
        RegisterHelper.registerModel(ModBlocks.blockFlint, BlockNames.blockFlint);
        RegisterHelper.registerModel(ModBlocks.blockBone, BlockNames.blockBone);
        RegisterHelper.registerModel(ModBlocks.blockSugar, BlockNames.blockSugar);
        RegisterHelper.registerModel(ModBlocks.blockNetherStar, BlockNames.blockNetherStar);
        RegisterHelper.registerModel(ModBlocks.blockClay, BlockNames.blockClay);
        RegisterHelper.registerModel(ModBlocks.blockString, BlockNames.blockString);
        RegisterHelper.registerModel(ModBlocks.blockFeather, BlockNames.blockFeather);
        RegisterHelper.registerModel(ModBlocks.blockBread, BlockNames.blockBread);
        RegisterHelper.registerModel(ModBlocks.blockPorkchop, 0, BlockNames.blockPorkchop[0]);
        RegisterHelper.registerModel(ModBlocks.blockPorkchop, 1, BlockNames.blockPorkchop[1]);
        RegisterHelper.registerModel(ModBlocks.blockFish, 0, BlockNames.blockFish[0]);
        RegisterHelper.registerModel(ModBlocks.blockFish, 1, BlockNames.blockFish[1]);
        RegisterHelper.registerModel(ModBlocks.blockFish, 2, BlockNames.blockFish[2]);
        RegisterHelper.registerModel(ModBlocks.blockFish, 3, BlockNames.blockFish[3]);
        RegisterHelper.registerModel(ModBlocks.blockFish, 4, BlockNames.blockFish[4]);
        RegisterHelper.registerModel(ModBlocks.blockFish, 5, BlockNames.blockFish[5]);
        RegisterHelper.registerModel(ModBlocks.blockCookie, BlockNames.blockCookie);
        RegisterHelper.registerModel(ModBlocks.blockBeef, 0, BlockNames.blockBeef[0]);
        RegisterHelper.registerModel(ModBlocks.blockBeef, 1, BlockNames.blockBeef[1]);
        RegisterHelper.registerModel(ModBlocks.blockPumpkinPie, BlockNames.blockPumpkinPie);
        RegisterHelper.registerModel(ModBlocks.blockGhastTear, BlockNames.blockGhastTear);
        RegisterHelper.registerModel(ModBlocks.blockSkull, 0, BlockNames.blockSkull[0]);
        RegisterHelper.registerModel(ModBlocks.blockSkull, 1, BlockNames.blockSkull[1]);
        RegisterHelper.registerModel(ModBlocks.blockSkull, 2, BlockNames.blockSkull[2]);
        RegisterHelper.registerModel(ModBlocks.blockSkull, 3, BlockNames.blockSkull[3]);
        RegisterHelper.registerModel(ModBlocks.blockMutton, 0, BlockNames.blockMutton[0]);
        RegisterHelper.registerModel(ModBlocks.blockMutton, 1, BlockNames.blockMutton[1]);
        RegisterHelper.registerModel(ModBlocks.blockRabbit, 0, BlockNames.blockRabbit[0]);
        RegisterHelper.registerModel(ModBlocks.blockRabbit, 1, BlockNames.blockRabbit[1]);
    }

    private static void addVariants(){
        RegisterHelper.addVariantName(ModBlocks.blockCharcoal, BlockNames.blockCharcoal);
        RegisterHelper.addVariantName(ModBlocks.blockApple, BlockNames.blockApple);
        RegisterHelper.addVariantName(ModBlocks.blockGoldApple, BlockNames.blockGoldApple);
        RegisterHelper.addVariantName(ModBlocks.blockBook, BlockNames.blockBook);
        RegisterHelper.addVariantName(ModBlocks.blockEgg, BlockNames.blockEgg);
        RegisterHelper.addVariantName(ModBlocks.blockEnderPearl, BlockNames.blockEnderPearl);
        RegisterHelper.addVariantName(ModBlocks.blockEnderEye, BlockNames.blockEnderEye);
        RegisterHelper.addVariantName(ModBlocks.blockLead, BlockNames.blockLead);
        RegisterHelper.addVariantName(ModBlocks.blockReed, BlockNames.blockReed);
        RegisterHelper.addVariantName(ModBlocks.blockSeeds, BlockNames.blockSeeds);
        RegisterHelper.addVariantName(ModBlocks.blockStick, BlockNames.blockStick);
        RegisterHelper.addVariantName(ModBlocks.blockLeather, BlockNames.blockLeather);
        RegisterHelper.addVariantName(ModBlocks.blockBucket, BlockNames.blockBucket);
        RegisterHelper.addVariantName(ModBlocks.blockDye, BlockNames.blockDye);
        RegisterHelper.addVariantName(ModBlocks.blockFireball, BlockNames.blockFireball);
        RegisterHelper.addVariantName(ModBlocks.blockSlimeball, BlockNames.blockSlimeball);
        RegisterHelper.addVariantName(ModBlocks.blockRottenFlesh, BlockNames.blockRottenFlesh);
        RegisterHelper.addVariantName(ModBlocks.blockPotato, BlockNames.blockPotato);
        RegisterHelper.addVariantName(ModBlocks.blockNetherWart, BlockNames.blockNetherWart);
        RegisterHelper.addVariantName(ModBlocks.blockGunpowder, BlockNames.blockGunpowder);
        RegisterHelper.addVariantName(ModBlocks.blockCarrot, BlockNames.blockCarrot);
        RegisterHelper.addVariantName(ModBlocks.blockArrow, BlockNames.blockArrow);
        RegisterHelper.addVariantName(ModBlocks.blockBlazeRod, BlockNames.blockBlazeRod);
        RegisterHelper.addVariantName(ModBlocks.blockFlint, BlockNames.blockFlint);
        RegisterHelper.addVariantName(ModBlocks.blockBone, BlockNames.blockBone);
        RegisterHelper.addVariantName(ModBlocks.blockSugar, BlockNames.blockSugar);
        RegisterHelper.addVariantName(ModBlocks.blockNetherStar, BlockNames.blockNetherStar);
        RegisterHelper.addVariantName(ModBlocks.blockClay, BlockNames.blockClay);
        RegisterHelper.addVariantName(ModBlocks.blockString, BlockNames.blockString);
        RegisterHelper.addVariantName(ModBlocks.blockFeather, BlockNames.blockFeather);
        RegisterHelper.addVariantName(ModBlocks.blockBread, BlockNames.blockBread);
        RegisterHelper.addVariantName(ModBlocks.blockPorkchop, BlockNames.blockPorkchop);
        RegisterHelper.addVariantName(ModBlocks.blockFish, BlockNames.blockFish);
        RegisterHelper.addVariantName(ModBlocks.blockCookie, BlockNames.blockCookie);
        RegisterHelper.addVariantName(ModBlocks.blockBeef, BlockNames.blockBeef);
        RegisterHelper.addVariantName(ModBlocks.blockPumpkinPie, BlockNames.blockPumpkinPie);
        RegisterHelper.addVariantName(ModBlocks.blockGhastTear, BlockNames.blockGhastTear);
        RegisterHelper.addVariantName(ModBlocks.blockSkull, BlockNames.blockSkull);
        RegisterHelper.addVariantName(ModBlocks.blockMutton, BlockNames.blockMutton);
        RegisterHelper.addVariantName(ModBlocks.blockRabbit, BlockNames.blockRabbit);
    }

    private static void registerModel(Block block, int meta, String name)
    {
        RegisterHelper.registerModel(block, meta, ModInfo.modid.toLowerCase() + ":" + name);
    }

    private static void registerModel(Block block, String name){
        RegisterHelper.registerModel(block, ModInfo.modid.toLowerCase() + ":" + name);
    }

    public static void addVariantName()
}
