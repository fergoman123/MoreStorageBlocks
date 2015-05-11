package io.github.fergoman123.msb.common.sounds;

import net.minecraft.block.Block;

public class SoundTypeWither extends Block.SoundType {
    public SoundTypeWither(String wither) {
        super(wither, 0.0025f, 1f);
    }

    @Override
    public String getPlaceSound() {
        return "mob.wither.idle";
    }

    @Override
    public String getStepSound() {
        return "mob.wither.idle";
    }

    @Override
    public String getBreakSound() {
        return "mob.wither.idle";
    }
}
