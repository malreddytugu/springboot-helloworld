package com.javalearning.springboot.helloworld.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.javalearning.springboot.helloworld.model.Employee;
import com.javalearning.springboot.helloworld.service.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService {

	private static final Logger logger = LoggerFactory.getLogger(EmployeeServiceImpl.class);

	List<Employee> empList = null;

	public EmployeeServiceImpl() {
		logger.info("EmployeeServiceImpl object created");
		empList = new ArrayList<Employee>();
	}

	@Override
	public List<Employee> getAll() {
		empList.add(new Employee(101l, "Malreddy", "malreddy.tugu@gmail.com", "IT", "Bangalore"));
		empList.add(new Employee(102l, "Vasu", "vasu@gmail.com", "ADMIN", "USA"));
		empList.add(new Employee(103l, "Anusha", "anu@gmail.com", "Java Developer", "Hydearabad"));
		empList.add(new Employee(104l, "Hari", "hari@gmail.com", "Fullstack Java Developer", "Chennai"));
		empList.add(new Employee(105l, "Naseera", "snaseera@gmail.com", "Home Maker", "USA"));
		empList.add(new Employee(106l, "Keerthi", "keerthikumar@gmail.com", "Java Trainer", "India"));
		logger.info("Employee list size: {}", empList.size());
		return empList;
	}

	@Override
	public Optional<Employee> getEmployeeById(long id) {
		List<Employee> empList = getAll();
		Optional<Employee> emp = empList.stream().filter(e -> e.getEmpId() == id).findFirst();
		return emp;
	}

	@Override
	public void deleteEmployeeById(long id) {
		empList.removeIf(e -> e.getEmpId() == id);
		logger.info("Employee with {} deleted", id);
	}

}
