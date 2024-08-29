package com.javalearning.springboot.helloworld.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.javalearning.springboot.helloworld.model.Employee;
import com.javalearning.springboot.helloworld.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;

	@GetMapping("/employee")
	public List<Employee> getAll() {
		return employeeService.getAll();
	}

	@GetMapping("/employee/{id}")
	// @ResponseBody
	public Employee getEmployeeById(@PathVariable long id) {
		System.out.println("patath param id value is : " + id);
		return employeeService.getEmployeeById(id);
	}

	@GetMapping("/employee/{id}/name/{name}")
	public String getEmployee( @PathVariable Map<String, String> empMap) {
		System.out.println(empMap);
		return "PathParamMap";
	}
	
	@GetMapping("/employee/id/name/")
	public String getEmployeeQueryMap(@RequestParam Map<String, String> queryMap) {
		System.out.println(queryMap);
		return "QueryParamMap";
	}
}
