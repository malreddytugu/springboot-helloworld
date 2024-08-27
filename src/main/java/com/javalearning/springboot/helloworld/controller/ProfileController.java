package com.javalearning.springboot.helloworld.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

@Component
public class ProfileController {

	@Autowired
	private Environment env;
	
	public void getActiveProfiles() {
		for(String profile : env.getActiveProfiles()) {
			System.out.println("Current Active Profiels : "+profile);
		}
	}
}
