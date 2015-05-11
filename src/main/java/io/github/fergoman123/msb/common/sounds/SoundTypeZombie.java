package io.github.fergoman123.msb.common.sounds;

import net.minecraft.block.Block;

public class SoundTypeZombie extends Block.SoundType {
    public SoundTypeZombie(String zombie) {
        super(zombie, 1f, 1f);
    }

    @Override
    public String getBreakSound() {
        return "mob.zombie.say";
    }

    @Override
    public String getStepSound() {
        return "mob.zombie.say";
    }

    @Override
    public String getPlaceSound() {
        return "mob.zombie.say";
    }
}
