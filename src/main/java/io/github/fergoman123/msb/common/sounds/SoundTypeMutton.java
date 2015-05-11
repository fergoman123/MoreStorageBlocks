package io.github.fergoman123.msb.common.sounds;

import io.github.fergoman123.msb.api.BlockMSB;

public class SoundTypeMutton extends BlockMSB.SoundType
{
    public SoundTypeMutton(String name) {
        super(name, 1f, 1f);
    }

    @Override
    public String getBreakSound() {
        return "mob.sheep.say";
    }

    @Override
    public String getPlaceSound() {
        return "mob.sheep.say";
    }

    @Override
    public String getStepSound() {
        return "mob.sheep.say";
    }
}
