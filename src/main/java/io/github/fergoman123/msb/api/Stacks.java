package io.github.fergoman123.msb.api;

import io.github.fergoman123.msb.init.ModBlocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class Stacks
{
    public static final class MC
    {
        public static final ItemStack charcoal = new ItemStack(Items.coal, 1, 1);

        public static final ItemStack golden_apple0 = new ItemStack(Items.golden_apple, 1, 0);
        public static final ItemStack golden_apple1 = new ItemStack(Items.golden_apple, 1, 1);

        public static final ItemStack dye0 = new ItemStack(Items.dye, 1, 0);
        public static final ItemStack dye1 = new ItemStack(Items.dye, 1, 1);
        public static final ItemStack dye2 = new ItemStack(Items.dye, 1, 2);
        public static final ItemStack dye3 = new ItemStack(Items.dye, 1, 3);
        public static final ItemStack dye5 = new ItemStack(Items.dye, 1, 5);
        public static final ItemStack dye6 = new ItemStack(Items.dye, 1, 6);
        public static final ItemStack dye7 = new ItemStack(Items.dye, 1, 7);
        public static final ItemStack dye8 = new ItemStack(Items.dye, 1, 8);
        public static final ItemStack dye9 = new ItemStack(Items.dye, 1, 9);
        public static final ItemStack dye10 = new ItemStack(Items.dye, 1, 10);
        public static final ItemStack dye11 = new ItemStack(Items.dye, 1, 11);
        public static final ItemStack dye12 = new ItemStack(Items.dye, 1, 12);
        public static final ItemStack dye13 = new ItemStack(Items.dye, 1, 13);
        public static final ItemStack dye14 = new ItemStack(Items.dye, 1, 14);
        public static final ItemStack dye15 = new ItemStack(Items.dye, 1, 15);

        public static final ItemStack wheat_seeds = new ItemStack(Items.wheat_seeds);
        public static final ItemStack pumpkin_seeds = new ItemStack(Items.pumpkin_seeds);
        public static final ItemStack melon_seeds = new ItemStack(Items.melon_seeds);

        public static final ItemStack rawPorkchop = new ItemStack(Items.porkchop);
        public static final ItemStack cookedPorkchop = new ItemStack(Items.cooked_porkchop);

        public static final ItemStack fish0 = new ItemStack(Items.fish, 1, 0);
        public static final ItemStack fish1 = new ItemStack(Items.fish, 1, 1);
        public static final ItemStack fish2 = new ItemStack(Items.fish, 1, 2);
        public static final ItemStack fish3 = new ItemStack(Items.fish, 1, 3);
        public static final ItemStack fish4 = new ItemStack(Items.cooked_fish, 1, 0);
        public static final ItemStack fish5 = new ItemStack(Items.cooked_fish, 1, 1);

        public static final ItemStack beef0 = new ItemStack(Items.beef);
        public static final ItemStack beef1 = new ItemStack(Items.cooked_beef);

        public static final ItemStack skull0 = new ItemStack(Items.skull, 1, 0);
        public static final ItemStack skull1 = new ItemStack(Items.skull, 1, 1);
        public static final ItemStack skull2 = new ItemStack(Items.skull, 1, 2);
        public static final ItemStack skull3 = new ItemStack(Items.skull, 1, 4);

        public static final ItemStack mutton0 = new ItemStack(Items.mutton);
        public static final ItemStack mutton1 = new ItemStack(Items.cooked_mutton);

        public static final ItemStack rabbit0 = new ItemStack(Items.rabbit);
        public static final ItemStack rabbit1 = new ItemStack(Items.cooked_rabbit);

        public static final ItemStack[] goldApple = new ItemStack[]{golden_apple0, golden_apple1};
        public static final ItemStack[] dyes = new ItemStack[]
                {
                        dye0,
                        dye1,
                        dye2,
                        dye3,
                        dye5,
                        dye6,
                        dye7,
                        dye8,
                        dye9,
                        dye10,
                        dye11,
                        dye12,
                        dye13,
                        dye14,
                        dye15
                };

        public static final ItemStack[] seeds = new ItemStack[]{wheat_seeds, pumpkin_seeds, melon_seeds};
        public static final ItemStack[] porkchop = new ItemStack[]{rawPorkchop, cookedPorkchop};
        public static final ItemStack[] fish = new ItemStack[]{fish0, fish1, fish2, fish3, fish4, fish5};
        public static final ItemStack[] beef = new ItemStack[]{beef0, beef1};
        public static final ItemStack[] skull = new ItemStack[]{skull0, skull1, skull2, skull3};
        public static final ItemStack[] mutton = new ItemStack[]{mutton0, mutton1};
        public static final ItemStack[] rabbit = new ItemStack[]{rabbit0, rabbit1};
    }

    public static final class Mod
    {
        public static final ItemStack blockGoldApple0 = new ItemStack(ModBlocks.blockGoldApple, 1, 0);
        public static final ItemStack blockGoldApple1 = new ItemStack(ModBlocks.blockGoldApple, 1, 0);

        public static final ItemStack blockSeeds0 = new ItemStack(ModBlocks.blockSeeds, 1, 0);
        public static final ItemStack blockSeeds1 = new ItemStack(ModBlocks.blockSeeds, 1, 1);
        public static final ItemStack blockSeeds2 = new ItemStack(ModBlocks.blockSeeds, 1, 2);

        public static final ItemStack blockDye0 = new ItemStack(ModBlocks.blockDye, 1, 0);
        public static final ItemStack blockDye1 = new ItemStack(ModBlocks.blockDye, 1, 1);
        public static final ItemStack blockDye2 = new ItemStack(ModBlocks.blockDye, 1, 2);
        public static final ItemStack blockDye3 = new ItemStack(ModBlocks.blockDye, 1, 3);
        public static final ItemStack blockDye4 = new ItemStack(ModBlocks.blockDye, 1, 4);
        public static final ItemStack blockDye5 = new ItemStack(ModBlocks.blockDye, 1, 5);
        public static final ItemStack blockDye6 = new ItemStack(ModBlocks.blockDye, 1, 6);
        public static final ItemStack blockDye7 = new ItemStack(ModBlocks.blockDye, 1, 7);
        public static final ItemStack blockDye8 = new ItemStack(ModBlocks.blockDye, 1, 8);
        public static final ItemStack blockDye9 = new ItemStack(ModBlocks.blockDye, 1, 9);
        public static final ItemStack blockDye10 = new ItemStack(ModBlocks.blockDye, 1, 10);
        public static final ItemStack blockDye11 = new ItemStack(ModBlocks.blockDye, 1, 11);
        public static final ItemStack blockDye12 = new ItemStack(ModBlocks.blockDye, 1, 12);
        public static final ItemStack blockDye13 = new ItemStack(ModBlocks.blockDye, 1, 13);
        public static final ItemStack blockDye14 = new ItemStack(ModBlocks.blockDye, 1, 14);

        public static final ItemStack blockPorkchop0 = new ItemStack(ModBlocks.blockPorkchop, 1, 0);
        public static final ItemStack blockPorkchop1 = new ItemStack(ModBlocks.blockPorkchop, 1, 1);

        public static final ItemStack blockFish0 = new ItemStack(ModBlocks.blockFish, 1, 0);
        public static final ItemStack blockFish1 = new ItemStack(ModBlocks.blockFish, 1, 1);
        public static final ItemStack blockFish2 = new ItemStack(ModBlocks.blockFish, 1, 2);
        public static final ItemStack blockFish3 = new ItemStack(ModBlocks.blockFish, 1, 3);
        public static final ItemStack blockFish4 = new ItemStack(ModBlocks.blockFish, 1, 4);
        public static final ItemStack blockFish5 = new ItemStack(ModBlocks.blockFish, 1, 5);

        public static final ItemStack blockBeef0 = new ItemStack(ModBlocks.blockBeef, 1, 0);
        public static final ItemStack blockBeef1 = new ItemStack(ModBlocks.blockBeef, 1, 1);

        public static final ItemStack blockSkull0 = new ItemStack(ModBlocks.blockSkull, 1, 0);
        public static final ItemStack blockSkull1 = new ItemStack(ModBlocks.blockSkull, 1, 1);
        public static final ItemStack blockSkull2 = new ItemStack(ModBlocks.blockSkull, 1, 2);
        public static final ItemStack blockSkull3 = new ItemStack(ModBlocks.blockSkull, 1, 3);

        public static final ItemStack blockMutton0 = new ItemStack(ModBlocks.blockMutton, 1, 0);
        public static final ItemStack blockMutton1 = new ItemStack(ModBlocks.blockMutton, 1, 1);

        public static final ItemStack blockRabbit0 = new ItemStack(ModBlocks.blockRabbit, 1, 0);
        public static final ItemStack blockRabbit1 = new ItemStack(ModBlocks.blockRabbit, 1, 1);

        public static final ItemStack[] blockSeeds = new ItemStack[]{blockSeeds0, blockSeeds1, blockSeeds2};
        public static final ItemStack[] blockGoldApple = new ItemStack[]{blockGoldApple0, blockGoldApple1};
        public static final ItemStack[] blockDye = new ItemStack[]
                {
                        blockDye0,
                        blockDye1,
                        blockDye2,
                        blockDye3,
                        blockDye4,
                        blockDye5,
                        blockDye6,
                        blockDye7,
                        blockDye8,
                        blockDye9,
                        blockDye10,
                        blockDye11,
                        blockDye12,
                        blockDye13,
                        blockDye14
                };
        public static final ItemStack[] blockPorkchop = new ItemStack[]{blockPorkchop0, blockPorkchop1};
        public static final ItemStack[] blockFish = new ItemStack[]
                {
                        blockFish0,
                        blockFish1,
                        blockFish2,
                        blockFish3,
                        blockFish4,
                        blockFish5
                };
        public static final ItemStack[] blockBeef = new ItemStack[]{blockBeef0, blockBeef1};
        public static final ItemStack[] blockSkull = new ItemStack[]{blockSkull0, blockSkull1, blockSkull2, blockSkull3};
        public static final ItemStack[] blockMutton = new ItemStack[]{blockMutton0, blockMutton1};
        public static final ItemStack[] blockRabbit = new ItemStack[]{blockRabbit0, blockRabbit1};
    }
}
