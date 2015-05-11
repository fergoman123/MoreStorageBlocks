package io.github.fergoman123.msb.common.sounds;

import net.minecraft.block.Block;

public class SoundTypeBlaze extends Block.SoundType {
    public SoundTypeBlaze(String blaze) {
        super(blaze, 1f, 1f);
    }

    @Override
    public String getBreakSound() {
        return "mob.blaze.breathe";
    }

    @Override
    public String getStepSound() {
        return "mob.blaze.breathe";
    }

    @Override
    public String getPlaceSound() {
        return "mob.blaze.breathe";
    }
}
