package com.javalearning.springboot.helloworld.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.javalearning.springboot.helloworld.model.Employee;
import com.javalearning.springboot.helloworld.model.EmployeeDto;
import com.javalearning.springboot.helloworld.service.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;

	// /api/v1/employee
	@GetMapping("v1/employee")
	public List<Employee> getAll() {
		return employeeService.getAll();
	}
	
	@GetMapping("v2/employee")
	public List<Employee> getAllV2() {
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
	
	@RequestMapping(value = "/v1/hello", method=RequestMethod.GET)
	@ResponseBody
	public Employee hello() {
		return new Employee(101l, "Malreddy","mal@gmail.com", "IT","Bangalore");
	}
	
	@PostMapping("/v1/employee/save")
	public Employee saveEmp(@RequestBody Employee employee) {
		System.out.println(employee);
		return employee;
	}
	
	@PutMapping("/v1/employee/update")
	public EmployeeDto updateEmployee(@RequestBody EmployeeDto empDto) {
		System.out.println("empDto : "+empDto);
		Employee emp = employeeService.getEmployeeById(empDto.getEmpId());
		empDto = new EmployeeDto(empDto.getEmpId(), empDto.getName(),empDto.getEmailId(),empDto.getDeptName(),empDto.getLocation());
		
		return empDto;
	}
	
	@DeleteMapping("/employee/{id}")
	public void deleteEmployeeById(@PathVariable long id) {
		System.out.println("patath param id value is : " + id);
		employeeService.deleteEmployeeById(id);
	}
}
