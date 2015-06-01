package io.github.fergoman123.msb.log;

import io.github.fergoman123.fergoutil.log.LoggerFergo;
import io.github.fergoman123.msb.info.ModInfo;

public class LoggerMSB extends LoggerFergo
{
    public LoggerMSB() {
        super(ModInfo.modid);
    }
}
