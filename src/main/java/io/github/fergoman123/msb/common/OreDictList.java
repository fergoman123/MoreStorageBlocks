package io.github.fergoman123.msb.common;

import io.github.fergoman123.fergoutil.oredict.OreDictBlock;
import io.github.fergoman123.fergoutil.oredict.OreDictItem;
import io.github.fergoman123.fergoutil.oredict.OreDictItemStack;
import io.github.fergoman123.msb.info.BlockNames;
import io.github.fergoman123.msb.init.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;

public class OreDictList
{
    public static final OreDictBlock blockCharcoal = getOre(BlockNames.blockCharcoal, ModBlocks.blockCharcoal);
    public static final OreDictBlock blockApple = getOre(BlockNames.blockApple, ModBlocks.blockApple);
    public static final OreDictItemStack[] blockGoldApple = getOreArray(BlockNames.blockGoldApple, ModBlocks.blockGoldApple);
    public static final OreDictBlock blockBook = getOre(BlockNames.blockBook, ModBlocks.blockBook);
    public static final OreDictBlock blockEgg = getOre(BlockNames.blockEgg, ModBlocks.blockEgg);
    public static final OreDictBlock blockEnderPearl = getOre(BlockNames.blockEnderPearl, ModBlocks.blockEnderPearl);
    public static final OreDictBlock blockEnderEye = getOre(BlockNames.blockEnderEye, ModBlocks.blockEnderEye);
    public static final OreDictBlock blockLead = getOre(BlockNames.blockLead, ModBlocks.blockLead);
    public static final OreDictBlock blockReed = getOre(BlockNames.blockReed, ModBlocks.blockReed);
    public static final OreDictItemStack[] blockSeeds = getOreArray(BlockNames.blockSeeds, ModBlocks.blockSeeds);
    public static final OreDictBlock blockStick = getOre(BlockNames.blockStick, ModBlocks.blockStick);
    public static final OreDictBlock blockLeather = getOre(BlockNames.blockLeather, ModBlocks.blockLeather);
    public static final OreDictBlock blockBucket = getOre(BlockNames.blockBucket, ModBlocks.blockBucket);
    public static final OreDictItemStack[] blockDye = getOreArray(BlockNames.blockDye, ModBlocks.blockDye);
    public static final OreDictBlock blockFireball = getOre(BlockNames.blockFireball, ModBlocks.blockFireball);
    public static final OreDictBlock blockSlimeball = getOre(BlockNames.blockSlimeball, ModBlocks.blockSlimeball);
    public static final OreDictBlock blockRottenFlesh = getOre(BlockNames.blockRottenFlesh, ModBlocks.blockRottenFlesh);
    public static final OreDictBlock blockPotato = getOre(BlockNames.blockPotato, ModBlocks.blockPotato);
    public static final OreDictBlock blockNetherWart = getOre(BlockNames.blockNetherWart, ModBlocks.blockNetherWart);
    public static final OreDictBlock blockGunpowder = getOre(BlockNames.blockGunpowder, ModBlocks.blockGunpowder);
    public static final OreDictBlock blockCarrot = getOre(BlockNames.blockCarrot, ModBlocks.blockCarrot);
    public static final OreDictBlock blockArrow = getOre(BlockNames.blockArrow, ModBlocks.blockArrow);
    public static final OreDictBlock blockBlazeRod = getOre(BlockNames.blockBlazeRod, ModBlocks.blockBlazeRod);
    public static final OreDictBlock blockFlint = getOre(BlockNames.blockFlint, ModBlocks.blockFlint);
    public static final OreDictBlock blockBone = getOre(BlockNames.blockBone, ModBlocks.blockBone);
    public static final OreDictBlock blockSugar = getOre(BlockNames.blockSugar, ModBlocks.blockSugar);
    public static final OreDictBlock blockNetherStar = getOre(BlockNames.blockNetherStar, ModBlocks.blockNetherStar);
    public static final OreDictBlock blockClay = getOre(BlockNames.blockClay, ModBlocks.blockClay);
    public static final OreDictBlock blockString = getOre(BlockNames.blockString, ModBlocks.blockString);
    public static final OreDictBlock blockFeather = getOre(BlockNames.blockFeather, ModBlocks.blockFeather);
    public static final OreDictBlock blockBread = getOre(BlockNames.blockBread, ModBlocks.blockBread);
    public static final OreDictItemStack[] blockPorkchop = getOreArray(BlockNames.blockPorkchop, ModBlocks.blockPorkchop);
    public static final OreDictItemStack[] blockFish = getOreArray(BlockNames.blockFish, ModBlocks.blockFish);
    public static final OreDictBlock blockCookie = getOre(BlockNames.blockCookie, ModBlocks.blockCookie);
    public static final OreDictItemStack[] blockBeef = getOreArray(BlockNames.blockBeef, ModBlocks.blockBeef);
    public static final OreDictBlock blockPumpkinPie = getOre(BlockNames.blockPumpkinPie, ModBlocks.blockPumpkinPie);
    public static final OreDictBlock blockGhastTear = getOre(BlockNames.blockGhastTear, ModBlocks.blockGhastTear);
    public static final OreDictItemStack[] blockSkull = getOreArray(BlockNames.blockSkull, ModBlocks.blockSkull);

    public static OreDictBlock getOre(String name, Block block)
    {
        return new OreDictBlock(name, block);
    }

    public static OreDictItemStack[] getOreArray(String[] names, Block block)
    {
        OreDictItemStack[] ores = new OreDictItemStack[names.length];
        for (int i = 0; i < ores.length; i++) {
            ores[i] = new OreDictItemStack(names[i], new ItemStack(block, 1, i));
        }
        return ores;
    }
}
