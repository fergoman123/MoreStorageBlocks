package io.github.fergoman123.msb.init;

import io.github.fergoman123.fergoutil.item.ItemBlockVariants;
import io.github.fergoman123.msb.api.BlockMSB;
import io.github.fergoman123.msb.api.ModelResLocMSB;
import io.github.fergoman123.msb.api.VariantNameMSB;
import io.github.fergoman123.msb.common.blocks.*;
import io.github.fergoman123.msb.info.BlockNames;
import net.minecraft.block.Block;
import net.minecraft.client.resources.model.ModelBakery;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModBlocks
{
    public static Block blockCharcoal;
    public static Block blockApple;
    public static Block blockGoldApple;
    public static Block blockBook;
    public static Block blockEgg;
    public static Block blockEnderPearl;
    public static Block blockEnderEye;
    public static Block blockLead;
    public static Block blockReed;
    public static Block blockSeeds;
    public static Block blockStick;
    public static Block blockLeather;
    public static Block blockBucket;
    public static Block blockDye;
    public static Block blockFireball;
    public static Block blockSlimeball;
    public static Block blockRottenFlesh;
    public static Block blockPotato;
    public static Block blockNetherWart;
    public static Block blockGunpowder;
    public static Block blockCarrot;
    public static Block blockArrow;
    public static Block blockBlazeRod;
    public static Block blockFlint;
    public static Block blockBone;
    public static Block blockSugar;
    public static Block blockNetherStar;
    public static Block blockClay;
    public static Block blockString;
    public static Block blockFeather;
    public static Block blockBread;
    public static Block blockPorkchop;
    public static Block blockFish;
    public static Block blockCookie;
    public static Block blockBeef;
    public static Block blockPumpkinPie;
    public static Block blockGhastTear;
    public static Block blockSkull;
    public static Block blockMutton;
    public static Block blockRabbit;

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
        registerBlock(blockCharcoal, BlockNames.blockCharcoal);
        registerBlock(blockApple, BlockNames.blockApple);
        registerBlock(blockGoldApple, ItemBlockVariants.class, BlockNames.blockGoldAppleName);
        registerBlock(blockBook, BlockNames.blockBook);
        registerBlock(blockEgg, BlockNames.blockEgg);
        registerBlock(blockEnderPearl, BlockNames.blockEnderPearl);
        registerBlock(blockEnderEye, BlockNames.blockEnderEye);
        registerBlock(blockLead, BlockNames.blockLead);
        registerBlock(blockReed, BlockNames.blockReed);
        registerBlock(blockSeeds, BlockNames.blockSeedsName);
        registerBlock(blockStick, BlockNames.blockStick);
        registerBlock(blockLeather, BlockNames.blockLeather);
        registerBlock(blockBucket, BlockNames.blockBucket);
        registerBlock(blockDye, ItemBlockVariants.class, BlockNames.blockDyeName);
        registerBlock(blockFireball, BlockNames.blockFireball);
        registerBlock(blockSlimeball, BlockNames.blockSlimeball);
        registerBlock(blockRottenFlesh, BlockNames.blockRottenFlesh);
        registerBlock(blockPotato, BlockNames.blockPotato);
        registerBlock(blockNetherWart, BlockNames.blockNetherWart);
        registerBlock(blockGunpowder, BlockNames.blockGunpowder);
        registerBlock(blockCarrot, BlockNames.blockCarrot);
        registerBlock(blockArrow, BlockNames.blockArrow);
        registerBlock(blockBlazeRod, BlockNames.blockBlazeRod);
        registerBlock(blockFlint, BlockNames.blockFlint);
        registerBlock(blockBone, BlockNames.blockBone);
        registerBlock(blockSugar, BlockNames.blockSugar);
        registerBlock(blockNetherStar, BlockNames.blockNetherStar);
        registerBlock(blockClay, BlockNames.blockClay);
        registerBlock(blockString, BlockNames.blockString);
        registerBlock(blockFeather, BlockNames.blockFeather);
        registerBlock(blockBread, BlockNames.blockBread);
        registerBlock(blockPorkchop, BlockNames.blockPorkchopName);
        registerBlock(blockFish, ItemBlockVariants.class, BlockNames.blockFishName);
        registerBlock(blockCookie, BlockNames.blockCookie);
        registerBlock(blockBeef, ItemBlockVariants.class, BlockNames.blockBeefName);
        registerBlock(blockPumpkinPie, BlockNames.blockPumpkinPie);
        registerBlock(blockGhastTear, BlockNames.blockGhastTear);
        registerBlock(blockSkull, ItemBlockVariants.class, BlockNames.blockSkullName);
        registerBlock(blockMutton, ItemBlockVariants.class, BlockNames.blockMuttonName);
        registerBlock(blockRabbit, ItemBlockVariants.class, BlockNames.blockRabbitName);
    }

    public static void registerModels()
    {
        registerModel(blockCharcoal, BlockNames.blockCharcoal);
        registerModel(blockApple, BlockNames.blockApple);
        registerModel(blockGoldApple, 0, BlockNames.blockGoldApple[0]);
        registerModel(blockGoldApple, 1, BlockNames.blockGoldApple[1]);
        registerModel(blockBook, BlockNames.blockBook);
        registerModel(blockEgg, BlockNames.blockEgg);
        registerModel(blockEnderPearl, BlockNames.blockEnderPearl);
        registerModel(blockEnderEye, BlockNames.blockEnderEye);
        registerModel(blockLead, BlockNames.blockLead);
        registerModel(blockReed, BlockNames.blockReed);
        registerModel(blockSeeds, BlockNames.blockSeedsName);
        registerModel(blockStick, BlockNames.blockStick);
        registerModel(blockLeather, BlockNames.blockLeather);
        registerModel(blockBucket, BlockNames.blockBucket);
        registerModel(blockDye, 0, BlockNames.blockDye[0]);
        registerModel(blockDye, 1, BlockNames.blockDye[1]);
        registerModel(blockDye, 2, BlockNames.blockDye[2]);
        registerModel(blockDye, 3, BlockNames.blockDye[3]);
        registerModel(blockDye, 4, BlockNames.blockDye[4]);
        registerModel(blockDye, 5, BlockNames.blockDye[5]);
        registerModel(blockDye, 6, BlockNames.blockDye[6]);
        registerModel(blockDye, 7, BlockNames.blockDye[7]);
        registerModel(blockDye, 8, BlockNames.blockDye[8]);
        registerModel(blockDye, 9, BlockNames.blockDye[9]);
        registerModel(blockDye, 10, BlockNames.blockDye[10]);
        registerModel(blockDye, 11, BlockNames.blockDye[11]);
        registerModel(blockDye, 12, BlockNames.blockDye[12]);
        registerModel(blockDye, 13, BlockNames.blockDye[13]);
        registerModel(blockDye, 14, BlockNames.blockDye[14]);
        registerModel(blockFireball, BlockNames.blockFireball);
        registerModel(blockSlimeball, BlockNames.blockSlimeball);
        registerModel(blockRottenFlesh, BlockNames.blockRottenFlesh);
        registerModel(blockPotato, BlockNames.blockPotato);
        registerModel(blockNetherWart, BlockNames.blockNetherWart);
        registerModel(blockGunpowder, BlockNames.blockGunpowder);
        registerModel(blockCarrot, BlockNames.blockCarrot);
        registerModel(blockArrow, BlockNames.blockArrow);
        registerModel(blockBlazeRod, BlockNames.blockBlazeRod);
        registerModel(blockFlint, BlockNames.blockFlint);
        registerModel(blockBone, BlockNames.blockBone);
        registerModel(blockSugar, BlockNames.blockSugar);
        registerModel(blockNetherStar, BlockNames.blockNetherStar);
        registerModel(blockClay, BlockNames.blockClay);
        registerModel(blockString, BlockNames.blockString);
        registerModel(blockFeather, BlockNames.blockFeather);
        registerModel(blockBread, BlockNames.blockBread);
        registerModel(blockPorkchop, BlockNames.blockPorkchopName);
        registerModel(blockFish, 0, BlockNames.blockFish[0]);
        registerModel(blockFish, 1, BlockNames.blockFish[1]);
        registerModel(blockFish, 2, BlockNames.blockFish[2]);
        registerModel(blockFish, 3, BlockNames.blockFish[3]);
        registerModel(blockFish, 4, BlockNames.blockFish[4]);
        registerModel(blockFish, 5, BlockNames.blockFish[5]);
        registerModel(blockCookie, BlockNames.blockCookie);
        registerModel(blockBeef, 0, BlockNames.blockBeef[0]);
        registerModel(blockBeef, 1, BlockNames.blockBeef[1]);
        registerModel(blockPumpkinPie, BlockNames.blockPumpkinPie);
        registerModel(blockGhastTear, BlockNames.blockGhastTear);
        registerModel(blockSkull, 0, BlockNames.blockSkull[0]);
        registerModel(blockSkull, 1, BlockNames.blockSkull[1]);
        registerModel(blockSkull, 2, BlockNames.blockSkull[2]);
        registerModel(blockSkull, 3, BlockNames.blockSkull[3]);
        registerModel(blockMutton, 0, BlockNames.blockMutton[0]);
        registerModel(blockMutton, 1, BlockNames.blockMutton[1]);
        registerModel(blockRabbit, 0, BlockNames.blockRabbit[0]);
        registerModel(blockRabbit, 1, BlockNames.blockRabbit[1]);
    }

    public static void registerBlock(Block block, String name)
    {
        GameRegistry.registerBlock(block, name);
    }

    public static void registerBlock(Block block, Class<? extends ItemBlock> itemBlock, String name)
    {
        GameRegistry.registerBlock(block, itemBlock, name);
    }

    public static void registerModel(Block block, int meta, String name)
    {
        ModelHelper.getItemModelMesher().register(Item.getItemFromBlock(block), meta, new ModelResLocMSB(name));
        ModelBakery.addVariantName(Item.getItemFromBlock(block), new VariantNameMSB(name).getFullName());
    }

    public static void registerModel(Block block, String name)
    {
        registerModel(block, 0, name);
    }
}
