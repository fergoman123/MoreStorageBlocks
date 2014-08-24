package fergoman123.mods.msb.init;

import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import fergoman123.mods.fergoutil.helper.NameHelper;
import fergoman123.mods.msb.reference.MetadataMSB;
import fergoman123.mods.msb.reference.Names;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class MSBMod
{
    public static final CreativeTabs tabMSB = new CreativeTabs(Names.Locale.tabMSB) {
        @Override
        public Item getTabIconItem() {
            return Item.getItemFromBlock(ModBlocks.blockCharcoal);
        }

        @Override
        public String getTranslatedTabLabel()
        {
            return NameHelper.translateToLocal(Names.Locale.tabMSB);
        }
    };
    public static void preInit(FMLPreInitializationEvent evt)
    {
        MetadataMSB.writeMetadata(evt.getModMetadata());
    }

    public static void load(FMLInitializationEvent evt)
    {
        ModBlocks.init();
    }

    public static void modsLoaded(FMLPostInitializationEvent evt)
    {

    }
}
