package io.github.fergoman123.msb;

import io.github.fergoman123.msb.api.ModelResLocMSB;
import io.github.fergoman123.msb.info.BlockNames;
import io.github.fergoman123.msb.init.ModBlocks;
import io.github.fergoman123.msb.item.IBMSB;
import io.github.fergoman123.msb.item.ItemBlockMSB;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelBakery;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;

import static io.github.fergoman123.msb.init.ModBlocks.*;

public class BlockRegister{

    public static void registerBlocks(){
        register(blockCharcoal, BlockNames.blockCharcoal);
        register(blockApple, BlockNames.blockApple);
        register(blockGoldApple, BlockNames.blockGoldAppleName, BlockNames.blockGoldApple);
        register(blockBook, BlockNames.blockBook);
        register(blockEgg, BlockNames.blockEgg);
        register(blockEnderPearl, BlockNames.blockEnderPearl);
        register(blockEnderEye, BlockNames.blockEnderEye);
        register(blockLead, BlockNames.blockLead);
        register(blockReed, BlockNames.blockReed);
        register(blockSeeds, BlockNames.blockSeedsName, BlockNames.blockSeeds);
        register(blockStick, BlockNames.blockStick);
        register(blockLeather, BlockNames.blockLeather);
        register(blockBucket, BlockNames.blockBucket);
        register(blockDye, BlockNames.blockDyeName, BlockNames.blockDye);
        register(blockFireball, BlockNames.blockFireball);
        register(blockSlimeball, BlockNames.blockSlimeball);
        register(blockRottenFlesh, BlockNames.blockRottenFlesh);
        register(blockPotato, BlockNames.blockPotato);
        register(blockNetherWart, BlockNames.blockNetherWart);
        register(blockGunpowder, BlockNames.blockGunpowder);
        register(blockCarrot, BlockNames.blockCarrot);
        register(blockArrow, BlockNames.blockArrow);
        register(blockBlazeRod, BlockNames.blockBlazeRod);
        register(blockFlint, BlockNames.blockFlint);
        register(blockBone, BlockNames.blockBone);
        register(blockSugar, BlockNames.blockSugar);
        register(blockNetherStar, BlockNames.blockNetherStar);
        register(blockClay, BlockNames.blockClay);
        register(blockString, BlockNames.blockString);
        register(blockFeather, BlockNames.blockFeather);
        register(blockBread, BlockNames.blockBread);
        register(blockPorkchop, BlockNames.blockPorkchopName, BlockNames.blockPorkchop);
        register(blockFish, BlockNames.blockFishName, BlockNames.blockFish);
        register(blockCookie, BlockNames.blockCookie);
        register(blockBeef, BlockNames.blockBeefName, BlockNames.blockBeef);
        register(blockPumpkinPie, BlockNames.blockPumpkinPie);
        register(blockGhastTear, BlockNames.blockGhastTear);
        register(blockSkull, BlockNames.blockSkullName, BlockNames.blockSkull);
        register(blockMutton, BlockNames.blockMuttonName, BlockNames.blockMutton);
        register(blockRabbit, BlockNames.blockRabbitName, BlockNames.blockRabbit);
    }

    public static void register(Block block, String name){
        GameRegistry.registerBlock(block, IBMSB.class, name);
        OreDictionary.registerOre(name, block);
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0, new ModelResLocMSB(name));
        ModelBakery.addVariantName(Item.getItemFromBlock(block), "msb:" + name);
    }

    public static void register(Block block, String name, String[] names){
        GameRegistry.registerBlock(block, ItemBlockMSB.class, name);
        for (int i = 0; i < names.length; i++) {
            OreDictionary.registerOre(names[i], new ItemStack(block, 1, i));
            Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), i, new ModelResLocMSB(names[i]));
            ModelBakery.addVariantName(Item.getItemFromBlock(block), "msb:" + names[i]);
        }
    }
}
