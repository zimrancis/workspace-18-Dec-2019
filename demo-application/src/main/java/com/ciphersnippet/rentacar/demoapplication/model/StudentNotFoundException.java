package com.ciphersnippet.rentacar.demoapplication.model;

public class StudentNotFoundException extends RuntimeException {
	private static final long serialVersionUID = -343613596736528862L;

	public StudentNotFoundException(String exception) {
		super(exception);
	}

}