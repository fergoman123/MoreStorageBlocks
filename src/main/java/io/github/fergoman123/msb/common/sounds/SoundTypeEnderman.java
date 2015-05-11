package io.github.fergoman123.msb.common.sounds;

import net.minecraft.block.Block;

public class SoundTypeEnderman extends Block.SoundType {
    public SoundTypeEnderman(String enderman) {
        super(enderman, 1f, 1f);
    }

    @Override
    public String getBreakSound() {
        return "mob.endermen.idle";
    }

    @Override
    public String getStepSound() {
        return "mob.endermen.idle";
    }

    @Override
    public String getPlaceSound() {
        return "mob.endermen.idle";
    }
}
