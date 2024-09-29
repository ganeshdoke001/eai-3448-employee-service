package com.inn.employee.model;

import java.util.Arrays;
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
public class Image {

	private String id;
	private Byte[] profile;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Byte[] getProfile() {
		return profile;
	}

	public void setProfile(Byte[] profile) {
		this.profile = profile;
	}

	public Image(String id, Byte[] profile) {
		super();
		this.id = id;
		this.profile = profile;
	}

	@Override
	public String toString() {
		return "Image [id=" + id + ", profile=" + Arrays.toString(profile) + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(profile);
		result = prime * result + Objects.hash(id);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Image other = (Image) obj;
		return Objects.equals(id, other.id) && Arrays.equals(profile, other.profile);
	}

}
