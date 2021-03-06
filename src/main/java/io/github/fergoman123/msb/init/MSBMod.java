 /*
  * More Storage Blocks
  * Copyright (c) 2014 fergoman123.
  * All rights reserved. This program and the accompanying materials
  * are made available under the terms of the GNU Lesser Public License v2.1
  * which accompanies this distribution, and is available at
  * http://www.gnu.org/licenses/gpl-3.0.html
  */

package io.github.fergoman123.msb.init;

 import cpw.mods.fml.common.event.FMLInitializationEvent;
 import cpw.mods.fml.common.event.FMLPostInitializationEvent;
 import cpw.mods.fml.common.event.FMLPreInitializationEvent;
 import io.github.fergoman123.msb.helper.LogHelper;
 import io.github.fergoman123.msb.reference.MetadataMSB;

 public class MSBMod
{

    public static void preInit(FMLPreInitializationEvent evt)
    {
        MetadataMSB.writeMetadata(evt.getModMetadata());
        Tabs.init();
        LogHelper.info("pre-initialising Mod");
    }

    public static void load(FMLInitializationEvent evt)
    {
        ModBlocks.init();
        Recipes.init();
        LogHelper.info("initializing Mod");
    }

    public static void modsLoaded(FMLPostInitializationEvent evt)
    {
        LogHelper.info("Mod loaded");
    }
}
