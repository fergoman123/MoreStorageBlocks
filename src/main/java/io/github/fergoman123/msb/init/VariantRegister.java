package io.github.fergoman123.msb.init;

import io.github.fergoman123.fergoutil.helper.RegisterHelper;
import io.github.fergoman123.msb.api.ModelVariantMSB;
import io.github.fergoman123.msb.info.BlockNames;
import net.minecraft.block.Block;

public class VariantRegister {
    public static void registerVariants(){
        addVariant(ModBlocks.blockCharcoal, BlockNames.blockCharcoal);
        addVariant(ModBlocks.blockApple, BlockNames.blockApple);
        addVariant(ModBlocks.blockGoldApple, BlockNames.blockGoldApple);
        addVariant(ModBlocks.blockBook, BlockNames.blockBook);
        addVariant(ModBlocks.blockEgg, BlockNames.blockEgg);
        addVariant(ModBlocks.blockEnderPearl, BlockNames.blockEnderPearl);
        addVariant(ModBlocks.blockEnderEye, BlockNames.blockEnderEye);
        addVariant(ModBlocks.blockLead, BlockNames.blockLead);
        addVariant(ModBlocks.blockReed, BlockNames.blockReed);
        addVariant(ModBlocks.blockSeeds, BlockNames.blockSeeds);
        addVariant(ModBlocks.blockStick, BlockNames.blockStick);
        addVariant(ModBlocks.blockLeather, BlockNames.blockLeather);
        addVariant(ModBlocks.blockBucket, BlockNames.blockBucket);
        addVariant(ModBlocks.blockDye, BlockNames.blockDye);
        addVariant(ModBlocks.blockFireball, BlockNames.blockFireball);
        addVariant(ModBlocks.blockSlimeball, BlockNames.blockSlimeball);
        addVariant(ModBlocks.blockRottenFlesh, BlockNames.blockRottenFlesh);
        addVariant(ModBlocks.blockPotato, BlockNames.blockPotato);
        addVariant(ModBlocks.blockNetherWart, BlockNames.blockNetherWart);
        addVariant(ModBlocks.blockGunpowder, BlockNames.blockGunpowder);
        addVariant(ModBlocks.blockCarrot, BlockNames.blockCarrot);
        addVariant(ModBlocks.blockArrow, BlockNames.blockArrow);
        addVariant(ModBlocks.blockBlazeRod, BlockNames.blockBlazeRod);
        addVariant(ModBlocks.blockFlint, BlockNames.blockFlint);
        addVariant(ModBlocks.blockBone, BlockNames.blockBone);
        addVariant(ModBlocks.blockSugar, BlockNames.blockSugar);
        addVariant(ModBlocks.blockNetherStar, BlockNames.blockNetherStar);
        addVariant(ModBlocks.blockClay, BlockNames.blockClay);
        addVariant(ModBlocks.blockString, BlockNames.blockString);
        addVariant(ModBlocks.blockFeather, BlockNames.blockFeather);
        addVariant(ModBlocks.blockBread, BlockNames.blockBread);
        addVariant(ModBlocks.blockPorkchop, BlockNames.blockPorkchop);
        addVariant(ModBlocks.blockFish, BlockNames.blockFish);
        addVariant(ModBlocks.blockCookie, BlockNames.blockCookie);
        addVariant(ModBlocks.blockBeef, BlockNames.blockBeef);
        addVariant(ModBlocks.blockPumpkinPie, BlockNames.blockPumpkinPie);
        addVariant(ModBlocks.blockGhastTear, BlockNames.blockGhastTear);
        addVariant(ModBlocks.blockSkull, BlockNames.blockSkull);
        addVariant(ModBlocks.blockMutton, BlockNames.blockMutton);
        addVariant(ModBlocks.blockRabbit, BlockNames.blockRabbit);
    }

    private static void addVariant(Block block, String variant){
        RegisterHelper.addVariant(new ModelVariantMSB(block, variant));
    }

    private static void addVariant(Block block, String[] variants){
        ModelVariantMSB[] modelVariants = new ModelVariantMSB[variants.length];
        for (int i = 0; i < modelVariants.length; i++) {
            modelVariants[i] = new ModelVariantMSB(block, variants[i]);
        }
    }
}
