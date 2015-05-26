/*
 * Fergoman123's Tools
 * Copyright (c) 2014 fergoman123.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Lesser Public License v2.1
 * which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/gpl-3.0.html
 */

package io.github.fergoman123.msb.init;

import net.minecraft.block.Block.SoundType;

public class Sounds
{
    public static class SoundTypeMSB extends SoundType
    {
        private String name;

        public SoundTypeMSB(String name, float volume, float frequency)
        {super(name, volume, frequency);}

        @Override public String getBreakSound(){return this.soundName;}
        @Override public String getStepSound(){return getBreakSound();}
        @Override public String getPlaceSound(){return getBreakSound();}
    }

    public static final SoundTypeMSB blaze = new SoundTypeMSB("mob.blaze.breathe", 1f,1f);
    public static final SoundTypeMSB cow = new SoundTypeMSB("mob.cow.say", 1f, 1f);
    public static final SoundTypeMSB enderman = new SoundTypeMSB("mob.enderman.idle", 1f, 1f);
    public static final SoundTypeMSB mutton = new SoundTypeMSB("mob.sheep.say", 1f, 1f);
    public static final SoundTypeMSB pig = new SoundTypeMSB("mob.pig.say", 1f, 1f);
    public static final SoundTypeMSB rabbit = new SoundTypeMSB("mob.rabbit.hop", 1f, 1f);
    public static final SoundTypeMSB skeleton = new SoundTypeMSB("mob.skeleton.say", 1f, 1f);
    public static final SoundTypeMSB wither = new SoundTypeMSB("mob.wither.idle", 0.0025f, 1f);
    public static final SoundTypeMSB zombie = new SoundTypeMSB("mob.zombie.say", 1f, 1f);
}
