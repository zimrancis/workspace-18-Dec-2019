package com.ciphersnippet.findbyidandname.service;

import java.util.List;
import java.util.Optional;

import com.ciphersnippet.findbyidandname.model.Employee;

public interface EmployeeService {

	public List<Employee> findAll();
	public Optional<Employee> findById(long id);	
	public void deleteById(long id);
	public Employee save(Employee student);

}