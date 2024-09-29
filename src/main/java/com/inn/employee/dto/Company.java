package com.inn.employee.dto;

public enum Company {

	FEDEX(01, "FedEX"), GOOGLE(02, "Google"), MICROSOFT(03, "MicroSoft"), ACCENTURE(04, "Accenture"), SBI(05, "SBI"),
	IB(06, "IB"), TCS(07, "TCS");

	private final int code;
	private final String name;

	Company(int code, String name) {
		this.code = code;
		this.name = name;
	}

	public int getCode() {
		return code;
	}

	public String getName() {
		return name;
	}

}
