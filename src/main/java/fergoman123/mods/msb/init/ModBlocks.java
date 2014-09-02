 /*
  * More Storage Blocks
  * Copyright (c) 2014 fergoman123.
  * All rights reserved. This program and the accompanying materials
  * are made available under the terms of the GNU Lesser Public License v2.1
  * which accompanies this distribution, and is available at
  * http://www.gnu.org/licenses/gpl-3.0.html
  */

package fergoman123.mods.msb.init;

import cpw.mods.fml.common.registry.GameRegistry.ObjectHolder;
import fergoman123.mods.fergoutil.helper.RegisterHelper;
import fergoman123.mods.msb.block.*;
import fergoman123.mods.msb.item.ItemBlockDye;
import fergoman123.mods.msb.item.ItemBlockGoldApple;
import fergoman123.mods.msb.reference.ModInfo;
import fergoman123.mods.msb.reference.Names.Blocks;

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

    public static void init()
    {
        RegisterHelper.registerBlock(blockApple, Blocks.blockApple);
        RegisterHelper.registerBlock(blockArrow, Blocks.blockArrow);
        RegisterHelper.registerBlock(blockBlazeRod, Blocks.blockBlazeRod);
        RegisterHelper.registerBlock(blockBook, Blocks.blockBook);
        RegisterHelper.registerBlock(blockCarrot, Blocks.blockCarrot);
        RegisterHelper.registerBlock(blockCharcoal, Blocks.blockCharcoal);
        RegisterHelper.registerBlock(blockDye, ItemBlockDye.class, Blocks.blockDyeName);
        RegisterHelper.registerBlock(blockEgg, Blocks.blockEgg);
        RegisterHelper.registerBlock(blockEnderPearl, Blocks.blockEnderPearl);
        RegisterHelper.registerBlock(blockEnderEye, Blocks.blockEnderEye);
        RegisterHelper.registerBlock(blockGoldApple, ItemBlockGoldApple.class, Blocks.blockGoldAppleName);
        RegisterHelper.registerBlock(blockGunpowder, Blocks.blockGunpowder);
        RegisterHelper.registerBlock(blockNetherWart, Blocks.blockNetherWart);
        RegisterHelper.registerBlock(blockPotato, Blocks.blockPotato);
        RegisterHelper.registerBlock(blockRottenFlesh, Blocks.blockRottenFlesh);
        RegisterHelper.registerBlock(blockSlimeball, Blocks.blockSlimeball);
        RegisterHelper.registerBlock(blockFireball, Blocks.blockFireball);
        RegisterHelper.registerBlock(blockSeeds, Blocks.blockSeeds);
        RegisterHelper.registerBlock(blockLead, Blocks.blockLead);
        RegisterHelper.registerBlock(blockLeather, Blocks.blockLeather);
        RegisterHelper.registerBlock(blockBucket, Blocks.blockBucket);
    }
}
