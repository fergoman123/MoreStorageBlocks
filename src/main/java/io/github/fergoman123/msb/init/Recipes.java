package io.github.fergoman123.msb.init;

import io.github.fergoman123.msb.enums.EnumTypes;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

import static io.github.fergoman123.fergoutil.helper.RecipeHelper.addShapelessRecipe;
import static io.github.fergoman123.fergoutil.helper.RecipeHelper.addStorageBlockRecipe;
public class Recipes {
    public static final String[] blockRecipe = new String[]{"xxx", "xxx", "xxx"};
    public static final char x = 'x';

    public static void init() {
        addStorageBlockRecipe(new ItemStack(ModBlocks.blockCharcoal), new ItemStack(Items.coal, 1, 1));
        addStorageBlockRecipe(new ItemStack(ModBlocks.blockApple), new ItemStack(Items.apple));
        addStorageBlockRecipe(new ItemStack(ModBlocks.blockGoldApple, 1, 0), new ItemStack(Items.golden_apple, 1, 0));
        addStorageBlockRecipe(new ItemStack(ModBlocks.blockGoldApple, 1, 1), new ItemStack(Items.golden_apple, 1, 1));
        addStorageBlockRecipe(new ItemStack(ModBlocks.blockBook), new ItemStack(Items.book));
        addStorageBlockRecipe(new ItemStack(ModBlocks.blockEgg), new ItemStack(Items.egg));
        addStorageBlockRecipe(new ItemStack(ModBlocks.blockEnderPearl), new ItemStack(Items.ender_pearl));
        addStorageBlockRecipe(new ItemStack(ModBlocks.blockEnderEye), new ItemStack(Items.ender_eye));
        addStorageBlockRecipe(new ItemStack(ModBlocks.blockLead), new ItemStack(Items.lead));
        addStorageBlockRecipe(new ItemStack(ModBlocks.blockReed), new ItemStack(Items.reeds));
        addStorageBlockRecipe(new ItemStack(ModBlocks.blockSeeds, 1, 0), new ItemStack(Items.wheat_seeds));
        addStorageBlockRecipe(new ItemStack(ModBlocks.blockSeeds, 1, 1), new ItemStack(Items.pumpkin_seeds));
        addStorageBlockRecipe(new ItemStack(ModBlocks.blockSeeds, 1, 2), new ItemStack(Items.melon_seeds));
        addStorageBlockRecipe(new ItemStack(ModBlocks.blockStick), new ItemStack(Items.stick));
        addStorageBlockRecipe(new ItemStack(ModBlocks.blockLeather), new ItemStack(Items.leather));
        for (int i = 0; i < EnumTypes.Dye.values().length; i++) {
            int[] dyedamage = new int[]{0, 1, 2, 3, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
            addStorageBlockRecipe(new ItemStack(ModBlocks.blockDye, 1, i), new ItemStack(Items.dye, 1, dyedamage[i]));
        }
        addStorageBlockRecipe(new ItemStack(ModBlocks.blockFireball), new ItemStack(Items.fire_charge));
        addStorageBlockRecipe(new ItemStack(ModBlocks.blockSlimeball), new ItemStack(Items.slime_ball));
        addStorageBlockRecipe(new ItemStack(ModBlocks.blockRottenFlesh), new ItemStack(Items.rotten_flesh));
        addStorageBlockRecipe(new ItemStack(ModBlocks.blockNetherWart), new ItemStack(Items.nether_wart));
        addStorageBlockRecipe(new ItemStack(ModBlocks.blockGunpowder), new ItemStack(Items.gunpowder));
        addStorageBlockRecipe(new ItemStack(ModBlocks.blockCarrot), new ItemStack(Items.carrot));
        addStorageBlockRecipe(new ItemStack(ModBlocks.blockArrow), new ItemStack(Items.arrow));
        addStorageBlockRecipe(new ItemStack(ModBlocks.blockBlazeRod), new ItemStack(Items.blaze_rod));
        addStorageBlockRecipe(new ItemStack(ModBlocks.blockFlint), new ItemStack(Items.flint));
        addStorageBlockRecipe(new ItemStack(ModBlocks.blockBone), new ItemStack(Items.bone));
        addStorageBlockRecipe(new ItemStack(ModBlocks.blockSugar), new ItemStack(Items.nether_star));
        addStorageBlockRecipe(new ItemStack(ModBlocks.blockClay), new ItemStack(Items.clay_ball));
        addStorageBlockRecipe(new ItemStack(ModBlocks.blockString), new ItemStack(Items.string));
        addStorageBlockRecipe(new ItemStack(ModBlocks.blockFeather), new ItemStack(Items.feather));
        addStorageBlockRecipe(new ItemStack(ModBlocks.blockBread), new ItemStack(Items.bread));
        addStorageBlockRecipe(new ItemStack(ModBlocks.blockPorkchop, 1, 0), new ItemStack(Items.porkchop));
        addStorageBlockRecipe(new ItemStack(ModBlocks.blockPorkchop, 1, 1), new ItemStack(Items.cooked_porkchop));
        addStorageBlockRecipe(new ItemStack(ModBlocks.blockFish, 1, 0), new ItemStack(Items.fish, 1, 0));
        addStorageBlockRecipe(new ItemStack(ModBlocks.blockFish, 1, 1), new ItemStack(Items.fish, 1, 1));
        addStorageBlockRecipe(new ItemStack(ModBlocks.blockFish, 1, 2), new ItemStack(Items.fish, 1, 2));
        addStorageBlockRecipe(new ItemStack(ModBlocks.blockFish, 1, 3), new ItemStack(Items.fish, 1, 3));
        addStorageBlockRecipe(new ItemStack(ModBlocks.blockFish, 1, 4), new ItemStack(Items.cooked_fish, 1, 0));
        addStorageBlockRecipe(new ItemStack(ModBlocks.blockFish, 1, 5), new ItemStack(Items.cooked_fish, 1, 1));
        addStorageBlockRecipe(new ItemStack(ModBlocks.blockCookie), new ItemStack(Items.cookie));
        addStorageBlockRecipe(new ItemStack(ModBlocks.blockBeef, 1, 0), new ItemStack(Items.beef));
        addStorageBlockRecipe(new ItemStack(ModBlocks.blockBeef, 1, 1), new ItemStack(Items.cooked_beef));
        addStorageBlockRecipe(new ItemStack(ModBlocks.blockPumpkinPie), new ItemStack(Items.pumpkin_pie));
        addStorageBlockRecipe(new ItemStack(ModBlocks.blockGhastTear), new ItemStack(Items.ghast_tear));
        addStorageBlockRecipe(new ItemStack(ModBlocks.blockSkull, 1, 0), new ItemStack(Items.skull, 1, 0));
        addStorageBlockRecipe(new ItemStack(ModBlocks.blockSkull, 1, 1), new ItemStack(Items.skull, 1, 1));
        addStorageBlockRecipe(new ItemStack(ModBlocks.blockSkull, 1, 2), new ItemStack(Items.skull, 1, 2));
        addStorageBlockRecipe(new ItemStack(ModBlocks.blockSkull, 1, 3), new ItemStack(Items.skull, 1, 4));
        addStorageBlockRecipe(new ItemStack(ModBlocks.blockMutton, 1, 0), new ItemStack(Items.mutton));
        addStorageBlockRecipe(new ItemStack(ModBlocks.blockMutton, 1, 1), new ItemStack(Items.cooked_mutton));
        addStorageBlockRecipe(new ItemStack(ModBlocks.blockRabbit, 1, 0), new ItemStack(Items.rabbit));
        addStorageBlockRecipe(new ItemStack(ModBlocks.blockRabbit, 1, 1), new ItemStack(Items.cooked_rabbit));

        addShapelessRecipe(new ItemStack(Items.coal, 9, 1), new ItemStack(ModBlocks.blockCharcoal, 0));
        addShapelessRecipe(new ItemStack(Items.apple, 9), new ItemStack(ModBlocks.blockApple));
        addShapelessRecipe(new ItemStack(Items.golden_apple, 9, 0), new ItemStack(ModBlocks.blockGoldApple, 1, 0));
        addShapelessRecipe(new ItemStack(Items.golden_apple, 9, 1), new ItemStack(ModBlocks.blockGoldApple, 1, 1));
        addShapelessRecipe(new ItemStack(Items.book, 9), new ItemStack(ModBlocks.blockBook));
        addShapelessRecipe(new ItemStack(Items.egg, 9), new ItemStack(ModBlocks.blockEgg));
        addShapelessRecipe(new ItemStack(Items.ender_pearl, 9), new ItemStack(ModBlocks.blockEnderPearl));
        addShapelessRecipe(new ItemStack(Items.ender_eye, 9), new ItemStack(ModBlocks.blockEnderEye));
        addShapelessRecipe(new ItemStack(Items.lead, 9), new ItemStack(ModBlocks.blockLead));
        addShapelessRecipe(new ItemStack(Items.reeds), new ItemStack(ModBlocks.blockReed));
        addShapelessRecipe(new ItemStack(Items.wheat_seeds, 9), new ItemStack(ModBlocks.blockSeeds, 1, 0));
        addShapelessRecipe(new ItemStack(Items.pumpkin_seeds, 9), new ItemStack(ModBlocks.blockSeeds, 1, 1));
        addShapelessRecipe(new ItemStack(Items.melon_seeds, 9), new ItemStack(ModBlocks.blockSeeds, 1, 2));
        addShapelessRecipe(new ItemStack(Items.stick, 9), new ItemStack(ModBlocks.blockStick));
        addShapelessRecipe(new ItemStack(Items.leather, 9), new ItemStack(ModBlocks.blockLeather));
        addShapelessRecipe(new ItemStack(Items.bucket, 9), new ItemStack(ModBlocks.blockBucket));
        for (int i = 0; i < 15; i++) {
            int[] dyedamage = new int[]{0, 1, 2, 3, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
            addShapelessRecipe(new ItemStack(Items.dye, 9, dyedamage[i]), new ItemStack(ModBlocks.blockDye, 1, i));
        }
        addShapelessRecipe(new ItemStack(Items.fire_charge, 9), new ItemStack(ModBlocks.blockFireball));
        addShapelessRecipe(new ItemStack(Items.slime_ball, 9), new ItemStack(ModBlocks.blockSlimeball));
        addShapelessRecipe(new ItemStack(Items.rotten_flesh, 9), new ItemStack(ModBlocks.blockRottenFlesh));
        addShapelessRecipe(new ItemStack(Items.potato, 9), new ItemStack(ModBlocks.blockPotato));
        addShapelessRecipe(new ItemStack(Items.nether_wart, 9), new ItemStack(ModBlocks.blockNetherWart));
        addShapelessRecipe(new ItemStack(Items.gunpowder, 9), new ItemStack(ModBlocks.blockGunpowder));
        addShapelessRecipe(new ItemStack(Items.carrot, 9), new ItemStack(ModBlocks.blockCarrot));
        addShapelessRecipe(new ItemStack(Items.arrow, 9), new ItemStack(ModBlocks.blockArrow));
        addShapelessRecipe(new ItemStack(Items.flint, 9), new ItemStack(ModBlocks.blockFlint));
        addShapelessRecipe(new ItemStack(Items.bone, 9), new ItemStack(ModBlocks.blockBone));
        addShapelessRecipe(new ItemStack(Items.sugar, 9), new ItemStack(ModBlocks.blockSugar));
        addShapelessRecipe(new ItemStack(Items.nether_star, 9), new ItemStack(ModBlocks.blockNetherStar));
        addShapelessRecipe(new ItemStack(Items.clay_ball, 9), new ItemStack(ModBlocks.blockClay));
        addShapelessRecipe(new ItemStack(Items.string, 9), new ItemStack(ModBlocks.blockString));
        addShapelessRecipe(new ItemStack(Items.feather, 9), new ItemStack(ModBlocks.blockFeather));
        addShapelessRecipe(new ItemStack(Items.bread, 9), new ItemStack(ModBlocks.blockBread));
        addShapelessRecipe(new ItemStack(Items.porkchop, 9), new ItemStack(ModBlocks.blockPorkchop, 1, 0));
        addShapelessRecipe(new ItemStack(Items.cooked_porkchop, 9), new ItemStack(ModBlocks.blockPorkchop, 1, 1));
        addShapelessRecipe(new ItemStack(Items.fish, 9, 0), new ItemStack(ModBlocks.blockFish, 1, 0));
        addShapelessRecipe(new ItemStack(Items.fish, 9, 1), new ItemStack(ModBlocks.blockFish, 1, 1));
        addShapelessRecipe(new ItemStack(Items.fish, 9, 2), new ItemStack(ModBlocks.blockFish, 1, 2));
        addShapelessRecipe(new ItemStack(Items.fish, 9, 3), new ItemStack(ModBlocks.blockFish, 1, 3));
        addShapelessRecipe(new ItemStack(Items.cooked_fish, 9, 0), new ItemStack(ModBlocks.blockFish, 1, 4));
        addShapelessRecipe(new ItemStack(Items.cooked_fish, 9, 1), new ItemStack(ModBlocks.blockFish, 1, 5));
        addShapelessRecipe(new ItemStack(Items.cookie, 9), new ItemStack(ModBlocks.blockCookie));
        addShapelessRecipe(new ItemStack(Items.beef, 9), new ItemStack(ModBlocks.blockBeef, 1, 0));
        addShapelessRecipe(new ItemStack(Items.cooked_beef, 9), new ItemStack(ModBlocks.blockBeef, 1, 1));
        addShapelessRecipe(new ItemStack(Items.pumpkin_pie, 9), new ItemStack(ModBlocks.blockPumpkinPie));
        addShapelessRecipe(new ItemStack(Items.ghast_tear, 9), new ItemStack(ModBlocks.blockGhastTear));
        addShapelessRecipe(new ItemStack(Items.skull, 9, 0), new ItemStack(ModBlocks.blockSkull, 1, 0));
        addShapelessRecipe(new ItemStack(Items.skull, 9, 1), new ItemStack(ModBlocks.blockSkull, 1, 1));
        addShapelessRecipe(new ItemStack(Items.skull, 9, 2), new ItemStack(ModBlocks.blockSkull, 1, 2));
        addShapelessRecipe(new ItemStack(Items.skull, 9, 4), new ItemStack(ModBlocks.blockSkull, 1, 3));
        addShapelessRecipe(new ItemStack(Items.mutton, 9), new ItemStack(ModBlocks.blockMutton, 1, 0));
        addShapelessRecipe(new ItemStack(Items.cooked_mutton, 9), new ItemStack(ModBlocks.blockMutton, 1, 1));
        addShapelessRecipe(new ItemStack(Items.rabbit, 9), new ItemStack(ModBlocks.blockRabbit, 1, 0));
        addShapelessRecipe(new ItemStack(Items.cooked_rabbit, 9), new ItemStack(ModBlocks.blockRabbit, 1, 1));
    }
}
