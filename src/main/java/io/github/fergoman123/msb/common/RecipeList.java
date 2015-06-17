package io.github.fergoman123.msb.common;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class RecipeList
{
    public static void init(){
//        addRecipe(new ItemStack(ModBlocks.blockCharcoal), new Object[]{"xxx", "xxx", "xxx", 'x', new ItemStack(Items.coal, 1, 1)});
//        addRecipe(new ItemStack(ModBlocks.blockApple), new Object[]{"xxx", "xxx", "xxx", 'x', Items.apple});
//        for (int i = 0; i < BlockNames.blockGoldApple.length; i++) {
//            addRecipe(new ItemStack(ModBlocks.blockGoldApple, 1, i), new Object[]{"xxx", "xxx", "xxx", 'x', new ItemStack(Items.golden_apple, 1, i)});
//        }
//        addRecipe(new ItemStack(ModBlocks.blockBook), new Object[]{"xxx", "xxx", "xxx", 'x', Items.book});
//        addRecipe(new ItemStack(ModBlocks.blockEgg), new Object[]{"xxx", "xxx", "xxx", 'x', Items.egg});
//        addRecipe(new ItemStack(ModBlocks.blockEnderPearl), new Object[]{"xxx", "xxx", "xxx", 'x', Items.ender_pearl});
//        addRecipe(new ItemStack(ModBlocks.blockEnderEye), new Object[]{"xxx", "xxx", "xxx", 'x', Items.ender_eye});
//        addRecipe(new ItemStack(ModBlocks.blockLead), new Object[]{"xxx", "xxx", "xxx", 'x', Items.lead});
//        addRecipe(new ItemStack(ModBlocks.blockReed), new Object[]{"xxx", "xxx", "xxx", 'x', Items.reeds});
//        for (int i = 0; i < BlockNames.blockSeeds.length; i++) {
//            Item[] items = new Item[]{Items.wheat_seeds, Items.pumpkin_seeds, Items.melon_seeds};
//            addRecipe(new ItemStack(ModBlocks.blockSeeds, 1, i), new Object[]{"xxx", "xxx", "xxx", 'x', items[i]});
//        }
//        addRecipe(new ItemStack(ModBlocks.blockStick), new Object[]{"xxx", "xxx", "xxx", 'x', Items.stick});
//        addRecipe(new ItemStack(ModBlocks.blockLeather), new Object[]{"xxx", "xxx", "xxx", 'x', Items.leather});
//        addRecipe(new ItemStack(ModBlocks.blockBucket), new Object[]{"xxx", "xxx", "xxx", 'x', Items.bucket});
//        for (int i = 0; i < BlockNames.blockDye.length; i++) {
//            int[] damage = new int[]{0, 1, 2, 3, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
//            addRecipe(new ItemStack(ModBlocks.blockDye, 1, i), new Object[]{"xxx", "xxx", "xxx", 'x', new ItemStack(Items.dye, 1, damage[i])});
//        }
//        addRecipe(new ItemStack(ModBlocks.blockFireball), new Object[]{"xxx", "xxx", "xxx", 'x', Items.fire_charge});
//        addRecipe(new ItemStack(ModBlocks.blockSlimeball), new Object[]{"xxx", "xxx", "xxx", 'x', Items.slime_ball});
//        addRecipe(new ItemStack(ModBlocks.blockRottenFlesh), new Object[]{"xxx", "xxx", "xxx", 'x', Items.rotten_flesh});
//        addRecipe(new ItemStack(ModBlocks.blockPotato), new Object[]{"xxx", "xxx", "xxx", 'x', Items.potato});
//        addRecipe(new ItemStack(ModBlocks.blockNetherWart), new Object[]{"xxx", "xxx", "xxx", 'x'});
    }

    public static void addRecipe(ItemStack output, Object... recipe){
        GameRegistry.addRecipe(output, recipe);
    }

    public static void addShapelessRecipe(ItemStack output, ItemStack... recipe){
        GameRegistry.addShapelessRecipe(output, recipe);
    }
}
