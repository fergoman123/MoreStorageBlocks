package io.github.fergoman123.msb.common;

import io.github.fergoman123.msb.info.BlockNames;
import io.github.fergoman123.msb.init.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class OreDictRegistry {

    public static void init()
    {
    	registerOre(BlockNames.blockCharcoal, ModBlocks.blockCharcoal);
    	registerOre(BlockNames.blockApple, ModBlocks.blockApple);
    	for(int i = 0; i < BlockNames.blockGoldApple.length; i++)
    		registerOre(BlockNames.blockGoldApple[i], ModBlocks.blockGoldApple, i);
    	registerOre(BlockNames.blockBook, ModBlocks.blockBook);
    	registerOre(BlockNames.blockEgg, ModBlocks.blockEgg);
    	registerOre(BlockNames.blockEnderPearl, ModBlocks.blockEnderPearl);
    	registerOre(BlockNames.blockEnderEye, ModBlocks.blockEnderEye);
    	registerOre(BlockNames.blockLead, ModBlocks.blockLead);
    	registerOre(BlockNames.blockReed, ModBlocks.blockReed);
    	for (int i = 0; i < BlockNames.blockSeeds.length; i++)
    		registerOre(BlockNames.blockSeeds[i], ModBlocks.blockSeeds, i);
    	registerOre(BlockNames.blockStick, ModBlocks.blockStick);
    	registerOre(BlockNames.blockLeather, ModBlocks.blockLeather);
    	registerOre(BlockNames.blockBucket, ModBlocks.blockBucket);
    	for(int i = 0; i < BlockNames.blockDye.length; i++)
    		registerOre(BlockNames.blockDye[i], ModBlocks.blockDye, i);
    	registerOre(BlockNames.blockFireball, ModBlocks.blockFireball);
    	registerOre(BlockNames.blockSlimeball, ModBlocks.blockSlimeball);
    	registerOre(BlockNames.blockRottenFlesh, ModBlocks.blockRottenFlesh);
    	registerOre(BlockNames.blockPotato, ModBlocks.blockPotato);
    	registerOre(BlockNames.blockNetherWart, ModBlocks.blockNetherWart);
    	registerOre(BlockNames.blockGunpowder, ModBlocks.blockGunpowder);
    	registerOre(BlockNames.blockCarrot, ModBlocks.blockCarrot);
    	registerOre(BlockNames.blockArrow, ModBlocks.blockArrow);
    	registerOre(BlockNames.blockBlazeRod, ModBlocks.blockBlazeRod);
    	registerOre(BlockNames.blockFlint, ModBlocks.blockFlint);
    	registerOre(BlockNames.blockBone, ModBlocks.blockBone);
    	registerOre(BlockNames.blockSugar, ModBlocks.blockSugar);
    	registerOre(BlockNames.blockNetherStar, ModBlocks.blockNetherStar);
    	registerOre(BlockNames.blockClay, ModBlocks.blockClay);
    	registerOre(BlockNames.blockString, ModBlocks.blockString);
    	registerOre(BlockNames.blockFeather, ModBlocks.blockFeather);
    	registerOre(BlockNames.blockBread, ModBlocks.blockBread);
    	for(int i = 0; i < BlockNames.blockPorkchop.length; i++)
    		registerOre(BlockNames.blockPorkchop[i], ModBlocks.blockPorkchop, i);
    	for(int i = 0; i < BlockNames.blockFish.length; i++)
    		registerOre(BlockNames.blockFish[i], ModBlocks.blockFish, i);
    	registerOre(BlockNames.blockCookie, ModBlocks.blockCookie);
    	for (int i = 0; i < BlockNames.blockBeef.length; i++)
    		registerOre(BlockNames.blockBeef[i], ModBlocks.blockBeef, i);
    	registerOre(BlockNames.blockPumpkinPie, ModBlocks.blockPumpkinPie);
    	registerOre(BlockNames.blockGhastTear, ModBlocks.blockGhastTear);
    	for (int i = 0; i < BlockNames.blockSkull.length; i++)
    		registerOre(BlockNames.blockSkull[i], ModBlocks.blockSkull, i);
    	for (int i = 0; i < BlockNames.blockMutton.length; i++)
    		registerOre(BlockNames.blockMutton[i], ModBlocks.blockMutton, i);
    	for (int i = 0; i < BlockNames.blockRabbit.length; i++)
        	registerOre(BlockNames.blockRabbit[i], ModBlocks.blockRabbit, i);
    	
    }
    
    private static void registerOre(String name, Block ore)
    {
    	OreDictionary.registerOre(name, ore);
    }
    
    private static void registerOre(String name, Block block, int meta){
    	OreDictionary.registerOre(name, new ItemStack(block, 1, meta));
    }
}
