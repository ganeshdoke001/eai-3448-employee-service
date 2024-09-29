package com.inn.employee.model;

import java.util.Objects;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Data
@Component
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@EqualsAndHashCode
public class Contact {

	private String mobileNo;
	private String areaCode;
	private String countryCode;
	private String email;
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getAreaCode() {
		return areaCode;
	}
	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}
	public String getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Contact(String mobileNo, String areaCode, String countryCode, String email) {
		super();
		this.mobileNo = mobileNo;
		this.areaCode = areaCode;
		this.countryCode = countryCode;
		this.email = email;
	}
	@Override
	public String toString() {
		return "Contact [mobileNo=" + mobileNo + ", areaCode=" + areaCode + ", countryCode=" + countryCode + ", email="
				+ email + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(areaCode, countryCode, email, mobileNo);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Contact other = (Contact) obj;
		return Objects.equals(areaCode, other.areaCode) && Objects.equals(countryCode, other.countryCode)
				&& Objects.equals(email, other.email) && Objects.equals(mobileNo, other.mobileNo);
	}
	
	
	
}
