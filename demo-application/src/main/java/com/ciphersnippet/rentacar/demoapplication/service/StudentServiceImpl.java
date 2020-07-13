package com.ciphersnippet.rentacar.demoapplication.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ciphersnippet.rentacar.demoapplication.model.Student;
import com.ciphersnippet.rentacar.demoapplication.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository studentRepository;

	/**
	 * With using Autowired Annotation we don't need to create instance for this
	 * StudentRepository class, because Dependency Injection is all about
	 * loosely-coupled so we don't require to implement the concrete implementation
	 * tight with student repository...
	 */

	/*
	 * @Override public Student save(Student student) { return
	 * studentRepository.save(student);
	 * 
	 * }
	 */

	/*
	 * @Override public Student fetchStudentById(long id) { Optional<Student>
	 * studentId = studentRepository.findById(id); if (studentId.isPresent()) {
	 * return studentId.get(); } return null; }
	 */

	
	@Override
	public List<Student> findAll() {
		
		return studentRepository.findAll();
	}

	@Override
	public Optional<Student> findById(long id) {
		
		return studentRepository.findById(id);
	}

	@Override
	public void deleteById(long id) {

		studentRepository.deleteById(id);
	}

	@Override
	public Student save(Student student) {
		
		return studentRepository.save(student);
	}

}
