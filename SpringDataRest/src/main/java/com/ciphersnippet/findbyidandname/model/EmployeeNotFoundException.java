package com.ciphersnippet.findbyidandname.model;

public class EmployeeNotFoundException extends RuntimeException {
	private static final long serialVersionUID = -343613596736528862L;

	public EmployeeNotFoundException(String exception) {
		super(exception);
	}

}