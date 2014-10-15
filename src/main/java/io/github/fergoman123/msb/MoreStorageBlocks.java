 /*
  * More Storage Blocks
  * Copyright (c) 2014 fergoman123.
  * All rights reserved. This program and the accompanying materials
  * are made available under the terms of the GNU Lesser Public License v2.1
  * which accompanies this distribution, and is available at
  * http://www.gnu.org/licenses/gpl-3.0.html
  */

package io.github.fergoman123.msb;

 import cpw.mods.fml.common.Mod;
 import cpw.mods.fml.common.Mod.EventHandler;
 import cpw.mods.fml.common.Mod.Instance;
 import cpw.mods.fml.common.SidedProxy;
 import cpw.mods.fml.common.event.FMLInitializationEvent;
 import cpw.mods.fml.common.event.FMLPostInitializationEvent;
 import cpw.mods.fml.common.event.FMLPreInitializationEvent;
 import io.github.fergoman123.fergoutil.proxy.IProxy;
 import io.github.fergoman123.msb.init.MSBMod;
 import io.github.fergoman123.msb.reference.ModInfo;
 import io.github.fergoman123.msb.reference.Reference;

 @Mod(modid = ModInfo.modid, name = ModInfo.name, version = ModInfo.versionMain, dependencies = ModInfo.dep)
public class MoreStorageBlocks
{
    @Instance(ModInfo.modid)
    private static MoreStorageBlocks instance;

    @SidedProxy(clientSide = Reference.clientProxyClass, serverSide = Reference.serverProxyClass)
    public static IProxy proxy;

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

    public static MoreStorageBlocks getInstance()
    {
        return instance;
    }
}
