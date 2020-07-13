package com.ciphersnippet.findbyidandname.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.ciphersnippet.findbyidandname.model.Employee;
import com.ciphersnippet.findbyidandname.repository.EmployeeRepository;

public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;
	
	@Override
	public List<Employee> findAll() {
		
		return employeeRepository.findAll();
	}

	@Override
	public Optional<Employee> findById(long id) {
		
		return employeeRepository.findById(id);
	}

	@Override
	public void deleteById(long id) {

		employeeRepository.deleteById(id);
	}

	@Override
	public Employee save(Employee employee) {
		
		return employeeRepository.save(employee);
	}
}
