package io.github.fergoman123.msb.init;

import io.github.fergoman123.fergoutil.item.ItemBlockVariants;
import io.github.fergoman123.msb.api.ModelResLocMSB;
import io.github.fergoman123.msb.block.BlockBeef;
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
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.ItemModelMesher;
import net.minecraft.client.resources.model.ModelBakery;
import net.minecraft.item.Item;
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
		registerVariants();
	}

	private static void registerModels() {
		register(blockCharcoal, BlockNames.blockCharcoal);
		register(blockApple, BlockNames.blockApple);
		register(blockGoldApple, 0, BlockNames.blockGoldApple[0]);
		register(blockGoldApple, 1, BlockNames.blockGoldApple[1]);
		register(blockBook, BlockNames.blockBook);
		register(blockEgg, BlockNames.blockEgg);
		register(blockEnderPearl, BlockNames.blockEnderPearl);
		register(blockEnderEye, BlockNames.blockEnderEye);
		register(blockLead, BlockNames.blockLead);
		register(blockReed, BlockNames.blockReed);
		register(blockSeeds, 0, BlockNames.blockSeeds[0]);
		register(blockSeeds, 1, BlockNames.blockSeeds[1]);
		register(blockSeeds, 2, BlockNames.blockSeeds[2]);
		register(blockStick, BlockNames.blockStick);
		register(blockLeather, BlockNames.blockLeather);
		register(blockBucket, BlockNames.blockBucket);
		register(blockDye, 0, BlockNames.blockDye[0]);
		register(blockDye, 1, BlockNames.blockDye[1]);
		register(blockDye, 2, BlockNames.blockDye[2]);
		register(blockDye, 3, BlockNames.blockDye[3]);
		register(blockDye, 4, BlockNames.blockDye[4]);
		register(blockDye, 5, BlockNames.blockDye[5]);
		register(blockDye, 6, BlockNames.blockDye[6]);
		register(blockDye, 7, BlockNames.blockDye[7]);
		register(blockDye, 8, BlockNames.blockDye[8]);
		register(blockDye, 9, BlockNames.blockDye[9]);
		register(blockDye, 10, BlockNames.blockDye[10]);
		register(blockDye, 11, BlockNames.blockDye[11]);
		register(blockDye, 12, BlockNames.blockDye[12]);
		register(blockDye, 13, BlockNames.blockDye[13]);
		register(blockDye, 14, BlockNames.blockDye[14]);
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
		register(blockPorkchop, 0, BlockNames.blockPorkchop[0]);
		register(blockPorkchop, 1, BlockNames.blockPorkchop[1]);
		register(blockFish, 0, BlockNames.blockFish[0]);
		register(blockFish, 1, BlockNames.blockFish[1]);
		register(blockFish, 2, BlockNames.blockFish[2]);
		register(blockFish, 3, BlockNames.blockFish[3]);
		register(blockFish, 4, BlockNames.blockFish[4]);
		register(blockFish, 5, BlockNames.blockFish[5]);
		register(blockCookie, BlockNames.blockCookie);
		register(blockBeef, 0, BlockNames.blockBeef[0]);
		register(blockBeef, 1, BlockNames.blockBeef[1]);
		register(blockPumpkinPie, BlockNames.blockPumpkinPie);
		register(blockGhastTear, BlockNames.blockGhastTear);
		register(blockSkull, 0, BlockNames.blockSkull[0]);
		register(blockSkull, 1, BlockNames.blockSkull[1]);
		register(blockSkull, 2, BlockNames.blockSkull[2]);
		register(blockSkull, 3, BlockNames.blockSkull[3]);
		register(blockMutton, 0, BlockNames.blockMutton[0]);
		register(blockMutton, 1, BlockNames.blockMutton[1]);
		register(blockRabbit, 0, BlockNames.blockRabbit[0]);
		register(blockRabbit, 1, BlockNames.blockRabbit[1]);
	}

	private static void registerVariants() {
		ModelBakery.addVariantName(Item.getItemFromBlock(blockCharcoal), "msb:blockCharcoal");
		ModelBakery.addVariantName(Item.getItemFromBlock(blockApple), "msb:blockApple");
		ModelBakery.addVariantName(Item.getItemFromBlock(blockGoldApple), "msb:blockGoldApple1");
		ModelBakery.addVariantName(Item.getItemFromBlock(blockGoldApple), "msb:blockGoldApple2");
		ModelBakery.addVariantName(Item.getItemFromBlock(blockBook), "msb:blockBook");
		ModelBakery.addVariantName(Item.getItemFromBlock(blockEgg), "msb:blockEgg");
		ModelBakery.addVariantName(Item.getItemFromBlock(blockEnderPearl), "msb:blockEnderPearl");
		ModelBakery.addVariantName(Item.getItemFromBlock(blockEnderEye), "msb:blockEnderEye");
		ModelBakery.addVariantName(Item.getItemFromBlock(blockLead), "msb:blockLead");
		ModelBakery.addVariantName(Item.getItemFromBlock(blockReed), "msb:blockReed");
		ModelBakery.addVariantName(Item.getItemFromBlock(blockSeeds), "msb:blockWheatSeeds");
		ModelBakery.addVariantName(Item.getItemFromBlock(blockSeeds), "msb:blockPumpkinSeeds");
		ModelBakery.addVariantName(Item.getItemFromBlock(blockSeeds), "msb:blockMelonSeeds");
		ModelBakery.addVariantName(Item.getItemFromBlock(blockStick), "msb:blockStick");
		ModelBakery.addVariantName(Item.getItemFromBlock(blockLeather), "msb:blockLeather");
		ModelBakery.addVariantName(Item.getItemFromBlock(blockBucket), "msb:blockBucket");
		ModelBakery.addVariantName(Item.getItemFromBlock(blockDye), "msb:blockInkSack");
		ModelBakery.addVariantName(Item.getItemFromBlock(blockDye), "msb:blockRoseRed");
		ModelBakery.addVariantName(Item.getItemFromBlock(blockDye), "msb:blockCactusGreen");
		ModelBakery.addVariantName(Item.getItemFromBlock(blockDye), "msb:blockCocoa");
		ModelBakery.addVariantName(Item.getItemFromBlock(blockDye), "msb:blockPurpleDye");
		ModelBakery.addVariantName(Item.getItemFromBlock(blockDye), "msb:blockCyanDye");
		ModelBakery.addVariantName(Item.getItemFromBlock(blockDye), "msb:blockSilverDye");
		ModelBakery.addVariantName(Item.getItemFromBlock(blockDye), "msb:blockGrayDye");
		ModelBakery.addVariantName(Item.getItemFromBlock(blockDye), "msb:blockPinkDye");
		ModelBakery.addVariantName(Item.getItemFromBlock(blockDye), "msb:blockLimeDye");
		ModelBakery.addVariantName(Item.getItemFromBlock(blockDye), "msb:blockYellowDye");
		ModelBakery.addVariantName(Item.getItemFromBlock(blockDye), "msb:blockLightBlueDye");
		ModelBakery.addVariantName(Item.getItemFromBlock(blockDye), "msb:blockMagentaDye");
		ModelBakery.addVariantName(Item.getItemFromBlock(blockDye), "msb:blockOrangeDye");
		ModelBakery.addVariantName(Item.getItemFromBlock(blockDye), "msb:blockWhiteDye");
		ModelBakery.addVariantName(Item.getItemFromBlock(blockFireball), "msb:blockFireball");
		ModelBakery.addVariantName(Item.getItemFromBlock(blockSlimeball), "msb:blockSlimeball");
		ModelBakery.addVariantName(Item.getItemFromBlock(blockRottenFlesh), "msb:blockRottenFlesh");
		ModelBakery.addVariantName(Item.getItemFromBlock(blockPotato), "msb:blockPotato");
		ModelBakery.addVariantName(Item.getItemFromBlock(blockNetherWart), "msb:blockNetherWart");
		ModelBakery.addVariantName(Item.getItemFromBlock(blockGunpowder), "msb:blockGunpowder");
		ModelBakery.addVariantName(Item.getItemFromBlock(blockCarrot), "msb:blockCarrot");
		ModelBakery.addVariantName(Item.getItemFromBlock(blockArrow), "msb:blockArrow");
		ModelBakery.addVariantName(Item.getItemFromBlock(blockBlazeRod), "msb:blockBlazeRod");
		ModelBakery.addVariantName(Item.getItemFromBlock(blockFlint), "msb:blockFlint");
		ModelBakery.addVariantName(Item.getItemFromBlock(blockBone), "msb:blockBone");
		ModelBakery.addVariantName(Item.getItemFromBlock(blockSugar), "msb:blockSugar");
		ModelBakery.addVariantName(Item.getItemFromBlock(blockNetherStar), "msb:blockNetherStar");
		ModelBakery.addVariantName(Item.getItemFromBlock(blockClay), "msb:blockClay");
		ModelBakery.addVariantName(Item.getItemFromBlock(blockString), "msb:blockString");
		ModelBakery.addVariantName(Item.getItemFromBlock(blockFeather), "msb:blockFeather");
		ModelBakery.addVariantName(Item.getItemFromBlock(blockBread), "msb:blockBread");
		ModelBakery.addVariantName(Item.getItemFromBlock(blockPorkchop), "msb:blockRawPorkchop");
		ModelBakery.addVariantName(Item.getItemFromBlock(blockPorkchop), "msb:blockCookedPorkchop");
		ModelBakery.addVariantName(Item.getItemFromBlock(blockFish), "msb:blockRawFish");
		ModelBakery.addVariantName(Item.getItemFromBlock(blockFish), "msb:blockRawSalmon");
		ModelBakery.addVariantName(Item.getItemFromBlock(blockFish), "msb:blockClownfish");
		ModelBakery.addVariantName(Item.getItemFromBlock(blockFish), "msb:blockPufferfish");
		ModelBakery.addVariantName(Item.getItemFromBlock(blockFish), "msb:blockCookedFish");
		ModelBakery.addVariantName(Item.getItemFromBlock(blockFish), "msb:blockCookedSalmon");
		ModelBakery.addVariantName(Item.getItemFromBlock(blockCookie), "msb:blockCookie");
		ModelBakery.addVariantName(Item.getItemFromBlock(blockBeef), "msb:blockRawBeef");
		ModelBakery.addVariantName(Item.getItemFromBlock(blockBeef), "msb:blockCookedBeef");
		ModelBakery.addVariantName(Item.getItemFromBlock(blockPumpkinPie), "msb:blockPumpkinPie");
		ModelBakery.addVariantName(Item.getItemFromBlock(blockGhastTear), "msb:blockGhastTear");
		ModelBakery.addVariantName(Item.getItemFromBlock(blockSkull), "msb:blockSkullSkeleton");
		ModelBakery.addVariantName(Item.getItemFromBlock(blockSkull), "msb:blockSkullWither");
		ModelBakery.addVariantName(Item.getItemFromBlock(blockSkull), "msb:blockSkullZombie");
		ModelBakery.addVariantName(Item.getItemFromBlock(blockSkull), "msb:blockSkullCreeper");
		ModelBakery.addVariantName(Item.getItemFromBlock(blockMutton), "msb:blockRawMutton");
		ModelBakery.addVariantName(Item.getItemFromBlock(blockMutton), "msb:blockCookedMutton");
		ModelBakery.addVariantName(Item.getItemFromBlock(blockRabbit), "msb:blockRawRabbit");
		ModelBakery.addVariantName(Item.getItemFromBlock(blockRabbit), "msb:blockCookedRabbit");
	}

	private static void register(Block block, int meta, String name) {
		ItemModelMesher mesher = Minecraft.getMinecraft().getRenderItem().getItemModelMesher();
		mesher.register(Item.getItemFromBlock(block), meta, new ModelResLocMSB(name));
	}

	private static void register(Block block, String name) {
		register(block, 0, name);
	}
}
