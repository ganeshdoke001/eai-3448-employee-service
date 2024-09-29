package com.inn.employee.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inn.employee.entity.Employee;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, String> {

}
