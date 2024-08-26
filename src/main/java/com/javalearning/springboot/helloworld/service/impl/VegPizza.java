package com.javalearning.springboot.helloworld.service.impl;

import org.springframework.stereotype.Component;

import com.javalearning.springboot.helloworld.service.Pizza;

@Component
public class VegPizza implements Pizza{

	@Override
	public String getPizza() {
		return "Veg Pizza";
	}

}
