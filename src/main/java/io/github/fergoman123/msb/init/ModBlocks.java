 /*
  * More Storage Blocks
  * Copyright (c) 2014 fergoman123.
  * All rights reserved. This program and the accompanying materials
  * are made available under the terms of the GNU Lesser Public License v2.1
  * which accompanies this distribution, and is available at
  * http://www.gnu.org/licenses/gpl-3.0.html
  */

package io.github.fergoman123.msb.init;

 import cpw.mods.fml.common.registry.GameRegistry;
 import io.github.fergoman123.msb.block.*;
 import io.github.fergoman123.msb.reference.Names;
 import io.github.fergoman123.msb.util.Utils;
 import net.minecraft.block.Block;
 import net.minecraft.item.ItemBlock;
 import net.minecraft.item.ItemStack;
 import net.minecraftforge.oredict.OreDictionary;

 import static net.minecraftforge.oredict.OreDictionary.WILDCARD_VALUE;

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
    public static final BlockMSBST blockSeeds = new BlockSeeds();
    public static final BlockMSB blockLead = new BlockLead();
    public static final BlockMSB blockLeather = new BlockLeather();
    public static final BlockMSB blockBucket = new BlockBucket();
    public static final BlockMSB blockStick = new BlockStick();
    public static final BlockMSB blockFlint = new BlockFlint();
    public static final BlockMSB blockBone = new BlockBone();
    public static final BlockMSB blockSugarcane = new BlockSugarcane();
    public static final BlockMSB blockSugar = new BlockSugar();
    public static final BlockMSB blockNetherStar = new BlockNetherStar();
    public static final BlockMSB blockClay = new BlockClayStorage();
    public static final BlockMSB blockString = new BlockString();
    public static final BlockMSB blockFeather = new BlockFeather();
    public static final BlockMSB blockBread = new BlockBread();
    public static final BlockMSBST blockPorkchop = new BlockPorkchop();
    public static final BlockMSBST blockFish = new BlockFish();
    public static final BlockMSB blockCookie = new BlockCookie();
    public static final BlockMSBST blockBeef = new BlockBeef();
    public static final BlockMSB blockPumpkinPie = new BlockPumpkinPie();
    public static final BlockMSB blockGhastTear = new BlockGhastTear();
    public static final BlockMSBST blockSkull = new BlockSkullStorage();

    public static void init()
    {
        for (int i = 0; i < Utils.blockNames.length; i++)
        {
            registerBlock(Utils.blocksList[i], Utils.itemblocks[i], Utils.blockNames[i]);
        }
    }

    private static void registerOresBlock(){
        Block[] blocks = new Block[]
                {
                    blockApple, blockArrow, blockBlazeRod, blockCarrot, blockCharcoal,
                    blockEgg, blockEnderPearl, blockEnderEye, blockNetherWart, blockPotato,
                    blockRottenFlesh, blockSlimeball, blockFireball, blockLead, blockLeather,
                    blockBucket, blockStick, blockFlint, blockBone, blockSugarcane, blockSugar,
                    blockNetherStar, blockClay, blockString, blockFeather, blockBread,
                    blockCookie, blockPumpkinPie, blockGhastTear
                };



        Block[] blocksItemStack = new Block[]
                {
                        blockDye, blockGoldApple, blockSeeds, blockPorkchop, blockFish, blockSkull
                };


        for (int i = 0; i < blocks.length; i++)
        {
            registerOre(Names.BlocksUtil.blockNames[i], blocks[i]);
        }

        for (int i = 0; i < blocksItemStack.length; i++)
        {
            registerOre(Names.BlocksUtil.blockNamesItemStack[i], new ItemStack(blocksItemStack[i], 1, WILDCARD_VALUE));
        }

    }

    private static Block registerBlock(Block block, Class<? extends ItemBlock> itemclass, String name)
    {
        return GameRegistry.registerBlock(block, itemclass, name);
    }

    private static void registerOre(String oreName, Block ore)
    {
        OreDictionary.registerOre(oreName, ore);
    }

    private static void registerOre(String oreName, ItemStack ore)
    {
        OreDictionary.registerOre(oreName, ore);
    }
}
