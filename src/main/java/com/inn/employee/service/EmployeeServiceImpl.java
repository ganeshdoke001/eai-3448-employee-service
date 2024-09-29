package com.inn.employee.service;

import org.springframework.stereotype.Service;

import com.inn.employee.entity.Employee;
import com.inn.employee.repo.EmployeeRepo;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	private final EmployeeRepo repo;

	public EmployeeServiceImpl(final EmployeeRepo repo) {
		this.repo = repo;
	}

	@Override
	public void saveEmployee(Employee employee) {

	}

}
