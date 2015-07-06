package io.github.fergoman123.msb.log;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import akka.actor.SupervisorStrategyLowPriorityImplicits;
import io.github.fergoman123.msb.info.ModInfo;
import tv.twitch.broadcast.StreamInfo;

public class LoggerMSB{
	private static Logger log = null;
	
	private static void configureLogging() {
		log = LogManager.getLogger(ModInfo.modid);
	}
	
	public static void log(Level level, String msg, Object... params) {
		if(log == null){configureLogging();}
		if (msg == null) {
			log.log(level, "Attempted to log null message.");
		} else {
			try {
				msg = String.format(msg, params);
			} catch (Exception e) {
				log.log(Level.ERROR, "Failed to format log message. Caused by: %s", params);
			}
			log.log(level, msg);
		}
	}
	
	public static void info(String msg, Object... params) {
		log(Level.INFO, msg, params);
	}
	
	public static void warn(String msg, Object... params){
		log(Level.WARN, msg, params);
	}
	
	public static void error(String msg, Object... params){
		log(Level.ERROR, msg, params);
	}
}
