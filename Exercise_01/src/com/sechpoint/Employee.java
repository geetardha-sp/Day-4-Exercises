package com.sechpoint;

public class Employee {
	int empId;
	@JsonIgnore(ignoreJson = "Ignore Json (Employee)")
	String name;
	
	public Employee(int empId, String name) {
		super();
		this.empId = empId;
		this.name = name;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	@JsonIgnore
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
