package com.ciphersnippet.findbyidandname.controller;

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
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.ciphersnippet.findbyidandname.model.Employee;
import com.ciphersnippet.findbyidandname.model.EmployeeNotFoundException;
import com.ciphersnippet.findbyidandname.service.EmployeeService;

public class FindByIdandNameController {

	@RestController
	@RequestMapping(value = "/student")
	public class MainController {

		@Autowired
		private EmployeeService employeeService;

		@GetMapping
		public List<Employee> retrieveAllStudents() {
			return employeeService.findAll();
		}

		@GetMapping("/{id}")
		public Employee retrieveEmployee(@PathVariable long id) {
			Optional<Employee> employee = employeeService.findById(id);

			if (!employee.isPresent())
				throw new EmployeeNotFoundException("id-" + id);

			return employee.get();
		}

		@DeleteMapping("/{id}")
		public void deleteEmployee(@PathVariable long id) {
			employeeService.deleteById(id);
		}

		@PostMapping
		public ResponseEntity<Object> createEmployee(@RequestBody Employee employee) {
			Employee savedEmployee = employeeService.save(employee);

			URI location = ServletUriComponentsBuilder.fromCurrentRequest().buildAndExpand(savedEmployee.getId())
					.toUri();

			return ResponseEntity.created(location).build();

		}

		@PutMapping("/{id}")
		public ResponseEntity<Object> updateEmployee(@RequestBody Employee employee, @PathVariable long id) {

			Optional<Employee> employeeOptional = employeeService.findById(id);

			if (!employeeOptional.isPresent())
				return ResponseEntity.notFound().build();

			employee.setId(id);

			employeeService.save(employee);

			return ResponseEntity.noContent().build();
		}
	}
}