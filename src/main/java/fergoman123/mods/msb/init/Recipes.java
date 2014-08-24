 /*
  * More Storage Blocks
  * Copyright (c) 2014 fergoman123.
  * All rights reserved. This program and the accompanying materials
  * are made available under the terms of the GNU Lesser Public License v2.1
  * which accompanies this distribution, and is available at
  * http://www.gnu.org/licenses/gpl-3.0.html
  */

package fergoman123.mods.msb.init;

import fergoman123.mods.msb.util.MSBStacks;
import fergoman123.mods.msb.util.RecipeList;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

import static fergoman123.mods.fergoutil.helper.RecipeHelper.addShapedRecipe;
import static fergoman123.mods.fergoutil.helper.RecipeHelper.addShapelessRecipe;

public class Recipes
{
    public static void init()
    {
        addShapedRecipe(MSBStacks.blockApple, RecipeList.blockApple);
        addShapedRecipe(MSBStacks.blockArrow, RecipeList.blockArrow);
        addShapedRecipe(MSBStacks.blockBlazeRod, RecipeList.blockBlazeRod);
        addShapedRecipe(MSBStacks.blockBook, RecipeList.blockBook);
        addShapedRecipe(MSBStacks.blockCarrot, RecipeList.blockCarrot);
        addShapedRecipe(MSBStacks.blockCharcoal, RecipeList.blockCharcoal);
        addShapedRecipe(MSBStacks.blockDye0, RecipeList.blockDye0);
        addShapedRecipe(MSBStacks.blockDye1, RecipeList.blockDye1);
        addShapedRecipe(MSBStacks.blockDye2, RecipeList.blockDye2);
        addShapedRecipe(MSBStacks.blockDye3, RecipeList.blockDye3);
        addShapedRecipe(MSBStacks.blockDye4, RecipeList.blockDye4);
        addShapedRecipe(MSBStacks.blockDye5, RecipeList.blockDye5);
        addShapedRecipe(MSBStacks.blockDye6, RecipeList.blockDye6);
        addShapedRecipe(MSBStacks.blockDye7, RecipeList.blockDye7);
        addShapedRecipe(MSBStacks.blockDye8, RecipeList.blockDye8);
        addShapedRecipe(MSBStacks.blockDye9, RecipeList.blockDye9);
        addShapedRecipe(MSBStacks.blockDye10, RecipeList.blockDye10);
        addShapedRecipe(MSBStacks.blockDye11, RecipeList.blockDye11);
        addShapedRecipe(MSBStacks.blockDye12, RecipeList.blockDye12);
        addShapedRecipe(MSBStacks.blockDye13, RecipeList.blockDye13);
        addShapedRecipe(MSBStacks.blockDye14, RecipeList.blockDye14);
        addShapedRecipe(MSBStacks.blockDye15, RecipeList.blockDye15);
        addShapedRecipe(MSBStacks.blockEgg, RecipeList.blockEgg);
        addShapedRecipe(MSBStacks.blockEnderPearl, RecipeList.blockEnderPearl);
        addShapedRecipe(MSBStacks.blockEnderEye, RecipeList.blockEnderEye);
        addShapedRecipe(MSBStacks.blockGoldApple0, RecipeList.blockGoldApple0);
        addShapedRecipe(MSBStacks.blockGoldApple1, RecipeList.blockGoldApple1);
        addShapedRecipe(MSBStacks.blockGunpowder, RecipeList.blockGunpowder);
        addShapedRecipe(MSBStacks.blockNetherWart, RecipeList.blockNetherWart);
        addShapedRecipe(MSBStacks.blockPotato, RecipeList.blockPotato);
        addShapedRecipe(MSBStacks.blockRottenFlesh, RecipeList.blockRottenFlesh);
        addShapedRecipe(MSBStacks.blockSlimeball, RecipeList.blockSlimeball);
        addShapedRecipe(MSBStacks.blockFireball, RecipeList.blockFireball);
        addShapedRecipe(MSBStacks.blockSeeds, RecipeList.blockSeeds);
        addShapedRecipe(MSBStacks.blockLead, RecipeList.blockLead);
        addShapedRecipe(MSBStacks.blockLeather, RecipeList.blockLeather);
        addShapedRecipe(MSBStacks.blockBucket, RecipeList.blockBucket);


        addShapelessRecipe(new ItemStack(Items.apple), MSBStacks.blockApple);
        addShapelessRecipe(new ItemStack(Items.arrow), MSBStacks.blockArrow);
        addShapelessRecipe(new ItemStack(Items.blaze_rod), MSBStacks.blockBlazeRod);
    }
}
