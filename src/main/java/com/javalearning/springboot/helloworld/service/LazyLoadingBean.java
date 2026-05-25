package com.javalearning.springboot.helloworld.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class LazyLoadingBean {

	private static final Logger logger = LoggerFactory.getLogger(LazyLoadingBean.class);

	public LazyLoadingBean() {
		logger.info("LazyLoadingBean object created..");
	}

}
