package io.github.fergoman123.msb;

import io.github.fergoman123.fergoutil.proxy.IProxy;
import io.github.fergoman123.msb.info.Locale;
import io.github.fergoman123.msb.info.MetadataMSB;
import io.github.fergoman123.msb.info.ModInfo;
import io.github.fergoman123.msb.info.Reference;
import io.github.fergoman123.msb.init.ModBlocks;
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

@Mod(modid = ModInfo.modid, name = ModInfo.name, version = ModInfo.version)
public class MSB {
	public static final CreativeTabMSB tabMSB = new CreativeTabMSB(Locale.tabMSB);

	@Instance(ModInfo.modid)
	public static MSB instance;

	@SidedProxy(clientSide = Reference.clientProxyClass, serverSide = Reference.serverProxyClass)
	public static IProxy proxy;

	@EventHandler
	public void preInit(FMLPreInitializationEvent evt) {
		MetadataMSB.writeMetadata(evt.getModMetadata());
		LoggerMSB.info("MSB Pre-Init");
	}

	@EventHandler
	public void load(FMLInitializationEvent evt) {
		ModBlocks.registerBlocks();
		Recipes.init();
	}

	@EventHandler
	public void modsLoaded(FMLPostInitializationEvent evt) {
		LoggerMSB.info("More Storage Blocks Loaded");
	}
}
