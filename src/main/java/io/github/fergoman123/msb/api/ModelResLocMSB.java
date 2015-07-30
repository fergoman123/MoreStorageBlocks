package io.github.fergoman123.msb.api;

import net.minecraft.client.resources.model.ModelResourceLocation;

public class ModelResLocMSB extends ModelResourceLocation {
    public ModelResLocMSB(String name) {
        super("msb:" + name, "inventory");
    }
}
