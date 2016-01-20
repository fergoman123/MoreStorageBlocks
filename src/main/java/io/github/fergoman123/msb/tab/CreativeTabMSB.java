package io.github.fergoman123.msb.tab;

import io.github.fergoman123.fergoutil.helper.NameHelper;
import io.github.fergoman123.msb.info.Locale;
import io.github.fergoman123.msb.init.ModBlocks;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabMSB extends CreativeTabs {

    public CreativeTabMSB(String label) {
        super(label);
    }

    @Override
    public Item getTabIconItem() {
        return Item.getItemFromBlock(ModBlocks.blockApple);
    }

    @Override
    public String getTranslatedTabLabel() {
        return NameHelper.translate(Locale.tabMSB);
    }
}
