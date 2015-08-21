package io.github.fergoman123.msb.model;

import io.github.fergoman123.fergoutil.model.Model;
import io.github.fergoman123.fergoutil.model.ModelEntry;
import io.github.fergoman123.fergoutil.model.ModelVariant;
import io.github.fergoman123.msb.info.BlockNames;
import io.github.fergoman123.msb.init.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.item.Item;

public class Models {
	public static final Model blockCharcoal = createModel(ModBlocks.blockCharcoal, BlockNames.blockCharcoal);
	public static final Model blockApple = createModel(ModBlocks.blockApple, BlockNames.blockApple);
	public static final Model[] blockGoldApple = createModelArray(ModBlocks.blockGoldApple, BlockNames.blockGoldApple);
	public static final Model blockBook = createModel(ModBlocks.blockBook, BlockNames.blockBook);
	public static final Model blockEgg = createModel(ModBlocks.blockEgg, BlockNames.blockEgg);
	public static final Model blockEnderPearl = createModel(ModBlocks.blockEnderPearl, BlockNames.blockEnderPearl);
	public static final Model blockEnderEye = createModel(ModBlocks.blockEnderEye, BlockNames.blockEnderEye);
	public static final Model blockLead = createModel(ModBlocks.blockLead, BlockNames.blockLead);
	public static final Model blockReed = createModel(ModBlocks.blockReed, BlockNames.blockReed);
	public static final Model[] blockSeeds = createModelArray(ModBlocks.blockSeeds, BlockNames.blockSeeds);
	public static final Model blockStick = createModel(ModBlocks.blockStick, BlockNames.blockStick);
	public static final Model blockLeather = createModel(ModBlocks.blockLeather, BlockNames.blockLeather);
	public static final Model blockBucket = createModel(ModBlocks.blockBucket, BlockNames.blockBucket);
	public static final Model[] blockDye = createModelArray(ModBlocks.blockDye, BlockNames.blockDye);
	public static final Model blockFireball = createModel(ModBlocks.blockFireball, BlockNames.blockFireball);
	public static final Model blockSlimeball = createModel(ModBlocks.blockSlimeball, BlockNames.blockSlimeball);
	public static final Model blockRottenFlesh = createModel(ModBlocks.blockRottenFlesh, BlockNames.blockRottenFlesh);
	public static final Model blockPotato = createModel(ModBlocks.blockPotato, BlockNames.blockPotato);
	public static final Model blockNetherWart = createModel(ModBlocks.blockNetherWart, BlockNames.blockNetherWart);
	public static final Model blockGunpowder = createModel(ModBlocks.blockGunpowder, BlockNames.blockGunpowder);
	public static final Model blockCarrot = createModel(ModBlocks.blockCarrot, BlockNames.blockCarrot);
	public static final Model blockArrow = createModel(ModBlocks.blockArrow, BlockNames.blockArrow);
	public static final Model blockBlazeRod = createModel(ModBlocks.blockBlazeRod, BlockNames.blockBlazeRod);
	public static final Model blockFlint = createModel(ModBlocks.blockFlint, BlockNames.blockFlint);
	public static final Model blockBone = createModel(ModBlocks.blockBone, BlockNames.blockBone);
	public static final Model blockSugar = createModel(ModBlocks.blockSugar, BlockNames.blockSugar);
	public static final Model blockNetherStar = createModel(ModBlocks.blockNetherStar, BlockNames.blockNetherStar);
	public static final Model blockClay = createModel(ModBlocks.blockClay, BlockNames.blockClay);
	public static final Model blockString = createModel(ModBlocks.blockString, BlockNames.blockString);
	public static final Model blockFeather = createModel(ModBlocks.blockFeather, BlockNames.blockFeather);
	public static final Model blockBread = createModel(ModBlocks.blockBread, BlockNames.blockBread);
	public static final Model[] blockPorkchop = createModelArray(ModBlocks.blockPorkchop, BlockNames.blockPorkchop);
	public static final Model[] blockFish = createModelArray(ModBlocks.blockFish, BlockNames.blockFish);
	public static final Model blockCookie = createModel(ModBlocks.blockCookie, BlockNames.blockCookie);
	public static final Model[] blockBeef = createModelArray(ModBlocks.blockBeef, BlockNames.blockBeef);
	public static final Model blockPumpkinPie = createModel(ModBlocks.blockPumpkinPie, BlockNames.blockPumpkinPie);
	public static final Model blockGhastTear = createModel(ModBlocks.blockGhastTear, BlockNames.blockGhastTear);
	public static final Model[] blockSkull = createModelArray(ModBlocks.blockSkull, BlockNames.blockSkull);
	public static final Model[] blockMutton = createModelArray(ModBlocks.blockMutton, BlockNames.blockMutton);
	public static final Model[] blockRabbit = createModelArray(ModBlocks.blockRabbit, BlockNames.blockRabbit);
	
	public static Model[] createModelArray(Block block, String[] names){
		Model[] models = new Model[names.length];
		ModelEntry[] modelEntries = new ModelEntry[names.length];
		ModelVariant[] variants = new ModelVariant[names.length];
		for (int i = 0; i < models.length; i++) {
			modelEntries[i] = new ModelEntry(Item.getItemFromBlock(block), i, createModel(names[i]));
			variants[i] = new ModelVariant(Item.getItemFromBlock(block), createModel(names[i]));
			models[i] = new Model(modelEntries[i], variants[i]);
		}
		return models;
	}
	
	public static Model createModel(Block block, String name){
		ModelEntry model = new ModelEntry(Item.getItemFromBlock(block), createModel(name));
		ModelVariant variant = new ModelVariant(Item.getItemFromBlock(block), createModel(name));
		return new Model(model, variant);
	}
	
	private static String createModel(String name){
		return "msb:" + name;
	}
}
