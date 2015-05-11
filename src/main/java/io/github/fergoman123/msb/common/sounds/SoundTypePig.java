package io.github.fergoman123.msb.common.sounds;

import net.minecraft.block.Block;

public class SoundTypePig extends Block.SoundType {
    public SoundTypePig(String pig) {
        super(pig, 1f, 1f);
    }

    @Override
    public String getBreakSound() {
        return "mob.pig.say";
    }

    @Override
    public String getStepSound() {
        return "mob.pig.say";
    }

    @Override
    public String getPlaceSound() {
        return "mob.pig.say";
    }
}
