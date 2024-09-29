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
public class PersonInfo {
	private String personId;
	private String firstName;
	private String middleName;
	private String lastName;
	private Address address;
	private Contact contact;

	public String getPersonId() {
		return personId;
	}

	public void setPersonId(String personId) {
		this.personId = personId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Contact getContact() {
		return contact;
	}

	public void setContact(Contact contact) {
		this.contact = contact;
	}

	public PersonInfo(String personId, String firstName, String middleName, String lastName, Address address,
			Contact contact) {
		super();
		this.personId = personId;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.address = address;
		this.contact = contact;
	}

	public PersonInfo(String firstName, String middleName, String lastName, Address address, Contact contact) {
		super();
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.address = address;
		this.contact = contact;
	}

	@Override
	public String toString() {
		return "PersonInfo [personId=" + personId + ", firstName=" + firstName + ", middleName=" + middleName
				+ ", lastName=" + lastName + ", address=" + address + ", contact=" + contact + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(address, contact, firstName, lastName, middleName, personId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PersonInfo other = (PersonInfo) obj;
		return Objects.equals(address, other.address) && Objects.equals(contact, other.contact)
				&& Objects.equals(firstName, other.firstName) && Objects.equals(lastName, other.lastName)
				&& Objects.equals(middleName, other.middleName) && Objects.equals(personId, other.personId);
	}

}
