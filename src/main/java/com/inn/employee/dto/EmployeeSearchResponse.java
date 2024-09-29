package com.inn.employee.dto;

import java.util.List;

import lombok.Data;

@Data
public class EmployeeSearchResponse {

	private List<EmployeeInfo> employeeInfo;

	public List<EmployeeInfo> getemployeeInfo() {
		return employeeInfo;
	}

	public void setemployeeInfo(List<EmployeeInfo> employeeInfo) {
		this.employeeInfo = employeeInfo;
	}

	public EmployeeSearchResponse employeeInfo(List<EmployeeInfo> employeeInfo) {
		this.employeeInfo = employeeInfo;
		return this;
	}

	public EmployeeSearchResponse(List<EmployeeInfo> employeeInfo) {
		super();
		this.employeeInfo = employeeInfo;
	}

}
