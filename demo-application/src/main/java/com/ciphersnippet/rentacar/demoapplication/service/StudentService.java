package com.ciphersnippet.rentacar.demoapplication.service;

import java.util.List;
import java.util.Optional;

import com.ciphersnippet.rentacar.demoapplication.model.Student;

public interface StudentService {


	public List<Student> findAll();
	public Optional<Student> findById(long id);	
	public void deleteById(long id);
	public Student save(Student student);

}
