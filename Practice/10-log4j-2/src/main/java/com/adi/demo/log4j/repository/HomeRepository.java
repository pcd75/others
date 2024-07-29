package com.adi.demo.log4j.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.adi.demo.log4j.controller.HomeController;

public class HomeRepository {

	private Logger logger = LoggerFactory.getLogger(HomeController.class);

	public String welcome() {

		logger.info("from info method");
		logger.error("from error method");
		logger.trace("from trace method");
		logger.debug("from debug method");
		logger.warn("from warn method");

		return "Welcome to Logger demo";
	}

	public String welcome2() {

		logger.info("from info method");
		logger.error("from error method");
		logger.trace("from trace method");
		logger.debug("from debug method");
		logger.warn("from warn method");

		return "Welcome to Logger demo";
	}

	public String welcome3() {

		logger.info("from info method");
		logger.error("from error method");
		logger.trace("from trace method");
		logger.debug("from debug method");
		logger.warn("from warn method");

		return "Welcome to Logger demo";
	}

	public String welcome4() {

		logger.info("from info method");
		logger.error("from error method");
		logger.trace("from trace method");
		logger.debug("from debug method");
		logger.warn("from warn method");

		return "Welcome to Logger demo";
	}

	public String welcome5() {

		logger.info("from info method");
		logger.error("from error method");
		logger.trace("from trace method");
		logger.debug("from debug method");
		logger.warn("from warn method");

		return "Welcome to Logger demo";
	}

}
