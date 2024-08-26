package com.javalearning.springboot.helloworld.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.javalearning.springboot.helloworld.service.Pizza;

@Component
public class PizzaController {
	
	@Autowired
	@Qualifier("vegPizza")
	private Pizza pizza;
	
	// constructor injection
	/*
	@Autowired
	public PizzaController(@Qualifier("vegPizza") Pizza pizza) {
		this.pizza = pizza;
	}
	
	*/
	
	public String getPizza() {
		return pizza.getPizza();
	}
	
	/*
	@Autowired
	@Qualifier("vegPizza")
	public void setPizza(Pizza pizza) {
		this.pizza = pizza;
	}
	
	*/

}
