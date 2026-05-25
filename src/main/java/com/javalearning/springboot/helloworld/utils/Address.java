package com.javalearning.springboot.helloworld.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Address {

	private static final Logger logger = LoggerFactory.getLogger(Address.class);

	public void print() {
		logger.info("Address class print method is called");
	}
}