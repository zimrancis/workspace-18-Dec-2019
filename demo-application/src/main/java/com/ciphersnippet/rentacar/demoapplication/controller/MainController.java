package com.ciphersnippet.rentacar.demoapplication.controller;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.ciphersnippet.rentacar.demoapplication.model.Student;
import com.ciphersnippet.rentacar.demoapplication.model.StudentNotFoundException;
import com.ciphersnippet.rentacar.demoapplication.service.StudentService;

@RestController
@RequestMapping(value = "/student")
public class MainController {

	@Autowired
	private StudentService studentService;

	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String greetingGet() {
		return "Hello SpringBoot GET";
	}

	@RequestMapping(value = "/hello", method = RequestMethod.POST)
	public String greetingPost() {
		return "Hello SpringBoot POST";
	}

	@GetMapping
	public List<Student> retrieveAllStudents() {
		return studentService.findAll();
	}

	@GetMapping("/{id}")
	public Student retrieveStudent(@PathVariable long id) {
		Optional<Student> student = studentService.findById(id);

		if (!student.isPresent())
			throw new StudentNotFoundException("id-" + id);

		return student.get();
	}

	@DeleteMapping("/{id}")
	public void deleteStudent(@PathVariable long id) {
		studentService.deleteById(id);
	}

	@PostMapping
	public ResponseEntity<Object> createStudent(@RequestBody Student student) {
		Student savedStudent = studentService.save(student);

		URI location = ServletUriComponentsBuilder.fromCurrentRequest()
				.buildAndExpand(savedStudent.getId()).toUri();

		return ResponseEntity.created(location).build();

	}

	@PutMapping("/{id}")
	public ResponseEntity<Object> updateStudent(@RequestBody Student student, @PathVariable long id) {

		Optional<Student> studentOptional = studentService.findById(id);

		if (!studentOptional.isPresent())
			return ResponseEntity.notFound().build();

		student.setId(id);

		studentService.save(student);

		return ResponseEntity.noContent().build();
	}

	/*
	 * @PostMapping public Student save(@RequestBody Student student) { return
	 * studentService.save(student); }
	 * 
	 * @GetMapping public ResponseEntity<Student> fetchById(@RequestParam int id) {
	 * Student student = studentService.fetchStudentById(id); if (student == null) {
	 * return ResponseEntity.notFound().build(); } else { return
	 * ResponseEntity.ok().body(student); } }
	 */	

}