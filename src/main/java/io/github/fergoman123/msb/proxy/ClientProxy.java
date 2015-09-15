package io.github.fergoman123.msb.proxy;

import io.github.fergoman123.fergoutil.proxy.CommonProxy;
import io.github.fergoman123.msb.block.*;
import io.github.fergoman123.msb.block.BlockMultiMSB.ItemBlockMSB;
import io.github.fergoman123.msb.info.BlockNames;

import static io.github.fergoman123.msb.helper.MSBHelper.register;
import static io.github.fergoman123.msb.init.ModBlocks.*;

public class ClientProxy extends CommonProxy {
    @Override
    public void preInit() {
        blockCharcoal = new BlockMSB(BlockNames.blockCharcoal);
        blockApple = new BlockMSB(BlockNames.blockApple);
        blockGoldApple = new BlockGoldApple(BlockNames.blockGoldAppleName);
        blockBook = new BlockMSB(BlockNames.blockBook);
        blockEgg = new BlockMSB(BlockNames.blockEgg);
        blockEnderPearl = new BlockMSB(BlockNames.blockEnderPearl);
        blockEnderEye = new BlockMSB(BlockNames.blockEnderEye);
        blockLead = new BlockMSB(BlockNames.blockLead);
        blockReed = new BlockMSB(BlockNames.blockReed);
        blockSeeds = new BlockSeeds(BlockNames.blockSeedsName);
        blockStick = new BlockMSB(BlockNames.blockStick);
        blockLeather = new BlockMSB(BlockNames.blockLeather);
        blockBucket = new BlockMSB(BlockNames.blockBucket);
        blockDye = new BlockDye(BlockNames.blockDyeName);
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
        blockPorkchop = new BlockPorkchop(BlockNames.blockPorkchopName);
        blockFish = new BlockFish(BlockNames.blockFishName);
        blockCookie = new BlockMSB(BlockNames.blockCookie);
        blockBeef = new BlockBeef(BlockNames.blockBeefName);
        blockPumpkinPie = new BlockMSB(BlockNames.blockPumpkinPie);
        blockGhastTear = new BlockMSB(BlockNames.blockGhastTear);
        blockSkull = new BlockSkullStorage(BlockNames.blockSkullName);
        blockMutton = new BlockMutton(BlockNames.blockMuttonName);
        blockRabbit = new BlockRabbit(BlockNames.blockRabbitName);

        blockCompCobble = new BlockCompCobble(BlockNames.compCobbleName);
    }

    @Override
    public void init() {
        register(blockCharcoal);
        register(blockApple);
        register(blockGoldApple);
        register(blockBook);
        register(blockEgg);
        register(blockEnderPearl);
        register(blockEnderEye);
        register(blockLead);
        register(blockReed);
        register(blockSeeds);
        register(blockStick);
        register(blockLeather);
        register(blockBucket);
        register(blockDye);
        register(blockFireball);
        register(blockSlimeball);
        register(blockRottenFlesh);
        register(blockPotato);
        register(blockNetherWart);
        register(blockGunpowder);
        register(blockCarrot);
        register(blockArrow);
    }

    @Override
    public void postInit() {

    }

    public }
