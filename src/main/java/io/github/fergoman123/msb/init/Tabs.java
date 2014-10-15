 /*
  * More Storage Blocks
  * Copyright (c) 2014 fergoman123.
  * All rights reserved. This program and the accompanying materials
  * are made available under the terms of the GNU Lesser Public License v2.1
  * which accompanies this distribution, and is available at
  * http://www.gnu.org/licenses/gpl-3.0.html
  */

package io.github.fergoman123.msb.init;

import io.github.fergoman123.fergoutil.helper.NameHelper;
import io.github.fergoman123.msb.reference.Names;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class Tabs
{
    public static CreativeTabs tabMSB;

    public static void init()
    {
        tabMSB = new CreativeTabs(Names.Locale.tabMSB) {
            @Override
            public Item getTabIconItem() {
                return Item.getItemFromBlock(ModBlocks.blockApple);
            }

            @Override
            public String getTranslatedTabLabel() {
                return NameHelper.translateToLocal(Names.Locale.tabMSBTranslated);
            }
        };
    }
}
