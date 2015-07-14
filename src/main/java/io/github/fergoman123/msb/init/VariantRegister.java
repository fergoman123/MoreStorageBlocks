package io.github.fergoman123.msb.init;

import io.github.fergoman123.msb.info.BlockNames;
import net.minecraft.block.Block;
import net.minecraft.client.resources.model.ModelBakery;
import net.minecraft.item.Item;

public class VariantRegister {
    public static void registerVariants(){
    	addVariantName(ModBlocks.blockCharcoal, BlockNames.blockCharcoal);
    	addVariantName(ModBlocks.blockApple, BlockNames.blockApple);
    	addVariantName(ModBlocks.blockGoldApple, BlockNames.blockGoldApple[0]);
    	addVariantName(ModBlocks.blockGoldApple, BlockNames.blockGoldApple[1]);
    	addVariantName(ModBlocks.blockBook, BlockNames.blockBook);
    	addVariantName(ModBlocks.blockEgg, BlockNames.blockEgg);
    	addVariantName(ModBlocks.blockEnderPearl, BlockNames.blockEnderPearl);
    	addVariantName(ModBlocks.blockEnderEye, BlockNames.blockEnderEye);
    	addVariantName(ModBlocks.blockLead, BlockNames.blockLead);
    	addVariantName(ModBlocks.blockReed, BlockNames.blockReed);
    	addVariantName(ModBlocks.blockSeeds, BlockNames.blockSeeds[0]);
    	addVariantName(ModBlocks.blockSeeds, BlockNames.blockSeeds[1]);
    	addVariantName(ModBlocks.blockSeeds, BlockNames.blockSeeds[2]);
    	addVariantName(ModBlocks.blockStick, BlockNames.blockStick);
    	addVariantName(ModBlocks.blockLeather, BlockNames.blockLeather);
    	addVariantName(ModBlocks.blockBucket, BlockNames.blockBucket);
        addVariantName(ModBlocks.blockDye, BlockNames.blockDye[0]);
        addVariantName(ModBlocks.blockDye, BlockNames.blockDye[1]);
        addVariantName(ModBlocks.blockDye, BlockNames.blockDye[2]);
        addVariantName(ModBlocks.blockDye, BlockNames.blockDye[3]);
        addVariantName(ModBlocks.blockDye, BlockNames.blockDye[4]);
        addVariantName(ModBlocks.blockDye, BlockNames.blockDye[5]);
        addVariantName(ModBlocks.blockDye, BlockNames.blockDye[6]);
        addVariantName(ModBlocks.blockDye, BlockNames.blockDye[7]);
        addVariantName(ModBlocks.blockDye, BlockNames.blockDye[8]);
        addVariantName(ModBlocks.blockDye, BlockNames.blockDye[9]);
        addVariantName(ModBlocks.blockDye, BlockNames.blockDye[10]);
        addVariantName(ModBlocks.blockDye, BlockNames.blockDye[11]);
        addVariantName(ModBlocks.blockDye, BlockNames.blockDye[12]);
        addVariantName(ModBlocks.blockDye, BlockNames.blockDye[13]);
        addVariantName(ModBlocks.blockDye, BlockNames.blockDye[14]);
        addVariantName(ModBlocks.blockFireball, BlockNames.blockFireball);
        addVariantName(ModBlocks.blockSlimeball, BlockNames.blockSlimeball);
        addVariantName(ModBlocks.blockRottenFlesh, BlockNames.blockRottenFlesh);
        addVariantName(ModBlocks.blockPotato, BlockNames.blockPotato);
        addVariantName(ModBlocks.blockNetherWart, BlockNames.blockNetherWart);
        addVariantName(ModBlocks.blockGunpowder, BlockNames.blockGunpowder);
        addVariantName(ModBlocks.blockCarrot, BlockNames.blockCarrot);
		addVariantName(ModBlocks.blockArrow, BlockNames.blockArrow);
        addVariantName(ModBlocks.blockBlazeRod, BlockNames.blockBlazeRod);
        addVariantName(ModBlocks.blockFlint, BlockNames.blockFlint);
        addVariantName(ModBlocks.blockBone, BlockNames.blockBone);
        addVariantName(ModBlocks.blockSugar, BlockNames.blockSugar);
        addVariantName(ModBlocks.blockNetherStar, BlockNames.blockNetherStar);
        addVariantName(ModBlocks.blockClay, BlockNames.blockClay);
        addVariantName(ModBlocks.blockString, BlockNames.blockString);
        addVariantName(ModBlocks.blockFeather, BlockNames.blockFeather);
        addVariantName(ModBlocks.blockBread, BlockNames.blockBread);
        addVariantName(ModBlocks.blockPorkchop, BlockNames.blockPorkchop[0]);
        addVariantName(ModBlocks.blockPorkchop, BlockNames.blockPorkchop[1]);
        addVariantName(ModBlocks.blockFish, BlockNames.blockFish[0]);
        addVariantName(ModBlocks.blockFish, BlockNames.blockFish[1]);
        addVariantName(ModBlocks.blockFish, BlockNames.blockFish[2]);
        addVariantName(ModBlocks.blockFish, BlockNames.blockFish[3]);
        addVariantName(ModBlocks.blockFish, BlockNames.blockFish[4]);
        addVariantName(ModBlocks.blockFish, BlockNames.blockFish[5]);
        addVariantName(ModBlocks.blockCookie, BlockNames.blockCookie);
        addVariantName(ModBlocks.blockBeef, BlockNames.blockBeef[0]);
        addVariantName(ModBlocks.blockBeef, BlockNames.blockBeef[1]);
        addVariantName(ModBlocks.blockPumpkinPie, BlockNames.blockPumpkinPie);
        addVariantName(ModBlocks.blockGhastTear, BlockNames.blockGhastTear);
        addVariantName(ModBlocks.blockSkull, BlockNames.blockSkull[0]);
        addVariantName(ModBlocks.blockSkull, BlockNames.blockSkull[1]);
        addVariantName(ModBlocks.blockSkull, BlockNames.blockSkull[2]);
        addVariantName(ModBlocks.blockSkull, BlockNames.blockSkull[3]);
        addVariantName(ModBlocks.blockMutton, BlockNames.blockMutton[0]);
        addVariantName(ModBlocks.blockMutton, BlockNames.blockMutton[1]);
        addVariantName(ModBlocks.blockRabbit, BlockNames.blockRabbit[0]);
        addVariantName(ModBlocks.blockRabbit, BlockNames.blockRabbit[1]);
    }

    private static void addVariantName(Block block, String variant){
    	ModelBakery.addVariantName(Item.getItemFromBlock(block), "msb:" + variant);
    }
}
