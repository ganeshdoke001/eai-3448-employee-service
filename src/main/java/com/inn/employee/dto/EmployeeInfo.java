package com.inn.employee.dto;

import com.inn.employee.entity.Employee;
import com.inn.employee.model.Image;
import com.inn.employee.model.PaySlip;
import com.inn.employee.model.PersonInfo;

import lombok.Data;

@Data
public class EmployeeInfo {
	private Employee employee;
	private PersonInfo personInfo;
	private Image image;
	private PaySlip paySlip;

	public EmployeeInfo(Employee employee, PersonInfo personInfo, Image image, PaySlip paySlip) {
		super();
		this.employee = employee;
		this.personInfo = personInfo;
		this.image = image;
		this.paySlip = paySlip;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public PersonInfo getPersonInfo() {
		return personInfo;
	}

	public void setPersonInfo(PersonInfo personInfo) {
		this.personInfo = personInfo;
	}

	public Image getImage() {
		return image;
	}

	public void setImage(Image image) {
		this.image = image;
	}

	public PaySlip getPaySlip() {
		return paySlip;
	}

	public void setPaySlip(PaySlip paySlip) {
		this.paySlip = paySlip;
	}

	public EmployeeInfo employee(Employee employee) {
		this.employee = employee;
		return this;
	}

	public EmployeeInfo personInfo(PersonInfo personInfo) {
		this.personInfo = personInfo;
		return this;
	}

	public EmployeeInfo image(Image image) {
		this.image = image;
		return this;
	}

	public EmployeeInfo paySlip(PaySlip paySlip) {
		this.paySlip = paySlip;
		return this;
	}
}
