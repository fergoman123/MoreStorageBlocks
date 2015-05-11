package io.github.fergoman123.msb.common.sounds;

import net.minecraft.block.Block;

public class SoundTypeCow extends Block.SoundType {
    public SoundTypeCow(String cow) {
        super(cow, 1f, 1f);
    }

    @Override
    public String getPlaceSound() {
        return "mob.cow.say";
    }

    @Override
    public String getStepSound() {
        return "mob.cow.say";
    }

    @Override
    public String getBreakSound() {
        return "mob.cow.say";
    }
}
