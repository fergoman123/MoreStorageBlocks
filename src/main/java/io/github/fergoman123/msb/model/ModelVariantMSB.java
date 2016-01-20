package io.github.fergoman123.msb.model;

import io.github.fergoman123.fergoutil.model.ModelVariant;
import io.github.fergoman123.msb.info.ModInfo;
import net.minecraft.block.Block;
import net.minecraft.item.Item;

public class ModelVariantMSB extends ModelVariant{

    public ModelVariantMSB(Item item, String name) {
        super(item, ModInfo.modid.toLowerCase(), name);
    }

    public ModelVariantMSB(Block block, String name) {
        super(block, ModInfo.modid.toLowerCase(), name);
    }
}
