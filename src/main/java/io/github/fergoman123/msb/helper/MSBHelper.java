package io.github.fergoman123.msb.helper;

import io.github.fergoman123.fergoutil.helper.RegisterHelper;
import io.github.fergoman123.fergoutil.item.ItemBlockFergo;
import io.github.fergoman123.msb.block.BlockMSB;
import io.github.fergoman123.msb.block.BlockMultiMSB;
import io.github.fergoman123.msb.block.BlockMultiMSB.ItemBlockMSB;
import net.minecraft.client.resources.model.ModelBakery;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;

public class MSBHelper {
    public static void register(BlockMSB block) {
        GameRegistry.registerBlock(block, ItemBlockFergo.class, block.getName());
        RegisterHelper.getModelMesher().register(Item.getItemFromBlock(block), 0, new ModelResourceLocation("msb:" + block.getName(), "inventory"));
        ModelBakery.addVariantName(Item.getItemFromBlock(block), "msb:" + block.getName());
        OreDictionary.registerOre(block.getName(), block);
    }

    public static void register(BlockMultiMSB block) {
        GameRegistry.registerBlock(block, ItemBlockMSB.class, block.getName());
        for (int i = 0; i < block.getSubNames().length; i++) {
            RegisterHelper.getModelMesher().register(Item.getItemFromBlock(block), i, new ModelResourceLocation("msb" + block.getSubNames()[i], "inventory"));
            ModelBakery.addVariantName(Item.getItemFromBlock(block), "msb" + block.getSubNames()[i]);
            OreDictionary.registerOre(block.getSubNames()[i], block);
        }
    }
}
