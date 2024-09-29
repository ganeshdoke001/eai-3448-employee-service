package com.inn.employee.errors;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Component
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Data
@Builder
public class Error<T> {

	private Integer statusCode;
	private String errorMessage;
	private T body;

	public Integer getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(Integer statusCode) {
		this.statusCode = statusCode;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public T getBody() {
		return body;
	}

	public void setBody(T body) {
		this.body = body;
	}

	public Error(Integer statusCode, String errorMessage, T body) {
		super();
		this.statusCode = statusCode;
		this.errorMessage = errorMessage;
		this.body = body;
	}

	public Error(Integer statusCode, String errorMessage) {
		super();
		this.statusCode = statusCode;
		this.errorMessage = errorMessage;
	}

	public Error(T body) {
		super();
		this.body = body;
	}

	public Error<T> Suceesess(T Body) {
		this.body = body;
		return this;
	}
}
