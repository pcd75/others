package com.adi.demo.log4jbasic;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class LoggerDemoGenerator {
	
	
	// created the object of logger
	private static Logger logger = LogManager.getLogger(LoggerDemoGenerator.class);
	
	public static void main(String[] args) {
		
		logger.debug("from debug method");
		logger.trace("from trace method");
		logger.info("from info method");
		logger.warn("from warn method");
		logger.error("from error method");
		logger.fatal("from fatal method");
		
	}

}
