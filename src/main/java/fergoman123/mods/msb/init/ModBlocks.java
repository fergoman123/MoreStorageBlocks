 /*
  * More Storage Blocks
  * Copyright (c) 2014 fergoman123.
  * All rights reserved. This program and the accompanying materials
  * are made available under the terms of the GNU Lesser Public License v2.1
  * which accompanies this distribution, and is available at
  * http://www.gnu.org/licenses/gpl-3.0.html
  */

package fergoman123.mods.msb.init;

 import fergoman123.mods.msb.block.*;
 import fergoman123.mods.msb.item.ItemBlockDye;
 import fergoman123.mods.msb.item.ItemBlockGoldApple;
 import fergoman123.mods.msb.reference.Names.Blocks;
 import net.minecraft.item.ItemStack;
 import net.minecraftforge.oredict.OreDictionary;

 import static fergoman123.mods.fergoutil.helper.RegisterHelper.registerBlock;
 import static fergoman123.mods.fergoutil.helper.RegisterHelper.registerOre;

 public class ModBlocks
{
    public static final BlockMSB blockApple = new BlockApple();
    public static final BlockMSB blockArrow = new BlockArrow();
    public static final BlockMSB blockBlazeRod = new BlockBlazeRod();
    public static final BlockMSB blockBook = new BlockBook();
    public static final BlockMSB blockCarrot = new BlockCarrotStorage();
    public static final BlockMSB blockCharcoal = new BlockCharcoal();
    public static final BlockMSBST blockDye = new BlockDye();
    public static final BlockMSB blockEgg = new BlockEgg();
    public static final BlockMSB blockEnderPearl = new BlockEnderPearl();
    public static final BlockMSB blockEnderEye = new BlockEnderEye();
    public static final BlockMSBST blockGoldApple = new BlockGoldApple();
    public static final BlockMSB blockGunpowder = new BlockGunpowder();
    public static final BlockMSB blockNetherWart = new BlockNetherWartStorage();
    public static final BlockMSB blockPotato = new BlockPotatoStorage();
    public static final BlockMSB blockRottenFlesh = new BlockRottenFlesh();
    public static final BlockMSB blockSlimeball = new BlockSlimeball();
    public static final BlockMSB blockFireball = new BlockFireball();
    public static final BlockMSB blockSeeds = new BlockSeeds();
    public static final BlockMSB blockLead = new BlockLead();
    public static final BlockMSB blockLeather = new BlockLeather();
    public static final BlockMSB blockBucket = new BlockBucket();
    public static final BlockMSB blockStick = new BlockStick();
    public static final BlockMSB blockFlint = new BlockFlint();

    public static void init()
    {
        registerBlock(blockApple, Blocks.blockApple);
        registerBlock(blockArrow, Blocks.blockArrow);
        registerBlock(blockBlazeRod, Blocks.blockBlazeRod);
        registerBlock(blockBook, Blocks.blockBook);
        registerBlock(blockCarrot, Blocks.blockCarrot);
        registerBlock(blockCharcoal, Blocks.blockCharcoal);
        registerBlock(blockDye, ItemBlockDye.class, Blocks.blockDyeName);
        registerBlock(blockEgg, Blocks.blockEgg);
        registerBlock(blockEnderPearl, Blocks.blockEnderPearl);
        registerBlock(blockEnderEye, Blocks.blockEnderEye);
        registerBlock(blockGoldApple, ItemBlockGoldApple.class, Blocks.blockGoldAppleName);
        registerBlock(blockGunpowder, Blocks.blockGunpowder);
        registerBlock(blockNetherWart, Blocks.blockNetherWart);
        registerBlock(blockPotato, Blocks.blockPotato);
        registerBlock(blockRottenFlesh, Blocks.blockRottenFlesh);
        registerBlock(blockSlimeball, Blocks.blockSlimeball);
        registerBlock(blockFireball, Blocks.blockFireball);
        registerBlock(blockSeeds, Blocks.blockSeeds);
        registerBlock(blockLead, Blocks.blockLead);
        registerBlock(blockLeather, Blocks.blockLeather);
        registerBlock(blockBucket, Blocks.blockBucket);
        registerBlock(blockStick, Blocks.blockStick);
        registerBlock(blockFlint, Blocks.blockFlint);
    }

    private static void registerOres()
    {
        registerOre(Blocks.blockApple, blockApple);
        registerOre(Blocks.blockArrow, blockArrow);
        registerOre(Blocks.blockBlazeRod, blockBlazeRod);
        registerOre(Blocks.blockBook, blockBook);
        registerOre(Blocks.blockCarrot, blockCarrot);
        registerOre(Blocks.blockCharcoal, blockCharcoal);
        registerOre(Blocks.blockDyeName, new ItemStack(blockDye, 1, OreDictionary.WILDCARD_VALUE));
        registerOre(Blocks.blockEgg, blockEgg);
        registerOre(Blocks.blockEnderPearl, blockEnderPearl);
        registerOre(Blocks.blockEnderEye, blockEnderEye);
        registerOre(Blocks.blockGoldAppleName, new ItemStack(blockGoldApple, 1, OreDictionary.WILDCARD_VALUE));
        registerOre(Blocks.blockGunpowder, blockGunpowder);
        registerOre(Blocks.blockNetherWart, blockNetherWart);
        registerOre(Blocks.blockPotato, blockPotato);
        registerOre(Blocks.blockRottenFlesh, blockRottenFlesh);
        registerOre(Blocks.blockSlimeball, blockSlimeball);
        registerOre(Blocks.blockFireball, blockFireball);
        registerOre(Blocks.blockSeeds, blockSeeds);
        registerOre(Blocks.blockLead, blockLead);
        registerOre(Blocks.blockLeather, blockLeather);
        registerOre(Blocks.blockBucket, blockBucket);
        registerOre(Blocks.blockStick, blockStick);
        registerOre(Blocks.blockFlint, blockFlint);

    }
}
