package com.javalearning.springboot.helloworld.service;

import org.springframework.stereotype.Component;

@Component
public class EagerLoadingBean {

	public EagerLoadingBean() {
		System.out.println("EagerLoadingBean object created...");
	}
}
