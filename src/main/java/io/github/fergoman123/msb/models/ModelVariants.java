package io.github.fergoman123.msb.models;

import io.github.fergoman123.msb.api.BlockVariantMSB;
import io.github.fergoman123.msb.info.BlockNames;
import io.github.fergoman123.msb.init.ModBlocks;
import net.minecraft.block.Block;

public class ModelVariants
{
    public static final BlockVariantMSB blockCharcoal = getVariant(ModBlocks.blockCharcoal, BlockNames.blockCharcoal);
    public static final BlockVariantMSB blockApple = getVariant(ModBlocks.blockApple, BlockNames.blockApple);
    public static final BlockVariantMSB[] blockGoldApple = getVariantArray(ModBlocks.blockGoldApple, BlockNames.blockGoldApple);
    public static final BlockVariantMSB blockBook = getVariant(ModBlocks.blockBook, BlockNames.blockBook);
    public static final BlockVariantMSB blockEgg = getVariant(ModBlocks.blockEgg, BlockNames.blockEgg);
    public static final BlockVariantMSB blockEnderPearl = getVariant(ModBlocks.blockEnderPearl, BlockNames.blockEnderPearl);
    public static final BlockVariantMSB blockEnderEye = getVariant(ModBlocks.blockEnderEye, BlockNames.blockEnderEye);
    public static final BlockVariantMSB blockLead = getVariant(ModBlocks.blockLead, BlockNames.blockLead);
    public static final BlockVariantMSB blockReed = getVariant(ModBlocks.blockReed, BlockNames.blockReed);
    public static final BlockVariantMSB[] blockSeeds = getVariantArray(ModBlocks.blockSeeds, BlockNames.blockSeeds);
    public static final BlockVariantMSB blockStick = getVariant(ModBlocks.blockStick, BlockNames.blockStick);
    public static final BlockVariantMSB blockLeather = getVariant(ModBlocks.blockLeather, BlockNames.blockLeather);
    public static final BlockVariantMSB blockBucket = getVariant(ModBlocks.blockBucket, BlockNames.blockBucket);
    public static final BlockVariantMSB[] blockDye = getVariantArray(ModBlocks.blockDye, BlockNames.blockDye);
    public static final BlockVariantMSB blockFireball = getVariant(ModBlocks.blockFireball, BlockNames.blockFireball);
    public static final BlockVariantMSB blockSlimeball = getVariant(ModBlocks.blockSlimeball, BlockNames.blockSlimeball);
    public static final BlockVariantMSB blockRottenFlesh = getVariant(ModBlocks.blockRottenFlesh, BlockNames.blockRottenFlesh);
    public static final BlockVariantMSB blockPotato = getVariant(ModBlocks.blockPotato, BlockNames.blockPotato);
    public static final BlockVariantMSB blockNetherWart = getVariant(ModBlocks.blockNetherWart, BlockNames.blockNetherWart);
    public static final BlockVariantMSB blockGunpowder = getVariant(ModBlocks.blockGunpowder, BlockNames.blockGunpowder);
    public static final BlockVariantMSB blockCarrot = getVariant(ModBlocks.blockCarrot, BlockNames.blockCarrot);
    public static final BlockVariantMSB blockArrow = getVariant(ModBlocks.blockArrow, BlockNames.blockArrow);
    public static final BlockVariantMSB blockBlazeRod = getVariant(ModBlocks.blockBlazeRod, BlockNames.blockBlazeRod);
    public static final BlockVariantMSB blockFlint = getVariant(ModBlocks.blockFlint, BlockNames.blockFlint);
    public static final BlockVariantMSB blockBone = getVariant(ModBlocks.blockBone, BlockNames.blockBone);
    public static final BlockVariantMSB blockSugar = getVariant(ModBlocks.blockSugar, BlockNames.blockSugar);
    public static final BlockVariantMSB blockNetherStar = getVariant(ModBlocks.blockNetherStar, BlockNames.blockNetherStar);
    public static final BlockVariantMSB blockClay = getVariant(ModBlocks.blockClay, BlockNames.blockClay);
    public static final BlockVariantMSB blockString = getVariant(ModBlocks.blockString, BlockNames.blockString);
    public static final BlockVariantMSB blockFeather = getVariant(ModBlocks.blockFeather, BlockNames.blockFeather);
    public static final BlockVariantMSB blockBread = getVariant(ModBlocks.blockBread, BlockNames.blockBread);
    public static final BlockVariantMSB[] blockPorkchop = getVariantArray(ModBlocks.blockPorkchop, BlockNames.blockPorkchop);
    public static final BlockVariantMSB[] blockFish = getVariantArray(ModBlocks.blockFish, BlockNames.blockFish);
    public static final BlockVariantMSB blockCookie = getVariant(ModBlocks.blockCookie, BlockNames.blockCookie);
    public static final BlockVariantMSB[] blockBeef = getVariantArray(ModBlocks.blockBeef, BlockNames.blockBeef);
    public static final BlockVariantMSB blockPumpkinPie = getVariant(ModBlocks.blockPumpkinPie, BlockNames.blockPumpkinPie);
    public static final BlockVariantMSB blockGhastTear = getVariant(ModBlocks.blockGhastTear, BlockNames.blockGhastTear);
    public static final BlockVariantMSB[] blockSkull = getVariantArray(ModBlocks.blockSkull, BlockNames.blockSkull);
    public static final BlockVariantMSB[] blockMutton = getVariantArray(ModBlocks.blockMutton, BlockNames.blockMutton);
    public static final BlockVariantMSB[] blockRabbit = getVariantArray(ModBlocks.blockRabbit, BlockNames.blockRabbit);

    public static BlockVariantMSB getVariant(Block block, String name)
    {
        return new BlockVariantMSB(block, name);
    }

    public static BlockVariantMSB[] getVariantArray(Block block, String[] names)
    {
        BlockVariantMSB[] blockVariants = new BlockVariantMSB[names.length];
        for (int i = 0; i < blockVariants.length; i++) {
            blockVariants[i] = new BlockVariantMSB(block, names[i]);
        }
        return blockVariants;
    }
}
