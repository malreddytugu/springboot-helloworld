package com.javalearning.springboot.helloworld.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.javalearning.springboot.helloworld.model.Employee;
import com.javalearning.springboot.helloworld.service.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService{

	@Override
	public List<Employee> getAll() {
			List<Employee> empList = new ArrayList<Employee>();
			empList.add(new Employee(101l, "Malreddy", "malreddy.tugu@gmail.com", "IT", "Bangalore"));
			empList.add(new Employee(102l, "Vasu", "vasu@gmail.com", "ADMIN", "USA"));
			System.out.println(empList.size());
		return empList;
	}

}
