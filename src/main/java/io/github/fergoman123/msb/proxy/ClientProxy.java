package io.github.fergoman123.msb.proxy;

import com.google.common.base.Stopwatch;
import io.github.fergoman123.fergoutil.proxy.CommonProxy;
import io.github.fergoman123.msb.info.MetadataMSB;
import io.github.fergoman123.msb.init.ModBlocks;
import io.github.fergoman123.msb.log.LoggerMSB;
import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

import java.util.concurrent.TimeUnit;

public class ClientProxy extends CommonProxy {
    @Override
    public void preInit(FMLPreInitializationEvent evt) {
        Stopwatch stopwatch = Stopwatch.createStarted();
        LoggerMSB.info("MSB Post Initialization [Started]");
        MetadataMSB.writeMetadata(evt.getModMetadata());
        ModBlocks.addBlocks();
        ModBlocks.registerBlocks();
        LoggerMSB.info("MSB Post Initialization [Ended after " + stopwatch.elapsed(TimeUnit.MILLISECONDS) + "ms]");

    }

    @Override
    public void init(FMLInitializationEvent evt) {
        Stopwatch stopwatch = Stopwatch.createStarted();
        LoggerMSB.info("MSB Initialization [Started]");
        ModBlocks.registerModels();
        ModBlocks.addVariants();
        LoggerMSB.info("MSB Initialization [Ended after " + stopwatch.elapsed(TimeUnit.MILLISECONDS) + "ms]");
    }

    @Override
    public void postInit(FMLPostInitializationEvent evt) {
        Stopwatch stopwatch = Stopwatch.createStarted();
        LoggerMSB.info("MSB Post Initialization [Started]");
        LoggerMSB.info("MSB Post Initialization [Ended after " + stopwatch.elapsed(TimeUnit.MILLISECONDS) + "ms]");
    }

    public static void registerBlock(Block block, Class<? extends ItemBlock> ib, String name) {
        GameRegistry.registerBlock(block, ib, name);
    }
}
