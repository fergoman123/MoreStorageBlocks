package io.github.fergoman123.msb.helper;

import io.github.fergoman123.fergoutil.model.ModelHelper;
import io.github.fergoman123.msb.model.MRLMSB;
import net.minecraft.block.Block;
import net.minecraft.client.resources.model.ModelBakery;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class MSBHelper {
    public static void registerBlock(Block block) {
        String name = block.getUnlocalizedName().substring("tile.msb.".length());
        GameRegistry.registerBlock(block, name);
    }

    public static void registerBlock(Block block, Class<? extends ItemBlock> itemBlock) {
        String name = block.getUnlocalizedName().substring("tile.msb.".length());
        GameRegistry.registerBlock(block, itemBlock, name);
    }

    public static void registerModel(Block block, int meta, String name) {
        ModelHelper.getModelMesher().register(Item.getItemFromBlock(block), meta, new MRLMSB(name));
    }

    public static void registerModel(Block block, String name) {
        registerModel(block, 0, name);
    }

    public static void registerVariant(Block block, String name){
        ModelBakery.addVariantName(Item.getItemFromBlock(block), "msb:" + name);
    }
}
