package io.github.fergoman123.msb.init;

import io.github.fergoman123.fergoutil.item.ItemBlockVariants;
import io.github.fergoman123.fergoutil.model.ModelHelper;
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
    public static final Block blockCharcoal = new BlockMSB(BlockNames.blockCharcoal);
    public static final Block blockApple = new BlockMSB(BlockNames.blockApple);
    public static final Block blockGoldApple = new BlockGoldApple();
    public static final Block blockBook = new BlockMSB(BlockNames.blockBook);
    public static final Block blockEgg = new BlockMSB(BlockNames.blockEgg);
    public static final Block blockEnderPearl = new BlockMSB(BlockNames.blockEnderPearl);
    public static final Block blockEnderEye = new BlockMSB(BlockNames.blockEnderEye);
    public static final Block blockLead = new BlockMSB(BlockNames.blockLead);
    public static final Block blockReed = new BlockMSB(BlockNames.blockReed);
    public static final Block blockSeeds = new BlockSeeds();
    public static final Block blockStick = new BlockMSB(BlockNames.blockStick);
    public static final Block blockLeather = new BlockMSB(BlockNames.blockLeather);
    public static final Block blockBucket = new BlockMSB(BlockNames.blockBucket);
    public static final Block blockDye = new BlockDye();
    public static final Block blockFireball = new BlockMSB(BlockNames.blockFireball);
    public static final Block blockSlimeball = new BlockMSB(BlockNames.blockSlimeball);
    public static final Block blockRottenFlesh = new BlockMSB(BlockNames.blockRottenFlesh);
    public static final Block blockPotato = new BlockMSB(BlockNames.blockPotato);
    public static final Block blockNetherWart = new BlockMSB(BlockNames.blockNetherWart);
    public static final Block blockGunpowder = new BlockMSB(BlockNames.blockGunpowder);
    public static final Block blockCarrot = new BlockMSB(BlockNames.blockCarrot);
    public static final Block blockArrow = new BlockMSB(BlockNames.blockArrow);
    public static final Block blockBlazeRod = new BlockMSB(BlockNames.blockBlazeRod);
    public static final Block blockFlint = new BlockMSB(BlockNames.blockFlint);
    public static final Block blockBone = new BlockMSB(BlockNames.blockBone);
    public static final Block blockSugar = new BlockMSB(BlockNames.blockSugar);
    public static final Block blockNetherStar = new BlockMSB(BlockNames.blockNetherStar);
    public static final Block blockClay = new BlockMSB(BlockNames.blockClay);
    public static final Block blockString = new BlockMSB(BlockNames.blockString);
    public static final Block blockFeather = new BlockMSB(BlockNames.blockFeather);
    public static final Block blockBread = new BlockMSB(BlockNames.blockBread);
    public static final Block blockPorkchop = new BlockPorkchop();
    public static final Block blockFish = new BlockFish();
    public static final Block blockCookie = new BlockMSB(BlockNames.blockCookie);
    public static final Block blockBeef = new BlockBeef();
    public static final Block blockPumpkinPie = new BlockMSB(BlockNames.blockPumpkinPie);
    public static final Block blockGhastTear = new BlockMSB(BlockNames.blockGhastTear);
    public static final Block blockSkull = new BlockSkullStorage();
    public static final Block blockMutton = new BlockMutton();
    public static final Block blockRabbit = new BlockRabbit();

    public static void register()
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
