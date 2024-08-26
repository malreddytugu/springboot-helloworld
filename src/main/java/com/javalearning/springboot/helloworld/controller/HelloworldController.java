package com.javalearning.springboot.helloworld.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.javalearning.springboot.helloworld.utils.Beatiful;
import com.javalearning.springboot.helloworld.utils.RagiFlour;
import com.javalearning.springboot.helloworld.utils.Student;

@RestController
public class HelloworldController {
	
	Logger logger = LoggerFactory.getLogger(HelloworldController.class);
	
	@Autowired
	Beatiful beatiful;
	
	@Autowired
	Student student;
	
	@Autowired
	//@Qualifier("ragiPorridge")
	RagiFlour flour;
	
	@Autowired
	RagiFlour ragiPorridge;
	
	
	@GetMapping("/hello")
	public String hello(@RequestParam(required = false) String msg) {
		//System.out.println("hello method is called...");
		logger.debug("***************"+msg);
		logger.trace("TRACE");
		logger.debug("DEBUG");
		logger.info("INFO");
		logger.warn("WARN");
		logger.error("ERROR");
		
		//System.out.println(beatiful.getBeautiful());
		//student.print();
		
		System.out.println(flour.getRagiRecipe());
		System.out.println(ragiPorridge.getRagiRecipe());
		
		return "Welcome to Springboot Learning!"+msg;
	}
}
