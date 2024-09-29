package com.inn.employee.proccessor;

import org.springframework.stereotype.Component;

import com.inn.employee.dto.EmployeeInfo;
import com.inn.employee.dto.EmployeeRequest;
import com.inn.employee.dto.EmployeeResponse;
import com.inn.employee.service.EmployeeService;

import io.micrometer.common.lang.NonNull;

@Component
public class EmployeeProcessor {

	private final PersonInfoProccessor personInfoProccessor;
	private final PaySlipProcessor paySlipProcessor;
	private final ProfileProccessor profileProccessor;
	private final EmployeeService employeeService;

	public EmployeeProcessor(final PersonInfoProccessor personInfoProccessor, final PaySlipProcessor paySlipProcessor,
			final ProfileProccessor profileProccessor, final EmployeeService employeeService) {
		this.personInfoProccessor = personInfoProccessor;
		this.paySlipProcessor = paySlipProcessor;
		this.profileProccessor = profileProccessor;
		this.employeeService = employeeService;
	}

	public String save(@NonNull EmployeeRequest employeeRequest) {
		EmployeeInfo employeeInfo = employeeRequest.getEmployeeInfo();
		if (employeeInfo != null) {
			personInfoProccessor.savePersonInfo(employeeInfo.getPersonInfo());
			paySlipProcessor.savePaySlip(employeeInfo.getPaySlip());
			profileProccessor.saveProfile(employeeInfo.getImage());
			employeeService.saveEmployee(employeeInfo.getEmployee());
		}
		return null;
	}

	public EmployeeResponse update(@NonNull EmployeeRequest employeeRequest, String empId) {

		return null;
	}

	public EmployeeResponse getEmpDetails(String empId) {
		// TODO Auto-generated method stub
		return null;
	}

}
