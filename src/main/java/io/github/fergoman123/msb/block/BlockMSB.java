package io.github.fergoman123.msb.block;

import io.github.fergoman123.fergoutil.block.BlockFergo;
import io.github.fergoman123.msb.MSB;
import net.minecraft.block.material.Material;

public class BlockMSB extends BlockFergo {

	public BlockMSB(String name) {
		super(Material.iron, "msb", MSB.tabMSB, name);
	}
}
