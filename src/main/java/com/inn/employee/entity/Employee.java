package com.inn.employee.entity;

import java.time.LocalDate;

import org.springframework.stereotype.Component;

import com.inn.employee.dto.Company;

import io.micrometer.common.lang.NonNull;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "Employee_Info")
@Data
@Component
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@EqualsAndHashCode
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	@Column(unique = true, name = "Employee_Id")
	private String empId;

	@Column(unique = true, name = "Employee_Number", nullable = false)
	private String empNo;

	@Column(unique = true, name = "Employee_Name", nullable = false)
	private String empName;

	@Column(name = "Employee_Sal", nullable = false)
	private Double empSal;

	@Column(name = "Employee_Joining_Date", nullable = false, unique = true)
	private LocalDate joinDate;

	@NonNull
	@Column(name = "Company_Name")
	private Company company;

	@NonNull
	@Column(name = "Designation", nullable = false, unique = true)
	private String designation;

	@NonNull
	@Column(name = "Project_Name", nullable = false, unique = true)
	private String projectName;

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getEmpNo() {
		return empNo;
	}

	public void setEmpNo(String empNo) {
		this.empNo = empNo;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Double getEmpSal() {
		return empSal;
	}

	public void setEmpSal(Double empSal) {
		this.empSal = empSal;
	}

	public LocalDate getJoinDate() {
		return joinDate;
	}

	public void setJoinDate(LocalDate joinDate) {
		this.joinDate = joinDate;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public Employee(String empId, String empNo, String empName, Double empSal, LocalDate joinDate, Company company,
			String designation, String projectName) {
		super();
		this.empId = empId;
		this.empNo = empNo;
		this.empName = empName;
		this.empSal = empSal;
		this.joinDate = joinDate;
		this.company = company;
		this.designation = designation;
		this.projectName = projectName;
	}

	public Employee(String empNo, String empName, Double empSal, LocalDate joinDate, Company company,
			String designation, String projectName) {
		super();
		this.empNo = empNo;
		this.empName = empName;
		this.empSal = empSal;
		this.joinDate = joinDate;
		this.company = company;
		this.designation = designation;
		this.projectName = projectName;
	}

}