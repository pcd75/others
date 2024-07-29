package com.adi.demo.log4j;

import java.io.IOException;

import org.apache.log4j.Appender;
import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.FileAppender;
import org.apache.log4j.HTMLLayout;
import org.apache.log4j.Layout;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
import org.apache.log4j.SimpleLayout;
import org.apache.log4j.xml.XMLLayout;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
	
	// create object of logger
	
	private static Logger logger = Logger.getLogger(Application.class);

	public static void main(String[] args) throws IOException {
		SpringApplication.run(Application.class, args);
		
		// creating object for layout
//		Layout layout = new SimpleLayout();
//		Layout layout = new HTMLLayout();
//		Layout layout = new XMLLayout();
		Layout layout = new PatternLayout("%p %d %C %M %n");
		
		// created object for appender
//		Appender appender = new ConsoleAppender(layout);
		
		Appender appender = new FileAppender(layout, "D:\\ADI\\STS\\Practice\\09-log4j\\demo.log");
		
		logger.addAppender(appender);
		
		logger.debug("from debug method");
		logger.trace("from trace method");
		logger.info("from info method");
		logger.warn("from warn method");
		logger.error("from error method");
		logger.fatal("from fatal method");
	}

}
