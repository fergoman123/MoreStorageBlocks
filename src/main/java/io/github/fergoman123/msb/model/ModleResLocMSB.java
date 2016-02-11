package io.github.fergoman123.msb.model;

import net.minecraft.client.resources.model.ModelResourceLocation;

public class ModleResLocMSB extends ModelResourceLocation{

    public ModleResLocMSB(String name) {
        super("msb:" + name, "inventory");
    }
}
