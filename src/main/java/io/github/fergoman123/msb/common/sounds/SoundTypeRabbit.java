package io.github.fergoman123.msb.common.sounds;

import net.minecraft.block.Block;

public class SoundTypeRabbit extends Block.SoundType {
    public SoundTypeRabbit(String name) {
        super(name, 1f, 1f);
    }

    @Override
    public String getBreakSound() {
        return "mob.rabbit.hop";
    }

    @Override
    public String getPlaceSound() {
        return "mob.rabbit.hop";
    }

    @Override
    public String getStepSound() {
        return "mob.rabbit.hop";
    }
}
