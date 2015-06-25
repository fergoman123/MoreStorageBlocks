package io.github.fergoman123.msb;

import io.github.fergoman123.fergoutil.proxy.IProxy;
import io.github.fergoman123.msb.common.OreDictRegistry;
import io.github.fergoman123.msb.info.Locale;
import io.github.fergoman123.msb.info.MetadataMSB;
import io.github.fergoman123.msb.info.ModInfo;
import io.github.fergoman123.msb.info.Reference;
import io.github.fergoman123.msb.init.ModBlocks;
import io.github.fergoman123.msb.init.ModelRegister;
import io.github.fergoman123.msb.init.Recipes;
import io.github.fergoman123.msb.log.LoggerMSB;
import io.github.fergoman123.msb.tab.CreativeTabMSB;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = ModInfo.modid, name = ModInfo.name, version = ModInfo.version)
public class MSB
{
    public static final CreativeTabMSB tabMSB = new CreativeTabMSB(Locale.tabMSB);
    private static final LoggerMSB logger = new LoggerMSB();
    private ModelRegister modelRegister = new ModelRegister();

    @Instance(ModInfo.modid)
    public static MSB instance;

    @SidedProxy(clientSide = Reference.clientProxyClass, serverSide = Reference.serverProxyClass)
    public static IProxy proxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent evt)
    {
        MetadataMSB.writeMetadata(evt.getModMetadata());
        ModBlocks.addBlocks();
    }

    @EventHandler
    public void load(FMLInitializationEvent evt)
    {
        ModBlocks.registerBlocks();
        Recipes.init();
        OreDictRegistry.init();
        proxy.registerEventHandlers();
        proxy.registerRenderers();
    }

    @EventHandler
    public void modsLoaded(FMLPostInitializationEvent evt)
    {
        getLogger().info("More Storage Blocks Loaded");
    }

    public static Logger getLogger()
    {
        return logger.getLogger();
    }

    public ModelRegister getModelRegister() {
        return modelRegister;
    }
}
