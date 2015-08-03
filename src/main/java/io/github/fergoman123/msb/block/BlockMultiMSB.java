package io.github.fergoman123.msb.block;

import io.github.fergoman123.fergoutil.block.BlockMultiFergo;
import io.github.fergoman123.msb.MSB;
import net.minecraft.block.material.Material;

public abstract class BlockMultiMSB extends BlockMultiFergo {

	protected BlockMultiMSB(String[] subNames, String name) {
		super(Material.iron, "msb", MSB.tabMSB, subNames, name);
	}
}
