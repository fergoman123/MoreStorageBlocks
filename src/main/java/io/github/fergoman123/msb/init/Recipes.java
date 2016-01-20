package io.github.fergoman123.msb.init;

import io.github.fergoman123.msb.block.*;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import static io.github.fergoman123.fergoutil.helper.RecipeHelper.addShapelessRecipe;
import static io.github.fergoman123.fergoutil.helper.RecipeHelper.addStorageBlockRecipe;

public class Recipes {

    public static void init() {
        addStorageBlockRecipe(new ItemStack(ModBlocks.blockCharcoal), new ItemStack(Items.coal, 1, 1));
        addStorageBlockRecipe(new ItemStack(ModBlocks.blockApple), new ItemStack(Items.apple));
        for (int i = 0; i < BlockGoldApple.EnumType.values().length; i++) {
            addStorageBlockRecipe(BlockGoldApple.EnumType.values()[i].getItemStack(1), new ItemStack(Items.golden_apple, 1, i));
        }
        addStorageBlockRecipe(new ItemStack(ModBlocks.blockBook), new ItemStack(Items.book));
        addStorageBlockRecipe(new ItemStack(ModBlocks.blockEgg), new ItemStack(Items.egg));
        addStorageBlockRecipe(BlockEnder.EnumType.blockEnderPearl.getItemStack(1), new ItemStack(Items.ender_pearl));
        addStorageBlockRecipe(BlockEnder.EnumType.blockEnderEye.getItemStack(1), new ItemStack(Items.ender_eye));
        addStorageBlockRecipe(new ItemStack(ModBlocks.blockLead), new ItemStack(Items.lead));
        addStorageBlockRecipe(new ItemStack(ModBlocks.blockReed), new ItemStack(Items.reeds));
        for (int i = 0; i < BlockSeeds.EnumType.values().length; i++) {
            Item[] items = new Item[]{Items.wheat_seeds, Items.pumpkin_seeds, Items.melon_seeds};
            addStorageBlockRecipe(BlockSeeds.EnumType.values()[i].getItemStack(1), new ItemStack(items[i]));
        }
        addStorageBlockRecipe(new ItemStack(ModBlocks.blockStick), new ItemStack(Items.stick));
        addStorageBlockRecipe(new ItemStack(ModBlocks.blockLeather), new ItemStack(Items.leather));
        for (int i = 0; i < BlockDye.EnumType.values().length; i++) {
            int[] dyedamage = new int[]{0, 1, 2, 3, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
            addStorageBlockRecipe(BlockDye.EnumType.values()[i].getItemStack(1), new ItemStack(Items.dye, 1, dyedamage[i]));
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
        addStorageBlockRecipe(BlockPorkchop.EnumType.blockRawPorkchop.getItemStack(1), new ItemStack(Items.porkchop));
        addStorageBlockRecipe(BlockPorkchop.EnumType.blockCookedPorkchop.getItemStack(1), new ItemStack(Items.cooked_porkchop));

        for (int i = 0; i < BlockFish.EnumType.values().length; i++) {
            ItemStack[] stack = new ItemStack[]{new ItemStack(Items.fish, 1, 0), new ItemStack(Items.fish, 1, 1), new ItemStack(Items.fish, 1, 2), new ItemStack(Items.fish, 1, 3), new ItemStack(Items.cooked_fish, 1, 0), new ItemStack(Items.cooked_fish, 1, 1)};
            addStorageBlockRecipe(BlockFish.EnumType.values()[i].getItemStack(1), stack[i]);
        }
        addStorageBlockRecipe(new ItemStack(ModBlocks.blockCookie), new ItemStack(Items.cookie));
        addStorageBlockRecipe(BlockBeef.EnumType.blockRawBeef.getItemStack(1), new ItemStack(Items.beef));
        addStorageBlockRecipe(BlockBeef.EnumType.blockCookedBeef.getItemStack(1), new ItemStack(Items.cooked_beef));
        addStorageBlockRecipe(new ItemStack(ModBlocks.blockPumpkinPie), new ItemStack(Items.pumpkin_pie));
        addStorageBlockRecipe(new ItemStack(ModBlocks.blockGhastTear), new ItemStack(Items.ghast_tear));
        addStorageBlockRecipe(BlockSkullStorage.EnumType.blockSkullSkeleton.getItemStack(1), new ItemStack(Items.skull, 1, 0));
        addStorageBlockRecipe(BlockSkullStorage.EnumType.blockSkullWither.getItemStack(1), new ItemStack(Items.skull, 1, 1));
        addStorageBlockRecipe(BlockSkullStorage.EnumType.blockSkullZombie.getItemStack(1), new ItemStack(Items.skull, 1, 2));
        addStorageBlockRecipe(BlockSkullStorage.EnumType.blockSkullCreeper.getItemStack(1), new ItemStack(Items.skull, 1, 4));
        addStorageBlockRecipe(BlockMutton.EnumType.blockRawMutton.getItemStack(1), new ItemStack(Items.mutton));
        addStorageBlockRecipe(BlockMutton.EnumType.blockCookedMutton.getItemStack(1), new ItemStack(Items.cooked_mutton));
        addStorageBlockRecipe(BlockRabbit.EnumType.blockRawRabbit.getItemStack(1), new ItemStack(Items.rabbit));
        addStorageBlockRecipe(BlockRabbit.EnumType.blockCookedRabbit.getItemStack(1), new ItemStack(Items.cooked_rabbit));

        addShapelessRecipe(new ItemStack(Items.coal, 9, 1), new ItemStack(ModBlocks.blockCharcoal));
        addShapelessRecipe(new ItemStack(Items.apple, 9), new ItemStack(ModBlocks.blockApple));
        addShapelessRecipe(new ItemStack(Items.golden_apple, 9, 0), BlockGoldApple.EnumType.blockGoldApple1.getItemStack(1));
        addShapelessRecipe(new ItemStack(Items.golden_apple, 9, 1), BlockGoldApple.EnumType.blockGoldApple2.getItemStack(1));
        addShapelessRecipe(new ItemStack(Items.book, 9), new ItemStack(ModBlocks.blockBook));
        addShapelessRecipe(new ItemStack(Items.egg, 9), new ItemStack(ModBlocks.blockEgg));
        addShapelessRecipe(new ItemStack(Items.ender_pearl, 9), BlockEnder.EnumType.blockEnderPearl.getItemStack(1));
        addShapelessRecipe(new ItemStack(Items.ender_eye, 9), BlockEnder.EnumType.blockEnderEye.getItemStack(1));
        addShapelessRecipe(new ItemStack(Items.lead, 9), new ItemStack(ModBlocks.blockLead));
        addShapelessRecipe(new ItemStack(Items.reeds), new ItemStack(ModBlocks.blockReed));
        addShapelessRecipe(new ItemStack(Items.wheat_seeds, 9), BlockSeeds.EnumType.blockWheatSeeds.getItemStack(1));
        addShapelessRecipe(new ItemStack(Items.pumpkin_seeds, 9), BlockSeeds.EnumType.blockPumpkinSeeds.getItemStack(1));
        addShapelessRecipe(new ItemStack(Items.melon_seeds, 9), BlockSeeds.EnumType.blockMelonSeeds.getItemStack(1));
        addShapelessRecipe(new ItemStack(Items.stick, 9), new ItemStack(ModBlocks.blockStick));
        addShapelessRecipe(new ItemStack(Items.leather, 9), new ItemStack(ModBlocks.blockLeather));
        addShapelessRecipe(new ItemStack(Items.bucket, 9), new ItemStack(ModBlocks.blockBucket));
        for (int i = 0; i < 15; i++) {
            int[] dyedamage = new int[]{0, 1, 2, 3, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
            addShapelessRecipe(new ItemStack(Items.dye, 9, dyedamage[i]), BlockDye.EnumType.values()[i].getItemStack(1));
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
        addShapelessRecipe(new ItemStack(Items.porkchop, 9), BlockPorkchop.EnumType.blockRawPorkchop.getItemStack(1));
        addShapelessRecipe(new ItemStack(Items.cooked_porkchop, 9), BlockPorkchop.EnumType.blockCookedPorkchop.getItemStack(1));
        addShapelessRecipe(new ItemStack(Items.fish, 9, 0), BlockFish.EnumType.blockRawFish.getItemStack(1));
        addShapelessRecipe(new ItemStack(Items.fish, 9, 1), BlockFish.EnumType.blockRawSalmon.getItemStack(1));
        addShapelessRecipe(new ItemStack(Items.fish, 9, 2), BlockFish.EnumType.blockClownfish.getItemStack(1));
        addShapelessRecipe(new ItemStack(Items.fish, 9, 3), BlockFish.EnumType.blockPufferfish.getItemStack(1));
        addShapelessRecipe(new ItemStack(Items.cooked_fish, 9, 0), BlockFish.EnumType.blockCookedFish.getItemStack(1));
        addShapelessRecipe(new ItemStack(Items.cooked_fish, 9, 1), BlockFish.EnumType.blockCookedSalmon.getItemStack(1));
        addShapelessRecipe(new ItemStack(Items.cookie, 9), new ItemStack(ModBlocks.blockCookie));
        addShapelessRecipe(new ItemStack(Items.beef, 9), BlockBeef.EnumType.blockRawBeef.getItemStack(1));
        addShapelessRecipe(new ItemStack(Items.cooked_beef, 9), BlockBeef.EnumType.blockCookedBeef.getItemStack(1));
        addShapelessRecipe(new ItemStack(Items.pumpkin_pie, 9), new ItemStack(ModBlocks.blockPumpkinPie));
        addShapelessRecipe(new ItemStack(Items.ghast_tear, 9), new ItemStack(ModBlocks.blockGhastTear));
        addShapelessRecipe(new ItemStack(Items.skull, 9, 0), BlockSkullStorage.EnumType.blockSkullSkeleton.getItemStack(1));
        addShapelessRecipe(new ItemStack(Items.skull, 9, 1), BlockSkullStorage.EnumType.blockSkullWither.getItemStack(1));
        addShapelessRecipe(new ItemStack(Items.skull, 9, 2), BlockSkullStorage.EnumType.blockSkullZombie.getItemStack(1));
        addShapelessRecipe(new ItemStack(Items.skull, 9, 4), BlockSkullStorage.EnumType.blockSkullCreeper.getItemStack(1));
        addShapelessRecipe(new ItemStack(Items.mutton, 9), BlockMutton.EnumType.blockRawMutton.getItemStack(1));
        addShapelessRecipe(new ItemStack(Items.cooked_mutton, 9), BlockMutton.EnumType.blockCookedMutton.getItemStack(1));
        addShapelessRecipe(new ItemStack(Items.rabbit, 9), BlockRabbit.EnumType.blockRawRabbit.getItemStack(1));
        addShapelessRecipe(new ItemStack(Items.cooked_rabbit, 9), BlockRabbit.EnumType.blockCookedRabbit.getItemStack(1));
    }
}
