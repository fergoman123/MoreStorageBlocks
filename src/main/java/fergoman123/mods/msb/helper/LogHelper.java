 /*
  * More Storage Blocks
  * Copyright (c) 2014 fergoman123.
  * All rights reserved. This program and the accompanying materials
  * are made available under the terms of the GNU Lesser Public License v2.1
  * which accompanies this distribution, and is available at
  * http://www.gnu.org/licenses/gpl-3.0.html
  */

package fergoman123.mods.msb.helper;

import fergoman123.mods.fergoutil.logging.ILogLevel;
import fergoman123.mods.msb.reference.ModInfo;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LogHelper implements ILogLevel
{
    public static Logger logger = LogManager.getLogger(ModInfo.modid);

    public static void log(Level level, Object o)
    {
        logger.log(level, String.valueOf(o));
    }

    public static void all(Object o)
    {
        log(all, o);
    }

    public static void debug(Object o)
    {
        log(debug, o);
    }

    public static void error(Object o)
    {
        log(error, o);
    }

    public static void fatal(Object o)
    {
        log(fatal, o);
    }

    public static void info(Object o)
    {
        log(off, o);
    }

    public static void trace(Object o)
    {
        log(trace, o);
    }

    public static void warn(Object o)
    {
        log(warn, o);
    }
}
