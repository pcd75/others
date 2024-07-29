package com.adi.demo.log4j.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.adi.demo.log4j.controller.HomeController;

public class HomeService {

	private Logger logger = LoggerFactory.getLogger(HomeController.class);

	public String welcome() {

		logger.info("from info method");
		logger.error("from error method");
		logger.trace("from trace method");
		logger.debug("from debug method");
		logger.warn("from warn method");

		return "Welcome to Logger demo";
	}

	public String welcome44() {

		logger.info("from info method");
		logger.error("from error method");
		logger.trace("from trace method");
		logger.debug("from debug method");
		logger.warn("from warn method");

		return "Welcome to Logger demo";
	}

	public String welcome65() {

		logger.info("from info method");
		logger.error("from error method");
		logger.trace("from trace method");
		logger.debug("from debug method");
		logger.warn("from warn method");

		return "Welcome to Logger demo";
	}

	public String welcome23() {

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
