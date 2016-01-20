package io.github.fergoman123.msb.model;

import io.github.fergoman123.fergoutil.model.ModelEntry;
import io.github.fergoman123.fergoutil.reference.ModInfo;
import net.minecraft.block.Block;
import net.minecraft.item.Item;

public class ModelEntryMSB extends ModelEntry {
    public ModelEntryMSB(Item item, int meta, String name) {
        super(item, meta, ModInfo.modid.toLowerCase(), name);
    }

    public ModelEntryMSB(Block block, String name) {
        super(block, ModInfo.modid.toLowerCase(), name);
    }

    public ModelEntryMSB(Block block, int meta, String name) {
        super(block, meta, ModInfo.modid.toLowerCase(), name);
    }

    public ModelEntryMSB(Item item, String name) {
        super(item, ModInfo.modid.toLowerCase(), name);
    }
}
