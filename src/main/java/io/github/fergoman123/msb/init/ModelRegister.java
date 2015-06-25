/*
 * More Storage Blocks
 * Copyright (c) 2014 fergoman123.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Lesser Public License v2.1
 * which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/gpl-3.0.html
 */

package io.github.fergoman123.msb.init;

import io.github.fergoman123.msb.info.BlockNames;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.ItemModelMesher;
import net.minecraft.client.resources.model.ModelBakery;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;

public class ModelRegister
{

    public void registerModels()
    {
        register(ModBlocks.blockCharcoal, BlockNames.blockCharcoal);
        register(ModBlocks.blockApple, BlockNames.blockApple);
        register(ModBlocks.blockGoldApple, 0, BlockNames.blockGoldApple[0]);
        register(ModBlocks.blockGoldApple, 1, BlockNames.blockGoldApple[1]);
        register(ModBlocks.blockBook, BlockNames.blockBook);
        register(ModBlocks.blockEgg, BlockNames.blockEgg);
        register(ModBlocks.blockEnderPearl, BlockNames.blockEnderPearl);
        register(ModBlocks.blockEnderEye, BlockNames.blockEnderEye);
        register(ModBlocks.blockLead, BlockNames.blockLead);
        register(ModBlocks.blockReed, BlockNames.blockReed);
        register(ModBlocks.blockSeeds, 0, BlockNames.blockSeeds[0]);
        register(ModBlocks.blockSeeds, 1, BlockNames.blockSeeds[1]);
        register(ModBlocks.blockSeeds, 2, BlockNames.blockSeeds[2]);
        register(ModBlocks.blockStick, BlockNames.blockStick);
        register(ModBlocks.blockLeather, BlockNames.blockLeather);
        register(ModBlocks.blockBucket, BlockNames.blockBucket);
        register(ModBlocks.blockDye, 0, BlockNames.blockDye[0]);
        register(ModBlocks.blockDye, 1, BlockNames.blockDye[1]);
        register(ModBlocks.blockDye, 2, BlockNames.blockDye[2]);
        register(ModBlocks.blockDye, 3, BlockNames.blockDye[3]);
        register(ModBlocks.blockDye, 4, BlockNames.blockDye[4]);
        register(ModBlocks.blockDye, 5, BlockNames.blockDye[5]);
        register(ModBlocks.blockDye, 6, BlockNames.blockDye[6]);
        register(ModBlocks.blockDye, 7, BlockNames.blockDye[7]);
        register(ModBlocks.blockDye, 8, BlockNames.blockDye[8]);
        register(ModBlocks.blockDye, 9, BlockNames.blockDye[9]);
        register(ModBlocks.blockDye, 10, BlockNames.blockDye[10]);
        register(ModBlocks.blockDye, 11, BlockNames.blockDye[11]);
        register(ModBlocks.blockDye, 12, BlockNames.blockDye[12]);
        register(ModBlocks.blockDye, 13, BlockNames.blockDye[13]);
        register(ModBlocks.blockDye, 14, BlockNames.blockDye[14]);
        register(ModBlocks.blockFireball, BlockNames.blockFireball);
        register(ModBlocks.blockSlimeball, BlockNames.blockSlimeball);
        register(ModBlocks.blockRottenFlesh, BlockNames.blockRottenFlesh);
        register(ModBlocks.blockPotato, BlockNames.blockPotato);
        register(ModBlocks.blockNetherWart, BlockNames.blockNetherWart);
        register(ModBlocks.blockGunpowder, BlockNames.blockGunpowder);
        register(ModBlocks.blockCarrot, BlockNames.blockCarrot);
        register(ModBlocks.blockArrow, BlockNames.blockArrow);
        register(ModBlocks.blockBlazeRod, BlockNames.blockBlazeRod);
        register(ModBlocks.blockFlint, BlockNames.blockFlint);
        register(ModBlocks.blockBone, BlockNames.blockBone);
        register(ModBlocks.blockSugar, BlockNames.blockSugar);
        register(ModBlocks.blockNetherStar, BlockNames.blockNetherStar);
        register(ModBlocks.blockClay, BlockNames.blockClay);
        register(ModBlocks.blockString, BlockNames.blockString);
        register(ModBlocks.blockFeather, BlockNames.blockFeather);
        register(ModBlocks.blockBread, BlockNames.blockBread);
        register(ModBlocks.blockPorkchop, 0, BlockNames.blockPorkchop[0]);
        register(ModBlocks.blockPorkchop, 1, BlockNames.blockPorkchop[1]);
        register(ModBlocks.blockFish, 0, BlockNames.blockFish[0]);
        register(ModBlocks.blockFish, 1, BlockNames.blockFish[1]);
        register(ModBlocks.blockFish, 2, BlockNames.blockFish[2]);
        register(ModBlocks.blockFish, 3, BlockNames.blockFish[3]);
        register(ModBlocks.blockFish, 4, BlockNames.blockFish[4]);
        register(ModBlocks.blockFish, 5, BlockNames.blockFish[5]);
        register(ModBlocks.blockCookie, BlockNames.blockCookie);
        register(ModBlocks.blockBeef, 0, BlockNames.blockBeef[0]);
        register(ModBlocks.blockBeef, 1, BlockNames.blockBeef[1]);
        register(ModBlocks.blockPumpkinPie, BlockNames.blockPumpkinPie);
        register(ModBlocks.blockGhastTear, BlockNames.blockGhastTear);
        register(ModBlocks.blockSkull, 0, BlockNames.blockSkull[0]);
        register(ModBlocks.blockSkull, 1, BlockNames.blockSkull[1]);
        register(ModBlocks.blockSkull, 2, BlockNames.blockSkull[2]);
        register(ModBlocks.blockSkull, 3, BlockNames.blockSkull[3]);
        register(ModBlocks.blockMutton, 0, BlockNames.blockMutton[0]);
        register(ModBlocks.blockMutton, 1, BlockNames.blockMutton[1]);
        register(ModBlocks.blockRabbit, 0, BlockNames.blockRabbit[0]);
        register(ModBlocks.blockRabbit, 1, BlockNames.blockRabbit[1]);

        addVariantName(ModBlocks.blockCharcoal, BlockNames.blockCharcoal);
        addVariantName(ModBlocks.blockApple, BlockNames.blockApple);
        addVariantName(ModBlocks.blockGoldApple, BlockNames.blockGoldApple);
        addVariantName(ModBlocks.blockBook, BlockNames.blockBook);
        addVariantName(ModBlocks.blockEgg, BlockNames.blockEgg);
        addVariantName(ModBlocks.blockEnderPearl, BlockNames.blockEnderPearl);
        addVariantName(ModBlocks.blockEnderEye, BlockNames.blockEnderEye);
        addVariantName(ModBlocks.blockLead, BlockNames.blockLead);
        addVariantName(ModBlocks.blockReed, BlockNames.blockReed);
        addVariantName(ModBlocks.blockSeeds, BlockNames.blockSeeds);
        addVariantName(ModBlocks.blockStick, BlockNames.blockStick);
        addVariantName(ModBlocks.blockLeather, BlockNames.blockLeather);
        addVariantName(ModBlocks.blockBucket, BlockNames.blockBucket);
        addVariantName(ModBlocks.blockDye, BlockNames.blockDye);
        addVariantName(ModBlocks.blockFireball, BlockNames.blockFireball);
        addVariantName(ModBlocks.blockSlimeball, BlockNames.blockSlimeball);
        addVariantName(ModBlocks.blockRottenFlesh, BlockNames.blockRottenFlesh);
        addVariantName(ModBlocks.blockPotato, BlockNames.blockPotato);
        addVariantName(ModBlocks.blockNetherWart, BlockNames.blockNetherWart);
        addVariantName(ModBlocks.blockGunpowder, BlockNames.blockGunpowder);
        addVariantName(ModBlocks.blockCarrot, BlockNames.blockCarrot);
        addVariantName(ModBlocks.blockArrow, BlockNames.blockArrow);
        addVariantName(ModBlocks.blockBlazeRod, BlockNames.blockBlazeRod);
        addVariantName(ModBlocks.blockFlint, BlockNames.blockFlint);
        addVariantName(ModBlocks.blockBone, BlockNames.blockBone);
        addVariantName(ModBlocks.blockSugar, BlockNames.blockSugar);
        addVariantName(ModBlocks.blockNetherStar, BlockNames.blockNetherStar);
        addVariantName(ModBlocks.blockClay, BlockNames.blockClay);
        addVariantName(ModBlocks.blockString, BlockNames.blockString);
        addVariantName(ModBlocks.blockFeather, BlockNames.blockFeather);
        addVariantName(ModBlocks.blockBread, BlockNames.blockBread);
        addVariantName(ModBlocks.blockPorkchop, BlockNames.blockPorkchop);
        addVariantName(ModBlocks.blockFish, BlockNames.blockFish);
        addVariantName(ModBlocks.blockCookie, BlockNames.blockCookie);
        addVariantName(ModBlocks.blockBeef, BlockNames.blockBeef);
        addVariantName(ModBlocks.blockPumpkinPie, BlockNames.blockPumpkinPie);
        addVariantName(ModBlocks.blockGhastTear, BlockNames.blockGhastTear);
        addVariantName(ModBlocks.blockSkull, BlockNames.blockSkull);
        addVariantName(ModBlocks.blockMutton, BlockNames.blockMutton);
        addVariantName(ModBlocks.blockRabbit, BlockNames.blockRabbit);

    }

    private void register(Block block, int meta, String name) {
        ItemModelMesher mesher = Minecraft.getMinecraft().getRenderItem().getItemModelMesher();
        mesher.register(Item.getItemFromBlock(block), meta, new ModelResourceLocation("msb:" + name, "inventory"));
    }

    private void register(Block block, String name){
        register(block, 0, name);
    }

    private void addVariantName(Block block, String name){
        ModelBakery.addVariantName(Item.getItemFromBlock(block), name);
    }

    private void addVariantName(Block block, String[] names)
    {
        for (String name : names) {
            ModelBakery.addVariantName(Item.getItemFromBlock(block), "msb:" + name);
        }
    }
}
