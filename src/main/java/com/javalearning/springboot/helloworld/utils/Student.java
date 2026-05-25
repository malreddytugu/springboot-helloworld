package com.javalearning.springboot.helloworld.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Student {

	private static final Logger logger = LoggerFactory.getLogger(Student.class);

	private Address address;

	public Student(Address address) {
		this.address = address;
	}

	public void print() {
		logger.info("Student class print method is called");
		address.print();
	}

	public void init() {
		logger.info("Intialization logic");
	}

	public void destroy() {
		logger.info("Destruction logic");
	}
}
