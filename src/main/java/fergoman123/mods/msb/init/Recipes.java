 /*
  * More Storage Blocks
  * Copyright (c) 2014 fergoman123.
  * All rights reserved. This program and the accompanying materials
  * are made available under the terms of the GNU Lesser Public License v2.1
  * which accompanies this distribution, and is available at
  * http://www.gnu.org/licenses/gpl-3.0.html
  */

package fergoman123.mods.msb.init;

import fergoman123.mods.fergoutil.helper.RecipeHelper;
import fergoman123.mods.msb.util.MSBStacks;
import fergoman123.mods.msb.util.RecipeList;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

 public class Recipes
{
    public static void init()
    {
        RecipeHelper.addRecipe(MSBStacks.blockApple, RecipeList.blockApple);
        RecipeHelper.addRecipe(MSBStacks.blockArrow, RecipeList.blockArrow);
        RecipeHelper.addRecipe(MSBStacks.blockBlazeRod, RecipeList.blockBlazeRod);
        RecipeHelper.addRecipe(MSBStacks.blockBook, RecipeList.blockBook);
        RecipeHelper.addRecipe(MSBStacks.blockCarrot, RecipeList.blockCarrot);
        RecipeHelper.addRecipe(MSBStacks.blockCharcoal, RecipeList.blockCharcoal);
        RecipeHelper.addRecipe(MSBStacks.blockDye0, RecipeList.blockDye0);
        RecipeHelper.addRecipe(MSBStacks.blockDye1, RecipeList.blockDye1);
        RecipeHelper.addRecipe(MSBStacks.blockDye2, RecipeList.blockDye2);
        RecipeHelper.addRecipe(MSBStacks.blockDye3, RecipeList.blockDye3);
        RecipeHelper.addRecipe(MSBStacks.blockDye4, RecipeList.blockDye4);
        RecipeHelper.addRecipe(MSBStacks.blockDye5, RecipeList.blockDye5);
        RecipeHelper.addRecipe(MSBStacks.blockDye6, RecipeList.blockDye6);
        RecipeHelper.addRecipe(MSBStacks.blockDye7, RecipeList.blockDye7);
        RecipeHelper.addRecipe(MSBStacks.blockDye8, RecipeList.blockDye8);
        RecipeHelper.addRecipe(MSBStacks.blockDye9, RecipeList.blockDye9);
        RecipeHelper.addRecipe(MSBStacks.blockDye10, RecipeList.blockDye10);
        RecipeHelper.addRecipe(MSBStacks.blockDye11, RecipeList.blockDye11);
        RecipeHelper.addRecipe(MSBStacks.blockDye12, RecipeList.blockDye12);
        RecipeHelper.addRecipe(MSBStacks.blockDye13, RecipeList.blockDye13);
        RecipeHelper.addRecipe(MSBStacks.blockDye14, RecipeList.blockDye14);
        RecipeHelper.addRecipe(MSBStacks.blockDye15, RecipeList.blockDye15);
        RecipeHelper.addRecipe(MSBStacks.blockEgg, RecipeList.blockEgg);
        RecipeHelper.addRecipe(MSBStacks.blockEnderPearl, RecipeList.blockEnderPearl);
        RecipeHelper.addRecipe(MSBStacks.blockEnderEye, RecipeList.blockEnderEye);
        RecipeHelper.addRecipe(MSBStacks.blockGoldApple0, RecipeList.blockGoldApple0);
        RecipeHelper.addRecipe(MSBStacks.blockGoldApple1, RecipeList.blockGoldApple1);
        RecipeHelper.addRecipe(MSBStacks.blockGunpowder, RecipeList.blockGunpowder);
        RecipeHelper.addRecipe(MSBStacks.blockNetherWart, RecipeList.blockNetherWart);
        RecipeHelper.addRecipe(MSBStacks.blockPotato, RecipeList.blockPotato);
        RecipeHelper.addRecipe(MSBStacks.blockRottenFlesh, RecipeList.blockRottenFlesh);
        RecipeHelper.addRecipe(MSBStacks.blockSlimeball, RecipeList.blockSlimeball);
        RecipeHelper.addRecipe(MSBStacks.blockFireball, RecipeList.blockFireball);
        RecipeHelper.addRecipe(MSBStacks.blockSeeds, RecipeList.blockSeeds);
        RecipeHelper.addRecipe(MSBStacks.blockLead, RecipeList.blockLead);
        RecipeHelper.addRecipe(MSBStacks.blockLeather, RecipeList.blockLeather);
        RecipeHelper.addRecipe(MSBStacks.blockBucket, RecipeList.blockBucket);


        RecipeHelper.addShapelessRecipe(new ItemStack(Items.apple, 9), MSBStacks.blockApple);
        RecipeHelper.addShapelessRecipe(new ItemStack(Items.arrow, 9), MSBStacks.blockArrow);
        RecipeHelper.addShapelessRecipe(new ItemStack(Items.blaze_rod, 9), MSBStacks.blockBlazeRod);
        RecipeHelper.addShapelessRecipe(new ItemStack(Items.book, 9), MSBStacks.blockBook);
        RecipeHelper.addShapelessRecipe(new ItemStack(Items.carrot, 9), MSBStacks.blockCarrot);
        RecipeHelper.addShapelessRecipe(new ItemStack(Items.coal, 9, 1), MSBStacks.blockCharcoal);
        RecipeHelper.addShapelessRecipe(new ItemStack(Items.dye, 9, 0), MSBStacks.blockDye0);
        RecipeHelper.addShapelessRecipe(new ItemStack(Items.dye, 9, 1), MSBStacks.blockDye1);
        RecipeHelper.addShapelessRecipe(new ItemStack(Items.dye, 9, 2), MSBStacks.blockDye2);
        RecipeHelper.addShapelessRecipe(new ItemStack(Items.dye, 9, 3), MSBStacks.blockDye3);
        RecipeHelper.addShapelessRecipe(new ItemStack(Items.dye, 9, 4), MSBStacks.blockDye4);
        RecipeHelper.addShapelessRecipe(new ItemStack(Items.dye, 9, 5), MSBStacks.blockDye5);
        RecipeHelper.addShapelessRecipe(new ItemStack(Items.dye, 9, 6), MSBStacks.blockDye6);
        RecipeHelper.addShapelessRecipe(new ItemStack(Items.dye, 9, 7), MSBStacks.blockDye7);
        RecipeHelper.addShapelessRecipe(new ItemStack(Items.dye, 9, 8), MSBStacks.blockDye8);
        RecipeHelper.addShapelessRecipe(new ItemStack(Items.dye, 9, 9), MSBStacks.blockDye9);
        RecipeHelper.addShapelessRecipe(new ItemStack(Items.dye, 9, 10), MSBStacks.blockDye10);
        RecipeHelper.addShapelessRecipe(new ItemStack(Items.dye, 9, 11), MSBStacks.blockDye11);
        RecipeHelper.addShapelessRecipe(new ItemStack(Items.dye, 9, 12), MSBStacks.blockDye12);
        RecipeHelper.addShapelessRecipe(new ItemStack(Items.dye, 9, 13), MSBStacks.blockDye13);
        RecipeHelper.addShapelessRecipe(new ItemStack(Items.dye, 9, 14), MSBStacks.blockDye14);
        RecipeHelper.addShapelessRecipe(new ItemStack(Items.dye, 9, 15), MSBStacks.blockDye15);
        RecipeHelper.addShapelessRecipe(new ItemStack(Items.egg, 9), MSBStacks.blockEgg);
        RecipeHelper.addShapelessRecipe(new ItemStack(Items.ender_pearl, 9), MSBStacks.blockEnderPearl);
        RecipeHelper.addShapelessRecipe(new ItemStack(Items.ender_eye, 9), MSBStacks.blockEnderEye);
        RecipeHelper.addShapelessRecipe(new ItemStack(Items.golden_apple, 9, 0), MSBStacks.blockGoldApple0);
        RecipeHelper.addShapelessRecipe(new ItemStack(Items.golden_apple, 9, 1), MSBStacks.blockGoldApple1);
        RecipeHelper.addShapelessRecipe(new ItemStack(Items.gunpowder, 9), MSBStacks.blockGunpowder);
        RecipeHelper.addShapelessRecipe(new ItemStack(Items.nether_wart, 9), MSBStacks.blockNetherWart);
        RecipeHelper.addShapelessRecipe(new ItemStack(Items.potato, 9), MSBStacks.blockPotato);
        RecipeHelper.addShapelessRecipe(new ItemStack(Items.rotten_flesh, 9), MSBStacks.blockRottenFlesh);
        RecipeHelper.addShapelessRecipe(new ItemStack(Items.slime_ball, 9), MSBStacks.blockSlimeball);
        RecipeHelper.addShapelessRecipe(new ItemStack(Items.fire_charge, 9), MSBStacks.blockFireball);
        RecipeHelper.addShapelessRecipe(new ItemStack(Items.wheat_seeds, 9), MSBStacks.blockSeeds);
        RecipeHelper.addShapelessRecipe(new ItemStack(Items.lead, 9), MSBStacks.blockLead);
        RecipeHelper.addShapelessRecipe(new ItemStack(Items.leather, 9), MSBStacks.blockLeather);
        RecipeHelper.addShapelessRecipe(new ItemStack(Items.bucket, 9), MSBStacks.blockBucket);
    }
}
