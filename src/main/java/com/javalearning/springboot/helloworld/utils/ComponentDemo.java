package com.javalearning.springboot.helloworld.utils;

import org.springframework.stereotype.Component;

@Component
public class ComponentDemo {
	
	public ComponentDemo() {
		System.out.println("ComponentDemo instantiated");
	}
	
	public String getMessage() {
		return "Hello Message";
	}

}
