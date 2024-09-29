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
public class Address {
	private Integer houseNo;
	private String line;
	private String street;
	private String City;
	public Integer getHouseNo() {
		return houseNo;
	}
	public void setHouseNo(Integer houseNo) {
		this.houseNo = houseNo;
	}
	public String getLine() {
		return line;
	}
	public void setLine(String line) {
		this.line = line;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public Address(Integer houseNo, String line, String street, String city) {
		super();
		this.houseNo = houseNo;
		this.line = line;
		this.street = street;
		City = city;
	}
	@Override
	public String toString() {
		return "Address [houseNo=" + houseNo + ", line=" + line + ", street=" + street + ", City=" + City + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(City, houseNo, line, street);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Address other = (Address) obj;
		return Objects.equals(City, other.City) && Objects.equals(houseNo, other.houseNo)
				&& Objects.equals(line, other.line) && Objects.equals(street, other.street);
	}
	
	

}
