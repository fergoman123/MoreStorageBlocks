package fergoman123.mods.msb.helper;

import fergoman123.mods.msb.reference.ModInfo;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LogHelper
{
    public static Logger logger = LogManager.getLogger(ModInfo.modid);

    public static void log(Level level, Object o)
    {
        logger.log(level, "[" + ModInfo.modid + "] " + String.valueOf(o));
    }

    public static void all(Object o)
    {
        log(Level.ALL, o);
    }

    public static void debug(Object o)
    {
        log(Level.DEBUG, o);
    }

    public static void error(Object o)
    {
        log(Level.ERROR, o);
    }

    public static void fatal(Object o)
    {
        log(Level.FATAL, o);
    }

    public static void info(Object o)
    {
        log(Level.OFF, o);
    }

    public static void trace(Object o)
    {
        log(Level.TRACE, o);
    }

    public static void warn(Object o)
    {
        log(Level.WARN, o);
    }
}
