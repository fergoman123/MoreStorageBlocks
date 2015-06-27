package io.github.fergoman123.msb.proxy;

import io.github.fergoman123.fergoutil.helper.RegisterHelper;
import io.github.fergoman123.fergoutil.proxy.CommonProxy;
import io.github.fergoman123.msb.api.ModelEntryMSB;
import io.github.fergoman123.msb.event.OnItemTooltipEvent;
import io.github.fergoman123.msb.info.BlockNames;
import io.github.fergoman123.msb.init.ModBlocks;

public class ClientProxy extends CommonProxy {

    @Override
    public void registerTileEntities() {

    }

    @Override
    public void registerRenderers() {
        RegisterHelper.registerModel(new ModelEntryMSB(ModBlocks.blockCharcoal, BlockNames.blockCharcoal));
        RegisterHelper.registerModel(new ModelEntryMSB(ModBlocks.blockApple, BlockNames.blockApple));
        ModelEntryMSB[] blockGoldApple = new ModelEntryMSB[BlockNames.blockGoldApple.length];
        for (int i = 0; i < blockGoldApple.length; i++) {
            blockGoldApple[i] = new ModelEntryMSB(ModBlocks.blockGoldApple, i, BlockNames.blockGoldApple[i]);
            RegisterHelper.registerModel(blockGoldApple[i]);
        }
        RegisterHelper.registerModel(new ModelEntryMSB(ModBlocks.blockBook, BlockNames.blockBook));
        RegisterHelper.registerModel(new ModelEntryMSB(ModBlocks.blockEgg, BlockNames.blockEgg));
        RegisterHelper.registerModel(new ModelEntryMSB(ModBlocks.blockEnderPearl, BlockNames.blockEnderPearl));
        RegisterHelper.registerModel(new ModelEntryMSB(ModBlocks.blockEnderEye, BlockNames.blockEnderEye));
        RegisterHelper.registerModel(new ModelEntryMSB(ModBlocks.blockLead, BlockNames.blockLead));
        RegisterHelper.registerModel(new ModelEntryMSB(ModBlocks.blockReed, BlockNames.blockReed));
        ModelEntryMSB[] blockSeeds = new ModelEntryMSB[BlockNames.blockSeeds.length];
        for (int i = 0; i < blockSeeds.length; i++) {
            blockSeeds[i] = new ModelEntryMSB(ModBlocks.blockSeeds, i, BlockNames.blockSeeds[i]);
            RegisterHelper.registerModel(blockSeeds[i]);
        }
        RegisterHelper.registerModel(new ModelEntryMSB(ModBlocks.blockStick, BlockNames.blockStick));
        RegisterHelper.registerModel(new ModelEntryMSB(ModBlocks.blockLeather, BlockNames.blockLeather));
        RegisterHelper.registerModel(new ModelEntryMSB(ModBlocks.blockBucket, BlockNames.blockBucket));
        ModelEntryMSB[] blockDye = new ModelEntryMSB[BlockNames.blockDye.length];
        for (int i = 0; i < blockDye.length; i++) {
            blockDye[i] = new ModelEntryMSB(ModBlocks.blockDye, i, BlockNames.blockDye[i]);
            RegisterHelper.registerModel(blockDye[i]);
        }
        RegisterHelper.registerModel(new ModelEntryMSB(ModBlocks.blockFireball, BlockNames.blockFireball));
        RegisterHelper.registerModel(new ModelEntryMSB(ModBlocks.blockSlimeball, BlockNames.blockSlimeball));
        RegisterHelper.registerModel(new ModelEntryMSB(ModBlocks.blockRottenFlesh, BlockNames.blockRottenFlesh));
        RegisterHelper.registerModel(new ModelEntryMSB(ModBlocks.blockPotato, BlockNames.blockPotato));
        RegisterHelper.registerModel(new ModelEntryMSB(ModBlocks.blockNetherWart, BlockNames.blockNetherWart));
        RegisterHelper.registerModel(new ModelEntryMSB(ModBlocks.blockGunpowder, BlockNames.blockGunpowder));
        RegisterHelper.registerModel(new ModelEntryMSB(ModBlocks.blockCarrot, BlockNames.blockCarrot));
        RegisterHelper.registerModel(new ModelEntryMSB(ModBlocks.blockArrow, BlockNames.blockArrow));
        RegisterHelper.registerModel(new ModelEntryMSB(ModBlocks.blockBlazeRod, BlockNames.blockBlazeRod));
        RegisterHelper.registerModel(new ModelEntryMSB(ModBlocks.blockFlint, BlockNames.blockFlint));
        RegisterHelper.registerModel(new ModelEntryMSB(ModBlocks.blockBone, BlockNames.blockBone));
        RegisterHelper.registerModel(new ModelEntryMSB(ModBlocks.blockSugar, BlockNames.blockSugar));
        RegisterHelper.registerModel(new ModelEntryMSB(ModBlocks.blockNetherStar, BlockNames.blockNetherStar));
        RegisterHelper.registerModel(new ModelEntryMSB(ModBlocks.blockClay, BlockNames.blockClay));
        RegisterHelper.registerModel(new ModelEntryMSB(ModBlocks.blockString, BlockNames.blockString));
        RegisterHelper.registerModel(new ModelEntryMSB(ModBlocks.blockFeather, BlockNames.blockFeather));
        RegisterHelper.registerModel(new ModelEntryMSB(ModBlocks.blockBread, BlockNames.blockBread));
        ModelEntryMSB[] blockPorkchop = new ModelEntryMSB[BlockNames.blockPorkchop.length];
        for (int i = 0; i < blockPorkchop.length; i++) {
            blockPorkchop[i] = new ModelEntryMSB(ModBlocks.blockPorkchop, i, BlockNames.blockPorkchop[i]);
            RegisterHelper.registerModel(blockPorkchop[i]);
        }
        ModelEntryMSB[] blockFish = new ModelEntryMSB[BlockNames.blockFish.length];
        for (int i = 0; i < blockFish.length; i++) {
            blockFish[i] = new ModelEntryMSB(ModBlocks.blockFish, i, BlockNames.blockFish[i]);
        }
        RegisterHelper.registerModel(new ModelEntryMSB(ModBlocks.blockCookie, BlockNames.blockCookie));
        ModelEntryMSB[] blockBeef = new ModelEntryMSB[BlockNames.blockBeef.length];
        for (int i = 0; i < blockBeef.length; i++) {
            blockBeef[i] = new ModelEntryMSB(ModBlocks.blockBeef, i, BlockNames.blockBeef[i]);
            RegisterHelper.registerModel(blockBeef[i]);
        }
        RegisterHelper.registerModel(new ModelEntryMSB(ModBlocks.blockPumpkinPie, BlockNames.blockPumpkinPie));
        RegisterHelper.registerModel(new ModelEntryMSB(ModBlocks.blockGhastTear, BlockNames.blockGhastTear));
        ModelEntryMSB[] blockSkull = new ModelEntryMSB[BlockNames.blockSkull.length];
        for (int i = 0; i < blockSkull.length; i++) {
            blockSkull[i] = new ModelEntryMSB(ModBlocks.blockSkull, i, BlockNames.blockSkull[i]);
            RegisterHelper.registerModel(blockSkull[i]);
        }
        ModelEntryMSB[] blockMutton = new ModelEntryMSB[BlockNames.blockMutton.length];
        for (int i = 0; i < blockMutton.length; i++) {
            blockMutton[i] = new ModelEntryMSB(ModBlocks.blockMutton, i, BlockNames.blockMutton[i]);
            RegisterHelper.registerModel(blockMutton[i]);
        }
        ModelEntryMSB[] blockRabbit = new ModelEntryMSB[BlockNames.blockRabbit.length];
        for (int i = 0; i < blockRabbit.length; i++) {
            blockRabbit[i] = new ModelEntryMSB(ModBlocks.blockRabbit, i, BlockNames.blockRabbit[i]);
            RegisterHelper.registerModel(blockRabbit[i]);
        }
    }

    @Override
    public void registerEventHandlers()
    {
        RegisterHelper.registerEvent(OnItemTooltipEvent.instance);
    }


}
