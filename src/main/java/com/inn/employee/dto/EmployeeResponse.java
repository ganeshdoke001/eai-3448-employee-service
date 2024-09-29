package com.inn.employee.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
@ToString
@EqualsAndHashCode
public class EmployeeResponse {

	private EmployeeInfo employeeInfo;

	public EmployeeInfo getEmployeeInfo() {
		return employeeInfo;
	}

	public void setEmployeeInfo(EmployeeInfo employeeInfo) {
		this.employeeInfo = employeeInfo;
	}

	public EmployeeResponse(EmployeeInfo employeeInfo) {
		super();
		this.employeeInfo = employeeInfo;
	}

	public EmployeeResponse() {
		super();
	}

}
