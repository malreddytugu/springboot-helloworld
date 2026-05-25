package com.javalearning.springboot.helloworld.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class ComponentDemo {

	private static final Logger logger = LoggerFactory.getLogger(ComponentDemo.class);

	public ComponentDemo() {
		logger.info("ComponentDemo instantiated");
	}

	public String getMessage() {
		return "Hello Message";
	}

}
