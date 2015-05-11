package io.github.fergoman123.msb.common.sounds;

import net.minecraft.block.Block;

public class SoundTypeSkeleton extends Block.SoundType {
    public SoundTypeSkeleton(String skeleton) {
        super(skeleton, 1f, 1f);
    }

    @Override
    public String getBreakSound() {
        return "mob.skeleton.say";
    }

    @Override
    public String getStepSound() {
        return "mob.skeleton.say";
    }

    @Override
    public String getPlaceSound() {
        return "mob.skeleton.say";
    }
}
