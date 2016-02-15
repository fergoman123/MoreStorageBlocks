package io.github.fergoman123.msb.init;

import io.github.fergoman123.fergoutil.model.ModelHelper;
import io.github.fergoman123.msb.block.*;
import io.github.fergoman123.msb.info.BlockNames;
import io.github.fergoman123.msb.item.ItemBlockMultiMSB;
import net.minecraft.block.Block;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModBlocks {
    public static Block blockCharcoal;
    public static Block blockApple;
    public static Block blockGoldApple;
    public static Block blockBook;
    public static Block blockEgg;
    public static Block blockEnder;
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
    public static Block blockNether;
    public static Block blockGunpowder;
    public static Block blockCarrot;
    public static Block blockArrow;
    public static Block blockBlazeRod;
    public static Block blockFlint;
    public static Block blockBone;
    public static Block blockSugar;
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
    public static Block blockCompCobble;
    public static Block blockCompSand;
    public static Block blockCompGravel;

    public static void addBlocks() {
        blockCharcoal = new BlockMSB(BlockNames.blockCharcoal);
        blockApple = new BlockMSB(BlockNames.blockApple);
        blockGoldApple = new BlockGoldApple(BlockNames.blockGoldApple);
        blockBook = new BlockMSB(BlockNames.blockBook);
        blockEgg = new BlockMSB(BlockNames.blockEgg);
        blockEnder = new BlockEnder(BlockNames.blockEnder);
        blockLead = new BlockMSB(BlockNames.blockLead);
        blockReed = new BlockMSB(BlockNames.blockReed);
        blockSeeds = new BlockSeeds(BlockNames.blockSeeds);
        blockStick = new BlockMSB(BlockNames.blockStick);
        blockLeather = new BlockMSB(BlockNames.blockLeather);
        blockBucket = new BlockMSB(BlockNames.blockBucket);
        blockDye = new BlockDye(BlockNames.blockDye);
        blockFireball = new BlockMSB(BlockNames.blockFireball);
        blockSlimeball = new BlockMSB(BlockNames.blockSlimeball);
        blockRottenFlesh = new BlockMSB(BlockNames.blockRottenFlesh);
        blockPotato = new BlockMSB(BlockNames.blockPotato);
        blockNether = new BlockNether(BlockNames.blockNether);
        blockGunpowder = new BlockMSB(BlockNames.blockGunpowder);
        blockCarrot = new BlockMSB(BlockNames.blockCarrot);
        blockArrow = new BlockMSB(BlockNames.blockArrow);
        blockBlazeRod = new BlockMSB(BlockNames.blockBlazeRod);
        blockFlint = new BlockMSB(BlockNames.blockFlint);
        blockBone = new BlockMSB(BlockNames.blockBone);
        blockSugar = new BlockMSB(BlockNames.blockSugar);
        blockClay = new BlockMSB(BlockNames.blockClay);
        blockString = new BlockMSB(BlockNames.blockString);
        blockFeather = new BlockMSB(BlockNames.blockFeather);
        blockBread = new BlockMSB(BlockNames.blockBread);
        blockPorkchop = new BlockPorkchop(BlockNames.blockPorkchop);
        blockFish = new BlockFish(BlockNames.blockFish);
        blockCookie = new BlockMSB(BlockNames.blockCookie);
        blockBeef = new BlockBeef(BlockNames.blockBeef);
        blockPumpkinPie = new BlockMSB(BlockNames.blockPumpkinPie);
        blockGhastTear = new BlockMSB(BlockNames.blockGhastTear);
        blockSkull = new BlockSkullStorage(BlockNames.blockSkull);
        blockMutton = new BlockMutton(BlockNames.blockMutton);
        blockRabbit = new BlockRabbit(BlockNames.blockRabbit);
        blockCompCobble = new BlockCompCobble(BlockNames.blockCompCobble);
        blockCompSand = new BlockCompSand(BlockNames.blockCompSand);
        blockCompGravel = new BlockCompGravel(BlockNames.blockCompGravel);
    }

    public static void registerBlocks() {
        GameRegistry.registerBlock(blockCharcoal, BlockNames.blockCharcoal);
        GameRegistry.registerBlock(blockApple, BlockNames.blockApple);
        GameRegistry.registerBlock(blockGoldApple, ItemBlockMultiMSB.class, BlockNames.blockGoldApple);
        GameRegistry.registerBlock(blockBook, BlockNames.blockBook);
        GameRegistry.registerBlock(blockEgg, BlockNames.blockEgg);
        GameRegistry.registerBlock(blockEnder, ItemBlockMultiMSB.class, BlockNames.blockEnder);
        GameRegistry.registerBlock(blockLead, BlockNames.blockLead);
        GameRegistry.registerBlock(blockReed, BlockNames.blockReed);
        GameRegistry.registerBlock(blockSeeds, ItemBlockMultiMSB.class, BlockNames.blockSeeds);
        GameRegistry.registerBlock(blockStick, BlockNames.blockStick);
        GameRegistry.registerBlock(blockLeather, BlockNames.blockLeather);
        GameRegistry.registerBlock(blockBucket, BlockNames.blockBucket);
        GameRegistry.registerBlock(blockDye, ItemBlockMultiMSB.class, BlockNames.blockDye);
        GameRegistry.registerBlock(blockFireball, BlockNames.blockFireball);
        GameRegistry.registerBlock(blockSlimeball, BlockNames.blockSlimeball);
        GameRegistry.registerBlock(blockRottenFlesh, BlockNames.blockRottenFlesh);
        GameRegistry.registerBlock(blockPotato, BlockNames.blockPotato);
        GameRegistry.registerBlock(blockNether, ItemBlockMultiMSB.class, BlockNames.blockNether);
        GameRegistry.registerBlock(blockGunpowder, BlockNames.blockGunpowder);
        GameRegistry.registerBlock(blockCarrot, BlockNames.blockCarrot);
        GameRegistry.registerBlock(blockArrow, BlockNames.blockBlazeRod);
        GameRegistry.registerBlock(blockBlazeRod, BlockNames.blockBlazeRod);
        GameRegistry.registerBlock(blockFlint, BlockNames.blockFlint);
        GameRegistry.registerBlock(blockBone, BlockNames.blockBone);
        GameRegistry.registerBlock(blockSugar, BlockNames.blockSugar);
        GameRegistry.registerBlock(blockClay, BlockNames.blockClay);
        GameRegistry.registerBlock(blockString, BlockNames.blockString);
        GameRegistry.registerBlock(blockFeather, BlockNames.blockFeather);
        GameRegistry.registerBlock(blockBread, BlockNames.blockBread);
        GameRegistry.registerBlock(blockPorkchop, ItemBlockMultiMSB.class, BlockNames.blockPorkchop);
        GameRegistry.registerBlock(blockCookie, BlockNames.blockCookie);
        GameRegistry.registerBlock(blockBeef, ItemBlockMultiMSB.class, BlockNames.blockBeef);
        GameRegistry.registerBlock(blockPumpkinPie, BlockNames.blockPumpkinPie);
        GameRegistry.registerBlock(blockGhastTear, BlockNames.blockGhastTear);
        GameRegistry.registerBlock(blockSkull, ItemBlockMultiMSB.class, BlockNames.blockSkull);
        GameRegistry.registerBlock(blockMutton, ItemBlockMultiMSB.class, BlockNames.blockMutton);
        GameRegistry.registerBlock(blockRabbit, ItemBlockMultiMSB.class, BlockNames.blockRabbit);
        GameRegistry.registerBlock(blockCompCobble, ItemBlockMultiMSB.class, BlockNames.blockCompCobble);
        GameRegistry.registerBlock(blockCompSand, ItemBlockMultiMSB.class, BlockNames.blockCompSand);
        GameRegistry.registerBlock(blockCompGravel, ItemBlockMultiMSB.class, BlockNames.blockCompGravel);

        register(blockCharcoal, BlockNames.blockCharcoal);
        register(blockApple, BlockNames.blockApple);
        for(int i = 0; i < BlockGoldApple.EnumType.getNames().length; i++){
            register(blockGoldApple, i, BlockGoldApple.EnumType.getNames()[i]);
        }
        register(blockBook, BlockNames.blockBook);
        register(blockEgg, BlockNames.blockEgg);
        for (int i = 0; i < BlockEnder.EnumType.values().length; i++) {
            register(blockEnder, i, BlockEnder.EnumType.getNames()[i]);
        }
        register(blockLead, BlockNames.blockLead);
        register(blockReed, BlockNames.blockReed);
        for (int i = 0; i < BlockSeeds.EnumType.getNames().length; i++) {
            register(blockSeeds, i, BlockSeeds.EnumType.getNames()[i]);
        }
        register(blockStick, BlockNames.blockStick);
        register(blockLeather, BlockNames.blockLeather);
        register(blockBucket, BlockNames.blockBucket);
        for (int i = 0; i < BlockDye.EnumType.getNames().length; i++) {
            register(blockDye, i, BlockDye.EnumType.getNames()[i]);
        }
        register(blockFireball, BlockNames.blockFireball);
        register(blockSlimeball, BlockNames.blockSlimeball);
        register(blockRottenFlesh, BlockNames.blockRottenFlesh);
        register(blockPotato, BlockNames.blockPotato);
        for (int i = 0; i < BlockNether.EnumType.getNames().length; i++) {
            register(blockNether, i, BlockNether.EnumType.getNames()[i]);
        }
        register(blockGunpowder, BlockNames.blockGunpowder);
        register(blockCarrot, BlockNames.blockCarrot);
        register(blockArrow, BlockNames.blockArrow);
        register(blockBlazeRod, BlockNames.blockBlazeRod);
        register(blockFlint, BlockNames.blockFlint);
        register(blockBone, BlockNames.blockBone);
        register(blockSugar, BlockNames.blockSugar);
        register(blockClay, BlockNames.blockClay);
        register(blockString, BlockNames.blockString);
        register(blockFeather, BlockNames.blockFeather);
        register(blockBread, BlockNames.blockBread);
        for (int i = 0; i < BlockPorkchop.EnumType.getNames().length; i++) {
            register(blockPorkchop, i, BlockPorkchop.EnumType.getNames()[i]);
        }
        for (int i = 0; i < BlockFish.EnumType.getNames().length; i++) {
            register(blockFish, i, BlockFish.EnumType.getNames()[i]);
        }
        register(blockCookie, BlockNames.blockCookie);
        for (int i = 0; i < BlockBeef.EnumType.getNames().length; i++) {
            register(blockBeef, i, BlockBeef.EnumType.getNames()[i]);
        }
        register(blockPumpkinPie, BlockNames.blockPumpkinPie);
        register(blockGhastTear, BlockNames.blockGhastTear);
        for (int i = 0; i < BlockSkullStorage.EnumType.getNames().length; i++) {
            register(blockSkull, i, BlockSkullStorage.EnumType.getNames()[i]);
        }

        for (int i = 0; i < BlockMutton.EnumType.getNames().length; i++) {
            register(blockMutton, i, BlockMutton.EnumType.getNames()[i]);
        }
        for (int i = 0; i < BlockRabbit.EnumType.getNames().length; i++) {
            register(blockRabbit, i, BlockRabbit.EnumType.getNames()[i]);
        }
        for (int i = 0; i < BlockCompCobble.EnumType.getNames().length; i++){
            register(blockCompCobble, i, BlockCompCobble.EnumType.getNames()[i]);
        }
        for (int i = 0; i < BlockCompSand.EnumType.getNames().length; i++) {
            register(blockCompSand, i, BlockCompSand.EnumType.getNames()[i]);
        }
        for (int i = 0; i < BlockCompGravel.EnumType.getNames().length; i++) {
            register(blockCompGravel, i, BlockCompGravel.EnumType.getNames()[i]);
        }
    }

    public static void register(Block block, int meta, String name) {
        ModelHelper.register(block, meta, new ModelResourceLocation("msb:" + name, "inventory"));
    }

    public static void register(Block block, String name){
        ModelHelper.register(block, 0, new ModelResourceLocation("msb:" + name, "inventory"));
    }

    public static void variant(Block block, String name){
        ModelHelper.variant(block, new ResourceLocation("msb:" + name));
    }
}
