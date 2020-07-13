package com.techprudent.springbootcaching.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techprudent.springbootcaching.entity.Customer;
import com.techprudent.springbootcaching.service.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {

	private CustomerService cs;

	@Autowired
	public CustomerController(CustomerService cs) {
		super();
		this.cs = cs;
	}
	
	@GetMapping("/id/{id}")
	public Customer getCustomer(@PathVariable(required=true) long id) {

		return cs.getCustomer(id);
	}
	
	@GetMapping("/name/{name}")
	public Customer getCustomerByName(@PathVariable(required=true) String name) {

		return cs.getCustomerByName(name);
	}
	@PostMapping("/create")
	public Customer createCustomer(@RequestBody Customer customer) {
		
		Customer createCustomer = cs.createCustomer(customer);
		
		return createCustomer;
		
	}
	
	@PutMapping("/update")
	public Customer updateCustomer(@RequestBody Customer customerUpdate) {
		
		Customer customerUpdated =	cs.updateCustomer(customerUpdate);
		
		return customerUpdated;
	}
	
	@DeleteMapping("/{id}")
	public void deleteCustomer(@PathVariable long id) {
		
		cs.deleteCustomer(id);
	}
	
}
