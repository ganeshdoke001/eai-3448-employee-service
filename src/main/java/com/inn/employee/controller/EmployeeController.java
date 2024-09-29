package com.inn.employee.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.inn.employee.dto.EmployeeRequest;
import com.inn.employee.dto.EmployeeResponse;
import com.inn.employee.proccessor.EmployeeProcessor;
import com.inn.employee.utilities.EmployeeUtils;

@RestController
@RequestMapping(path = "/employee/v1")
public class EmployeeController {

	private final EmployeeProcessor processor;

	public EmployeeController(final EmployeeProcessor processor) {
		this.processor = processor;
	}

	@PostMapping("/")
	public ResponseEntity<?> saveEmployee(@RequestBody EmployeeRequest employeeRequest) {
		String message = processor.save(employeeRequest);
		return EmployeeUtils.getSuccessResponseEntity(message);

	}

	@PutMapping("/{empId}")
	public ResponseEntity<?> updateEmployee(@RequestBody EmployeeRequest employeeRequest,
			@PathVariable("empId") String empId) {
		EmployeeResponse employeeResponse = processor.update(employeeRequest, empId);
		return EmployeeUtils.getSuccessResponseEntity(employeeResponse);

	}

	@GetMapping("/{empId}")
	public ResponseEntity<?> getEmployeeDetails(@PathVariable("empId") String empId) {
		EmployeeResponse employeeResponse = processor.getEmpDetails(empId);
		return EmployeeUtils.getSuccessResponseEntity(employeeResponse);

	}

	public ResponseEntity<?> deleteEmployee() {
		return null;

	}

	public ResponseEntity<?> getByNameEmployee() {
		return null;

	}
}
