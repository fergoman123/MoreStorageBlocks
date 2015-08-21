package io.github.fergoman123.msb.init;

import io.github.fergoman123.fergoutil.item.ItemBlockVariants;
import io.github.fergoman123.fergoutil.model.Model;
import io.github.fergoman123.msb.block.BlockBeef;
import io.github.fergoman123.msb.block.BlockCompCobble;
import io.github.fergoman123.msb.block.BlockDye;
import io.github.fergoman123.msb.block.BlockFish;
import io.github.fergoman123.msb.block.BlockGoldApple;
import io.github.fergoman123.msb.block.BlockMSB;
import io.github.fergoman123.msb.block.BlockMultiMSB;
import io.github.fergoman123.msb.block.BlockMutton;
import io.github.fergoman123.msb.block.BlockPorkchop;
import io.github.fergoman123.msb.block.BlockRabbit;
import io.github.fergoman123.msb.block.BlockSeeds;
import io.github.fergoman123.msb.block.BlockSkullStorage;
import io.github.fergoman123.msb.info.BlockNames;
import io.github.fergoman123.msb.model.Models;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelBakery;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModBlocks {
	public static final BlockMSB blockCharcoal = new BlockMSB(BlockNames.blockCharcoal);
	public static final BlockMSB blockApple = new BlockMSB(BlockNames.blockApple);
	public static final BlockMultiMSB blockGoldApple = new BlockGoldApple(BlockNames.blockGoldAppleName);
	public static final BlockMSB blockBook = new BlockMSB(BlockNames.blockBook);
	public static final BlockMSB blockEgg = new BlockMSB(BlockNames.blockEgg);
	public static final BlockMSB blockEnderPearl = new BlockMSB(BlockNames.blockEnderPearl);
	public static final BlockMSB blockEnderEye = new BlockMSB(BlockNames.blockEnderEye);
	public static final BlockMSB blockLead = new BlockMSB(BlockNames.blockLead);
	public static final BlockMSB blockReed = new BlockMSB(BlockNames.blockReed);
	public static final BlockMultiMSB blockSeeds = new BlockSeeds(BlockNames.blockSeedsName);
	public static final BlockMSB blockStick = new BlockMSB(BlockNames.blockStick);
	public static final BlockMSB blockLeather = new BlockMSB(BlockNames.blockLeather);
	public static final BlockMSB blockBucket = new BlockMSB(BlockNames.blockBucket);
	public static final BlockMultiMSB blockDye = new BlockDye(BlockNames.blockDyeName);
	public static final BlockMSB blockFireball = new BlockMSB(BlockNames.blockFireball);
	public static final BlockMSB blockSlimeball = new BlockMSB(BlockNames.blockSlimeball);
	public static final BlockMSB blockRottenFlesh = new BlockMSB(BlockNames.blockRottenFlesh);
	public static final BlockMSB blockPotato = new BlockMSB(BlockNames.blockPotato);
	public static final BlockMSB blockNetherWart = new BlockMSB(BlockNames.blockNetherWart);
	public static final BlockMSB blockGunpowder = new BlockMSB(BlockNames.blockGunpowder);
	public static final BlockMSB blockCarrot = new BlockMSB(BlockNames.blockCarrot);
	public static final BlockMSB blockArrow = new BlockMSB(BlockNames.blockArrow);
	public static final BlockMSB blockBlazeRod = new BlockMSB(BlockNames.blockBlazeRod);
	public static final BlockMSB blockFlint = new BlockMSB(BlockNames.blockFlint);
	public static final BlockMSB blockBone = new BlockMSB(BlockNames.blockBone);
	public static final BlockMSB blockSugar = new BlockMSB(BlockNames.blockSugar);
	public static final BlockMSB blockNetherStar = new BlockMSB(BlockNames.blockNetherStar);
	public static final BlockMSB blockClay = new BlockMSB(BlockNames.blockClay);
	public static final BlockMSB blockString = new BlockMSB(BlockNames.blockString);
	public static final BlockMSB blockFeather = new BlockMSB(BlockNames.blockFeather);
	public static final BlockMSB blockBread = new BlockMSB(BlockNames.blockBread);
	public static final BlockMultiMSB blockPorkchop = new BlockPorkchop(BlockNames.blockPorkchopName);
	public static final BlockMultiMSB blockFish = new BlockFish(BlockNames.blockFishName);
	public static final BlockMSB blockCookie = new BlockMSB(BlockNames.blockCookie);
	public static final BlockMultiMSB blockBeef = new BlockBeef(BlockNames.blockBeefName);
	public static final BlockMSB blockPumpkinPie = new BlockMSB(BlockNames.blockPumpkinPie);
	public static final BlockMSB blockGhastTear = new BlockMSB(BlockNames.blockGhastTear);
	public static final BlockMultiMSB blockSkull = new BlockSkullStorage(BlockNames.blockSkullName);
	public static final BlockMultiMSB blockMutton = new BlockMutton(BlockNames.blockMuttonName);
	public static final BlockMultiMSB blockRabbit = new BlockRabbit(BlockNames.blockRabbitName);
	
	public static final BlockMultiMSB blockCompressedCobble = new BlockCompCobble("");

	public static void registerBlocks() {
		GameRegistry.registerBlock(blockCharcoal, BlockNames.blockCharcoal);
		GameRegistry.registerBlock(blockApple, BlockNames.blockApple);
		GameRegistry.registerBlock(blockGoldApple, ItemBlockVariants.class, BlockNames.blockGoldAppleName);
		GameRegistry.registerBlock(blockBook, BlockNames.blockBook);
		GameRegistry.registerBlock(blockEgg, BlockNames.blockEgg);
		GameRegistry.registerBlock(blockEnderPearl, BlockNames.blockEnderPearl);
		GameRegistry.registerBlock(blockEnderEye, BlockNames.blockEnderEye);
		GameRegistry.registerBlock(blockLead, BlockNames.blockLead);
		GameRegistry.registerBlock(blockReed, BlockNames.blockReed);
		GameRegistry.registerBlock(blockSeeds, ItemBlockVariants.class, BlockNames.blockSeedsName);
		GameRegistry.registerBlock(blockStick, BlockNames.blockStick);
		GameRegistry.registerBlock(blockLeather, BlockNames.blockLeather);
		GameRegistry.registerBlock(blockBucket, BlockNames.blockBucket);
		GameRegistry.registerBlock(blockDye, ItemBlockVariants.class, BlockNames.blockDyeName);
		GameRegistry.registerBlock(blockFireball, BlockNames.blockFireball);
		GameRegistry.registerBlock(blockSlimeball, BlockNames.blockSlimeball);
		GameRegistry.registerBlock(blockRottenFlesh, BlockNames.blockRottenFlesh);
		GameRegistry.registerBlock(blockPotato, BlockNames.blockPotato);
		GameRegistry.registerBlock(blockNetherWart, BlockNames.blockNetherWart);
		GameRegistry.registerBlock(blockGunpowder, BlockNames.blockGunpowder);
		GameRegistry.registerBlock(blockCarrot, BlockNames.blockCarrot);
		GameRegistry.registerBlock(blockArrow, BlockNames.blockArrow);
		GameRegistry.registerBlock(blockBlazeRod, BlockNames.blockBlazeRod);
		GameRegistry.registerBlock(blockFlint, BlockNames.blockFlint);
		GameRegistry.registerBlock(blockBone, BlockNames.blockBone);
		GameRegistry.registerBlock(blockSugar, BlockNames.blockSugar);
		GameRegistry.registerBlock(blockNetherStar, BlockNames.blockNetherStar);
		GameRegistry.registerBlock(blockClay, BlockNames.blockClay);
		GameRegistry.registerBlock(blockString, BlockNames.blockString);
		GameRegistry.registerBlock(blockFeather, BlockNames.blockFeather);
		GameRegistry.registerBlock(blockBread, BlockNames.blockBread);
		GameRegistry.registerBlock(blockPorkchop, ItemBlockVariants.class, BlockNames.blockPorkchopName);
		GameRegistry.registerBlock(blockFish, ItemBlockVariants.class, BlockNames.blockFishName);
		GameRegistry.registerBlock(blockCookie, BlockNames.blockCookie);
		GameRegistry.registerBlock(blockBeef, ItemBlockVariants.class, BlockNames.blockBeefName);
		GameRegistry.registerBlock(blockPumpkinPie, BlockNames.blockPumpkinPie);
		GameRegistry.registerBlock(blockGhastTear, BlockNames.blockGhastTear);
		GameRegistry.registerBlock(blockSkull, ItemBlockVariants.class, BlockNames.blockSkullName);
		GameRegistry.registerBlock(blockMutton, ItemBlockVariants.class, BlockNames.blockMuttonName);
		GameRegistry.registerBlock(blockRabbit, ItemBlockVariants.class, BlockNames.blockRabbitName);
		
		registerModels();
	}

	private static void registerModels() {
		
		createModelAndVariant(Models.blockCharcoal);
		createModelAndVariant(Models.blockApple);
		
		for(Model model: Models.blockGoldApple)
			createModelAndVariant(model);
		createModelAndVariant(Models.blockBook);
		createModelAndVariant(Models.blockEgg);
		createModelAndVariant(Models.blockEnderPearl);
		createModelAndVariant(Models.blockEnderEye);
		createModelAndVariant(Models.blockLead);
		createModelAndVariant(Models.blockReed);
		for(Model model : Models.blockSeeds)
			createModelAndVariant(model);
		createModelAndVariant(Models.blockStick);
		createModelAndVariant(Models.blockLeather);
		createModelAndVariant(Models.blockBucket);
		for(Model model: Models.blockDye)
			createModelAndVariant(model);
		createModelAndVariant(Models.blockFireball);
		createModelAndVariant(Models.blockSlimeball);
		createModelAndVariant(Models.blockRottenFlesh);
		createModelAndVariant(Models.blockPotato);
		createModelAndVariant(Models.blockNetherWart);
		createModelAndVariant(Models.blockGunpowder);
		createModelAndVariant(Models.blockCarrot);
		createModelAndVariant(Models.blockArrow);
		createModelAndVariant(Models.blockBlazeRod);
		createModelAndVariant(Models.blockFlint);
		createModelAndVariant(Models.blockBone);
		createModelAndVariant(Models.blockSugar);
		createModelAndVariant(Models.blockNetherStar);
		createModelAndVariant(Models.blockClay);
		createModelAndVariant(Models.blockString);
		createModelAndVariant(Models.blockFeather);
		createModelAndVariant(Models.blockBread);
		for(Model model:Models.blockPorkchop)
			createModelAndVariant(model);
		for(Model model : Models.blockFish)
			createModelAndVariant(model);
		createModelAndVariant(Models.blockCookie);
		for(Model model: Models.blockBeef)
			createModelAndVariant(model);
		createModelAndVariant(Models.blockPumpkinPie);
		createModelAndVariant(Models.blockGhastTear);
		for(Model model: Models.blockSkull)
			createModelAndVariant(model);
		for(Model model: Models.blockMutton)
			createModelAndVariant(model);
		for(Model model: Models.blockRabbit)
			createModelAndVariant(model);
	}
	
	public static void createModelAndVariant(Model model){
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(model.model.item, model.model.meta, new ModelResourceLocation(model.model.name, "inventory"));
		ModelBakery.addVariantName(model.variant.item, model.variant.name);
	}
}
