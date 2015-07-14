package io.github.fergoman123.msb.init;

import io.github.fergoman123.msb.api.ModelResLocMSB;
import io.github.fergoman123.msb.info.BlockNames;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;

public class ModelRegister {

    public static void registerModels() {
    	register(ModBlocks.blockCharcoal, 0, getModel(BlockNames.blockCharcoal));
    	register(ModBlocks.blockApple, 0, getModel(BlockNames.blockApple));
    	register(ModBlocks.blockGoldApple, 0, getModel(BlockNames.blockGoldApple[0]));
    	register(ModBlocks.blockGoldApple, 1, getModel(BlockNames.blockGoldApple[1]));
    	register(ModBlocks.blockBook, 0, getModel(BlockNames.blockBook));
    	register(ModBlocks.blockEgg, 0, getModel(BlockNames.blockEgg));
    	register(ModBlocks.blockEnderPearl, 0, getModel(BlockNames.blockEnderPearl));
    	register(ModBlocks.blockEnderEye, 0, getModel(BlockNames.blockEnderEye));
    	register(ModBlocks.blockLead, 0, getModel(BlockNames.blockLead));
    	register(ModBlocks.blockReed, 0, getModel(BlockNames.blockReed));
    	register(ModBlocks.blockSeeds, 0, getModel(BlockNames.blockSeeds[0]));
    	register(ModBlocks.blockSeeds, 1, getModel(BlockNames.blockSeeds[1]));
    	register(ModBlocks.blockSeeds, 2, getModel(BlockNames.blockSeeds[2]));
    	register(ModBlocks.blockStick, 0, getModel(BlockNames.blockStick));
    	register(ModBlocks.blockLeather, 0, getModel(BlockNames.blockLeather));
    	register(ModBlocks.blockBucket, 0, getModel(BlockNames.blockBucket));
    	register(ModBlocks.blockDye, 0, getModel(BlockNames.blockDye[0]));
    	register(ModBlocks.blockDye, 1, getModel(BlockNames.blockDye[1]));
    	register(ModBlocks.blockDye, 2, getModel(BlockNames.blockDye[2]));
    	register(ModBlocks.blockDye, 3, getModel(BlockNames.blockDye[3]));
    	register(ModBlocks.blockDye, 4, getModel(BlockNames.blockDye[4]));
    	register(ModBlocks.blockDye, 5, getModel(BlockNames.blockDye[5]));
    	register(ModBlocks.blockDye, 6, getModel(BlockNames.blockDye[6]));
    	register(ModBlocks.blockDye, 7, getModel(BlockNames.blockDye[7]));
    	register(ModBlocks.blockDye, 8, getModel(BlockNames.blockDye[8]));
    	register(ModBlocks.blockDye, 9, getModel(BlockNames.blockDye[9]));
    	register(ModBlocks.blockDye, 10, getModel(BlockNames.blockDye[10]));
    	register(ModBlocks.blockDye, 11, getModel(BlockNames.blockDye[11]));
    	register(ModBlocks.blockDye, 12, getModel(BlockNames.blockDye[12]));
    	register(ModBlocks.blockDye, 13, getModel(BlockNames.blockDye[13]));
    	register(ModBlocks.blockDye, 14, getModel(BlockNames.blockDye[14]));
    	register(ModBlocks.blockFireball, 0, getModel(BlockNames.blockFireball));
    	register(ModBlocks.blockSlimeball, 0, getModel(BlockNames.blockSlimeball));
    	register(ModBlocks.blockRottenFlesh, 0, getModel(BlockNames.blockRottenFlesh));
    	register(ModBlocks.blockPotato, 0, getModel(BlockNames.blockPotato));
    	register(ModBlocks.blockNetherWart, 0, getModel(BlockNames.blockNetherWart));
    	register(ModBlocks.blockGunpowder, 0, getModel(BlockNames.blockGunpowder));
    	register(ModBlocks.blockCarrot, 0, getModel(BlockNames.blockCarrot));
    	register(ModBlocks.blockArrow, 0, getModel(BlockNames.blockArrow));
    	register(ModBlocks.blockBlazeRod, 0, getModel(BlockNames.blockBlazeRod));
    	register(ModBlocks.blockFlint, 0, getModel(BlockNames.blockFlint));
    	register(ModBlocks.blockBone, 0, getModel(BlockNames.blockBone));
    	register(ModBlocks.blockSugar, 0, getModel(BlockNames.blockSugar));
    	register(ModBlocks.blockNetherStar, 0, getModel(BlockNames.blockNetherStar));
    	register(ModBlocks.blockClay, 0, getModel(BlockNames.blockClay));
    	register(ModBlocks.blockString, 0, getModel(BlockNames.blockString));
    	register(ModBlocks.blockFeather, 0, getModel(BlockNames.blockFeather));
    	register(ModBlocks.blockBread, 0, getModel(BlockNames.blockBread));
    	register(ModBlocks.blockPorkchop, 0, getModel(BlockNames.blockPorkchop[0]));
    	register(ModBlocks.blockPorkchop, 1, getModel(BlockNames.blockPorkchop[1]));
    	register(ModBlocks.blockFish, 0, getModel(BlockNames.blockFish[0]));
    	register(ModBlocks.blockFish, 1, getModel(BlockNames.blockFish[1]));
    	register(ModBlocks.blockFish, 2, getModel(BlockNames.blockFish[2]));
    	register(ModBlocks.blockFish, 3, getModel(BlockNames.blockFish[3]));
    	register(ModBlocks.blockFish, 4, getModel(BlockNames.blockFish[4]));
    	register(ModBlocks.blockFish, 5, getModel(BlockNames.blockFish[5]));
    	register(ModBlocks.blockCookie, 0, getModel(BlockNames.blockCookie));
    	register(ModBlocks.blockBeef, 0, getModel(BlockNames.blockBeef[0]));
    	register(ModBlocks.blockBeef, 1, getModel(BlockNames.blockBeef[1]));
    	register(ModBlocks.blockPumpkinPie, 0, getModel(BlockNames.blockPumpkinPie));
    	register(ModBlocks.blockGhastTear, 0, getModel(BlockNames.blockGhastTear));
    	register(ModBlocks.blockSkull, 0, getModel(BlockNames.blockSkull[0]));
    	register(ModBlocks.blockSkull, 1, getModel(BlockNames.blockSkull[1]));
    	register(ModBlocks.blockSkull, 2, getModel(BlockNames.blockSkull[2]));
    	register(ModBlocks.blockSkull, 3, getModel(BlockNames.blockSkull[3]));
    	register(ModBlocks.blockMutton, 0, getModel(BlockNames.blockMutton[0]));
    	register(ModBlocks.blockMutton, 1, getModel(BlockNames.blockMutton[1]));
    	register(ModBlocks.blockRabbit, 0, getModel(BlockNames.blockRabbit[0]));
    	register(ModBlocks.blockRabbit, 1, getModel(BlockNames.blockRabbit[1]));
    }
    
    private static void register(Block block, int meta, ModelResourceLocation model){
    	Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), meta, model);
    }
    
    private static ModelResourceLocation getModel(String modelName){
    	return new ModelResLocMSB(modelName);
    }
}
