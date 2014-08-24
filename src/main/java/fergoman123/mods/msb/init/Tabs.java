package fergoman123.mods.msb.init;

import fergoman123.mods.fergoutil.helper.NameHelper;
import fergoman123.mods.msb.reference.Names;
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
