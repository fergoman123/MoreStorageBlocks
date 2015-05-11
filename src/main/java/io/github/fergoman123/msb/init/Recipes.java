package io.github.fergoman123.msb.init;

import io.github.fergoman123.fergoutil.helper.RecipeHelper;
import io.github.fergoman123.fergoutil.item.crafting.BlockRecipe;
import io.github.fergoman123.fergoutil.item.crafting.ShapelessItemRecipe;
import io.github.fergoman123.msb.common.RecipeList;

import static io.github.fergoman123.fergoutil.helper.RecipeHelper.addBlockRecipe;
import static io.github.fergoman123.fergoutil.helper.RecipeHelper.addShapelessItemRecipe;

public class Recipes
{
    public static final String[] blockRecipe = new String[]{"xxx", "xxx", "xxx"};
    public static final char x = 'x';

    public static void init()
    {
        addBlockRecipe(RecipeList.blockCharcoal);
        addBlockRecipe(RecipeList.blockApple);
        addBlockRecipe(RecipeList.blockGoldApple0);
        addBlockRecipe(RecipeList.blockGoldApple1);
        addBlockRecipe(RecipeList.blockBook);
        addBlockRecipe(RecipeList.blockEgg);
        addBlockRecipe(RecipeList.blockEnderPearl);
        addBlockRecipe(RecipeList.blockEnderEye);
        addBlockRecipe(RecipeList.blockLead);
        addBlockRecipe(RecipeList.blockReed);
        addBlockRecipe(RecipeList.blockSeeds0);
        addBlockRecipe(RecipeList.blockSeeds1);
        addBlockRecipe(RecipeList.blockSeeds2);
        addBlockRecipe(RecipeList.blockStick);
        addBlockRecipe(RecipeList.blockLeather);
        addBlockRecipe(RecipeList.blockBucket);
        for (BlockRecipe recipe : RecipeList.blockDye) {
            RecipeHelper.addBlockRecipe(recipe);
        }
        addBlockRecipe(RecipeList.blockFireball);
        addBlockRecipe(RecipeList.blockSlimeball);
        addBlockRecipe(RecipeList.blockRottenFlesh);
        addBlockRecipe(RecipeList.blockPotato);
        addBlockRecipe(RecipeList.blockNetherWart);
        addBlockRecipe(RecipeList.blockGunpowder);
        addBlockRecipe(RecipeList.blockCarrot);
        addBlockRecipe(RecipeList.blockArrow);
        addBlockRecipe(RecipeList.blockBlazeRod);
        addBlockRecipe(RecipeList.blockFlint);
        addBlockRecipe(RecipeList.blockBone);
        addBlockRecipe(RecipeList.blockSugar);
        addBlockRecipe(RecipeList.blockNetherStar);
        addBlockRecipe(RecipeList.blockClay);
        addBlockRecipe(RecipeList.blockString);
        addBlockRecipe(RecipeList.blockFeather);
        addBlockRecipe(RecipeList.blockBread);
        addBlockRecipe(RecipeList.blockPorkchop0);
        addBlockRecipe(RecipeList.blockPorkchop1);
        addBlockRecipe(RecipeList.blockFish0);
        addBlockRecipe(RecipeList.blockFish1);
        addBlockRecipe(RecipeList.blockFish2);
        addBlockRecipe(RecipeList.blockFish3);
        addBlockRecipe(RecipeList.blockFish4);
        addBlockRecipe(RecipeList.blockFish5);
        addBlockRecipe(RecipeList.blockCookie);
        addBlockRecipe(RecipeList.blockBeef0);
        addBlockRecipe(RecipeList.blockBeef1);
        addBlockRecipe(RecipeList.blockPumpkinPie);
        addBlockRecipe(RecipeList.blockGhastTear);
        addBlockRecipe(RecipeList.blockSkull0);
        addBlockRecipe(RecipeList.blockSkull1);
        addBlockRecipe(RecipeList.blockSkull2);
        addBlockRecipe(RecipeList.blockSkull3);
        addBlockRecipe(RecipeList.blockMutton0);
        addBlockRecipe(RecipeList.blockMutton1);
        addBlockRecipe(RecipeList.blockRabbit0);
        addBlockRecipe(RecipeList.blockRabbit1);

        addShapelessItemRecipe(RecipeList.charcoal);
        addShapelessItemRecipe(RecipeList.apple);
        addShapelessItemRecipe(RecipeList.golden_apple0);
        addShapelessItemRecipe(RecipeList.golden_apple1);
        addShapelessItemRecipe(RecipeList.book);
        addShapelessItemRecipe(RecipeList.egg);
        addShapelessItemRecipe(RecipeList.ender_pearl);
        addShapelessItemRecipe(RecipeList.ender_eye);
        addShapelessItemRecipe(RecipeList.lead);
        addShapelessItemRecipe(RecipeList.reeds);
        addShapelessItemRecipe(RecipeList.wheat_seeds);
        addShapelessItemRecipe(RecipeList.pumpkin_seeds);
        addShapelessItemRecipe(RecipeList.melon_seeds);
        addShapelessItemRecipe(RecipeList.stick);
        addShapelessItemRecipe(RecipeList.leather);
        addShapelessItemRecipe(RecipeList.bucket);
        for (ShapelessItemRecipe recipe : RecipeList.dye) {
            addShapelessItemRecipe(recipe);
        }
        addShapelessItemRecipe(RecipeList.fire_charge);
        addShapelessItemRecipe(RecipeList.slime_ball);
        addShapelessItemRecipe(RecipeList.rotten_flesh);
        addShapelessItemRecipe(RecipeList.potato);
        addShapelessItemRecipe(RecipeList.nether_wart);
        addShapelessItemRecipe(RecipeList.gunpowder);
        addShapelessItemRecipe(RecipeList.carrot);
        addShapelessItemRecipe(RecipeList.arrow);
        addShapelessItemRecipe(RecipeList.blaze_rod);
        addShapelessItemRecipe(RecipeList.flint);
        addShapelessItemRecipe(RecipeList.bone);
        addShapelessItemRecipe(RecipeList.sugar);
        addShapelessItemRecipe(RecipeList.nether_star);
        addShapelessItemRecipe(RecipeList.clay_ball);
        addShapelessItemRecipe(RecipeList.string);
        addShapelessItemRecipe(RecipeList.feather);
        addShapelessItemRecipe(RecipeList.bread);
        addShapelessItemRecipe(RecipeList.porkchop);
        addShapelessItemRecipe(RecipeList.cooked_porkchop);
        addShapelessItemRecipe(RecipeList.fish0);
        addShapelessItemRecipe(RecipeList.fish1);
        addShapelessItemRecipe(RecipeList.fish2);
        addShapelessItemRecipe(RecipeList.fish3);
        addShapelessItemRecipe(RecipeList.cooked_fish0);
        addShapelessItemRecipe(RecipeList.cooked_fish1);
        addShapelessItemRecipe(RecipeList.cookie);
        addShapelessItemRecipe(RecipeList.beef);
        addShapelessItemRecipe(RecipeList.cooked_beef);
        addShapelessItemRecipe(RecipeList.pumpkin_pie);
        addShapelessItemRecipe(RecipeList.ghast_tear);
        addShapelessItemRecipe(RecipeList.skull0);
        addShapelessItemRecipe(RecipeList.skull1);
        addShapelessItemRecipe(RecipeList.skull2);
        addShapelessItemRecipe(RecipeList.skull4);
        addShapelessItemRecipe(RecipeList.mutton);
        addShapelessItemRecipe(RecipeList.cooked_mutton);
        addShapelessItemRecipe(RecipeList.rabbit);
        addShapelessItemRecipe(RecipeList.cooked_rabbit);
    }
}
