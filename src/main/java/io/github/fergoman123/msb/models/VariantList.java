package io.github.fergoman123.msb.models;

import io.github.fergoman123.fergoutil.model.BlockVariant;
import io.github.fergoman123.msb.info.BlockNames;
import io.github.fergoman123.msb.info.ModInfo;
import io.github.fergoman123.msb.init.ModBlocks;
import net.minecraft.block.Block;

public class VariantList
{
    public static final BlockVariant blockCharcoal = getBlockVariant(ModBlocks.blockCharcoal, BlockNames.blockCharcoal);
    public static final BlockVariant blockApple = getBlockVariant(ModBlocks.blockApple, BlockNames.blockApple);
    public static final BlockVariant[] blockGoldApple = getBlockVariantArray(ModBlocks.blockGoldApple, BlockNames.blockGoldApple);
    public static final BlockVariant blockBook = getBlockVariant(ModBlocks.blockBook, BlockNames.blockBook);
    public static final BlockVariant blockEgg = getBlockVariant(ModBlocks.blockEgg, BlockNames.blockEgg);
    public static final BlockVariant blockEnderPearl = getBlockVariant(ModBlocks.blockEnderPearl, BlockNames.blockEnderPearl);
    public static final BlockVariant blockEnderEye = getBlockVariant(ModBlocks.blockEnderEye, BlockNames.blockEnderEye);
    public static final BlockVariant blockLead = getBlockVariant(ModBlocks.blockLead, BlockNames.blockLead);
    public static final BlockVariant blockReed = getBlockVariant(ModBlocks.blockReed, BlockNames.blockReed);
    public static final BlockVariant[] blockSeeds = getBlockVariantArray(ModBlocks.blockSeeds, BlockNames.blockSeeds);
    public static final BlockVariant blockStick = getBlockVariant(ModBlocks.blockStick, BlockNames.blockStick);
    public static final BlockVariant blockLeather = getBlockVariant(ModBlocks.blockLeather, BlockNames.blockLeather);
    public static final BlockVariant blockBucket = getBlockVariant(ModBlocks.blockBucket, BlockNames.blockBucket);
    public static final BlockVariant[] blockDye = getBlockVariantArray(ModBlocks.blockDye, BlockNames.blockDye);
    public static final BlockVariant blockFireball = getBlockVariant(ModBlocks.blockFireball, BlockNames.blockFireball);
    public static final BlockVariant blockSlimeball = getBlockVariant(ModBlocks.blockSlimeball, BlockNames.blockSlimeball);
    public static final BlockVariant blockRottenFlesh = getBlockVariant(ModBlocks.blockRottenFlesh, BlockNames.blockRottenFlesh);
    public static final BlockVariant blockPotato = getBlockVariant(ModBlocks.blockPotato, BlockNames.blockPotato);
    public static final BlockVariant blockNetherWart = getBlockVariant(ModBlocks.blockNetherWart, BlockNames.blockNetherWart);
    public static final BlockVariant blockGunpowder = getBlockVariant(ModBlocks.blockGunpowder, BlockNames.blockGunpowder);
    public static final BlockVariant blockCarrot = getBlockVariant(ModBlocks.blockCarrot, BlockNames.blockCarrot);
    public static final BlockVariant blockArrow = getBlockVariant(ModBlocks.blockArrow, BlockNames.blockArrow);
    public static final BlockVariant blockBlazeRod = getBlockVariant(ModBlocks.blockBlazeRod, BlockNames.blockBlazeRod);
    public static final BlockVariant blockFlint = getBlockVariant(ModBlocks.blockFlint, BlockNames.blockFlint);
    public static final BlockVariant blockBone = getBlockVariant(ModBlocks.blockBone, BlockNames.blockBone);
    public static final BlockVariant blockSugar = getBlockVariant(ModBlocks.blockSugar, BlockNames.blockSugar);
    public static final BlockVariant blockNetherStar = getBlockVariant(ModBlocks.blockNetherStar, BlockNames.blockNetherStar);
    public static final BlockVariant blockClay = getBlockVariant(ModBlocks.blockClay, BlockNames.blockClay);
    public static final BlockVariant blockString = getBlockVariant(ModBlocks.blockString, BlockNames.blockString);
    public static final BlockVariant blockFeather = getBlockVariant(ModBlocks.blockFeather, BlockNames.blockFeather);
    public static final BlockVariant blockBread = getBlockVariant(ModBlocks.blockBread, BlockNames.blockBread);
    public static final BlockVariant[] blockPorkchop = getBlockVariantArray(ModBlocks.blockPorkchop, BlockNames.blockPorkchop);
    public static final BlockVariant[] blockFish = getBlockVariantArray(ModBlocks.blockFish, BlockNames.blockFish);
    public static final BlockVariant blockCookie = getBlockVariant(ModBlocks.blockCookie, BlockNames.blockCookie);
    public static final BlockVariant[] blockBeef = getBlockVariantArray(ModBlocks.blockBeef, BlockNames.blockBeef);
    public static final BlockVariant blockPumpkinPie = getBlockVariant(ModBlocks.blockPumpkinPie, BlockNames.blockPumpkinPie);
    public static final BlockVariant blockGhastTear = getBlockVariant(ModBlocks.blockGhastTear, BlockNames.blockGhastTear);
    public static final BlockVariant[] blockSkull = getBlockVariantArray(ModBlocks.blockSkull, BlockNames.blockSkull);

    public static BlockVariant getBlockVariant(Block block, String name)
    {
        return new BlockVariant(block, ModInfo.modid.toLowerCase() + ":" + name);
    }

    public static BlockVariant[] getBlockVariantArray(Block block, String[] names)
    {
        BlockVariant[] variants = new BlockVariant[names.length];
        for (int i = 0; i < variants.length; i++) {
            variants[i] = getBlockVariant(block, names[i]);
        }

        return variants;
    }
}
