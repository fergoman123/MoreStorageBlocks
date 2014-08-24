package fergoman123.mods.msb;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import fergoman123.mods.msb.init.MSBMod;
import fergoman123.mods.msb.reference.ModInfo;

@Mod(modid = ModInfo.modid, name = ModInfo.name, version = ModInfo.versionMain, dependencies = ModInfo.dep)
public class MoreStorageBlocks
{
    @Instance(ModInfo.modid)
    public static MoreStorageBlocks instance;

    @EventHandler
    public void preInit(FMLPreInitializationEvent evt)
    {
        MSBMod.preInit(evt);
    }

    @EventHandler
    public void load(FMLInitializationEvent evt)
    {
        MSBMod.load(evt);
    }

    @EventHandler
    public void modsLoaded(FMLPostInitializationEvent evt)
    {
        MSBMod.modsLoaded(evt);
    }
}
