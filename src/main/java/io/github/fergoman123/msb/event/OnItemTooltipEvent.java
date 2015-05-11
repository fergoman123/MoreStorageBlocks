package io.github.fergoman123.msb.event;

import io.github.fergoman123.fergoutil.helper.NameHelper;
import io.github.fergoman123.msb.api.BlockMSB;
import io.github.fergoman123.msb.common.blocks.*;
import io.github.fergoman123.msb.info.BlockNames;
import io.github.fergoman123.msb.info.Locale;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.player.ItemTooltipEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.util.List;

public class OnItemTooltipEvent
{
    public static final OnItemTooltipEvent instance = new OnItemTooltipEvent();

    @SubscribeEvent
    public void onItemTooltip(ItemTooltipEvent evt)
    {
        ItemStack stack = evt.itemStack;
        Item item = stack.getItem();
        Block block = Block.getBlockFromItem(item);
        List<String> toolTip = evt.toolTip;

        if (block != null) {
            if (block instanceof BlockMSB) {
            BlockMSB blockMSB = (BlockMSB)block;
                evt.toolTip.add(NameHelper.translate(Locale.oreDictName));
                evt.toolTip.add(blockMSB.getName());
            }

            if (block instanceof BlockGoldApple)
            {
                toolTip.add(NameHelper.translate(Locale.oreDictName));
                if (stack.getItemDamage() == 0)
                {
                    toolTip.add(BlockNames.blockGoldApple[0]);
                }
                else if (stack.getItemDamage() == 1)
                {
                    toolTip.add(BlockNames.blockGoldApple[1]);
                }

            }

            if(block instanceof BlockDye)
            {
                evt.toolTip.add(NameHelper.translate(Locale.oreDictName));
                if (stack.getItemDamage() == 0)
                {
                    toolTip.add(BlockNames.blockDye[0]);
                }
                else if (stack.getItemDamage() == 1)
                {
                    toolTip.add(BlockNames.blockDye[1]);
                }
                else if (stack.getItemDamage() == 2)
                {
                    toolTip.add(BlockNames.blockDye[2]);
                }
                else if (stack.getItemDamage() == 3)
                {
                    toolTip.add(BlockNames.blockDye[3]);
                }
                else if (stack.getItemDamage() == 4)
                {
                    toolTip.add(BlockNames.blockDye[4]);
                }
                else if (stack.getItemDamage() == 5)
                {
                    toolTip.add(BlockNames.blockDye[5]);
                }
                else if (stack.getItemDamage() == 6)
                {
                    toolTip.add(BlockNames.blockDye[6]);
                }
                else if (stack.getItemDamage() == 7)
                {
                    toolTip.add(BlockNames.blockDye[7]);
                }
                else if (stack.getItemDamage() == 8)
                {
                    toolTip.add(BlockNames.blockDye[8]);
                }
                else if (stack.getItemDamage() == 9)
                {
                    toolTip.add(BlockNames.blockDye[9]);
                }
                else if (stack.getItemDamage() == 10)
                {
                    toolTip.add(BlockNames.blockDye[10]);
                }
                else if (stack.getItemDamage() == 11)
                {
                    toolTip.add(BlockNames.blockDye[11]);
                }
                else if (stack.getItemDamage() == 12)
                {
                    toolTip.add(BlockNames.blockDye[12]);
                }
                else if (stack.getItemDamage() == 13)
                {
                    toolTip.add(BlockNames.blockDye[13]);
                }
                else if (stack.getItemDamage() == 14)
                {
                    toolTip.add(BlockNames.blockDye[14]);
                }
            }

            if (block instanceof BlockSeeds)
            {
                evt.toolTip.add(NameHelper.translate(Locale.oreDictName));
                if (stack.getItemDamage() == 0)
                {
                    toolTip.add(BlockNames.blockSeeds[0]);
                }
                else if (stack.getItemDamage() == 1)
                {
                    toolTip.add(BlockNames.blockSeeds[1]);
                }
                else if (stack.getItemDamage() == 2)
                {
                    toolTip.add(BlockNames.blockSeeds[2]);
                }
            }

            if (block instanceof BlockPorkchop)
            {
                toolTip.add(NameHelper.translate(Locale.oreDictName));
                if (stack.getItemDamage() == 0)
                {
                    toolTip.add(BlockNames.blockPorkchop[0]);
                }
                else if (stack.getItemDamage() == 1)
                {
                    toolTip.add(BlockNames.blockPorkchop[1]);
                }
            }

            if (block instanceof BlockFish)
            {
                evt.toolTip.add(NameHelper.translate(Locale.oreDictName));
                if (stack.getItemDamage() == 0)
                {
                    toolTip.add(BlockNames.blockFish[0]);
                }
                else if (stack.getItemDamage() == 1)
                {
                    toolTip.add(BlockNames.blockFish[1]);
                }
                else if(stack.getItemDamage() == 2)
                {
                    toolTip.add(BlockNames.blockFish[2]);
                }
                else if (stack.getItemDamage() == 3)
                {
                    toolTip.add(BlockNames.blockFish[3]);
                }
                else if (stack.getItemDamage() == 4)
                {
                    toolTip.add(BlockNames.blockFish[4]);
                }
                else if (stack.getItemDamage() == 5)
                {
                    toolTip.add(BlockNames.blockFish[5]);
                }
            }

            if (block instanceof BlockBeef)
            {
                evt.toolTip.add(NameHelper.translate(Locale.oreDictName));
                if (stack.getItemDamage() == 0)
                {
                    toolTip.add(BlockNames.blockBeef[0]);
                }
                else if (stack.getItemDamage() == 1)
                {
                    toolTip.add(BlockNames.blockBeef[1]);
                }
            }

            if (block instanceof BlockSkullStorage)
            {
                evt.toolTip.add(NameHelper.translate(Locale.oreDictName));
                if (stack.getItemDamage() == 0)
                {
                    toolTip.add(BlockNames.blockSkull[0]);
                }
                else if (stack.getItemDamage() == 1)
                {
                    toolTip.add(BlockNames.blockSkull[1]);
                }
                else if (stack.getItemDamage() == 2)
                {
                    toolTip.add(BlockNames.blockSkull[2]);
                }
                else if (stack.getItemDamage() == 3)
                {
                    toolTip.add(BlockNames.blockSkull[3]);
                }
            }
        }

    }
}
