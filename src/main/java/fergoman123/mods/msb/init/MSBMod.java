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

    public static void preInit(FMLPreInitializationEvent evt)
    {
        MetadataMSB.writeMetadata(evt.getModMetadata());
        Tabs.init();
    }

    public static void load(FMLInitializationEvent evt)
    {
        ModBlocks.init();
        Recipes.init();
    }

    public static void modsLoaded(FMLPostInitializationEvent evt)
    {

    }
}
