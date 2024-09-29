package com.inn.employee.dto;

import lombok.Data;

@Data
public class EmployeeRequest {

	private EmployeeInfo employeeInfo;

	public EmployeeInfo getEmployeeInfo() {
		return employeeInfo;
	}

	public void setEmployeeInfo(EmployeeInfo employeeInfo) {
		this.employeeInfo = employeeInfo;
	}

	public EmployeeRequest(EmployeeInfo employeeInfo) {
		super();
		this.employeeInfo = employeeInfo;
	}

	public EmployeeRequest() {
		super();
	}

}
