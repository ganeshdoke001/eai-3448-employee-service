package com.inn.employee.utilities;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class EmployeeUtils {

	private EmployeeUtils() {}
	
	
	 public static <T> ResponseEntity<T> getResponseEntity(HttpStatus httpStatus, T body, String message) {
	        Map<String, Object> responseBody = new HashMap<>();
	        responseBody.put("status", httpStatus.value());
	        responseBody.put("message", message);
	        responseBody.put("data", body);

	        return (ResponseEntity<T>) new ResponseEntity<Object>(responseBody, httpStatus);
	    }

	    public static <T> ResponseEntity<T> getSuccessResponseEntity(T body) {
	        return getResponseEntity(HttpStatus.OK, body, "Success");
	    }

	    public static ResponseEntity<Map<String, Object>> getErrorResponseEntity(HttpStatus httpStatus, String message) {
	        return getResponseEntity(httpStatus, null, message);
	    }
}
