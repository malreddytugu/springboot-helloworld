package com.javalearning.springboot.helloworld.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class EagerLoadingBean {

	private static final Logger logger = LoggerFactory.getLogger(EagerLoadingBean.class);

	public EagerLoadingBean() {
		logger.info("EagerLoadingBean object created...");
	}
}
