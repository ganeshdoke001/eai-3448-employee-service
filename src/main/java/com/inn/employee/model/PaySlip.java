package com.inn.employee.model;

import java.util.Objects;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
@EqualsAndHashCode
public class PaySlip {
	private String id;
	private String empNo;
	private String empName;
	private String paySlipLink;

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

	public String getPaySlipLink() {
		return paySlipLink;
	}

	public void setPaySlipLink(String paySlipLink) {
		this.paySlipLink = paySlipLink;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public PaySlip(String empNo, String empName, String paySlipLink) {
		super();
		this.empNo = empNo;
		this.empName = empName;
		this.paySlipLink = paySlipLink;
	}

	public PaySlip(String id, String empNo, String empName, String paySlipLink) {
		super();
		this.id = id;
		this.empNo = empNo;
		this.empName = empName;
		this.paySlipLink = paySlipLink;
	}

	@Override
	public String toString() {
		return "PaySlip [id=" + id + ", empNo=" + empNo + ", empName=" + empName + ", paySlipLink=" + paySlipLink + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(empName, empNo, id, paySlipLink);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PaySlip other = (PaySlip) obj;
		return Objects.equals(empName, other.empName) && Objects.equals(empNo, other.empNo)
				&& Objects.equals(id, other.id) && Objects.equals(paySlipLink, other.paySlipLink);
	}

}
