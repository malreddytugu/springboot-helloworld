package com.javalearning.springboot.helloworld.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.javalearning.springboot.helloworld.model.Employee;

@Service
public interface EmployeeService {

	List<Employee> getAll();
	Optional<Employee> getEmployeeById(long id);
	void deleteEmployeeById(long id);
}
