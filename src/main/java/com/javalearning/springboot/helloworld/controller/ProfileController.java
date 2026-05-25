package com.javalearning.springboot.helloworld.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class ProfileController {

	private static final Logger logger = LoggerFactory.getLogger(ProfileController.class);

	@Autowired
	private Environment env;

	public void getActiveProfiles() {
		for (String profile : env.getActiveProfiles()) {
			logger.info("Current Active Profile : {}", profile);
		}
	}
}
