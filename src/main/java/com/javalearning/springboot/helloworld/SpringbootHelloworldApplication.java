package com.javalearning.springboot.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
//@ComponentScan(basePackages = "{com.javalearning.springboot.helloworld.service}")
public class SpringbootHelloworldApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {

		ConfigurableApplicationContext applicationContext = SpringApplication.run(SpringbootHelloworldApplication.class,
				args);
		String[] beanNames = applicationContext.getBeanDefinitionNames();

		// foreach is enhanced for loop
		// for(int i=0;i<5;i++) { // initialization condition, increment or decrement
			// System.out.println(i);  // 1 2 3 4 5
		 //}
		 
		 for(String beanName  : beanNames) {
			// System.out.println(beanName);
		 }
	}

}
