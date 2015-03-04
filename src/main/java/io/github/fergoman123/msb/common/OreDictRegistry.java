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
        registerOre(BlockNames.blockGoldApple, ModBlocks.blockGoldApple);
        registerOre(BlockNames.blockBook, ModBlocks.blockBook);
        registerOre(BlockNames.blockEgg, ModBlocks.blockEgg);
        registerOre(BlockNames.blockEnderPearl, ModBlocks.blockEnderPearl);
        registerOre(BlockNames.blockEnderEye, ModBlocks.blockEnderEye);
        registerOre(BlockNames.blockLead, ModBlocks.blockLead);
        registerOre(BlockNames.blockReed, ModBlocks.blockReed);
        registerOre(BlockNames.blockSeeds, ModBlocks.blockSeeds);
        registerOre(BlockNames.blockStick, ModBlocks.blockStick);
        registerOre(BlockNames.blockLeather, ModBlocks.blockLeather);
        registerOre(BlockNames.blockBucket, ModBlocks.blockBucket);
        registerOre(BlockNames.blockDye, ModBlocks.blockDye);
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
        registerOre(BlockNames.blockPorkchop, ModBlocks.blockPorkchop);
        registerOre(BlockNames.blockFish, ModBlocks.blockFish);
        registerOre(BlockNames.blockCookie, ModBlocks.blockCookie);
        registerOre(BlockNames.blockBeef, ModBlocks.blockBeef);
        registerOre(BlockNames.blockPumpkinPie, ModBlocks.blockPumpkinPie);
        registerOre(BlockNames.blockGhastTear, ModBlocks.blockGhastTear);
        registerOre(BlockNames.blockSkull, ModBlocks.blockSkull);

    }

    public static void registerOre(String name, Block block) {
        OreDictionary.registerOre(name, block);
    }

    public static void registerOre(String[] names, Block block) {
        for (int i = 0; i < names.length; i++) {
            OreDictionary.registerOre(names[i], new ItemStack(block, 1, i));
        }
    }
}
