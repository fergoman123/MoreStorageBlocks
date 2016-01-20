package io.github.fergoman123.msb.model;

import net.minecraft.client.resources.model.ModelResourceLocation;

public class MRLMSB extends ModelResourceLocation{

    public MRLMSB(String name) {
        super("msb:" + name, "inventory");
    }
}
