package io.github.fergoman123.msb.init;

import io.github.fergoman123.fergoutil.helper.RegisterHelper;
import io.github.fergoman123.fergoutil.item.ItemBlockVariants;
import io.github.fergoman123.fergoutil.model.ModelVariant;
import io.github.fergoman123.msb.api.BlockMSB;
import io.github.fergoman123.msb.api.BlockMultiMSB;
import io.github.fergoman123.msb.api.ModelVariantMSB;
import io.github.fergoman123.msb.common.blocks.*;
import io.github.fergoman123.msb.info.BlockNames;
import net.minecraft.block.Block;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModBlocks
{
    public static BlockMSB blockCharcoal;
    public static BlockMSB blockApple;
    public static BlockMultiMSB blockGoldApple;
    public static BlockMSB blockBook;
    public static BlockMSB blockEgg;
    public static BlockMSB blockEnderPearl;
    public static BlockMSB blockEnderEye;
    public static BlockMSB blockLead;
    public static BlockMSB blockReed;
    public static BlockMultiMSB blockSeeds;
    public static BlockMSB blockStick;
    public static BlockMSB blockLeather;
    public static BlockMSB blockBucket;
    public static BlockMultiMSB blockDye;
    public static BlockMSB blockFireball;
    public static BlockMSB blockSlimeball;
    public static BlockMSB blockRottenFlesh;
    public static BlockMSB blockPotato;
    public static BlockMSB blockNetherWart;
    public static BlockMSB blockGunpowder;
    public static BlockMSB blockCarrot;
    public static BlockMSB blockArrow;
    public static BlockMSB blockBlazeRod;
    public static BlockMSB blockFlint;
    public static BlockMSB blockBone;
    public static BlockMSB blockSugar;
    public static BlockMSB blockNetherStar;
    public static BlockMSB blockClay;
    public static BlockMSB blockString;
    public static BlockMSB blockFeather;
    public static BlockMSB blockBread;
    public static BlockMultiMSB blockPorkchop;
    public static BlockMultiMSB blockFish;
    public static BlockMSB blockCookie;
    public static BlockMultiMSB blockBeef;
    public static BlockMSB blockPumpkinPie;
    public static BlockMSB blockGhastTear;
    public static BlockMultiMSB blockSkull;
    public static BlockMultiMSB blockMutton;
    public static BlockMultiMSB blockRabbit;

    public static void addBlocks()
    {
        blockCharcoal = new BlockMSB(BlockNames.blockCharcoal);
        blockApple = new BlockMSB(BlockNames.blockApple);
        blockGoldApple = new BlockGoldApple();
        blockBook = new BlockMSB(BlockNames.blockBook);
        blockEgg = new BlockMSB(BlockNames.blockEgg);
        blockEnderPearl = new BlockMSB(BlockNames.blockEnderPearl);
        blockEnderEye = new BlockMSB(BlockNames.blockEnderEye);
        blockLead = new BlockMSB(BlockNames.blockLead);
        blockReed = new BlockMSB(BlockNames.blockReed);
        blockSeeds = new BlockSeeds();
        blockStick = new BlockMSB(BlockNames.blockStick);
        blockLeather = new BlockMSB(BlockNames.blockLeather);
        blockBucket = new BlockMSB(BlockNames.blockBucket);
        blockDye = new BlockDye();
        blockFireball = new BlockMSB(BlockNames.blockFireball);
        blockSlimeball = new BlockMSB(BlockNames.blockSlimeball);
        blockRottenFlesh = new BlockMSB(BlockNames.blockRottenFlesh);
        blockPotato = new BlockMSB(BlockNames.blockPotato);
        blockNetherWart = new BlockMSB(BlockNames.blockNetherWart);
        blockGunpowder = new BlockMSB(BlockNames.blockGunpowder);
        blockCarrot = new BlockMSB(BlockNames.blockCarrot);
        blockArrow = new BlockMSB(BlockNames.blockArrow);
        blockBlazeRod = new BlockMSB(BlockNames.blockBlazeRod);
        blockFlint = new BlockMSB(BlockNames.blockFlint);
        blockBone = new BlockMSB(BlockNames.blockBone);
        blockSugar = new BlockMSB(BlockNames.blockSugar);
        blockNetherStar = new BlockMSB(BlockNames.blockNetherStar);
        blockClay = new BlockMSB(BlockNames.blockClay);
        blockString = new BlockMSB(BlockNames.blockString);
        blockFeather = new BlockMSB(BlockNames.blockFeather);
        blockBread = new BlockMSB(BlockNames.blockBread);
        blockPorkchop = new BlockPorkchop();
        blockFish = new BlockFish();
        blockCookie = new BlockMSB(BlockNames.blockCookie);
        blockBeef = new BlockBeef();
        blockPumpkinPie = new BlockMSB(BlockNames.blockPumpkinPie);
        blockGhastTear = new BlockMSB(BlockNames.blockGhastTear);
        blockSkull = new BlockSkullStorage();
        blockMutton = new BlockMutton();
        blockRabbit = new BlockRabbit();
    }

    public static void registerBlocks()
    {
        registerBlock(blockCharcoal, BlockNames.blockCharcoal, false);
        registerBlock(blockApple, BlockNames.blockApple, false);
        registerBlock(blockGoldApple, BlockNames.blockGoldAppleName, true);
        registerBlock(blockBook, BlockNames.blockBook, false);
        registerBlock(blockEgg, BlockNames.blockEgg, false);
        registerBlock(blockEnderPearl, BlockNames.blockEnderPearl, false);
        registerBlock(blockEnderEye, BlockNames.blockEnderEye, false);
        registerBlock(blockLead, BlockNames.blockLead, false);
        registerBlock(blockReed, BlockNames.blockReed, false);
        registerBlock(blockSeeds, BlockNames.blockSeedsName, true);
        registerBlock(blockStick, BlockNames.blockStick, false);
        registerBlock(blockLeather, BlockNames.blockLeather, false);
        registerBlock(blockBucket, BlockNames.blockBucket, false);
        registerBlock(blockDye, BlockNames.blockDyeName, true);
        registerBlock(blockFireball, BlockNames.blockFireball, false);
        registerBlock(blockSlimeball, BlockNames.blockSlimeball, false);
        registerBlock(blockRottenFlesh, BlockNames.blockRottenFlesh, false);
        registerBlock(blockPotato, BlockNames.blockPotato, false);
        registerBlock(blockNetherWart, BlockNames.blockNetherWart, false);
        registerBlock(blockGunpowder, BlockNames.blockGunpowder, false);
        registerBlock(blockCarrot, BlockNames.blockCarrot, false);
        registerBlock(blockArrow, BlockNames.blockArrow, false);
        registerBlock(blockBlazeRod, BlockNames.blockBlazeRod, false);
        registerBlock(blockFlint, BlockNames.blockFlint, false);
        registerBlock(blockBone, BlockNames.blockBone, false);
        registerBlock(blockSugar, BlockNames.blockSugar, false);
        registerBlock(blockNetherStar, BlockNames.blockNetherStar, false);
        registerBlock(blockClay, BlockNames.blockClay, false);
        registerBlock(blockString, BlockNames.blockString, false);
        registerBlock(blockFeather, BlockNames.blockFeather, false);
        registerBlock(blockBread, BlockNames.blockBread, false);
        registerBlock(blockPorkchop, BlockNames.blockPorkchopName, true);
        registerBlock(blockFish, BlockNames.blockFishName, true);
        registerBlock(blockCookie, BlockNames.blockCookie, false);
        registerBlock(blockBeef, BlockNames.blockBeefName, true);
        registerBlock(blockPumpkinPie, BlockNames.blockPumpkinPie, false);
        registerBlock(blockGhastTear, BlockNames.blockGhastTear, false);
        registerBlock(blockSkull, BlockNames.blockSkullName, true);
        registerBlock(blockMutton, BlockNames.blockMuttonName, true);
        registerBlock(blockRabbit, BlockNames.blockRabbitName, true);
    }

    public static void addVariants()
    {
        RegisterHelper.addVariant(new ModelVariantMSB(blockCharcoal, BlockNames.blockCharcoal));
        RegisterHelper.addVariant(new ModelVariantMSB(blockApple, BlockNames.blockApple));
        ModelVariantMSB[] blockGoldAppleVariant = new ModelVariantMSB[BlockNames.blockGoldApple.length];
        for (int i = 0; i < blockGoldAppleVariant.length; i++) {
            blockGoldAppleVariant[i] = new ModelVariantMSB(blockGoldApple, BlockNames.blockGoldApple[i]);
            RegisterHelper.addVariant(blockGoldAppleVariant[i]);
        }
        RegisterHelper.addVariant(new ModelVariantMSB(blockBook, BlockNames.blockBook));
        RegisterHelper.addVariant(new ModelVariantMSB(blockEgg, BlockNames.blockEgg));
        RegisterHelper.addVariant(new ModelVariantMSB(blockEnderPearl, BlockNames.blockEnderPearl));
        RegisterHelper.addVariant(new ModelVariantMSB(blockEnderEye, BlockNames.blockEnderEye));
        RegisterHelper.addVariant(new ModelVariantMSB(blockLead, BlockNames.blockLead));
        RegisterHelper.addVariant(new ModelVariantMSB(blockReed, BlockNames.blockReed));
        RegisterHelper.addVariant(new ModelVariantMSB(blockSeeds, BlockNames.blockSeedsName));
        RegisterHelper.addVariant(new ModelVariantMSB(blockStick, BlockNames.blockStick));
        RegisterHelper.addVariant(new ModelVariantMSB(blockLeather, BlockNames.blockLeather));
        RegisterHelper.addVariant(new ModelVariantMSB(blockBucket, BlockNames.blockBucket));
        ModelVariantMSB[] blockDyeVariant = new ModelVariantMSB[BlockNames.blockDye.length];
        RegisterHelper.addVariant(new ModelVariantMSB(blockDye, BlockNames.blockDyeName, true);
        RegisterHelper.addVariant(new ModelVariantMSB(blockFireball, BlockNames.blockFireball));
        RegisterHelper.addVariant(new ModelVariantMSB(blockSlimeball, BlockNames.blockSlimeball));
        RegisterHelper.addVariant(new ModelVariantMSB(blockRottenFlesh, BlockNames.blockRottenFlesh));
        RegisterHelper.addVariant(new ModelVariantMSB(blockPotato, BlockNames.blockPotato));
        RegisterHelper.addVariant(new ModelVariantMSB(blockNetherWart, BlockNames.blockNetherWart));
        RegisterHelper.addVariant(new ModelVariantMSB(blockGunpowder, BlockNames.blockGunpowder));
        RegisterHelper.addVariant(new ModelVariantMSB(blockCarrot, BlockNames.blockCarrot));
        RegisterHelper.addVariant(new ModelVariantMSB(blockArrow, BlockNames.blockArrow));
        RegisterHelper.addVariant(new ModelVariantMSB(blockBlazeRod, BlockNames.blockBlazeRod));
        RegisterHelper.addVariant(new ModelVariantMSB(blockFlint, BlockNames.blockFlint));
        RegisterHelper.addVariant(new ModelVariantMSB(blockBone, BlockNames.blockBone));
        RegisterHelper.addVariant(new ModelVariantMSB(blockSugar, BlockNames.blockSugar));
        RegisterHelper.addVariant(new ModelVariantMSB(blockNetherStar, BlockNames.blockNetherStar));
        RegisterHelper.addVariant(new ModelVariantMSB(blockClay, BlockNames.blockClay));
        RegisterHelper.addVariant(new ModelVariantMSB(blockString, BlockNames.blockString));
        RegisterHelper.addVariant(new ModelVariantMSB(blockFeather, BlockNames.blockFeather));
        RegisterHelper.addVariant(new ModelVariantMSB(blockBread, BlockNames.blockBread));
        RegisterHelper.addVariant(new ModelVariantMSB(blockPorkchop, BlockNames.blockPorkchopName, true);
        RegisterHelper.addVariant(new ModelVariantMSB(blockFish, BlockNames.blockFishName, true);
        RegisterHelper.addVariant(new ModelVariantMSB(blockCookie, BlockNames.blockCookie));
        RegisterHelper.addVariant(new ModelVariantMSB(blockBeef, BlockNames.blockBeefName, true);
        RegisterHelper.addVariant(new ModelVariantMSB(blockPumpkinPie, BlockNames.blockPumpkinPie));
        RegisterHelper.addVariant(new ModelVariantMSB(blockGhastTear, BlockNames.blockGhastTear));
        RegisterHelper.addVariant(new ModelVariantMSB(blockSkull, BlockNames.blockSkullName, true);
        RegisterHelper.addVariant(new ModelVariantMSB(blockMutton, BlockNames.blockMuttonName, true);
        RegisterHelper.addVariant(new ModelVariantMSB(blockRabbit, BlockNames.blockRabbitName, true);
    }

    public static void registerBlock(Block block, String name, boolean hasItemBlock){
        if (!hasItemBlock){
            GameRegistry.registerBlock(block, name);
        }
        else
        {
            GameRegistry.registerBlock(block, ItemBlockVariants.class, name);
        }
    }
}
