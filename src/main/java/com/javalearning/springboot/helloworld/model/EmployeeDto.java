package com.javalearning.springboot.helloworld.model;

import java.io.Serializable;

public class EmployeeDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long empId;
	private String name;
	private String emailId;
	private String deptName;
	private String location;

	public EmployeeDto() {
	}

	public EmployeeDto(Long empId, String name, String emailId, String deptName, String location) {
		super();
		this.empId = empId;
		this.name = name;
		this.emailId = emailId;
		this.deptName = deptName;
		this.location = location;
	}

	public Long getEmpId() {
		return empId;
	}

	public void setEmpId(Long empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "EmployeeDto [empId=" + empId + ", name=" + name + ", emailId=" + emailId + ", deptName=" + deptName
				+ ", location=" + location + "]";
	}
}
